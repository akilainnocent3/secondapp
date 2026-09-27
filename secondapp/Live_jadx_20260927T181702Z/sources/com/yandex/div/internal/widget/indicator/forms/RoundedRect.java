package com.yandex.div.internal.widget.indicator.forms;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class RoundedRect implements SingleIndicatorDrawer {

    @l
    private final Paint paint = new Paint(1);

    @l
    private final IndicatorParams.Style params;

    @l
    private final RectF rect;

    @l
    private final Paint strokePaint;

    public RoundedRect(@l IndicatorParams.Style style) {
        this.params = style;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.strokePaint = paint;
        this.rect = new RectF();
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void draw(@l Canvas canvas, float f10, float f11, @l IndicatorParams.ItemSize itemSize, int i10, float f12, int i11) {
        m0.n(itemSize, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.ItemSize.RoundedRect");
        IndicatorParams.ItemSize.RoundedRect roundedRect = (IndicatorParams.ItemSize.RoundedRect) itemSize;
        this.paint.setColor(i10);
        RectF rectF = this.rect;
        rectF.left = f10 - (roundedRect.getItemWidth() / 2.0f);
        rectF.top = f11 - (roundedRect.getItemHeight() / 2.0f);
        rectF.right = f10 + (roundedRect.getItemWidth() / 2.0f);
        float itemHeight = f11 + (roundedRect.getItemHeight() / 2.0f);
        rectF.bottom = itemHeight;
        if (f12 > 0.0f) {
            float f13 = f12 / 2.0f;
            rectF.left += f13;
            rectF.top += f13;
            rectF.right -= f13;
            rectF.bottom = itemHeight - f13;
        }
        canvas.drawRoundRect(this.rect, roundedRect.getCornerRadius(), roundedRect.getCornerRadius(), this.paint);
        if (i11 == 0 || f12 == 0.0f) {
            return;
        }
        Paint paint = this.strokePaint;
        paint.setColor(i11);
        paint.setStrokeWidth(f12);
        canvas.drawRoundRect(this.rect, roundedRect.getCornerRadius(), roundedRect.getCornerRadius(), this.strokePaint);
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void drawSelected(@l Canvas canvas, @l RectF rectF) {
        IndicatorParams.Shape activeShape = this.params.getActiveShape();
        m0.n(activeShape, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
        IndicatorParams.Shape.RoundedRect roundedRect = (IndicatorParams.Shape.RoundedRect) activeShape;
        IndicatorParams.ItemSize.RoundedRect itemSize = roundedRect.getItemSize();
        this.paint.setColor(this.params.getActiveShape().getColor());
        canvas.drawRoundRect(rectF, itemSize.getCornerRadius(), itemSize.getCornerRadius(), this.paint);
        if (roundedRect.getStrokeColor() == 0 || roundedRect.getStrokeWidth() == 0.0f) {
            return;
        }
        Paint paint = this.strokePaint;
        paint.setColor(roundedRect.getStrokeColor());
        paint.setStrokeWidth(roundedRect.getStrokeWidth());
        canvas.drawRoundRect(rectF, itemSize.getCornerRadius(), itemSize.getCornerRadius(), this.strokePaint);
    }
}
