package com.unity3d.services.core.network.core;

import dr.w2;
import ds.l;
import kotlin.jvm.internal.o0;
import org.chromium.net.UrlRequest;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class CronetClient$execute$2$2 extends o0 implements l<Throwable, w2> {
    final /* synthetic */ UrlRequest $req;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CronetClient$execute$2$2(UrlRequest urlRequest) {
        super(1);
        this.$req = urlRequest;
    }

    @Override // ds.l
    public /* bridge */ /* synthetic */ w2 invoke(Throwable th2) {
        invoke2(th2);
        return w2.f79517a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@m Throwable th2) {
        this.$req.cancel();
    }
}
