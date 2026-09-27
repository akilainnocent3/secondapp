package com.bytedance.adsdk.hww.tq.tq.hww;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class vy extends bs {
    public vy() {
        super(com.bytedance.adsdk.hww.tq.vy.sd.EQ);
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public Object hww(Map<String, JSONObject> map) {
        Object objHww = this.hww.hww(map);
        Object objHww2 = this.f31894tq.hww(map);
        if (objHww == null && objHww2 == null) {
            return Boolean.TRUE;
        }
        if (objHww == null && objHww2 != null) {
            return Boolean.FALSE;
        }
        if (objHww == null || objHww2 != null) {
            return ((objHww instanceof Number) && (objHww2 instanceof Number)) ? Boolean.valueOf(com.bytedance.adsdk.hww.tq.hv.hww.tq.hww((Number) objHww, (Number) objHww2)) : Boolean.valueOf(objHww.equals(objHww2));
        }
        return Boolean.FALSE;
    }
}
