package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public final class yre<T> extends bse<T> implements z5b, v1b<T> {
    public static final /* synthetic */ long v = s0o.a.objectFieldOffset(yre.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final k5b d;
    public final x1b e;
    public Object f;
    public final Object i;

    public yre(k5b k5bVar, x1b x1bVar) {
        super(-1);
        this.d = k5bVar;
        this.e = x1bVar;
        this.f = zre.a;
        this.i = uof0.b(x1bVar.getContext());
    }

    @Override // defpackage.bse
    public final Object g() {
        Object obj = this.f;
        this.f = zre.a;
        return obj;
    }

    @Override // defpackage.z5b
    public final z5b getCallerFrame() {
        x1b x1bVar = this.e;
        if (x1bVar != null) {
            return x1bVar;
        }
        return null;
    }

    @Override // defpackage.v1b
    public final CoroutineContext getContext() {
        return this.e.getContext();
    }

    @Override // defpackage.v1b
    public final void resumeWith(Object obj) {
        Throwable thA = zi50.a(obj);
        Object dn8Var = thA == null ? obj : new dn8(thA, false);
        x1b x1bVar = this.e;
        CoroutineContext context = x1bVar.getContext();
        k5b k5bVar = this.d;
        if (zre.d(k5bVar, context)) {
            this.f = dn8Var;
            this.c = 0;
            zre.c(k5bVar, x1bVar.getContext(), this);
            return;
        }
        tpg tpgVarA = xof0.a();
        if (tpgVarA.b >= 4294967296L) {
            this.f = dn8Var;
            this.c = 0;
            tpgVarA.l0(this);
            return;
        }
        tpgVarA.n0(true);
        try {
            CoroutineContext context2 = x1bVar.getContext();
            Object objC = uof0.c(context2, this.i);
            try {
                x1bVar.resumeWith(obj);
                Unit unit = Unit.a;
                uof0.a(context2, objC);
                while (tpgVarA.z0()) {
                }
            } catch (Throwable th) {
                uof0.a(context2, objC);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                f(th2);
            } finally {
                tpgVarA.h0(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + x2d.e(this.e) + ']';
    }

    @Override // defpackage.bse
    public final v1b<T> c() {
        return this;
    }
}
