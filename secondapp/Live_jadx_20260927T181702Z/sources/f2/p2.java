package f2;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f82456a = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f82457b = 9;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f82458c = 10;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {
        public static void a(@NonNull Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-1793) : systemUiVisibility | a2.a.b.f3536f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(28)
    public static class b {
        @k.t
        public static <T> T a(Window window, int i10) {
            return (T) window.requireViewById(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(30)
    public static class c {
        @k.t
        public static void a(@NonNull Window window, boolean z10) {
            window.setDecorFitsSystemWindows(z10);
        }
    }

    @NonNull
    public static s4 a(@NonNull Window window, @NonNull View view) {
        return new s4(window, view);
    }

    @NonNull
    public static <T extends View> T b(@NonNull Window window, @k.c0 int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) b.a(window, i10);
        }
        T t10 = (T) window.findViewById(i10);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void c(@NonNull Window window, boolean z10) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(window, z10);
        } else {
            a.a(window, z10);
        }
    }
}
