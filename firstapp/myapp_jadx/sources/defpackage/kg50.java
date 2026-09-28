package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class kg50 {
    public final LinkedHashSet a;

    public static final class a {
        public static kg50 a(m26 m26Var, e6s e6sVar) {
            hch hchVarA;
            List<l8l> list = e6sVar.d;
            ncd ncdVar = new ncd(m26Var);
            m26Var.getClass();
            pgt.a("ResolvedFeatureGroup", "resolveFeatureGroup: sessionConfig = " + e6sVar + ", lensFacing = " + m26Var.f());
            Set<l8l> set = e6sVar.c;
            if (set.isEmpty() && list.isEmpty()) {
                return null;
            }
            List<pnh0> list2 = e6sVar.e;
            if (set.isEmpty() && list.isEmpty()) {
                hb5.a("Must have at least one required or preferred feature");
                return null;
            }
            Iterator<T> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    pnh0 pnh0Var = (pnh0) it.next();
                    unh0.b.getClass();
                    if (unh0.a.a(pnh0Var) == unh0.UNDEFINED) {
                        hchVarA = new hch.c(pnh0Var);
                        break;
                    }
                } else {
                    Iterator<T> it2 = set.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : list) {
                                hch.d dVarB = ncd.b((l8l) obj, list2);
                                if (dVarB != null) {
                                    pgt.a("DefaultFeatureGroupResolver", "resolveFeatureGroup: filtered out preferred feature due to " + dVarB);
                                } else {
                                    dVarB = null;
                                }
                                if (dVarB == null) {
                                    arrayList.add(obj);
                                }
                            }
                            pgt.a("DefaultFeatureGroupResolver", "resolveFeatureGroup: filteredPreferredFeatures = " + arrayList);
                            hchVarA = ncdVar.a(e6sVar, arrayList, 0, m2g.a);
                            break;
                        }
                        hch.d dVarB2 = ncd.b((l8l) it2.next(), list2);
                        if (dVarB2 != null) {
                            hchVarA = dVarB2;
                            break;
                        }
                    }
                }
            }
            if (hchVarA instanceof hch.a) {
                kg50 kg50Var = ((hch.a) hchVarA).a;
                pgt.a("ResolvedFeatureGroup", "resolvedFeatureGroup = " + kg50Var);
                return kg50Var;
            }
            if (hchVarA instanceof hch.b) {
                hb5.a("Feature group is not supported");
                return null;
            }
            if (hchVarA instanceof hch.c) {
                throw new IllegalArgumentException(((hch.c) hchVarA).a + " is not supported");
            }
            if (!(hchVarA instanceof hch.d)) {
                uhc.a();
                return null;
            }
            hch.d dVar = (hch.d) hchVarA;
            d9h0.a(" must be added for ", dVar.a, dVar.b);
            return null;
        }
    }

    public kg50(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final String toString() {
        return "ResolvedFeatureGroup(features=" + this.a + ')';
    }
}
