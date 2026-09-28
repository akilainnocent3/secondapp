package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.ranges.e;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class dmt {
    public static qcn a(qcn qcnVar, qcn qcnVar2) {
        qcnVar.getClass();
        qcnVar2.getClass();
        int iA = jpu.a(l48.r(qcnVar2, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : qcnVar2) {
            linkedHashMap.put(((erq) obj).a, obj);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = qcnVar.iterator();
        while (it.hasNext()) {
            erq erqVar = (erq) linkedHashMap.get((String) it.next());
            if (erqVar != null) {
                arrayList.add(erqVar);
            }
        }
        return a4h.b(arrayList);
    }

    public static hsq b(erq erqVar, fjr fjrVar) {
        erqVar.getClass();
        fjrVar.getClass();
        String str = erqVar.a;
        String str2 = erqVar.g;
        String str3 = erqVar.h;
        boolean z = erqVar.i;
        String str4 = erqVar.d;
        int i = erqVar.c;
        String str5 = erqVar.e;
        String str6 = erqVar.f;
        glq bVar = !StringsKt.U(str6) ? new glq.b(str6) : glq.a.a;
        glq bVar2 = !StringsKt.U(str3) ? new glq.b(str3) : glq.a.a;
        glq bVar3 = !StringsKt.U(str2) ? new glq.b(str2) : glq.a.a;
        String str7 = str4;
        glq glqVar = bVar;
        String str8 = erqVar.b;
        Date date = new Date(erqVar.k);
        Locale locale = Locale.getDefault();
        locale.getClass();
        String strL = bwf0.l(date, "dd-MM-yyyy HH:mm", locale, 2, 0);
        long j = erqVar.l;
        qcn<esq> qcnVar = erqVar.m;
        ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
        Iterator<esq> it = qcnVar.iterator();
        while (it.hasNext()) {
            esq next = it.next();
            arrayList.add(new jer(new e(next.c.b, next.d.b)));
            it = it;
            str = str;
            str7 = str7;
            str5 = str5;
            bVar3 = bVar3;
        }
        return new hsq(str, z, str7, str5, i, glqVar, bVar2, bVar3, str8, strL, fjrVar, j, a4h.f(arrayList));
    }
}
