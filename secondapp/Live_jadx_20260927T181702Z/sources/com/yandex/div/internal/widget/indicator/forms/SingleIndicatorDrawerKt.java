package com.yandex.div.internal.widget.indicator.forms;

import com.yandex.div.internal.widget.indicator.IndicatorParams;
import dr.o0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class SingleIndicatorDrawerKt {
    @l
    public static final SingleIndicatorDrawer getIndicatorDrawer(@l IndicatorParams.Style style) {
        IndicatorParams.Shape activeShape = style.getActiveShape();
        if (activeShape instanceof IndicatorParams.Shape.RoundedRect) {
            return new RoundedRect(style);
        }
        if (activeShape instanceof IndicatorParams.Shape.Circle) {
            return new Circle(style);
        }
        throw new o0();
    }
}
