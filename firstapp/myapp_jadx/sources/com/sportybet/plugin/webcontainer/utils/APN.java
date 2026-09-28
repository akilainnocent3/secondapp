package com.sportybet.plugin.webcontainer.utils;

/* JADX INFO: loaded from: classes7.dex */
public class APN {
    private String apnType;
    private String name;
    private Server proxyServer;

    public String getApnType() {
        return this.apnType;
    }

    public String getName() {
        return this.name;
    }

    public Server getProxyServer() {
        return this.proxyServer;
    }

    public void setApnType(String str) {
        this.apnType = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setProxyServer(Server server) {
        this.proxyServer = server;
    }
}
