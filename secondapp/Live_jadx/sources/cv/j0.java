package cv;

import dr.l1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class j0 extends i0 {
    @oy.l
    public static final Void m1(@oy.l String input) {
        kotlin.jvm.internal.m0.p(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    @l1(version = "1.1")
    @oy.m
    public static final Byte n1(@oy.l String str) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        return o1(str, 10);
    }

    @l1(version = "1.1")
    @oy.m
    public static final Byte o1(@oy.l String str, int i10) {
        int iIntValue;
        kotlin.jvm.internal.m0.p(str, "<this>");
        Integer numQ1 = q1(str, i10);
        if (numQ1 == null || (iIntValue = numQ1.intValue()) < -128 || iIntValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) iIntValue);
    }

    @l1(version = "1.1")
    @oy.m
    public static Integer p1(@oy.l String str) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        return q1(str, 10);
    }

    @l1(version = "1.1")
    @oy.m
    public static final Integer q1(@oy.l String str, int i10) {
        boolean z10;
        int i11;
        int i12;
        kotlin.jvm.internal.m0.p(str, "<this>");
        e.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char cCharAt = str.charAt(0);
        int i14 = -2147483647;
        if (kotlin.jvm.internal.m0.t(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i14 = Integer.MIN_VALUE;
                z10 = true;
            }
        } else {
            z10 = false;
            i11 = 0;
        }
        int i15 = -59652323;
        while (i11 < length) {
            int iB = e.b(str.charAt(i11), i10);
            if (iB < 0) {
                return null;
            }
            if ((i13 < i15 && (i15 != -59652323 || i13 < (i15 = i14 / i10))) || (i12 = i13 * i10) < i14 + iB) {
                return null;
            }
            i13 = i12 - iB;
            i11++;
        }
        return z10 ? Integer.valueOf(i13) : Integer.valueOf(-i13);
    }

    @l1(version = "1.1")
    @oy.m
    public static Long r1(@oy.l String str) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        return s1(str, 10);
    }

    @l1(version = "1.1")
    @oy.m
    public static final Long s1(@oy.l String str, int i10) {
        boolean z10;
        kotlin.jvm.internal.m0.p(str, "<this>");
        e.a(i10);
        int length = str.length();
        Long l10 = null;
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        if (kotlin.jvm.internal.m0.t(cCharAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
                i11 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j10 = Long.MIN_VALUE;
                i11 = 1;
            }
        } else {
            z10 = false;
        }
        long j11 = 0;
        long j12 = -256204778801521550L;
        while (i11 < length) {
            int iB = e.b(str.charAt(i11), i10);
            if (iB < 0) {
                return l10;
            }
            if (j11 < j12) {
                if (j12 != -256204778801521550L) {
                    return l10;
                }
                j12 = j10 / ((long) i10);
                if (j11 < j12) {
                    return l10;
                }
            }
            Long l11 = l10;
            int i12 = i11;
            long j13 = j11 * ((long) i10);
            long j14 = iB;
            if (j13 < j10 + j14) {
                return l11;
            }
            j11 = j13 - j14;
            i11 = i12 + 1;
            l10 = l11;
        }
        return z10 ? Long.valueOf(j11) : Long.valueOf(-j11);
    }

    @l1(version = "1.1")
    @oy.m
    public static final Short t1(@oy.l String str) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        return u1(str, 10);
    }

    @l1(version = "1.1")
    @oy.m
    public static final Short u1(@oy.l String str, int i10) {
        int iIntValue;
        kotlin.jvm.internal.m0.p(str, "<this>");
        Integer numQ1 = q1(str, i10);
        if (numQ1 == null || (iIntValue = numQ1.intValue()) < -32768 || iIntValue > 32767) {
            return null;
        }
        return Short.valueOf((short) iIntValue);
    }
}
