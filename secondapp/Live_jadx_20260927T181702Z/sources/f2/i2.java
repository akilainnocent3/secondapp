package f2;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f82433a = "ViewParentCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int[] f82434b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(21)
    public static class a {
        @k.t
        public static boolean a(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
            return viewParent.onNestedFling(view, f10, f11, z10);
        }

        @k.t
        public static boolean b(ViewParent viewParent, View view, float f10, float f11) {
            return viewParent.onNestedPreFling(view, f10, f11);
        }

        @k.t
        public static void c(ViewParent viewParent, View view, int i10, int i11, int[] iArr) {
            viewParent.onNestedPreScroll(view, i10, i11, iArr);
        }

        @k.t
        public static void d(ViewParent viewParent, View view, int i10, int i11, int i12, int i13) {
            viewParent.onNestedScroll(view, i10, i11, i12, i13);
        }

        @k.t
        public static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.onNestedScrollAccepted(view, view2, i10);
        }

        @k.t
        public static boolean f(ViewParent viewParent, View view, View view2, int i10) {
            return viewParent.onStartNestedScroll(view, view2, i10);
        }

        @k.t
        public static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    public static int[] a() {
        int[] iArr = f82434b;
        if (iArr == null) {
            f82434b = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return f82434b;
    }

    public static void b(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i10) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
    }

    public static boolean c(@NonNull ViewParent viewParent, @NonNull View view, float f10, float f11, boolean z10) {
        try {
            return a.a(viewParent, view, f10, f11, z10);
        } catch (AbstractMethodError e10) {
            Log.e(f82433a, "ViewParent " + viewParent + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    public static boolean d(@NonNull ViewParent viewParent, @NonNull View view, float f10, float f11) {
        try {
            return a.b(viewParent, view, f10, f11);
        } catch (AbstractMethodError e10) {
            Log.e(f82433a, "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    public static void e(@NonNull ViewParent viewParent, @NonNull View view, int i10, int i11, @NonNull int[] iArr) {
        f(viewParent, view, i10, i11, iArr, 0);
    }

    public static void f(@NonNull ViewParent viewParent, @NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
        if (viewParent instanceof a1) {
            ((a1) viewParent).o(view, i10, i11, iArr, i12);
            return;
        }
        if (i12 == 0) {
            try {
                a.c(viewParent, view, i10, i11, iArr);
            } catch (AbstractMethodError e10) {
                Log.e(f82433a, "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e10);
            }
        }
    }

    public static void g(@NonNull ViewParent viewParent, @NonNull View view, int i10, int i11, int i12, int i13) {
        i(viewParent, view, i10, i11, i12, i13, 0, a());
    }

    public static void h(@NonNull ViewParent viewParent, @NonNull View view, int i10, int i11, int i12, int i13, int i14) {
        i(viewParent, view, i10, i11, i12, i13, i14, a());
    }

    public static void i(@NonNull ViewParent viewParent, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        if (viewParent instanceof b1) {
            ((b1) viewParent).q(view, i10, i11, i12, i13, i14, iArr);
            return;
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (viewParent instanceof a1) {
            ((a1) viewParent).m(view, i10, i11, i12, i13, i14);
            return;
        }
        if (i14 == 0) {
            try {
                a.d(viewParent, view, i10, i11, i12, i13);
            } catch (AbstractMethodError e10) {
                Log.e(f82433a, "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e10);
            }
        }
    }

    public static void j(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i10) {
        k(viewParent, view, view2, i10, 0);
    }

    public static void k(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i10, int i11) {
        if (viewParent instanceof a1) {
            ((a1) viewParent).j(view, view2, i10, i11);
            return;
        }
        if (i11 == 0) {
            try {
                a.e(viewParent, view, view2, i10);
            } catch (AbstractMethodError e10) {
                Log.e(f82433a, "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e10);
            }
        }
    }

    public static boolean l(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i10) {
        return m(viewParent, view, view2, i10, 0);
    }

    public static boolean m(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i10, int i11) {
        if (viewParent instanceof a1) {
            return ((a1) viewParent).r(view, view2, i10, i11);
        }
        if (i11 != 0) {
            return false;
        }
        try {
            return a.f(viewParent, view, view2, i10);
        } catch (AbstractMethodError e10) {
            Log.e(f82433a, "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e10);
            return false;
        }
    }

    public static void n(@NonNull ViewParent viewParent, @NonNull View view) {
        o(viewParent, view, 0);
    }

    public static void o(@NonNull ViewParent viewParent, @NonNull View view, int i10) {
        if (viewParent instanceof a1) {
            ((a1) viewParent).k(view, i10);
            return;
        }
        if (i10 == 0) {
            try {
                a.g(viewParent, view);
            } catch (AbstractMethodError e10) {
                Log.e(f82433a, "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e10);
            }
        }
    }

    @Deprecated
    public static boolean p(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
