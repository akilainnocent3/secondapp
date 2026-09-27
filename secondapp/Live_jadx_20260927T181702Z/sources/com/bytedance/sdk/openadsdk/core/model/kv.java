package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class kv {
    private String hww = "horizontal";

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f36342tq = 1;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f36341sd = 1;
    private int vy = 0;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f36338hv = 0;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f36337hu = 0;
    private int vgm = 0;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private int f36339ok = 5000;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int f36340rs = 500;
    private int nod = 0;

    public int hu() {
        return this.f36337hu;
    }

    public int hv() {
        return this.f36338hv;
    }

    public String hww() {
        return this.hww;
    }

    public int nod() {
        return this.nod;
    }

    public int ok() {
        return this.f36339ok;
    }

    public int rs() {
        return this.f36340rs;
    }

    public int sd() {
        return this.f36341sd;
    }

    public int tq() {
        return this.f36342tq;
    }

    public int vgm() {
        return this.vgm;
    }

    public JSONObject vhb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("direction", this.hww);
            jSONObject.put("auto_loop", this.f36342tq);
            jSONObject.put("allow_manual_loop", this.f36341sd);
            jSONObject.put("unlimited_loop", this.vy);
            jSONObject.put("left_margin", this.f36338hv);
            jSONObject.put("right_margin", this.f36337hu);
            jSONObject.put("ad_margin", this.vgm);
            jSONObject.put("loop_interval_time", this.f36339ok);
            jSONObject.put("flip_speed", this.f36340rs);
            jSONObject.put("stop_auto_loop", this.nod);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public int vy() {
        return this.vy;
    }

    public static kv hww(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new kv();
        }
        kv kvVar = new kv();
        kvVar.hww = jSONObject.optString("direction", "horizontal");
        kvVar.f36342tq = jSONObject.optInt("auto_loop", 1);
        kvVar.f36341sd = jSONObject.optInt("allow_manual_loop", 1);
        kvVar.vy = jSONObject.optInt("unlimited_loop", 0);
        kvVar.f36338hv = jSONObject.optInt("left_margin", 0);
        kvVar.f36337hu = jSONObject.optInt("right_margin", 0);
        kvVar.vgm = jSONObject.optInt("ad_margin", 0);
        kvVar.f36339ok = jSONObject.optInt("loop_interval_time", 5000);
        kvVar.f36340rs = jSONObject.optInt("flip_speed", 500);
        kvVar.nod = jSONObject.optInt("stop_auto_loop", 0);
        return kvVar;
    }
}
