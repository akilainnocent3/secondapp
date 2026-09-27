package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class i3 implements i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f74970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a6 f74971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f74972c;

    public i3(com.startapp.sdk.components.a aVar, Context context, a6 a6Var) {
        this.f74972c = aVar;
        this.f74970a = context;
        this.f74971b = a6Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f74970a;
        ib ibVar = new ib(new h3(this));
        com.startapp.sdk.components.a aVar = this.f74972c;
        return new mh(context, ibVar, aVar.E, aVar.f74465j, this.f74971b, new g3());
    }
}
