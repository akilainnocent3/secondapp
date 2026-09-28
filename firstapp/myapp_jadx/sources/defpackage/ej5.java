package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ej5 {
    public static pjd a(v5b v5bVar, CoroutineContext coroutineContext, Function2 function2, int i) {
        a6b a6bVar = a6b.d;
        if ((i & 1) != 0) {
            coroutineContext = e.a;
        }
        if ((i & 2) != 0) {
            a6bVar = a6b.a;
        }
        CoroutineContext coroutineContextB = g5b.b(v5bVar, coroutineContext);
        pjd xtrVar = a6bVar == a6b.b ? new xtr(coroutineContextB, function2) : new pjd(coroutineContextB, true);
        xtrVar.n0(a6bVar, xtrVar, function2);
        return xtrVar;
    }

    public static final jvd0 b(v5b v5bVar, CoroutineContext coroutineContext, a6b a6bVar, Function2 function2) {
        CoroutineContext coroutineContextB = g5b.b(v5bVar, coroutineContext);
        a6bVar.getClass();
        jvd0 v0sVar = a6bVar == a6b.b ? new v0s(coroutineContextB, function2) : new jvd0(coroutineContextB, true);
        v0sVar.n0(a6bVar, v0sVar, function2);
        return v0sVar;
    }

    public static jvd0 c(v5b v5bVar, CoroutineContext coroutineContext, a6b a6bVar, Function2 function2, int i) {
        if ((i & 1) != 0) {
            coroutineContext = e.a;
        }
        if ((i & 2) != 0) {
            a6bVar = a6b.a;
        }
        return b(v5bVar, coroutineContext, a6bVar, function2);
    }

    public static final <T> Object d(CoroutineContext coroutineContext, Function2<? super v5b, ? super v1b<? super T>, ? extends Object> function2, v1b<? super T> v1bVar) {
        Unsafe unsafe;
        long j;
        Object objA;
        CoroutineContext context = v1bVar.getContext();
        CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(Boolean.FALSE, new d5b())).booleanValue() ? context.plus(coroutineContext) : g5b.a(context, coroutineContext, false);
        i9p.e(coroutineContextPlus);
        if (coroutineContextPlus == context) {
            vn70 vn70Var = new vn70(v1bVar, coroutineContextPlus);
            objA = mdh0.a(vn70Var, true, vn70Var, function2);
        } else {
            d.a aVar = d.n;
            if (Intrinsics.g(coroutineContextPlus.get(aVar), context.get(aVar))) {
                ldh0 ldh0Var = new ldh0(v1bVar, coroutineContextPlus);
                CoroutineContext coroutineContext2 = ldh0Var.d;
                Object objC = uof0.c(coroutineContext2, null);
                try {
                    Object objA2 = mdh0.a(ldh0Var, true, ldh0Var, function2);
                    uof0.a(coroutineContext2, objC);
                    objA = objA2;
                } catch (Throwable th) {
                    uof0.a(coroutineContext2, objC);
                    throw th;
                }
            } else {
                ase aseVar = new ase(v1bVar, coroutineContextPlus);
                fc6.a(function2, aseVar, aseVar);
                do {
                    unsafe = s0o.a;
                    j = ase.f;
                    int intVolatile = unsafe.getIntVolatile(aseVar, j);
                    if (intVolatile != 0) {
                        if (intVolatile != 2) {
                            ib5.a("Already suspended");
                            return null;
                        }
                        objA = p9p.a(aseVar.K());
                        if (objA instanceof dn8) {
                            throw ((dn8) objA).a;
                        }
                    }
                } while (!unsafe.compareAndSwapInt(aseVar, j, 0, 1));
                objA = y5b.a;
            }
        }
        y5b y5bVar = y5b.a;
        return objA;
    }
}
