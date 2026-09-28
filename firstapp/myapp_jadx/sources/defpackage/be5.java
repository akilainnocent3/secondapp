package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class be5 {
    public final zqk a;
    public final wwd0 b = xwd0.a(Long.valueOf(System.currentTimeMillis()));
    public final wwd0 c = xwd0.a(m2g.a);
    public final wwd0 d = xwd0.a(null);
    public final wwd0 e = xwd0.a(null);

    public be5(zqk zqkVar) {
        this.a = zqkVar;
    }

    public final void a() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.d;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, null));
    }

    public final void b() {
        wwd0 wwd0Var;
        Object value;
        wwd0 wwd0Var2;
        Object value2;
        wwd0 wwd0Var3;
        Object value3;
        do {
            wwd0Var = this.d;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, null));
        do {
            wwd0Var2 = this.c;
            value2 = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value2, m2g.a));
        do {
            wwd0Var3 = this.b;
            value3 = wwd0Var3.getValue();
            ((Number) value3).longValue();
        } while (!wwd0Var3.g(value3, Long.valueOf(System.currentTimeMillis())));
    }
}
