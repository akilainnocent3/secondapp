package com.bytedance.sdk.openadsdk.wgt.sd;

import com.ironsource.Q6;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        public final String hww;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        public final JSONObject f38107tq;

        public hww(String str, JSONObject jSONObject) {
            this.hww = str;
            this.f38107tq = jSONObject;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("device_info");
            if (jSONObjectOptJSONObject != null) {
                try {
                    jSONObjectOptJSONObject.put(Q6.V0, com.bytedance.sdk.openadsdk.omn.hww.tq.hww.hww().tq());
                    jSONObject.put("device_info", jSONObjectOptJSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static sd hww() {
        return hv.hww();
    }
}
