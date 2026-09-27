package f6;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import u4.p1;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f83303a = "AacUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f83304b = 1024;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f83305c = 1024;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f83306d = 2048;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f83307e = 512;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f83308f = 100000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f83309g = 16000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f83310h = 7000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f83311i = 256000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f83312j = 8000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f83313k = 15;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f83315m = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f83317o = "mp4a.40.";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f83318p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f83319q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f83320r = 22;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f83321s = 23;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f83322t = 29;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f83323u = 31;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f83324v = 42;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f83314l = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f83316n = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f83325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f83326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f83327c;

        public c(int i10, int i11, String str) {
            this.f83325a = i10;
            this.f83326b = i11;
            this.f83327c = str;
        }
    }

    public static byte[] a(int i10, int i11) {
        int i12 = 0;
        int i13 = -1;
        int i14 = 0;
        while (true) {
            int[] iArr = f83314l;
            if (i14 >= iArr.length) {
                break;
            }
            if (i10 == iArr[i14]) {
                i13 = i14;
            }
            i14++;
        }
        int i15 = -1;
        while (true) {
            int[] iArr2 = f83316n;
            if (i12 >= iArr2.length) {
                break;
            }
            if (i11 == iArr2[i12]) {
                i15 = i12;
            }
            i12++;
        }
        if (i10 != -1 && i15 != -1) {
            return b(2, i13, i15);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i10 + ", " + i11);
    }

    public static byte[] b(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    public static int c(x4.u0 u0Var) {
        int iH = u0Var.h(5);
        return iH == 31 ? u0Var.h(6) + 32 : iH;
    }

    public static int d(x4.u0 u0Var) throws p1 {
        int iH = u0Var.h(4);
        if (iH == 15) {
            if (u0Var.b() >= 24) {
                return u0Var.h(24);
            }
            throw p1.a("AAC header insufficient data", null);
        }
        if (iH < 13) {
            return f83314l[iH];
        }
        throw p1.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static c e(x4.u0 u0Var, boolean z10) throws p1 {
        int iC = c(u0Var);
        int iD = d(u0Var);
        int iH = u0Var.h(4);
        String str = "mp4a.40." + iC;
        if (iC == 5 || iC == 29) {
            iD = d(u0Var);
            iC = c(u0Var);
            if (iC == 22) {
                iH = u0Var.h(4);
            }
        }
        if (z10) {
            if (iC != 1 && iC != 2 && iC != 3 && iC != 4 && iC != 6 && iC != 7 && iC != 17) {
                switch (iC) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw p1.f("Unsupported audio object type: " + iC);
                }
            }
            g(u0Var, iC, iH);
            switch (iC) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = u0Var.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw p1.f("Unsupported epConfig: " + iH2);
                    }
                    break;
            }
        }
        int i10 = f83316n[iH];
        if (i10 != -1) {
            return new c(iD, i10, str);
        }
        throw p1.a(null, null);
    }

    public static c f(byte[] bArr) throws p1 {
        return e(new x4.u0(bArr), false);
    }

    public static void g(x4.u0 u0Var, int i10, int i11) {
        if (u0Var.g()) {
            x4.d0.n("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (u0Var.g()) {
            u0Var.s(14);
        }
        boolean zG = u0Var.g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            u0Var.s(3);
        }
        if (zG) {
            if (i10 == 22) {
                u0Var.s(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                u0Var.s(3);
            }
            u0Var.s(1);
        }
    }
}
