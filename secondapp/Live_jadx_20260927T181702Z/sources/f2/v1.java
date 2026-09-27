package f2;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<VelocityTracker, w1> f82619a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(34)
    public static class a {
        @k.t
        public static float a(VelocityTracker velocityTracker, int i10) {
            return velocityTracker.getAxisVelocity(i10);
        }

        @k.t
        public static float b(VelocityTracker velocityTracker, int i10, int i11) {
            return velocityTracker.getAxisVelocity(i10, i11);
        }

        @k.t
        public static boolean c(VelocityTracker velocityTracker, int i10) {
            return velocityTracker.isAxisSupported(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public @interface b {
    }

    public static void a(@NonNull VelocityTracker velocityTracker, @NonNull MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f82619a.containsKey(velocityTracker)) {
                f82619a.put(velocityTracker, new w1());
            }
            f82619a.get(velocityTracker).a(motionEvent);
        }
    }

    public static void b(@NonNull VelocityTracker velocityTracker) {
        velocityTracker.clear();
        l(velocityTracker);
    }

    public static void c(@NonNull VelocityTracker velocityTracker, int i10) {
        d(velocityTracker, i10, Float.MAX_VALUE);
    }

    public static void d(@NonNull VelocityTracker velocityTracker, int i10, float f10) {
        velocityTracker.computeCurrentVelocity(i10, f10);
        w1 w1VarG = g(velocityTracker);
        if (w1VarG != null) {
            w1VarG.d(i10, f10);
        }
    }

    public static float e(@NonNull VelocityTracker velocityTracker, int i10) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i10);
        }
        if (i10 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i10 == 1) {
            return velocityTracker.getYVelocity();
        }
        w1 w1VarG = g(velocityTracker);
        if (w1VarG != null) {
            return w1VarG.e(i10);
        }
        return 0.0f;
    }

    public static float f(@NonNull VelocityTracker velocityTracker, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.b(velocityTracker, i10, i11);
        }
        if (i10 == 0) {
            return velocityTracker.getXVelocity(i11);
        }
        if (i10 == 1) {
            return velocityTracker.getYVelocity(i11);
        }
        return 0.0f;
    }

    @Nullable
    public static w1 g(VelocityTracker velocityTracker) {
        return f82619a.get(velocityTracker);
    }

    @Deprecated
    public static float h(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.getXVelocity(i10);
    }

    @Deprecated
    public static float i(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.getYVelocity(i10);
    }

    public static boolean j(@NonNull VelocityTracker velocityTracker, int i10) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.c(velocityTracker, i10);
        }
        return i10 == 26 || i10 == 0 || i10 == 1;
    }

    public static void k(@NonNull VelocityTracker velocityTracker) {
        velocityTracker.recycle();
        l(velocityTracker);
    }

    public static void l(VelocityTracker velocityTracker) {
        f82619a.remove(velocityTracker);
    }
}
