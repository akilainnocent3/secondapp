package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class rs {
    private static volatile Handler hww;

    public static Handler hww() {
        return com.bytedance.sdk.component.ok.hww.hww.hww().tq();
    }

    public static Handler tq() {
        if (hww == null) {
            synchronized (rs.class) {
                try {
                    if (hww == null) {
                        hww = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hww;
    }
}
