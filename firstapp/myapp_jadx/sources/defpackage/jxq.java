package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class jxq {
    public static uf00 a(qcn qcnVar, boolean z, qcn qcnVar2, boolean z2, boolean z3, boolean z4, qcn qcnVar3, Function1 function1) {
        kxq cVar;
        qcnVar.getClass();
        qcnVar2.getClass();
        qcnVar3.getClass();
        ArrayList arrayList = new ArrayList(l48.r(qcnVar2, 10));
        Iterator<E> it = qcnVar2.iterator();
        while (it.hasNext()) {
            ixp ixpVar = (ixp) it.next();
            int i = ixpVar.b;
            zkq zkqVar = ixpVar.c;
            boolean zContains = qcnVar.contains(Integer.valueOf(i));
            qcn<j58> qcnVar4 = ixpVar.a;
            if (qcnVar4 == null || !z4) {
                qcnVar4 = null;
            }
            if (zContains) {
                cVar = new kxq.f(i, qcnVar4, (zxq) function1.invoke(Integer.valueOf(i)));
            } else if (z || qcnVar3.contains(Integer.valueOf(i))) {
                cVar = new kxq.c(i);
            } else if (z2 && zkqVar == zkq.b) {
                cVar = new kxq.b(i, qcnVar4, (zxq) function1.invoke(Integer.valueOf(i)));
            } else {
                cVar = (z3 && zkqVar == zkq.a) ? new kxq.d(i, qcnVar4, (zxq) function1.invoke(Integer.valueOf(i))) : new kxq.e(i, qcnVar4, (zxq) function1.invoke(Integer.valueOf(i)));
            }
            arrayList.add(cVar);
        }
        return a4h.f(arrayList);
    }

    public static uf00 b(qcn qcnVar, r4r r4rVar, int i) {
        qcnVar.getClass();
        r4rVar.getClass();
        List listT0 = CollectionsKt.t0(a.e(qcnVar, r4rVar.a), i);
        ArrayList arrayList = new ArrayList(l48.r(listT0, 10));
        Iterator it = listT0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((ixp) it.next()).b));
        }
        return a4h.f(CollectionsKt.q0(arrayList));
    }
}
