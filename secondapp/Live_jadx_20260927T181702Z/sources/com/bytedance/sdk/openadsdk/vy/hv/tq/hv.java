package com.bytedance.sdk.openadsdk.vy.hv.tq;

import com.bytedance.sdk.component.utils.omn;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv extends sd {
    private long hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private long f37840tq;

    public void hww(long j10) {
        this.hww = j10;
    }

    public void tq(long j10) {
        this.f37840tq = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.vy.hv.tq.sd
    public void hww(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.hww);
            jSONObject.put("total_duration", this.f37840tq);
        } catch (Throwable th2) {
            omn.sd("FeedContinueModel", th2.getMessage());
        }
    }
}
