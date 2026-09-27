package com.bytedance.sdk.openadsdk.vy.hv.tq;

import com.bytedance.sdk.component.utils.omn;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ny extends sd {
    private String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private long f37852sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private long f37853tq;
    private long vy;

    public void hww(String str) {
        this.hww = str;
    }

    public void sd(long j10) {
        this.vy = j10;
    }

    public void tq(long j10) {
        this.f37852sd = j10;
    }

    public void hww(long j10) {
        this.f37853tq = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.vy.hv.tq.sd
    public void hww(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.hww);
            jSONObject.put("preload_size", this.f37853tq);
            jSONObject.put("load_time", this.f37852sd);
            jSONObject.put("local_cache", this.vy);
        } catch (Throwable th2) {
            omn.sd("LoadVideoSuccessModel", th2.getMessage());
        }
    }
}
