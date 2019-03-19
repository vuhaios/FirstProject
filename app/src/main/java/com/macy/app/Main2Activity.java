package com.macy.app;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.macy.app.adapter.CouponAdapter;
import com.macy.app.network.APIClient;
import com.macy.app.network.ApiService;
import com.macy.app.pojo.Coupon;
import com.macy.app.pojo.CouponList;
import com.macy.app.R;

import java.util.ArrayList;
import java.util.Iterator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main2Activity extends AppCompatActivity {

    TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Coupons");

        TabLayout tabLayout =  findViewById(R.id.tabs);
        tvTotal=findViewById(R.id.tvTotal);
        // get the reference of RecyclerView
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        // set a LinearLayoutManager with default orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager); // set LayoutManager to RecyclerView
        couponAdapter = new CouponAdapter(this,coupons);
        clippedCouponAdapter = new CouponAdapter(this,filteredCoupons);
        recyclerView.setAdapter(couponAdapter); // set the Adapter to RecyclerView
        apiService = APIClient.getClient().create(ApiService.class);
        Call<CouponList> couponCall = apiService.getCoupons("34lgBae%2FxIEnqksQpkn3w9F0JTKCafuiCr0ejLNLvBzlOlOZBa1CMA%3D%3D");
        couponCall.enqueue(new Callback<CouponList>() {
            @Override
            public void onResponse(Call<CouponList> call, Response<CouponList> response) {
                if(response.isSuccessful()){
                    coupons.clear();
                    coupons.addAll(response.body().getData());
                    filteredCoupons.clear();
                    filteredCoupons.addAll(filterList(coupons));
                    couponAdapter.notifyDataSetChanged();
                    tvTotal.setText(getString(R.string.total_coupons,coupons.size()+""));
                }
            }

            @Override
            public void onFailure(Call<CouponList> call, Throwable t) {

            }
        });
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getText().equals(getString(R.string.tab_text_2))){
                    recyclerView.setAdapter(clippedCouponAdapter);
                    tvTotal.setText(getString(R.string.total_coupons,filteredCoupons.size()+""));
                }else{
                    recyclerView.setAdapter(couponAdapter);
                    tvTotal.setText(getString(R.string.total_coupons,coupons.size()+""));
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    ApiService apiService;
    ArrayList<Coupon> coupons=new ArrayList<>();
    ArrayList<Coupon> filteredCoupons=new ArrayList<>();

    public ArrayList<Coupon> filterList(ArrayList<Coupon> coupons){
        ArrayList<Coupon> result = new ArrayList<>();
        Iterator<Coupon> couponIterator = coupons.iterator();
        while (couponIterator.hasNext()) {
            Coupon coupon = couponIterator.next();
            if (coupon.getIsClipped()) {
                result.add(coupon);
                couponIterator.remove();
            }
        }
        return result;
    }

    private CouponAdapter couponAdapter,clippedCouponAdapter;

    public void addToFilter(int i){
        filteredCoupons.add(coupons.get(i));
        coupons.remove(i);
        tvTotal.setText(getString(R.string.total_coupons,coupons.size()+""));
    }

    public void removeFilter(int i) {
        coupons.add(filteredCoupons.get(i));
        filteredCoupons.remove(i);
        tvTotal.setText(getString(R.string.total_coupons,filteredCoupons.size()+""));
    }

}
