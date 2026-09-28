package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
public final class i8c {
    public static final String a(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return str2 + str3 + str;
    }

    public static final boolean b(jdc jdcVar) {
        jdcVar.getClass();
        if (jdcVar instanceof jdc.b) {
            return ((jdc.b) jdcVar).b;
        }
        if (jdcVar instanceof jdc.d) {
            return ((jdc.d) jdcVar).b;
        }
        if (jdcVar instanceof jdc.a) {
            return ((jdc.a) jdcVar).b;
        }
        return false;
    }

    public static ArrayList c(ngs ngsVar) {
        ngsVar.getClass();
        ArrayList arrayList = new ArrayList(l48.r(ngsVar, 10));
        ListIterator listIterator = ngsVar.listIterator(0);
        int i = 0;
        while (true) {
            ngs.c cVar = (ngs.c) listIterator;
            if (!cVar.hasNext()) {
                return arrayList;
            }
            Object next = cVar.next();
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            arrayList.add(gdc.a((gdc) next, i == 0, false, null, 63487));
            i = i2;
        }
    }
}
