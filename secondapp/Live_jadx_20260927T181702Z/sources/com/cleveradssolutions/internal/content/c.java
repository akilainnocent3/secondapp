package com.cleveradssolutions.internal.content;

import kotlin.jvm.internal.m0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.cleveradssolutions.sdk.c f43374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f43375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f43376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f43377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f43378g;

    public c(String json) {
        com.cleveradssolutions.sdk.c cVar;
        m0.p(json, "json");
        JSONObject jSONObject = new JSONObject(json);
        this.f43372a = jSONObject.optString("source");
        this.f43373b = jSONObject.optInt("sourceCode");
        switch (jSONObject.optInt("formatCode")) {
            case 0:
                cVar = com.cleveradssolutions.sdk.c.BANNER;
                break;
            case 1:
                cVar = com.cleveradssolutions.sdk.c.INTERSTITIAL;
                break;
            case 2:
                cVar = com.cleveradssolutions.sdk.c.REWARDED;
                break;
            case 3:
                cVar = com.cleveradssolutions.sdk.c.APP_OPEN;
                break;
            case 4:
                cVar = com.cleveradssolutions.sdk.c.NATIVE;
                break;
            case 5:
                cVar = com.cleveradssolutions.sdk.c.MEDIUM_RECTANGLE;
                break;
            case 6:
                cVar = com.cleveradssolutions.sdk.c.INLINE_BANNER;
                break;
            default:
                cVar = com.cleveradssolutions.sdk.c.BANNER;
                break;
        }
        this.f43374c = cVar;
        this.f43375d = jSONObject.optString("unit");
        Object objOpt = jSONObject.opt("creative");
        this.f43378g = objOpt != null ? objOpt.toString() : null;
        this.f43376e = jSONObject.optDouble("cpm", 0.0d);
        this.f43377f = jSONObject.optInt("precision", 0);
    }

    @Override // com.cleveradssolutions.internal.content.d
    public final String a() {
        return "custom";
    }

    @Override // com.cleveradssolutions.internal.content.d
    public final String b() {
        return this.f43375d;
    }

    @Override // com.cleveradssolutions.internal.content.d
    public final String c() {
        return this.f43372a;
    }

    @Override // com.cleveradssolutions.internal.content.d
    public final double d() {
        return this.f43376e;
    }

    @Override // com.cleveradssolutions.internal.content.d
    public final String getCreativeId() {
        return this.f43378g;
    }

    @Override // com.cleveradssolutions.internal.content.d
    public final com.cleveradssolutions.sdk.c getFormat() {
        return this.f43374c;
    }

    @Override // com.cleveradssolutions.internal.content.d
    public final int getRevenuePrecision() {
        return this.f43377f;
    }

    @Override // com.cleveradssolutions.internal.content.d
    public final String j() {
        return null;
    }

    @Override // com.cleveradssolutions.internal.content.d
    public final int zz() {
        return this.f43373b;
    }
}
