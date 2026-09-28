package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class s7k0 extends jma<Void> {
    public final ekv k;

    public s7k0(ekv ekvVar) {
        this.k = ekvVar;
    }

    public abstract void A(qxf0 qxf0Var);

    public final void B() {
        y(null, this.k);
    }

    public void C() {
        B();
    }

    @Override // defpackage.ekv
    public final njv e() {
        return this.k.e();
    }

    @Override // defpackage.ekv
    public void g(njv njvVar) {
        this.k.g(njvVar);
    }

    @Override // defpackage.ekv
    public final boolean m() {
        return this.k.m();
    }

    @Override // defpackage.ekv
    public final qxf0 n() {
        return this.k.n();
    }

    @Override // defpackage.h32
    public final void r(mrg0 mrg0Var) {
        this.j = mrg0Var;
        this.i = jrh0.p(null);
        C();
    }

    @Override // defpackage.jma
    public final ekv.b u(Void r1, ekv.b bVar) {
        return z(bVar);
    }

    @Override // defpackage.jma
    public final long v(Object obj, long j) {
        return j;
    }

    @Override // defpackage.jma
    public final int w(int i, Object obj) {
        return i;
    }

    @Override // defpackage.jma
    public final void x(Object obj, h32 h32Var, qxf0 qxf0Var) {
        A(qxf0Var);
    }

    public ekv.b z(ekv.b bVar) {
        return bVar;
    }
}
