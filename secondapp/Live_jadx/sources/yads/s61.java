package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class s61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nt1 f155275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l00 f155276b;

    public s61(nt1 nt1Var, l00 l00Var) {
        this.f155275a = nt1Var;
        this.f155276b = l00Var;
    }

    public final void a() {
        nt1 nt1Var = this.f155275a;
        nt1Var.f153147a.f153606a.execute(new Runnable() { // from class: yads.oa4
            @Override // java.lang.Runnable
            public final void run() {
                s61.a(this.f153421b);
            }
        });
    }

    public static final void a(s61 s61Var) {
        s61Var.f155276b.onInitializationCompleted();
    }
}
