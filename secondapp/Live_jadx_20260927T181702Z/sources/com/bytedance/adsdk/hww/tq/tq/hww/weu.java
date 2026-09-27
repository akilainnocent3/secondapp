package com.bytedance.adsdk.hww.tq.tq.hww;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class weu implements com.bytedance.adsdk.hww.tq.tq.hww {
    private Number hww;

    public weu(String str) {
        if (str.indexOf(46) < 0) {
            try {
                this.hww = Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                this.hww = Long.valueOf(str);
            }
        } else {
            Float fValueOf = Float.valueOf(str);
            this.hww = fValueOf;
            if (Float.isInfinite(fValueOf.floatValue())) {
                this.hww = Double.valueOf(str);
            }
        }
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
        return this.hww.toString();
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public com.bytedance.adsdk.hww.tq.vy.hv hww() {
        return com.bytedance.adsdk.hww.tq.vy.hu.NUMBER;
    }
}
