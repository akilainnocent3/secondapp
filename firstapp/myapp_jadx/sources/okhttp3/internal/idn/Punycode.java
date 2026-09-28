package okhttp3.internal.idn;

import com.google.protobuf.Reader;
import defpackage.fa30;
import defpackage.lb5;
import defpackage.lrh0;
import defpackage.ndv;
import defpackage.rl5;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ranges.f;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007R\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/idn/Punycode;", "", "<init>", "()V", "", "string", "encode", "(Ljava/lang/String;)Ljava/lang/String;", "decode", "a", "Ljava/lang/String;", "getPREFIX_STRING", "()Ljava/lang/String;", "PREFIX_STRING", "Lrl5;", "b", "Lrl5;", "getPREFIX", "()Lrl5;", "PREFIX", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Punycode {
    public static final Punycode INSTANCE = new Punycode();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String PREFIX_STRING = "xn--";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final rl5 PREFIX;

    static {
        rl5 rl5Var = rl5.d;
        PREFIX = rl5.a.c("xn--");
    }

    private Punycode() {
    }

    public static int a(int i, int i2, boolean z) {
        int i3 = z ? i / 700 : i / 2;
        int i4 = (i3 / i2) + i3;
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return ((i4 * 36) / (i4 + 38)) + i5;
    }

    public static int b(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        fa30.a(i, "unexpected digit: ");
        return 0;
    }

    public final String decode(String string) {
        int i;
        int i2;
        int i3;
        string.getClass();
        int length = string.length();
        lb5 lb5Var = new lb5();
        int i4 = 0;
        while (i4 < length) {
            int iS = StringsKt.S(string, '.', i4, 4);
            int i5 = iS == -1 ? length : iS;
            if (c.n(i4, 0, 4, string, PREFIX_STRING, true)) {
                int i6 = i4 + 4;
                ArrayList arrayList = new ArrayList();
                int iW = StringsKt.W(string, '-', i5, 4);
                char c = '0';
                char c2 = '[';
                char c3 = '{';
                if (iW >= i6) {
                    while (i6 < iW) {
                        int i7 = i6 + 1;
                        char cCharAt = string.charAt(i6);
                        if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && (('0' > cCharAt || cCharAt >= ':') && cCharAt != '-'))) {
                            return null;
                        }
                        arrayList.add(Integer.valueOf(cCharAt));
                        i6 = i7;
                    }
                    i6++;
                }
                int i8 = 128;
                int iA = 72;
                int i9 = 0;
                while (i6 < i5) {
                    kotlin.ranges.c cVarL = f.l(36, f.n(36, Reader.READ_DONE));
                    int i10 = cVarL.a;
                    int i11 = cVarL.b;
                    int i12 = cVarL.c;
                    if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                        i = i9;
                        int i13 = 1;
                        while (i6 != i5) {
                            int i14 = i6 + 1;
                            char cCharAt2 = string.charAt(i6);
                            if ('a' <= cCharAt2 && cCharAt2 < c3) {
                                i2 = cCharAt2 - 'a';
                            } else if ('A' <= cCharAt2 && cCharAt2 < c2) {
                                i2 = cCharAt2 - 'A';
                            } else {
                                if (c > cCharAt2 || cCharAt2 >= ':') {
                                    return null;
                                }
                                i2 = cCharAt2 - 22;
                            }
                            int i15 = i13;
                            int i16 = i2 * i15;
                            int i17 = i;
                            if (i17 > Reader.READ_DONE - i16) {
                                return null;
                            }
                            i = i17 + i16;
                            if (i10 <= iA) {
                                i3 = 1;
                            } else {
                                i3 = i10 >= iA + 26 ? 26 : i10 - iA;
                            }
                            if (i2 >= i3) {
                                int i18 = 36 - i3;
                                if (i15 > Reader.READ_DONE / i18) {
                                    return null;
                                }
                                i13 = i15 * i18;
                                if (i10 != i11) {
                                    i10 += i12;
                                    i6 = i14;
                                    c = '0';
                                    c2 = '[';
                                    c3 = '{';
                                }
                            }
                            i6 = i14;
                        }
                        return null;
                    }
                    i = i9;
                    iA = a(i - i9, arrayList.size() + 1, i9 == 0);
                    int size = i / (arrayList.size() + 1);
                    if (i8 > Reader.READ_DONE - size) {
                        return null;
                    }
                    i8 += size;
                    int size2 = i % (arrayList.size() + 1);
                    if (i8 > 1114111) {
                        return null;
                    }
                    arrayList.add(size2, Integer.valueOf(i8));
                    i9 = size2 + 1;
                    c = '0';
                    c2 = '[';
                    c3 = '{';
                }
                int size3 = arrayList.size();
                int i19 = 0;
                while (i19 < size3) {
                    Object obj = arrayList.get(i19);
                    i19++;
                    lb5Var.A0(((Number) obj).intValue());
                }
            } else {
                lb5Var.u0(i4, i5, string);
            }
            if (i5 >= length) {
                break;
            }
            lb5Var.d0(46);
            i4 = i5 + 1;
        }
        return lb5Var.Y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [char] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9, types: [int] */
    public final String encode(String string) {
        String str;
        int i;
        int i2;
        int i3;
        string.getClass();
        int length = string.length();
        lb5 lb5Var = new lb5();
        int iA = 0;
        while (iA < length) {
            int iS = StringsKt.S(string, '.', iA, 4);
            if (iS == -1) {
                iS = length;
            }
            int i4 = iA;
            while (true) {
                if (i4 >= iS) {
                    lb5Var.u0(iA, iS, string);
                    break;
                }
                int i5 = 128;
                if (string.charAt(i4) >= 128) {
                    lb5Var.c0(PREFIX);
                    ArrayList arrayList = new ArrayList();
                    while (iA < iS) {
                        int iCharAt = string.charAt(iA);
                        if (55296 <= iCharAt && iCharAt < 57344) {
                            int i6 = iA + 1;
                            char cCharAt = i6 < iS ? string.charAt(i6) : (char) 0;
                            if (Character.isLowSurrogate(iCharAt) || !Character.isLowSurrogate(cCharAt)) {
                                iCharAt = 63;
                            } else {
                                iCharAt = 65536 + (((iCharAt & 1023) << 10) | (cCharAt & 1023));
                                iA = i6;
                            }
                        }
                        iA = ndv.a(iCharAt, iA, 1, arrayList);
                    }
                    int size = arrayList.size();
                    int i7 = 0;
                    int i8 = 0;
                    while (i8 < size) {
                        Object obj = arrayList.get(i8);
                        i8++;
                        int iIntValue = ((Number) obj).intValue();
                        if (iIntValue < 128) {
                            lb5Var.d0(iIntValue);
                            i7++;
                        }
                    }
                    if (i7 > 0) {
                        lb5Var.d0(45);
                    }
                    int iA2 = 72;
                    int i9 = i7;
                    int i10 = 0;
                    while (i9 < arrayList.size()) {
                        Iterator it = arrayList.iterator();
                        if (!it.hasNext()) {
                            lrh0.a();
                            return null;
                        }
                        Object next = it.next();
                        boolean zHasNext = it.hasNext();
                        int i11 = Reader.READ_DONE;
                        if (zHasNext) {
                            int iIntValue2 = ((Number) next).intValue();
                            if (iIntValue2 < i5) {
                                iIntValue2 = Integer.MAX_VALUE;
                            }
                            do {
                                Object next2 = it.next();
                                str = null;
                                int iIntValue3 = ((Number) next2).intValue();
                                if (iIntValue3 < i5) {
                                    iIntValue3 = Integer.MAX_VALUE;
                                }
                                if (iIntValue2 > iIntValue3) {
                                    iIntValue2 = iIntValue3;
                                    next = next2;
                                }
                            } while (it.hasNext());
                        } else {
                            str = null;
                        }
                        int iIntValue4 = ((Number) next).intValue();
                        int i12 = (i9 + 1) * (iIntValue4 - i5);
                        if (i10 <= Reader.READ_DONE - i12) {
                            int i13 = i10 + i12;
                            int size2 = arrayList.size();
                            int i14 = 0;
                            while (i14 < size2) {
                                Object obj2 = arrayList.get(i14);
                                i14++;
                                int iIntValue5 = ((Number) obj2).intValue();
                                if (iIntValue5 < iIntValue4) {
                                    if (i13 != i11) {
                                        i13++;
                                    }
                                } else if (iIntValue5 == iIntValue4) {
                                    kotlin.ranges.c cVarL = f.l(36, f.n(36, i11));
                                    int i15 = cVarL.a;
                                    int i16 = cVarL.b;
                                    int i17 = cVarL.c;
                                    if ((i17 > 0 && i15 <= i16) || (i17 < 0 && i16 <= i15)) {
                                        i = i13;
                                        while (true) {
                                            if (i15 <= iA2) {
                                                i2 = iA2;
                                                i3 = 1;
                                            } else {
                                                i2 = iA2;
                                                i3 = i15 >= i2 + 26 ? 26 : i15 - i2;
                                            }
                                            if (i < i3) {
                                                break;
                                            }
                                            int i18 = i - i3;
                                            int i19 = 36 - i3;
                                            lb5Var.d0(b((i18 % i19) + i3));
                                            i = i18 / i19;
                                            if (i15 == i16) {
                                                break;
                                            }
                                            i15 += i17;
                                            iA2 = i2;
                                        }
                                    } else {
                                        i = i13;
                                    }
                                    lb5Var.d0(b(i));
                                    int i20 = i9 + 1;
                                    iA2 = a(i13, i20, i9 == i7);
                                    i9 = i20;
                                    i11 = Reader.READ_DONE;
                                    i13 = 0;
                                }
                            }
                            i10 = i13 + 1;
                            i5 = iIntValue4 + 1;
                        }
                        return str;
                    }
                    break;
                }
                i4++;
            }
            if (iS >= length) {
                break;
            }
            lb5Var.d0(46);
            iA = iS + 1;
        }
        return lb5Var.Y();
    }

    public final rl5 getPREFIX() {
        return PREFIX;
    }

    public final String getPREFIX_STRING() {
        return PREFIX_STRING;
    }
}
