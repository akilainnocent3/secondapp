package te;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import re.d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f136443a = "AacUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f136444b = 1024;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f136445c = 1024;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f136446d = 2048;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f136447e = 512;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f136448f = 100000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f136449g = 16000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f136450h = 7000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f136451i = 256000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f136452j = 8000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f136453k = 15;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f136455m = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f136457o = "mp4a.40.";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f136458p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f136459q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f136460r = 22;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f136461s = 23;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f136462t = 29;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f136463u = 31;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f136464v = 42;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f136454l = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f136456n = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f136465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f136466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f136467c;

        public c(int i10, int i11, String str) {
            this.f136465a = i10;
            this.f136466b = i11;
            this.f136467c = str;
        }
    }

    public static byte[] a(int i10, int i11) {
        int i12 = 0;
        int i13 = -1;
        int i14 = 0;
        while (true) {
            int[] iArr = f136454l;
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
            int[] iArr2 = f136456n;
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

    public static int c(eh.s0 s0Var) {
        int iH = s0Var.h(5);
        return iH == 31 ? s0Var.h(6) + 32 : iH;
    }

    public static int d(eh.s0 s0Var) throws d4 {
        int iH = s0Var.h(4);
        if (iH == 15) {
            if (s0Var.b() >= 24) {
                return s0Var.h(24);
            }
            throw d4.a("AAC header insufficient data", null);
        }
        if (iH < 13) {
            return f136454l[iH];
        }
        throw d4.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static c e(eh.s0 s0Var, boolean z10) throws d4 {
        int iC = c(s0Var);
        int iD = d(s0Var);
        int iH = s0Var.h(4);
        String str = "mp4a.40." + iC;
        if (iC == 5 || iC == 29) {
            iD = d(s0Var);
            iC = c(s0Var);
            if (iC == 22) {
                iH = s0Var.h(4);
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
                        throw d4.e("Unsupported audio object type: " + iC);
                }
            }
            g(s0Var, iC, iH);
            switch (iC) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = s0Var.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw d4.e("Unsupported epConfig: " + iH2);
                    }
                    break;
            }
        }
        int i10 = f136456n[iH];
        if (i10 != -1) {
            return new c(iD, i10, str);
        }
        throw d4.a(null, null);
    }

    public static c f(byte[] bArr) throws d4 {
        return e(new eh.s0(bArr), false);
    }

    public static void g(eh.s0 s0Var, int i10, int i11) {
        if (s0Var.g()) {
            eh.h0.n("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (s0Var.g()) {
            s0Var.s(14);
        }
        boolean zG = s0Var.g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            s0Var.s(3);
        }
        if (zG) {
            if (i10 == 22) {
                s0Var.s(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                s0Var.s(3);
            }
            s0Var.s(1);
        }
    }
}
