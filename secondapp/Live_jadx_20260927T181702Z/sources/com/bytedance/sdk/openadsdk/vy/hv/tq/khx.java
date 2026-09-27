package com.bytedance.sdk.openadsdk.vy.hv.tq;

import com.bytedance.sdk.component.utils.omn;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class khx extends sd {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final String f37845hv;
    private long hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final int f37846sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private long f37847tq;
    private final int vy;

    public khx(com.bykv.vk.openvk.hww.hww.hww.sd.hww hwwVar) {
        this.f37846sd = hwwVar.hww();
        this.vy = hwwVar.tq();
        this.f37845hv = hwwVar.sd();
    }

    public void hww(long j10) {
        this.hww = j10;
    }

    public void tq(long j10) {
        this.f37847tq = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.vy.hv.tq.sd
    public void hww(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.hww);
            jSONObject.put("total_duration", this.f37847tq);
            jSONObject.put("error_code", this.f37846sd);
            jSONObject.put("extra_error_code", this.vy);
            jSONObject.put("error_message", this.f37845hv);
        } catch (Throwable th2) {
            omn.sd("PlayErrorModel", th2.getMessage());
        }
    }
}
