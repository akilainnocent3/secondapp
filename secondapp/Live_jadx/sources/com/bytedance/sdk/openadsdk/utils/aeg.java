package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.ironsource.Z3;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class aeg {
    public static String hww(Context context) {
        int iHww = com.bytedance.sdk.component.utils.zvy.hww(context, 0L);
        if (iHww == 2) {
            return "2g";
        }
        if (iHww == 3) {
            return Z3.f60405a;
        }
        if (iHww == 4) {
            return Z3.f60406b;
        }
        if (iHww != 5) {
            return iHww != 6 ? "mobile" : "5g";
        }
        return "4g";
    }
}
