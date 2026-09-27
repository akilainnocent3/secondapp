package yads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class pc1 {
    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    public static oc1 a(j52 j52Var, List list) {
        int iIntValue;
        Integer num;
        if (list.isEmpty()) {
            iIntValue = 50;
        } else {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                Integer numValueOf = Integer.valueOf(((py2) it.next()).f154193c);
                while (it.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(((py2) it.next()).f154193c);
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                num = numValueOf;
            } else {
                num = null;
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 50;
            }
        }
        return new oc1(j52Var, iIntValue);
    }
}
