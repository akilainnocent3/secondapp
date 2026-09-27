package com.bytedance.adsdk.hww.tq.tq.hww;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class jpb extends bs {
    private static final ThreadLocal<StringBuilder> vy = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.hww.tq.tq.hww.jpb.1
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public jpb() {
        super(com.bytedance.adsdk.hww.tq.vy.sd.PLUS);
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public Object hww(Map<String, JSONObject> map) {
        Object objHww;
        Object objHww2 = this.hww.hww(map);
        if (objHww2 == null || (objHww = this.f31894tq.hww(map)) == null) {
            return null;
        }
        if (!(objHww2 instanceof String) && !(objHww instanceof String)) {
            return com.bytedance.adsdk.hww.tq.hv.hww.ok.hww((Number) objHww2, (Number) objHww);
        }
        StringBuilder sb2 = vy.get();
        sb2.append(objHww2);
        sb2.append(objHww);
        String string = sb2.toString();
        sb2.setLength(0);
        return string;
    }
}
