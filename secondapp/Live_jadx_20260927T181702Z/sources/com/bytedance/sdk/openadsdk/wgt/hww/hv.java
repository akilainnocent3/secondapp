package com.bytedance.sdk.openadsdk.wgt.hww;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv {
    public static void hww(final String str, final String str2, final int i10, final String str3) {
        com.bytedance.sdk.openadsdk.wgt.sd.hww(str, false, 10, new com.bytedance.sdk.openadsdk.wgt.tq() { // from class: com.bytedance.sdk.openadsdk.wgt.hww.hv.1
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            public sd hww() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str2);
                jSONObject.put("error_code", i10);
                jSONObject.put("error_msg", str3);
                return vy.tq().hww(str).tq(jSONObject.toString());
            }
        });
    }
}
