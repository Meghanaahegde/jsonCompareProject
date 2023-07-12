
package com.jsonproj.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "networkLevelCode",
    "networkLevelName",
    "networkTypeId",
    "networkType",
    "networkId",
    "networkName",
    "deductibleSingle",
    "deductibleFamily",
    "outOfPocketSingle",
    "outOfPocketFamily",
    "defaultCoinsurance",
    "accumulatorDedOopOptionId",
    "accumulatorDedOopOption",
    "defaultCopay",
    "enterpriseNetworkId"
})

public class Network {

    @JsonProperty("networkLevelCode")
    private String networkLevelCode;
    @JsonProperty("networkLevelName")
    private String networkLevelName;
    @JsonProperty("networkTypeId")
    private Integer networkTypeId;
    @JsonProperty("networkType")
    private String networkType;
    @JsonProperty("networkId")
    private Object networkId;
    @JsonProperty("networkName")
    private String networkName;
    @JsonProperty("deductibleSingle")
    private Integer deductibleSingle;
    @JsonProperty("deductibleFamily")
    private Integer deductibleFamily;
    @JsonProperty("outOfPocketSingle")
    private Integer outOfPocketSingle;
    @JsonProperty("outOfPocketFamily")
    private Integer outOfPocketFamily;
    @JsonProperty("defaultCoinsurance")
    private Float defaultCoinsurance;
    @JsonProperty("accumulatorDedOopOptionId")
    private Integer accumulatorDedOopOptionId;
    @JsonProperty("accumulatorDedOopOption")
    private String accumulatorDedOopOption;
    @JsonProperty("defaultCopay")
    private Integer defaultCopay;
    @JsonProperty("enterpriseNetworkId")
    private Object enterpriseNetworkId;

    @JsonProperty("networkLevelCode")
    public String getNetworkLevelCode() {
        return networkLevelCode;
    }

    @JsonProperty("networkLevelCode")
    public void setNetworkLevelCode(String networkLevelCode) {
        this.networkLevelCode = networkLevelCode;
    }

    @JsonProperty("networkLevelName")
    public String getNetworkLevelName() {
        return networkLevelName;
    }

    @JsonProperty("networkLevelName")
    public void setNetworkLevelName(String networkLevelName) {
        this.networkLevelName = networkLevelName;
    }

    @JsonProperty("networkTypeId")
    public Integer getNetworkTypeId() {
        return networkTypeId;
    }

    @JsonProperty("networkTypeId")
    public void setNetworkTypeId(Integer networkTypeId) {
        this.networkTypeId = networkTypeId;
    }

    @JsonProperty("networkType")
    public String getNetworkType() {
        return networkType;
    }

    @JsonProperty("networkType")
    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    @JsonProperty("networkId")
    public Object getNetworkId() {
        return networkId;
    }

    @JsonProperty("networkId")
    public void setNetworkId(Object networkId) {
        this.networkId = networkId;
    }

    @JsonProperty("networkName")
    public String getNetworkName() {
        return networkName;
    }

    @JsonProperty("networkName")
    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    @JsonProperty("deductibleSingle")
    public Integer getDeductibleSingle() {
        return deductibleSingle;
    }

    @JsonProperty("deductibleSingle")
    public void setDeductibleSingle(Integer deductibleSingle) {
        this.deductibleSingle = deductibleSingle;
    }

    @JsonProperty("deductibleFamily")
    public Integer getDeductibleFamily() {
        return deductibleFamily;
    }

    @JsonProperty("deductibleFamily")
    public void setDeductibleFamily(Integer deductibleFamily) {
        this.deductibleFamily = deductibleFamily;
    }

    @JsonProperty("outOfPocketSingle")
    public Integer getOutOfPocketSingle() {
        return outOfPocketSingle;
    }

    @JsonProperty("outOfPocketSingle")
    public void setOutOfPocketSingle(Integer outOfPocketSingle) {
        this.outOfPocketSingle = outOfPocketSingle;
    }

    @JsonProperty("outOfPocketFamily")
    public Integer getOutOfPocketFamily() {
        return outOfPocketFamily;
    }

    @JsonProperty("outOfPocketFamily")
    public void setOutOfPocketFamily(Integer outOfPocketFamily) {
        this.outOfPocketFamily = outOfPocketFamily;
    }

    @JsonProperty("defaultCoinsurance")
    public Float getDefaultCoinsurance() {
        return defaultCoinsurance;
    }

    @JsonProperty("defaultCoinsurance")
    public void setDefaultCoinsurance(Float defaultCoinsurance) {
        this.defaultCoinsurance = defaultCoinsurance;
    }

    @JsonProperty("accumulatorDedOopOptionId")
    public Integer getAccumulatorDedOopOptionId() {
        return accumulatorDedOopOptionId;
    }

    @JsonProperty("accumulatorDedOopOptionId")
    public void setAccumulatorDedOopOptionId(Integer accumulatorDedOopOptionId) {
        this.accumulatorDedOopOptionId = accumulatorDedOopOptionId;
    }

    @JsonProperty("accumulatorDedOopOption")
    public String getAccumulatorDedOopOption() {
        return accumulatorDedOopOption;
    }

    @JsonProperty("accumulatorDedOopOption")
    public void setAccumulatorDedOopOption(String accumulatorDedOopOption) {
        this.accumulatorDedOopOption = accumulatorDedOopOption;
    }

    @JsonProperty("defaultCopay")
    public Integer getDefaultCopay() {
        return defaultCopay;
    }

    @JsonProperty("defaultCopay")
    public void setDefaultCopay(Integer defaultCopay) {
        this.defaultCopay = defaultCopay;
    }

    @JsonProperty("enterpriseNetworkId")
    public Object getEnterpriseNetworkId() {
        return enterpriseNetworkId;
    }

    @JsonProperty("enterpriseNetworkId")
    public void setEnterpriseNetworkId(Object enterpriseNetworkId) {
        this.enterpriseNetworkId = enterpriseNetworkId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Network.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("networkLevelCode");
        sb.append('=');
        sb.append(((this.networkLevelCode == null)?"<null>":this.networkLevelCode));
        sb.append(',');
        sb.append("networkLevelName");
        sb.append('=');
        sb.append(((this.networkLevelName == null)?"<null>":this.networkLevelName));
        sb.append(',');
        sb.append("networkTypeId");
        sb.append('=');
        sb.append(((this.networkTypeId == null)?"<null>":this.networkTypeId));
        sb.append(',');
        sb.append("networkType");
        sb.append('=');
        sb.append(((this.networkType == null)?"<null>":this.networkType));
        sb.append(',');
        sb.append("networkId");
        sb.append('=');
        sb.append(((this.networkId == null)?"<null>":this.networkId));
        sb.append(',');
        sb.append("networkName");
        sb.append('=');
        sb.append(((this.networkName == null)?"<null>":this.networkName));
        sb.append(',');
        sb.append("deductibleSingle");
        sb.append('=');
        sb.append(((this.deductibleSingle == null)?"<null>":this.deductibleSingle));
        sb.append(',');
        sb.append("deductibleFamily");
        sb.append('=');
        sb.append(((this.deductibleFamily == null)?"<null>":this.deductibleFamily));
        sb.append(',');
        sb.append("outOfPocketSingle");
        sb.append('=');
        sb.append(((this.outOfPocketSingle == null)?"<null>":this.outOfPocketSingle));
        sb.append(',');
        sb.append("outOfPocketFamily");
        sb.append('=');
        sb.append(((this.outOfPocketFamily == null)?"<null>":this.outOfPocketFamily));
        sb.append(',');
        sb.append("defaultCoinsurance");
        sb.append('=');
        sb.append(((this.defaultCoinsurance == null)?"<null>":this.defaultCoinsurance));
        sb.append(',');
        sb.append("accumulatorDedOopOptionId");
        sb.append('=');
        sb.append(((this.accumulatorDedOopOptionId == null)?"<null>":this.accumulatorDedOopOptionId));
        sb.append(',');
        sb.append("accumulatorDedOopOption");
        sb.append('=');
        sb.append(((this.accumulatorDedOopOption == null)?"<null>":this.accumulatorDedOopOption));
        sb.append(',');
        sb.append("defaultCopay");
        sb.append('=');
        sb.append(((this.defaultCopay == null)?"<null>":this.defaultCopay));
        sb.append(',');
        sb.append("enterpriseNetworkId");
        sb.append('=');
        sb.append(((this.enterpriseNetworkId == null)?"<null>":this.enterpriseNetworkId));
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
        result = ((result* 31)+((this.accumulatorDedOopOptionId == null)? 0 :this.accumulatorDedOopOptionId.hashCode()));
        result = ((result* 31)+((this.outOfPocketFamily == null)? 0 :this.outOfPocketFamily.hashCode()));
        result = ((result* 31)+((this.networkName == null)? 0 :this.networkName.hashCode()));
        result = ((result* 31)+((this.networkTypeId == null)? 0 :this.networkTypeId.hashCode()));
        result = ((result* 31)+((this.defaultCopay == null)? 0 :this.defaultCopay.hashCode()));
        result = ((result* 31)+((this.networkLevelCode == null)? 0 :this.networkLevelCode.hashCode()));
        result = ((result* 31)+((this.networkLevelName == null)? 0 :this.networkLevelName.hashCode()));
        result = ((result* 31)+((this.accumulatorDedOopOption == null)? 0 :this.accumulatorDedOopOption.hashCode()));
        result = ((result* 31)+((this.enterpriseNetworkId == null)? 0 :this.enterpriseNetworkId.hashCode()));
        result = ((result* 31)+((this.networkId == null)? 0 :this.networkId.hashCode()));
        result = ((result* 31)+((this.deductibleSingle == null)? 0 :this.deductibleSingle.hashCode()));
        result = ((result* 31)+((this.outOfPocketSingle == null)? 0 :this.outOfPocketSingle.hashCode()));
        result = ((result* 31)+((this.networkType == null)? 0 :this.networkType.hashCode()));
        result = ((result* 31)+((this.deductibleFamily == null)? 0 :this.deductibleFamily.hashCode()));
        result = ((result* 31)+((this.defaultCoinsurance == null)? 0 :this.defaultCoinsurance.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Network) == false) {
            return false;
        }
        Network rhs = ((Network) other);
        return ((((((((((((((((this.accumulatorDedOopOptionId == rhs.accumulatorDedOopOptionId)||((this.accumulatorDedOopOptionId!= null)&&this.accumulatorDedOopOptionId.equals(rhs.accumulatorDedOopOptionId)))&&((this.outOfPocketFamily == rhs.outOfPocketFamily)||((this.outOfPocketFamily!= null)&&this.outOfPocketFamily.equals(rhs.outOfPocketFamily))))&&((this.networkName == rhs.networkName)||((this.networkName!= null)&&this.networkName.equals(rhs.networkName))))&&((this.networkTypeId == rhs.networkTypeId)||((this.networkTypeId!= null)&&this.networkTypeId.equals(rhs.networkTypeId))))&&((this.defaultCopay == rhs.defaultCopay)||((this.defaultCopay!= null)&&this.defaultCopay.equals(rhs.defaultCopay))))&&((this.networkLevelCode == rhs.networkLevelCode)||((this.networkLevelCode!= null)&&this.networkLevelCode.equals(rhs.networkLevelCode))))&&((this.networkLevelName == rhs.networkLevelName)||((this.networkLevelName!= null)&&this.networkLevelName.equals(rhs.networkLevelName))))&&((this.accumulatorDedOopOption == rhs.accumulatorDedOopOption)||((this.accumulatorDedOopOption!= null)&&this.accumulatorDedOopOption.equals(rhs.accumulatorDedOopOption))))&&((this.enterpriseNetworkId == rhs.enterpriseNetworkId)||((this.enterpriseNetworkId!= null)&&this.enterpriseNetworkId.equals(rhs.enterpriseNetworkId))))&&((this.networkId == rhs.networkId)||((this.networkId!= null)&&this.networkId.equals(rhs.networkId))))&&((this.deductibleSingle == rhs.deductibleSingle)||((this.deductibleSingle!= null)&&this.deductibleSingle.equals(rhs.deductibleSingle))))&&((this.outOfPocketSingle == rhs.outOfPocketSingle)||((this.outOfPocketSingle!= null)&&this.outOfPocketSingle.equals(rhs.outOfPocketSingle))))&&((this.networkType == rhs.networkType)||((this.networkType!= null)&&this.networkType.equals(rhs.networkType))))&&((this.deductibleFamily == rhs.deductibleFamily)||((this.deductibleFamily!= null)&&this.deductibleFamily.equals(rhs.deductibleFamily))))&&((this.defaultCoinsurance == rhs.defaultCoinsurance)||((this.defaultCoinsurance!= null)&&this.defaultCoinsurance.equals(rhs.defaultCoinsurance))));
    }

}
