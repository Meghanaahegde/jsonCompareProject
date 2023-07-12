
package com.jsonproj.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "networkLevel",
    "networkLevelName",
    "costShareTypeId",
    "costShareType",
    "copayAmount",
    "coinsurancePercentage",
    "quantity",
    "quantityUnitCode",
    "quantityUnitName",
    "interval",
    "intervalName",
    "limitComments",
    "specialInstructions",
    "isTieredBenefit",
    "benefitRules"
})
public class MedicalBenefitNetworkLevel {

    @JsonProperty("networkLevel")
    private String networkLevel;
    @JsonProperty("networkLevelName")
    private String networkLevelName;
    @JsonProperty("costShareTypeId")
    private Integer costShareTypeId;
    @JsonProperty("costShareType")
    private String costShareType;
    @JsonProperty("copayAmount")
    private Object copayAmount;
    @JsonProperty("coinsurancePercentage")
    private Float coinsurancePercentage;
    @JsonProperty("quantity")
    private Object quantity;
    @JsonProperty("quantityUnitCode")
    private Object quantityUnitCode;
    @JsonProperty("quantityUnitName")
    private Object quantityUnitName;
    @JsonProperty("interval")
    private Object interval;
    @JsonProperty("intervalName")
    private Object intervalName;
    @JsonProperty("limitComments")
    private Object limitComments;
    @JsonProperty("specialInstructions")
    private Object specialInstructions;
    @JsonProperty("isTieredBenefit")
    private String isTieredBenefit;
    @JsonProperty("benefitRules")
    private Object benefitRules;

    @JsonProperty("networkLevel")
    public String getNetworkLevel() {
        return networkLevel;
    }

    @JsonProperty("networkLevel")
    public void setNetworkLevel(String networkLevel) {
        this.networkLevel = networkLevel;
    }

    @JsonProperty("networkLevelName")
    public String getNetworkLevelName() {
        return networkLevelName;
    }

    @JsonProperty("networkLevelName")
    public void setNetworkLevelName(String networkLevelName) {
        this.networkLevelName = networkLevelName;
    }

    @JsonProperty("costShareTypeId")
    public Integer getCostShareTypeId() {
        return costShareTypeId;
    }

    @JsonProperty("costShareTypeId")
    public void setCostShareTypeId(Integer costShareTypeId) {
        this.costShareTypeId = costShareTypeId;
    }

    @JsonProperty("costShareType")
    public String getCostShareType() {
        return costShareType;
    }

    @JsonProperty("costShareType")
    public void setCostShareType(String costShareType) {
        this.costShareType = costShareType;
    }

    @JsonProperty("copayAmount")
    public Object getCopayAmount() {
        return copayAmount;
    }

    @JsonProperty("copayAmount")
    public void setCopayAmount(Object copayAmount) {
        this.copayAmount = copayAmount;
    }

    @JsonProperty("coinsurancePercentage")
    public Float getCoinsurancePercentage() {
        return coinsurancePercentage;
    }

    @JsonProperty("coinsurancePercentage")
    public void setCoinsurancePercentage(Float coinsurancePercentage) {
        this.coinsurancePercentage = coinsurancePercentage;
    }

    @JsonProperty("quantity")
    public Object getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Object quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("quantityUnitCode")
    public Object getQuantityUnitCode() {
        return quantityUnitCode;
    }

    @JsonProperty("quantityUnitCode")
    public void setQuantityUnitCode(Object quantityUnitCode) {
        this.quantityUnitCode = quantityUnitCode;
    }

    @JsonProperty("quantityUnitName")
    public Object getQuantityUnitName() {
        return quantityUnitName;
    }

    @JsonProperty("quantityUnitName")
    public void setQuantityUnitName(Object quantityUnitName) {
        this.quantityUnitName = quantityUnitName;
    }

    @JsonProperty("interval")
    public Object getInterval() {
        return interval;
    }

    @JsonProperty("interval")
    public void setInterval(Object interval) {
        this.interval = interval;
    }

    @JsonProperty("intervalName")
    public Object getIntervalName() {
        return intervalName;
    }

    @JsonProperty("intervalName")
    public void setIntervalName(Object intervalName) {
        this.intervalName = intervalName;
    }

    @JsonProperty("limitComments")
    public Object getLimitComments() {
        return limitComments;
    }

    @JsonProperty("limitComments")
    public void setLimitComments(Object limitComments) {
        this.limitComments = limitComments;
    }

    @JsonProperty("specialInstructions")
    public Object getSpecialInstructions() {
        return specialInstructions;
    }

    @JsonProperty("specialInstructions")
    public void setSpecialInstructions(Object specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    @JsonProperty("isTieredBenefit")
    public String getIsTieredBenefit() {
        return isTieredBenefit;
    }

    @JsonProperty("isTieredBenefit")
    public void setIsTieredBenefit(String isTieredBenefit) {
        this.isTieredBenefit = isTieredBenefit;
    }

    @JsonProperty("benefitRules")
    public Object getBenefitRules() {
        return benefitRules;
    }

    @JsonProperty("benefitRules")
    public void setBenefitRules(Object benefitRules) {
        this.benefitRules = benefitRules;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MedicalBenefitNetworkLevel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("networkLevel");
        sb.append('=');
        sb.append(((this.networkLevel == null)?"<null>":this.networkLevel));
        sb.append(',');
        sb.append("networkLevelName");
        sb.append('=');
        sb.append(((this.networkLevelName == null)?"<null>":this.networkLevelName));
        sb.append(',');
        sb.append("costShareTypeId");
        sb.append('=');
        sb.append(((this.costShareTypeId == null)?"<null>":this.costShareTypeId));
        sb.append(',');
        sb.append("costShareType");
        sb.append('=');
        sb.append(((this.costShareType == null)?"<null>":this.costShareType));
        sb.append(',');
        sb.append("copayAmount");
        sb.append('=');
        sb.append(((this.copayAmount == null)?"<null>":this.copayAmount));
        sb.append(',');
        sb.append("coinsurancePercentage");
        sb.append('=');
        sb.append(((this.coinsurancePercentage == null)?"<null>":this.coinsurancePercentage));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("quantityUnitCode");
        sb.append('=');
        sb.append(((this.quantityUnitCode == null)?"<null>":this.quantityUnitCode));
        sb.append(',');
        sb.append("quantityUnitName");
        sb.append('=');
        sb.append(((this.quantityUnitName == null)?"<null>":this.quantityUnitName));
        sb.append(',');
        sb.append("interval");
        sb.append('=');
        sb.append(((this.interval == null)?"<null>":this.interval));
        sb.append(',');
        sb.append("intervalName");
        sb.append('=');
        sb.append(((this.intervalName == null)?"<null>":this.intervalName));
        sb.append(',');
        sb.append("limitComments");
        sb.append('=');
        sb.append(((this.limitComments == null)?"<null>":this.limitComments));
        sb.append(',');
        sb.append("specialInstructions");
        sb.append('=');
        sb.append(((this.specialInstructions == null)?"<null>":this.specialInstructions));
        sb.append(',');
        sb.append("isTieredBenefit");
        sb.append('=');
        sb.append(((this.isTieredBenefit == null)?"<null>":this.isTieredBenefit));
        sb.append(',');
        sb.append("benefitRules");
        sb.append('=');
        sb.append(((this.benefitRules == null)?"<null>":this.benefitRules));
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
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.copayAmount == null)? 0 :this.copayAmount.hashCode()));
        result = ((result* 31)+((this.quantityUnitName == null)? 0 :this.quantityUnitName.hashCode()));
        result = ((result* 31)+((this.networkLevelName == null)? 0 :this.networkLevelName.hashCode()));
        result = ((result* 31)+((this.costShareType == null)? 0 :this.costShareType.hashCode()));
        result = ((result* 31)+((this.quantityUnitCode == null)? 0 :this.quantityUnitCode.hashCode()));
        result = ((result* 31)+((this.networkLevel == null)? 0 :this.networkLevel.hashCode()));
        result = ((result* 31)+((this.specialInstructions == null)? 0 :this.specialInstructions.hashCode()));
        result = ((result* 31)+((this.limitComments == null)? 0 :this.limitComments.hashCode()));
        result = ((result* 31)+((this.interval == null)? 0 :this.interval.hashCode()));
        result = ((result* 31)+((this.intervalName == null)? 0 :this.intervalName.hashCode()));
        result = ((result* 31)+((this.benefitRules == null)? 0 :this.benefitRules.hashCode()));
        result = ((result* 31)+((this.isTieredBenefit == null)? 0 :this.isTieredBenefit.hashCode()));
        result = ((result* 31)+((this.costShareTypeId == null)? 0 :this.costShareTypeId.hashCode()));
        result = ((result* 31)+((this.coinsurancePercentage == null)? 0 :this.coinsurancePercentage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicalBenefitNetworkLevel) == false) {
            return false;
        }
        MedicalBenefitNetworkLevel rhs = ((MedicalBenefitNetworkLevel) other);
        return ((((((((((((((((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity)))&&((this.copayAmount == rhs.copayAmount)||((this.copayAmount!= null)&&this.copayAmount.equals(rhs.copayAmount))))&&((this.quantityUnitName == rhs.quantityUnitName)||((this.quantityUnitName!= null)&&this.quantityUnitName.equals(rhs.quantityUnitName))))&&((this.networkLevelName == rhs.networkLevelName)||((this.networkLevelName!= null)&&this.networkLevelName.equals(rhs.networkLevelName))))&&((this.costShareType == rhs.costShareType)||((this.costShareType!= null)&&this.costShareType.equals(rhs.costShareType))))&&((this.quantityUnitCode == rhs.quantityUnitCode)||((this.quantityUnitCode!= null)&&this.quantityUnitCode.equals(rhs.quantityUnitCode))))&&((this.networkLevel == rhs.networkLevel)||((this.networkLevel!= null)&&this.networkLevel.equals(rhs.networkLevel))))&&((this.specialInstructions == rhs.specialInstructions)||((this.specialInstructions!= null)&&this.specialInstructions.equals(rhs.specialInstructions))))&&((this.limitComments == rhs.limitComments)||((this.limitComments!= null)&&this.limitComments.equals(rhs.limitComments))))&&((this.interval == rhs.interval)||((this.interval!= null)&&this.interval.equals(rhs.interval))))&&((this.intervalName == rhs.intervalName)||((this.intervalName!= null)&&this.intervalName.equals(rhs.intervalName))))&&((this.benefitRules == rhs.benefitRules)||((this.benefitRules!= null)&&this.benefitRules.equals(rhs.benefitRules))))&&((this.isTieredBenefit == rhs.isTieredBenefit)||((this.isTieredBenefit!= null)&&this.isTieredBenefit.equals(rhs.isTieredBenefit))))&&((this.costShareTypeId == rhs.costShareTypeId)||((this.costShareTypeId!= null)&&this.costShareTypeId.equals(rhs.costShareTypeId))))&&((this.coinsurancePercentage == rhs.coinsurancePercentage)||((this.coinsurancePercentage!= null)&&this.coinsurancePercentage.equals(rhs.coinsurancePercentage))));
    }

}
