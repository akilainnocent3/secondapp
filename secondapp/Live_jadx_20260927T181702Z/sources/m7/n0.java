package m7;

import x4.m1;
import x4.v0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class n0 {
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

    public static long c(v0 v0Var, int i10, int i11) {
        v0Var.j0(i10);
        if (v0Var.a() < 5) {
            return -9223372036854775807L;
        }
        int iB = v0Var.B();
        if ((8388608 & iB) != 0 || ((2096896 & iB) >> 8) != i11 || (iB & 32) == 0 || v0Var.U() < 7 || v0Var.a() < 7 || (v0Var.U() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        v0Var.w(bArr, 0, 6);
        return d(bArr);
    }

    public static long d(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
