package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.h4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4307h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f61908a = "SSA_CORE.SDKController.runFunction";

    public static String a(C4325i4 c4325i4) {
        return String.format("%1$s('%2$s%3$s'%4$s)", f61908a, c4325i4.b(), a(c4325i4.c()), b(c4325i4));
    }

    private static String b(C4325i4 c4325i4) {
        return (c4325i4.d() == null || c4325i4.a() == null) ? "" : String.format(", '%1$s', '%2$s'", c4325i4.d(), c4325i4.a());
    }

    private static String a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            return jSONObject.toString();
        }
        return "";
    }
}
