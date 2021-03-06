package com.github.mkolisnyk.cucumber.reporting.types.beans;

import com.github.mkolisnyk.cucumber.reporting.types.OverviewStats;
import com.github.mkolisnyk.cucumber.reporting.types.result.CucumberFeatureResult;

public class DetailedReportingDataBean extends CommonDataBean {
    private OverviewStats stats;
    private CucumberFeatureResult[] results;
    private String screenShotWidth = "";
    public OverviewStats getStats() {
        return stats;
    }
    public void setStats(OverviewStats stats) {
        this.stats = stats;
    }
    public CucumberFeatureResult[] getResults() {
        return results;
    }
    public void setResults(CucumberFeatureResult[] results) {
        this.results = results;
    }
    public String getScreenShotWidth() {
        return screenShotWidth;
    }
    public void setScreenShotWidth(String screenShotWidth) {
        this.screenShotWidth = screenShotWidth;
    }
}
