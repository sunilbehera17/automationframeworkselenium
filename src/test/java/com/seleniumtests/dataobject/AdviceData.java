package com.seleniumtests.dataobject;

public class AdviceData {

	private String explorealocalityText;
	private String explorealocalityPopularSearchText;
	private String localityOne;
	private String localityTwo;
	private String projectOne;
	private String projectTwo;
	private String smartSearchText;
	private String smartSearchMinBudget;
	private String smartSearchMaxBudget;
	private String loanAmount;
	private String rateAndTrendsText;
	private String forumText;
	
	
	
	
	
	public String getForumText() {
		return forumText;
	}
	public void setForumText(final String forumText) {
		this.forumText = forumText;
	}
	public String getRateAndTrendsText() {
		return rateAndTrendsText;
	}
	public void setRateAndTrendsText(final String rateAndTrendsText) {
		this.rateAndTrendsText = rateAndTrendsText;
	}
	public String getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(final String loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getSmartSearchMinBudget() {
		return smartSearchMinBudget;
	}
	public void setSmartSearchMinBudget(final String smartSearchMinBudget) {
		this.smartSearchMinBudget = smartSearchMinBudget;
	}
	public String getSmartSearchMaxBudget() {
		return smartSearchMaxBudget;
	}
	public void setSmartSearchMaxBudget(final String smartSearchMaxBudget) {
		this.smartSearchMaxBudget = smartSearchMaxBudget;
	}
	public String getSmartSearchText() {
		return smartSearchText;
	}
	public void setSmartSearchText(final String smartSearchText) {
		this.smartSearchText = smartSearchText;
	}
	public String getProjectOne() {
		return projectOne;
	}
	public void setProjectOne(final String projectOne) {
		this.projectOne = projectOne;
	}
	public String getProjectTwo() {
		return projectTwo;
	}
	public void setProjectTwo(final String projectTwo) {
		this.projectTwo = projectTwo;
	}
	public String getLocalityOne() {
		return localityOne;
	}
	public void setLocalityOne(final String localityOne) {
		this.localityOne = localityOne;
	}
	public String getLocalityTwo() {
		return localityTwo;
	}
	public void setLocalityTwo(final String localityTwo) {
		this.localityTwo = localityTwo;
	}


	
	
	
	 public String getExplorealocalityPopularSearchText() {
		return explorealocalityPopularSearchText;
	}
	public void setExplorealocalityPopularSearchText(final String explorealocalityPopularSearchText) {
		this.explorealocalityPopularSearchText = explorealocalityPopularSearchText;
	}
	public String getExplorealocalityText() {
		return explorealocalityText;
	}
	public void setExplorealocalityText(final String explorealocalityText) {
		this.explorealocalityText = explorealocalityText;
	}
	
	
	@Override public String toString() {
	        StringBuilder stringBuilder = new StringBuilder();

	        return stringBuilder.append("explorealocalityText : " + explorealocalityText +
	        		" explorealocalityPopularSearchText : " + explorealocalityPopularSearchText +
	        		" localityOne : " + localityOne +
	        		" localityTwo : " + localityTwo +
	        		" projectOne : " + projectOne +
	        		" projectTwo : " + projectTwo +
	        		" smartSearchText : " + smartSearchText +
	        		" smartSearchMinBudget : " + smartSearchMinBudget +
	        		" smartSearchMaxBudget : " + smartSearchMaxBudget +
	        		" loanAmount : " + loanAmount +
	        		
	        		" ]").toString();
	    }
}
