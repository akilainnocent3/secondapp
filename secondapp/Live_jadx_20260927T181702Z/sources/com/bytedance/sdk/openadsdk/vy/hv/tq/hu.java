package com.bytedance.sdk.openadsdk.vy.hv.tq;

import com.bytedance.sdk.component.utils.omn;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu extends sd {
    private long hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f37838sd = 0;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private long f37839tq;

    public void hww(long j10) {
        this.hww = j10;
    }

    public void tq(long j10) {
        this.f37839tq = j10;
    }

    public void hww(int i10) {
        this.f37838sd = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.vy.hv.tq.sd
    public void hww(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.hww);
            jSONObject.put("buffers_time", this.f37839tq);
            jSONObject.put("video_backup", this.f37838sd);
        } catch (Throwable th2) {
            omn.sd("FeedOverModel", th2.getMessage());
        }
    }
}
