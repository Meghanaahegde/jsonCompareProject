
package com.jsonproj.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "benefitCategoryId",
    "benefitCategoryName",
    "medicalBenefitDetails"
})

public class MedicalBenefit {

    @JsonProperty("benefitCategoryId")
    private Integer benefitCategoryId;
    @JsonProperty("benefitCategoryName")
    private String benefitCategoryName;
    @JsonProperty("medicalBenefitDetails")
    private List<MedicalBenefitDetail> medicalBenefitDetails;

    @JsonProperty("benefitCategoryId")
    public Integer getBenefitCategoryId() {
        return benefitCategoryId;
    }

    @JsonProperty("benefitCategoryId")
    public void setBenefitCategoryId(Integer benefitCategoryId) {
        this.benefitCategoryId = benefitCategoryId;
    }

    @JsonProperty("benefitCategoryName")
    public String getBenefitCategoryName() {
        return benefitCategoryName;
    }

    @JsonProperty("benefitCategoryName")
    public void setBenefitCategoryName(String benefitCategoryName) {
        this.benefitCategoryName = benefitCategoryName;
    }

    @JsonProperty("medicalBenefitDetails")
    public List<MedicalBenefitDetail> getMedicalBenefitDetails() {
        return medicalBenefitDetails;
    }

    @JsonProperty("medicalBenefitDetails")
    public void setMedicalBenefitDetails(List<MedicalBenefitDetail> medicalBenefitDetails) {
        this.medicalBenefitDetails = medicalBenefitDetails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MedicalBenefit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("benefitCategoryId");
        sb.append('=');
        sb.append(((this.benefitCategoryId == null)?"<null>":this.benefitCategoryId));
        sb.append(',');
        sb.append("benefitCategoryName");
        sb.append('=');
        sb.append(((this.benefitCategoryName == null)?"<null>":this.benefitCategoryName));
        sb.append(',');
        sb.append("medicalBenefitDetails");
        sb.append('=');
        sb.append(((this.medicalBenefitDetails == null)?"<null>":this.medicalBenefitDetails));
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
        result = ((result* 31)+((this.benefitCategoryName == null)? 0 :this.benefitCategoryName.hashCode()));
        result = ((result* 31)+((this.medicalBenefitDetails == null)? 0 :this.medicalBenefitDetails.hashCode()));
        result = ((result* 31)+((this.benefitCategoryId == null)? 0 :this.benefitCategoryId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicalBenefit) == false) {
            return false;
        }
        MedicalBenefit rhs = ((MedicalBenefit) other);
        return ((((this.benefitCategoryName == rhs.benefitCategoryName)||((this.benefitCategoryName!= null)&&this.benefitCategoryName.equals(rhs.benefitCategoryName)))&&((this.medicalBenefitDetails == rhs.medicalBenefitDetails)||((this.medicalBenefitDetails!= null)&&this.medicalBenefitDetails.equals(rhs.medicalBenefitDetails))))&&((this.benefitCategoryId == rhs.benefitCategoryId)||((this.benefitCategoryId!= null)&&this.benefitCategoryId.equals(rhs.benefitCategoryId))));
    }

}
