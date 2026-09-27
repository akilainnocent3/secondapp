package com.bytedance.adsdk.hww.tq.vy;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public enum hww implements hv {
    TRUE,
    FALSE,
    NULL;

    private static final Map<String, hww> vy = new HashMap(128);

    static {
        for (hww hwwVar : values()) {
            vy.put(hwwVar.name().toLowerCase(), hwwVar);
        }
    }

    public static hww hww(String str) {
        return vy.get(str.toLowerCase());
    }
}
