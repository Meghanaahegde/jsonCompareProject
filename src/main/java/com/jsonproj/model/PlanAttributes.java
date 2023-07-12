
package com.jsonproj.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "marketSegment",
    "metalLevelCode",
    "metalLevelDescription",
    "targetAvPercentage",
    "benefitRelativity",
    "marketSegmentCode",
    "meetsMedicarePartDRxCredibleCoverageFlag"
})

public class PlanAttributes {

    @JsonProperty("marketSegment")
    private String marketSegment;
    @JsonProperty("metalLevelCode")
    private Object metalLevelCode;
    @JsonProperty("metalLevelDescription")
    private String metalLevelDescription;
    @JsonProperty("targetAvPercentage")
    private Object targetAvPercentage;
    @JsonProperty("benefitRelativity")
    private Object benefitRelativity;
    @JsonProperty("marketSegmentCode")
    private String marketSegmentCode;
    @JsonProperty("meetsMedicarePartDRxCredibleCoverageFlag")
    private String meetsMedicarePartDRxCredibleCoverageFlag;

    @JsonProperty("marketSegment")
    public String getMarketSegment() {
        return marketSegment;
    }

    @JsonProperty("marketSegment")
    public void setMarketSegment(String marketSegment) {
        this.marketSegment = marketSegment;
    }

    @JsonProperty("metalLevelCode")
    public Object getMetalLevelCode() {
        return metalLevelCode;
    }

    @JsonProperty("metalLevelCode")
    public void setMetalLevelCode(Object metalLevelCode) {
        this.metalLevelCode = metalLevelCode;
    }

    @JsonProperty("metalLevelDescription")
    public String getMetalLevelDescription() {
        return metalLevelDescription;
    }

    @JsonProperty("metalLevelDescription")
    public void setMetalLevelDescription(String metalLevelDescription) {
        this.metalLevelDescription = metalLevelDescription;
    }

    @JsonProperty("targetAvPercentage")
    public Object getTargetAvPercentage() {
        return targetAvPercentage;
    }

    @JsonProperty("targetAvPercentage")
    public void setTargetAvPercentage(Object targetAvPercentage) {
        this.targetAvPercentage = targetAvPercentage;
    }

    @JsonProperty("benefitRelativity")
    public Object getBenefitRelativity() {
        return benefitRelativity;
    }

    @JsonProperty("benefitRelativity")
    public void setBenefitRelativity(Object benefitRelativity) {
        this.benefitRelativity = benefitRelativity;
    }

    @JsonProperty("marketSegmentCode")
    public String getMarketSegmentCode() {
        return marketSegmentCode;
    }

    @JsonProperty("marketSegmentCode")
    public void setMarketSegmentCode(String marketSegmentCode) {
        this.marketSegmentCode = marketSegmentCode;
    }

    @JsonProperty("meetsMedicarePartDRxCredibleCoverageFlag")
    public String getMeetsMedicarePartDRxCredibleCoverageFlag() {
        return meetsMedicarePartDRxCredibleCoverageFlag;
    }

    @JsonProperty("meetsMedicarePartDRxCredibleCoverageFlag")
    public void setMeetsMedicarePartDRxCredibleCoverageFlag(String meetsMedicarePartDRxCredibleCoverageFlag) {
        this.meetsMedicarePartDRxCredibleCoverageFlag = meetsMedicarePartDRxCredibleCoverageFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PlanAttributes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("marketSegment");
        sb.append('=');
        sb.append(((this.marketSegment == null)?"<null>":this.marketSegment));
        sb.append(',');
        sb.append("metalLevelCode");
        sb.append('=');
        sb.append(((this.metalLevelCode == null)?"<null>":this.metalLevelCode));
        sb.append(',');
        sb.append("metalLevelDescription");
        sb.append('=');
        sb.append(((this.metalLevelDescription == null)?"<null>":this.metalLevelDescription));
        sb.append(',');
        sb.append("targetAvPercentage");
        sb.append('=');
        sb.append(((this.targetAvPercentage == null)?"<null>":this.targetAvPercentage));
        sb.append(',');
        sb.append("benefitRelativity");
        sb.append('=');
        sb.append(((this.benefitRelativity == null)?"<null>":this.benefitRelativity));
        sb.append(',');
        sb.append("marketSegmentCode");
        sb.append('=');
        sb.append(((this.marketSegmentCode == null)?"<null>":this.marketSegmentCode));
        sb.append(',');
        sb.append("meetsMedicarePartDRxCredibleCoverageFlag");
        sb.append('=');
        sb.append(((this.meetsMedicarePartDRxCredibleCoverageFlag == null)?"<null>":this.meetsMedicarePartDRxCredibleCoverageFlag));
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
        result = ((result* 31)+((this.marketSegmentCode == null)? 0 :this.marketSegmentCode.hashCode()));
        result = ((result* 31)+((this.metalLevelDescription == null)? 0 :this.metalLevelDescription.hashCode()));
        result = ((result* 31)+((this.targetAvPercentage == null)? 0 :this.targetAvPercentage.hashCode()));
        result = ((result* 31)+((this.benefitRelativity == null)? 0 :this.benefitRelativity.hashCode()));
        result = ((result* 31)+((this.marketSegment == null)? 0 :this.marketSegment.hashCode()));
        result = ((result* 31)+((this.metalLevelCode == null)? 0 :this.metalLevelCode.hashCode()));
        result = ((result* 31)+((this.meetsMedicarePartDRxCredibleCoverageFlag == null)? 0 :this.meetsMedicarePartDRxCredibleCoverageFlag.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlanAttributes) == false) {
            return false;
        }
        PlanAttributes rhs = ((PlanAttributes) other);
        return ((((((((this.marketSegmentCode == rhs.marketSegmentCode)||((this.marketSegmentCode!= null)&&this.marketSegmentCode.equals(rhs.marketSegmentCode)))&&((this.metalLevelDescription == rhs.metalLevelDescription)||((this.metalLevelDescription!= null)&&this.metalLevelDescription.equals(rhs.metalLevelDescription))))&&((this.targetAvPercentage == rhs.targetAvPercentage)||((this.targetAvPercentage!= null)&&this.targetAvPercentage.equals(rhs.targetAvPercentage))))&&((this.benefitRelativity == rhs.benefitRelativity)||((this.benefitRelativity!= null)&&this.benefitRelativity.equals(rhs.benefitRelativity))))&&((this.marketSegment == rhs.marketSegment)||((this.marketSegment!= null)&&this.marketSegment.equals(rhs.marketSegment))))&&((this.metalLevelCode == rhs.metalLevelCode)||((this.metalLevelCode!= null)&&this.metalLevelCode.equals(rhs.metalLevelCode))))&&((this.meetsMedicarePartDRxCredibleCoverageFlag == rhs.meetsMedicarePartDRxCredibleCoverageFlag)||((this.meetsMedicarePartDRxCredibleCoverageFlag!= null)&&this.meetsMedicarePartDRxCredibleCoverageFlag.equals(rhs.meetsMedicarePartDRxCredibleCoverageFlag))));
    }

}
