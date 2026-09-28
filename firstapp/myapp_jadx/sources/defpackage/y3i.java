package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class y3i {

    public static final class a extends qlr implements Function1<View, Boolean> {
        public final /* synthetic */ View a;
        public final /* synthetic */ View b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, View view2) {
            super(1);
            this.a = view;
            this.b = view2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(View view) {
            View view2 = view;
            z3i z3iVar = new z3i(view2.getNextFocusForwardId());
            View view3 = null;
            View view4 = null;
            while (true) {
                View viewC = y3i.c(view2, z3iVar, view4);
                if (viewC != null || view2 == this.a) {
                    view3 = viewC;
                    break;
                }
                Object parent = view2.getParent();
                if (parent == null || !(parent instanceof View)) {
                    break;
                }
                View view5 = (View) parent;
                view4 = view2;
                view2 = view5;
            }
            return Boolean.valueOf(view3 == this.b);
        }
    }

    public static final void a(View view, ArrayList<View> arrayList, boolean z) {
        int i;
        boolean z2 = view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z || view.isFocusableInTouchMode());
        if (!(view instanceof ViewGroup)) {
            if (z2) {
                arrayList.add(view);
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z3 = viewGroup.getDescendantFocusability() == 131072;
        if (z2 && z3) {
            arrayList.add(view);
        }
        if (viewGroup.getDescendantFocusability() != 393216) {
            int childCount = viewGroup.getChildCount();
            View[] viewArr = new View[childCount];
            for (int i2 = 0; i2 < childCount; i2++) {
                viewArr[i2] = viewGroup.getChildAt(i2);
            }
            etw<Rect> etwVar = i5i.a;
            boolean z4 = viewGroup.getLayoutDirection() == 1;
            h5i h5iVar = i5i.f;
            etw<Rect> etwVar2 = i5i.a;
            rtw<View, Rect> rtwVar = i5i.d;
            if (childCount < 2) {
                i = 0;
            } else {
                int i3 = childCount - etwVar2.b;
                i = 0;
                for (int i4 = 0; i4 < i3; i4++) {
                    etwVar2.g(new Rect());
                }
                for (int i5 = 0; i5 < childCount; i5++) {
                    View view2 = viewArr[i5];
                    int i6 = i5i.b;
                    i5i.b = i6 + 1;
                    Rect rectB = etwVar2.b(i6);
                    view2.getDrawingRect(rectB);
                    viewGroup.offsetDescendantRectToMyCoords(view2, rectB);
                    rtwVar.m(view2, rectB);
                }
                g5i g5iVar = i5i.e;
                g5iVar.getClass();
                if (childCount > 1) {
                    Arrays.sort(viewArr, g5iVar);
                }
                Rect rectD = rtwVar.d(viewArr[0]);
                rectD.getClass();
                int iMax = rectD.bottom;
                i5i.c = z4 ? -1 : 1;
                int i7 = 0;
                for (int i8 = 0; i8 < childCount; i8++) {
                    Rect rectD2 = rtwVar.d(viewArr[i8]);
                    rectD2.getClass();
                    Rect rect = rectD2;
                    if (rect.top >= iMax) {
                        if (i8 - i7 > 1) {
                            xx0.q(viewArr, h5iVar, i7, i8);
                        }
                        iMax = rect.bottom;
                        i7 = i8;
                    } else {
                        iMax = Math.max(iMax, rect.bottom);
                    }
                }
                if (childCount - i7 > 1) {
                    xx0.q(viewArr, h5iVar, i7, childCount);
                }
                i5i.b = 0;
                rtwVar.g();
            }
            for (int i9 = i; i9 < childCount; i9++) {
                a(viewArr[i9], arrayList, z);
            }
        }
        if (z2 && !z3 && size == arrayList.size()) {
            arrayList.add(view);
        }
    }

    public static final View b(View view, View view2, int i) {
        int nextFocusForwardId;
        if (i != 1) {
            if (i == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
                z3i z3iVar = new z3i(nextFocusForwardId);
                View view3 = null;
                while (true) {
                    View viewC = c(view, z3iVar, view3);
                    if (viewC != null || view == view2) {
                        return viewC;
                    }
                    Object parent = view.getParent();
                    if (parent == null || !(parent instanceof View)) {
                        break;
                    }
                    View view4 = (View) parent;
                    view3 = view;
                    view = view4;
                }
                return null;
            }
        } else if (view.getId() != -1) {
            a aVar = new a(view2, view);
            View view5 = null;
            while (true) {
                View viewC2 = c(view, aVar, view5);
                if (viewC2 != null || view == view2) {
                    return viewC2;
                }
                Object parent2 = view.getParent();
                if (parent2 == null || !(parent2 instanceof View)) {
                    break;
                }
                View view6 = (View) parent2;
                view5 = view;
                view = view6;
            }
            return null;
        }
        return null;
    }

    public static final View c(View view, Function1<? super View, Boolean> function1, View view2) {
        View viewC;
        if (function1.invoke(view).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != view2 && (viewC = c(childAt, function1, view2)) != null) {
                return viewC;
            }
        }
        return null;
    }
}
