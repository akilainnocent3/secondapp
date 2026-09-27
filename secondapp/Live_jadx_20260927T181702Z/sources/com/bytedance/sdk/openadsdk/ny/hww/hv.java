package com.bytedance.sdk.openadsdk.ny.hww;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv extends com.bytedance.sdk.component.hww.vy<JSONObject, JSONObject> {
    private JSONObject hww;

    public hv(JSONObject jSONObject) {
        this.hww = jSONObject;
    }

    public static void hww(com.bytedance.sdk.component.hww.weu weuVar, JSONObject jSONObject) {
        weuVar.hww("getData", new hv(jSONObject));
    }

    @Override // com.bytedance.sdk.component.hww.vy
    public JSONObject hww(String str, JSONObject jSONObject, com.bytedance.sdk.component.hww.hv hvVar) throws Exception {
        return com.bytedance.sdk.openadsdk.core.rs.hww.tq.hww(this.hww, jSONObject);
    }
}
