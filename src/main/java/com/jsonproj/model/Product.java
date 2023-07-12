
package com.jsonproj.model;


import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sourceProductConfigSystem",
    "$schema",
    "version",
    "keys",
    "publishAttributes",
    "productInfo"
})

public class Product {

    @JsonProperty("sourceProductConfigSystem")
    private String sourceProductConfigSystem;
    @JsonProperty("$schema")
    private String $schema;
    @JsonProperty("version")
    private String version;
    @JsonProperty("keys")
    private Keys keys;
    @JsonProperty("publishAttributes")
    private PublishAttributes publishAttributes;
    @JsonProperty("productInfo")
    private ProductInfo productInfo;

    @JsonIgnore
    ArrayList<String> differenceList=new ArrayList<>();
    
    @JsonProperty("sourceProductConfigSystem")
    public String getSourceProductConfigSystem() {
        return sourceProductConfigSystem;
    }

    @JsonProperty("sourceProductConfigSystem")
    public void setSourceProductConfigSystem(String sourceProductConfigSystem) {
        this.sourceProductConfigSystem = sourceProductConfigSystem;
    }

    @JsonProperty("$schema")
    public String get$schema() {
        return $schema;
    }

    @JsonProperty("$schema")
    public void set$schema(String $schema) {
        this.$schema = $schema;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("keys")
    public Keys getKeys() {
        return keys;
    }

    @JsonProperty("keys")
    public void setKeys(Keys keys) {
        this.keys = keys;
    }

    @JsonProperty("publishAttributes")
    public PublishAttributes getPublishAttributes() {
        return publishAttributes;
    }

    @JsonProperty("publishAttributes")
    public void setPublishAttributes(PublishAttributes publishAttributes) {
        this.publishAttributes = publishAttributes;
    }

    @JsonProperty("productInfo")
    public ProductInfo getProductInfo() {
        return productInfo;
    }

    @JsonProperty("productInfo")
    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    
    public ArrayList<String> getDifferenceList() {
		return differenceList;
	}

	public void setDifferenceList(ArrayList<String> differenceList) {
		this.differenceList = differenceList;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Product.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sourceProductConfigSystem");
        sb.append('=');
        sb.append(((this.sourceProductConfigSystem == null)?"<null>":this.sourceProductConfigSystem));
        sb.append(',');
        sb.append("$schema");
        sb.append('=');
        sb.append(((this.$schema == null)?"<null>":this.$schema));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("keys");
        sb.append('=');
        sb.append(((this.keys == null)?"<null>":this.keys));
        sb.append(',');
        sb.append("publishAttributes");
        sb.append('=');
        sb.append(((this.publishAttributes == null)?"<null>":this.publishAttributes));
        sb.append(',');
        sb.append("productInfo");
        sb.append('=');
        sb.append(((this.productInfo == null)?"<null>":this.productInfo));
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
        result = ((result* 31)+((this.sourceProductConfigSystem == null)? 0 :this.sourceProductConfigSystem.hashCode()));
        result = ((result* 31)+((this.$schema == null)? 0 :this.$schema.hashCode()));
        result = ((result* 31)+((this.keys == null)? 0 :this.keys.hashCode()));
        result = ((result* 31)+((this.publishAttributes == null)? 0 :this.publishAttributes.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.productInfo == null)? 0 :this.productInfo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Product) == false) {
            return false;
        }
        Product rhs = ((Product) other);
        
        Boolean isSoureProductconfidSame= ((this.sourceProductConfigSystem==rhs.sourceProductConfigSystem)||((this.sourceProductConfigSystem!=null)&&
        		this.sourceProductConfigSystem.equals(rhs.sourceProductConfigSystem)));
        if(!isSoureProductconfidSame) {
        	differenceList.add(sourceProductConfigSystem);
        }
        Boolean isSchemaSame= ((this.$schema==rhs.$schema)||((this.$schema!=null)&&
        		this.$schema.equals(rhs.$schema)));
        if(!isSchemaSame) {
        	differenceList.add("schema");
        }
        
        Boolean iskeysSame= ((this.keys==rhs.keys)||((this.keys!=null)&&
        		this.keys.equals(rhs.keys)));
        if(!iskeysSame) {
        	differenceList.add("keys");
        }
        Boolean ispublishAttributesSame= ((this.publishAttributes==rhs.publishAttributes)||((this.publishAttributes!=null)&&
        		this.publishAttributes.equals(rhs.publishAttributes)));
        if(!ispublishAttributesSame) {
        	differenceList.add("publishAttributes");
        	
        }
        Boolean isversionSame= ((this.version==rhs.version)||((this.version!=null)&&
        		this.version.equals(rhs.version)));
        if(!isversionSame) {
        	differenceList.add("version");
        	
        }
        Boolean isproductinfoSame= ((this.productInfo==rhs.productInfo)||((this.productInfo!=null)&&
        		this.productInfo.equals(rhs.productInfo)));
        if(!isversionSame) {
        	differenceList.add("productInfo");
        	
        }
        
     return isSoureProductconfidSame&&isSchemaSame&&iskeysSame&&ispublishAttributesSame&&isversionSame&&isproductinfoSame;
     
    }

}
