package ev;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class d implements g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final g0 f81647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f81648c;

    public /* synthetic */ d(g0 g0Var, long j10, kotlin.jvm.internal.x xVar) {
        this(g0Var, j10);
    }

    @Override // ev.g0
    public long a() {
        return h.S(this.f81647b.a(), this.f81648c);
    }

    @Override // ev.g0
    public boolean b() {
        return g0.a.a(this);
    }

    @Override // ev.g0
    public boolean c() {
        return g0.a.b(this);
    }

    public final long d() {
        return this.f81648c;
    }

    @oy.l
    public final g0 e() {
        return this.f81647b;
    }

    @Override // ev.g0
    @oy.l
    public g0 p(long j10) {
        return new d(this.f81647b, h.T(this.f81648c, j10), null);
    }

    @Override // ev.g0
    @oy.l
    public g0 r(long j10) {
        return g0.a.c(this, j10);
    }

    public d(g0 mark, long j10) {
        m0.p(mark, "mark");
        this.f81647b = mark;
        this.f81648c = j10;
    }
}
