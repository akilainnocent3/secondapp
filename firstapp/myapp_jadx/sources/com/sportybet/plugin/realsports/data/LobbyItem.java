package com.sportybet.plugin.realsports.data;

import defpackage.uvh;

/* JADX INFO: loaded from: classes7.dex */
public class LobbyItem {
    public String action;
    public String imageUrl;
    public String name;
    public long onlineNum;
    public String onlineNumKey;

    public LobbyItem(String str, String str2, String str3, String str4, long j) {
        this.name = str;
        this.imageUrl = str2;
        this.action = str3;
        this.onlineNumKey = str4;
        this.onlineNum = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LobbyItem{name='");
        sb.append(this.name);
        sb.append("', imageUrl='");
        sb.append(this.imageUrl);
        sb.append("', action='");
        sb.append(this.action);
        sb.append("', onlineNumKey='");
        sb.append(this.onlineNumKey);
        sb.append("', onlineNum=");
        return uvh.a(sb, this.onlineNum, '}');
    }
}
