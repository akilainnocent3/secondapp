package defpackage;

import java.util.Arrays;
import java.util.Locale;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class wsc {
    public final IntRange a;
    public final h780 b;
    public final jsc c;
    public final guc d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public Long i;
    public Long j;

    public wsc(IntRange intRange, h780 h780Var, jsc jscVar, guc gucVar, String str, String str2, String str3, String str4) {
        this.a = intRange;
        this.b = h780Var;
        this.c = jscVar;
        this.d = gucVar;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0076  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    public final String a(xt5 xt5Var, int i, Locale locale) {
        Long l;
        long jLongValue;
        if (xt5Var == null) {
            String upperCase = this.c.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            Object[] objArrCopyOf = Arrays.copyOf(new Object[]{upperCase}, 1);
            return String.format(this.e, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
        int i2 = xt5Var.a;
        long j = xt5Var.d;
        IntRange intRange = this.a;
        if (!intRange.e(i2)) {
            Object[] objArrCopyOf2 = Arrays.copyOf(new Object[]{cu5.a(intRange.a, locale), cu5.a(intRange.b, locale)}, 2);
            return String.format(this.f, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
        }
        h780 h780Var = this.b;
        if (!h780Var.a(i2) || !h780Var.b(j)) {
            Object[] objArrCopyOf3 = Arrays.copyOf(new Object[]{this.d.b(Long.valueOf(j), locale, false)}, 1);
            return String.format(this.g, Arrays.copyOf(objArrCopyOf3, objArrCopyOf3.length));
        }
        if (i == 1) {
            Long l2 = this.j;
            if (j <= (l2 != null ? l2.longValue() : Long.MAX_VALUE)) {
                if (i == 2) {
                    return "";
                }
                l = this.i;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = Long.MIN_VALUE;
                }
                if (j >= jLongValue) {
                    return "";
                }
            }
        } else {
            if (i == 2) {
                return "";
            }
            l = this.i;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = Long.MIN_VALUE;
            }
            if (j >= jLongValue) {
                return "";
            }
        }
        return this.h;
    }
}
