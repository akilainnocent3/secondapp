package com.twilio.voice;

/* JADX INFO: loaded from: classes8.dex */
public class IceServer {
    public final String password;
    public final String serverUrl;
    public final String username;

    public IceServer(String str, String str2, String str3) {
        this.username = str2;
        this.password = str3;
        this.serverUrl = str;
    }

    public IceServer(String str) {
        this(str, "", "");
    }
}
