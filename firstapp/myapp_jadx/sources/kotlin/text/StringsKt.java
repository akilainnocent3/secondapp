package kotlin.text;

import com.appsflyer.internal.m;
import defpackage.ay0;
import defpackage.hb5;
import defpackage.hmd;
import defpackage.id80;
import defpackage.l48;
import defpackage.m2g;
import defpackage.mae0;
import defpackage.n36;
import defpackage.pe4;
import defpackage.pfs;
import defpackage.wae0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"oae0", "qae0", "rae0", "sae0", "tae0", "uae0", "kotlin/text/b", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/c", "kotlin/text/StringsKt__StringsKt", "kotlin/text/f", "wae0"}, d2 = {}, k = 4, mv = {2, 4, 0}, xi = 49)
public final class StringsKt extends wae0 {
    private StringsKt() {
    }

    public static boolean M(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (T(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (StringsKt__StringsKt.x(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean N(CharSequence charSequence, char c) {
        charSequence.getClass();
        return S(charSequence, c, 0, 2) >= 0;
    }

    public static boolean P(CharSequence charSequence, char c) {
        charSequence.getClass();
        return charSequence.length() > 0 && a.a(charSequence.charAt(charSequence.length() - 1), c, false);
    }

    public static boolean Q(CharSequence charSequence, String str) {
        charSequence.getClass();
        return charSequence instanceof String ? c.k((String) charSequence, str, false) : StringsKt__StringsKt.z(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int R(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static int S(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? StringsKt__StringsKt.y(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int T(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.w(i, charSequence, str, z);
    }

    public static boolean U(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!CharsKt.b(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int V(int i, CharSequence charSequence, String str) {
        int iR = (i & 2) != 0 ? R(charSequence) : 0;
        charSequence.getClass();
        str.getClass();
        return !(charSequence instanceof String) ? StringsKt__StringsKt.x(charSequence, str, iR, 0, false, true) : ((String) charSequence).lastIndexOf(str, iR);
    }

    public static int W(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = R(charSequence);
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(ay0.L(cArr), i);
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (a.a(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static List X(CharSequence charSequence) {
        charSequence.getClass();
        pfs pfsVar = new pfs(charSequence);
        if (!pfsVar.hasNext()) {
            return m2g.a;
        }
        String next = pfsVar.next();
        if (!pfsVar.hasNext()) {
            return kotlin.collections.a.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (pfsVar.hasNext()) {
            arrayList.add(pfsVar.next());
        }
        return arrayList;
    }

    public static String Y(String str, int i, char c) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            hb5.a(pe4.b(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static String Z(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            hb5.a(pe4.b(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static String a0(String str, String str2) {
        str.getClass();
        str2.getClass();
        return i0(str, str2) ? str.substring(str2.length()) : str;
    }

    public static CharSequence b0(int i, int i2, String str) {
        str.getClass();
        if (i2 < i) {
            mae0.a(n36.a("End index (", i2, i, ") is less than start index (", ")."));
            return null;
        }
        if (i2 == i) {
            return str.subSequence(0, str.length());
        }
        StringBuilder sb = new StringBuilder(str.length() - (i2 - i));
        sb.append((CharSequence) str, 0, i);
        sb.append((CharSequence) str, i2, str.length());
        return sb;
    }

    public static String c0(String str, String str2) {
        str.getClass();
        return Q(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static String d0(String str, String str2, String str3) {
        return (str.length() >= str3.length() + str2.length() && i0(str, str2) && Q(str, str3)) ? str.substring(str2.length(), str.length() - str3.length()) : str;
    }

    public static StringBuilder e0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < i) {
            mae0.a(n36.a("End index (", i2, i, ") is less than start index (", ")."));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static List f0(CharSequence charSequence, final char[] cArr) {
        charSequence.getClass();
        if (cArr.length == 1) {
            return StringsKt__StringsKt.B(0, charSequence, String.valueOf(cArr[0]), false);
        }
        StringsKt__StringsKt.A(0);
        id80 id80Var = new id80(new hmd(charSequence, 0, new Function2() { // from class: kotlin.text.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                charSequence2.getClass();
                int iY = StringsKt__StringsKt.y(charSequence2, cArr, iIntValue, false);
                if (iY < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(iY), 1);
            }
        }));
        ArrayList arrayList = new ArrayList(l48.r(id80Var, 10));
        Iterator<Object> it = id80Var.iterator();
        while (true) {
            hmd.a aVar = (hmd.a) it;
            if (!aVar.hasNext()) {
                return arrayList;
            }
            IntRange intRange = (IntRange) aVar.next();
            intRange.getClass();
            arrayList.add(charSequence.subSequence(intRange.a, intRange.b + 1).toString());
        }
    }

    public static boolean h0(char c, String str) {
        return str.length() > 0 && a.a(str.charAt(0), c, false);
    }

    public static boolean i0(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? c.u((String) charSequence, (String) charSequence2, false) : StringsKt__StringsKt.z(charSequence, 0, charSequence2, 0, charSequence2.length(), false);
    }

    public static String j0(String str, IntRange intRange) {
        str.getClass();
        intRange.getClass();
        return str.substring(intRange.a, intRange.b + 1);
    }

    public static String k0(String str, String str2, String str3) {
        m.a(str, str2, str3);
        int iT = T(str, str2, 0, false, 6);
        return iT == -1 ? str3 : str.substring(str2.length() + iT, str.length());
    }

    public static String l0(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int iW = W(str, c, 0, 6);
        return iW == -1 ? str2 : str.substring(iW + 1, str.length());
    }

    public static String m0(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int iV = V(6, str, str2);
        return iV == -1 ? str3 : str.substring(str2.length() + iV, str.length());
    }

    public static String n0(char c, String str) {
        str.getClass();
        str.getClass();
        int iS = S(str, c, 0, 6);
        return iS == -1 ? str : str.substring(0, iS);
    }

    public static String o0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iT = T(str, str2, 0, false, 6);
        return iT == -1 ? str : str.substring(0, iT);
    }

    public static String p0(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int iV = V(6, str, str2);
        return iV == -1 ? str3 : str.substring(0, iV);
    }

    public static String q0(char c, String str) {
        str.getClass();
        str.getClass();
        int iW = W(str, c, 0, 6);
        return iW == -1 ? str : str.substring(0, iW);
    }

    public static Boolean r0(String str) {
        str.getClass();
        if (Intrinsics.g(str, "true")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.g(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static Long s0(String str) {
        boolean z;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (cCharAt < '0') {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / 10;
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * 10;
            long j5 = iDigit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    public static CharSequence t0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zB = CharsKt.b(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zB) {
                    break;
                }
                length--;
            } else if (zB) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static CharSequence u0(String str) {
        int length = str.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!CharsKt.b(str.charAt(length))) {
                return str.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    public static String v0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i = length - 1;
            if (!ay0.t(cArr, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i;
        }
        return charSequenceSubSequence.toString();
    }

    public static String w0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!ay0.t(cArr, str.charAt(i))) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }
}
