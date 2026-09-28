package defpackage;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class org {
    public final ivs a;
    public final SimpleDateFormat b = new SimpleDateFormat("MMMM, yyyy", Locale.getDefault());
    public final SimpleDateFormat c = new SimpleDateFormat("HH:mm  dd/MM", Locale.getDefault());

    public org(ivs ivsVar) {
        this.a = ivsVar;
    }

    public final uf00 a(String str, List list) {
        list.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((fng) obj).o) {
                arrayList.add(obj);
            }
        }
        return b(str, true, arrayList);
    }

    public final uf00 b(String str, boolean z, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str2 = this.b.format(new Date(((fng) obj).j));
            str2.getClass();
            Object objA = linkedHashMap.get(str2);
            if (objA == null) {
                objA = r9i.a(str2, linkedHashMap);
            }
            ((List) objA).add(obj);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(l48.r(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(c((fng) it.next(), z, str));
            }
            arrayList.add(new fpg(str3, arrayList2));
        }
        return a4h.f(arrayList);
    }

    public final prg c(fng fngVar, boolean z, String str) {
        String str2 = fngVar.a;
        String str3 = this.c.format(new Date(fngVar.j));
        str3.getClass();
        String str4 = fngVar.d;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = fngVar.b;
        String str6 = fngVar.c;
        String str7 = fngVar.e;
        return new prg(str2, str3, str4, str5, str6, str7, fngVar.f, fngVar.g, fngVar.h, fngVar.m, fngVar.n, fngVar.o, z, Intrinsics.g(str7, str), fngVar.p, fngVar.q, fngVar.r, null, null);
    }
}
