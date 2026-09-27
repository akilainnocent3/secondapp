package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class h81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia3 f149970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e81 f149971b = e81.f148567c.a();

    public h81(ia3 ia3Var) {
        this.f149970a = ia3Var;
    }

    public final void a(s00 s00Var) {
        ia3 ia3Var;
        e81 e81Var = this.f149971b;
        synchronized (e81Var.f148569a) {
            ia3Var = (ia3) e81Var.f148570b.get(s00Var);
        }
        if (kotlin.jvm.internal.m0.g(this.f149970a, ia3Var)) {
            return;
        }
        if (ia3Var != null) {
            ia3Var.invalidateAdPlayer();
        }
        this.f149971b.a(s00Var, this.f149970a);
    }
}
