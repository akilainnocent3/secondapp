package com.inmobi.media;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Aa {
    public static final int a() {
        return Build.VERSION.SDK_INT == 28 ? 2 : 1;
    }
}
