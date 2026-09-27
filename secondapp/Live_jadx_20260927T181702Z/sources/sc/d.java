package sc;

import android.graphics.Canvas;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f129833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f129834b;

    static {
        try {
            f129833a = ((Integer) Canvas.class.getField("MATRIX_SAVE_FLAG").get(null)).intValue();
            f129834b = Canvas.class.getMethod("save", Integer.TYPE);
        } catch (Throwable th2) {
            throw b(th2);
        }
    }

    public static void a(Canvas canvas, int i10) {
        try {
            f129834b.invoke(canvas, Integer.valueOf(i10));
        } catch (Throwable th2) {
            throw b(th2);
        }
    }

    public static RuntimeException b(Throwable th2) {
        if (th2 != null) {
            return (RuntimeException) c(th2);
        }
        throw new NullPointerException("t");
    }

    public static <T extends Throwable> T c(Throwable th2) throws Throwable {
        throw th2;
    }
}
