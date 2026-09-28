package defpackage;

import android.content.res.Resources;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class pwo {
    public static final owo a(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new owo(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & 4294967295L)) + i2);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            hb5.a("The key length in bytes must be 32.");
            return null;
        }
        long jC = c(0, bArr) & 67108863;
        int i = 3;
        long jC2 = (c(3, bArr) >> 2) & 67108611;
        long jC3 = (c(6, bArr) >> 4) & 67092735;
        long jC4 = (c(9, bArr) >> 6) & 66076671;
        long jC5 = (c(12, bArr) >> 8) & 1048575;
        long j = jC2 * 5;
        long j2 = jC3 * 5;
        long j3 = jC4 * 5;
        long j4 = jC5 * 5;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i2 = 0;
        while (i2 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jC6 = j9 + (c(0, bArr3) & 67108863);
            long jC7 = j5 + ((c(i, bArr3) >> 2) & 67108863);
            long jC8 = j6 + ((c(6, bArr3) >> 4) & 67108863);
            long jC9 = j7 + ((c(9, bArr3) >> 6) & 67108863);
            long j10 = jC2;
            long jC10 = j8 + (((c(12, bArr3) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j11 = (jC10 * j) + (jC9 * j2) + (jC8 * j3) + (jC7 * j4) + (jC6 * jC);
            long j12 = (jC10 * j2) + (jC9 * j3) + (jC8 * j4) + (jC7 * jC) + (jC6 * j10);
            long j13 = (jC10 * j3) + (jC9 * j4) + (jC8 * jC) + (jC7 * j10) + (jC6 * jC3);
            long j14 = (jC10 * j4) + (jC9 * jC) + (jC8 * j10) + (jC7 * jC3) + (jC6 * jC4);
            long j15 = jC9 * j10;
            long j16 = jC10 * jC;
            long j17 = j12 + (j11 >> 26);
            long j18 = j13 + (j17 >> 26);
            long j19 = j14 + (j18 >> 26);
            long j20 = j16 + j15 + (jC8 * jC3) + (jC7 * jC4) + (jC6 * jC5) + (j19 >> 26);
            long j21 = j20 >> 26;
            j8 = j20 & 67108863;
            long j22 = (j21 * 5) + (j11 & 67108863);
            i2 += 16;
            j6 = j18 & 67108863;
            j7 = j19 & 67108863;
            j9 = j22 & 67108863;
            j5 = (j17 & 67108863) + (j22 >> 26);
            jC2 = j10;
            i = 3;
        }
        long j23 = j6 + (j5 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j7 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j8 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = ((j27 >> 26) * 5) + j9;
        long j30 = j29 >> 26;
        long j31 = j29 & 67108863;
        long j32 = (j5 & 67108863) + j30;
        long j33 = j31 + 5;
        long j34 = j33 & 67108863;
        long j35 = j32 + (j33 >> 26);
        long j36 = j24 + (j35 >> 26);
        long j37 = j26 + (j36 >> 26);
        long j38 = j37 & 67108863;
        long j39 = (j28 + (j37 >> 26)) - 67108864;
        long j40 = j39 >> 63;
        long j41 = j31 & j40;
        long j42 = j32 & j40;
        long j43 = j24 & j40;
        long j44 = j26 & j40;
        long j45 = j28 & j40;
        long j46 = ~j40;
        long j47 = j42 | (j35 & 67108863 & j46);
        long j48 = j43 | (j36 & 67108863 & j46);
        long j49 = j44 | (j38 & j46);
        long j50 = (j41 | (j34 & j46) | (j47 << 26)) & 4294967295L;
        long j51 = ((j47 >> 6) | (j48 << 20)) & 4294967295L;
        long j52 = ((j48 >> 12) | (j49 << 14)) & 4294967295L;
        long j53 = ((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & 4294967295L;
        long jC11 = c(16, bArr) + j50;
        long j54 = jC11 & 4294967295L;
        long jC12 = c(20, bArr) + j51 + (jC11 >> 32);
        long jC13 = c(24, bArr) + j52 + (jC12 >> 32);
        long jC14 = (c(28, bArr) + j53 + (jC13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        g(bArr4, j54, 0);
        g(bArr4, jC12 & 4294967295L, 4);
        g(bArr4, jC13 & 4294967295L, 8);
        g(bArr4, jC14, 12);
        return bArr4;
    }

    public static long c(int i, byte[] bArr) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    public static final owo d(lk40 lk40Var) {
        return new owo(Math.round(lk40Var.a), Math.round(lk40Var.b), Math.round(lk40Var.c), Math.round(lk40Var.d));
    }

    public static final String e(int i, a aVar) {
        return ((Resources) aVar.O(AndroidCompositionLocals_androidKt.c)).getString(i);
    }

    public static final String f(int i, Object[] objArr, a aVar) {
        return ((Resources) aVar.O(AndroidCompositionLocals_androidKt.c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static void g(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }
}
