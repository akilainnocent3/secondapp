package yads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mc0 extends ko {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lc0 f152402e;

    public mc0(lc0 lc0Var, long j10, long j11) {
        super(j10, j11);
        this.f152402e = lc0Var;
    }

    @Override // yads.yj1
    public final long a() {
        long j10 = this.f151627d;
        if (j10 < this.f151625b || j10 > this.f151626c) {
            throw new NoSuchElementException();
        }
        return this.f152402e.a(j10);
    }

    @Override // yads.yj1
    public final long b() {
        long j10 = this.f151627d;
        if (j10 < this.f151625b || j10 > this.f151626c) {
            throw new NoSuchElementException();
        }
        lc0 lc0Var = this.f152402e;
        return lc0Var.f151933d.a(j10 - lc0Var.f151935f);
    }
}
