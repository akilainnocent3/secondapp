package defpackage;

import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes.dex */
public final class qvj0 implements ovj0 {
    public final yy20 a;
    public final p5f0 b;

    public qvj0(yy20 yy20Var, p5f0 p5f0Var) {
        yy20Var.getClass();
        p5f0Var.getClass();
        this.a = yy20Var;
        this.b = p5f0Var;
    }

    @Override // defpackage.ovj0
    public final void a(iwd0 iwd0Var, int i) {
        iwd0Var.getClass();
        this.b.d(new j1e0(this.a, iwd0Var, false, i));
    }

    public final void b(final iwd0 iwd0Var, final WorkerParameters.a aVar) {
        iwd0Var.getClass();
        this.b.d(new Runnable() { // from class: pvj0
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.g(iwd0Var, aVar);
            }
        });
    }
}
