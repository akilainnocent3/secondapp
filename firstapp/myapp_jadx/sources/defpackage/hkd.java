package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes8.dex */
public final class hkd {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(x1b x1bVar) {
        gkd gkdVar;
        if (x1bVar instanceof gkd) {
            gkdVar = (gkd) x1bVar;
            int i = gkdVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gkdVar.b = i - Integer.MIN_VALUE;
            } else {
                gkdVar = new gkd(x1bVar);
            }
        } else {
            gkdVar = new gkd(x1bVar);
        }
        Object obj = gkdVar.a;
        y5b y5bVar = y5b.a;
        int i2 = gkdVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            gkdVar.b = 1;
            bc6 bc6Var = new bc6(1, yzo.b(gkdVar));
            bc6Var.q();
            if (bc6Var.o() == y5bVar) {
                return;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            uj50.b(obj);
        }
        fkd.a();
    }

    public static final Object b(long j, v1b<? super Unit> v1bVar) throws Throwable {
        if (j <= 0) {
            return Unit.a;
        }
        bc6 bc6Var = new bc6(1, yzo.b(v1bVar));
        bc6Var.q();
        if (j < Long.MAX_VALUE) {
            d(bc6Var.e).l(j, bc6Var);
        }
        Object objO = bc6Var.o();
        return objO == y5b.a ? objO : Unit.a;
    }

    public static final Object c(long j, v1b<? super Unit> v1bVar) throws Throwable {
        Object objB = b(e(j), v1bVar);
        return objB == y5b.a ? objB : Unit.a;
    }

    public static final ekd d(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(d.n);
        ekd ekdVar = element instanceof ekd ? (ekd) element : null;
        return ekdVar == null ? icd.a : ekdVar;
    }

    public static final long e(long j) {
        b.a aVar = b.b;
        boolean z = j > 0;
        if (z) {
            return b.e(b.i(j, c.i(999999L, rgf.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        uhc.a();
        return 0L;
    }
}
