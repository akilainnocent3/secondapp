package kotlin.text;

import defpackage.ay0;
import defpackage.hce0;
import defpackage.hmd;
import defpackage.id80;
import defpackage.kb5;
import defpackage.l48;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class StringsKt__StringsKt extends c {
    public static final void A(int i) {
        if (i >= 0) {
            return;
        }
        kb5.a(hce0.a(i, "Limit must be non-negative, but was "));
    }

    public static final List B(int i, CharSequence charSequence, String str, boolean z) {
        A(i);
        int length = 0;
        int iW = w(0, charSequence, str, z);
        if (iW == -1 || i == 1) {
            return kotlin.collections.a.c(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i2 = 10;
        if (z2 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        do {
            arrayList.add(charSequence.subSequence(length, iW).toString());
            length = str.length() + iW;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iW = w(length, charSequence, str, z);
        } while (iW != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List split$default(CharSequence charSequence, String[] strArr, final boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        charSequence.getClass();
        strArr.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() > 0) {
                return B(i, charSequence, str, z);
            }
        }
        A(i);
        final List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        id80 id80Var = new id80(new hmd(charSequence, i, new Function2() { // from class: kotlin.text.e
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                Pair pair;
                String str2;
                Pair pair2;
                boolean z2;
                Object next2;
                CharSequence charSequence2 = (CharSequence) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                charSequence2.getClass();
                List list = listAsList;
                boolean z3 = z;
                if (z3 || list.size() != 1) {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    IntRange intRange = new IntRange(iIntValue, charSequence2.length(), 1);
                    boolean z4 = charSequence2 instanceof String;
                    int i3 = intRange.c;
                    int i4 = intRange.b;
                    if (z4) {
                        if ((i3 > 0 && iIntValue <= i4) || (i3 < 0 && i4 <= iIntValue)) {
                            int i5 = iIntValue;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z2 = z3;
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it.next();
                                    String str3 = (String) next2;
                                    z2 = z3;
                                    if (c.n(0, i5, str3.length(), str3, (String) charSequence2, z2)) {
                                        break;
                                    }
                                    z3 = z2;
                                }
                                String str4 = (String) next2;
                                if (str4 != null) {
                                    pair = new Pair(Integer.valueOf(i5), str4);
                                    pair2 = pair;
                                } else if (i5 != i4) {
                                    i5 += i3;
                                    z3 = z2;
                                }
                            }
                        }
                    } else {
                        if ((i3 > 0 && iIntValue <= i4) || (i3 < 0 && i4 <= iIntValue)) {
                            int i6 = iIntValue;
                            while (true) {
                                Iterator it2 = list.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                    str2 = (String) next;
                                } while (!StringsKt__StringsKt.z(str2, 0, charSequence2, i6, str2.length(), z3));
                                String str5 = (String) next;
                                if (str5 != null) {
                                    pair = new Pair(Integer.valueOf(i6), str5);
                                    pair2 = pair;
                                } else if (i6 != i4) {
                                    i6 += i3;
                                }
                            }
                        }
                    }
                } else {
                    String str6 = (String) CollectionsKt.n0(list);
                    int iT = StringsKt.T(charSequence2, str6, iIntValue, false, 4);
                    pair2 = iT < 0 ? null : new Pair(Integer.valueOf(iT), str6);
                }
                if (pair2 != null) {
                    return new Pair(pair2.a, Integer.valueOf(((String) pair2.b).length()));
                }
                return null;
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

    public static final int w(int i, CharSequence charSequence, String str, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? x(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int x(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        kotlin.ranges.c cVarJ;
        if (z2) {
            int iR = StringsKt.R(charSequence);
            if (i > iR) {
                i = iR;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            cVarJ = kotlin.ranges.f.j(i, i2);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            cVarJ = new IntRange(i, i2, 1);
        }
        int i3 = cVarJ.c;
        int i4 = cVarJ.b;
        int i5 = cVarJ.a;
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            boolean z3 = z;
            if ((i3 <= 0 || i5 > i4) && (i3 >= 0 || i4 > i5)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                boolean z4 = z3;
                z3 = z4;
                if (z(charSequence4, 0, charSequence3, i5, charSequence2.length(), z4)) {
                    return i5;
                }
                if (i5 == i4) {
                    return -1;
                }
                i5 += i3;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        } else {
            if ((i3 <= 0 || i5 > i4) && (i3 >= 0 || i4 > i5)) {
                return -1;
            }
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z5 = z;
                if (c.n(0, i6, str.length(), str, (String) charSequence, z5)) {
                    return i6;
                }
                if (i6 == i4) {
                    return -1;
                }
                i6 += i3;
                z = z5;
            }
        }
    }

    public static final int y(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ay0.L(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (a.a(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static final boolean z(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!a.a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }
}
