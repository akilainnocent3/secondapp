package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private boolean f36428hv;
    private String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private String f36429sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f36430tq;
    private String vy;

    public JSONObject hu() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_PRIVACY_URL, this.f36429sd);
            jSONObject.put("privacy_title", this.vy);
            jSONObject.put("text", this.f36430tq);
            jSONObject.put("icon", this.hww);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean hv() {
        return this.f36428hv;
    }

    public void hww(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.hww = jSONObject.optString("icon");
        this.f36430tq = jSONObject.optString("text");
        this.f36429sd = jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL);
        this.vy = jSONObject.optString("privacy_title");
    }

    public String sd() {
        return this.f36429sd;
    }

    public String tq() {
        return this.f36430tq;
    }

    public String vy() {
        return this.vy;
    }

    public String hww() {
        return this.hww;
    }

    public void hww(boolean z10) {
        this.f36428hv = z10;
    }
}
