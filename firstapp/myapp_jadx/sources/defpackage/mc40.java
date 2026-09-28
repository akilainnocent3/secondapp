package defpackage;

import com.sporty.android.core.model.dispatcher.ApplicationScope;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.plugin.realsports.data.local.BetSlipDataStore;
import kotlin.Unit;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes5.dex */
public final class mc40 {
    public final BetSlipDataStore a;
    public final v5b b;
    public final k5b c;

    public mc40(BetSlipDataStore betSlipDataStore, @ApplicationScope v5b v5bVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        betSlipDataStore.getClass();
        v5bVar.getClass();
        this.a = betSlipDataStore;
        this.b = v5bVar;
        this.c = k5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        kc40 kc40Var;
        Long l;
        if (x1bVar instanceof kc40) {
            kc40Var = (kc40) x1bVar;
            int i = kc40Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kc40Var.d = i - Integer.MIN_VALUE;
            } else {
                kc40Var = new kc40(this, x1bVar);
            }
        } else {
            kc40Var = new kc40(this, x1bVar);
        }
        Object objF = kc40Var.b;
        y5b y5bVar = y5b.a;
        int i2 = kc40Var.d;
        BetSlipDataStore betSlipDataStore = this.a;
        if (i2 == 0) {
            uj50.b(objF);
            wm20<Long> rebetRemixStep2TimestampMillis = betSlipDataStore.getRebetRemixStep2TimestampMillis();
            kc40Var.d = 1;
            objF = rebetRemixStep2TimestampMillis.f(kc40Var);
            if (objF != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            uj50.b(objF);
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l = kc40Var.a;
            uj50.b(objF);
        }
        if (l == null) {
            return null;
        }
        b.a aVar = b.b;
        return new Long(b.j(c.i(System.currentTimeMillis() - l.longValue(), rgf.MILLISECONDS), rgf.SECONDS));
        Long l2 = (Long) objF;
        wm20<Long> rebetRemixStep2TimestampMillis2 = betSlipDataStore.getRebetRemixStep2TimestampMillis();
        kc40Var.a = l2;
        kc40Var.d = 2;
        if (rebetRemixStep2TimestampMillis2.a(kc40Var) != y5bVar) {
            l = l2;
            if (l == null) {
                return null;
            }
            b.a aVar2 = b.b;
            return new Long(b.j(c.i(System.currentTimeMillis() - l.longValue(), rgf.MILLISECONDS), rgf.SECONDS));
        }
        return y5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) {
        lc40 lc40Var;
        if (x1bVar instanceof lc40) {
            lc40Var = (lc40) x1bVar;
            int i = lc40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lc40Var.c = i - Integer.MIN_VALUE;
            } else {
                lc40Var = new lc40(this, x1bVar);
            }
        } else {
            lc40Var = new lc40(this, x1bVar);
        }
        Object objF = lc40Var.a;
        y5b y5bVar = y5b.a;
        int i2 = lc40Var.c;
        BetSlipDataStore betSlipDataStore = this.a;
        if (i2 == 0) {
            uj50.b(objF);
            wm20<Long> rebetRemixStep2TimestampMillis = betSlipDataStore.getRebetRemixStep2TimestampMillis();
            lc40Var.c = 1;
            objF = rebetRemixStep2TimestampMillis.f(lc40Var);
            if (objF != y5bVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objF);
                return objF;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objF);
        if (objF != null) {
            return Unit.a;
        }
        wm20<Long> rebetRemixStep2TimestampMillis2 = betSlipDataStore.getRebetRemixStep2TimestampMillis();
        Long l = new Long(System.currentTimeMillis());
        lc40Var.c = 2;
        Object objG = rebetRemixStep2TimestampMillis2.g(lc40Var, l);
        return objG == y5bVar ? y5bVar : objG;
    }
}
