package yads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class je0 implements zg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f151051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g62 f151052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z30 f151053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f151054d;

    public je0(w5 w5Var, int i10, g62 g62Var, z30 z30Var) {
        this.f151051a = w5Var;
        this.f151052b = g62Var;
        this.f151053c = z30Var;
        this.f151054d = new AtomicInteger(i10);
    }

    @Override // yads.zg3
    public final void a() {
        if (this.f151054d.decrementAndGet() == 0) {
            this.f151051a.a(v5.f156757p);
            this.f151052b.a();
        }
    }

    @Override // yads.zg3
    public final void b() {
        if (this.f151054d.getAndSet(0) > 0) {
            this.f151051a.a(v5.f156757p);
            this.f151053c.a(y30.f158114f);
            this.f151052b.a();
        }
    }

    @Override // yads.zg3
    public final void c() {
    }
}
