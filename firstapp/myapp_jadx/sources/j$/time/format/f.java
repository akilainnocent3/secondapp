package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends i {
    public final boolean g;

    public f(j$.time.temporal.n nVar, int i, int i2, boolean z) {
        this(nVar, i, i2, z, 0);
        Objects.requireNonNull(nVar, "field");
        j$.time.temporal.q qVarK = nVar.K();
        if (qVarK.a != qVarK.b || qVarK.c != qVarK.d) {
            throw new IllegalArgumentException(j$.time.c.a("Field must have a fixed set of values: ", nVar));
        }
        if (i < 0 || i > 9) {
            j$.time.h.h("Minimum width must be from 0 to 9 inclusive but was ", i);
            throw null;
        }
        if (i2 < 1 || i2 > 9) {
            j$.time.h.h("Maximum width must be from 1 to 9 inclusive but was ", i2);
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final int C(u uVar, CharSequence charSequence, int i) {
        boolean z = uVar.c;
        DecimalStyle decimalStyle = uVar.a.c;
        int i2 = (z || b(uVar)) ? this.b : 0;
        int i3 = (uVar.c || b(uVar)) ? this.c : 9;
        int length = charSequence.length();
        if (i != length) {
            if (this.g) {
                if (charSequence.charAt(i) == decimalStyle.c) {
                    i++;
                } else if (i2 > 0) {
                    return ~i;
                }
            }
            int i4 = i;
            int i5 = i2 + i4;
            if (i5 > length) {
                return ~i4;
            }
            int iMin = Math.min(i3 + i4, length);
            int i6 = 0;
            int i7 = i4;
            while (i7 < iMin) {
                int i8 = i7 + 1;
                int iCharAt = charSequence.charAt(i7) - decimalStyle.a;
                if (iCharAt < 0 || iCharAt > 9) {
                    iCharAt = -1;
                }
                if (iCharAt < 0) {
                    if (i8 >= i5) {
                        break;
                    }
                    return ~i4;
                }
                i6 = (i6 * 10) + iCharAt;
                i7 = i8;
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i6).movePointLeft(i7 - i4);
            j$.time.temporal.q qVarK = this.a.K();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(qVarK.a);
            return uVar.f(this.a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(qVarK.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i4, i7);
        }
        if (i2 > 0) {
            return ~i;
        }
        return i;
    }

    @Override // j$.time.format.i
    public final boolean b(u uVar) {
        return uVar.c && this.b == this.c && !this.g;
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.e == -1) {
            return this;
        }
        return new f(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i) {
        return new f(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.g ? ",DecimalPoint" : "") + ")";
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final boolean x(w wVar, StringBuilder sb) {
        j$.time.temporal.n nVar = this.a;
        Long lA = wVar.a(nVar);
        if (lA == null) {
            return false;
        }
        DecimalStyle decimalStyle = wVar.b.c;
        long jLongValue = lA.longValue();
        j$.time.temporal.q qVarK = nVar.K();
        qVarK.b(jLongValue, nVar);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(qVarK.a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(qVarK.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (iScale != 0) {
            String strA = decimalStyle.a(bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2));
            if (z) {
                sb.append(decimalStyle.c);
            }
            sb.append(strA);
            return true;
        }
        if (i > 0) {
            if (z) {
                sb.append(decimalStyle.c);
            }
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(decimalStyle.a);
            }
        }
        return true;
    }

    public f(j$.time.temporal.n nVar, int i, int i2, boolean z, int i3) {
        super(nVar, i, i2, c0.NOT_NEGATIVE, i3);
        this.g = z;
    }
}
