package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class qae0 extends oae0 {
    public static String b(String str) {
        final String str2 = "    ";
        return ld80.g(new ysg0(new vae0(str), new Function1() { // from class: pae0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str3 = (String) obj;
                str3.getClass();
                boolean zU = StringsKt.U(str3);
                String str4 = str2;
                if (zU) {
                    return str3.length() < str4.length() ? str4 : str3;
                }
                return str4.concat(str3);
            }
        }), "\n", null, 62);
    }

    public static String c(String str) {
        str.getClass();
        List listX = StringsKt.X(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listX) {
            if (!StringsKt.U((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!CharsKt.b(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Integer num = (Integer) CollectionsKt.f0(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listX.size();
        int size2 = listX.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = listX.iterator();
        while (true) {
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length3);
                CollectionsKt.Z(arrayList3, sb, "\n", null, 124);
                return sb.toString();
            }
            Object next = it.next();
            int i3 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            String str3 = (String) next;
            String strD = ((i == 0 || i == size2) && StringsKt.U(str3)) ? null : wae0.D(iIntValue, str3);
            if (strD != null) {
                arrayList3.add(strD);
            }
            i = i3;
        }
    }

    public static String d(String str) {
        if (StringsKt.U("|")) {
            hb5.a("marginPrefix must be non-blank string.");
            return null;
        }
        List listX = StringsKt.X(str);
        int length = str.length();
        listX.size();
        int size = listX.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listX) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && StringsKt.U(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!CharsKt.b(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && c.t(i3, str2, "|", false)) ? str2.substring("|".length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        CollectionsKt.Z(arrayList, sb, "\n", null, 124);
        return sb.toString();
    }
}
