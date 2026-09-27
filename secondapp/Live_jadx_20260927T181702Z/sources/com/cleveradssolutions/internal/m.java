package com.cleveradssolutions.internal;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class m {
    public static void a(Throwable th2, StringBuilder sb2, int i10, String str) {
        sb2.append(Log.getStackTraceString(th2));
        Log.println(i10, str, sb2.toString());
    }
}
