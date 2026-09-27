package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import com.yandex.div.core.view2.BindingContext;
import mq.z4;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface DivBorderSupports {
    @m
    DivBorderDrawer getDivBorderDrawer();

    boolean getNeedClipping();

    void invalidateBorder();

    void onBoundsChanged(int i10, int i11);

    void releaseBorderDrawer();

    void setBorder(@l BindingContext bindingContext, @m z4 z4Var, @l View view);

    void setNeedClipping(boolean z10);
}
