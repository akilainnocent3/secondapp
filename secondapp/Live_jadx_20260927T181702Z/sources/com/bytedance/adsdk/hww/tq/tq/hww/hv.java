package com.bytedance.adsdk.hww.tq.tq.hww;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hv extends bs {
    public hv() {
        super(com.bytedance.adsdk.hww.tq.vy.sd.GT_EQ);
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public Object hww(Map<String, JSONObject> map) {
        Object objHww;
        Object objHww2 = this.hww.hww(map);
        if (objHww2 == null || (objHww = this.f31894tq.hww(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.hww.tq.hv.hww.vy.hww(objHww2, (Number) objHww)).booleanValue());
    }
}
