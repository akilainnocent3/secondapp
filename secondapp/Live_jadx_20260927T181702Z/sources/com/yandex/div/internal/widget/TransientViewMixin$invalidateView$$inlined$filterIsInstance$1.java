package com.yandex.div.internal.widget;

import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import ds.l;
import kotlin.jvm.internal.o0;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TransientViewMixin$invalidateView$$inlined$filterIsInstance$1 extends o0 implements l<Object, Boolean> {
    public static final TransientViewMixin$invalidateView$$inlined$filterIsInstance$1 INSTANCE = new TransientViewMixin$invalidateView$$inlined$filterIsInstance$1();

    public TransientViewMixin$invalidateView$$inlined$filterIsInstance$1() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.l
    @oy.l
    public final Boolean invoke(@m Object obj) {
        return Boolean.valueOf(obj instanceof DivBorderSupports);
    }
}
