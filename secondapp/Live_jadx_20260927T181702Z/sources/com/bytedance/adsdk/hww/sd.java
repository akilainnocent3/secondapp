package com.bytedance.adsdk.hww;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class sd implements com.bytedance.adsdk.ugeno.sd.hww {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww implements com.bytedance.adsdk.ugeno.sd.hww.InterfaceC0305hww {
        private com.bytedance.adsdk.hww.tq.hww hww;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private String f31887tq;

        private hww(String str) {
            this.f31887tq = str;
            this.hww = com.bytedance.adsdk.hww.tq.hww.hww(str);
        }

        public static hww hww(String str) {
            return new hww(str);
        }

        @Override // com.bytedance.adsdk.ugeno.sd.hww.InterfaceC0305hww
        public Object hww(JSONObject jSONObject) {
            com.bytedance.adsdk.hww.tq.hww hwwVar = this.hww;
            if (hwwVar == null) {
                return this.f31887tq;
            }
            Object objHww = hwwVar.hww(jSONObject);
            if (objHww instanceof String) {
                return objHww;
            }
            if (objHww instanceof com.bytedance.adsdk.hww.tq.hww.hww) {
                return String.valueOf(wgt.hww((com.bytedance.adsdk.hww.tq.hww.hww) objHww));
            }
            if (objHww == null || !objHww.getClass().isArray()) {
                return String.valueOf(objHww);
            }
            try {
                return new JSONArray(objHww).toString();
            } catch (JSONException unused) {
                return String.valueOf(objHww);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sd.hww
    public com.bytedance.adsdk.ugeno.sd.hww.InterfaceC0305hww hww(String str) {
        return hww.hww(str);
    }
}
