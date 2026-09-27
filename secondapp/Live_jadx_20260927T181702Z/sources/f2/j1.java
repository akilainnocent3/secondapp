package f2;

import android.view.ScaleGestureDetector;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {
    public static boolean a(@NonNull ScaleGestureDetector scaleGestureDetector) {
        return scaleGestureDetector.isQuickScaleEnabled();
    }

    @Deprecated
    public static boolean b(Object obj) {
        return a((ScaleGestureDetector) obj);
    }

    public static void c(@NonNull ScaleGestureDetector scaleGestureDetector, boolean z10) {
        scaleGestureDetector.setQuickScaleEnabled(z10);
    }

    @Deprecated
    public static void d(Object obj, boolean z10) {
        c((ScaleGestureDetector) obj, z10);
    }
}
