package com.yandex.div.core.view2.divs;

import android.view.View;
import dr.w2;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivActionBinder$bindTapActions$setTapListener$1 extends o0 implements ds.a<w2> {
    final /* synthetic */ View.OnClickListener $listener;
    final /* synthetic */ View $target;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivActionBinder$bindTapActions$setTapListener$1(View.OnClickListener onClickListener, View view) {
        super(0);
        this.$listener = onClickListener;
        this.$target = view;
    }

    @Override // ds.a
    public /* bridge */ /* synthetic */ w2 invoke() {
        invoke2();
        return w2.f79517a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$listener.onClick(this.$target);
    }
}
