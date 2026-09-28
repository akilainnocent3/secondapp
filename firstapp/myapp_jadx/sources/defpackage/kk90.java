package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class kk90<T> implements hk90<T>, v5b, ec80<T> {
    public final tb5 a;
    public final /* synthetic */ v5b b;

    public kk90(v5b v5bVar, tb5 tb5Var) {
        v5bVar.getClass();
        this.a = tb5Var;
        this.b = v5bVar;
    }

    @Override // defpackage.ec80
    public final void b(Function1<? super Throwable, Unit> function1) {
        this.a.b(function1);
    }

    @Override // defpackage.ec80
    public final Object c(T t) {
        return this.a.c(t);
    }

    @Override // defpackage.v5b
    public final CoroutineContext getCoroutineContext() {
        return this.b.getCoroutineContext();
    }

    @Override // defpackage.ec80
    public final Object j(v1b v1bVar, Object obj) {
        return this.a.j(v1bVar, obj);
    }

    @Override // defpackage.ec80
    public final boolean k(Throwable th) {
        return this.a.i(null, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.hk90
    public final Object l(dnz.b.c cVar, x1b x1bVar) {
        ik90 ik90Var;
        if (x1bVar instanceof ik90) {
            ik90Var = (ik90) x1bVar;
            int i = ik90Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ik90Var.e = i - Integer.MIN_VALUE;
            } else {
                ik90Var = new ik90(this, x1bVar);
            }
        } else {
            ik90Var = new ik90(this, x1bVar);
        }
        Object obj = ik90Var.c;
        y5b y5bVar = y5b.a;
        int i2 = ik90Var.e;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                CoroutineContext.Element element = this.b.getCoroutineContext().get(c9p.b.a);
                if (element == null) {
                    throw new IllegalStateException("Internal error, context should have a job.");
                }
                c9p c9pVar = (c9p) element;
                ik90Var.a = cVar;
                ik90Var.b = c9pVar;
                ik90Var.e = 1;
                bc6 bc6Var = new bc6(1, yzo.b(ik90Var));
                bc6Var.q();
                c9pVar.invokeOnCompletion(new jk90(bc6Var));
                if (bc6Var.o() == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = ik90Var.a;
                uj50.b(obj);
            }
            cVar.invoke();
            return Unit.a;
        } catch (Throwable th) {
            cVar.invoke();
            throw th;
        }
    }
}
