package com.yandex.div.internal.widget.indicator.animations;

import android.animation.ArgbEvaluator;
import android.graphics.RectF;
import android.util.SparseArray;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import dr.o0;
import jq.a;
import k.k;
import k.w;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ScaleIndicatorAnimator implements IndicatorAnimator {
    private int itemsCount;

    @l
    private final IndicatorParams.Style styleParams;

    @l
    private final ArgbEvaluator colorEvaluator = new ArgbEvaluator();

    @l
    private final SparseArray<Float> itemsScale = new SparseArray<>();

    public ScaleIndicatorAnimator(@l IndicatorParams.Style style) {
        this.styleParams = style;
    }

    @k
    private final int calculateColor(@w(from = 0.0d, to = 1.0d) float f10, int i10, int i11) {
        Object objEvaluate = this.colorEvaluator.evaluate(f10, Integer.valueOf(i10), Integer.valueOf(i11));
        m0.n(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objEvaluate).intValue();
    }

    private final float getScaleAt(int i10) {
        return this.itemsScale.get(i10, Float.valueOf(0.0f)).floatValue();
    }

    private final float interpolate(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    private final void scaleIndicatorByOffset(int i10, float f10) {
        if (f10 == 0.0f) {
            this.itemsScale.remove(i10);
        } else {
            this.itemsScale.put(i10, Float.valueOf(Math.abs(f10)));
        }
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public int getBorderColorAt(int i10) {
        IndicatorParams.Shape activeShape = this.styleParams.getActiveShape();
        if (!(activeShape instanceof IndicatorParams.Shape.RoundedRect)) {
            return 0;
        }
        IndicatorParams.Shape inactiveShape = this.styleParams.getInactiveShape();
        m0.n(inactiveShape, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
        return calculateColor(getScaleAt(i10), ((IndicatorParams.Shape.RoundedRect) inactiveShape).getStrokeColor(), ((IndicatorParams.Shape.RoundedRect) activeShape).getStrokeColor());
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public float getBorderWidthAt(int i10) {
        IndicatorParams.Shape activeShape = this.styleParams.getActiveShape();
        if (!(activeShape instanceof IndicatorParams.Shape.RoundedRect)) {
            return 0.0f;
        }
        IndicatorParams.Shape inactiveShape = this.styleParams.getInactiveShape();
        m0.n(inactiveShape, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
        IndicatorParams.Shape.RoundedRect roundedRect = (IndicatorParams.Shape.RoundedRect) inactiveShape;
        return roundedRect.getStrokeWidth() + ((((IndicatorParams.Shape.RoundedRect) activeShape).getStrokeWidth() - roundedRect.getStrokeWidth()) * getScaleAt(i10));
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public int getColorAt(int i10) {
        return calculateColor(getScaleAt(i10), this.styleParams.getInactiveShape().getColor(), this.styleParams.getActiveShape().getColor());
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    @l
    public IndicatorParams.ItemSize getItemSizeAt(int i10) {
        IndicatorParams.Shape activeShape = this.styleParams.getActiveShape();
        if (activeShape instanceof IndicatorParams.Shape.Circle) {
            IndicatorParams.Shape inactiveShape = this.styleParams.getInactiveShape();
            m0.n(inactiveShape, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.Circle");
            return new IndicatorParams.ItemSize.Circle(interpolate(((IndicatorParams.Shape.Circle) inactiveShape).getItemSize().getRadius(), ((IndicatorParams.Shape.Circle) activeShape).getItemSize().getRadius(), getScaleAt(i10)));
        }
        if (!(activeShape instanceof IndicatorParams.Shape.RoundedRect)) {
            throw new o0();
        }
        IndicatorParams.Shape inactiveShape2 = this.styleParams.getInactiveShape();
        m0.n(inactiveShape2, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
        IndicatorParams.Shape.RoundedRect roundedRect = (IndicatorParams.Shape.RoundedRect) inactiveShape2;
        IndicatorParams.Shape.RoundedRect roundedRect2 = (IndicatorParams.Shape.RoundedRect) activeShape;
        return new IndicatorParams.ItemSize.RoundedRect(interpolate(roundedRect.getItemSize().getItemWidth() + roundedRect.getStrokeWidth(), roundedRect2.getItemSize().getItemWidth() + roundedRect2.getStrokeWidth(), getScaleAt(i10)), interpolate(roundedRect.getItemSize().getItemHeight() + roundedRect.getStrokeWidth(), roundedRect2.getItemSize().getItemHeight() + roundedRect2.getStrokeWidth(), getScaleAt(i10)), interpolate(roundedRect.getItemSize().getCornerRadius(), roundedRect2.getItemSize().getCornerRadius(), getScaleAt(i10)));
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    @m
    public RectF getSelectedItemRect(float f10, float f11, float f12, boolean z10) {
        return null;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void onPageScrolled(int i10, float f10) {
        scaleIndicatorByOffset(i10, 1.0f - f10);
        int i11 = this.itemsCount;
        if (i10 < i11 - 1) {
            scaleIndicatorByOffset(i10 + 1, f10);
        } else if (i11 > 1) {
            scaleIndicatorByOffset(0, f10);
        }
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void onPageSelected(int i10) {
        this.itemsScale.clear();
        this.itemsScale.put(i10, Float.valueOf(1.0f));
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public /* synthetic */ void overrideItemWidth(float f10) {
        a.b(this, f10);
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void setItemsCount(int i10) {
        this.itemsCount = i10;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public /* synthetic */ void updateSpaceBetweenCenters(float f10) {
        a.d(this, f10);
    }
}
