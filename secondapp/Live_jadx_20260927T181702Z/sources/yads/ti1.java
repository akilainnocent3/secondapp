package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ti1 extends px0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f155923f = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f155924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f155925e;

    public ti1(s63 s63Var, Object obj, Object obj2) {
        super(s63Var);
        this.f155924d = obj;
        this.f155925e = obj2;
    }

    @Override // yads.px0, yads.s63
    public final int a(Object obj) {
        Object obj2;
        s63 s63Var = this.f154181c;
        if (f155923f.equals(obj) && (obj2 = this.f155925e) != null) {
            obj = obj2;
        }
        return s63Var.a(obj);
    }

    @Override // yads.s63
    public final p63 a(int i10, p63 p63Var, boolean z10) {
        this.f154181c.a(i10, p63Var, z10);
        if (ib3.a(p63Var.f153760c, this.f155925e) && z10) {
            p63Var.f153760c = f155923f;
        }
        return p63Var;
    }

    @Override // yads.px0, yads.s63
    public final Object a(int i10) {
        Object objA = this.f154181c.a(i10);
        return ib3.a(objA, this.f155925e) ? f155923f : objA;
    }

    @Override // yads.px0, yads.s63
    public final r63 a(int i10, r63 r63Var, long j10) {
        this.f154181c.a(i10, r63Var, j10);
        if (ib3.a(r63Var.f154777b, this.f155924d)) {
            r63Var.f154777b = r63.f154773s;
        }
        return r63Var;
    }

    public static ti1 a(fm1 fm1Var) {
        return new ti1(new ui1(fm1Var), r63.f154773s, f155923f);
    }
}
