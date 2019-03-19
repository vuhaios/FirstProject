package com.macy.app.adapter;

import com.macy.app.pojo.Category;
import com.macy.app.pojo.Coupon;
import com.macy.app.pojo.CouponList;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CouponTest {

    @Test
    public void testCoupon(){
        Coupon coupon = new Coupon();
        coupon.setIsClipped(false);
        coupon.setTitle("Sample");
        assertTrue(coupon.getTitle().equals("Sample"));
        assertFalse(coupon.getIsClipped());
    }

    @Test
    public void testCategory(){
        Category category = new Category();
        category.setSegmentID("23");
        category.setSegmentName("Test");
        assertTrue(category.getSegmentID().equals("23"));
        assertTrue(category.getSegmentName().equals("Test"));

    }

    @Test
    public void testCouponList(){
        CouponList couponList = new CouponList();
        couponList.setData(new ArrayList<Coupon>());
        couponList.getData().add(new Coupon());
        couponList.getData().add(new Coupon());
        couponList.getData().add(new Coupon());
        couponList.setAvailableCouponCount(3);
        couponList.setHasSpecialOffers(true);
        assertTrue(couponList.isHasSpecialOffers());
        assertTrue(couponList.getData().size()==3);
        assertTrue(couponList.getAvailableCouponCount()==3);
    }

}
