package com.yandex.div.core.view2.divs;

import dr.w2;
import kotlin.jvm.internal.o0;
import mq.lq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class VisibilityAwareAdapter$subscribeOnElements$1$subscription$1 extends o0 implements ds.l<lq, w2> {
    final /* synthetic */ int $index;
    final /* synthetic */ VisibilityAwareAdapter<VH> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VisibilityAwareAdapter$subscribeOnElements$1$subscription$1(VisibilityAwareAdapter<VH> visibilityAwareAdapter, int i10) {
        super(1);
        this.this$0 = visibilityAwareAdapter;
        this.$index = i10;
    }

    @Override // ds.l
    public /* bridge */ /* synthetic */ w2 invoke(lq lqVar) {
        invoke2(lqVar);
        return w2.f79517a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@oy.l lq lqVar) {
        this.this$0.updateItemVisibility(this.$index, lqVar);
    }
}
