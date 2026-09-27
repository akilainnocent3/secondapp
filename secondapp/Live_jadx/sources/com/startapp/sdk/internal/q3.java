package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class q3 implements i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f75401a;

    public q3(Context context) {
        this.f75401a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new fa(new sf(this.f75401a.getSharedPreferences("StartApp-54ff24db2aee60b9", 0)));
    }
}
