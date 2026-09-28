package kotlin.time;

import com.sportybet.plugin.realsports.data.CashOut;
import defpackage.dy5;
import defpackage.efe0;
import defpackage.hb5;
import defpackage.hsn;
import defpackage.isn;
import defpackage.jsn;
import defpackage.ksn;
import defpackage.lsn;
import defpackage.msn;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements Comparable<d>, Serializable {
    public static final d c = new d(-31557014167219200L, 0);
    public static final d d = new d(31556889864403199L, 999999999);
    public final long a;
    public final int b;

    public static final class a {
        public static d a(long j) {
            long j2 = j / 1000;
            if ((j ^ 1000) < 0 && j2 * 1000 != j) {
                j2--;
            }
            long j3 = j % 1000;
            int i = (int) ((j3 + (1000 & (((j3 ^ 1000) & ((-j3) | j3)) >> 63))) * 1000000);
            if (j2 < -31557014167219200L) {
                return d.c;
            }
            return j2 > 31556889864403199L ? d.d : b(i, j2);
        }

        public static d b(int i, long j) {
            long j2 = i;
            long j3 = j2 / 1000000000;
            if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
                j3--;
            }
            long j4 = j + j3;
            if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
                return j > 0 ? d.d : d.c;
            }
            if (j4 < -31557014167219200L) {
                return d.c;
            }
            if (j4 > 31556889864403199L) {
                return d.d;
            }
            long j5 = j2 % 1000000000;
            return new d(j4, (int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)));
        }

        /* JADX WARN: Code duplicated, block: B:194:0x0456  */
        /* JADX WARN: Code duplicated, block: B:195:0x046c  */
        /* JADX WARN: Instruction removed from duplicated block: B:195:0x046c, please report this as an issue */
        public static d c(String str) {
            int i;
            int i2;
            int i3;
            f fVarC;
            int i4;
            char cCharAt;
            char cCharAt2;
            str.getClass();
            if (str.length() == 0) {
                fVarC = new f.a(str, "An empty string is not a valid Instant");
            } else {
                int i5 = 0;
                char cCharAt3 = str.charAt(0);
                if (cCharAt3 == '+' || cCharAt3 == '-') {
                    i = 1;
                } else {
                    i = 0;
                    cCharAt3 = ' ';
                }
                int iCharAt = 0;
                int i6 = i;
                while (i6 < str.length() && '0' <= (cCharAt2 = str.charAt(i6)) && cCharAt2 < ':') {
                    iCharAt = (iCharAt * 10) + (str.charAt(i6) - '0');
                    i6++;
                }
                int i7 = i6 - i;
                if (i7 > 10) {
                    fVarC = e.c(str, "Expected at most 10 digits for the year number, got " + i7 + " digits");
                } else if (i7 == 10 && str.charAt(i) >= '2') {
                    fVarC = e.c(str, "Expected at most 9 digits for the year number or year 1000000000, got " + i7 + " digits");
                } else if (i7 < 4) {
                    fVarC = e.c(str, "The year number must be padded to 4 digits, got " + i7 + " digits");
                } else if (cCharAt3 == '+' && i7 == 4) {
                    fVarC = e.c(str, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
                } else if (cCharAt3 != ' ' || i7 == 4) {
                    if (cCharAt3 == '-') {
                        iCharAt = -iCharAt;
                    }
                    int i8 = i6 + 16;
                    if (str.length() < i8) {
                        fVarC = e.c(str, "The input string is too short");
                    } else {
                        f.a aVarB = e.b(str, "'-'", i6, new hsn(i5));
                        if (aVarB == null && (aVarB = e.b(str, "'-'", i6 + 3, new isn(i5))) == null && (aVarB = e.b(str, "'T' or 't'", i6 + 6, new jsn())) == null && (aVarB = e.b(str, "':'", i6 + 9, new ksn(i5))) == null && (aVarB = e.b(str, "':'", i6 + 12, new lsn(i5))) == null) {
                            for (int i9 = 0; i9 < 10; i9++) {
                                fVarC = e.b(str, "an ASCII digit", e.b[i9] + i6, new msn());
                                if (fVarC == null) {
                                }
                            }
                            int iD = e.d(i6 + 1, str);
                            int iD2 = e.d(i6 + 4, str);
                            int iD3 = e.d(i6 + 7, str);
                            int iD4 = e.d(i6 + 10, str);
                            int iD5 = e.d(i6 + 13, str);
                            int i10 = i6 + 15;
                            if (str.charAt(i10) == '.') {
                                i10 = i8;
                                int iCharAt2 = 0;
                                while (i10 < str.length() && '0' <= (cCharAt = str.charAt(i10)) && cCharAt < ':') {
                                    iCharAt2 = (iCharAt2 * 10) + (str.charAt(i10) - '0');
                                    i10++;
                                }
                                int i11 = i10 - i8;
                                if (1 > i11 || i11 >= 10) {
                                    fVarC = e.c(str, "1..9 digits are supported for the fraction of the second, got " + i11 + " digits");
                                } else {
                                    i2 = iCharAt2 * e.a[9 - i11];
                                }
                            } else {
                                i2 = 0;
                            }
                            if (i10 >= str.length()) {
                                fVarC = e.c(str, "The UTC offset at the end of the string is missing");
                            } else {
                                char cCharAt4 = str.charAt(i10);
                                if (cCharAt4 == '+' || cCharAt4 == '-') {
                                    int length = str.length() - i10;
                                    if (length > 9) {
                                        fVarC = e.c(str, "The UTC offset string \"" + e.e(16, str.subSequence(i10, str.length()).toString()) + "\" is too long");
                                    } else if (length % 3 != 0) {
                                        fVarC = e.c(str, "Invalid UTC offset string \"" + str.subSequence(i10, str.length()).toString() + '\"');
                                    } else {
                                        int i12 = 0;
                                        for (int i13 = 2; i12 < i13; i13 = 2) {
                                            int i14 = i10 + e.c[i12];
                                            if (i14 >= str.length()) {
                                                break;
                                            }
                                            if (str.charAt(i14) != ':') {
                                                StringBuilder sbA = efe0.a(i14, "Expected ':' at index ", ", got '");
                                                sbA.append(str.charAt(i14));
                                                sbA.append('\'');
                                                fVarC = e.c(str, sbA.toString());
                                            } else {
                                                i12++;
                                            }
                                        }
                                        int i15 = 0;
                                        while (i15 < 6 && (i4 = e.d[i15] + i10) < str.length()) {
                                            char cCharAt5 = str.charAt(i4);
                                            int i16 = i15;
                                            if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                                StringBuilder sbA2 = efe0.a(i4, "Expected an ASCII digit at index ", ", got '");
                                                sbA2.append(str.charAt(i4));
                                                sbA2.append('\'');
                                                fVarC = e.c(str, sbA2.toString());
                                            } else {
                                                i15 = i16 + 1;
                                            }
                                        }
                                        int iD6 = e.d(i10 + 1, str);
                                        int iD7 = length > 3 ? e.d(i10 + 4, str) : 0;
                                        int iD8 = length > 6 ? e.d(i10 + 7, str) : 0;
                                        if (iD7 > 59) {
                                            fVarC = e.c(str, "Expected offset-minute-of-hour in 0..59, got " + iD7);
                                        } else if (iD8 > 59) {
                                            fVarC = e.c(str, "Expected offset-second-of-minute in 0..59, got " + iD8);
                                        } else if (iD6 <= 17 || (iD6 == 18 && iD7 == 0 && iD8 == 0)) {
                                            i3 = ((iD7 * 60) + (iD6 * 3600) + iD8) * (cCharAt4 == '-' ? -1 : 1);
                                            if (1 <= iD || iD >= 13) {
                                                fVarC = e.c(str, "Expected a month number in 1..12, got " + iD);
                                            } else if (1 > iD2) {
                                                StringBuilder sbA3 = dy5.a("Expected a valid day-of-month for month ", iD, iCharAt, " of year ", ", got ");
                                                sbA3.append(iD2);
                                                fVarC = e.c(str, sbA3.toString());
                                            } else {
                                                int i17 = iCharAt & 3;
                                                if (iD2 > (iD != 2 ? (iD == 4 || iD == 6 || iD == 9 || iD == 11) ? 30 : 31 : i17 == 0 && (iCharAt % 100 != 0 || iCharAt % 400 == 0) ? 29 : 28)) {
                                                    StringBuilder sbA4 = dy5.a("Expected a valid day-of-month for month ", iD, iCharAt, " of year ", ", got ");
                                                    sbA4.append(iD2);
                                                    fVarC = e.c(str, sbA4.toString());
                                                } else if (iD3 > 23) {
                                                    fVarC = e.c(str, "Expected hour in 0..23, got " + iD3);
                                                } else if (iD4 > 59) {
                                                    fVarC = e.c(str, "Expected minute-of-hour in 0..59, got " + iD4);
                                                } else if (iD5 > 59) {
                                                    fVarC = e.c(str, "Expected second-of-minute in 0..59, got " + iD5);
                                                } else {
                                                    long j = iCharAt;
                                                    long j2 = 365 * j;
                                                    long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + ((long) (((iD * 367) - 362) / 12)) + ((long) (iD2 - 1));
                                                    if (iD > 2) {
                                                        j3 = (i17 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? j3 - 2 : (-1) + j3;
                                                    }
                                                    fVarC = new f.b((((j3 - 719528) * 86400) + ((long) (((iD4 * 60) + (iD3 * 3600)) + iD5))) - ((long) i3), i2);
                                                }
                                            }
                                        } else {
                                            fVarC = e.c(str, "Expected an offset in -18:00..+18:00, got " + str.subSequence(i10, str.length()).toString());
                                        }
                                    }
                                } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
                                    int i18 = i10 + 1;
                                    if (str.length() == i18) {
                                        i3 = 0;
                                        if (1 <= iD) {
                                            fVarC = e.c(str, "Expected a month number in 1..12, got " + iD);
                                        } else {
                                            fVarC = e.c(str, "Expected a month number in 1..12, got " + iD);
                                        }
                                    } else {
                                        fVarC = e.c(str, "Extra text after the instant at position " + i18);
                                    }
                                } else {
                                    fVarC = e.c(str, "Expected the UTC offset at position " + i10 + ", got '" + cCharAt4 + '\'');
                                }
                            }
                        } else {
                            fVarC = aVarB;
                        }
                    }
                } else {
                    fVarC = e.c(str, "A '+' or '-' sign is required for year numbers longer than 4 digits");
                }
            }
            return fVarC.toInstant();
        }
    }

    public d(long j, int i) {
        this.a = j;
        this.b = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            hb5.a("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    public final long a() {
        long j = this.a;
        int i = this.b;
        long j2 = 1000;
        if (j >= 0) {
            if (j != 1) {
                if (j != 0) {
                    long j3 = j * 1000;
                    if (j3 / 1000 != j) {
                        return Long.MAX_VALUE;
                    }
                    j2 = j3;
                } else {
                    j2 = 0;
                }
            }
            long j4 = i / CashOut.BIG_NUMBER;
            long j5 = j2 + j4;
            if ((j2 ^ j5) >= 0 || (j4 ^ j2) < 0) {
                return j5;
            }
            return Long.MAX_VALUE;
        }
        long j6 = j + 1;
        if (j6 != 1) {
            if (j6 != 0) {
                long j7 = j6 * 1000;
                if (j7 / 1000 != j6) {
                    return Long.MIN_VALUE;
                }
                j2 = j7;
            } else {
                j2 = 0;
            }
        }
        long j8 = (i / CashOut.BIG_NUMBER) - 1000;
        long j9 = j2 + j8;
        if ((j2 ^ j9) >= 0 || (j8 ^ j2) < 0) {
            return j9;
        }
        return Long.MIN_VALUE;
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        d dVar2 = dVar;
        dVar2.getClass();
        int i = Intrinsics.i(this.a, dVar2.a);
        return i != 0 ? i : Intrinsics.h(this.b, dVar2.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b;
    }

    public final int hashCode() {
        return (this.b * 51) + Long.hashCode(this.a);
    }

    public final String toString() {
        long j;
        int[] iArr;
        int i;
        StringBuilder sb = new StringBuilder();
        j.h.getClass();
        long j2 = this.a;
        long j3 = j2 / 86400;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j4 = j2 % 86400;
        int i2 = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((400 * j5) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i3 = (int) j8;
        int i4 = ((i3 * 5) + 2) / 153;
        int i5 = ((i4 + 2) % 12) + 1;
        int i6 = (i3 - (((i4 * 306) + 5) / 10)) + 1;
        int i7 = (int) (j7 + j + ((long) (i4 / 10)));
        int i8 = i2 / 3600;
        int i9 = i2 - (i8 * 3600);
        int i10 = i9 / 60;
        int i11 = i9 - (i10 * 60);
        int i12 = this.b;
        j jVar = new j(i7, i5, i6, i8, i10, i11, i12);
        int i13 = 0;
        if (Math.abs(i7) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i7 >= 0) {
                sb2.append(i7 + 10000);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(i7 - 10000);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i7 >= 10000) {
                sb.append('+');
            }
            sb.append(i7);
        }
        sb.append('-');
        e.a(sb, sb, i5);
        sb.append('-');
        e.a(sb, sb, i6);
        sb.append('T');
        e.a(sb, sb, i8);
        sb.append(':');
        e.a(sb, sb, i10);
        sb.append(':');
        e.a(sb, sb, i11);
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                int i14 = i13 + 1;
                iArr = e.a;
                int i15 = iArr[i14];
                i = jVar.g;
                if (i % i15 != 0) {
                    break;
                }
                i13 = i14;
            }
            int i16 = i13 - (i13 % 3);
            String strValueOf = String.valueOf((i / iArr[i16]) + iArr[9 - i16]);
            strValueOf.getClass();
            sb.append(strValueOf.substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
