package com.yandex.div.core.view2.divs;

import dr.w2;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivActionBinder$bindDivActions$1$1 extends o0 implements ds.l<Object, w2> {
    final /* synthetic */ ds.a<w2> $onApply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivActionBinder$bindDivActions$1$1(ds.a<w2> aVar) {
        super(1);
        this.$onApply = aVar;
    }

    @Override // ds.l
    public /* bridge */ /* synthetic */ w2 invoke(Object obj) {
        invoke2(obj);
        return w2.f79517a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@oy.l Object obj) {
        this.$onApply.invoke();
    }
}
