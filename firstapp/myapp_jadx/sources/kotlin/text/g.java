package kotlin.text;

import defpackage.hbh0;
import defpackage.j250;
import defpackage.nah0;
import defpackage.nbh0;
import defpackage.wbh0;

/* JADX INFO: loaded from: classes8.dex */
public final class g {
    public static final String a(int i) {
        return j250.b(CharsKt__CharJVMKt.checkRadix(16), ((long) i) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public static final byte b(String str) {
        nah0 nah0Var;
        str.getClass();
        hbh0 hbh0VarD = d(str);
        if (hbh0VarD != null) {
            int i = hbh0VarD.a;
            if (Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) > 0) {
                nah0Var = null;
            } else {
                nah0Var = new nah0((byte) i);
            }
        } else {
            nah0Var = null;
        }
        if (nah0Var != null) {
            return nah0Var.a;
        }
        StringsKt__StringNumberConversionsKt.j(str);
        throw null;
    }

    public static final int c(String str) {
        str.getClass();
        hbh0 hbh0VarD = d(str);
        if (hbh0VarD != null) {
            return hbh0VarD.a;
        }
        StringsKt__StringNumberConversionsKt.j(str);
        throw null;
    }

    public static final hbh0 d(String str) {
        int i;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt < '0') {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        hbh0.a aVar = hbh0.b;
        int i3 = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            int i4 = i2 ^ Integer.MIN_VALUE;
            if (Integer.compare(i4, i3 ^ Integer.MIN_VALUE) > 0) {
                if (i3 != 119304647 || Integer.compare(i4, -1717986919) > 0) {
                    return null;
                }
                i3 = 429496729;
            }
            int i5 = i2 * 10;
            int i6 = iDigit + i5;
            if (Integer.compare(i6 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i2 = i6;
        }
        return new hbh0(i2);
    }

    public static final long e(String str) {
        str.getClass();
        nbh0 nbh0VarF = f(str);
        if (nbh0VarF != null) {
            return nbh0VarF.a;
        }
        StringsKt__StringNumberConversionsKt.j(str);
        throw null;
    }

    public static final nbh0 f(String str) {
        str.getClass();
        str.getClass();
        int i = 10;
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt < '0') {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        nbh0.a aVar = nbh0.b;
        long j = 0;
        long j2 = 512409557603043100L;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), i);
            if (iDigit < 0) {
                return null;
            }
            long j3 = j ^ Long.MIN_VALUE;
            int i3 = length;
            if (Long.compare(j3, j2 ^ Long.MIN_VALUE) > 0) {
                if (j2 != 512409557603043100L || Long.compare(j3, -7378697629483820647L) > 0) {
                    return null;
                }
                j2 = 1844674407370955161L;
            }
            long j4 = j * 10;
            hbh0.a aVar2 = hbh0.b;
            long j5 = (((long) iDigit) & 4294967295L) + j4;
            if (Long.compare(j5 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            j = j5;
            length = i3;
            i = 10;
        }
        return new nbh0(j);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public static final short g(String str) {
        wbh0 wbh0Var;
        str.getClass();
        hbh0 hbh0VarD = d(str);
        if (hbh0VarD != null) {
            int i = hbh0VarD.a;
            if (Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) > 0) {
                wbh0Var = null;
            } else {
                wbh0Var = new wbh0((short) i);
            }
        } else {
            wbh0Var = null;
        }
        if (wbh0Var != null) {
            return wbh0Var.a;
        }
        StringsKt__StringNumberConversionsKt.j(str);
        throw null;
    }
}
