package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.sportybet.android.gp.tz.R;
import defpackage.ndv;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BottomNavigationMenuView extends NavigationBarMenuView {
    public final int q0;
    public final int r0;
    public final int s0;
    public final int t0;
    public boolean u0;
    public final ArrayList v0;

    public BottomNavigationMenuView(Context context) {
        super(context);
        this.v0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.q0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.r0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.s0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.t0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    public final NavigationBarItemView f(Context context) {
        return new BottomNavigationItemView(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                if (getLayoutDirection() == 1) {
                    int i8 = i5 - measuredWidth;
                    childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i6);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i6);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int iMax;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        int childCount = getChildCount();
        ArrayList arrayList = this.v0;
        arrayList.clear();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE);
        int i6 = 0;
        if (getItemIconGravity() == 0) {
            boolean zG = NavigationBarMenuView.g(getLabelVisibilityMode(), currentVisibleContentItemCount);
            int i7 = this.s0;
            if (zG && this.u0) {
                View childAt = getChildAt(getSelectedItemPosition());
                int visibility = childAt.getVisibility();
                int iMax2 = this.t0;
                if (visibility != 8) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), iMakeMeasureSpec);
                    iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
                }
                int i8 = currentVisibleContentItemCount - (childAt.getVisibility() != 8 ? 1 : 0);
                int iMin = Math.min(size - (this.r0 * i8), Math.min(iMax2, i7));
                int i9 = size - iMin;
                int iMin2 = Math.min(i9 / (i8 == 0 ? 1 : i8), this.q0);
                int i10 = i9 - (i8 * iMin2);
                int iA = 0;
                while (iA < childCount) {
                    if (getChildAt(iA).getVisibility() != 8) {
                        i5 = iA == getSelectedItemPosition() ? iMin : iMin2;
                        if (i10 > 0) {
                            i5++;
                            i10--;
                        }
                    } else {
                        i5 = 0;
                    }
                    iA = ndv.a(i5, iA, 1, arrayList);
                }
            } else {
                int iMin3 = Math.min(size / (currentVisibleContentItemCount == 0 ? 1 : currentVisibleContentItemCount), i7);
                int i11 = size - (currentVisibleContentItemCount * iMin3);
                int iA2 = 0;
                while (iA2 < childCount) {
                    if (getChildAt(iA2).getVisibility() == 8) {
                        i4 = 0;
                    } else if (i11 > 0) {
                        i4 = iMin3 + 1;
                        i11--;
                    } else {
                        i4 = iMin3;
                    }
                    iA2 = ndv.a(i4, iA2, 1, arrayList);
                }
            }
            i3 = 0;
            iMax = 0;
            while (i6 < childCount) {
                View childAt2 = getChildAt(i6);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i6)).intValue(), 1073741824), iMakeMeasureSpec);
                    childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                    int measuredWidth = childAt2.getMeasuredWidth() + i3;
                    iMax = Math.max(iMax, childAt2.getMeasuredHeight());
                    i3 = measuredWidth;
                }
                i6++;
            }
        } else {
            if (currentVisibleContentItemCount == 0) {
                currentVisibleContentItemCount = 1;
            }
            float f = size;
            float fMin = Math.min((currentVisibleContentItemCount + 3) / 10.0f, 0.9f) * f;
            float f2 = currentVisibleContentItemCount;
            int iRound = Math.round(fMin / f2);
            int iRound2 = Math.round(f / f2);
            int i12 = 0;
            int iMax3 = 0;
            while (i6 < childCount) {
                View childAt3 = getChildAt(i6);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound2, Integer.MIN_VALUE), iMakeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < iRound) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound, 1073741824), iMakeMeasureSpec);
                    }
                    int measuredWidth2 = childAt3.getMeasuredWidth() + i12;
                    iMax3 = Math.max(iMax3, childAt3.getMeasuredHeight());
                    i12 = measuredWidth2;
                }
                i6++;
            }
            i3 = i12;
            iMax = iMax3;
        }
        setMeasuredDimension(i3, Math.max(iMax, getSuggestedMinimumHeight()));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.u0 = z;
    }
}
