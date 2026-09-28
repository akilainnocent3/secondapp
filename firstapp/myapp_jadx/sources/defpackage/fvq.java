package defpackage;

import com.sportybet.feature.luckynumber.placebet.data.data.LNMyNumberDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fvq {
    public static String a(dvq dvqVar, String str) {
        String str2;
        str.getClass();
        if (dvqVar != null) {
            dvq.b bVar = null;
            if (!dvqVar.equals(dvq.a.a) && !dvqVar.equals(dvq.c.a)) {
                if (!(dvqVar instanceof dvq.b)) {
                    uhc.a();
                    return null;
                }
                bVar = (dvq.b) dvqVar;
            }
            if (bVar != null) {
                int i = 0;
                loop0: while (true) {
                    if (i > 0) {
                        str2 = str + " " + i;
                    } else {
                        str2 = str;
                    }
                    qcn<qvq> qcnVar = bVar.b;
                    if (qcnVar != null && qcnVar.isEmpty()) {
                        break;
                    }
                    Iterator<qvq> it = qcnVar.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.g(it.next().c, str2)) {
                            i++;
                        }
                    }
                    break loop0;
                }
                return str2;
            }
        }
        return str;
    }

    public static dvq b(List list, qcn qcnVar) {
        ssq ssqVar;
        Object next;
        qcn<ssq> qcnVar2;
        list.getClass();
        qcnVar.getClass();
        Iterator<E> it = qcnVar.iterator();
        do {
            ssqVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!"standard".equals(((tsq) next).a));
        tsq tsqVar = (tsq) next;
        if (tsqVar != null && (qcnVar2 = tsqVar.c) != null) {
            for (ssq ssqVar2 : qcnVar2) {
                if (ssqVar2.d == atq.SNM) {
                    ssqVar = ssqVar2;
                    break;
                }
            }
            ssqVar = ssqVar;
        }
        if (ssqVar == null) {
            return dvq.c.a;
        }
        qcn<yxq> qcnVar3 = ssqVar.g;
        ArrayList arrayList = new ArrayList(l48.r(qcnVar3, 10));
        Iterator<yxq> it2 = qcnVar3.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(it2.next().e));
        }
        uf00 uf00VarF = a4h.f(arrayList);
        ArrayList arrayList2 = new ArrayList(l48.r(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            LNMyNumberDTO lNMyNumberDTO = (LNMyNumberDTO) it3.next();
            arrayList2.add(new qvq(uf00VarF.contains(Integer.valueOf(lNMyNumberDTO.getMainNumbers().size())), lNMyNumberDTO.getId(), lNMyNumberDTO.getTitle(), a4h.f(CollectionsKt.q0(lNMyNumberDTO.getMainNumbers())), a4h.f(CollectionsKt.q0(lNMyNumberDTO.getBonusNumbers())), lNMyNumberDTO.getCreateTime()));
        }
        return new dvq.b(uf00VarF, a4h.f(arrayList2));
    }
}
