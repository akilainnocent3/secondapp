package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class y4 implements i7 {
    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new k8(new Handler(Looper.getMainLooper()));
    }
}
