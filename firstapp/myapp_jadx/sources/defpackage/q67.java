package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class q67<E> extends a3<Unit> implements l67<E> {
    public final tb5 e;

    public q67(CoroutineContext coroutineContext, tb5 tb5Var) {
        super(coroutineContext, true);
        this.e = tb5Var;
    }

    @Override // defpackage.wf40
    public final Object a(v1b<? super E> v1bVar) {
        return this.e.a(v1bVar);
    }

    @Override // defpackage.ec80
    public final void b(Function1<? super Throwable, Unit> function1) {
        this.e.b(function1);
    }

    @Override // defpackage.ec80
    public final Object c(E e) {
        return this.e.c(e);
    }

    @Override // defpackage.m9p, defpackage.c9p
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new d9p(v(), null, this);
        }
        t(cancellationException);
    }

    @Override // defpackage.wf40
    public final Object e(tje0 tje0Var) {
        tb5 tb5Var = this.e;
        tb5Var.getClass();
        Object objH = tb5.H(tb5Var, tje0Var);
        y5b y5bVar = y5b.a;
        return objH;
    }

    @Override // defpackage.wf40
    public final u680<h77<E>> f() {
        return this.e.f();
    }

    @Override // defpackage.wf40
    public final Object h() {
        return this.e.h();
    }

    @Override // defpackage.wf40
    public final c77<E> iterator() {
        tb5 tb5Var = this.e;
        tb5Var.getClass();
        return new tb5.a();
    }

    @Override // defpackage.ec80
    public final Object j(v1b v1bVar, Object obj) {
        return this.e.j(v1bVar, obj);
    }

    @Override // defpackage.ec80
    public final boolean k(Throwable th) {
        return this.e.i(th, false);
    }

    @Override // defpackage.ec80
    public final boolean m() {
        return this.e.m();
    }

    @Override // defpackage.m9p
    public final void t(CancellationException cancellationException) {
        CancellationException cancellationExceptionI0 = m9p.i0(this, cancellationException);
        this.e.i(cancellationExceptionI0, true);
        r(cancellationExceptionI0);
    }
}
