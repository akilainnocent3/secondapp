package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.t0(23)
public class o1 extends m1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f19626m = true;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(29)
    public static class a {
        @k.t
        public static void a(View view, int i10) {
            view.setTransitionVisibility(i10);
        }
    }

    @Override // androidx.transition.g1
    @SuppressLint({"NewApi"})
    public void h(@NonNull View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.h(view, i10);
        } else if (f19626m) {
            try {
                a.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f19626m = false;
            }
        }
    }
}
