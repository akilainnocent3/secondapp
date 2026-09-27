package com.bytedance.sdk.openadsdk.vy.hv.tq;

import com.bytedance.sdk.component.utils.omn;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class rs extends sd {
    private final String hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final long f37856tq;

    public rs(String str, long j10) {
        this.hww = str;
        this.f37856tq = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.vy.hv.tq.sd
    public void hww(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.hww);
            jSONObject.put("preload_size", this.f37856tq);
        } catch (Throwable th2) {
            omn.sd("LoadVideoCancelModel", th2.getMessage());
        }
    }
}
