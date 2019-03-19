package com.macy.app.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CouponList {
    @SerializedName("availableCouponCount")
    private int availableCouponCount;
    @SerializedName("couponCount")
    private int couponCount;
    @SerializedName("hasSpecialOffers")
    private boolean hasSpecialOffers;
    @SerializedName("listOfCoupons")
    private List<Coupon> data = new ArrayList<>();

    public int getAvailableCouponCount() {
        return availableCouponCount;
    }

    public void setAvailableCouponCount(int availableCouponCount) {
        this.availableCouponCount = availableCouponCount;
    }

    public int getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }

    public boolean isHasSpecialOffers() {
        return hasSpecialOffers;
    }

    public void setHasSpecialOffers(boolean hasSpecialOffers) {
        this.hasSpecialOffers = hasSpecialOffers;
    }

    public List<Coupon> getData() {
        return data;
    }

    public void setData(List<Coupon> data) {
        this.data = data;
    }
}
