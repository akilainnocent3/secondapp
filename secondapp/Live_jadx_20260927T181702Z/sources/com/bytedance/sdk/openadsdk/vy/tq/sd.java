package com.bytedance.sdk.openadsdk.vy.tq;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd implements tq {
    tq hww;

    @Override // com.bytedance.sdk.openadsdk.vy.tq.tq
    public void hww(JSONObject jSONObject, long j10) throws JSONException {
        tq tqVar = this.hww;
        if (tqVar != null) {
            tqVar.hww(jSONObject, j10);
        }
        if (j10 <= 0) {
            j10 = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j10);
    }
}
