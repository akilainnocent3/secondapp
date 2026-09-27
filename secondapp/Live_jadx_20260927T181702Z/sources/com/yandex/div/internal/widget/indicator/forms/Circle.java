package com.yandex.div.internal.widget.indicator.forms;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class Circle implements SingleIndicatorDrawer {

    @l
    private final IndicatorParams.Style params;

    @l
    private final Paint paint = new Paint();

    @l
    private final RectF rect = new RectF();

    public Circle(@l IndicatorParams.Style style) {
        this.params = style;
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void draw(@l Canvas canvas, float f10, float f11, @l IndicatorParams.ItemSize itemSize, int i10, float f12, int i11) {
        m0.n(itemSize, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.ItemSize.Circle");
        IndicatorParams.ItemSize.Circle circle = (IndicatorParams.ItemSize.Circle) itemSize;
        this.paint.setColor(i10);
        RectF rectF = this.rect;
        rectF.left = f10 - circle.getRadius();
        rectF.top = f11 - circle.getRadius();
        rectF.right = f10 + circle.getRadius();
        rectF.bottom = f11 + circle.getRadius();
        canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), circle.getRadius(), this.paint);
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void drawSelected(@l Canvas canvas, @l RectF rectF) {
        this.paint.setColor(this.params.getActiveShape().getColor());
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2, this.paint);
    }
}
