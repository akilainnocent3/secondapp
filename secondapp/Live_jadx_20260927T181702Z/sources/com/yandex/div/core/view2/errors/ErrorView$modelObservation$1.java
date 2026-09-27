package com.yandex.div.core.view2.errors;

import dr.w2;
import ds.l;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ErrorView$modelObservation$1 extends o0 implements l<ErrorViewModel, w2> {
    final /* synthetic */ ErrorView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorView$modelObservation$1(ErrorView errorView) {
        super(1);
        this.this$0 = errorView;
    }

    @Override // ds.l
    public /* bridge */ /* synthetic */ w2 invoke(ErrorViewModel errorViewModel) {
        invoke2(errorViewModel);
        return w2.f79517a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@oy.l ErrorViewModel errorViewModel) {
        this.this$0.setViewModel(errorViewModel);
    }
}
