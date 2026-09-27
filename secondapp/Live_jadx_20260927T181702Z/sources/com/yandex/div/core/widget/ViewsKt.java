package com.yandex.div.core.widget;

import android.view.View;
import android.view.ViewGroup;
import dr.w2;
import ds.p;
import js.f;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ViewsKt {
    @l
    public static final <T> f<View, T> appearanceAffecting(T t10, @m ds.l<? super T, ? extends T> lVar) {
        return new AppearanceAffectingViewProperty(t10, lVar);
    }

    public static /* synthetic */ f appearanceAffecting$default(Object obj, ds.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return appearanceAffecting(obj, lVar);
    }

    @l
    public static final <T> f<View, T> dimensionAffecting(T t10, @m ds.l<? super T, ? extends T> lVar) {
        return new DimensionAffectingViewProperty(t10, lVar);
    }

    public static /* synthetic */ f dimensionAffecting$default(Object obj, ds.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return dimensionAffecting(obj, lVar);
    }

    public static final void forEach(@l ViewGroup viewGroup, boolean z10, @l ds.l<? super View, w2> lVar) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (!z10 || childAt.getVisibility() != 8) {
                lVar.invoke(childAt);
            }
        }
    }

    public static /* synthetic */ void forEach$default(ViewGroup viewGroup, boolean z10, ds.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (!z10 || childAt.getVisibility() != 8) {
                lVar.invoke(childAt);
            }
        }
    }

    public static final void forEachIndexed(@l ViewGroup viewGroup, boolean z10, @l p<? super View, ? super Integer, w2> pVar) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (!z10 || childAt.getVisibility() != 8) {
                pVar.invoke(childAt, Integer.valueOf(i10));
            }
        }
    }

    public static /* synthetic */ void forEachIndexed$default(ViewGroup viewGroup, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (!z10 || childAt.getVisibility() != 8) {
                pVar.invoke(childAt, Integer.valueOf(i11));
            }
        }
    }

    public static final void invalidateAfter(@l View view, @l ds.a<w2> aVar) {
        aVar.invoke();
        view.invalidate();
    }

    public static final boolean isExact(int i10) {
        return View.MeasureSpec.getMode(i10) == 1073741824;
    }

    public static final boolean isUnspecified(int i10) {
        return View.MeasureSpec.getMode(i10) == 0;
    }

    public static final int makeAtMostSpec(int i10) {
        return View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
    }

    public static final int makeExactSpec(int i10) {
        return View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
    }

    public static final int makeUnspecifiedSpec() {
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    public static final void requestLayoutAfter(@l View view, @l ds.a<w2> aVar) {
        aVar.invoke();
        view.requestLayout();
    }
}
