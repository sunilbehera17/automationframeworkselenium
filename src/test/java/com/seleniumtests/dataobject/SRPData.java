package com.seleniumtests.dataobject;

public class SRPData {
 
	private String searchText;
	private String minBudget;
	private String maxBudget;
	private String minArea;
	private String maxArea;
	private String query;
	
	private String searchTextSRP;
	private String bhkType;
	private String postedType;
	private String revelanceType;
	private String postedSinceType;
	private String constructionStatusType;
	private String buyRentType;
	
	

	public String getBuyRentType() {
		return buyRentType;
	}

	public void setBuyRentType(final String buyRentType) {
		this.buyRentType = buyRentType;
	}

	public String getConstructionStatusType() {
		return constructionStatusType;
	}

	public void setConstructionStatusType(final String constructionStatusType) {
		this.constructionStatusType = constructionStatusType;
	}

	public String getPostedSinceType() {
		return postedSinceType;
	}

	public void setPostedSinceType(final String postedSinceType) {
		this.postedSinceType = postedSinceType;
	}

	public String getRevelanceType() {
		return revelanceType;
	}

	public void setRevelanceType(final String revelanceType) {
		this.revelanceType = revelanceType;
	}

	public String getPostedType() {
		return postedType;
	}

	public void setPostedType(final String postedType) {
		this.postedType = postedType;
	}

	public String getBhkType() {
		return bhkType;
	}

	public void setBhkType(final String bhkType) {
		this.bhkType = bhkType;
	}

	public String getSearchTextSRP() {
		return searchTextSRP;
	}

	public void setSearchTextSRP(final String searchTextSRP) {
		this.searchTextSRP = searchTextSRP;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(final String query) {
		this.query = query;
	}

	public String getMinArea() {
		return minArea;
	}

	public void setMinArea(final String minArea) {
		this.minArea = minArea;
	}

	public String getMaxArea() {
		return maxArea;
	}

	public void setMaxArea(final String maxArea) {
		this.maxArea = maxArea;
	}

	public String getMinBudget() {
		return minBudget;
	}

	public void setMinBudget(final String minBudget) {
		this.minBudget = minBudget;
	}

	public String getMaxBudget() {
		return maxBudget;
	}

	public void setMaxBudget(final String maxBudget) {
		this.maxBudget = maxBudget;
	}

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(final String searchText) {
		this.searchText = searchText;
	}
	
	 @Override public String toString() {
	        StringBuilder stringBuilder = new StringBuilder();

	        return stringBuilder.append("searchText : " + searchText +" , " +"Minimun Budget : " + minBudget +" , " + "Maxmium Budget : " + maxBudget +" , " + 
	        		"Minimun Area : " + minArea +" , " + "Maxmium Area : " + maxArea + " Query : " + query + " searchTextSRP : " + searchTextSRP +" bhkType : " + bhkType +
	        		" postedType : " + postedType +" revelanceType : " + revelanceType 
	        		+" postedSinceType : " + postedSinceType +" constructionStatusType : " + constructionStatusType +" BuyRentType : " + buyRentType +  " ]").toString();
	    }
}
