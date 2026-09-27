package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f46292h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f46293i = {44100, 48000, 32000};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f46294j = {32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f46295k = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f46296l = {32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f46297m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f46298n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f46300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f46305g;

    public static int a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f46293i[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f46294j[i13 - 1] : f46295k[i13 - 1]) * 12000) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f46296l[i13 - 1] : f46297m[i13 - 1];
        } else {
            i15 = f46298n[i13 - 1];
        }
        if (i11 == 3) {
            return ((i15 * 144000) / i16) + i17;
        }
        return (((i12 == 1 ? 72000 : 144000) * i15) / i16) + i17;
    }

    public static boolean a(int i10, n nVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        int i19 = f46293i[i14];
        if (i11 == 2) {
            i19 /= 2;
        } else if (i11 == 0) {
            i19 /= 4;
        }
        int i20 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            i15 = i11 == 3 ? f46294j[i13 - 1] : f46295k[i13 - 1];
            i17 = (((i15 * 12000) / i19) + i20) * 4;
            i18 = 384;
        } else {
            int i21 = 1152;
            if (i11 == 3) {
                i15 = i12 == 2 ? f46296l[i13 - 1] : f46297m[i13 - 1];
                i16 = (144000 * i15) / i19;
            } else {
                i15 = f46298n[i13 - 1];
                i21 = i12 == 1 ? 576 : 1152;
                i16 = ((i12 == 1 ? 72000 : 144000) * i15) / i19;
            }
            i17 = i16 + i20;
            i18 = i21;
        }
        String str = f46292h[3 - i12];
        int i22 = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        nVar.f46299a = i11;
        nVar.f46300b = str;
        nVar.f46301c = i17;
        nVar.f46302d = i19;
        nVar.f46303e = i22;
        nVar.f46304f = i15 * 1000;
        nVar.f46305g = i18;
        return true;
    }
}
