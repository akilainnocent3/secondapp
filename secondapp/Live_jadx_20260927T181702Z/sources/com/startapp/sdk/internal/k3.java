package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class k3 implements i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f75076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a6 f75077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f75078c;

    public k3(com.startapp.sdk.components.a aVar, Context context, a6 a6Var) {
        this.f75078c = aVar;
        this.f75076a = context;
        this.f75077b = a6Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new vh(this.f75076a, this.f75078c.E, new ib(new j3(this)), this.f75078c.f74465j, this.f75077b);
    }
}
