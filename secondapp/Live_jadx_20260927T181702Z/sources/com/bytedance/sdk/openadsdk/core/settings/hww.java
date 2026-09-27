package com.bytedance.sdk.openadsdk.core.settings;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends nod {
    public hww() {
        super("tt_set_apm.prop", new nod.hww() { // from class: com.bytedance.sdk.openadsdk.core.settings.hww.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.nod.hww
            public void hww() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.nod.hww
            public void tq() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.hv
    public void hww(JSONObject jSONObject) {
        hv.hww hwwVarHww = hww();
        if (jSONObject.has("apm_url")) {
            hwwVarHww.hww("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("perf_con_apm")) {
                    hwwVarHww.hww("perf_con_apm", jSONObjectOptJSONObject.optInt("perf_con_apm"));
                }
            } catch (Exception unused) {
            }
        }
        hwwVarHww.hww();
        vy();
    }
}
