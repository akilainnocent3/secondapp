package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.bs;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy {
    public static String hww = "com.bytedance.openadsdk";

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public static String f37509tq = "content://" + hww + ".TTMultiProvider";

    static {
        hww();
    }

    public static void hww() {
        if (bs.hww() != null) {
            hww = bs.hww().getPackageName();
            f37509tq = "content://" + hww + ".TTMultiProvider";
        }
    }
}
