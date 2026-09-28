package j$.time.format;

import java.math.BigInteger;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public class i implements e {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS};
    public final j$.time.temporal.n a;
    public final int b;
    public final int c;
    public final c0 d;
    public final int e;

    public i(j$.time.temporal.n nVar, int i, int i2, c0 c0Var) {
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = c0Var;
        this.e = 0;
    }

    @Override // j$.time.format.e
    public int C(u uVar, CharSequence charSequence, int i) {
        boolean z;
        boolean z2;
        BigInteger bigIntegerAdd;
        boolean z3;
        int i2;
        long j;
        DateTimeFormatter dateTimeFormatter;
        int i3 = i;
        DateTimeFormatter dateTimeFormatter2 = uVar.a;
        int length = charSequence.length();
        if (i3 == length) {
            return ~i3;
        }
        char cCharAt = charSequence.charAt(i);
        DecimalStyle decimalStyle = dateTimeFormatter2.c;
        decimalStyle.getClass();
        int i4 = this.c;
        c0 c0Var = this.d;
        int i5 = this.b;
        int i6 = 0;
        boolean z4 = true;
        if (cCharAt == '+') {
            boolean z5 = uVar.c;
            boolean z6 = i5 == i4;
            int iOrdinal = c0Var.ordinal();
            if (iOrdinal == 0 ? z5 : !(iOrdinal == 1 || iOrdinal == 4 || (!z5 && !z6))) {
                return ~i3;
            }
            i3++;
            z = false;
            z2 = true;
        } else if (cCharAt == decimalStyle.b) {
            boolean z7 = uVar.c;
            boolean z8 = i5 == i4;
            int iOrdinal2 = c0Var.ordinal();
            if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 4 && (z7 || z8)) {
                return ~i3;
            }
            i3++;
            z2 = false;
            z = true;
        } else {
            if (c0Var == c0.ALWAYS && uVar.c) {
                return ~i3;
            }
            z = false;
            z2 = false;
        }
        int i7 = (uVar.c || b(uVar)) ? i5 : 1;
        int i8 = i3 + i7;
        if (i8 > length) {
            return ~i3;
        }
        if (!uVar.c && !b(uVar)) {
            i4 = 9;
        }
        int i9 = this.e;
        int iMax = Math.max(i9, 0) + i4;
        while (true) {
            bigIntegerAdd = null;
            if (i6 >= 2) {
                z3 = z;
                i2 = i3;
                j = 0;
                break;
            }
            int iMin = Math.min(i3 + iMax, length);
            boolean z9 = z4;
            long j2 = 0;
            int i10 = i3;
            while (true) {
                if (i10 >= iMin) {
                    dateTimeFormatter = dateTimeFormatter2;
                    break;
                }
                int i11 = i10 + 1;
                int iCharAt = charSequence.charAt(i10) - dateTimeFormatter2.c.a;
                dateTimeFormatter = dateTimeFormatter2;
                if (iCharAt < 0 || iCharAt > 9) {
                    iCharAt = -1;
                }
                if (iCharAt < 0) {
                    if (i10 >= i8) {
                        break;
                    }
                    return ~i3;
                }
                if (i11 - i3 > 18) {
                    if (bigIntegerAdd == null) {
                        bigIntegerAdd = BigInteger.valueOf(j2);
                    }
                    bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(iCharAt));
                } else {
                    j2 = (j2 * 10) + ((long) iCharAt);
                }
                i10 = i11;
                dateTimeFormatter2 = dateTimeFormatter;
                length = length;
                z = z;
            }
            int i12 = length;
            z3 = z;
            if (i9 <= 0 || i6 != 0) {
                i2 = i10;
                j = j2;
                break;
            }
            int iMax2 = Math.max(i7, (i10 - i3) - i9);
            i6++;
            z4 = z9;
            dateTimeFormatter2 = dateTimeFormatter;
            length = i12;
            z = z3;
            iMax = iMax2;
        }
        BigInteger bigIntegerDivide = bigIntegerAdd;
        if (z3) {
            if (bigIntegerDivide != null) {
                if (bigIntegerDivide.equals(BigInteger.ZERO) && uVar.c) {
                    return ~(i3 - 1);
                }
                bigIntegerDivide = bigIntegerDivide.negate();
            } else {
                if (j == 0 && uVar.c) {
                    return ~(i3 - 1);
                }
                j = -j;
            }
        } else if (c0Var == c0.EXCEEDS_PAD && uVar.c) {
            int i13 = i2 - i3;
            if (z2) {
                if (i13 <= i5) {
                    return ~(i3 - 1);
                }
            } else if (i13 > i5) {
                return ~i3;
            }
        }
        if (bigIntegerDivide == null) {
            return c(uVar, j, i3, i2);
        }
        if (bigIntegerDivide.bitLength() > 63) {
            bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
            i2--;
        }
        return c(uVar, bigIntegerDivide.longValue(), i3, i2);
    }

    public boolean b(u uVar) {
        int i = this.e;
        if (i != -1) {
            return i > 0 && this.b == this.c && this.d == c0.NOT_NEGATIVE;
        }
        return true;
    }

    public int c(u uVar, long j, int i, int i2) {
        return uVar.f(this.a, j, i, i2);
    }

    public i d() {
        if (this.e == -1) {
            return this;
        }
        return new i(this.a, this.b, this.c, this.d, -1);
    }

    public i e(int i) {
        return new i(this.a, this.b, this.c, this.d, this.e + i);
    }

    public String toString() {
        int i = this.c;
        j$.time.temporal.n nVar = this.a;
        c0 c0Var = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && c0Var == c0.NORMAL) {
            return "Value(" + nVar + ")";
        }
        if (i2 == i && c0Var == c0.NOT_NEGATIVE) {
            return "Value(" + nVar + "," + i2 + ")";
        }
        return "Value(" + nVar + "," + i2 + "," + i + "," + c0Var + ")";
    }

    @Override // j$.time.format.e
    public boolean x(w wVar, StringBuilder sb) {
        j$.time.temporal.n nVar = this.a;
        Long lA = wVar.a(nVar);
        if (lA == null) {
            return false;
        }
        long jA = a(wVar, lA.longValue());
        DecimalStyle decimalStyle = wVar.b.c;
        String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
        int length = string.length();
        int i = this.c;
        if (length > i) {
            throw new j$.time.b("Field " + nVar + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i);
        }
        String strA = decimalStyle.a(string);
        int i2 = this.b;
        c0 c0Var = this.d;
        if (jA >= 0) {
            int i3 = b.a[c0Var.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jA >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = b.a[c0Var.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append(decimalStyle.b);
            } else if (i4 == 4) {
                throw new j$.time.b("Field " + nVar + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - strA.length(); i5++) {
            sb.append(decimalStyle.a);
        }
        sb.append(strA);
        return true;
    }

    public i(j$.time.temporal.n nVar, int i, int i2, c0 c0Var, int i3) {
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = c0Var;
        this.e = i3;
    }

    public long a(w wVar, long j) {
        return j;
    }
}
