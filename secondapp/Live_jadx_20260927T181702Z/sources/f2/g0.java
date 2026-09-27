package f2;

import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f82343a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f82344b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f82345c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f82346d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f82347e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f82348f = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f82349g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f82350h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f82351i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f82352j = 9;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f82353k = 12;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f82354l = 13;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f82355m = 16;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f82356n = 17;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f82357o = 21;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f82358p = 22;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f82359q = 23;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f82360r = 24;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f82361s = 25;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f82362t = 26;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f82363u = 27;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @k.h1
    public static final int f82364v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @k.h1
    public static final int f82365w = 27;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f82366x = 1;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @k.y0({k.y0.a.LIBRARY})
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @k.y0({k.y0.a.LIBRARY})
    public @interface b {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x002c  */
    /* JADX WARN: Code duplicated, block: B:25:0x002e  */
    public static int a(int i10) {
        if (i10 == -1) {
            return -1;
        }
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 6;
        if (i11 < 34) {
            switch (i10) {
                case 21:
                case 23:
                case 26:
                    i10 = 6;
                    break;
                case 22:
                case 24:
                case 27:
                    i10 = 4;
                    break;
                case 25:
                    i10 = 0;
                    break;
            }
        }
        if (i11 >= 30) {
            i12 = i10;
        } else if (i10 == 12) {
            i12 = 1;
        } else if (i10 != 13) {
            if (i10 == 16) {
                i12 = 1;
            } else if (i10 != 17) {
                i12 = i10;
            } else {
                i12 = 0;
            }
        }
        if (i11 >= 27 || !(i12 == 7 || i12 == 8 || i12 == 9)) {
            return i12;
        }
        return -1;
    }
}
