package com.unity3d.ads.core.data.datasource;

import dr.i1;
import dr.w2;
import ds.l;
import kotlin.jvm.internal.o0;
import or.f;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidFIdDataSource$invoke$1$1$1$1 extends o0 implements l<String, w2> {
    final /* synthetic */ f<String> $cont;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidFIdDataSource$invoke$1$1$1$1(f<? super String> fVar) {
        super(1);
        this.$cont = fVar;
    }

    @Override // ds.l
    public /* bridge */ /* synthetic */ w2 invoke(String str) {
        invoke2(str);
        return w2.f79517a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@m String str) {
        f<String> fVar = this.$cont;
        i1.a aVar = i1.f79460c;
        fVar.resumeWith(i1.b(str));
    }
}
