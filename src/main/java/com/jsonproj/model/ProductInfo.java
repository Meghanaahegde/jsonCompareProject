
package com.jsonproj.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "productAttributes",
    "planAttributes",
    "costShareVariations",
    "healthAccountInfo",
    "networks",
    "outOfAreaDetails",
    "contractCodes",
    "medicalBenefits",
    "pharmacyPlan",
    "pharmacyBenefitNetworks",
    "productNotes",
    "hasFacilityTiering",
    "hasSiteOfService",
    "maternity",
    "docGenInstructions"
})

public class ProductInfo {

    @JsonProperty("productAttributes")
    private ProductAttributes productAttributes;
    @JsonProperty("planAttributes")
    private PlanAttributes planAttributes;
    @JsonProperty("costShareVariations")
    private Object costShareVariations;
    @JsonProperty("healthAccountInfo")
    private Object healthAccountInfo;
    @JsonProperty("networks")
    private List<Network> networks;
    @JsonProperty("outOfAreaDetails")
    private Object outOfAreaDetails;
    @JsonProperty("contractCodes")
    private List<ContractCode> contractCodes;
    @JsonProperty("medicalBenefits")
    private List<MedicalBenefit> medicalBenefits;
    @JsonProperty("pharmacyPlan")
    private Object pharmacyPlan;
    @JsonProperty("pharmacyBenefitNetworks")
    private Object pharmacyBenefitNetworks;
    @JsonProperty("productNotes")
    private Object productNotes;
    @JsonProperty("hasFacilityTiering")
    private String hasFacilityTiering;
    @JsonProperty("hasSiteOfService")
    private String hasSiteOfService;
    @JsonProperty("maternity")
    private String maternity;
    @JsonProperty("docGenInstructions")
    private Object docGenInstructions;

    @JsonProperty("productAttributes")
    public ProductAttributes getProductAttributes() {
        return productAttributes;
    }

    @JsonProperty("productAttributes")
    public void setProductAttributes(ProductAttributes productAttributes) {
        this.productAttributes = productAttributes;
    }

    @JsonProperty("planAttributes")
    public PlanAttributes getPlanAttributes() {
        return planAttributes;
    }

    @JsonProperty("planAttributes")
    public void setPlanAttributes(PlanAttributes planAttributes) {
        this.planAttributes = planAttributes;
    }

    @JsonProperty("costShareVariations")
    public Object getCostShareVariations() {
        return costShareVariations;
    }

    @JsonProperty("costShareVariations")
    public void setCostShareVariations(Object costShareVariations) {
        this.costShareVariations = costShareVariations;
    }

    @JsonProperty("healthAccountInfo")
    public Object getHealthAccountInfo() {
        return healthAccountInfo;
    }

    @JsonProperty("healthAccountInfo")
    public void setHealthAccountInfo(Object healthAccountInfo) {
        this.healthAccountInfo = healthAccountInfo;
    }

    @JsonProperty("networks")
    public List<Network> getNetworks() {
        return networks;
    }

    @JsonProperty("networks")
    public void setNetworks(List<Network> networks) {
        this.networks = networks;
    }

    @JsonProperty("outOfAreaDetails")
    public Object getOutOfAreaDetails() {
        return outOfAreaDetails;
    }

    @JsonProperty("outOfAreaDetails")
    public void setOutOfAreaDetails(Object outOfAreaDetails) {
        this.outOfAreaDetails = outOfAreaDetails;
    }

    @JsonProperty("contractCodes")
    public List<ContractCode> getContractCodes() {
        return contractCodes;
    }

    @JsonProperty("contractCodes")
    public void setContractCodes(List<ContractCode> contractCodes) {
        this.contractCodes = contractCodes;
    }

    @JsonProperty("medicalBenefits")
    public List<MedicalBenefit> getMedicalBenefits() {
        return medicalBenefits;
    }

    @JsonProperty("medicalBenefits")
    public void setMedicalBenefits(List<MedicalBenefit> medicalBenefits) {
        this.medicalBenefits = medicalBenefits;
    }

    @JsonProperty("pharmacyPlan")
    public Object getPharmacyPlan() {
        return pharmacyPlan;
    }

    @JsonProperty("pharmacyPlan")
    public void setPharmacyPlan(Object pharmacyPlan) {
        this.pharmacyPlan = pharmacyPlan;
    }

    @JsonProperty("pharmacyBenefitNetworks")
    public Object getPharmacyBenefitNetworks() {
        return pharmacyBenefitNetworks;
    }

    @JsonProperty("pharmacyBenefitNetworks")
    public void setPharmacyBenefitNetworks(Object pharmacyBenefitNetworks) {
        this.pharmacyBenefitNetworks = pharmacyBenefitNetworks;
    }

    @JsonProperty("productNotes")
    public Object getProductNotes() {
        return productNotes;
    }

    @JsonProperty("productNotes")
    public void setProductNotes(Object productNotes) {
        this.productNotes = productNotes;
    }

    @JsonProperty("hasFacilityTiering")
    public String getHasFacilityTiering() {
        return hasFacilityTiering;
    }

    @JsonProperty("hasFacilityTiering")
    public void setHasFacilityTiering(String hasFacilityTiering) {
        this.hasFacilityTiering = hasFacilityTiering;
    }

    @JsonProperty("hasSiteOfService")
    public String getHasSiteOfService() {
        return hasSiteOfService;
    }

    @JsonProperty("hasSiteOfService")
    public void setHasSiteOfService(String hasSiteOfService) {
        this.hasSiteOfService = hasSiteOfService;
    }

    @JsonProperty("maternity")
    public String getMaternity() {
        return maternity;
    }

    @JsonProperty("maternity")
    public void setMaternity(String maternity) {
        this.maternity = maternity;
    }

    @JsonProperty("docGenInstructions")
    public Object getDocGenInstructions() {
        return docGenInstructions;
    }

    @JsonProperty("docGenInstructions")
    public void setDocGenInstructions(Object docGenInstructions) {
        this.docGenInstructions = docGenInstructions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProductInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("productAttributes");
        sb.append('=');
        sb.append(((this.productAttributes == null)?"<null>":this.productAttributes));
        sb.append(',');
        sb.append("planAttributes");
        sb.append('=');
        sb.append(((this.planAttributes == null)?"<null>":this.planAttributes));
        sb.append(',');
        sb.append("costShareVariations");
        sb.append('=');
        sb.append(((this.costShareVariations == null)?"<null>":this.costShareVariations));
        sb.append(',');
        sb.append("healthAccountInfo");
        sb.append('=');
        sb.append(((this.healthAccountInfo == null)?"<null>":this.healthAccountInfo));
        sb.append(',');
        sb.append("networks");
        sb.append('=');
        sb.append(((this.networks == null)?"<null>":this.networks));
        sb.append(',');
        sb.append("outOfAreaDetails");
        sb.append('=');
        sb.append(((this.outOfAreaDetails == null)?"<null>":this.outOfAreaDetails));
        sb.append(',');
        sb.append("contractCodes");
        sb.append('=');
        sb.append(((this.contractCodes == null)?"<null>":this.contractCodes));
        sb.append(',');
        sb.append("medicalBenefits");
        sb.append('=');
        sb.append(((this.medicalBenefits == null)?"<null>":this.medicalBenefits));
        sb.append(',');
        sb.append("pharmacyPlan");
        sb.append('=');
        sb.append(((this.pharmacyPlan == null)?"<null>":this.pharmacyPlan));
        sb.append(',');
        sb.append("pharmacyBenefitNetworks");
        sb.append('=');
        sb.append(((this.pharmacyBenefitNetworks == null)?"<null>":this.pharmacyBenefitNetworks));
        sb.append(',');
        sb.append("productNotes");
        sb.append('=');
        sb.append(((this.productNotes == null)?"<null>":this.productNotes));
        sb.append(',');
        sb.append("hasFacilityTiering");
        sb.append('=');
        sb.append(((this.hasFacilityTiering == null)?"<null>":this.hasFacilityTiering));
        sb.append(',');
        sb.append("hasSiteOfService");
        sb.append('=');
        sb.append(((this.hasSiteOfService == null)?"<null>":this.hasSiteOfService));
        sb.append(',');
        sb.append("maternity");
        sb.append('=');
        sb.append(((this.maternity == null)?"<null>":this.maternity));
        sb.append(',');
        sb.append("docGenInstructions");
        sb.append('=');
        sb.append(((this.docGenInstructions == null)?"<null>":this.docGenInstructions));
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
        result = ((result* 31)+((this.planAttributes == null)? 0 :this.planAttributes.hashCode()));
        result = ((result* 31)+((this.hasFacilityTiering == null)? 0 :this.hasFacilityTiering.hashCode()));
        result = ((result* 31)+((this.productAttributes == null)? 0 :this.productAttributes.hashCode()));
        result = ((result* 31)+((this.networks == null)? 0 :this.networks.hashCode()));
        result = ((result* 31)+((this.healthAccountInfo == null)? 0 :this.healthAccountInfo.hashCode()));
        result = ((result* 31)+((this.hasSiteOfService == null)? 0 :this.hasSiteOfService.hashCode()));
        result = ((result* 31)+((this.pharmacyPlan == null)? 0 :this.pharmacyPlan.hashCode()));
        result = ((result* 31)+((this.pharmacyBenefitNetworks == null)? 0 :this.pharmacyBenefitNetworks.hashCode()));
        result = ((result* 31)+((this.productNotes == null)? 0 :this.productNotes.hashCode()));
        result = ((result* 31)+((this.outOfAreaDetails == null)? 0 :this.outOfAreaDetails.hashCode()));
        result = ((result* 31)+((this.maternity == null)? 0 :this.maternity.hashCode()));
        result = ((result* 31)+((this.docGenInstructions == null)? 0 :this.docGenInstructions.hashCode()));
        result = ((result* 31)+((this.contractCodes == null)? 0 :this.contractCodes.hashCode()));
        result = ((result* 31)+((this.medicalBenefits == null)? 0 :this.medicalBenefits.hashCode()));
        result = ((result* 31)+((this.costShareVariations == null)? 0 :this.costShareVariations.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProductInfo) == false) {
            return false;
        }
        ProductInfo rhs = ((ProductInfo) other);
        return ((((((((((((((((this.planAttributes == rhs.planAttributes)||((this.planAttributes!= null)&&this.planAttributes.equals(rhs.planAttributes)))&&((this.hasFacilityTiering == rhs.hasFacilityTiering)||((this.hasFacilityTiering!= null)&&this.hasFacilityTiering.equals(rhs.hasFacilityTiering))))&&((this.productAttributes == rhs.productAttributes)||((this.productAttributes!= null)&&this.productAttributes.equals(rhs.productAttributes))))&&((this.networks == rhs.networks)||((this.networks!= null)&&this.networks.equals(rhs.networks))))&&((this.healthAccountInfo == rhs.healthAccountInfo)||((this.healthAccountInfo!= null)&&this.healthAccountInfo.equals(rhs.healthAccountInfo))))&&((this.hasSiteOfService == rhs.hasSiteOfService)||((this.hasSiteOfService!= null)&&this.hasSiteOfService.equals(rhs.hasSiteOfService))))&&((this.pharmacyPlan == rhs.pharmacyPlan)||((this.pharmacyPlan!= null)&&this.pharmacyPlan.equals(rhs.pharmacyPlan))))&&((this.pharmacyBenefitNetworks == rhs.pharmacyBenefitNetworks)||((this.pharmacyBenefitNetworks!= null)&&this.pharmacyBenefitNetworks.equals(rhs.pharmacyBenefitNetworks))))&&((this.productNotes == rhs.productNotes)||((this.productNotes!= null)&&this.productNotes.equals(rhs.productNotes))))&&((this.outOfAreaDetails == rhs.outOfAreaDetails)||((this.outOfAreaDetails!= null)&&this.outOfAreaDetails.equals(rhs.outOfAreaDetails))))&&((this.maternity == rhs.maternity)||((this.maternity!= null)&&this.maternity.equals(rhs.maternity))))&&((this.docGenInstructions == rhs.docGenInstructions)||((this.docGenInstructions!= null)&&this.docGenInstructions.equals(rhs.docGenInstructions))))&&((this.contractCodes == rhs.contractCodes)||((this.contractCodes!= null)&&this.contractCodes.equals(rhs.contractCodes))))&&((this.medicalBenefits == rhs.medicalBenefits)||((this.medicalBenefits!= null)&&this.medicalBenefits.equals(rhs.medicalBenefits))))&&((this.costShareVariations == rhs.costShareVariations)||((this.costShareVariations!= null)&&this.costShareVariations.equals(rhs.costShareVariations))));
    }

}
