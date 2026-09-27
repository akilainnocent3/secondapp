package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class aed {
    private int hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f36200sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f36201tq;
    private String vy = "Next Ad";

    public JSONObject hv() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i10 = this.hww;
            if (i10 != -1) {
                jSONObject.put("endcard_show_time", i10);
            }
            jSONObject.put("is_allow_pause", this.f36201tq);
            jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, this.f36200sd);
            if (!TextUtils.isEmpty(this.vy)) {
                jSONObject.put("endcard_next_ad_text", this.vy);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int hww() {
        return this.f36200sd;
    }

    public String sd() {
        return this.vy;
    }

    public int tq() {
        return this.f36201tq;
    }

    public int vy() {
        return this.hww;
    }

    public void hww(int i10) {
        this.f36200sd = i10;
    }

    public void sd(int i10) {
        this.hww = i10;
    }

    public void tq(int i10) {
        this.f36201tq = i10;
    }

    public void hww(String str) {
        this.vy = str;
    }

    public static aed hww(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        aed aedVar = new aed();
        try {
            int iMax = Math.max(jSONObject.optInt("endcard_show_time", 0), 0);
            int iOptInt = jSONObject.optInt("is_allow_pause", 0);
            int iOptInt2 = jSONObject.optInt(CampaignEx.JSON_KEY_LANDING_TYPE, 0);
            String strOptString = jSONObject.optString("endcard_next_ad_text", "Next Ad");
            aedVar.sd(iMax);
            aedVar.tq(iOptInt);
            aedVar.hww(strOptString);
            aedVar.hww(iOptInt2);
        } catch (Throwable unused) {
        }
        return aedVar;
    }
}
