package com.yandex.div.core.view2.divs;

import dr.w2;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivInputBinder$observeValidators$2$1 extends o0 implements ds.l<Boolean, w2> {
    final /* synthetic */ int $index;
    final /* synthetic */ ds.l<Integer, w2> $revalidateExpressionValidator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DivInputBinder$observeValidators$2$1(ds.l<? super Integer, w2> lVar, int i10) {
        super(1);
        this.$revalidateExpressionValidator = lVar;
        this.$index = i10;
    }

    @Override // ds.l
    public /* bridge */ /* synthetic */ w2 invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return w2.f79517a;
    }

    public final void invoke(boolean z10) {
        this.$revalidateExpressionValidator.invoke(Integer.valueOf(this.$index));
    }
}
