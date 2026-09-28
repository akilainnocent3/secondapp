package defpackage;

import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;

/* JADX INFO: loaded from: classes.dex */
public interface d9n extends q340 {
    public static final wg1 h;
    public static final wg1 i;
    public static final wg1 j;

    default dhf F() {
        dhf dhfVar = (dhf) b(j, dhf.c);
        dhfVar.getClass();
        return dhfVar;
    }

    default boolean H() {
        return e(j);
    }

    default int Q() {
        return ((Integer) b(i, 0)).intValue();
    }

    default int m() {
        return ((Integer) d(h)).intValue();
    }

    static {
        Class cls = Integer.TYPE;
        h = hoa.a.a(cls, xOgHBQVl.iCjvl);
        i = hoa.a.a(cls, "camerax.core.imageInput.secondaryInputFormat");
        j = hoa.a.a(dhf.class, "camerax.core.imageInput.inputDynamicRange");
    }
}
