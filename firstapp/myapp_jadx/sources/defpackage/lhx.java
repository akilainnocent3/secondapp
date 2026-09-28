package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
public final class lhx {
    public final fhx a;
    public final esa0<ygx> b = new esa0<>(0);
    public int c;
    public String d;
    public String e;

    public lhx(fhx fhxVar) {
        this.a = fhxVar;
    }

    public final void a(ygx ygxVar) {
        fhx fhxVar = this.a;
        dhx dhxVar = fhxVar.b;
        ygxVar.getClass();
        dhx dhxVar2 = ygxVar.b;
        int i = dhxVar2.e;
        String str = dhxVar2.f;
        if (i == 0 && str == null) {
            hb5.a("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
            return;
        }
        String str2 = dhxVar.f;
        if (str2 != null && Intrinsics.g(str, str2)) {
            axz.a(ygxVar, "Destination ", " cannot have the same route as graph ", fhxVar);
            return;
        }
        if (i == dhxVar.e) {
            axz.a(ygxVar, "Destination ", " cannot have the same id as graph ", fhxVar);
            return;
        }
        esa0<ygx> esa0Var = this.b;
        ygx ygxVar2 = (ygx) fsa0.a(esa0Var, i);
        if (ygxVar2 == ygxVar) {
            return;
        }
        if (ygxVar.c != null) {
            ib5.a("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            return;
        }
        if (ygxVar2 != null) {
            ygxVar2.c = null;
        }
        ygxVar.c = fhxVar;
        esa0Var.d(dhxVar2.e, ygxVar);
    }

    public final ygx b(int i) {
        return d(i, this.a, null, false);
    }

    public final ygx c(String str, boolean z) {
        Object next;
        fhx fhxVar;
        ygx ygxVar;
        str.getClass();
        Iterator it = fd80.b(new hsa0(this.b)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ygxVar = (ygx) next;
            if (c.l(ygxVar.b.f, str, false)) {
                break;
            }
        } while (ygxVar.b.a(str) == null);
        ygx ygxVar2 = (ygx) next;
        if (ygxVar2 != null) {
            return ygxVar2;
        }
        if (!z || (fhxVar = this.a.c) == null) {
            return null;
        }
        return fhxVar.n(str);
    }

    public final ygx d(int i, ygx ygxVar, ygx ygxVar2, boolean z) {
        esa0<ygx> esa0Var = this.b;
        ygx ygxVarD = (ygx) fsa0.a(esa0Var, i);
        if (ygxVar2 != null) {
            if (Intrinsics.g(ygxVarD, ygxVar2) && Intrinsics.g(ygxVarD.c, ygxVar2.c)) {
                return ygxVarD;
            }
            ygxVarD = null;
        } else if (ygxVarD != null) {
            return ygxVarD;
        }
        fhx fhxVar = this.a;
        if (z) {
            Iterator it = fd80.b(new hsa0(esa0Var)).iterator();
            do {
                if (!it.hasNext()) {
                    ygxVarD = null;
                    break;
                }
                ygx ygxVar3 = (ygx) it.next();
                ygxVarD = (!(ygxVar3 instanceof fhx) || ygxVar3.equals(ygxVar)) ? null : ((fhx) ygxVar3).i.d(i, fhxVar, ygxVar2, true);
            } while (ygxVarD == null);
        }
        if (ygxVarD != null) {
            return ygxVarD;
        }
        fhx fhxVar2 = fhxVar.c;
        if (fhxVar2 == null || fhxVar2.equals(ygxVar)) {
            return null;
        }
        fhx fhxVar3 = fhxVar.c;
        fhxVar3.getClass();
        return fhxVar3.i.d(i, fhxVar, ygxVar2, z);
    }

    public final ygx.b e(ygx.b bVar, ugx ugxVar, boolean z, ygx ygxVar) {
        ygx.b bVarO;
        ArrayList arrayList = new ArrayList();
        fhx fhxVar = this.a;
        Iterator<ygx> it = fhxVar.iterator();
        while (true) {
            khx khxVar = (khx) it;
            bVarO = null;
            if (!khxVar.hasNext()) {
                break;
            }
            ygx ygxVar2 = (ygx) khxVar.next();
            bVarO = Intrinsics.g(ygxVar2, ygxVar) ? null : ygxVar2.j(ugxVar);
            if (bVarO != null) {
                arrayList.add(bVarO);
            }
        }
        ygx.b bVar2 = (ygx.b) CollectionsKt.e0(arrayList);
        fhx fhxVar2 = fhxVar.c;
        if (fhxVar2 != null && z && !fhxVar2.equals(ygxVar)) {
            bVarO = fhxVar2.o(ugxVar, fhxVar);
        }
        return (ygx.b) CollectionsKt.e0(ay0.v(new ygx.b[]{bVar, bVar2, bVarO}));
    }

    public final void f(int i) {
        fhx fhxVar = this.a;
        if (i != fhxVar.b.e) {
            if (this.e != null) {
                g(null);
            }
            this.c = i;
            this.d = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i + " cannot use the same id as the graph " + fhxVar).toString());
    }

    public final void g(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            fhx fhxVar = this.a;
            if (str.equals(fhxVar.b.f)) {
                axz.a(str, "Start destination ", " cannot use the same route as the graph ", fhxVar);
                return;
            } else if (StringsKt.U(str)) {
                hb5.a("Cannot have an empty start destination route");
                return;
            } else {
                int i = ygx.f;
                iHashCode = "android-app://androidx.navigation/".concat(str).hashCode();
            }
        }
        this.c = iHashCode;
        this.e = str;
    }
}
