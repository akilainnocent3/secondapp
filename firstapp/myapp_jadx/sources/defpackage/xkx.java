package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class xkx {
    public final ope0 a = new ope0();
    public final wwd0 b;
    public final wwd0 c;
    public boolean d;
    public final v340 e;
    public final v340 f;

    public xkx() {
        wwd0 wwd0VarA = xwd0.a(m2g.a);
        this.b = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(t3g.a);
        this.c = wwd0VarA2;
        this.e = e1i.b(wwd0VarA);
        this.f = e1i.b(wwd0VarA2);
    }

    public abstract ifx a(ygx ygxVar, Bundle bundle);

    public void b(ifx ifxVar) {
        ifxVar.getClass();
        wwd0 wwd0Var = this.c;
        LinkedHashSet linkedHashSetC = yi80.c((Set) wwd0Var.getValue(), ifxVar);
        wwd0Var.getClass();
        wwd0Var.k(null, linkedHashSetC);
    }

    public final void c(ifx ifxVar) {
        int iNextIndex;
        synchronized (this.a) {
            try {
                ArrayList arrayListC0 = CollectionsKt.C0((Collection) this.e.a.getValue());
                ListIterator listIterator = arrayListC0.listIterator(arrayListC0.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    } else if (((ifx) listIterator.previous()).f.equals(ifxVar.f)) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                arrayListC0.set(iNextIndex, ifxVar);
                wwd0 wwd0Var = this.b;
                wwd0Var.getClass();
                wwd0Var.k(null, arrayListC0);
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(ifx ifxVar, boolean z) {
        synchronized (this.a) {
            try {
                wwd0 wwd0Var = this.b;
                Iterable iterable = (Iterable) wwd0Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (Intrinsics.g((ifx) obj, ifxVar)) {
                        break;
                    } else {
                        arrayList.add(obj);
                    }
                }
                wwd0Var.getClass();
                wwd0Var.k(null, arrayList);
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(ifx ifxVar, boolean z) {
        Object objPrevious;
        wwd0 wwd0Var = this.c;
        Iterable iterable = (Iterable) wwd0Var.getValue();
        boolean z2 = iterable instanceof Collection;
        v340 v340Var = this.e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((ifx) it.next()) == ifxVar) {
                    Iterable iterable2 = (Iterable) v340Var.a.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((ifx) it2.next()) == ifxVar) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        LinkedHashSet linkedHashSetF = yi80.f((Set) wwd0Var.getValue(), ifxVar);
        wwd0Var.getClass();
        wwd0Var.k(null, linkedHashSetF);
        List list = (List) v340Var.a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            ifx ifxVar2 = (ifx) objPrevious;
            if (!Intrinsics.g(ifxVar2, ifxVar) && ((List) v340Var.a.getValue()).lastIndexOf(ifxVar2) < ((List) v340Var.a.getValue()).lastIndexOf(ifxVar)) {
                break;
            }
        }
        ifx ifxVar3 = (ifx) objPrevious;
        if (ifxVar3 != null) {
            LinkedHashSet linkedHashSetF2 = yi80.f((Set) wwd0Var.getValue(), ifxVar3);
            wwd0Var.getClass();
            wwd0Var.k(null, linkedHashSetF2);
        }
        d(ifxVar, z);
    }

    public void f(ifx ifxVar) {
        ifxVar.getClass();
        wwd0 wwd0Var = this.c;
        LinkedHashSet linkedHashSetF = yi80.f((Set) wwd0Var.getValue(), ifxVar);
        wwd0Var.getClass();
        wwd0Var.k(null, linkedHashSetF);
    }

    public void g(ifx ifxVar) {
        ifxVar.getClass();
        synchronized (this.a) {
            wwd0 wwd0Var = this.b;
            ArrayList arrayListJ0 = CollectionsKt.j0((Collection) wwd0Var.getValue(), ifxVar);
            wwd0Var.getClass();
            wwd0Var.k(null, arrayListJ0);
            Unit unit = Unit.a;
        }
    }

    public final void h(ifx ifxVar) {
        ifxVar.getClass();
        wwd0 wwd0Var = this.c;
        Iterable iterable = (Iterable) wwd0Var.getValue();
        boolean z = iterable instanceof Collection;
        v340 v340Var = this.e;
        if (!z || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((ifx) it.next()) == ifxVar) {
                    Iterable iterable2 = (Iterable) v340Var.a.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((ifx) it2.next()) == ifxVar) {
                                return;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        ifx ifxVar2 = (ifx) CollectionsKt.d0((List) v340Var.a.getValue());
        if (ifxVar2 != null) {
            LinkedHashSet linkedHashSetF = yi80.f((Set) wwd0Var.getValue(), ifxVar2);
            wwd0Var.getClass();
            wwd0Var.k(null, linkedHashSetF);
        }
        LinkedHashSet linkedHashSetF2 = yi80.f((Set) wwd0Var.getValue(), ifxVar);
        wwd0Var.getClass();
        wwd0Var.k(null, linkedHashSetF2);
        g(ifxVar);
    }
}
