package defpackage;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class dj5 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T a(CoroutineContext coroutineContext, Function2<? super v5b, ? super v1b<? super T>, ? extends Object> function2) throws Throwable {
        tpg tpgVarA;
        CoroutineContext coroutineContextA;
        long jU0;
        Thread threadCurrentThread = Thread.currentThread();
        d.a aVar = d.n;
        if (((d) coroutineContext.get(aVar)) == null) {
            tpgVarA = xof0.a();
            coroutineContextA = g5b.a(e.a, coroutineContext.plus(tpgVarA), true);
            pfd pfdVar = fse.a;
            if (coroutineContextA != pfdVar && coroutineContextA.get(aVar) == null) {
                coroutineContextA = coroutineContextA.plus(pfdVar);
            }
        } else {
            tpgVarA = xof0.a.get();
            coroutineContextA = g5b.a(e.a, coroutineContext, true);
            pfd pfdVar2 = fse.a;
            if (coroutineContextA != pfdVar2 && coroutineContextA.get(aVar) == null) {
                coroutineContextA = coroutineContextA.plus(pfdVar2);
            }
        }
        xf4 xf4Var = new xf4(coroutineContextA, threadCurrentThread, tpgVarA);
        xf4Var.n0(a6b.a, xf4Var, function2);
        tpg tpgVar = xf4Var.f;
        if (tpgVar != null) {
            int i = tpg.e;
            tpgVar.n0(false);
        }
        while (true) {
            if (tpgVar != null) {
                try {
                    jU0 = tpgVar.u0();
                } catch (Throwable th) {
                    if (tpgVar != null) {
                        int i2 = tpg.e;
                        tpgVar.h0(false);
                    }
                    throw th;
                }
            } else {
                jU0 = Long.MAX_VALUE;
            }
            if (xf4Var.isCompleted()) {
                break;
            }
            LockSupport.parkNanos(xf4Var, jU0);
            if (Thread.interrupted()) {
                xf4Var.r(new InterruptedException());
            }
        }
        if (tpgVar != null) {
            int i3 = tpg.e;
            tpgVar.h0(false);
        }
        T t = (T) p9p.a(xf4Var.K());
        dn8 dn8Var = t instanceof dn8 ? (dn8) t : null;
        if (dn8Var == null) {
            return t;
        }
        throw dn8Var.a;
    }

    public static Object b(Function2 function2) {
        return a(e.a, function2);
    }
}
