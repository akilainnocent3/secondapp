package com.bytedance.sdk.openadsdk.core.vhb.ok;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private String f36916hv;
    private String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private String f36917sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f36918tq;
    private String vy;

    public String hv() {
        return this.f36916hv;
    }

    public String hww() {
        return this.hww;
    }

    public String sd() {
        return this.f36917sd;
    }

    public String tq() {
        return this.f36918tq;
    }

    public String vy() {
        return this.vy;
    }

    public hww hv(String str) {
        this.f36916hv = str;
        return this;
    }

    public hww hww(String str) {
        this.hww = str;
        return this;
    }

    public hww sd(String str) {
        this.f36917sd = str;
        return this;
    }

    public hww tq(String str) {
        this.f36918tq = str;
        return this;
    }

    public hww vy(String str) {
        this.vy = str;
        return this;
    }

    public JSONObject hww(hww hwwVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.hww);
            jSONObject.put("md5", this.f36918tq);
            jSONObject.put("url", this.f36917sd);
            if (hwwVar != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", hwwVar.hww());
                jSONObject2.put("md5", hwwVar.tq());
                jSONObject2.put("url", hwwVar.sd());
                jSONObject.put("overlay", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
