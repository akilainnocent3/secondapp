package com.google.android.material.navigationrail;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionSet;
import androidx.transition.e;
import com.google.android.material.navigation.NavigationBarDividerView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.protobuf.Reader;
import com.sportybet.android.gp.tz.R;
import defpackage.bkx;
import defpackage.dj0;
import defpackage.eai0;
import defpackage.fyf0;
import defpackage.gof0;
import defpackage.hkx;
import defpackage.pk30;
import defpackage.plr;

/* JADX INFO: loaded from: classes4.dex */
public class NavigationRailView extends NavigationBarView {
    public static final PathInterpolator K = new PathInterpolator(0.38f, 1.21f, 0.22f, 1.0f);
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final NavigationRailFrameLayout J;
    public final int e;
    public final int f;
    public boolean i;
    public final View v;
    public final Boolean w;
    public final Boolean y;
    public final Boolean z;

    public NavigationRailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_NavigationRailView);
        this.w = null;
        this.y = null;
        this.z = null;
        this.A = false;
        this.C = -1;
        this.D = 0;
        this.E = 49;
        Context context2 = getContext();
        this.I = getContext().getResources().getDimensionPixelSize(R.dimen.m3_navigation_rail_expanded_item_spacing);
        this.H = 8388627;
        this.G = 1;
        fyf0 fyf0VarE = gof0.e(context2, attributeSet, pk30.S, i, R.style.Widget_MaterialComponents_NavigationRailView, new int[0]);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin);
        TypedArray typedArray = fyf0VarE.b;
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(1, dimensionPixelSize);
        int dimensionPixelSize3 = typedArray.getDimensionPixelSize(7, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin));
        boolean z = typedArray.getBoolean(14, false);
        setSubmenuDividersEnabled(typedArray.getBoolean(17, false));
        View view = (View) getMenuView();
        NavigationRailFrameLayout navigationRailFrameLayout = new NavigationRailFrameLayout(getContext());
        this.J = navigationRailFrameLayout;
        navigationRailFrameLayout.setPaddingTop(dimensionPixelSize2);
        this.J.setScrollingEnabled(z);
        this.J.setClipChildren(false);
        this.J.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.J.addView(view);
        if (z) {
            ScrollView scrollView = new ScrollView(getContext());
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.addView(this.J);
            scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(scrollView);
        } else {
            addView(this.J);
        }
        int resourceId = typedArray.getResourceId(6, 0);
        if (resourceId != 0) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
            View view2 = this.v;
            if (view2 != null) {
                this.J.removeView(view2);
                this.v = null;
            }
            this.v = viewInflate;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.bottomMargin = dimensionPixelSize3;
            this.J.addView(viewInflate, 0, layoutParams);
        }
        setMenuGravity(typedArray.getInt(10, 49));
        int dimensionPixelSize4 = typedArray.getDimensionPixelSize(8, -1);
        int dimensionPixelSize5 = typedArray.getDimensionPixelSize(8, -1);
        dimensionPixelSize4 = typedArray.hasValue(0) ? typedArray.getDimensionPixelSize(0, -1) : dimensionPixelSize4;
        dimensionPixelSize5 = typedArray.hasValue(3) ? typedArray.getDimensionPixelSize(3, -1) : dimensionPixelSize5;
        setCollapsedItemMinimumHeight(dimensionPixelSize4);
        setExpandedItemMinimumHeight(dimensionPixelSize5);
        this.e = typedArray.getDimensionPixelSize(5, context2.getResources().getDimensionPixelSize(R.dimen.m3_navigation_rail_min_expanded_width));
        this.f = typedArray.getDimensionPixelSize(4, context2.getResources().getDimensionPixelSize(R.dimen.m3_navigation_rail_max_expanded_width));
        if (typedArray.hasValue(13)) {
            this.w = Boolean.valueOf(typedArray.getBoolean(13, false));
        }
        if (typedArray.hasValue(11)) {
            this.y = Boolean.valueOf(typedArray.getBoolean(11, false));
        }
        if (typedArray.hasValue(12)) {
            this.z = Boolean.valueOf(typedArray.getBoolean(12, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_bottom_with_large_font);
        float fB = dj0.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f);
        float fC = dj0.c(fB, getItemPaddingTop(), dimensionPixelOffset);
        float fC2 = dj0.c(fB, getItemPaddingBottom(), dimensionPixelOffset2);
        setItemPaddingTop(Math.round(fC));
        setItemPaddingBottom(Math.round(fC2));
        setCollapsedItemSpacing(typedArray.getDimensionPixelSize(9, 0));
        setExpanded(typedArray.getBoolean(2, false));
        fyf0VarE.g();
        eai0.b(this, new hkx(this));
    }

    private int getMaxChildWidth() {
        int childCount = getNavigationRailMenuView().getChildCount();
        int iMax = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = getNavigationRailMenuView().getChildAt(i);
            if (childAt.getVisibility() != 8 && !(childAt instanceof NavigationBarDividerView)) {
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
        }
        return iMax;
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    private void setExpanded(boolean z) {
        if (this.A == z) {
            return;
        }
        if (isLaidOut()) {
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.c = 500L;
            changeBounds.d = K;
            Fade fade = new Fade();
            fade.c = 100L;
            Fade fade2 = new Fade();
            fade2.c = 100L;
            plr plrVar = new plr();
            Fade fade3 = new Fade();
            fade3.c = 100L;
            int childCount = getNavigationRailMenuView().getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getNavigationRailMenuView().getChildAt(i);
                if (childAt instanceof NavigationBarItemView) {
                    NavigationBarItemView navigationBarItemView = (NavigationBarItemView) childAt;
                    changeBounds.n(navigationBarItemView.getLabelGroup());
                    changeBounds.n(navigationBarItemView.getExpandedLabelGroup());
                    if (this.A) {
                        fade2.b(navigationBarItemView.getExpandedLabelGroup());
                        fade.b(navigationBarItemView.getLabelGroup());
                    } else {
                        fade2.b(navigationBarItemView.getLabelGroup());
                        fade.b(navigationBarItemView.getExpandedLabelGroup());
                    }
                    plrVar.b(navigationBarItemView.getExpandedLabelGroup());
                }
                fade3.b(childAt);
            }
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.T(0);
            transitionSet.P(changeBounds);
            transitionSet.P(fade);
            transitionSet.P(plrVar);
            if (!this.A) {
                transitionSet.P(fade3);
            }
            TransitionSet transitionSet2 = new TransitionSet();
            transitionSet2.T(0);
            transitionSet2.P(fade2);
            if (this.A) {
                transitionSet2.P(fade3);
            }
            TransitionSet transitionSet3 = new TransitionSet();
            transitionSet3.T(1);
            transitionSet3.P(transitionSet2);
            transitionSet3.P(transitionSet);
            e.a((ViewGroup) getParent(), transitionSet3);
        }
        this.A = z;
        int i2 = this.D;
        int i3 = this.B;
        int i4 = this.C;
        int i5 = this.E;
        if (z) {
            i2 = this.G;
            i3 = this.I;
            i4 = this.F;
            i5 = this.H;
        }
        getNavigationRailMenuView().setItemGravity(i5);
        super.setItemIconGravity(i2);
        getNavigationRailMenuView().setItemSpacing(i3);
        getNavigationRailMenuView().setItemMinimumHeight(i4);
        getNavigationRailMenuView().setExpanded(z);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public final NavigationBarMenuView a(Context context) {
        return new NavigationRailMenuView(context);
    }

    public int getCollapsedItemMinimumHeight() {
        return this.C;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getCollapsedMaxItemCount() {
        return 7;
    }

    public int getExpandedItemMinimumHeight() {
        return this.F;
    }

    public View getHeaderView() {
        return this.v;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getItemGravity() {
        return getNavigationRailMenuView().getItemGravity();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getItemIconGravity() {
        return getNavigationRailMenuView().getItemIconGravity();
    }

    public int getItemMinimumHeight() {
        return getNavigationRailMenuView().getItemMinimumHeight();
    }

    public int getItemSpacing() {
        return getNavigationRailMenuView().getItemSpacing();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return Reader.READ_DONE;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public boolean getSubmenuDividersEnabled() {
        return this.i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int iMakeMeasureSpec = (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumWidth <= 0) ? i : View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), 1073741824);
        if (this.A) {
            measureChild(getNavigationRailMenuView(), i, i2);
            View view = this.v;
            if (view != null) {
                measureChild(view, i, i2);
            }
            int maxChildWidth = getMaxChildWidth();
            int iMin = Math.min(this.e, View.MeasureSpec.getSize(i));
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                int iMax = Math.max(maxChildWidth, iMin);
                if (view != null) {
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                i = View.MeasureSpec.makeMeasureSpec(Math.max(getSuggestedMinimumWidth(), Math.min(iMax, this.f)), 1073741824);
            }
            if (getItemActiveIndicatorExpandedWidth() == -1) {
                NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
                int size = View.MeasureSpec.getSize(i);
                bkx[] bkxVarArr = navigationRailMenuView.i;
                if (bkxVarArr != null) {
                    for (bkx bkxVar : bkxVarArr) {
                        if (bkxVar instanceof NavigationBarItemView) {
                            ((NavigationBarItemView) bkxVar).j(size);
                        }
                    }
                }
            }
            iMakeMeasureSpec = i;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        NavigationRailFrameLayout navigationRailFrameLayout = this.J;
        if (navigationRailFrameLayout.getMeasuredHeight() < getMeasuredHeight()) {
            measureChild(navigationRailFrameLayout, iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setCollapsedItemMinimumHeight(int i) {
        this.C = i;
        if (this.A) {
            return;
        }
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
    }

    public void setCollapsedItemSpacing(int i) {
        this.B = i;
        if (this.A) {
            return;
        }
        getNavigationRailMenuView().setItemSpacing(i);
    }

    public void setExpandedItemMinimumHeight(int i) {
        this.F = i;
        if (this.A) {
            ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public void setItemGravity(int i) {
        this.E = i;
        this.H = i;
        super.setItemGravity(i);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public void setItemIconGravity(int i) {
        this.D = i;
        this.G = i;
        super.setItemIconGravity(i);
    }

    public void setItemMinimumHeight(int i) {
        this.C = i;
        this.F = i;
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
    }

    public void setItemSpacing(int i) {
        this.B = i;
        this.I = i;
        getNavigationRailMenuView().setItemSpacing(i);
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    public void setSubmenuDividersEnabled(boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        getNavigationRailMenuView().setSubmenuDividersEnabled(z);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationRailStyle);
    }

    public NavigationRailView(Context context) {
        this(context, null);
    }
}
