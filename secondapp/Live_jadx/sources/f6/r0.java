package f6;

import androidx.annotation.Nullable;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f83632a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f83633b = 40000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f83634c = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f83635d = {44100, 48000, 32000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f83636e = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f83637f = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f83638g = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f83639h = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f83640i = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f83641j = 384;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f83642k = 1152;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f83643l = 1152;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f83644m = 576;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f83645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f83646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f83647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f83648d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f83649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f83650f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f83651g;

        public a() {
        }

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!r0.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f83645a = i11;
            this.f83646b = r0.f83634c[3 - i12];
            int i15 = r0.f83635d[i14];
            this.f83648d = i15;
            if (i11 == 2) {
                this.f83648d = i15 / 2;
            } else if (i11 == 0) {
                this.f83648d = i15 / 4;
            }
            int i16 = (i10 >>> 9) & 1;
            this.f83651g = r0.k(i11, i12);
            if (i12 == 3) {
                int i17 = i11 == 3 ? r0.f83636e[i13 - 1] : r0.f83637f[i13 - 1];
                this.f83650f = i17;
                this.f83647c = (((i17 * 12) / this.f83648d) + i16) * 4;
            } else {
                if (i11 == 3) {
                    int i18 = i12 == 2 ? r0.f83638g[i13 - 1] : r0.f83639h[i13 - 1];
                    this.f83650f = i18;
                    this.f83647c = ((i18 * 144) / this.f83648d) + i16;
                } else {
                    int i19 = r0.f83640i[i13 - 1];
                    this.f83650f = i19;
                    this.f83647c = (((i12 == 1 ? 72 : 144) * i19) / this.f83648d) + i16;
                }
            }
            this.f83649e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public a(a aVar) {
            this.f83645a = aVar.f83645a;
            this.f83646b = aVar.f83646b;
            this.f83647c = aVar.f83647c;
            this.f83648d = aVar.f83648d;
            this.f83649e = aVar.f83649e;
            this.f83650f = aVar.f83650f;
            this.f83651g = aVar.f83651g;
        }
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f83635d[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f83636e[i13 - 1] : f83637f[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f83638g[i13 - 1] : f83639h[i13 - 1];
        } else {
            i15 = f83640i[i13 - 1];
        }
        if (i11 == 3) {
            return ((i15 * 144) / i16) + i17;
        }
        return (((i12 == 1 ? 72 : 144) * i15) / i16) + i17;
    }

    public static int k(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static boolean l(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int m(int i10) {
        int i11;
        int i12;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return k(i11, i12);
    }
}
