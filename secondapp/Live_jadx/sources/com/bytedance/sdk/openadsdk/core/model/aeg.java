package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class aeg {
    private final int hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final int f36202sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final int f36203tq;
    private final int vy;

    public aeg(JSONObject jSONObject) {
        this.hww = jSONObject.optInt("max_time", 0);
        this.f36203tq = jSONObject.optInt("auto_skip_time", -1);
        this.f36202sd = jSONObject.optInt("show_after_inactivity", 10);
        this.vy = jSONObject.optInt("user_wait_time", 10);
    }

    public int hww() {
        return this.hww;
    }

    public int sd() {
        return this.vy;
    }

    public int tq() {
        return this.f36202sd;
    }

    public JSONObject vy() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("max_time", this.hww);
            jSONObject.put("auto_skip_time", this.f36203tq);
            jSONObject.put("show_after_inactivity", this.f36202sd);
            jSONObject.put("user_wait_time", this.vy);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
