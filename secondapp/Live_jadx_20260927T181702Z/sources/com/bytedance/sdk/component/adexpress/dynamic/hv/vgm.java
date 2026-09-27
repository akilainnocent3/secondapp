package com.bytedance.sdk.component.adexpress.dynamic.hv;

import com.bytedance.sdk.component.adexpress.tq.ed;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vgm implements ok {
    private com.bytedance.sdk.component.adexpress.dynamic.hu.tq hww;

    /* JADX INFO: Access modifiers changed from: private */
    public void tq(ed edVar) {
        try {
            JSONObject jSONObjectSd = edVar.sd();
            JSONObject jSONObject = new JSONObject(jSONObjectSd.optString("template_Plugin"));
            JSONObject jSONObjectOptJSONObject = jSONObjectSd.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVarHww = new hu(jSONObject, jSONObjectOptJSONObject, jSONObjectSd.optJSONObject("AdSize"), new JSONObject(jSONObjectSd.optString("diff_template_Plugin"))).hww(edVar.tq(), edVar.nod(), jSONObjectOptJSONObject.optDouble("score_exact_i18n"), jSONObjectOptJSONObject.optString("comment_num_i18n"), edVar);
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObjectOptJSONObject.optString("dynamic_creative"));
                okVarHww.hww(jSONObject2.optString("color"));
                okVarHww.hww(jSONObject2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.hww.hww(okVarHww);
        } catch (Exception unused2) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.hv.ok
    public void hww(com.bytedance.sdk.component.adexpress.dynamic.hu.tq tqVar) {
        this.hww = tqVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.hv.ok
    public void hww(final ed edVar) {
        if (edVar.ny() == 1) {
            tq(edVar);
        } else {
            com.bytedance.sdk.component.adexpress.vy.vy.hww(new com.bytedance.sdk.component.ok.ok("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.hv.vgm.1
                @Override // java.lang.Runnable
                public void run() {
                    vgm.this.tq(edVar);
                }
            }, 5);
        }
    }
}
