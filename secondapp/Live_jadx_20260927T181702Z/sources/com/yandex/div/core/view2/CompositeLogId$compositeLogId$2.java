package com.yandex.div.core.view2;

import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class CompositeLogId$compositeLogId$2 extends o0 implements ds.a<String> {
    final /* synthetic */ CompositeLogId this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeLogId$compositeLogId$2(CompositeLogId compositeLogId) {
        super(0);
        this.this$0 = compositeLogId;
    }

    @Override // ds.a
    @oy.l
    public final String invoke() {
        return this.this$0.formatCompositeLogId();
    }
}
