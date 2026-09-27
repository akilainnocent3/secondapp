package com.bytedance.adsdk.ugeno.vy.hww;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    private volatile Map<String, sd> hww = new HashMap();

    public sd hww(String str) {
        if (this.hww.containsKey(str) && this.hww.get(str) != null) {
            return this.hww.get(str);
        }
        tq tqVar = new tq();
        this.hww.put(str, tqVar);
        return tqVar;
    }

    public void hww(String str, sd sdVar) {
        if (!this.hww.containsKey(str) || this.hww.get(str) == null) {
            this.hww.put(str, sdVar);
        }
    }
}
