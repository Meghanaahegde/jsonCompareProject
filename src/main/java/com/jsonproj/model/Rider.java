
package com.jsonproj.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "riderId",
    "riderName"
})

public class Rider {

    @JsonProperty("riderId")
    private Object riderId;
    @JsonProperty("riderName")
    private Object riderName;

    @JsonProperty("riderId")
    public Object getRiderId() {
        return riderId;
    }

    @JsonProperty("riderId")
    public void setRiderId(Object riderId) {
        this.riderId = riderId;
    }

    @JsonProperty("riderName")
    public Object getRiderName() {
        return riderName;
    }

    @JsonProperty("riderName")
    public void setRiderName(Object riderName) {
        this.riderName = riderName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rider.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("riderId");
        sb.append('=');
        sb.append(((this.riderId == null)?"<null>":this.riderId));
        sb.append(',');
        sb.append("riderName");
        sb.append('=');
        sb.append(((this.riderName == null)?"<null>":this.riderName));
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
        result = ((result* 31)+((this.riderId == null)? 0 :this.riderId.hashCode()));
        result = ((result* 31)+((this.riderName == null)? 0 :this.riderName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rider) == false) {
            return false;
        }
        Rider rhs = ((Rider) other);
        return (((this.riderId == rhs.riderId)||((this.riderId!= null)&&this.riderId.equals(rhs.riderId)))&&((this.riderName == rhs.riderName)||((this.riderName!= null)&&this.riderName.equals(rhs.riderName))));
    }

}
