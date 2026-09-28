package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.plugin.realsports.data.Event;

/* JADX INFO: loaded from: classes4.dex */
public final class csg {
    public final e8h a;
    public final gih b;
    public final bqu c;
    public final kmg d;
    public final uqm e;
    public final mgb0 f;
    public final lq1 g;
    public final k5b h;
    public final wwd0 i;

    public csg(e8h e8hVar, gih gihVar, bqu bquVar, kmg kmgVar, uqm uqmVar, mgb0 mgb0Var, lq1 lq1Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        e8hVar.getClass();
        kmgVar.getClass();
        uqmVar.getClass();
        mgb0Var.getClass();
        lq1Var.getClass();
        this.a = e8hVar;
        this.b = gihVar;
        this.c = bquVar;
        this.d = kmgVar;
        this.e = uqmVar;
        this.f = mgb0Var;
        this.g = lq1Var;
        this.h = k5bVar;
        this.i = xwd0.a(new aqg(null, null, null, null));
    }

    public final g1i a(int i, String str, String str2) {
        str.getClass();
        bqu bquVar = this.c;
        return new g1i(ozh.c(new or60(new aqu(bquVar, str, null)), bquVar.c), new zrg(this, str2, i, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Event event, int i, x1b x1bVar) {
        asg asgVar;
        if (x1bVar instanceof asg) {
            asgVar = (asg) x1bVar;
            int i2 = asgVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                asgVar.c = i2 - Integer.MIN_VALUE;
            } else {
                asgVar = new asg(this, x1bVar);
            }
        } else {
            asgVar = new asg(this, x1bVar);
        }
        Object objD = asgVar.a;
        y5b y5bVar = y5b.a;
        int i3 = asgVar.c;
        if (i3 == 0) {
            uj50.b(objD);
            bsg bsgVar = new bsg(this, event, i, null);
            asgVar.c = 1;
            objD = ej5.d(this.h, bsgVar, asgVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        return ((zi50) objD).a;
    }
}
