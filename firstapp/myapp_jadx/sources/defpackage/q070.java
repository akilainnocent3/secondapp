package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class q070 {
    public final uy0 a;
    public final psm b;
    public final wwd0 c = xwd0.a(null);
    public final wwd0 d = xwd0.a(lni0.a);
    public final wwd0 e = xwd0.a(bz3.SINGLE);
    public final wwd0 f = xwd0.a(null);

    public q070(uy0 uy0Var, psm psmVar) {
        this.a = uy0Var;
        this.b = psmVar;
    }

    public final void a() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.d;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, lni0.a));
    }

    public final bz3 b() {
        return (bz3) this.e.getValue();
    }

    public final boolean c() {
        return this.d.getValue() == lni0.b;
    }

    public final void d(bz3 bz3Var) {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.f;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, bz3Var));
    }
}
