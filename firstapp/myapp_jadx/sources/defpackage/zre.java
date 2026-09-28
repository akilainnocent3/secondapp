package defpackage;

import com.sportygames.commons.SportyGamesManager;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public final class zre {
    public static final toe0 a = new toe0("UNDEFINED");
    public static final toe0 b = new toe0("REUSABLE_CLAIMED");
    public static final nbd c = new nbd("opentelemetry-trace-span-key");
    public static final /* synthetic */ int d = 0;

    public static String a() {
        return (SportyGamesManager.getInstance() == null || SportyGamesManager.getInstance().getUserId() == null) ? "" : SportyGamesManager.getInstance().getUserId();
    }

    public static final void b(v1b v1bVar, Object obj) {
        if (!(v1bVar instanceof yre)) {
            v1bVar.resumeWith(obj);
            return;
        }
        yre yreVar = (yre) v1bVar;
        k5b k5bVar = yreVar.d;
        x1b x1bVar = yreVar.e;
        Throwable thA = zi50.a(obj);
        Object dn8Var = thA == null ? obj : new dn8(thA, false);
        if (d(k5bVar, x1bVar.getContext())) {
            yreVar.f = dn8Var;
            yreVar.c = 1;
            c(k5bVar, x1bVar.getContext(), yreVar);
            return;
        }
        tpg tpgVarA = xof0.a();
        if (tpgVarA.b >= 4294967296L) {
            yreVar.f = dn8Var;
            yreVar.c = 1;
            tpgVarA.l0(yreVar);
            return;
        }
        tpgVarA.n0(true);
        try {
            c9p c9pVar = (c9p) x1bVar.getContext().get(c9p.b.a);
            if (c9pVar == null || c9pVar.isActive()) {
                Object obj2 = yreVar.i;
                CoroutineContext context = x1bVar.getContext();
                Object objC = uof0.c(context, obj2);
                ldh0<?> ldh0VarC = objC != uof0.a ? g5b.c(x1bVar, context, objC) : null;
                try {
                    x1bVar.resumeWith(obj);
                    Unit unit = Unit.a;
                    if (ldh0VarC == null || ldh0VarC.p0()) {
                        uof0.a(context, objC);
                    }
                } catch (Throwable th) {
                    if (ldh0VarC == null || ldh0VarC.p0()) {
                        uof0.a(context, objC);
                    }
                    throw th;
                }
            } else {
                yreVar.resumeWith(uj50.a(c9pVar.getCancellationException()));
            }
            while (tpgVarA.z0()) {
            }
        } catch (Throwable th2) {
            try {
                yreVar.f(th2);
            } finally {
                tpgVarA.h0(true);
            }
        }
    }

    public static final void c(k5b k5bVar, CoroutineContext coroutineContext, Runnable runnable) {
        try {
            k5bVar.d0(coroutineContext, runnable);
        } catch (Throwable th) {
            throw new vre(th, k5bVar, coroutineContext);
        }
    }

    public static final boolean d(k5b k5bVar, CoroutineContext coroutineContext) throws vre {
        try {
            return k5bVar.f0(coroutineContext);
        } catch (Throwable th) {
            throw new vre(th, k5bVar, coroutineContext);
        }
    }
}
