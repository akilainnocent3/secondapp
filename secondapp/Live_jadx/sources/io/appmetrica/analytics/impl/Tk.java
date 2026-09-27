package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f96525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f96526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f96527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f96528g;

    public Tk(JSONObject jSONObject) {
        this.f96522a = jSONObject.optString("analyticsSdkVersionName", "");
        this.f96523b = jSONObject.optString("kitBuildNumber", "");
        this.f96524c = jSONObject.optString("appVer", "");
        this.f96525d = jSONObject.optString("appBuild", "");
        this.f96526e = jSONObject.optString("osVer", "");
        this.f96527f = jSONObject.optInt("osApiLev", -1);
        this.f96528g = jSONObject.optInt("attribution_id", 0);
    }

    public final String toString() {
        return "SessionRequestParams(kitVersionName='" + this.f96522a + "', kitBuildNumber='" + this.f96523b + "', appVersion='" + this.f96524c + "', appBuild='" + this.f96525d + "', osVersion='" + this.f96526e + "', apiLevel=" + this.f96527f + ", attributionId=" + this.f96528g + ')';
    }
}
