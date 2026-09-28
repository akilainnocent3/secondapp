package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public abstract class r2i<T> implements m830<T> {
    public static final int a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    @Override // defpackage.m830
    public final void c(zde0<? super T> zde0Var) {
        if (zde0Var instanceof n3i) {
            h((n3i) zde0Var);
        } else {
            yby.b(zde0Var, "s is null");
            h(new c9e0(zde0Var));
        }
    }

    public final z2i e(long j) {
        if (j >= 0) {
            return new z2i(this, j);
        }
        hb5.a(avg.a(j, "count >= 0 required but it was "));
        return null;
    }

    public final b3i f(qm70 qm70Var) {
        yby.b(qm70Var, "scheduler is null");
        int i = a;
        yby.c(i, "bufferSize");
        return new b3i(this, qm70Var, i);
    }

    public final l3i g() {
        int i = a;
        yby.c(i, "bufferSize");
        AtomicReference atomicReference = new AtomicReference();
        i3i i3iVar = new i3i(new i3i.a(atomicReference, i), this, atomicReference, i);
        return new l3i(new j3i(i3iVar.b, i3iVar.c));
    }

    public final void h(n3i<? super T> n3iVar) {
        try {
            i(n3iVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            qtg.a(th);
            o760.b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void i(zde0<? super T> zde0Var);

    public final m3i j(qm70 qm70Var) {
        yby.b(qm70Var, "scheduler is null");
        return new m3i(this, qm70Var);
    }

    public final p3i k() {
        qm70 qm70Var = wm70.b;
        yby.b(TimeUnit.SECONDS, "timeUnit is null");
        yby.b(qm70Var, "scheduler is null");
        return new p3i(this, qm70Var);
    }
}
