package com.lzu.pojo;

public class website {
    public String url;
    public String title;
    public String content;
    public address ad;
    public website(String url, String title, String content, address ad) {
        this.url = url;
        this.title = title;
        this.content = content;
        this.ad = new address();
    }
    public void setAd(address ad) {
        this.ad = ad;
    }
    public address getAd() {
        return this.ad;
    }
}
