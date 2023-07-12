
package com.jsonproj.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "contractCode",
    "alternateId",
    "customPlanFlag",
    "effectiveDate",
    "dateChanged",
    "portfolioYear",
    "adminstrationCodeType",
    "adminstrationCodeDescription",
    "hpcc",
    "pcpSelectionRequiredId",
    "pcpReferralRequiredFlag",
    "pcpSelectionRequiredDescription",
    "productId",
    "marketSegmentCode",
    "marketSegment",
    "state",
    "stateCode",
    "productName",
    "riderContractCodeId",
    "riders",
    "healthWellnessInfo",
    "serviceAreas",
    "clinicalInfo",
    "productProfileAttributes",
    "enhancedMemberServiceName",
    "enhancedMemberServiceCode",
    "digitalEnablementPartners"
})

public class ContractCode {

    @JsonProperty("contractCode")
    private String contractCode;
    @JsonProperty("alternateId")
    private Object alternateId;
    @JsonProperty("customPlanFlag")
    private String customPlanFlag;
    @JsonProperty("effectiveDate")
    private String effectiveDate;
    @JsonProperty("dateChanged")
    private String dateChanged;
    @JsonProperty("portfolioYear")
    private Integer portfolioYear;
    @JsonProperty("adminstrationCodeType")
    private String adminstrationCodeType;
    @JsonProperty("adminstrationCodeDescription")
    private String adminstrationCodeDescription;
    @JsonProperty("hpcc")
    private String hpcc;
    @JsonProperty("pcpSelectionRequiredId")
    private Integer pcpSelectionRequiredId;
    @JsonProperty("pcpReferralRequiredFlag")
    private String pcpReferralRequiredFlag;
    @JsonProperty("pcpSelectionRequiredDescription")
    private String pcpSelectionRequiredDescription;
    @JsonProperty("productId")
    private Integer productId;
    @JsonProperty("marketSegmentCode")
    private String marketSegmentCode;
    @JsonProperty("marketSegment")
    private String marketSegment;
    @JsonProperty("state")
    private String state;
    @JsonProperty("stateCode")
    private String stateCode;
    @JsonProperty("productName")
    private String productName;
    @JsonProperty("riderContractCodeId")
    private Object riderContractCodeId;
    @JsonProperty("riders")
    private List<Rider> riders;
    @JsonProperty("healthWellnessInfo")
    private Object healthWellnessInfo;
    @JsonProperty("serviceAreas")
    private List<ServiceArea> serviceAreas;
    @JsonProperty("clinicalInfo")
    private Object clinicalInfo;
    @JsonProperty("productProfileAttributes")
    private Object productProfileAttributes;
    @JsonProperty("enhancedMemberServiceName")
    private String enhancedMemberServiceName;
    @JsonProperty("enhancedMemberServiceCode")
    private String enhancedMemberServiceCode;
    @JsonProperty("digitalEnablementPartners")
    private List<DigitalEnablementPartner> digitalEnablementPartners;

    @JsonProperty("contractCode")
    public String getContractCode() {
        return contractCode;
    }

    @JsonProperty("contractCode")
    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    @JsonProperty("alternateId")
    public Object getAlternateId() {
        return alternateId;
    }

    @JsonProperty("alternateId")
    public void setAlternateId(Object alternateId) {
        this.alternateId = alternateId;
    }

    @JsonProperty("customPlanFlag")
    public String getCustomPlanFlag() {
        return customPlanFlag;
    }

    @JsonProperty("customPlanFlag")
    public void setCustomPlanFlag(String customPlanFlag) {
        this.customPlanFlag = customPlanFlag;
    }

    @JsonProperty("effectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("dateChanged")
    public String getDateChanged() {
        return dateChanged;
    }

    @JsonProperty("dateChanged")
    public void setDateChanged(String dateChanged) {
        this.dateChanged = dateChanged;
    }

    @JsonProperty("portfolioYear")
    public Integer getPortfolioYear() {
        return portfolioYear;
    }

    @JsonProperty("portfolioYear")
    public void setPortfolioYear(Integer portfolioYear) {
        this.portfolioYear = portfolioYear;
    }

    @JsonProperty("adminstrationCodeType")
    public String getAdminstrationCodeType() {
        return adminstrationCodeType;
    }

    @JsonProperty("adminstrationCodeType")
    public void setAdminstrationCodeType(String adminstrationCodeType) {
        this.adminstrationCodeType = adminstrationCodeType;
    }

    @JsonProperty("adminstrationCodeDescription")
    public String getAdminstrationCodeDescription() {
        return adminstrationCodeDescription;
    }

    @JsonProperty("adminstrationCodeDescription")
    public void setAdminstrationCodeDescription(String adminstrationCodeDescription) {
        this.adminstrationCodeDescription = adminstrationCodeDescription;
    }

    @JsonProperty("hpcc")
    public String getHpcc() {
        return hpcc;
    }

    @JsonProperty("hpcc")
    public void setHpcc(String hpcc) {
        this.hpcc = hpcc;
    }

    @JsonProperty("pcpSelectionRequiredId")
    public Integer getPcpSelectionRequiredId() {
        return pcpSelectionRequiredId;
    }

    @JsonProperty("pcpSelectionRequiredId")
    public void setPcpSelectionRequiredId(Integer pcpSelectionRequiredId) {
        this.pcpSelectionRequiredId = pcpSelectionRequiredId;
    }

    @JsonProperty("pcpReferralRequiredFlag")
    public String getPcpReferralRequiredFlag() {
        return pcpReferralRequiredFlag;
    }

    @JsonProperty("pcpReferralRequiredFlag")
    public void setPcpReferralRequiredFlag(String pcpReferralRequiredFlag) {
        this.pcpReferralRequiredFlag = pcpReferralRequiredFlag;
    }

    @JsonProperty("pcpSelectionRequiredDescription")
    public String getPcpSelectionRequiredDescription() {
        return pcpSelectionRequiredDescription;
    }

    @JsonProperty("pcpSelectionRequiredDescription")
    public void setPcpSelectionRequiredDescription(String pcpSelectionRequiredDescription) {
        this.pcpSelectionRequiredDescription = pcpSelectionRequiredDescription;
    }

    @JsonProperty("productId")
    public Integer getProductId() {
        return productId;
    }

    @JsonProperty("productId")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @JsonProperty("marketSegmentCode")
    public String getMarketSegmentCode() {
        return marketSegmentCode;
    }

    @JsonProperty("marketSegmentCode")
    public void setMarketSegmentCode(String marketSegmentCode) {
        this.marketSegmentCode = marketSegmentCode;
    }

    @JsonProperty("marketSegment")
    public String getMarketSegment() {
        return marketSegment;
    }

    @JsonProperty("marketSegment")
    public void setMarketSegment(String marketSegment) {
        this.marketSegment = marketSegment;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("stateCode")
    public String getStateCode() {
        return stateCode;
    }

    @JsonProperty("stateCode")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @JsonProperty("productName")
    public String getProductName() {
        return productName;
    }

    @JsonProperty("productName")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @JsonProperty("riderContractCodeId")
    public Object getRiderContractCodeId() {
        return riderContractCodeId;
    }

    @JsonProperty("riderContractCodeId")
    public void setRiderContractCodeId(Object riderContractCodeId) {
        this.riderContractCodeId = riderContractCodeId;
    }

    @JsonProperty("riders")
    public List<Rider> getRiders() {
        return riders;
    }

    @JsonProperty("riders")
    public void setRiders(List<Rider> riders) {
        this.riders = riders;
    }

    @JsonProperty("healthWellnessInfo")
    public Object getHealthWellnessInfo() {
        return healthWellnessInfo;
    }

    @JsonProperty("healthWellnessInfo")
    public void setHealthWellnessInfo(Object healthWellnessInfo) {
        this.healthWellnessInfo = healthWellnessInfo;
    }

    @JsonProperty("serviceAreas")
    public List<ServiceArea> getServiceAreas() {
        return serviceAreas;
    }

    @JsonProperty("serviceAreas")
    public void setServiceAreas(List<ServiceArea> serviceAreas) {
        this.serviceAreas = serviceAreas;
    }

    @JsonProperty("clinicalInfo")
    public Object getClinicalInfo() {
        return clinicalInfo;
    }

    @JsonProperty("clinicalInfo")
    public void setClinicalInfo(Object clinicalInfo) {
        this.clinicalInfo = clinicalInfo;
    }

    @JsonProperty("productProfileAttributes")
    public Object getProductProfileAttributes() {
        return productProfileAttributes;
    }

    @JsonProperty("productProfileAttributes")
    public void setProductProfileAttributes(Object productProfileAttributes) {
        this.productProfileAttributes = productProfileAttributes;
    }

    @JsonProperty("enhancedMemberServiceName")
    public String getEnhancedMemberServiceName() {
        return enhancedMemberServiceName;
    }

    @JsonProperty("enhancedMemberServiceName")
    public void setEnhancedMemberServiceName(String enhancedMemberServiceName) {
        this.enhancedMemberServiceName = enhancedMemberServiceName;
    }

    @JsonProperty("enhancedMemberServiceCode")
    public String getEnhancedMemberServiceCode() {
        return enhancedMemberServiceCode;
    }

    @JsonProperty("enhancedMemberServiceCode")
    public void setEnhancedMemberServiceCode(String enhancedMemberServiceCode) {
        this.enhancedMemberServiceCode = enhancedMemberServiceCode;
    }

    @JsonProperty("digitalEnablementPartners")
    public List<DigitalEnablementPartner> getDigitalEnablementPartners() {
        return digitalEnablementPartners;
    }

    @JsonProperty("digitalEnablementPartners")
    public void setDigitalEnablementPartners(List<DigitalEnablementPartner> digitalEnablementPartners) {
        this.digitalEnablementPartners = digitalEnablementPartners;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContractCode.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("contractCode");
        sb.append('=');
        sb.append(((this.contractCode == null)?"<null>":this.contractCode));
        sb.append(',');
        sb.append("alternateId");
        sb.append('=');
        sb.append(((this.alternateId == null)?"<null>":this.alternateId));
        sb.append(',');
        sb.append("customPlanFlag");
        sb.append('=');
        sb.append(((this.customPlanFlag == null)?"<null>":this.customPlanFlag));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("dateChanged");
        sb.append('=');
        sb.append(((this.dateChanged == null)?"<null>":this.dateChanged));
        sb.append(',');
        sb.append("portfolioYear");
        sb.append('=');
        sb.append(((this.portfolioYear == null)?"<null>":this.portfolioYear));
        sb.append(',');
        sb.append("adminstrationCodeType");
        sb.append('=');
        sb.append(((this.adminstrationCodeType == null)?"<null>":this.adminstrationCodeType));
        sb.append(',');
        sb.append("adminstrationCodeDescription");
        sb.append('=');
        sb.append(((this.adminstrationCodeDescription == null)?"<null>":this.adminstrationCodeDescription));
        sb.append(',');
        sb.append("hpcc");
        sb.append('=');
        sb.append(((this.hpcc == null)?"<null>":this.hpcc));
        sb.append(',');
        sb.append("pcpSelectionRequiredId");
        sb.append('=');
        sb.append(((this.pcpSelectionRequiredId == null)?"<null>":this.pcpSelectionRequiredId));
        sb.append(',');
        sb.append("pcpReferralRequiredFlag");
        sb.append('=');
        sb.append(((this.pcpReferralRequiredFlag == null)?"<null>":this.pcpReferralRequiredFlag));
        sb.append(',');
        sb.append("pcpSelectionRequiredDescription");
        sb.append('=');
        sb.append(((this.pcpSelectionRequiredDescription == null)?"<null>":this.pcpSelectionRequiredDescription));
        sb.append(',');
        sb.append("productId");
        sb.append('=');
        sb.append(((this.productId == null)?"<null>":this.productId));
        sb.append(',');
        sb.append("marketSegmentCode");
        sb.append('=');
        sb.append(((this.marketSegmentCode == null)?"<null>":this.marketSegmentCode));
        sb.append(',');
        sb.append("marketSegment");
        sb.append('=');
        sb.append(((this.marketSegment == null)?"<null>":this.marketSegment));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("stateCode");
        sb.append('=');
        sb.append(((this.stateCode == null)?"<null>":this.stateCode));
        sb.append(',');
        sb.append("productName");
        sb.append('=');
        sb.append(((this.productName == null)?"<null>":this.productName));
        sb.append(',');
        sb.append("riderContractCodeId");
        sb.append('=');
        sb.append(((this.riderContractCodeId == null)?"<null>":this.riderContractCodeId));
        sb.append(',');
        sb.append("riders");
        sb.append('=');
        sb.append(((this.riders == null)?"<null>":this.riders));
        sb.append(',');
        sb.append("healthWellnessInfo");
        sb.append('=');
        sb.append(((this.healthWellnessInfo == null)?"<null>":this.healthWellnessInfo));
        sb.append(',');
        sb.append("serviceAreas");
        sb.append('=');
        sb.append(((this.serviceAreas == null)?"<null>":this.serviceAreas));
        sb.append(',');
        sb.append("clinicalInfo");
        sb.append('=');
        sb.append(((this.clinicalInfo == null)?"<null>":this.clinicalInfo));
        sb.append(',');
        sb.append("productProfileAttributes");
        sb.append('=');
        sb.append(((this.productProfileAttributes == null)?"<null>":this.productProfileAttributes));
        sb.append(',');
        sb.append("enhancedMemberServiceName");
        sb.append('=');
        sb.append(((this.enhancedMemberServiceName == null)?"<null>":this.enhancedMemberServiceName));
        sb.append(',');
        sb.append("enhancedMemberServiceCode");
        sb.append('=');
        sb.append(((this.enhancedMemberServiceCode == null)?"<null>":this.enhancedMemberServiceCode));
        sb.append(',');
        sb.append("digitalEnablementPartners");
        sb.append('=');
        sb.append(((this.digitalEnablementPartners == null)?"<null>":this.digitalEnablementPartners));
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
        result = ((result* 31)+((this.customPlanFlag == null)? 0 :this.customPlanFlag.hashCode()));
        result = ((result* 31)+((this.riders == null)? 0 :this.riders.hashCode()));
        result = ((result* 31)+((this.pcpSelectionRequiredId == null)? 0 :this.pcpSelectionRequiredId.hashCode()));
        result = ((result* 31)+((this.adminstrationCodeType == null)? 0 :this.adminstrationCodeType.hashCode()));
        result = ((result* 31)+((this.productName == null)? 0 :this.productName.hashCode()));
        result = ((result* 31)+((this.pcpReferralRequiredFlag == null)? 0 :this.pcpReferralRequiredFlag.hashCode()));
        result = ((result* 31)+((this.clinicalInfo == null)? 0 :this.clinicalInfo.hashCode()));
        result = ((result* 31)+((this.portfolioYear == null)? 0 :this.portfolioYear.hashCode()));
        result = ((result* 31)+((this.adminstrationCodeDescription == null)? 0 :this.adminstrationCodeDescription.hashCode()));
        result = ((result* 31)+((this.hpcc == null)? 0 :this.hpcc.hashCode()));
        result = ((result* 31)+((this.enhancedMemberServiceName == null)? 0 :this.enhancedMemberServiceName.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.productProfileAttributes == null)? 0 :this.productProfileAttributes.hashCode()));
        result = ((result* 31)+((this.marketSegment == null)? 0 :this.marketSegment.hashCode()));
        result = ((result* 31)+((this.serviceAreas == null)? 0 :this.serviceAreas.hashCode()));
        result = ((result* 31)+((this.dateChanged == null)? 0 :this.dateChanged.hashCode()));
        result = ((result* 31)+((this.marketSegmentCode == null)? 0 :this.marketSegmentCode.hashCode()));
        result = ((result* 31)+((this.productId == null)? 0 :this.productId.hashCode()));
        result = ((result* 31)+((this.alternateId == null)? 0 :this.alternateId.hashCode()));
        result = ((result* 31)+((this.enhancedMemberServiceCode == null)? 0 :this.enhancedMemberServiceCode.hashCode()));
        result = ((result* 31)+((this.digitalEnablementPartners == null)? 0 :this.digitalEnablementPartners.hashCode()));
        result = ((result* 31)+((this.pcpSelectionRequiredDescription == null)? 0 :this.pcpSelectionRequiredDescription.hashCode()));
        result = ((result* 31)+((this.riderContractCodeId == null)? 0 :this.riderContractCodeId.hashCode()));
        result = ((result* 31)+((this.healthWellnessInfo == null)? 0 :this.healthWellnessInfo.hashCode()));
        result = ((result* 31)+((this.stateCode == null)? 0 :this.stateCode.hashCode()));
        result = ((result* 31)+((this.contractCode == null)? 0 :this.contractCode.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContractCode) == false) {
            return false;
        }
        ContractCode rhs = ((ContractCode) other);
        return ((((((((((((((((((((((((((((this.customPlanFlag == rhs.customPlanFlag)||((this.customPlanFlag!= null)&&this.customPlanFlag.equals(rhs.customPlanFlag)))&&((this.riders == rhs.riders)||((this.riders!= null)&&this.riders.equals(rhs.riders))))&&((this.pcpSelectionRequiredId == rhs.pcpSelectionRequiredId)||((this.pcpSelectionRequiredId!= null)&&this.pcpSelectionRequiredId.equals(rhs.pcpSelectionRequiredId))))&&((this.adminstrationCodeType == rhs.adminstrationCodeType)||((this.adminstrationCodeType!= null)&&this.adminstrationCodeType.equals(rhs.adminstrationCodeType))))&&((this.productName == rhs.productName)||((this.productName!= null)&&this.productName.equals(rhs.productName))))&&((this.pcpReferralRequiredFlag == rhs.pcpReferralRequiredFlag)||((this.pcpReferralRequiredFlag!= null)&&this.pcpReferralRequiredFlag.equals(rhs.pcpReferralRequiredFlag))))&&((this.clinicalInfo == rhs.clinicalInfo)||((this.clinicalInfo!= null)&&this.clinicalInfo.equals(rhs.clinicalInfo))))&&((this.portfolioYear == rhs.portfolioYear)||((this.portfolioYear!= null)&&this.portfolioYear.equals(rhs.portfolioYear))))&&((this.adminstrationCodeDescription == rhs.adminstrationCodeDescription)||((this.adminstrationCodeDescription!= null)&&this.adminstrationCodeDescription.equals(rhs.adminstrationCodeDescription))))&&((this.hpcc == rhs.hpcc)||((this.hpcc!= null)&&this.hpcc.equals(rhs.hpcc))))&&((this.enhancedMemberServiceName == rhs.enhancedMemberServiceName)||((this.enhancedMemberServiceName!= null)&&this.enhancedMemberServiceName.equals(rhs.enhancedMemberServiceName))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.productProfileAttributes == rhs.productProfileAttributes)||((this.productProfileAttributes!= null)&&this.productProfileAttributes.equals(rhs.productProfileAttributes))))&&((this.marketSegment == rhs.marketSegment)||((this.marketSegment!= null)&&this.marketSegment.equals(rhs.marketSegment))))&&((this.serviceAreas == rhs.serviceAreas)||((this.serviceAreas!= null)&&this.serviceAreas.equals(rhs.serviceAreas))))&&((this.dateChanged == rhs.dateChanged)||((this.dateChanged!= null)&&this.dateChanged.equals(rhs.dateChanged))))&&((this.marketSegmentCode == rhs.marketSegmentCode)||((this.marketSegmentCode!= null)&&this.marketSegmentCode.equals(rhs.marketSegmentCode))))&&((this.productId == rhs.productId)||((this.productId!= null)&&this.productId.equals(rhs.productId))))&&((this.alternateId == rhs.alternateId)||((this.alternateId!= null)&&this.alternateId.equals(rhs.alternateId))))&&((this.enhancedMemberServiceCode == rhs.enhancedMemberServiceCode)||((this.enhancedMemberServiceCode!= null)&&this.enhancedMemberServiceCode.equals(rhs.enhancedMemberServiceCode))))&&((this.digitalEnablementPartners == rhs.digitalEnablementPartners)||((this.digitalEnablementPartners!= null)&&this.digitalEnablementPartners.equals(rhs.digitalEnablementPartners))))&&((this.pcpSelectionRequiredDescription == rhs.pcpSelectionRequiredDescription)||((this.pcpSelectionRequiredDescription!= null)&&this.pcpSelectionRequiredDescription.equals(rhs.pcpSelectionRequiredDescription))))&&((this.riderContractCodeId == rhs.riderContractCodeId)||((this.riderContractCodeId!= null)&&this.riderContractCodeId.equals(rhs.riderContractCodeId))))&&((this.healthWellnessInfo == rhs.healthWellnessInfo)||((this.healthWellnessInfo!= null)&&this.healthWellnessInfo.equals(rhs.healthWellnessInfo))))&&((this.stateCode == rhs.stateCode)||((this.stateCode!= null)&&this.stateCode.equals(rhs.stateCode))))&&((this.contractCode == rhs.contractCode)||((this.contractCode!= null)&&this.contractCode.equals(rhs.contractCode))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))));
    }

}
