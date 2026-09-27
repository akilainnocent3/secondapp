package com.iab.omid.library.prebidorg.adsession;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zr {
    public static zr zz(zs zsVar, zt ztVar) {
        com.iab.omid.library.prebidorg.utils.zw.zz();
        com.iab.omid.library.prebidorg.utils.zw.zz(zsVar, "AdSessionConfiguration is null");
        com.iab.omid.library.prebidorg.utils.zw.zz(ztVar, "AdSessionContext is null");
        return new zf(zsVar, ztVar);
    }

    public abstract void zr();

    public abstract void zz();

    public abstract void zz(View view);

    public abstract void zz(View view, zx zxVar, String str);
}
