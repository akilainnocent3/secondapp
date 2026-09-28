package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public abstract class bse<T> extends n5f0 {
    public int c;

    public bse(int i) {
        this.c = i;
    }

    public abstract v1b<T> c();

    public Throwable d(Object obj) {
        dn8 dn8Var = obj instanceof dn8 ? (dn8) obj : null;
        if (dn8Var != null) {
            return dn8Var.a;
        }
        return null;
    }

    public final void f(Throwable th) {
        o5b.a(c().getContext(), new d6b("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object g();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            v1b<T> v1bVarC = c();
            v1bVarC.getClass();
            yre yreVar = (yre) v1bVarC;
            x1b x1bVar = yreVar.e;
            Object obj = yreVar.i;
            CoroutineContext context = x1bVar.getContext();
            Object objC = uof0.c(context, obj);
            c9p c9pVar = null;
            ldh0<?> ldh0VarC = objC != uof0.a ? g5b.c(x1bVar, context, objC) : null;
            try {
                CoroutineContext context2 = x1bVar.getContext();
                Object objG = g();
                Throwable thD = d(objG);
                if (thD == null) {
                    int i = this.c;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        c9pVar = (c9p) context2.get(c9p.b.a);
                    }
                }
                if (c9pVar != null && !c9pVar.isActive()) {
                    CancellationException cancellationException = c9pVar.getCancellationException();
                    b(cancellationException);
                    zi50.a aVar = zi50.b;
                    x1bVar.resumeWith(uj50.a(cancellationException));
                } else if (thD != null) {
                    zi50.a aVar2 = zi50.b;
                    x1bVar.resumeWith(new zi50.b(thD));
                } else {
                    zi50.a aVar3 = zi50.b;
                    x1bVar.resumeWith(e(objG));
                }
                Unit unit = Unit.a;
            } finally {
                if (ldh0VarC == null || ldh0VarC.p0()) {
                    uof0.a(context, objC);
                }
            }
        } catch (vre e) {
            o5b.a(c().getContext(), e.a);
        } catch (Throwable th) {
            f(th);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T e(Object obj) {
        return obj;
    }
}
