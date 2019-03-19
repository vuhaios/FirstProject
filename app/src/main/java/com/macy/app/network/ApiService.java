package com.macy.app.network;

import com.macy.app.pojo.Coupon;
import com.macy.app.pojo.CouponList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {
    @GET("Products")
    Call<CouponList> getCoupons(@Query("code") String code);

    @POST("Products")
    Call<Boolean> submitCoupon(@Body Coupon coupon);
}
