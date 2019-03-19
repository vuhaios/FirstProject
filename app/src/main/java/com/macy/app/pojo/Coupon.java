package com.macy.app.pojo;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Coupon {

    @SerializedName("isSuggested")
    @Expose
    private Boolean isSuggested;
    @SerializedName("isClipped")
    @Expose
    private Boolean isClipped;
    @SerializedName("isAutoClipped")
    @Expose
    private Boolean isAutoClipped;
    @SerializedName("isHidden")
    @Expose
    private Boolean isHidden;
    @SerializedName("couponInclusionGroupTag")
    @Expose
    private String couponInclusionGroupTag;
    @SerializedName("couponExpirationGroupTag")
    @Expose
    private String couponExpirationGroupTag;
    @SerializedName("isSpecialOffer")
    @Expose
    private Boolean isSpecialOffer;
    @SerializedName("redemptionDate")
    @Expose
    private Object redemptionDate;
    @SerializedName("meijerOfferId")
    @Expose
    private Integer meijerOfferId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("hatText")
    @Expose
    private Object hatText;
    @SerializedName("hatColor")
    @Expose
    private Integer hatColor;
    @SerializedName("borderColor")
    @Expose
    private Integer borderColor;
    @SerializedName("isMeijerBuck")
    @Expose
    private Boolean isMeijerBuck;
    @SerializedName("showLargeImage")
    @Expose
    private Boolean showLargeImage;
    @SerializedName("imageURL")
    @Expose
    private String imageURL;
    @SerializedName("largeImageURL")
    @Expose
    private String largeImageURL;
    @SerializedName("termsAndConditions")
    @Expose
    private String termsAndConditions;
    @SerializedName("redemptionStartDate")
    @Expose
    private String redemptionStartDate;
    @SerializedName("redemptionEndDate")
    @Expose
    private String redemptionEndDate;
    @SerializedName("manufacturerCoupon")
    @Expose
    private Boolean manufacturerCoupon;
    @SerializedName("offerClassId")
    @Expose
    private Integer offerClassId;
    @SerializedName("rewardProgramId")
    @Expose
    private Integer rewardProgramId;

    public Boolean getIsSuggested() {
        return isSuggested;
    }

    public void setIsSuggested(Boolean isSuggested) {
        this.isSuggested = isSuggested;
    }

    public Boolean getIsClipped() {
        return isClipped;
    }

    public void setIsClipped(Boolean isClipped) {
        this.isClipped = isClipped;
    }

    public Boolean getIsAutoClipped() {
        return isAutoClipped;
    }

    public void setIsAutoClipped(Boolean isAutoClipped) {
        this.isAutoClipped = isAutoClipped;
    }

    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public String getCouponInclusionGroupTag() {
        return couponInclusionGroupTag;
    }

    public void setCouponInclusionGroupTag(String couponInclusionGroupTag) {
        this.couponInclusionGroupTag = couponInclusionGroupTag;
    }

    public String getCouponExpirationGroupTag() {
        return couponExpirationGroupTag;
    }

    public void setCouponExpirationGroupTag(String couponExpirationGroupTag) {
        this.couponExpirationGroupTag = couponExpirationGroupTag;
    }

    public Boolean getIsSpecialOffer() {
        return isSpecialOffer;
    }

    public void setIsSpecialOffer(Boolean isSpecialOffer) {
        this.isSpecialOffer = isSpecialOffer;
    }

    public Object getRedemptionDate() {
        return redemptionDate;
    }

    public void setRedemptionDate(Object redemptionDate) {
        this.redemptionDate = redemptionDate;
    }

    public Integer getMeijerOfferId() {
        return meijerOfferId;
    }

    public void setMeijerOfferId(Integer meijerOfferId) {
        this.meijerOfferId = meijerOfferId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Object getHatText() {
        return hatText;
    }

    public void setHatText(Object hatText) {
        this.hatText = hatText;
    }

    public Integer getHatColor() {
        return hatColor;
    }

    public void setHatColor(Integer hatColor) {
        this.hatColor = hatColor;
    }

    public Integer getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Integer borderColor) {
        this.borderColor = borderColor;
    }

    public Boolean getIsMeijerBuck() {
        return isMeijerBuck;
    }

    public void setIsMeijerBuck(Boolean isMeijerBuck) {
        this.isMeijerBuck = isMeijerBuck;
    }

    public Boolean getShowLargeImage() {
        return showLargeImage;
    }

    public void setShowLargeImage(Boolean showLargeImage) {
        this.showLargeImage = showLargeImage;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getLargeImageURL() {
        return largeImageURL;
    }

    public void setLargeImageURL(String largeImageURL) {
        this.largeImageURL = largeImageURL;
    }

    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(String termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public String getRedemptionStartDate() {
        return redemptionStartDate;
    }

    public void setRedemptionStartDate(String redemptionStartDate) {
        this.redemptionStartDate = redemptionStartDate;
    }

    public String getRedemptionEndDate() {
        return redemptionEndDate;
    }

    public void setRedemptionEndDate(String redemptionEndDate) {
        this.redemptionEndDate = redemptionEndDate;
    }

    public Boolean getManufacturerCoupon() {
        return manufacturerCoupon;
    }

    public void setManufacturerCoupon(Boolean manufacturerCoupon) {
        this.manufacturerCoupon = manufacturerCoupon;
    }

    public Integer getOfferClassId() {
        return offerClassId;
    }

    public void setOfferClassId(Integer offerClassId) {
        this.offerClassId = offerClassId;
    }

    public Integer getRewardProgramId() {
        return rewardProgramId;
    }

    public void setRewardProgramId(Integer rewardProgramId) {
        this.rewardProgramId = rewardProgramId;
    }

}
