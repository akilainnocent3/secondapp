package com.bytedance.adsdk.hww.tq.tq.hww;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class mrs implements com.bytedance.adsdk.hww.tq.tq.tq {
    private com.bytedance.adsdk.hww.tq.tq.hww hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private com.bytedance.adsdk.hww.tq.tq.hww f31895sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private com.bytedance.adsdk.hww.tq.tq.hww f31896tq;

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public Object hww(Map<String, JSONObject> map) {
        Object objHww = this.hww.hww(map);
        if (objHww == null) {
            return null;
        }
        return ((Boolean) objHww).booleanValue() ? this.f31896tq.hww(map) : this.f31895sd.hww(map);
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.tq
    public void sd(com.bytedance.adsdk.hww.tq.tq.hww hwwVar) {
        this.f31895sd = hwwVar;
    }

    public String toString() {
        return tq();
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.tq
    public void tq(com.bytedance.adsdk.hww.tq.tq.hww hwwVar) {
        this.f31896tq = hwwVar;
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public String tq() {
        return this.hww.tq() + "?" + this.f31896tq.tq() + ":" + this.f31895sd.tq();
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public com.bytedance.adsdk.hww.tq.vy.hv hww() {
        return com.bytedance.adsdk.hww.tq.vy.hu.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.tq
    public void hww(com.bytedance.adsdk.hww.tq.tq.hww hwwVar) {
        this.hww = hwwVar;
    }
}
