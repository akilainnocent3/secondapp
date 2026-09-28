package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class pja0 implements fzm {
    public final pym a;
    public final eal b;

    public pja0(pym pymVar, eal ealVar) {
        pymVar.getClass();
        ealVar.getClass();
        this.a = pymVar;
        this.b = ealVar;
    }

    @Override // defpackage.fzm
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.fzm
    public final Object b(String str, Map map, Map map2, x1b x1bVar) {
        Object objC = this.a.c(str, 1500, 1500, map, map2, x1bVar);
        return objC == y5b.a ? objC : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.fzm
    public final Object c(List list, iee0 iee0Var, Map map, x1b x1bVar) {
        oja0 oja0Var;
        Iterator it;
        int i;
        Map map2;
        iee0 iee0Var2;
        xyi0 xyi0Var;
        if (x1bVar instanceof oja0) {
            oja0Var = (oja0) x1bVar;
            int i2 = oja0Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oja0Var.i = i2 - Integer.MIN_VALUE;
            } else {
                oja0Var = new oja0(this, x1bVar);
            }
        } else {
            oja0Var = new oja0(this, x1bVar);
        }
        Object obj = oja0Var.e;
        y5b y5bVar = y5b.a;
        int i3 = oja0Var.i;
        if (i3 == 0) {
            uj50.b(obj);
            it = list.iterator();
            i = 0;
            map2 = map;
            iee0Var2 = iee0Var;
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = oja0Var.d;
            it = oja0Var.c;
            Map map3 = oja0Var.b;
            iee0 iee0Var3 = oja0Var.a;
            uj50.b(obj);
            map2 = map3;
            iee0Var2 = iee0Var3;
        }
        while (it.hasNext()) {
            String str = (String) it.next();
            iee0Var2.getClass();
            int iOrdinal = iee0Var2.ordinal();
            if (iOrdinal == 0) {
                xyi0Var = xyi0.a;
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return null;
                }
                xyi0Var = xyi0.b;
            }
            oja0Var.a = iee0Var2;
            oja0Var.b = map2;
            oja0Var.c = it;
            oja0Var.d = i;
            oja0Var.i = 1;
            if (this.a.g(str, xyi0Var, map2) == y5bVar) {
                return y5bVar;
            }
        }
        return Unit.a;
    }

    @Override // defpackage.fzm
    public final Object d(String str, Object obj, Map map, x1b x1bVar) {
        Unit unitB = this.a.b(map, str, obj != null ? this.b.j(obj) : null);
        return unitB == y5b.a ? unitB : Unit.a;
    }

    @Override // defpackage.fzm
    public final Object e(hrj hrjVar) {
        return this.a.f(hrjVar);
    }
}
