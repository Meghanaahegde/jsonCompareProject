
package com.jsonproj.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "benefitId",
    "benefitName",
    "enterprisePlanId",
    "stateCode",
    "marketSegmentCode",
    "innCoreCostShareType",
    "statePlanLimitOverrideId",
    "oonCoreCostShareType",
    "level2Flag",
    "medicalBenefitNetworkLevels"
})

public class MedicalBenefitDetail {

    @JsonProperty("benefitId")
    private Integer benefitId;
    @JsonProperty("benefitName")
    private String benefitName;
    @JsonProperty("enterprisePlanId")
    private Object enterprisePlanId;
    @JsonProperty("stateCode")
    private String stateCode;
    @JsonProperty("marketSegmentCode")
    private String marketSegmentCode;
    @JsonProperty("innCoreCostShareType")
    private String innCoreCostShareType;
    @JsonProperty("statePlanLimitOverrideId")
    private Object statePlanLimitOverrideId;
    @JsonProperty("oonCoreCostShareType")
    private String oonCoreCostShareType;
    @JsonProperty("level2Flag")
    private String level2Flag;
    @JsonProperty("medicalBenefitNetworkLevels")
    private List<MedicalBenefitNetworkLevel> medicalBenefitNetworkLevels;

    @JsonProperty("benefitId")
    public Integer getBenefitId() {
        return benefitId;
    }

    @JsonProperty("benefitId")
    public void setBenefitId(Integer benefitId) {
        this.benefitId = benefitId;
    }

    @JsonProperty("benefitName")
    public String getBenefitName() {
        return benefitName;
    }

    @JsonProperty("benefitName")
    public void setBenefitName(String benefitName) {
        this.benefitName = benefitName;
    }

    @JsonProperty("enterprisePlanId")
    public Object getEnterprisePlanId() {
        return enterprisePlanId;
    }

    @JsonProperty("enterprisePlanId")
    public void setEnterprisePlanId(Object enterprisePlanId) {
        this.enterprisePlanId = enterprisePlanId;
    }

    @JsonProperty("stateCode")
    public String getStateCode() {
        return stateCode;
    }

    @JsonProperty("stateCode")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @JsonProperty("marketSegmentCode")
    public String getMarketSegmentCode() {
        return marketSegmentCode;
    }

    @JsonProperty("marketSegmentCode")
    public void setMarketSegmentCode(String marketSegmentCode) {
        this.marketSegmentCode = marketSegmentCode;
    }

    @JsonProperty("innCoreCostShareType")
    public String getInnCoreCostShareType() {
        return innCoreCostShareType;
    }

    @JsonProperty("innCoreCostShareType")
    public void setInnCoreCostShareType(String innCoreCostShareType) {
        this.innCoreCostShareType = innCoreCostShareType;
    }

    @JsonProperty("statePlanLimitOverrideId")
    public Object getStatePlanLimitOverrideId() {
        return statePlanLimitOverrideId;
    }

    @JsonProperty("statePlanLimitOverrideId")
    public void setStatePlanLimitOverrideId(Object statePlanLimitOverrideId) {
        this.statePlanLimitOverrideId = statePlanLimitOverrideId;
    }

    @JsonProperty("oonCoreCostShareType")
    public String getOonCoreCostShareType() {
        return oonCoreCostShareType;
    }

    @JsonProperty("oonCoreCostShareType")
    public void setOonCoreCostShareType(String oonCoreCostShareType) {
        this.oonCoreCostShareType = oonCoreCostShareType;
    }

    @JsonProperty("level2Flag")
    public String getLevel2Flag() {
        return level2Flag;
    }

    @JsonProperty("level2Flag")
    public void setLevel2Flag(String level2Flag) {
        this.level2Flag = level2Flag;
    }

    @JsonProperty("medicalBenefitNetworkLevels")
    public List<MedicalBenefitNetworkLevel> getMedicalBenefitNetworkLevels() {
        return medicalBenefitNetworkLevels;
    }

    @JsonProperty("medicalBenefitNetworkLevels")
    public void setMedicalBenefitNetworkLevels(List<MedicalBenefitNetworkLevel> medicalBenefitNetworkLevels) {
        this.medicalBenefitNetworkLevels = medicalBenefitNetworkLevels;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MedicalBenefitDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("benefitId");
        sb.append('=');
        sb.append(((this.benefitId == null)?"<null>":this.benefitId));
        sb.append(',');
        sb.append("benefitName");
        sb.append('=');
        sb.append(((this.benefitName == null)?"<null>":this.benefitName));
        sb.append(',');
        sb.append("enterprisePlanId");
        sb.append('=');
        sb.append(((this.enterprisePlanId == null)?"<null>":this.enterprisePlanId));
        sb.append(',');
        sb.append("stateCode");
        sb.append('=');
        sb.append(((this.stateCode == null)?"<null>":this.stateCode));
        sb.append(',');
        sb.append("marketSegmentCode");
        sb.append('=');
        sb.append(((this.marketSegmentCode == null)?"<null>":this.marketSegmentCode));
        sb.append(',');
        sb.append("innCoreCostShareType");
        sb.append('=');
        sb.append(((this.innCoreCostShareType == null)?"<null>":this.innCoreCostShareType));
        sb.append(',');
        sb.append("statePlanLimitOverrideId");
        sb.append('=');
        sb.append(((this.statePlanLimitOverrideId == null)?"<null>":this.statePlanLimitOverrideId));
        sb.append(',');
        sb.append("oonCoreCostShareType");
        sb.append('=');
        sb.append(((this.oonCoreCostShareType == null)?"<null>":this.oonCoreCostShareType));
        sb.append(',');
        sb.append("level2Flag");
        sb.append('=');
        sb.append(((this.level2Flag == null)?"<null>":this.level2Flag));
        sb.append(',');
        sb.append("medicalBenefitNetworkLevels");
        sb.append('=');
        sb.append(((this.medicalBenefitNetworkLevels == null)?"<null>":this.medicalBenefitNetworkLevels));
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
        result = ((result* 31)+((this.enterprisePlanId == null)? 0 :this.enterprisePlanId.hashCode()));
        result = ((result* 31)+((this.statePlanLimitOverrideId == null)? 0 :this.statePlanLimitOverrideId.hashCode()));
        result = ((result* 31)+((this.marketSegmentCode == null)? 0 :this.marketSegmentCode.hashCode()));
        result = ((result* 31)+((this.level2Flag == null)? 0 :this.level2Flag.hashCode()));
        result = ((result* 31)+((this.benefitName == null)? 0 :this.benefitName.hashCode()));
        result = ((result* 31)+((this.medicalBenefitNetworkLevels == null)? 0 :this.medicalBenefitNetworkLevels.hashCode()));
        result = ((result* 31)+((this.stateCode == null)? 0 :this.stateCode.hashCode()));
        result = ((result* 31)+((this.benefitId == null)? 0 :this.benefitId.hashCode()));
        result = ((result* 31)+((this.oonCoreCostShareType == null)? 0 :this.oonCoreCostShareType.hashCode()));
        result = ((result* 31)+((this.innCoreCostShareType == null)? 0 :this.innCoreCostShareType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicalBenefitDetail) == false) {
            return false;
        }
        MedicalBenefitDetail rhs = ((MedicalBenefitDetail) other);
        return (((((((((((this.enterprisePlanId == rhs.enterprisePlanId)||((this.enterprisePlanId!= null)&&this.enterprisePlanId.equals(rhs.enterprisePlanId)))&&((this.statePlanLimitOverrideId == rhs.statePlanLimitOverrideId)||((this.statePlanLimitOverrideId!= null)&&this.statePlanLimitOverrideId.equals(rhs.statePlanLimitOverrideId))))&&((this.marketSegmentCode == rhs.marketSegmentCode)||((this.marketSegmentCode!= null)&&this.marketSegmentCode.equals(rhs.marketSegmentCode))))&&((this.level2Flag == rhs.level2Flag)||((this.level2Flag!= null)&&this.level2Flag.equals(rhs.level2Flag))))&&((this.benefitName == rhs.benefitName)||((this.benefitName!= null)&&this.benefitName.equals(rhs.benefitName))))&&((this.medicalBenefitNetworkLevels == rhs.medicalBenefitNetworkLevels)||((this.medicalBenefitNetworkLevels!= null)&&this.medicalBenefitNetworkLevels.equals(rhs.medicalBenefitNetworkLevels))))&&((this.stateCode == rhs.stateCode)||((this.stateCode!= null)&&this.stateCode.equals(rhs.stateCode))))&&((this.benefitId == rhs.benefitId)||((this.benefitId!= null)&&this.benefitId.equals(rhs.benefitId))))&&((this.oonCoreCostShareType == rhs.oonCoreCostShareType)||((this.oonCoreCostShareType!= null)&&this.oonCoreCostShareType.equals(rhs.oonCoreCostShareType))))&&((this.innCoreCostShareType == rhs.innCoreCostShareType)||((this.innCoreCostShareType!= null)&&this.innCoreCostShareType.equals(rhs.innCoreCostShareType))));
    }

}
