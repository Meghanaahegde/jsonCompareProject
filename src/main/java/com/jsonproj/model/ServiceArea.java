
package com.jsonproj.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "serviceAreaId",
    "serviceAreaName",
    "hiosComponentId",
    "variantContractCodeServiceAreaId"
})

public class ServiceArea {

    @JsonProperty("serviceAreaId")
    private Integer serviceAreaId;
    @JsonProperty("serviceAreaName")
    private String serviceAreaName;
    @JsonProperty("hiosComponentId")
    private String hiosComponentId;
    @JsonProperty("variantContractCodeServiceAreaId")
    private Object variantContractCodeServiceAreaId;

    @JsonProperty("serviceAreaId")
    public Integer getServiceAreaId() {
        return serviceAreaId;
    }

    @JsonProperty("serviceAreaId")
    public void setServiceAreaId(Integer serviceAreaId) {
        this.serviceAreaId = serviceAreaId;
    }

    @JsonProperty("serviceAreaName")
    public String getServiceAreaName() {
        return serviceAreaName;
    }

    @JsonProperty("serviceAreaName")
    public void setServiceAreaName(String serviceAreaName) {
        this.serviceAreaName = serviceAreaName;
    }

    @JsonProperty("hiosComponentId")
    public String getHiosComponentId() {
        return hiosComponentId;
    }

    @JsonProperty("hiosComponentId")
    public void setHiosComponentId(String hiosComponentId) {
        this.hiosComponentId = hiosComponentId;
    }

    @JsonProperty("variantContractCodeServiceAreaId")
    public Object getVariantContractCodeServiceAreaId() {
        return variantContractCodeServiceAreaId;
    }

    @JsonProperty("variantContractCodeServiceAreaId")
    public void setVariantContractCodeServiceAreaId(Object variantContractCodeServiceAreaId) {
        this.variantContractCodeServiceAreaId = variantContractCodeServiceAreaId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServiceArea.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("serviceAreaId");
        sb.append('=');
        sb.append(((this.serviceAreaId == null)?"<null>":this.serviceAreaId));
        sb.append(',');
        sb.append("serviceAreaName");
        sb.append('=');
        sb.append(((this.serviceAreaName == null)?"<null>":this.serviceAreaName));
        sb.append(',');
        sb.append("hiosComponentId");
        sb.append('=');
        sb.append(((this.hiosComponentId == null)?"<null>":this.hiosComponentId));
        sb.append(',');
        sb.append("variantContractCodeServiceAreaId");
        sb.append('=');
        sb.append(((this.variantContractCodeServiceAreaId == null)?"<null>":this.variantContractCodeServiceAreaId));
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
        result = ((result* 31)+((this.serviceAreaId == null)? 0 :this.serviceAreaId.hashCode()));
        result = ((result* 31)+((this.serviceAreaName == null)? 0 :this.serviceAreaName.hashCode()));
        result = ((result* 31)+((this.hiosComponentId == null)? 0 :this.hiosComponentId.hashCode()));
        result = ((result* 31)+((this.variantContractCodeServiceAreaId == null)? 0 :this.variantContractCodeServiceAreaId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceArea) == false) {
            return false;
        }
        ServiceArea rhs = ((ServiceArea) other);
        return (((((this.serviceAreaId == rhs.serviceAreaId)||((this.serviceAreaId!= null)&&this.serviceAreaId.equals(rhs.serviceAreaId)))&&((this.serviceAreaName == rhs.serviceAreaName)||((this.serviceAreaName!= null)&&this.serviceAreaName.equals(rhs.serviceAreaName))))&&((this.hiosComponentId == rhs.hiosComponentId)||((this.hiosComponentId!= null)&&this.hiosComponentId.equals(rhs.hiosComponentId))))&&((this.variantContractCodeServiceAreaId == rhs.variantContractCodeServiceAreaId)||((this.variantContractCodeServiceAreaId!= null)&&this.variantContractCodeServiceAreaId.equals(rhs.variantContractCodeServiceAreaId))));
    }

}
