/*
 * Copyright 2018 www.muvi.com
 */

package com.seleniumtests.driver;

import com.seleniumtests.core.SeleniumTestsContextManager;

public class ScreenShot {

    private String location;
    private String htmlSourcePath;
    private String imagePath;
    private String title;
    private String suiteName;
    private boolean isException;
    private String outputDirectory;

    public ScreenShot() {
        if (SeleniumTestsContextManager.getGlobalContext().getTestNGContext() != null) {
            suiteName = SeleniumTestsContextManager.getGlobalContext().getTestNGContext().getSuite().getName();
            outputDirectory = SeleniumTestsContextManager.getGlobalContext().getTestNGContext().getOutputDirectory();
        }
    }

    public boolean isException() {
        return isException;
    }

    public void setException(final boolean isException) {
        this.isException = isException;
    }

    public String getSuiteName() {
        return suiteName;
    }

    public String getOutputDirectory() {
        return outputDirectory;
    }

    public void setOutputDirectory(final String outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    public void setSuiteName(final String suiteName) {
        this.suiteName = suiteName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(final String location) {
        this.location = location;
    }

    public void setHtmlSourcePath(final String htmlSourcePath) {
        this.htmlSourcePath = htmlSourcePath;
    }

    public void setImagePath(final String imagePath) {
        this.imagePath = imagePath;
    }

    public String getHtmlSourcePath() {
        return htmlSourcePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getFullImagePath() {
        if (this.imagePath != null) {
            return this.imagePath.replace(suiteName, outputDirectory);
        } else {
            return null;
        }
    }

    public String getFullHtmlPath() {
        if (this.htmlSourcePath != null) {
            return this.htmlSourcePath.replace(suiteName, outputDirectory);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "!!!EXCEPTION:" + this.isException + "|APPLICATION URL:" + this.location + "|PAGE TITLE:" + this.title
                + "|PAGE HTML SOURCE:" + this.getFullHtmlPath() + "|PAGE IMAGE:" + this.getFullImagePath();
    }
}
