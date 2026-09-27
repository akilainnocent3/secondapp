package com.iab.omid.library.prebidorg.internal;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class zv {

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private static zv f53749zr = new zv();
    private Context zz;

    private zv() {
    }

    public static zv zr() {
        return f53749zr;
    }

    public Context zz() {
        return this.zz;
    }

    public void zz(Context context) {
        this.zz = context != null ? context.getApplicationContext() : null;
    }
}
