package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class jsk0 {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;

    /* JADX WARN: Code duplicated, block: B:37:0x00a5 A[LOOP:1: B:35:0x00a1->B:37:0x00a5, LOOP_END] */
    public jsk0(String str, char[] cArr) {
        int iNumberOfLeadingZeros;
        boolean[] zArr;
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        while (true) {
            if (i < cArr.length) {
                char c = cArr[i];
                if (!(c < 128)) {
                    hb5.a(epk0.a("Non-ASCII character: %s", Character.valueOf(c)));
                    throw null;
                }
                if (!(bArr[c] == -1)) {
                    hb5.a(epk0.a("Duplicate character: %s", Character.valueOf(c)));
                    throw null;
                }
                bArr[c] = (byte) i;
                i++;
            } else {
                this.a = str;
                this.b = cArr;
                try {
                    int length = cArr.length;
                    RoundingMode roundingMode = RoundingMode.UNNECESSARY;
                    if (length <= 0) {
                        throw new IllegalArgumentException("x (0) must be > 0");
                    }
                    switch (zsk0.a[roundingMode.ordinal()]) {
                        case 1:
                            if (((length - 1) & length) != 0) {
                                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                            }
                        case 2:
                        case 3:
                            iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                            this.d = iNumberOfLeadingZeros;
                            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                            int i2 = 1 << (3 - iNumberOfTrailingZeros);
                            this.e = i2;
                            this.f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros;
                            this.c = length - 1;
                            this.g = bArr;
                            zArr = new boolean[i2];
                            for (int i3 = 0; i3 < this.f; i3++) {
                                int i4 = this.d;
                                RoundingMode roundingMode2 = RoundingMode.CEILING;
                                zArr[atk0.a(i3 * 8, i4)] = true;
                            }
                            return;
                        case 4:
                        case 5:
                            iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                            this.d = iNumberOfLeadingZeros;
                            int iNumberOfTrailingZeros2 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                            int i5 = 1 << (3 - iNumberOfTrailingZeros2);
                            this.e = i5;
                            this.f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros2;
                            this.c = length - 1;
                            this.g = bArr;
                            zArr = new boolean[i5];
                            while (i3 < this.f) {
                                int i6 = this.d;
                                RoundingMode roundingMode3 = RoundingMode.CEILING;
                                zArr[atk0.a(i3 * 8, i6)] = true;
                            }
                            return;
                        case 6:
                        case 7:
                        case 8:
                            int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                            iNumberOfLeadingZeros = (31 - iNumberOfLeadingZeros2) + ((((-1257966797) >>> iNumberOfLeadingZeros2) - length) >>> 31);
                            this.d = iNumberOfLeadingZeros;
                            int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                            int i7 = 1 << (3 - iNumberOfTrailingZeros3);
                            this.e = i7;
                            this.f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros3;
                            this.c = length - 1;
                            this.g = bArr;
                            zArr = new boolean[i7];
                            while (i3 < this.f) {
                                int i8 = this.d;
                                RoundingMode roundingMode4 = RoundingMode.CEILING;
                                zArr[atk0.a(i3 * 8, i8)] = true;
                            }
                            return;
                        default:
                            throw new AssertionError();
                    }
                } catch (ArithmeticException e) {
                    throw new IllegalArgumentException(hce0.a(cArr.length, "Illegal alphabet length "), e);
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jsk0) && Arrays.equals(this.b, ((jsk0) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + 1237;
    }

    public final String toString() {
        return this.a;
    }
}
