package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lenf;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class enf extends j8i0 {
    public final h940 a;
    public final mpe0 b;
    public uf00<? extends vpf> c;
    public final wwd0 d;
    public final v340 e;

    public enf(h940 h940Var) {
        h940Var.getClass();
        this.a = h940Var;
        this.b = hwr.b(new bnf());
        wwd0 wwd0VarA = xwd0.a(lk50.b.a);
        this.d = wwd0VarA;
        this.e = e1i.b(wwd0VarA);
    }

    public final uf00<vpf> x1(String str, boolean z) {
        List listT0;
        ArrayList arrayList;
        uf00<vpf> uf00Var;
        uf00<? extends vpf> uf00Var2 = this.c;
        if (uf00Var2 == null) {
            Intrinsics.n("betHistoryDisplayList");
            throw null;
        }
        Iterator<? extends vpf> it = uf00Var2.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.g(it.next().a(), str)) {
                break;
            }
            i++;
        }
        uf00<? extends vpf> uf00Var3 = this.c;
        if (uf00Var3 == null) {
            Intrinsics.n("betHistoryDisplayList");
            throw null;
        }
        Object objV = CollectionsKt.V(i, uf00Var3);
        if (!(objV instanceof vpf.d)) {
            objV = null;
        }
        vpf.d dVar = (vpf.d) objV;
        if (dVar == null) {
            Object value = this.d.getValue();
            if (!(value instanceof lk50.c)) {
                value = null;
            }
            lk50.c cVar = (lk50.c) value;
            if (cVar != null && (uf00Var = (uf00) cVar.a) != null) {
                return uf00Var;
            }
            uf00 uf00Var4 = this.c;
            if (uf00Var4 != null) {
                return uf00Var4;
            }
            Intrinsics.n("betHistoryDisplayList");
            throw null;
        }
        vpf.d dVarC = z ? vpf.d.c(dVar, false, true, 191) : vpf.d.c(dVar, !dVar.f, false, 159);
        uf00<? extends vpf> uf00Var5 = this.c;
        if (uf00Var5 == null) {
            Intrinsics.n("betHistoryDisplayList");
            throw null;
        }
        uf00<? extends vpf> uf00Var6 = uf00Var5.set(i, dVarC);
        this.c = uf00Var6;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itListIterator = ((n4) uf00Var6).listIterator(0);
        while (itListIterator.hasNext()) {
            Object next = itListIterator.next();
            String strA = ((vpf) next).a();
            Object objA = linkedHashMap.get(strA);
            if (objA == null) {
                objA = r9i.a(strA, linkedHashMap);
            }
            ((List) objA).add(next);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object objFirstOrNull = CollectionsKt.firstOrNull((List) entry.getValue());
            if (!(objFirstOrNull instanceof vpf.d)) {
                objFirstOrNull = null;
            }
            vpf.d dVar2 = (vpf.d) objFirstOrNull;
            if (dVar2 == null) {
                listT0 = (List) entry.getValue();
            } else {
                boolean z2 = dVar2.f;
                if (z2 && dVar2.g) {
                    Iterable iterable = (Iterable) entry.getValue();
                    arrayList = new ArrayList();
                    for (Object obj : iterable) {
                        if (!(((vpf) obj) instanceof vpf.b)) {
                            arrayList.add(obj);
                        }
                    }
                } else if (z2) {
                    Iterable iterable2 = (Iterable) entry.getValue();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : iterable2) {
                        if (obj2 instanceof vpf.a) {
                            arrayList3.add(obj2);
                        }
                    }
                    int size = arrayList3.size();
                    Integer numValueOf = Integer.valueOf(size);
                    if (size <= 3) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        Iterable iterable3 = (Iterable) entry.getValue();
                        arrayList = new ArrayList();
                        int i2 = 0;
                        for (Object obj3 : iterable3) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                b.q();
                                throw null;
                            }
                            vpf vpfVar = (vpf) obj3;
                            if (i2 <= 3 || !(vpfVar instanceof vpf.a)) {
                                arrayList.add(obj3);
                            }
                            i2 = i3;
                        }
                    } else {
                        listT0 = (List) entry.getValue();
                    }
                } else {
                    listT0 = CollectionsKt.t0((Iterable) entry.getValue(), 1);
                }
                listT0 = arrayList;
            }
            arrayList2.add(listT0);
        }
        return a4h.f(l48.s(arrayList2));
    }
}
