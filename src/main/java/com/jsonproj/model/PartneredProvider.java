
package com.jsonproj.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;



@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "partnerName",
    "experienceAvailableCode",
    "experienceAvailableDescription",
    "partnerCode"
})

public class PartneredProvider {

    @JsonProperty("partnerName")
    private String partnerName;
    @JsonProperty("experienceAvailableCode")
    private String experienceAvailableCode;
    @JsonProperty("experienceAvailableDescription")
    private String experienceAvailableDescription;
    @JsonProperty("partnerCode")
    private String partnerCode;

    @JsonProperty("partnerName")
    public String getPartnerName() {
        return partnerName;
    }

    @JsonProperty("partnerName")
    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    @JsonProperty("experienceAvailableCode")
    public String getExperienceAvailableCode() {
        return experienceAvailableCode;
    }

    @JsonProperty("experienceAvailableCode")
    public void setExperienceAvailableCode(String experienceAvailableCode) {
        this.experienceAvailableCode = experienceAvailableCode;
    }

    @JsonProperty("experienceAvailableDescription")
    public String getExperienceAvailableDescription() {
        return experienceAvailableDescription;
    }

    @JsonProperty("experienceAvailableDescription")
    public void setExperienceAvailableDescription(String experienceAvailableDescription) {
        this.experienceAvailableDescription = experienceAvailableDescription;
    }

    @JsonProperty("partnerCode")
    public String getPartnerCode() {
        return partnerCode;
    }

    @JsonProperty("partnerCode")
    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PartneredProvider.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("partnerName");
        sb.append('=');
        sb.append(((this.partnerName == null)?"<null>":this.partnerName));
        sb.append(',');
        sb.append("experienceAvailableCode");
        sb.append('=');
        sb.append(((this.experienceAvailableCode == null)?"<null>":this.experienceAvailableCode));
        sb.append(',');
        sb.append("experienceAvailableDescription");
        sb.append('=');
        sb.append(((this.experienceAvailableDescription == null)?"<null>":this.experienceAvailableDescription));
        sb.append(',');
        sb.append("partnerCode");
        sb.append('=');
        sb.append(((this.partnerCode == null)?"<null>":this.partnerCode));
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
        result = ((result* 31)+((this.experienceAvailableCode == null)? 0 :this.experienceAvailableCode.hashCode()));
        result = ((result* 31)+((this.partnerCode == null)? 0 :this.partnerCode.hashCode()));
        result = ((result* 31)+((this.partnerName == null)? 0 :this.partnerName.hashCode()));
        result = ((result* 31)+((this.experienceAvailableDescription == null)? 0 :this.experienceAvailableDescription.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PartneredProvider) == false) {
            return false;
        }
        PartneredProvider rhs = ((PartneredProvider) other);
        return (((((this.experienceAvailableCode == rhs.experienceAvailableCode)||((this.experienceAvailableCode!= null)&&this.experienceAvailableCode.equals(rhs.experienceAvailableCode)))&&((this.partnerCode == rhs.partnerCode)||((this.partnerCode!= null)&&this.partnerCode.equals(rhs.partnerCode))))&&((this.partnerName == rhs.partnerName)||((this.partnerName!= null)&&this.partnerName.equals(rhs.partnerName))))&&((this.experienceAvailableDescription == rhs.experienceAvailableDescription)||((this.experienceAvailableDescription!= null)&&this.experienceAvailableDescription.equals(rhs.experienceAvailableDescription))));
    }

}
