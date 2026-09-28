package com.sportybet.plugin.webcontainer.utils;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class Server {
    private String address;
    private Integer port;

    public Server(String str) {
        this.port = null;
        String[] strArrSplit = str.split(":");
        this.address = strArrSplit[0];
        if (strArrSplit.length > 1) {
            try {
                this.port = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
            } catch (Exception unused) {
            }
        }
    }

    public String getAddress() {
        return this.address;
    }

    public Integer getPort() {
        Integer num = this.port;
        if (num != null) {
            return num;
        }
        return 80;
    }

    public String getUrl() {
        String str = this.address;
        if (str == null) {
            return null;
        }
        if (this.port == null) {
            return str;
        }
        return this.address + ":" + this.port;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setPort(Integer num) {
        this.port = num;
    }

    public Server(String str, int i) {
        this.port = null;
        this.address = str;
        this.port = Integer.valueOf(i);
    }

    public Server(String str, String str2) {
        this.port = null;
        this.address = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.port = Integer.valueOf(Integer.parseInt(str2));
        } catch (Exception unused) {
        }
    }

    public Server() {
        this.port = null;
    }
}
