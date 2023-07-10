package com.jsonproj.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"$schema",
	"version",
	"keys",
	"productinfo",
})
public class Product {
	@JsonProperty("$schema")
	private String $schema;
	
	

}
