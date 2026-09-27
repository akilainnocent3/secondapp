package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class c5 implements i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f74629a;

    public c5(Context context) {
        this.f74629a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new sf(this.f74629a.getSharedPreferences("com.startapp.sdk.extras", 0), new b5(this));
    }
}
