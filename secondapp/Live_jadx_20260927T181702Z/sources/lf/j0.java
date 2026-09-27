package lf;

import eh.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class j0 {
    public static int a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static boolean b(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        for (int i14 = -4; i14 <= 4; i14++) {
            int i15 = (i14 * 188) + i12;
            if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                i13 = 0;
            } else {
                i13++;
                if (i13 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long c(t0 t0Var, int i10, int i11) {
        t0Var.Y(i10);
        if (t0Var.a() < 5) {
            return -9223372036854775807L;
        }
        int iS = t0Var.s();
        if ((8388608 & iS) != 0 || ((2096896 & iS) >> 8) != i11 || (iS & 32) == 0 || t0Var.L() < 7 || t0Var.a() < 7 || (t0Var.L() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        t0Var.n(bArr, 0, 6);
        return d(bArr);
    }

    public static long d(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
