package f2;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f82332a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f82333b = 1;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(21)
    public static class a {
        @k.t
        public static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        @k.t
        public static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        @k.t
        public static void c(ViewGroup viewGroup, boolean z10) {
            viewGroup.setTransitionGroup(z10);
        }
    }

    public static int a(@NonNull ViewGroup viewGroup) {
        return viewGroup.getLayoutMode();
    }

    public static int b(@NonNull ViewGroup viewGroup) {
        return a.a(viewGroup);
    }

    public static boolean c(@NonNull ViewGroup viewGroup) {
        return a.b(viewGroup);
    }

    @Deprecated
    public static boolean d(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void e(@NonNull ViewGroup viewGroup, int i10) {
        viewGroup.setLayoutMode(i10);
    }

    @Deprecated
    public static void f(ViewGroup viewGroup, boolean z10) {
        viewGroup.setMotionEventSplittingEnabled(z10);
    }

    public static void g(@NonNull ViewGroup viewGroup, boolean z10) {
        a.c(viewGroup, z10);
    }
}
