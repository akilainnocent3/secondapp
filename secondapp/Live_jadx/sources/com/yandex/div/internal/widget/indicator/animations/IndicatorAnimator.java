package com.yandex.div.internal.widget.indicator.animations;

import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface IndicatorAnimator {
    int getBorderColorAt(int i10);

    float getBorderWidthAt(int i10);

    int getColorAt(int i10);

    @l
    IndicatorParams.ItemSize getItemSizeAt(int i10);

    @m
    RectF getSelectedItemRect(float f10, float f11, float f12, boolean z10);

    void onPageScrolled(int i10, float f10);

    void onPageSelected(int i10);

    void overrideItemWidth(float f10);

    void setItemsCount(int i10);

    void updateSpaceBetweenCenters(float f10);
}
