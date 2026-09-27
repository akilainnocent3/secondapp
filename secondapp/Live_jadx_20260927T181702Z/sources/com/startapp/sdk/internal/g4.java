package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class g4 implements i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f74856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f74857b;

    public g4(com.startapp.sdk.components.a aVar, Context context) {
        this.f74857b = aVar;
        this.f74856a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f74856a;
        ib ibVar = this.f74857b.G;
        ib ibVar2 = new ib(new f4(this));
        com.startapp.sdk.components.a aVar = this.f74857b;
        return new l2(context, ibVar, ibVar2, aVar.f74465j, aVar.E, new e4());
    }
}
