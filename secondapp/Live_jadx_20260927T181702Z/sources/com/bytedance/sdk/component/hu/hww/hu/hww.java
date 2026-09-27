package com.bytedance.sdk.component.hu.hww.hu;

import com.bytedance.sdk.component.hu.hww.ok;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    private static volatile tq hww;

    public static tq hww() {
        if (hww == null) {
            synchronized (tq.class) {
                try {
                    if (hww == null) {
                        hww = new sd(ok.vgm().hu(), new hu(ok.vgm().hu()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hww;
    }
}
