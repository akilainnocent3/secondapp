package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface h16 extends q340 {
    public static final wg1 a = hoa.a.a(tnh0.class, "camerax.core.camera.useCaseConfigFactory");
    public static final wg1 b;
    public static final wg1 c;
    public static final wg1 d;
    public static final wg1 e;
    public static final wg1 f;
    public static final g16 g;

    public interface a {
        int a(ArrayList arrayList);
    }

    static {
        hoa.a.a(g7n.class, "camerax.core.camera.compatibilityId");
        b = hoa.a.a(Integer.class, "camerax.core.camera.useCaseCombinationRequiredRule");
        c = hoa.a.a(vg80.class, "camerax.core.camera.SessionProcessor");
        hoa.a.a(Boolean.class, "camerax.core.camera.isZslDisabled");
        d = hoa.a.a(Boolean.class, "camerax.core.camera.isPostviewSupported");
        e = hoa.a.a(a.class, "camerax.core.camera.PostviewFormatSelector");
        f = hoa.a.a(Boolean.class, "camerax.core.camera.isCaptureProcessProgressSupported");
        g = new g16();
    }

    default vg80 v() {
        return (vg80) b(c, null);
    }
}
