package h2;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import k.t;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(21)
    public static class a {
        @t
        public static Interpolator a(float f10, float f11) {
            return new PathInterpolator(f10, f11);
        }

        @t
        public static Interpolator b(float f10, float f11, float f12, float f13) {
            return new PathInterpolator(f10, f11, f12, f13);
        }

        @t
        public static Interpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    @NonNull
    public static Interpolator a(float f10, float f11) {
        return a.a(f10, f11);
    }

    @NonNull
    public static Interpolator b(float f10, float f11, float f12, float f13) {
        return a.b(f10, f11, f12, f13);
    }

    @NonNull
    public static Interpolator c(@NonNull Path path) {
        return a.c(path);
    }
}
