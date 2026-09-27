package com.bytedance.adsdk.tq;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class omn {
    private final Map<String, String> hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private boolean f32129tq;

    public String hww(String str) {
        return str;
    }

    public final String tq(String str, String str2) {
        if (this.f32129tq && this.hww.containsKey(str2)) {
            return this.hww.get(str2);
        }
        String strHww = hww(str, str2);
        if (this.f32129tq) {
            this.hww.put(str2, strHww);
        }
        return strHww;
    }

    public String hww(String str, String str2) {
        return hww(str2);
    }
}
