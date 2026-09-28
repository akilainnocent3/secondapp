package kotlin.time;

import com.sportybet.plugin.realsports.data.CashOut;
import defpackage.hb5;
import defpackage.ngf;
import defpackage.rgf;
import defpackage.tug;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements Comparable<b> {
    public static final a b = new a(null);
    public static final long c = c.b(4611686018427387903L);
    public static final long d = c.b(-4611686018427387903L);
    public static final long e = 9223372036854759646L;
    public final long a;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static long a(String str) {
            try {
                long jF = c.f(str, false);
                b.b.getClass();
                if (b.d(jF, b.e)) {
                    throw new IllegalStateException("invariant failed");
                }
                return jF;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(tug.a("Invalid duration string format: '", str, "'."), e);
            }
        }
    }

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long jA = c.a(j, j3);
        if (-4611686018426L > jA || jA >= 4611686018427L) {
            return c.b(jA);
        }
        return c.d((jA * 1000000) + (j2 - (j3 * 1000000)));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strZ = StringsKt.Z(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strZ.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strZ.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strZ, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strZ, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.i(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public static final long e(long j) {
        return ((((int) j) & 1) != 1 || h(j)) ? j(j, rgf.MILLISECONDS) : j >> 1;
    }

    public static final int f(long j) {
        if (h(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final boolean h(long j) {
        return j == c || j == d;
    }

    public static final long i(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? c.b(j3 / 1000000) : c.d(j3);
        }
        long jA = c.a(j >> 1, j2 >> 1);
        if (jA != 9223372036854759646L) {
            return (jA == 4611686018427387903L || jA == -4611686018427387903L) ? c.b(jA) : c.c(jA);
        }
        hb5.a("Summing infinite durations of different signs yields an undefined result.");
        return 0L;
    }

    public static final long j(long j, rgf rgfVar) {
        if (j == c) {
            return Long.MAX_VALUE;
        }
        if (j == d) {
            return Long.MIN_VALUE;
        }
        return rgfVar.a.convert(j >> 1, ((((int) j) & 1) == 0 ? rgf.NANOSECONDS : rgf.MILLISECONDS).a);
    }

    public static String k(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == c) {
            return "Infinity";
        }
        if (j == d) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = l(j);
        }
        long j2 = j(j, rgf.DAYS);
        int iJ = h(j) ? 0 : (int) (j(j, rgf.HOURS) % 24);
        int iJ2 = h(j) ? 0 : (int) (j(j, rgf.MINUTES) % 60);
        int iJ3 = h(j) ? 0 : (int) (j(j, rgf.SECONDS) % 60);
        int iF = f(j);
        boolean z2 = j2 != 0;
        boolean z3 = iJ != 0;
        boolean z4 = iJ2 != 0;
        boolean z5 = (iJ3 == 0 && iF == 0) ? false : true;
        if (z2) {
            sb.append(j2);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iJ);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iJ2);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iJ3 != 0 || z2 || z3 || z4) {
                b(sb, iJ3, iF, 9, "s", false);
            } else if (iF >= 1000000) {
                b(sb, iF / CashOut.BIG_NUMBER, iF % CashOut.BIG_NUMBER, 6, "ms", false);
            } else if (iF >= 1000) {
                b(sb, iF / 1000, iF % 1000, 3, "us", false);
            } else {
                sb.append(iF);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long l(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        b.getClass();
        int i = ngf.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        return c(this.a, bVar.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.a == ((b) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return k(this.a);
    }
}
