package k1;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f101697a = "\udfffd";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f101698b = "m";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadLocal<e2.t<Rect, Rect>> f101699c = new ThreadLocal<>();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(23)
    public static class a {
        @k.t
        public static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(29)
    public static class b {
        @k.t
        public static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    public static boolean a(@NonNull Paint paint, @NonNull String str) {
        return a.a(paint, str);
    }

    public static e2.t<Rect, Rect> b() {
        ThreadLocal<e2.t<Rect, Rect>> threadLocal = f101699c;
        e2.t<Rect, Rect> tVar = threadLocal.get();
        if (tVar == null) {
            e2.t<Rect, Rect> tVar2 = new e2.t<>(new Rect(), new Rect());
            threadLocal.set(tVar2);
            return tVar2;
        }
        tVar.f79831a.setEmpty();
        tVar.f79832b.setEmpty();
        return tVar;
    }

    public static boolean c(@NonNull Paint paint, @Nullable g gVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(paint, gVar != null ? h.b.a(gVar) : null);
            return true;
        }
        if (gVar == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode modeA = h.a(gVar);
        paint.setXfermode(modeA != null ? new PorterDuffXfermode(modeA) : null);
        return modeA != null;
    }
}
