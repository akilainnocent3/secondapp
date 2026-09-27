package com.bytedance.sdk.openadsdk.vy.hv.tq;

import com.bytedance.sdk.component.utils.omn;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ed extends sd {
    public long hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public long f37836sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public int f37837tq;

    public void hww(long j10) {
        this.hww = j10;
    }

    public void tq(long j10) {
        this.f37836sd = j10;
    }

    public void hww(int i10) {
        this.f37837tq = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.vy.hv.tq.sd
    public void hww(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.hww);
            jSONObject.put("buffers_count", this.f37837tq);
            jSONObject.put("total_duration", this.f37836sd);
        } catch (Throwable th2) {
            omn.sd("PlayBufferModel", th2.getMessage());
        }
    }
}
