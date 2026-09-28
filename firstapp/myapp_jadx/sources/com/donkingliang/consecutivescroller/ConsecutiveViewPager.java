package com.donkingliang.consecutivescroller;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import defpackage.g9i0;
import defpackage.osm;
import defpackage.r6i0;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConsecutiveViewPager extends ViewPager implements osm {
    public int x0;

    public ConsecutiveViewPager(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (a.k(this)) {
            view.setVerticalScrollBarEnabled(false);
            view.setHorizontalScrollBarEnabled(false);
            view.setOverScrollMode(2);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            r6i0.d.m(view, false);
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).setClipToPadding(false);
            }
        }
    }

    public int getAdjustHeight() {
        return this.x0;
    }

    @Override // defpackage.osm
    public View getCurrentScrollerView() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getX() == getPaddingLeft() + getScrollX()) {
                return childAt;
            }
        }
        return this;
    }

    @Override // defpackage.osm
    public List<View> getScrolledViews() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                arrayList.add(getChildAt(i));
            }
        }
        return arrayList;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i, int i2) {
        ViewParent parent = getParent();
        if (parent instanceof ConsecutiveScrollerLayout) {
            ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) parent;
            if (consecutiveScrollerLayout.indexOfChild(this) == consecutiveScrollerLayout.getChildCount() - 1 && this.x0 > 0) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.getDefaultSize(0, i2) - this.x0, View.MeasureSpec.getMode(i2)));
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setAdjustHeight(int i) {
        if (this.x0 != i) {
            this.x0 = i;
            requestLayout();
        }
    }

    public ConsecutiveViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
