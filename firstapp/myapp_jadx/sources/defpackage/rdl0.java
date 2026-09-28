package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class rdl0 implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ nfl0 b;

    public rdl0(nfl0 nfl0Var, AtomicReference atomicReference) {
        this.a = atomicReference;
        Objects.requireNonNull(nfl0Var);
        this.b = nfl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            try {
                try {
                    k8l0 k8l0Var = this.b.a;
                    atomicReference.set(k8l0Var.d.m(k8l0Var.q().m(), v2l0.b0));
                    this.a.notify();
                } catch (Throwable th) {
                    this.a.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
