package d5;

import android.annotation.SuppressLint;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x4 {
    public static int c(int i10) {
        return e(i10, 0, 0, 0);
    }

    public static int d(int i10, int i11, int i12) {
        return g(i10, i11, i12, 0, 128, 0);
    }

    public static int e(int i10, int i11, int i12, int i13) {
        return g(i10, i11, i12, 0, 128, i13);
    }

    public static int f(int i10, int i11, int i12, int i13, int i14) {
        return g(i10, i11, i12, i13, i14, 0);
    }

    @SuppressLint({"WrongConstant"})
    public static int g(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i10 | i11 | i12 | i13 | i14 | i15;
    }

    @SuppressLint({"WrongConstant"})
    public static int h(int i10) {
        return i10 & 24;
    }

    @SuppressLint({"WrongConstant"})
    public static int i(int i10) {
        return i10 & androidx.media3.exoplayer.r.I9;
    }

    @SuppressLint({"WrongConstant"})
    public static int j(int i10) {
        return i10 & 384;
    }

    @SuppressLint({"WrongConstant"})
    public static int k(int i10) {
        return i10 & 7;
    }

    @SuppressLint({"WrongConstant"})
    public static int l(int i10) {
        return i10 & 64;
    }

    @SuppressLint({"WrongConstant"})
    public static int m(int i10) {
        return i10 & 32;
    }

    public static boolean n(int i10, boolean z10) {
        int iK = k(i10);
        if (iK != 4) {
            return z10 && iK == 3;
        }
        return true;
    }

    public static void a(androidx.media3.exoplayer.r rVar) {
    }

    public static void b(androidx.media3.exoplayer.r rVar, androidx.media3.exoplayer.r.f fVar) {
    }
}
