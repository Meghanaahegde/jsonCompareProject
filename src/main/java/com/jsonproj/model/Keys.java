
package com.jsonproj.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "productId",
    "effectiveDate",
    "portfolioYear",
    "productType"
})

public class Keys {

    @JsonProperty("productId")
    private Integer productId;
    @JsonProperty("effectiveDate")
    private String effectiveDate;
    @JsonProperty("portfolioYear")
    private Integer portfolioYear;
    @JsonProperty("productType")
    private String productType;

    @JsonProperty("productId")
    public Integer getProductId() {
        return productId;
    }

    @JsonProperty("productId")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @JsonProperty("effectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("portfolioYear")
    public Integer getPortfolioYear() {
        return portfolioYear;
    }

    @JsonProperty("portfolioYear")
    public void setPortfolioYear(Integer portfolioYear) {
        this.portfolioYear = portfolioYear;
    }

    @JsonProperty("productType")
    public String getProductType() {
        return productType;
    }

    @JsonProperty("productType")
    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Keys.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("productId");
        sb.append('=');
        sb.append(((this.productId == null)?"<null>":this.productId));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("portfolioYear");
        sb.append('=');
        sb.append(((this.portfolioYear == null)?"<null>":this.portfolioYear));
        sb.append(',');
        sb.append("productType");
        sb.append('=');
        sb.append(((this.productType == null)?"<null>":this.productType));
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
        result = ((result* 31)+((this.productId == null)? 0 :this.productId.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.portfolioYear == null)? 0 :this.portfolioYear.hashCode()));
        result = ((result* 31)+((this.productType == null)? 0 :this.productType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Keys) == false) {
            return false;
        }
        Keys rhs = ((Keys) other);
        return (((((this.productId == rhs.productId)||((this.productId!= null)&&this.productId.equals(rhs.productId)))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.portfolioYear == rhs.portfolioYear)||((this.portfolioYear!= null)&&this.portfolioYear.equals(rhs.portfolioYear))))&&((this.productType == rhs.productType)||((this.productType!= null)&&this.productType.equals(rhs.productType))));
    }

}
