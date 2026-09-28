package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class atn {
    public final uy0 a;
    public final psm b;
    public final k5b c;
    public final wwd0 d = xwd0.a(null);
    public final wwd0 e = xwd0.a(lni0.a);

    public atn(uy0 uy0Var, psm psmVar, k5b k5bVar) {
        this.a = uy0Var;
        this.b = psmVar;
        this.c = k5bVar;
    }

    public final void a() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.e;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, lni0.a));
    }

    public final boolean b() {
        return this.e.getValue() == lni0.b;
    }
}
