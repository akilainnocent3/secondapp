package com.yandex.div.core.view2.divs.widgets;

import android.view.KeyEvent;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(DivAnimator divAnimator) {
        ViewGroup viewGroup;
        int childCount;
        if (!(divAnimator instanceof ViewGroup) || (childCount = (viewGroup = (ViewGroup) divAnimator).getChildCount()) < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i10);
            DivAnimator divAnimator2 = childAt instanceof DivAnimator ? (DivAnimator) childAt : null;
            if (divAnimator2 != null) {
                divAnimator2.startDivAnimation();
            }
            if (i10 == childCount) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(DivAnimator divAnimator) {
        ViewGroup viewGroup;
        int childCount;
        if (!(divAnimator instanceof ViewGroup) || (childCount = (viewGroup = (ViewGroup) divAnimator).getChildCount()) < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i10);
            DivAnimator divAnimator2 = childAt instanceof DivAnimator ? (DivAnimator) childAt : null;
            if (divAnimator2 != null) {
                divAnimator2.stopDivAnimation();
            }
            if (i10 == childCount) {
                return;
            } else {
                i10++;
            }
        }
    }
}
