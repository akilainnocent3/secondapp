package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface x9n extends q340 {
    public static final wg1 k = hoa.a.a(gy0.class, "camerax.core.imageOutput.targetAspectRatio");
    public static final wg1 l;
    public static final wg1 m;
    public static final wg1 n;
    public static final wg1 o;
    public static final wg1 p;
    public static final wg1 q;
    public static final wg1 r;
    public static final wg1 s;
    public static final wg1 t;

    /* JADX INFO: loaded from: classes5.dex */
    public interface a<B> {
        B b(int i);

        B c(Size size);
    }

    static {
        Class cls = Integer.TYPE;
        l = hoa.a.a(cls, "camerax.core.imageOutput.targetRotation");
        m = hoa.a.a(cls, "camerax.core.imageOutput.appTargetRotation");
        n = hoa.a.a(cls, "camerax.core.imageOutput.mirrorMode");
        o = hoa.a.a(Size.class, "camerax.core.imageOutput.targetResolution");
        p = hoa.a.a(Size.class, "camerax.core.imageOutput.defaultResolution");
        q = hoa.a.a(Size.class, "camerax.core.imageOutput.maxResolution");
        r = hoa.a.a(List.class, "camerax.core.imageOutput.supportedResolutions");
        s = hoa.a.a(xf50.class, "camerax.core.imageOutput.resolutionSelector");
        t = hoa.a.a(List.class, "camerax.core.imageOutput.customOrderedResolutions");
    }

    static void D(x9n x9nVar) {
        boolean zX = x9nVar.x();
        boolean z = x9nVar.t() != null;
        if (zX && z) {
            hb5.a("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (x9nVar.k() != null) {
            if (zX || z) {
                hb5.a("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default Size B() {
        return (Size) b(q, null);
    }

    default int E(int i) {
        return ((Integer) b(l, Integer.valueOf(i))).intValue();
    }

    default int G() {
        return ((Integer) b(n, -1)).intValue();
    }

    default ArrayList L() {
        List list = (List) b(t, null);
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    default int T() {
        return ((Integer) b(m, -1)).intValue();
    }

    default List j() {
        return (List) b(r, null);
    }

    default xf50 k() {
        return (xf50) b(s, null);
    }

    default xf50 p() {
        return (xf50) d(s);
    }

    default Size r() {
        return (Size) b(p, null);
    }

    default Size t() {
        return (Size) b(o, null);
    }

    default boolean x() {
        return e(k);
    }

    default int y() {
        return ((Integer) d(k)).intValue();
    }
}
