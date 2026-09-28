package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kd40 implements hd40, fjt {
    public final ge40 a;
    public final wwd0 b;

    public kd40(ge40 ge40Var, uqm uqmVar, mgb0 mgb0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        this.a = ge40Var;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.b = xwd0.a(o2gVar);
        uqmVar.addLogoutEventListener(this);
        zu7.a aVar = zu7.a;
        ej5.c(zu7.b(k5bVar), null, null, new jd40(mgb0Var, this, null), 3);
    }

    @Override // defpackage.hd40
    public final Object a(int i, rck rckVar) {
        gd40 gd40Var = (gd40) ((Map) this.b.getValue()).get(new Integer(i));
        if (gd40Var != null) {
            if (gd40Var.equals(gd40.e)) {
                gd40Var = null;
            }
            if (gd40Var != null) {
                return gd40Var;
            }
        }
        return c(i, rckVar);
    }

    @Override // defpackage.hd40
    public final boolean b() {
        Collection collectionValues = ((Map) this.b.getValue()).values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return false;
        }
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (!Intrinsics.g((gd40) it.next(), gd40.e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(int i, x1b x1bVar) {
        id40 id40Var;
        if (x1bVar instanceof id40) {
            id40Var = (id40) x1bVar;
            int i2 = id40Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                id40Var.d = i2 - Integer.MIN_VALUE;
            } else {
                id40Var = new id40(this, x1bVar);
            }
        } else {
            id40Var = new id40(this, x1bVar);
        }
        Object objA = id40Var.b;
        y5b y5bVar = y5b.a;
        int i3 = id40Var.d;
        if (i3 == 0) {
            uj50.b(objA);
            id40Var.a = i;
            id40Var.d = 1;
            objA = this.a.a(i, id40Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = id40Var.a;
            uj50.b(objA);
        }
        gd40 gd40Var = (gd40) objA;
        wwd0 wwd0Var = this.b;
        wwd0Var.setValue(kpu.i((Map) wwd0Var.getValue(), new Pair(new Integer(i), gd40Var)));
        return gd40Var;
    }

    @Override // defpackage.fjt
    public final void p() {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        wwd0 wwd0Var = this.b;
        wwd0Var.getClass();
        wwd0Var.k(null, o2gVar);
    }
}
