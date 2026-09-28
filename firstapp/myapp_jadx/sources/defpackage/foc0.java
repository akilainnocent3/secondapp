package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class foc0 extends pf implements iaj<pjc0, String, xnc0, v1b<? super Unit>, Object> {
    /* JADX WARN: Code duplicated, block: B:102:0x019e  */
    @Override // defpackage.iaj
    public final Object d(pjc0 pjc0Var, String str, xnc0 xnc0Var, v1b<? super Unit> v1bVar) {
        qcn qcnVarB;
        Object value;
        Object value2;
        List<ncc0> list;
        Object next;
        String str2;
        Object next2;
        List<ncc0> list2;
        String str3 = str;
        xnc0 xnc0Var2 = xnc0Var;
        goc0 goc0Var = (goc0) this.a;
        goc0Var.getClass();
        kdc0 kdc0Var = pjc0Var.e;
        if (kdc0Var == null || (list2 = kdc0Var.a) == null) {
            qcnVarB = null;
        } else {
            ArrayList arrayList = new ArrayList(l48.r(list2, 10));
            for (ncc0 ncc0Var : list2) {
                arrayList.add(new bdc0(ncc0Var.a, ncc0Var.b, null, a4h.b(ncc0Var.d)));
            }
            qcnVarB = a4h.b(arrayList);
        }
        List<lgc0> list3 = kdc0Var != null ? kdc0Var.b : null;
        ngs ngsVarB = a.b();
        if (list3 != null && !list3.isEmpty()) {
            ngsVarB.add(new bdc0("recommended", "recommended", a4h.b(list3), null));
        }
        if (qcnVarB != null) {
            ngsVarB.addAll(qcnVarB);
        }
        qcn<bdc0> qcnVarB2 = a4h.b(a.a(ngsVarB));
        ArrayList arrayList2 = new ArrayList(l48.r(qcnVarB2, 10));
        for (bdc0 bdc0Var : qcnVarB2) {
            arrayList2.add(new cdc0(bdc0Var.a, bdc0Var.b));
        }
        qcn qcnVarB3 = a4h.b(arrayList2);
        wwd0 wwd0Var = goc0Var.c;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, qcnVarB3));
        wwd0 wwd0Var2 = goc0Var.d;
        do {
            value2 = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value2, qcnVarB2));
        enc0 enc0Var = xnc0Var2.b;
        enc0 enc0Var2 = xnc0Var2.c;
        String str4 = enc0Var != null ? enc0Var.c : null;
        boolean z = str4 == null || str4.length() == 0;
        String str5 = enc0Var2 != null ? enc0Var2.c : null;
        boolean z2 = str5 == null || str5.length() == 0;
        if ((z || z2) && kdc0Var != null && (list = kdc0Var.a) != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                p48.w(((ncc0) it.next()).d, arrayList3);
            }
            if (!arrayList3.isEmpty()) {
                enc0 enc0VarA = enc0Var != null ? goc0.a(enc0Var, arrayList3) : null;
                enc0 enc0VarA2 = enc0Var2 != null ? goc0.a(enc0Var2, arrayList3) : null;
                if (!Intrinsics.g(enc0VarA, enc0Var) || !Intrinsics.g(enc0VarA2, enc0Var2)) {
                    wwd0 wwd0Var3 = goc0Var.b;
                    xnc0 xnc0VarA = xnc0.a(xnc0Var2, null, enc0VarA, enc0VarA2, 1);
                    wwd0Var3.getClass();
                    wwd0Var3.k(null, xnc0VarA);
                }
            }
        }
        Iterator<E> it2 = qcnVarB3.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((cdc0) next).a.equals(str3));
        cdc0 cdc0Var = (cdc0) next;
        if (cdc0Var != null) {
            str2 = cdc0Var.a;
        } else if (((jqc0) goc0Var.e.getValue()).a) {
            Iterator<E> it3 = qcnVarB3.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (((cdc0) next2).a.equals("recommended"));
            cdc0 cdc0Var2 = (cdc0) next2;
            if (cdc0Var2 != null) {
                str2 = cdc0Var2.a;
            } else {
                cdc0 cdc0Var3 = (cdc0) CollectionsKt.firstOrNull(qcnVarB3);
                str2 = cdc0Var3 != null ? cdc0Var3.a : null;
                if (str2 == null) {
                    str2 = "";
                }
            }
        } else {
            cdc0 cdc0Var4 = (cdc0) CollectionsKt.firstOrNull(qcnVarB3);
            str2 = cdc0Var4 != null ? cdc0Var4.a : null;
            if (str2 == null) {
                str2 = "";
            }
        }
        if (!Intrinsics.g(str3, str2)) {
            wwd0 wwd0Var4 = goc0Var.a;
            wwd0Var4.getClass();
            wwd0Var4.k(null, str2);
        }
        return Unit.a;
    }
}
