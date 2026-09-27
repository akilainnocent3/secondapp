package com.bytedance.sdk.openadsdk.wgt.hww;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.jpb;
import com.bytedance.sdk.component.utils.omn;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.rs;
import com.bytedance.sdk.openadsdk.utils.grv;
import com.bytedance.sdk.openadsdk.utils.qt;
import com.bytedance.sdk.openadsdk.wgt.hww.vy;
import com.ironsource.Q6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import org.json.JSONObject;
import ql.g0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy<T extends vy> implements sd {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private String f38080ed;
    private String hww;
    private String nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private String f38083ny;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private String f38085rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private String f38086sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f38087tq;
    private String vgm;
    private String vhb;
    private final String vy = BuildConfig.VERSION_NAME;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private long f38082hv = System.currentTimeMillis() / 1000;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f38081hu = 0;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private int f38084ok = 0;

    private vy() {
        try {
            this.f38080ed = grv.hww();
        } catch (Throwable unused) {
            this.f38080ed = "default";
        }
    }

    public static vy<vy> tq() {
        return new vy<>();
    }

    private JSONObject weu() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Q6.F, 1);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("package_name", qt.hu());
            jSONObject.put(Q6.f59861d0, qt.vy());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public String ed() {
        return this.nod;
    }

    public String hu() {
        return this.f38086sd;
    }

    public String hv() {
        return this.f38087tq;
    }

    @Override // com.bytedance.sdk.openadsdk.wgt.hww.sd
    public JSONObject hww() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_sdk_version", vgm());
            jSONObject2.put("app_version", qt.ok());
            jSONObject2.put("timestamp", ok());
            jSONObject2.put("conn_type", jpb.tq(bs.hww()));
            jSONObject2.put(g0.f122420x, TextUtils.isEmpty(rs.tq().vy()) ? "" : rs.tq().vy());
            jSONObject2.put("device_info", weu());
            if (!TextUtils.isEmpty(sd())) {
                jSONObject2.put("type", sd());
            }
            jSONObject2.put("error_code", vhb());
            if (!TextUtils.isEmpty(ny())) {
                jSONObject2.put("error_msg", ny());
            }
            if (!TextUtils.isEmpty(hv())) {
                jSONObject2.put("rit", hv());
            }
            if (!TextUtils.isEmpty(hu())) {
                jSONObject2.put(CampaignEx.JSON_KEY_CREATIVE_ID, hu());
            }
            if (rs() > 0) {
                jSONObject2.put("adtype", rs());
            }
            if (!TextUtils.isEmpty(nod())) {
                jSONObject2.put("req_id", nod());
            }
            if (!TextUtils.isEmpty(ed())) {
                jSONObject2.put("extra", ed());
            }
            String strVy = vy();
            if (TextUtils.isEmpty(strVy)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(strVy);
                } catch (Throwable unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONObject.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject.put("pangle_client_unique_id", "pangle-" + this.f38080ed + TokenBuilder.TOKEN_DELIMITER + System.currentTimeMillis());
                jSONObject2.put("event_extra", jSONObject.toString());
            } else if (!TextUtils.isEmpty(strVy)) {
                jSONObject2.put("event_extra", strVy);
            }
            if (!TextUtils.isEmpty(khx())) {
                jSONObject2.put("duration", khx());
            }
        } catch (Throwable th2) {
            omn.sd("LogStatsBase", th2.getMessage());
        }
        return jSONObject2;
    }

    public String khx() {
        return this.f38083ny;
    }

    public String nod() {
        return this.vgm;
    }

    public String ny() {
        return this.f38085rs;
    }

    public long ok() {
        return this.f38082hv;
    }

    public int rs() {
        return this.f38081hu;
    }

    public String sd() {
        return this.hww;
    }

    public String vgm() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }

    public int vhb() {
        return this.f38084ok;
    }

    public String vy() {
        return this.vhb;
    }

    public T hu(String str) {
        this.f38085rs = str;
        return (T) wgt();
    }

    public T hv(String str) {
        this.vgm = str;
        return (T) wgt();
    }

    public T ok(String str) {
        this.f38083ny = str;
        return (T) wgt();
    }

    public T sd(String str) {
        this.f38087tq = str;
        return (T) wgt();
    }

    public T tq(String str) {
        this.vhb = str;
        return (T) wgt();
    }

    public T vgm(String str) {
        this.nod = str;
        return (T) wgt();
    }

    public T vy(String str) {
        this.f38086sd = str;
        return (T) wgt();
    }

    public T tq(int i10) {
        this.f38084ok = i10;
        return (T) wgt();
    }

    private T wgt() {
        return this;
    }

    public T hww(String str) {
        this.hww = str;
        return (T) wgt();
    }

    public T hww(int i10) {
        this.f38081hu = i10;
        return (T) wgt();
    }
}
