package com.bytedance.sdk.openadsdk.utils;

import sc.k;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class omn {
    public static int hww() {
        try {
            int iMaxMemory = (int) (Runtime.getRuntime().maxMemory() / k.L);
            if (iMaxMemory <= 2) {
                return 2;
            }
            if (iMaxMemory >= 5) {
                return 5;
            }
            return iMaxMemory;
        } catch (Throwable unused) {
            return 2;
        }
    }
}
