package com.google.android.material.dockedtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.eai0;
import defpackage.fcv;
import defpackage.fyf0;
import defpackage.gof0;
import defpackage.jye;
import defpackage.pk30;
import defpackage.rx80;
import defpackage.tcv;

/* JADX INFO: loaded from: classes4.dex */
public class DockedToolbarLayout extends FrameLayout {
    public final Boolean a;
    public final Boolean b;

    public DockedToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(tcv.a(context, attributeSet, i, R.style.Widget_Material3_DockedToolbar), attributeSet, i);
        Context context2 = getContext();
        fyf0 fyf0VarE = gof0.e(context2, attributeSet, pk30.p, i, R.style.Widget_Material3_DockedToolbar, new int[0]);
        TypedArray typedArray = fyf0VarE.b;
        if (typedArray.hasValue(0)) {
            int color = typedArray.getColor(0, 0);
            fcv fcvVar = new fcv(rx80.d(context2, attributeSet, i, R.style.Widget_Material3_DockedToolbar).a());
            fcvVar.s(ColorStateList.valueOf(color));
            setBackground(fcvVar);
        }
        if (typedArray.hasValue(2)) {
            this.a = Boolean.valueOf(typedArray.getBoolean(2, true));
        }
        if (typedArray.hasValue(1)) {
            this.b = Boolean.valueOf(typedArray.getBoolean(1, true));
        }
        eai0.b(this, new jye(this));
        setImportantForAccessibility(1);
        fyf0VarE.g();
    }

    public static boolean a(ViewGroup.LayoutParams layoutParams, int i) {
        if (layoutParams instanceof CoordinatorLayout.e) {
            return (((CoordinatorLayout.e) layoutParams).c & i) == i;
        }
        return (layoutParams instanceof FrameLayout.LayoutParams) && (((FrameLayout.LayoutParams) layoutParams).gravity & i) == i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            int childCount = getChildCount();
            int iMax = Math.max(getMeasuredHeight(), getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight());
            for (int i3 = 0; i3 < childCount; i3++) {
                measureChild(getChildAt(i3), i, View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
            }
            setMeasuredDimension(getMeasuredWidth(), iMax);
        }
    }

    public DockedToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.dockedToolbarStyle);
    }

    public DockedToolbarLayout(Context context) {
        this(context, null);
    }
}
