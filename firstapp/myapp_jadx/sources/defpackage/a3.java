package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a3<T> extends m9p implements v1b<T>, v5b {
    public final CoroutineContext d;

    public a3(CoroutineContext coroutineContext, boolean z) {
        super(z);
        N((c9p) coroutineContext.get(c9p.b.a));
        this.d = coroutineContext.plus(this);
    }

    @Override // defpackage.m9p
    public final void M(fn8 fn8Var) {
        o5b.a(this.d, fn8Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m9p
    public final void X(Object obj) {
        if (!(obj instanceof dn8)) {
            m0(obj);
        } else {
            dn8 dn8Var = (dn8) obj;
            l0(dn8Var.a, s0o.a.getIntVolatile(dn8Var, dn8.b) == 1);
        }
    }

    @Override // defpackage.v1b
    public final CoroutineContext getContext() {
        return this.d;
    }

    @Override // defpackage.v5b
    public final CoroutineContext getCoroutineContext() {
        return this.d;
    }

    public final void n0(a6b a6bVar, a3 a3Var, Function2 function2) {
        Object objInvoke;
        int iOrdinal = a6bVar.ordinal();
        if (iOrdinal == 0) {
            fc6.a(function2, a3Var, this);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                function2.getClass();
                v1b v1bVarB = yzo.b(yzo.a(a3Var, this, function2));
                Unit unit = Unit.a;
                zi50.a aVar = zi50.b;
                v1bVarB.resumeWith(unit);
                return;
            }
            if (iOrdinal != 3) {
                uhc.a();
                return;
            }
            try {
                CoroutineContext coroutineContext = this.d;
                Object objC = uof0.c(coroutineContext, null);
                try {
                    if (function2 instanceof pz1) {
                        y8h0.d(2, function2);
                        objInvoke = function2.invoke(a3Var, this);
                    } else {
                        objInvoke = yzo.c(this, a3Var, function2);
                    }
                    uof0.a(coroutineContext, objC);
                    if (objInvoke != y5b.a) {
                        zi50.a aVar2 = zi50.b;
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    uof0.a(coroutineContext, objC);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof vre) {
                    th = ((vre) th).a;
                }
                zi50.a aVar3 = zi50.b;
                resumeWith(new zi50.b(th));
            }
        }
    }

    @Override // defpackage.v1b
    public final void resumeWith(Object obj) {
        Throwable thA = zi50.a(obj);
        if (thA != null) {
            obj = new dn8(thA, false);
        }
        Object objS = S(obj);
        if (objS == p9p.b) {
            return;
        }
        p(objS);
    }

    @Override // defpackage.m9p
    public final String v() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void m0(T t) {
    }

    public void l0(Throwable th, boolean z) {
    }
}
