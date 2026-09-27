package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ViewPagerFixedSizeLayout extends FrameLayout {
    private int _collapsiblePaddingBottom;
    private boolean animateOnScroll;

    @m
    private HeightCalculator heightCalculator;

    @m
    private Integer lastHeightMeasureSpec;

    @m
    private Rect visibleRect;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface HeightCalculator {
        void dropMeasureCache();

        int measureHeight(int i10, int i11);

        void restoreInstanceState(@l SparseArray<Parcelable> sparseArray);

        void saveInstanceState(@l SparseArray<Parcelable> sparseArray);

        void setPositionAndOffsetForMeasure(int i10, float f10);

        boolean shouldRequestLayoutOnScroll(int i10, float f10);
    }

    @cs.k
    public ViewPagerFixedSizeLayout(@l Context context) {
        this(context, null, 0, 6, null);
    }

    public final boolean getAnimateOnScroll() {
        return this.animateOnScroll;
    }

    public final int getCollapsiblePaddingBottom() {
        return this._collapsiblePaddingBottom;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        this.lastHeightMeasureSpec = Integer.valueOf(i11);
        HeightCalculator heightCalculator = this.heightCalculator;
        if (heightCalculator != null) {
            m0.m(heightCalculator);
            i11 = View.MeasureSpec.makeMeasureSpec(heightCalculator.measureHeight(i10, i11), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public final void setAnimateOnScroll(boolean z10) {
        this.animateOnScroll = z10;
    }

    public final void setCollapsiblePaddingBottom(int i10) {
        if (this._collapsiblePaddingBottom != i10) {
            this._collapsiblePaddingBottom = i10;
        }
    }

    public final void setHeightCalculator(@m HeightCalculator heightCalculator) {
        this.heightCalculator = heightCalculator;
    }

    public final boolean shouldRequestLayoutOnScroll(int i10, float f10) {
        HeightCalculator heightCalculator;
        if (this.animateOnScroll && (heightCalculator = this.heightCalculator) != null && heightCalculator.shouldRequestLayoutOnScroll(i10, f10)) {
            Rect rect = this.visibleRect;
            if (rect == null) {
                rect = new Rect();
                this.visibleRect = rect;
            }
            getLocalVisibleRect(rect);
            if (rect.height() == getHeight()) {
                return true;
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824);
            Integer num = this.lastHeightMeasureSpec;
            int iMeasureHeight = heightCalculator.measureHeight(iMakeMeasureSpec, num != null ? num.intValue() : View.MeasureSpec.makeMeasureSpec(0, 0));
            if (iMeasureHeight != getHeight()) {
                int i11 = rect.top;
                if (iMeasureHeight <= rect.bottom && i11 <= iMeasureHeight) {
                    return true;
                }
            }
        }
        return false;
    }

    @cs.k
    public ViewPagerFixedSizeLayout(@l Context context, @m AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ViewPagerFixedSizeLayout(Context context, AttributeSet attributeSet, int i10, int i11, x xVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @cs.k
    public ViewPagerFixedSizeLayout(@l Context context, @m AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.animateOnScroll = true;
    }
}
