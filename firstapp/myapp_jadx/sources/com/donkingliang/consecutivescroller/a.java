package com.donkingliang.consecutivescroller;

import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import defpackage.g9i0;
import defpackage.osm;
import defpackage.r6i0;
import defpackage.yr70;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static Method a;
    public static Method b;
    public static Method c;
    public static final Rect d = new Rect();

    public static void a(ArrayList arrayList, View view, int i, int i2) {
        if (k(view) && m(view, i, i2)) {
            arrayList.add(view);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    a(arrayList, viewGroup.getChildAt(i3), i, i2);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    public static boolean b(int i, View view) {
        int itemCount;
        int i2;
        View viewI = i(view);
        if (viewI.getVisibility() != 8) {
            if (viewI instanceof AbsListView) {
                return ((AbsListView) viewI).canScrollList(i);
            }
            if (!(viewI instanceof RecyclerView)) {
                return viewI.canScrollVertically(i);
            }
            RecyclerView recyclerView = (RecyclerView) viewI;
            if ((!recyclerView.canScrollHorizontally(1) && !recyclerView.canScrollHorizontally(-1)) || recyclerView.canScrollVertically(i)) {
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                RecyclerView.f adapter = recyclerView.getAdapter();
                if (layoutManager != null && adapter != null && adapter.getItemCount() > 0) {
                    if (layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).I : layoutManager instanceof StaggeredGridLayoutManager ? ((StaggeredGridLayoutManager) layoutManager).L : false) {
                        if (i < 0) {
                            itemCount = adapter.getItemCount();
                            i2 = itemCount - 1;
                        } else {
                            i2 = 0;
                        }
                    } else if (i > 0) {
                        itemCount = adapter.getItemCount();
                        i2 = itemCount - 1;
                    } else {
                        i2 = 0;
                    }
                    if (layoutManager.F(i2) != null) {
                        int childCount = recyclerView.getChildCount();
                        Rect rect = d;
                        if (i > 0) {
                            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                                RecyclerView.S(rect, recyclerView.getChildAt(i3));
                                if (rect.bottom <= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                }
                            }
                        } else {
                            for (int i4 = 0; i4 < childCount; i4++) {
                                RecyclerView.S(rect, recyclerView.getChildAt(i4));
                                if (rect.top >= recyclerView.getPaddingTop()) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int c(View view) {
        View viewI = i(view);
        if (viewI instanceof yr70) {
            return ((yr70) viewI).computeVerticalScrollOffset();
        }
        try {
            if (a == null) {
                Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollOffset", null);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object objInvoke = a.invoke(viewI, null);
            if (objInvoke != null) {
                return ((Integer) objInvoke).intValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return viewI.getScrollY();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int d(View view) {
        View viewI = i(view);
        if (viewI instanceof yr70) {
            return ((yr70) viewI).computeVerticalScrollRange();
        }
        try {
            if (b == null) {
                Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollRange", null);
                b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object objInvoke = b.invoke(viewI, null);
            if (objInvoke != null) {
                return ((Integer) objInvoke).intValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return viewI.getHeight();
    }

    public static int e(ConsecutiveScrollerLayout consecutiveScrollerLayout, MotionEvent motionEvent, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (int) motionEvent.getRawX(i);
        }
        int[] iArr = new int[2];
        consecutiveScrollerLayout.getLocationOnScreen(iArr);
        return (int) (motionEvent.getX(i) + iArr[0]);
    }

    public static int f(ConsecutiveScrollerLayout consecutiveScrollerLayout, MotionEvent motionEvent, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (int) motionEvent.getRawY(i);
        }
        int[] iArr = new int[2];
        consecutiveScrollerLayout.getLocationOnScreen(iArr);
        return (int) (motionEvent.getY(i) + iArr[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int g(View view) {
        int iIntValue;
        if (!k(view) || !b(1, view)) {
            return 0;
        }
        int iD = d(view) - c(view);
        View viewI = i(view);
        if (viewI instanceof yr70) {
            iIntValue = ((yr70) viewI).computeVerticalScrollExtent();
        } else {
            try {
                if (c == null) {
                    Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollExtent", null);
                    c = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object objInvoke = c.invoke(viewI, null);
                iIntValue = objInvoke != null ? ((Integer) objInvoke).intValue() : viewI.getHeight();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return Math.max(iD - iIntValue, 1);
    }

    public static View h(View view) {
        int i;
        View viewFindViewById;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ConsecutiveScrollerLayout.LayoutParams) && (i = ((ConsecutiveScrollerLayout.LayoutParams) layoutParams).f) != -1 && (viewFindViewById = view.findViewById(i)) != null) {
                return viewFindViewById;
            }
        }
        return view;
    }

    public static View i(View view) {
        View viewH = h(view);
        while (viewH instanceof osm) {
            View currentScrollerView = ((osm) viewH).getCurrentScrollerView();
            if (viewH == currentScrollerView) {
                return currentScrollerView;
            }
            viewH = currentScrollerView;
        }
        return viewH;
    }

    public static boolean j(ConsecutiveScrollerLayout consecutiveScrollerLayout) {
        View view = consecutiveScrollerLayout;
        while ((view.getParent() instanceof ViewGroup) && !(view.getParent() instanceof ConsecutiveScrollerLayout)) {
            view = (View) view.getParent();
        }
        if (view.getParent() instanceof ConsecutiveScrollerLayout) {
            return k(view);
        }
        return false;
    }

    public static boolean k(View view) {
        if (view == null) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConsecutiveScrollerLayout.LayoutParams) {
            return ((ConsecutiveScrollerLayout.LayoutParams) layoutParams).a;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0076  */
    public static boolean l(ConsecutiveScrollerLayout consecutiveScrollerLayout, int i, int i2) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        a(arrayList2, consecutiveScrollerLayout, i, i2);
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            View view = (View) obj;
            if (view instanceof ConsecutiveScrollerLayout) {
                arrayList.add((ConsecutiveScrollerLayout) view);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ConsecutiveScrollerLayout consecutiveScrollerLayout2 = (ConsecutiveScrollerLayout) arrayList.get(size2);
            int childCount = consecutiveScrollerLayout2.getChildCount();
            ArrayList arrayList3 = consecutiveScrollerLayout2.p0;
            View view2 = null;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = consecutiveScrollerLayout2.getChildAt(i4);
                if (childAt.getVisibility() == 0 && m(childAt, i, i2)) {
                    if (view2 == null) {
                        view2 = childAt;
                    } else {
                        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                        if (r6i0.d.h(childAt) > r6i0.d.h(view2) || (r6i0.d.h(childAt) == r6i0.d.h(view2) && arrayList3.indexOf(childAt) > arrayList3.indexOf(view2))) {
                            view2 = childAt;
                        }
                    }
                }
            }
            if (view2 != null && ConsecutiveScrollerLayout.s(view2) && (((!(z = consecutiveScrollerLayout2.g0) && consecutiveScrollerLayout2.l0 == view2) || (z && consecutiveScrollerLayout2.m0.contains(view2))) && !((ConsecutiveScrollerLayout.LayoutParams) view2.getLayoutParams()).d)) {
                return true;
            }
        }
        return false;
    }

    public static boolean m(View view, int i, int i2) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        return i >= i3 && i <= view.getMeasuredWidth() + i3 && i2 >= i4 && i2 <= view.getMeasuredHeight() + i4;
    }
}
