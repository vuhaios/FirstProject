package com.macy.app.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.macy.app.Main2Activity;
import com.macy.app.pojo.Coupon;
import com.macy.app.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class CouponAdapter extends RecyclerView.Adapter {

    ArrayList<Coupon> coupons;
    Context mContext;
    Activity activity;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD'T'hh:mm:ss");
    SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/YYYY");

    public CouponAdapter(Activity activity, ArrayList<Coupon> couponArrayList) {
        coupons = couponArrayList;
        this.activity = activity;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        // infalte the item Layout
        View v = LayoutInflater.from(mContext).inflate(R.layout.rowlayout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        ((MyViewHolder) viewHolder).tvCouponDescription.setText(coupons.get(i).getDescription());
        ((MyViewHolder) viewHolder).tvCouponTitle.setText(coupons.get(i).getTitle());
        try {
            ((MyViewHolder) viewHolder).tvCouponExpiry.setText("Valid thru " + sdf1.format(simpleDateFormat.parse(coupons.get(i).getRedemptionEndDate())));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (coupons.get(i).getIsClipped()) {
            ((MyViewHolder) viewHolder).tvClip.setText("UNCLIP");
            ((MyViewHolder) viewHolder).tvClip.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    coupons.get(i).setIsClipped(false);
                    ((Main2Activity) activity).removeFilter(i);
                    notifyDataSetChanged();
                    Toast.makeText(mContext, "Coupon Unclipped, Find in Available Tab", Toast.LENGTH_SHORT).show();
                }
            });
        } else {
            ((MyViewHolder) viewHolder).tvClip.setText("CLIP");
            ((MyViewHolder) viewHolder).tvClip.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    coupons.get(i).setIsClipped(true);
                    ((Main2Activity) activity).addToFilter(i);
                    notifyDataSetChanged();
                    Toast.makeText(mContext, "Coupon added to Clipped List, Find in Clipped Tab", Toast.LENGTH_SHORT).show();
                }
            });
        }
        Glide.with(mContext).load(coupons.get(i).getImageURL()).into(((MyViewHolder) viewHolder).ivCoupon);
    }

    @Override
    public int getItemCount() {
        return coupons.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvClip;// init the item view's
        public TextView tvCouponTitle, tvCouponDescription, tvCouponExpiry;
        public ImageView ivCoupon;

        public MyViewHolder(View itemView) {
            super(itemView);

            // get the reference of item view's
            tvClip = (TextView) itemView.findViewById(R.id.tvClip);
            tvCouponDescription = (TextView) itemView.findViewById(R.id.tvCouponDescription);
            tvCouponExpiry = (TextView) itemView.findViewById(R.id.tvCouponExpiry);
            tvCouponTitle = (TextView) itemView.findViewById(R.id.tvCouponTitle);
            ivCoupon = itemView.findViewById(R.id.ivCouponImage);
        }
    }
}