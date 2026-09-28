package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class div {
    public static final ArrayList a(nzo nzoVar) {
        nzoVar.getClass();
        tsr tsrVarT1 = ((civ) nzoVar).T1();
        boolean zB = b(tsrVarT1);
        duw.a aVar = (duw.a) tsrVarT1.B();
        duw<T> duwVar = aVar.a;
        ArrayList arrayList = new ArrayList(duwVar.c);
        int i = duwVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            tsr tsrVar = (tsr) aVar.get(i2);
            arrayList.add(zB ? tsrVar.y() : tsrVar.z());
        }
        return arrayList;
    }

    public static final boolean b(tsr tsrVar) {
        int iOrdinal = tsrVar.V.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            uhc.a();
                            return false;
                        }
                        tsr tsrVarH = tsrVar.H();
                        if (tsrVarH != null) {
                            return b(tsrVarH);
                        }
                        hb5.a("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
