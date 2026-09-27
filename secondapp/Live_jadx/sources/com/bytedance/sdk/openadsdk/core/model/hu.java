package com.bytedance.sdk.openadsdk.core.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu {
    private int vgm;
    private String hww = "";

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f36230tq = "";

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private String f36229sd = "";
    private String vy = "";

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private double f36228hv = -1.0d;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f36227hu = -1;

    public int hu() {
        return this.vgm;
    }

    public int hv() {
        return this.f36227hu;
    }

    public String hww() {
        return this.hww;
    }

    public JSONObject ok() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", tq());
            jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, hu());
            jSONObject.put("comment_num", hv());
            jSONObject.put(DownloadModel.DOWNLOAD_URL, hww());
            jSONObject.put("package_name", sd());
            jSONObject.put(FirebaseAnalytics.d.D, vy());
            jSONObject.put("app_category", vgm());
            return jSONObject;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.omn.vy(e10.toString(), new Object[0]);
            return jSONObject;
        }
    }

    public String sd() {
        return this.f36229sd;
    }

    public String tq() {
        return this.f36230tq;
    }

    public String vgm() {
        return this.vy;
    }

    public double vy() {
        return this.f36228hv;
    }

    public void hww(String str) {
        this.hww = str;
    }

    public void sd(String str) {
        this.f36229sd = str;
    }

    public void tq(String str) {
        this.f36230tq = str;
    }

    public void vy(String str) {
        this.vy = str;
    }

    public void hww(double d10) {
        if (d10 >= 1.0d && d10 <= 5.0d) {
            this.f36228hv = d10;
        } else {
            this.f36228hv = -1.0d;
        }
    }

    public void tq(int i10) {
        this.vgm = i10;
    }

    public void hww(int i10) {
        if (i10 <= 0) {
            this.f36227hu = -1;
        } else {
            this.f36227hu = i10;
        }
    }
}
