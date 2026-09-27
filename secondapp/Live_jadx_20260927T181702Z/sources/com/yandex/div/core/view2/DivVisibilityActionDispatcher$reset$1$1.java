package com.yandex.div.core.view2;

import com.yandex.div.DivDataTag;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivVisibilityActionDispatcher$reset$1$1 extends o0 implements ds.l<CompositeLogId, Boolean> {
    final /* synthetic */ DivDataTag $tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivVisibilityActionDispatcher$reset$1$1(DivDataTag divDataTag) {
        super(1);
        this.$tag = divDataTag;
    }

    @Override // ds.l
    @oy.l
    public final Boolean invoke(@oy.l CompositeLogId compositeLogId) {
        return Boolean.valueOf(m0.g(compositeLogId.getDataTag(), this.$tag.getId()));
    }
}
