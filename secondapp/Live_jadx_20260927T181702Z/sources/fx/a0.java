package fx;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a0 extends g1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    public g1 f85555g;

    public a0(@oy.l g1 delegate) {
        kotlin.jvm.internal.m0.p(delegate, "delegate");
        this.f85555g = delegate;
    }

    @Override // fx.g1
    public void a(@oy.l Condition condition) throws InterruptedIOException {
        kotlin.jvm.internal.m0.p(condition, "condition");
        this.f85555g.a(condition);
    }

    @Override // fx.g1
    public void b() {
        this.f85555g.b();
    }

    @Override // fx.g1
    @oy.l
    public g1 c() {
        return this.f85555g.c();
    }

    @Override // fx.g1
    @oy.l
    public g1 d() {
        return this.f85555g.d();
    }

    @Override // fx.g1
    public long f() {
        return this.f85555g.f();
    }

    @Override // fx.g1
    @oy.l
    public g1 g(long j10) {
        return this.f85555g.g(j10);
    }

    @Override // fx.g1
    public boolean h() {
        return this.f85555g.h();
    }

    @Override // fx.g1
    public void j() throws IOException {
        this.f85555g.j();
    }

    @Override // fx.g1
    @oy.l
    public g1 k(long j10, @oy.l TimeUnit unit) {
        kotlin.jvm.internal.m0.p(unit, "unit");
        return this.f85555g.k(j10, unit);
    }

    @Override // fx.g1
    public long l() {
        return this.f85555g.l();
    }

    @Override // fx.g1
    public void m(@oy.l Object monitor) throws InterruptedIOException {
        kotlin.jvm.internal.m0.p(monitor, "monitor");
        this.f85555g.m(monitor);
    }

    @cs.j(name = "delegate")
    @oy.l
    public final g1 n() {
        return this.f85555g;
    }

    @oy.l
    public final a0 o(@oy.l g1 delegate) {
        kotlin.jvm.internal.m0.p(delegate, "delegate");
        this.f85555g = delegate;
        return this;
    }

    public final /* synthetic */ void p(g1 g1Var) {
        kotlin.jvm.internal.m0.p(g1Var, "<set-?>");
        this.f85555g = g1Var;
    }
}
