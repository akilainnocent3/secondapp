package com.bytedance.sdk.openadsdk.multipro.tq;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    public long f37505hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    public long f37506hv;
    public boolean hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public boolean f37507sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public boolean f37508tq;
    public long vgm;
    public boolean vy;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.multipro.tq.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0385hww {
        hww hu();
    }

    public hww hww(boolean z10) {
        this.vy = z10;
        return this;
    }

    public hww sd(boolean z10) {
        this.f37508tq = z10;
        return this;
    }

    public hww tq(boolean z10) {
        this.hww = z10;
        return this;
    }

    public hww vy(boolean z10) {
        this.f37507sd = z10;
        return this;
    }

    public hww hww(long j10) {
        this.f37506hv = j10;
        return this;
    }

    public hww sd(long j10) {
        this.vgm = j10;
        return this;
    }

    public hww tq(long j10) {
        this.f37505hu = j10;
        return this;
    }

    public JSONObject hww() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.hww);
            jSONObject.put("isFromVideoDetailPage", this.f37508tq);
            jSONObject.put("isFromDetailPage", this.f37507sd);
            jSONObject.put("duration", this.f37506hv);
            jSONObject.put("totalPlayDuration", this.f37505hu);
            jSONObject.put("currentPlayPosition", this.vgm);
            jSONObject.put("isAutoPlay", this.vy);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static hww hww(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        hww hwwVar = new hww();
        hwwVar.tq(jSONObject.optBoolean("isCompleted"));
        hwwVar.sd(jSONObject.optBoolean("isFromVideoDetailPage"));
        hwwVar.vy(jSONObject.optBoolean("isFromDetailPage"));
        hwwVar.hww(jSONObject.optLong("duration"));
        hwwVar.tq(jSONObject.optLong("totalPlayDuration"));
        hwwVar.sd(jSONObject.optLong("currentPlayPosition"));
        hwwVar.hww(jSONObject.optBoolean("isAutoPlay"));
        return hwwVar;
    }
}
