package com.iab.omid.library.prebidorg.internal;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class zu {

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private final String f53746zr;

    /* JADX INFO: renamed from: zs, reason: collision with root package name */
    private final com.iab.omid.library.prebidorg.adsession.zx f53747zs;

    /* JADX INFO: renamed from: zt, reason: collision with root package name */
    private final String f53748zt;
    private final com.iab.omid.library.prebidorg.weakreference.zz zz;

    public zu(View view, com.iab.omid.library.prebidorg.adsession.zx zxVar, String str) {
        this.zz = new com.iab.omid.library.prebidorg.weakreference.zz(view);
        this.f53746zr = view.getClass().getCanonicalName();
        this.f53747zs = zxVar;
        this.f53748zt = str;
    }

    public com.iab.omid.library.prebidorg.adsession.zx zr() {
        return this.f53747zs;
    }

    public com.iab.omid.library.prebidorg.weakreference.zz zs() {
        return this.zz;
    }

    public String zt() {
        return this.f53746zr;
    }

    public String zz() {
        return this.f53748zt;
    }
}
