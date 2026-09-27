package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EdgeEffect f9359a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(21)
    public static class a {
        private a() {
        }

        @k.t
        public static void a(EdgeEffect edgeEffect, float f10, float f11) {
            edgeEffect.onPull(f10, f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(31)
    public static class b {
        private b() {
        }

        @k.t
        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        @k.t
        public static float b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        @k.t
        public static float c(EdgeEffect edgeEffect, float f10, float f11) {
            try {
                return edgeEffect.onPullDistance(f10, f11);
            } catch (Throwable unused) {
                edgeEffect.onPull(f10, f11);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public i(Context context) {
        this.f9359a = new EdgeEffect(context);
    }

    @NonNull
    public static EdgeEffect a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? b.a(context, attributeSet) : new EdgeEffect(context);
    }

    public static float d(@NonNull EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void g(@NonNull EdgeEffect edgeEffect, float f10, float f11) {
        a.a(edgeEffect, f10, f11);
    }

    public static float j(@NonNull EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.c(edgeEffect, f10, f11);
        }
        g(edgeEffect, f10, f11);
        return f10;
    }

    @Deprecated
    public boolean b(Canvas canvas) {
        return this.f9359a.draw(canvas);
    }

    @Deprecated
    public void c() {
        this.f9359a.finish();
    }

    @Deprecated
    public boolean e() {
        return this.f9359a.isFinished();
    }

    @Deprecated
    public boolean f(int i10) {
        this.f9359a.onAbsorb(i10);
        return true;
    }

    @Deprecated
    public boolean h(float f10) {
        this.f9359a.onPull(f10);
        return true;
    }

    @Deprecated
    public boolean i(float f10, float f11) {
        g(this.f9359a, f10, f11);
        return true;
    }

    @Deprecated
    public boolean k() {
        this.f9359a.onRelease();
        return this.f9359a.isFinished();
    }

    @Deprecated
    public void l(int i10, int i11) {
        this.f9359a.setSize(i10, i11);
    }
}
