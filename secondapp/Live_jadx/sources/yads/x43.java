package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class x43 extends ua0 implements r43 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r43 f157677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f157678e;

    @Override // yads.r43
    public final long a(int i10) {
        r43 r43Var = this.f157677d;
        r43Var.getClass();
        return r43Var.a(i10) + this.f157678e;
    }

    @Override // yads.r43
    public final List b(long j10) {
        r43 r43Var = this.f157677d;
        r43Var.getClass();
        return r43Var.b(j10 - this.f157678e);
    }

    @Override // yads.r43
    public final int a() {
        r43 r43Var = this.f157677d;
        r43Var.getClass();
        return r43Var.a();
    }

    @Override // yads.r43
    public final int a(long j10) {
        r43 r43Var = this.f157677d;
        r43Var.getClass();
        return r43Var.a(j10 - this.f157678e);
    }
}
