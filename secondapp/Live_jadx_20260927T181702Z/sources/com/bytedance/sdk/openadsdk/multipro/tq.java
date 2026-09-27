package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.khx;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {
    public static Boolean hww;

    public static void hww() {
        Boolean bool = Boolean.TRUE;
        hww = bool;
        com.bytedance.sdk.openadsdk.multipro.vy.hww.hww("sp_multi_info", "is_support_multi_process", bool);
    }

    public static boolean sd() {
        Boolean bool = hww;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!khx.hv()) {
            return false;
        }
        if (hww == null) {
            hww = Boolean.valueOf(com.bytedance.sdk.openadsdk.multipro.vy.hww.hww("sp_multi_info", "is_support_multi_process", false));
        }
        return hww.booleanValue();
    }

    public static void tq() {
        hww = Boolean.FALSE;
        BinderPoolService.hww = true;
    }
}
