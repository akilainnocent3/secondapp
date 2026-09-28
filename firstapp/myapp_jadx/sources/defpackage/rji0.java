package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rji0 implements lji0 {
    public final jji0 a;
    public final wwd0 b = xwd0.a(null);
    public final wwd0 c;
    public final wwd0 d;
    public final wwd0 e;

    public rji0(jji0 jji0Var) {
        this.a = jji0Var;
        Boolean bool = Boolean.FALSE;
        this.c = xwd0.a(bool);
        this.d = xwd0.a(null);
        this.e = xwd0.a(bool);
    }

    @Override // defpackage.lji0
    public final void a(et7 et7Var) {
        kzh.d(new g1i(new n1i(new g1i(new mji0(this.d, this), new qji0(this, null)), this.e, new nji0(3, null)), new oji0(this, null)), et7Var);
        ej5.c(et7Var, null, null, new pji0(this, null), 3);
    }

    @Override // defpackage.lji0
    public final wwd0 b() {
        return this.c;
    }

    @Override // defpackage.lji0
    public final wwd0 c() {
        return this.b;
    }

    @Override // defpackage.lji0
    public final void d() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.e;
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.TRUE));
    }

    @Override // defpackage.lji0
    public final void e() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.e;
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.FALSE));
    }
}
