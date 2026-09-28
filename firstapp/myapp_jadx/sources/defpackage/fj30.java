package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class fj30 {
    public static q4r a(qcn qcnVar, boolean z) {
        qcnVar.getClass();
        ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
        Iterator<E> it = qcnVar.iterator();
        while (it.hasNext()) {
            yxq yxqVar = (yxq) it.next();
            arrayList.add(new b4r(yxqVar.e, ukd0.a(2, yxqVar.f, true, false).concat("x")));
        }
        return new q4r(a4h.f(arrayList), z);
    }
}
