package com.yandex.div.storage;

import dr.w2;
import ds.l;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivStorageImpl$isTemplateExists$executionResult$1 extends o0 implements l<Boolean, w2> {
    final /* synthetic */ l1.a $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivStorageImpl$isTemplateExists$executionResult$1(l1.a aVar) {
        super(1);
        this.$result = aVar;
    }

    @Override // ds.l
    public /* bridge */ /* synthetic */ w2 invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return w2.f79517a;
    }

    public final void invoke(boolean z10) {
        this.$result.f102742b = z10;
    }
}
