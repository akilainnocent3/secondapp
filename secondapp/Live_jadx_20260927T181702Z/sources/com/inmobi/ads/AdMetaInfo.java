package com.inmobi.ads;

import kotlin.jvm.internal.m0;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class AdMetaInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f54248b;

    public AdMetaInfo(@l String creativeID, @m JSONObject jSONObject) {
        m0.p(creativeID, "creativeID");
        this.f54247a = creativeID;
        this.f54248b = jSONObject;
    }

    public final double getBid() {
        JSONObject jSONObject = this.f54248b;
        if (jSONObject != null) {
            return jSONObject.optDouble("buyerPrice");
        }
        return 0.0d;
    }

    @l
    public final JSONObject getBidInfo() {
        JSONObject jSONObject = this.f54248b;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    @m
    public final String getBidKeyword() {
        JSONObject jSONObject = this.f54248b;
        if (jSONObject != null) {
            return jSONObject.optString("bidKeyword");
        }
        return null;
    }

    @l
    public final String getCreativeID() {
        return this.f54247a;
    }
}
