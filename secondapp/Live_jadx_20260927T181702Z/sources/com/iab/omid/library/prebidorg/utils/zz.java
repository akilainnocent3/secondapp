package com.iab.omid.library.prebidorg.utils;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zz {
    private static UiModeManager zz;

    public static com.iab.omid.library.prebidorg.adsession.zw zz() {
        int currentModeType = zz.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? com.iab.omid.library.prebidorg.adsession.zw.OTHER : com.iab.omid.library.prebidorg.adsession.zw.CTV;
        }
        return com.iab.omid.library.prebidorg.adsession.zw.MOBILE;
    }

    public static void zz(Context context) {
        if (context != null) {
            zz = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
