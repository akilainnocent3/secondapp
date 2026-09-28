package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k36 {
    public static final k36 b;
    public static final k36 c;
    public final LinkedHashSet<h26> a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new s6s(0));
        b = new k36(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new s6s(1));
        c = new k36(linkedHashSet2);
    }

    public k36(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final List a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator<h26> it = this.a.iterator();
        while (it.hasNext()) {
            arrayList2 = it.next().a(Collections.unmodifiableList(arrayList2));
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Integer num = null;
        for (h26 h26Var : this.a) {
            if (h26Var instanceof s6s) {
                Integer numValueOf = Integer.valueOf(((s6s) h26Var).b);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    ib5.a("Multiple conflicting lens facing requirements exist.");
                    return null;
                }
            }
        }
        return num;
    }

    public final n26 c(LinkedHashSet<n26> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<n26> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        List listA = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (n26 n26Var : linkedHashSet) {
            if (listA.contains(n26Var.a())) {
                linkedHashSet2.add(n26Var);
            }
        }
        Iterator it2 = linkedHashSet2.iterator();
        if (it2.hasNext()) {
            return (n26) it2.next();
        }
        StringBuilder sb = new StringBuilder("Cams:");
        sb.append(linkedHashSet.size());
        Iterator<n26> it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            m26 m26VarH = it3.next().h();
            sb.append(" Id:" + m26VarH.d() + "  Lens:" + m26VarH.f());
        }
        String string = sb.toString();
        LinkedHashSet<h26> linkedHashSet3 = this.a;
        StringBuilder sb2 = new StringBuilder(hce0.a(linkedHashSet3.size(), "PhyId:null  Filters:"));
        for (h26 h26Var : linkedHashSet3) {
            sb2.append(" Id:");
            h26Var.getClass();
            sb2.append(h26.a);
            if (h26Var instanceof s6s) {
                sb2.append(" LensFilter:");
                sb2.append(((s6s) h26Var).b);
            }
        }
        hb5.a(lx5.a("No available camera can be found. ", string, " ", sb2.toString()));
        return null;
    }
}
