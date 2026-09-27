package com.bytedance.sdk.openadsdk.ny.hww;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ed extends com.bytedance.sdk.component.hww.vy<JSONObject, JSONObject> {
    private WeakReference<com.bytedance.sdk.component.rs.hu> hww;

    public ed(com.bytedance.sdk.component.rs.hu huVar) {
        this.hww = new WeakReference<>(huVar);
    }

    public static void hww(com.bytedance.sdk.component.hww.weu weuVar, com.bytedance.sdk.component.rs.hu huVar) {
        weuVar.hww("preventTouchEvent", new ed(huVar));
    }

    @Override // com.bytedance.sdk.component.hww.vy
    public JSONObject hww(String str, JSONObject jSONObject, com.bytedance.sdk.component.hww.hv hvVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isPrevent", false);
            com.bytedance.sdk.component.rs.hu huVar = this.hww.get();
            if (huVar != null) {
                huVar.setIsPreventTouchEvent(zOptBoolean);
                jSONObject2.put("success", true);
                return jSONObject2;
            }
            jSONObject2.put("success", false);
            return jSONObject2;
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
            return jSONObject2;
        }
    }
}
