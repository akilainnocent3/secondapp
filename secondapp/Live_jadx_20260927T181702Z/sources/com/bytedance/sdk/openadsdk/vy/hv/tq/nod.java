package com.bytedance.sdk.openadsdk.vy.hv.tq;

import com.bytedance.sdk.component.utils.omn;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class nod extends sd {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private String f37848hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private String f37849hv;
    private String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private long f37850sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private long f37851tq;
    private int vy;

    public void hww(String str) {
        this.hww = str;
    }

    public void sd(String str) {
        this.f37848hu = str;
    }

    public void tq(long j10) {
        this.f37850sd = j10;
    }

    public void hww(long j10) {
        this.f37851tq = j10;
    }

    public void tq(String str) {
        this.f37849hv = str;
    }

    public void hww(int i10) {
        this.vy = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.vy.hv.tq.sd
    public void hww(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.hww);
            jSONObject.put("preload_size", this.f37851tq);
            jSONObject.put("load_time", this.f37850sd);
            jSONObject.put("error_code", this.vy);
            jSONObject.put("error_message", this.f37849hv);
            jSONObject.put("error_message_server", this.f37848hu);
        } catch (Throwable th2) {
            omn.sd("LoadVideoErrorModel", th2.getMessage());
        }
    }
}
