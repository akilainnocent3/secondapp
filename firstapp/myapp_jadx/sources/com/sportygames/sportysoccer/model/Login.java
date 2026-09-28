package com.sportygames.sportysoccer.model;

import defpackage.uf80;

/* JADX INFO: loaded from: classes8.dex */
public class Login {
    private final String accessToken;

    public Login(String str) {
        this.accessToken = str;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String toString() {
        return uf80.a(new StringBuilder("Login{accessToken='"), this.accessToken, "'}");
    }
}
