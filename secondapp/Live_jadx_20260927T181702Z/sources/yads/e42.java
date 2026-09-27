package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class e42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cj f148497a;

    public e42(cj cjVar) {
        this.f148497a = cjVar;
    }

    public final d42 a() {
        o72 o72Var;
        Object obj = this.f148497a.f147740a.get("media");
        d62 d62Var = null;
        on1 on1Var = obj instanceof on1 ? (on1) obj : null;
        if (on1Var != null) {
            d62 d62Var2 = on1Var.f153569b != null ? new d62() : null;
            o72Var = on1Var.f153568a != null ? new o72() : null;
            d62Var = d62Var2;
        } else {
            o72Var = null;
        }
        return new d42(d62Var, o72Var);
    }
}
