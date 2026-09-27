package com.ironsource;

import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class Z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f60465a = "ManRewInst_";

    public static String a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString("name");
        }
        return f60465a + jSONObject.optString("name");
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    public static String a() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(O9 o10) {
        if (o10.i()) {
            return C4523t8.e.Banner.toString();
        }
        if (o10.n()) {
            return C4523t8.e.RewardedVideo.toString();
        }
        return C4523t8.e.Interstitial.toString();
    }
}
