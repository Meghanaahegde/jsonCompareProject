
package com.jsonproj.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "partneredProvider"
})

public class DigitalEnablementPartner {

    @JsonProperty("partneredProvider")
    private List<PartneredProvider> partneredProvider;

    @JsonProperty("partneredProvider")
    public List<PartneredProvider> getPartneredProvider() {
        return partneredProvider;
    }

    @JsonProperty("partneredProvider")
    public void setPartneredProvider(List<PartneredProvider> partneredProvider) {
        this.partneredProvider = partneredProvider;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DigitalEnablementPartner.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("partneredProvider");
        sb.append('=');
        sb.append(((this.partneredProvider == null)?"<null>":this.partneredProvider));
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
        result = ((result* 31)+((this.partneredProvider == null)? 0 :this.partneredProvider.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DigitalEnablementPartner) == false) {
            return false;
        }
        DigitalEnablementPartner rhs = ((DigitalEnablementPartner) other);
        return ((this.partneredProvider == rhs.partneredProvider)||((this.partneredProvider!= null)&&this.partneredProvider.equals(rhs.partneredProvider)));
    }

}
