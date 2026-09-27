package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class j4 implements i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f75021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f75022b;

    public j4(com.startapp.sdk.components.a aVar, Context context) {
        this.f75022b = aVar;
        this.f75021a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f75021a;
        ib ibVar = new ib(new i4(this));
        com.startapp.sdk.components.a aVar = this.f75022b;
        return new jg(context, ibVar, aVar.f74465j, aVar.E, new h4());
    }
}
