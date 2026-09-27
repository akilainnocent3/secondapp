package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class t4 implements i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f75531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f75532b;

    public t4(com.startapp.sdk.components.a aVar, Context context) {
        this.f75532b = aVar;
        this.f75531a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new ig(this.f75532b.f74463h, new ib(new s4(this)), new r4(), this.f75531a);
    }
}
