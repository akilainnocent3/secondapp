package com.yandex.div.core.widget;

import java.util.List;
import kotlin.jvm.internal.o0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class GridContainer$Grid$_columns$1 extends o0 implements ds.a<List<? extends GridContainer.Line>> {
    final /* synthetic */ GridContainer.Grid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridContainer$Grid$_columns$1(GridContainer.Grid grid) {
        super(0);
        this.this$0 = grid;
    }

    @Override // ds.a
    @l
    public final List<? extends GridContainer.Line> invoke() {
        return this.this$0.measureColumns();
    }
}
