package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kotlin.ranges.e;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class emt {
    public static uf00 a(qcn qcnVar) {
        qcnVar.getClass();
        int i = 10;
        ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
        Iterator it = qcnVar.iterator();
        while (it.hasNext()) {
            x6r x6rVar = (x6r) it.next();
            String str = x6rVar.a;
            String str2 = x6rVar.e;
            String str3 = x6rVar.b;
            String str4 = x6rVar.c;
            boolean z = x6rVar.g;
            glq bVar = !StringsKt.U(str2) ? new glq.b(str2) : glq.a.a;
            Date date = new Date(x6rVar.d);
            Locale locale = Locale.getDefault();
            locale.getClass();
            String strL = bwf0.l(date, "dd-MM-yyyy HH:mm", locale, 2, 0);
            l6r aVar = x6rVar.h ? l6r.b.a : new l6r.a(x6rVar.i);
            qcn<esq> qcnVar2 = x6rVar.j;
            ArrayList arrayList2 = new ArrayList(l48.r(qcnVar2, i));
            for (esq esqVar : qcnVar2) {
                arrayList2.add(new jer(new e(esqVar.c.b, esqVar.d.b)));
                it = it;
                str = str;
                str3 = str3;
            }
            arrayList.add(new c7r(str, str3, str4, z, bVar, strL, aVar, a4h.f(arrayList2)));
            i = 10;
        }
        return a4h.f(arrayList);
    }
}
