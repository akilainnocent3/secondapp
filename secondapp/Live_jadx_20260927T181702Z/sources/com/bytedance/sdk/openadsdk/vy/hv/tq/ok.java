package com.bytedance.sdk.openadsdk.vy.hv.tq;

import com.bytedance.sdk.component.utils.omn;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ok extends sd {
    private final com.bykv.vk.openvk.hww.hww.hww.sd.sd hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private long f37854sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private long f37855tq;
    private int vy;

    public ok(com.bykv.vk.openvk.hww.hww.hww.sd.sd sdVar) {
        this.hww = sdVar;
    }

    public void hww(long j10) {
        this.f37855tq = j10;
    }

    public void tq(long j10) {
        this.f37854sd = j10;
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
            jSONObject.put("video_start_duration", this.f37855tq);
            jSONObject.put("video_cache_size", this.f37854sd);
            jSONObject.put("is_auto_play", this.vy);
        } catch (Throwable th2) {
            omn.sd("FeedPlayModel", th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.vy.hv.tq.sd
    public void hww(hww hwwVar) throws Throwable {
        if (this.hww.aed()) {
            String strHv = this.hww.hv();
            String strBs = this.hww.bs();
            File fileTq = com.bykv.vk.openvk.hww.hww.tq.vy.tq.tq(strHv, strBs);
            File fileSd = com.bykv.vk.openvk.hww.hww.tq.vy.tq.sd(strHv, strBs);
            if (fileSd.exists()) {
                fileTq = fileSd;
            }
            try {
                hwwVar.vy().put("moov_box_pos", com.bykv.vk.openvk.hww.hww.hww.vgm.vy.hww(fileTq));
            } catch (JSONException unused) {
            }
        }
    }
}
