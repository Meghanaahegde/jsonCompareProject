
package com.jsonproj.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "productName",
    "masterBrandId",
    "masterBrand",
    "brandingId",
    "branding",
    "legalEntity",
    "exchangeIndicatorId",
    "exchangeIndicator",
    "variantId"
})

public class ProductAttributes {

    @JsonProperty("productName")
    private String productName;
    @JsonProperty("masterBrandId")
    private Integer masterBrandId;
    @JsonProperty("masterBrand")
    private String masterBrand;
    @JsonProperty("brandingId")
    private Object brandingId;
    @JsonProperty("branding")
    private Object branding;
    @JsonProperty("legalEntity")
    private String legalEntity;
    @JsonProperty("exchangeIndicatorId")
    private Object exchangeIndicatorId;
    @JsonProperty("exchangeIndicator")
    private String exchangeIndicator;
    @JsonProperty("variantId")
    private String variantId;

    @JsonProperty("productName")
    public String getProductName() {
        return productName;
    }

    @JsonProperty("productName")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @JsonProperty("masterBrandId")
    public Integer getMasterBrandId() {
        return masterBrandId;
    }

    @JsonProperty("masterBrandId")
    public void setMasterBrandId(Integer masterBrandId) {
        this.masterBrandId = masterBrandId;
    }

    @JsonProperty("masterBrand")
    public String getMasterBrand() {
        return masterBrand;
    }

    @JsonProperty("masterBrand")
    public void setMasterBrand(String masterBrand) {
        this.masterBrand = masterBrand;
    }

    @JsonProperty("brandingId")
    public Object getBrandingId() {
        return brandingId;
    }

    @JsonProperty("brandingId")
    public void setBrandingId(Object brandingId) {
        this.brandingId = brandingId;
    }

    @JsonProperty("branding")
    public Object getBranding() {
        return branding;
    }

    @JsonProperty("branding")
    public void setBranding(Object branding) {
        this.branding = branding;
    }

    @JsonProperty("legalEntity")
    public String getLegalEntity() {
        return legalEntity;
    }

    @JsonProperty("legalEntity")
    public void setLegalEntity(String legalEntity) {
        this.legalEntity = legalEntity;
    }

    @JsonProperty("exchangeIndicatorId")
    public Object getExchangeIndicatorId() {
        return exchangeIndicatorId;
    }

    @JsonProperty("exchangeIndicatorId")
    public void setExchangeIndicatorId(Object exchangeIndicatorId) {
        this.exchangeIndicatorId = exchangeIndicatorId;
    }

    @JsonProperty("exchangeIndicator")
    public String getExchangeIndicator() {
        return exchangeIndicator;
    }

    @JsonProperty("exchangeIndicator")
    public void setExchangeIndicator(String exchangeIndicator) {
        this.exchangeIndicator = exchangeIndicator;
    }

    @JsonProperty("variantId")
    public String getVariantId() {
        return variantId;
    }

    @JsonProperty("variantId")
    public void setVariantId(String variantId) {
        this.variantId = variantId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProductAttributes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("productName");
        sb.append('=');
        sb.append(((this.productName == null)?"<null>":this.productName));
        sb.append(',');
        sb.append("masterBrandId");
        sb.append('=');
        sb.append(((this.masterBrandId == null)?"<null>":this.masterBrandId));
        sb.append(',');
        sb.append("masterBrand");
        sb.append('=');
        sb.append(((this.masterBrand == null)?"<null>":this.masterBrand));
        sb.append(',');
        sb.append("brandingId");
        sb.append('=');
        sb.append(((this.brandingId == null)?"<null>":this.brandingId));
        sb.append(',');
        sb.append("branding");
        sb.append('=');
        sb.append(((this.branding == null)?"<null>":this.branding));
        sb.append(',');
        sb.append("legalEntity");
        sb.append('=');
        sb.append(((this.legalEntity == null)?"<null>":this.legalEntity));
        sb.append(',');
        sb.append("exchangeIndicatorId");
        sb.append('=');
        sb.append(((this.exchangeIndicatorId == null)?"<null>":this.exchangeIndicatorId));
        sb.append(',');
        sb.append("exchangeIndicator");
        sb.append('=');
        sb.append(((this.exchangeIndicator == null)?"<null>":this.exchangeIndicator));
        sb.append(',');
        sb.append("variantId");
        sb.append('=');
        sb.append(((this.variantId == null)?"<null>":this.variantId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.masterBrandId == null)? 0 :this.masterBrandId.hashCode()));
        result = ((result* 31)+((this.brandingId == null)? 0 :this.brandingId.hashCode()));
        result = ((result* 31)+((this.branding == null)? 0 :this.branding.hashCode()));
        result = ((result* 31)+((this.masterBrand == null)? 0 :this.masterBrand.hashCode()));
        result = ((result* 31)+((this.exchangeIndicatorId == null)? 0 :this.exchangeIndicatorId.hashCode()));
        result = ((result* 31)+((this.variantId == null)? 0 :this.variantId.hashCode()));
        result = ((result* 31)+((this.productName == null)? 0 :this.productName.hashCode()));
        result = ((result* 31)+((this.exchangeIndicator == null)? 0 :this.exchangeIndicator.hashCode()));
        result = ((result* 31)+((this.legalEntity == null)? 0 :this.legalEntity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProductAttributes) == false) {
            return false;
        }
        ProductAttributes rhs = ((ProductAttributes) other);
        return ((((((((((this.masterBrandId == rhs.masterBrandId)||((this.masterBrandId!= null)&&this.masterBrandId.equals(rhs.masterBrandId)))&&((this.brandingId == rhs.brandingId)||((this.brandingId!= null)&&this.brandingId.equals(rhs.brandingId))))&&((this.branding == rhs.branding)||((this.branding!= null)&&this.branding.equals(rhs.branding))))&&((this.masterBrand == rhs.masterBrand)||((this.masterBrand!= null)&&this.masterBrand.equals(rhs.masterBrand))))&&((this.exchangeIndicatorId == rhs.exchangeIndicatorId)||((this.exchangeIndicatorId!= null)&&this.exchangeIndicatorId.equals(rhs.exchangeIndicatorId))))&&((this.variantId == rhs.variantId)||((this.variantId!= null)&&this.variantId.equals(rhs.variantId))))&&((this.productName == rhs.productName)||((this.productName!= null)&&this.productName.equals(rhs.productName))))&&((this.exchangeIndicator == rhs.exchangeIndicator)||((this.exchangeIndicator!= null)&&this.exchangeIndicator.equals(rhs.exchangeIndicator))))&&((this.legalEntity == rhs.legalEntity)||((this.legalEntity!= null)&&this.legalEntity.equals(rhs.legalEntity))));
    }

}
