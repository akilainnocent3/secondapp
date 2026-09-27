package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class s32 implements r31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f155250a;

    public s32(v9 v9Var) {
        this.f155250a = kotlin.jvm.internal.m0.g(v9Var.b(), r32.f154733c.a()) || kotlin.jvm.internal.m0.g(v9Var.b(), r32.f154734d.a());
    }

    @Override // yads.r31
    public final boolean a() {
        return this.f155250a;
    }
}
