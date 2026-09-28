package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxne0;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xne0 extends j8i0 {
    public final iym a;
    public final wwd0 b;
    public final wwd0 c;
    public final ku90<vne0> d;
    public final ku90 e;
    public final wwd0 f;
    public Object i;
    public bag v;

    public xne0(iym iymVar) {
        iymVar.getClass();
        this.a = iymVar;
        wwd0 wwd0VarA = xwd0.a(new wne0(15, null));
        this.b = wwd0VarA;
        this.c = wwd0VarA;
        ku90<vne0> ku90Var = new ku90<>();
        this.d = ku90Var;
        this.e = ku90Var;
        this.f = xwd0.a(Boolean.FALSE);
    }

    public final void A1() {
        wwd0 wwd0Var = this.b;
        boolean z = !((wne0) wwd0Var.getValue()).d;
        wne0 wne0Var = (wne0) wwd0Var.getValue();
        List<aoe0> list = ((wne0) wwd0Var.getValue()).a;
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(boe0.b((aoe0) it.next(), null, Boolean.valueOf(z), 1));
        }
        wne0 wne0VarA = wne0.a(wne0Var, arrayList, false, z, 6);
        wwd0Var.getClass();
        wwd0Var.k(null, wne0VarA);
    }

    public final void x1() {
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0Var = this.f;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
        wwd0 wwd0Var2 = this.b;
        wne0 wne0Var = (wne0) wwd0Var2.getValue();
        List<aoe0> list = ((wne0) wwd0Var2.getValue()).a;
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(boe0.b((aoe0) it.next(), null, Boolean.FALSE, 1));
        }
        wne0 wne0VarA = wne0.a(wne0Var, arrayList, false, false, 6);
        wwd0Var2.getClass();
        wwd0Var2.k(null, wne0VarA);
        this.d.a(vne0.b.a);
    }

    public final void y1(Object obj) {
        Object next;
        Iterator<T> it = ((wne0) this.c.getValue()).a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.g(((aoe0) next).getId(), obj));
        aoe0 aoe0Var = (aoe0) next;
        if (aoe0Var != null) {
            z1(aoe0Var);
        }
    }

    public final void z1(aoe0 aoe0Var) {
        if (aoe0Var.b() || boe0.c(aoe0Var)) {
            return;
        }
        wwd0 wwd0Var = this.b;
        wne0 wne0Var = (wne0) wwd0Var.getValue();
        List<aoe0> list = ((wne0) wwd0Var.getValue()).a;
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        for (aoe0 aoe0Var2 : list) {
            arrayList.add(boe0.b(aoe0Var2, Boolean.valueOf(Intrinsics.g(aoe0Var2.getId(), aoe0Var.getId())), null, 2));
        }
        wne0 wne0VarA = wne0.a(wne0Var, arrayList, false, false, 14);
        wwd0Var.getClass();
        wwd0Var.k(null, wne0VarA);
        if (aoe0Var instanceof aoe0.a) {
            gym.a(this.a, new zgj0(this.v, ((aoe0.a) aoe0Var).b, 1));
        }
        this.d.a(new vne0.e(aoe0Var));
    }
}
