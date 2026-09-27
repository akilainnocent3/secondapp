package com.unity3d.services.ads.token;

import dr.w2;
import org.json.JSONArray;
import org.json.JSONException;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface TokenStorage {
    void appendTokens(@l JSONArray jSONArray) throws JSONException;

    void createTokens(@l JSONArray jSONArray) throws JSONException;

    void deleteTokens();

    @l
    w2 getNativeGeneratedToken();

    @m
    String getToken();

    void setInitToken(@m String str);
}
