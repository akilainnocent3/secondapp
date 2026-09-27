package gx;

import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f87442a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final byte[] f87443b = new byte[0];

    public static final long a(int i10, int i11, int i12, int i13, int i14, int i15) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(i10, i11 - 1, i12, i13, i14, i15);
        return gregorianCalendar.getTime().getTime();
    }

    public static final int b() {
        return f87442a;
    }

    @oy.l
    public static final byte[] c() {
        return f87443b;
    }
}
