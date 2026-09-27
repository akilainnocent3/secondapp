package com.yandex.div.internal.widget.indicator.forms;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface SingleIndicatorDrawer {
    void draw(@l Canvas canvas, float f10, float f11, @l IndicatorParams.ItemSize itemSize, int i10, float f12, int i11);

    void drawSelected(@l Canvas canvas, @l RectF rectF);
}
