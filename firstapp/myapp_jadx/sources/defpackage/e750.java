package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class e750 implements k730 {
    public final m730<vwf0> a;
    public final m730<sph> b;
    public final m730<xu0> c;
    public final m730<aub> d;
    public final k730 e;

    public e750(k730 k730Var, wnn wnnVar, k730 k730Var2, k730 k730Var3, k730 k730Var4) {
        this.a = k730Var;
        this.b = wnnVar;
        this.c = k730Var2;
        this.d = k730Var3;
        this.e = k730Var4;
    }

    @Override // defpackage.m730
    public final Object get() {
        return new a750(this.a.get(), this.b.get(), this.c.get(), this.d.get(), (fj80) this.e.get());
    }
}
