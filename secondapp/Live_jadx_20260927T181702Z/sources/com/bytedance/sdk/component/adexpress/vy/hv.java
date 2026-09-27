package com.bytedance.sdk.component.adexpress.vy;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv {
    public static boolean hww(String str) {
        if (com.bytedance.sdk.component.adexpress.vy.tq()) {
            return TextUtils.equals(str, "embeded_ad") || TextUtils.equals(str, "banner_ad");
        }
        return false;
    }
}
