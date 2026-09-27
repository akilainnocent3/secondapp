package com.mbridge.msdk.videocommon.entity;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f71678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f71679b;

    public a(String str, String str2) {
        this.f71678a = str;
        this.f71679b = str2;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                return new a(jSONObject.optString("appId"), jSONObject.optString("placementId"));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }
}
