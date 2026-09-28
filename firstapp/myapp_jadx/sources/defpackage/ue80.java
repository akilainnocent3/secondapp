package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ue80 {
    public static final php a(ygp ygpVar, ArrayList arrayList, Function0 function0) {
        php mx0Var;
        php fq40Var;
        if (ygpVar.equals(jq40.a(Collection.class)) || ygpVar.equals(jq40.a(List.class)) || ygpVar.equals(jq40.a(List.class)) || ygpVar.equals(jq40.a(ArrayList.class))) {
            mx0Var = new mx0((php) arrayList.get(0));
        } else if (ygpVar.equals(jq40.a(HashSet.class))) {
            mx0Var = new rel((php) arrayList.get(0));
        } else if (ygpVar.equals(jq40.a(Set.class)) || ygpVar.equals(jq40.a(Set.class)) || ygpVar.equals(jq40.a(LinkedHashSet.class))) {
            mx0Var = new ags((php) arrayList.get(0));
        } else if (ygpVar.equals(jq40.a(HashMap.class))) {
            mx0Var = new pel((php) arrayList.get(0), (php) arrayList.get(1));
        } else if (ygpVar.equals(jq40.a(Map.class)) || ygpVar.equals(jq40.a(Map.class)) || ygpVar.equals(jq40.a(LinkedHashMap.class))) {
            mx0Var = new yfs((php) arrayList.get(0), (php) arrayList.get(1));
        } else {
            if (ygpVar.equals(jq40.a(Map.Entry.class))) {
                php phpVar = (php) arrayList.get(0);
                php phpVar2 = (php) arrayList.get(1);
                phpVar.getClass();
                phpVar2.getClass();
                fq40Var = new iou(phpVar, phpVar2);
            } else if (ygpVar.equals(jq40.a(Pair.class))) {
                php phpVar3 = (php) arrayList.get(0);
                php phpVar4 = (php) arrayList.get(1);
                phpVar3.getClass();
                phpVar4.getClass();
                fq40Var = new hrz(phpVar3, phpVar4);
            } else if (ygpVar.equals(jq40.a(bxg0.class))) {
                php phpVar5 = (php) arrayList.get(0);
                php phpVar6 = (php) arrayList.get(1);
                php phpVar7 = (php) arrayList.get(2);
                phpVar5.getClass();
                phpVar6.getClass();
                phpVar7.getClass();
                mx0Var = new cxg0(phpVar5, phpVar6, phpVar7);
            } else if (tgp.b(ygpVar).isArray()) {
                Object objInvoke = function0.invoke();
                objInvoke.getClass();
                php phpVar8 = (php) arrayList.get(0);
                phpVar8.getClass();
                fq40Var = new fq40((ygp) objInvoke, phpVar8);
            } else {
                mx0Var = null;
            }
            mx0Var = fq40Var;
        }
        if (mx0Var != null) {
            return mx0Var;
        }
        php[] phpVarArr = (php[]) arrayList.toArray(new php[0]);
        return gj10.a(ygpVar, (php[]) Arrays.copyOf(phpVarArr, phpVarArr.length));
    }

    public static final <T> php<T> b(ygp<T> ygpVar) {
        ygpVar.getClass();
        php<T> phpVarE = e(ygpVar);
        if (phpVarE != null) {
            return phpVarE;
        }
        fz9.d(ygpVar);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce A[RETURN] */
    public static final php<Object> c(y3l y3lVar, qhp qhpVar, boolean z) {
        php<? extends Object> phpVarA;
        php phpVarF;
        php i120Var;
        ygp ygpVarC = fz9.c(qhpVar);
        boolean zB = qhpVar.b();
        List<KTypeProjection> listA = qhpVar.a();
        ArrayList arrayList = new ArrayList(l48.r(listA, 10));
        Iterator<T> it = listA.iterator();
        if (it.hasNext()) {
            ((KTypeProjection) it.next()).getClass();
            kb5.a("Star projections in type arguments are not allowed, but had null");
            return null;
        }
        if (arrayList.isEmpty()) {
            if (!tgp.b(ygpVarC).isInterface() || y3lVar.f(ygpVarC, m2g.a) == null) {
                oe80<? extends Object> oe80Var = te80.a;
                if (zB) {
                    phpVarA = te80.b.a(ygpVarC);
                } else {
                    phpVarA = te80.a.a(ygpVarC);
                    if (phpVarA == null) {
                        phpVarA = null;
                    }
                }
            } else {
                phpVarA = null;
            }
        } else if (y3lVar.g()) {
            phpVarA = null;
        } else {
            oe80<? extends Object> oe80Var2 = te80.a;
            Object objA = !zB ? te80.c.a(ygpVarC, arrayList) : te80.d.a(ygpVarC, arrayList);
            zi50.a aVar = zi50.b;
            if (objA instanceof zi50.b) {
                objA = null;
            }
            phpVarA = (php) objA;
        }
        if (phpVarA != null) {
            return phpVarA;
        }
        if (arrayList.isEmpty()) {
            phpVarF = e(ygpVarC);
            if (phpVarF == null && (phpVarF = y3lVar.f(ygpVarC, m2g.a)) == null) {
                if (tgp.b(ygpVarC).isInterface()) {
                    i120Var = new i120(ygpVarC);
                    phpVarF = i120Var;
                } else {
                    phpVarF = null;
                }
            }
            if (phpVarF != null) {
                if (zB) {
                    return hj5.a(phpVarF);
                }
                return phpVarF;
            }
        } else {
            ArrayList arrayListF = f(y3lVar, arrayList, z);
            if (arrayListF != null) {
                php phpVarA2 = a(ygpVarC, arrayListF, new bz30(arrayList, 1));
                if (phpVarA2 == null) {
                    phpVarF = y3lVar.f(ygpVarC, arrayListF);
                    if (phpVarF == null) {
                        if (tgp.b(ygpVarC).isInterface()) {
                            i120Var = new i120(ygpVarC);
                            phpVarF = i120Var;
                        } else {
                            phpVarF = null;
                        }
                    }
                } else {
                    phpVarF = phpVarA2;
                }
                if (phpVarF != null) {
                    if (zB) {
                        return hj5.a(phpVarF);
                    }
                    return phpVarF;
                }
            }
        }
        return null;
    }

    public static final php<Object> d(y3l y3lVar, qhp qhpVar) {
        y3lVar.getClass();
        qhpVar.getClass();
        return c(y3lVar, qhpVar, false);
    }

    public static final <T> php<T> e(ygp<T> ygpVar) {
        ygpVar.getClass();
        php<T> phpVarA = gj10.a(ygpVar, new php[0]);
        return phpVarA == null ? (php) jw20.a.get(ygpVar) : phpVarA;
    }

    public static final ArrayList f(y3l y3lVar, List list, boolean z) {
        y3lVar.getClass();
        if (!z) {
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                php<Object> phpVarD = d(y3lVar, (qhp) it.next());
                if (phpVarD == null) {
                    return null;
                }
                arrayList.add(phpVarD);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(l48.r(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            qhp qhpVar = (qhp) it2.next();
            qhpVar.getClass();
            php<Object> phpVarC = c(y3lVar, qhpVar, true);
            if (phpVarC == null) {
                fz9.d(fz9.c(qhpVar));
                throw null;
            }
            arrayList2.add(phpVarC);
        }
        return arrayList2;
    }
}
