package com.bytedance.sdk.openadsdk.grv.tq;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.syb;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu {
    public static boolean hww(View view, int i10) {
        return hww(view, false, i10);
    }

    public static boolean hww(View view, boolean z10, int i10) {
        if (view == null) {
            return false;
        }
        return syb.hww(view, z10 ? 30 : 50, i10, false);
    }
}
