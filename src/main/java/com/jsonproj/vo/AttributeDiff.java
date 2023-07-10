package com.jsonproj.vo;

public class AttributeDiff {
	
	private String attributeName;
	private String attributeIPValue;
	private String attributeOPValue;
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	public String getAttributeIPValue() {
		return attributeIPValue;
	}
	public void setAttributeIPValue(String attributeIPValue) {
		this.attributeIPValue = attributeIPValue;
	}
	public String getAttributeOPValue() {
		return attributeOPValue;
	}
	public void setAttributeOPValue(String attributeOPValue) {
		this.attributeOPValue = attributeOPValue;
	}
	public AttributeDiff() {
		
	}
	public AttributeDiff(String attributeName,String attributeIPValue,String attributeOPValue) {
		super();
		this.attributeName=attributeName;
		this.attributeIPValue=attributeIPValue;
		this.attributeOPValue=attributeOPValue;
	}
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("<br><b><i>AttributeName</i></b>");
		sb.append('=');
		sb.append(((this.attributeName==null)?"<b><null></b>":"<b>"+this.attributeName+"</b>"));
		sb.append(',');
		sb.append("<br><b><i>IPValue</i></b>");
		sb.append('=');
		sb.append(((this.attributeIPValue==null)?"<b><null></b>":"<b>"+this.attributeIPValue+"</b>"));
		sb.append(',');
		sb.append("<br><b><i>attributeOPValue</i></b>");
		sb.append('=');
		sb.append(((this.attributeOPValue==null)?"<b><null></b>":"<b>"+this.attributeOPValue+"</b>"));
		
		return sb.toString();
	}
	
	

}
