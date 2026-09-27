package com.bytedance.adsdk.hww.tq.tq.hww;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class omn implements com.bytedance.adsdk.hww.tq.tq.hww {
    private final String hww;

    public omn(String str) {
        this.hww = str;
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public Object hww(Map<String, JSONObject> map) {
        return this.hww;
    }

    public String toString() {
        return tq();
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public String tq() {
        return "'" + this.hww + "'";
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public com.bytedance.adsdk.hww.tq.vy.hv hww() {
        return com.bytedance.adsdk.hww.tq.vy.hu.STRING;
    }
}
