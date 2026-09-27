package com.bytedance.sdk.component.adexpress.vy;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu {
    public static boolean hww(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }

    public static boolean tq(String str) {
        return com.bytedance.sdk.component.adexpress.vy.tq() && hww(str);
    }
}
