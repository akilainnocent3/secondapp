package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class j570 {
    public final tuw a = uuw.a();
    public final b390 b = d390.b(0, 1, pb5.b, 1);
    public final wwd0 c;
    public final wwd0 d;

    public j570() {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.c = xwd0.a(o2gVar);
        this.d = xwd0.a(m2g.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(q570 q570Var, x1b x1bVar) {
        i570 i570Var;
        q570 q570Var2;
        tuw tuwVar;
        Object value;
        ArrayList arrayList;
        if (x1bVar instanceof i570) {
            i570Var = (i570) x1bVar;
            int i = i570Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                i570Var.e = i - Integer.MIN_VALUE;
            } else {
                i570Var = new i570(this, x1bVar);
            }
        } else {
            i570Var = new i570(this, x1bVar);
        }
        Object obj = i570Var.c;
        y5b y5bVar = y5b.a;
        int i2 = i570Var.e;
        if (i2 == 0) {
            uj50.b(obj);
            i570Var.a = q570Var;
            tuw tuwVar2 = this.a;
            i570Var.b = tuwVar2;
            i570Var.e = 1;
            if (tuwVar2.d(i570Var) == y5bVar) {
                return y5bVar;
            }
            q570Var2 = q570Var;
            tuwVar = tuwVar2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tuwVar = i570Var.b;
            q570Var2 = i570Var.a;
            uj50.b(obj);
        }
        try {
            wwd0 wwd0Var = this.d;
            do {
                value = wwd0Var.getValue();
                arrayList = new ArrayList();
                for (Object obj2 : (List) value) {
                    if (!((q570) obj2).a.equals(q570Var2.a)) {
                        arrayList.add(obj2);
                    }
                }
            } while (!wwd0Var.g(value, CollectionsKt.j0(arrayList, q570Var2)));
            return Unit.a;
        } finally {
            tuwVar.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ni70 ni70Var, long j, x1b x1bVar) {
        h570 h570Var;
        tuw tuwVar;
        Object value;
        ArrayList arrayList;
        ArrayList arrayList2;
        if (x1bVar instanceof h570) {
            h570Var = (h570) x1bVar;
            int i = h570Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                h570Var.f = i - Integer.MIN_VALUE;
            } else {
                h570Var = new h570(this, x1bVar);
            }
        } else {
            h570Var = new h570(this, x1bVar);
        }
        Object obj = h570Var.d;
        y5b y5bVar = y5b.a;
        int i2 = h570Var.f;
        if (i2 == 0) {
            uj50.b(obj);
            h570Var.a = ni70Var;
            tuwVar = this.a;
            h570Var.b = tuwVar;
            h570Var.c = j;
            h570Var.f = 1;
            if (tuwVar.d(h570Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = h570Var.c;
            tuw tuwVar2 = h570Var.b;
            ni70 ni70Var2 = h570Var.a;
            uj50.b(obj);
            tuwVar = tuwVar2;
            ni70Var = ni70Var2;
        }
        try {
            wwd0 wwd0Var = this.d;
            do {
                value = wwd0Var.getValue();
                List list = (List) value;
                List<l770> list2 = ni70Var.c;
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    p48.w(((l770) it.next()).d, arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                int size = arrayList3.size();
                int i3 = 0;
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList3.get(i4);
                    i4++;
                    if (((e970) obj2).b(j)) {
                        arrayList4.add(obj2);
                    }
                }
                ArrayList arrayList5 = new ArrayList(l48.r(arrayList4, 10));
                int size2 = arrayList4.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    arrayList5.add(((e970) obj3).a);
                }
                Set setE0 = CollectionsKt.E0(arrayList5);
                arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (setE0.contains(((q570) obj4).a)) {
                        arrayList.add(obj4);
                    }
                }
                ArrayList arrayList6 = new ArrayList(l48.r(arrayList, 10));
                int size3 = arrayList.size();
                int i6 = 0;
                while (i6 < size3) {
                    Object obj5 = arrayList.get(i6);
                    i6++;
                    arrayList6.add(((q570) obj5).a);
                }
                Set setE1 = CollectionsKt.E0(arrayList6);
                ArrayList arrayList7 = new ArrayList();
                int size4 = arrayList4.size();
                int i7 = 0;
                while (i7 < size4) {
                    Object obj6 = arrayList4.get(i7);
                    i7++;
                    if (!setE1.contains(((e970) obj6).a)) {
                        arrayList7.add(obj6);
                    }
                }
                arrayList2 = new ArrayList();
                int size5 = arrayList7.size();
                while (i3 < size5) {
                    Object obj7 = arrayList7.get(i3);
                    i3++;
                    e970 e970Var = (e970) obj7;
                    z370 z370Var = (z370) CollectionsKt.firstOrNull(e970Var.i);
                    q570 q570Var = z370Var == null ? null : new q570(e970Var.a, z370Var.a);
                    if (q570Var != null) {
                        arrayList2.add(q570Var);
                    }
                }
            } while (!wwd0Var.g(value, CollectionsKt.i0(arrayList2, arrayList)));
            return Unit.a;
        } finally {
            tuwVar.f(null);
        }
    }
}
