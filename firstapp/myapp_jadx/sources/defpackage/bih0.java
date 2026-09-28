package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class bih0 {
    public final jrm a;
    public final eih0 b;

    public bih0(jrm jrmVar, eih0 eih0Var) {
        jrmVar.getClass();
        this.a = jrmVar;
        this.b = eih0Var;
    }

    public final List<Selection> a(zuy zuyVar, huy huyVar, avy avyVar) {
        boolean z;
        boolean z2;
        zuyVar.getClass();
        huyVar.getClass();
        if (zuyVar == zuy.a) {
            return m2g.a;
        }
        int iOrdinal = avyVar.ordinal();
        int i = 0;
        jrm jrmVar = this.a;
        if (iOrdinal == 0) {
            ArrayList arrayListU = jrmVar.U();
            ArrayList arrayList = new ArrayList();
            int size = arrayListU.size();
            while (i < size) {
                Object obj = arrayListU.get(i);
                i++;
                if (b((Selection) obj, phh0.a)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        if (iOrdinal == 1) {
            ArrayList arrayListU2 = jrmVar.U();
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayListU2.size();
            while (i < size2) {
                Object obj2 = arrayListU2.get(i);
                i++;
                if (b((Selection) obj2, phh0.b)) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }
        if (iOrdinal != 2) {
            uhc.a();
            return null;
        }
        int iOrdinal2 = huyVar.ordinal();
        eih0 eih0Var = this.b;
        if (iOrdinal2 == 0) {
            ArrayList arrayListU3 = jrmVar.U();
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayListU3.size();
            int i2 = 0;
            while (i2 < size3) {
                Object obj3 = arrayListU3.get(i2);
                i2++;
                Selection selection = (Selection) obj3;
                phh0 phh0Var = phh0.a;
                dih0 dih0VarB = eih0Var.a.b(selection);
                if (dih0VarB != null && dih0VarB.e.contains(phh0Var)) {
                    z = !(dih0VarB.a == rhh0.a && selection.n());
                } else {
                    z = false;
                }
                if (z) {
                    arrayList3.add(obj3);
                }
            }
            return arrayList3;
        }
        if (iOrdinal2 != 1) {
            uhc.a();
            return null;
        }
        ArrayList arrayListU4 = jrmVar.U();
        ArrayList arrayList4 = new ArrayList();
        int size4 = arrayListU4.size();
        int i3 = 0;
        while (i3 < size4) {
            Object obj4 = arrayListU4.get(i3);
            i3++;
            Selection selection2 = (Selection) obj4;
            phh0 phh0Var2 = phh0.b;
            dih0 dih0VarB2 = eih0Var.a.b(selection2);
            if (dih0VarB2 != null && dih0VarB2.e.contains(phh0Var2)) {
                z2 = !(dih0VarB2.a == rhh0.a && selection2.n());
            } else {
                z2 = false;
            }
            if (z2) {
                arrayList4.add(obj4);
            }
        }
        return arrayList4;
    }

    public final boolean b(Selection selection, phh0 phh0Var) {
        dih0 dih0VarB = this.b.a.b(selection);
        boolean z = false;
        if (dih0VarB == null || !dih0VarB.d.contains(phh0Var) || dih0VarB.e.contains(phh0Var)) {
            return false;
        }
        if (dih0VarB.a == rhh0.a && selection.n()) {
            z = true;
        }
        return !z;
    }
}
