package com.startapp.sdk.internal;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class w5 implements i7 {
    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        l8 l8Var = new l8("startapp-".concat("db"));
        l8Var.start();
        return new k8(new Handler(l8Var.getLooper()));
    }
}
