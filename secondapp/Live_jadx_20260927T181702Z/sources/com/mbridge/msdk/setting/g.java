package com.mbridge.msdk.setting;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class g extends b {
    public static g D(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return b.b(new JSONObject(str));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("Setting", "parseSetting", e10);
            }
            return null;
        }
    }

    public String P0() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(t1.c.f135980f, k());
            jSONObject.put("cfc", m());
            jSONObject.put("cfb", F0());
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, b0());
            jSONObject.put("awct", i());
            jSONObject.put("rurl", M0());
            jSONObject.put("ujds", N0());
            jSONObject.put(CampaignEx.JSON_KEY_PLCTB, c0());
            jSONObject.put("tcto", s0());
            jSONObject.put("mv_wildcard", Q());
            jSONObject.put("is_startup_crashsystem", F());
            jSONObject.put("sfct", p0());
            jSONObject.put("pcrn", X());
            jSONObject.put("adct", e());
            jSONObject.put("atrqt", h());
            jSONObject.put("omsdkjs_url", V());
            jSONObject.put("mcs", O());
            jSONObject.put("GDPR_area", I0());
            jSONObject.put("alrbs", f());
            jSONObject.put("ct", u());
            jSONObject.put("isDefault", E());
            jSONObject.put("st_net", r0());
            jSONObject.put("vtag", z0());
            return jSONObject.toString();
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            q0.b("Setting", "toJSON", th2);
            return null;
        }
    }
}
