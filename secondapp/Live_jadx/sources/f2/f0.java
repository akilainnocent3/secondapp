package f2;

import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f82334a = 8388608;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f82335b = 8388611;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f82336c = 8388613;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f82337d = 8388615;

    public static void a(int i10, int i11, int i12, @NonNull Rect rect, int i13, int i14, @NonNull Rect rect2, int i15) {
        Gravity.apply(i10, i11, i12, rect, i13, i14, rect2, i15);
    }

    public static void b(int i10, int i11, int i12, @NonNull Rect rect, @NonNull Rect rect2, int i13) {
        Gravity.apply(i10, i11, i12, rect, rect2, i13);
    }

    public static void c(int i10, @NonNull Rect rect, @NonNull Rect rect2, int i11) {
        Gravity.applyDisplay(i10, rect, rect2, i11);
    }

    public static int d(int i10, int i11) {
        return Gravity.getAbsoluteGravity(i10, i11);
    }
}
