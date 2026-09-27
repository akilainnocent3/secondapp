package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class h4 extends im3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f149919d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m4 f149920c;

    public h4(m4 m4Var, e82 e82Var) {
        super(e82Var);
        this.f149920c = m4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.m0.g(h4.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m0.n(obj, "null cannot be cast to non-null type com.monetization.ads.base.AdFetchError");
        return this.f149920c == ((h4) obj).f149920c;
    }

    public final int hashCode() {
        return this.f149920c.hashCode();
    }
}
