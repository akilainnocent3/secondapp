package yads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ra1 implements af3, ba1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final af3 f154841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f154842b = new AtomicInteger(2);

    public ra1(af3 af3Var) {
        this.f154841a = af3Var;
    }

    @Override // yads.af3
    public final void a(je3 je3Var, jf3 jf3Var) {
        this.f154841a.a(je3Var, jf3Var);
    }

    @Override // yads.af3
    public final void b(je3 je3Var) {
        this.f154841a.b(je3Var);
    }

    @Override // yads.af3
    public final void c(je3 je3Var) {
        this.f154841a.c(je3Var);
    }

    @Override // yads.af3
    public final void d(je3 je3Var) {
        this.f154841a.d(je3Var);
    }

    @Override // yads.af3
    public final void e(je3 je3Var) {
        this.f154841a.e(je3Var);
    }

    @Override // yads.af3
    public final void f(je3 je3Var) {
        this.f154841a.f(je3Var);
    }

    @Override // yads.af3
    public final void g(je3 je3Var) {
        this.f154841a.g(je3Var);
    }

    @Override // yads.af3
    public final void h(je3 je3Var) {
        this.f154841a.h(je3Var);
    }

    @Override // yads.af3
    public final void i(je3 je3Var) {
        this.f154841a.i(je3Var);
    }

    @Override // yads.af3
    public final void j(je3 je3Var) {
        l(je3Var);
    }

    @Override // yads.af3
    public final void k(je3 je3Var) {
        this.f154841a.k(je3Var);
    }

    public final void l(je3 je3Var) {
        if (this.f154842b.decrementAndGet() == 0) {
            this.f154841a.j(je3Var);
        }
    }

    @Override // yads.af3
    public final void a(je3 je3Var) {
        this.f154841a.a(je3Var);
    }

    @Override // yads.af3
    public final void a(je3 je3Var, float f10) {
        this.f154841a.a(je3Var, f10);
    }
}
