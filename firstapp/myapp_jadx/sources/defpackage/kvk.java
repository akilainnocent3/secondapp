package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kvk implements hvk {
    public final psm a;
    public final wwd0 b;
    public final wwd0 c;
    public final wwd0 d;
    public final v340 e;
    public si90 f;
    public boolean g;

    public kvk(psm psmVar) {
        psmVar.getClass();
        this.a = psmVar;
        m2g m2gVar = m2g.a;
        this.b = xwd0.a(m2gVar);
        this.c = xwd0.a(m2gVar);
        wwd0 wwd0VarA = xwd0.a(ovk.f);
        this.d = wwd0VarA;
        this.e = e1i.b(wwd0VarA);
    }

    @Override // defpackage.hvk
    public final v340 a() {
        return this.e;
    }

    @Override // defpackage.hvk
    public final void b(lvk lvkVar) {
        Object next;
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        if (this.g) {
            Object obj = null;
            if (lvkVar instanceof lvk.b) {
                si90 si90Var = this.f;
                if (si90Var != null) {
                    si90Var.invoke(new smk.a.c(((lvk.b) lvkVar).a));
                    return;
                } else {
                    Intrinsics.n("emitCommand");
                    throw null;
                }
            }
            if (lvkVar.equals(lvk.a.a)) {
                si90 si90Var2 = this.f;
                if (si90Var2 != null) {
                    si90Var2.invoke(smk.a.C1095a.a);
                    return;
                } else {
                    Intrinsics.n("emitCommand");
                    throw null;
                }
            }
            if (lvkVar.equals(lvk.d.a) || lvkVar.equals(lvk.e.a)) {
                si90 si90Var3 = this.f;
                if (si90Var3 != null) {
                    si90Var3.invoke(smk.a.b.a);
                    return;
                } else {
                    Intrinsics.n("emitCommand");
                    throw null;
                }
            }
            if (!(lvkVar instanceof lvk.c)) {
                if (!lvkVar.equals(lvk.f.a)) {
                    uhc.a();
                    return;
                }
                si90 si90Var4 = this.f;
                if (si90Var4 != null) {
                    si90Var4.invoke(smk.a.e.a);
                    return;
                } else {
                    Intrinsics.n("emitCommand");
                    throw null;
                }
            }
            wwd0 wwd0Var = this.b;
            Iterator it = ((Iterable) wwd0Var.getValue()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(((eok) next).a, ((lvk.c) lvkVar).a));
            eok eokVar = (eok) next;
            if (eokVar != null) {
                eok eokVarA = eok.a(eokVar, !eokVar.l);
                do {
                    value2 = wwd0Var.getValue();
                    List<eok> list = (List) value2;
                    arrayList2 = new ArrayList(l48.r(list, 10));
                    for (eok eokVar2 : list) {
                        if (Intrinsics.g(eokVar2.a, ((lvk.c) lvkVar).a)) {
                            eokVar2 = eokVarA;
                        }
                        arrayList2.add(eokVar2);
                    }
                } while (!wwd0Var.g(value2, arrayList2));
            }
            wwd0 wwd0Var2 = this.c;
            for (Object obj2 : (Iterable) wwd0Var2.getValue()) {
                if (Intrinsics.g(((eok) obj2).a, ((lvk.c) lvkVar).a)) {
                    obj = obj2;
                    break;
                }
            }
            eok eokVar3 = (eok) obj;
            if (eokVar3 != null) {
                eok eokVarA2 = eok.a(eokVar3, !eokVar3.l);
                do {
                    value = wwd0Var2.getValue();
                    List<eok> list2 = (List) value;
                    arrayList = new ArrayList(l48.r(list2, 10));
                    for (eok eokVar4 : list2) {
                        if (Intrinsics.g(eokVar4.a, ((lvk.c) lvkVar).a)) {
                            eokVar4 = eokVarA2;
                        }
                        arrayList.add(eokVar4);
                    }
                } while (!wwd0Var2.g(value, arrayList));
            }
        }
    }
}
