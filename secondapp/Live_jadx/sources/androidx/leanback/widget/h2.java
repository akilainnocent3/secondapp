package androidx.leanback.widget;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class h2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12603d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12604e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f12605f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f12607b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12606a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12608c = -1;

    public h2(long j10, r0 r0Var) {
        g(j10);
        f(r0Var);
    }

    public final int a() {
        return this.f12606a;
    }

    public final r0 b() {
        return this.f12607b;
    }

    public final long c() {
        if ((this.f12606a & 1) != 1) {
            return this.f12608c;
        }
        r0 r0VarB = b();
        if (r0VarB != null) {
            return r0VarB.c();
        }
        return -1L;
    }

    public boolean d() {
        return true;
    }

    public final void e(int i10, int i11) {
        this.f12606a = (i10 & i11) | (this.f12606a & (~i11));
    }

    public final void f(r0 r0Var) {
        this.f12607b = r0Var;
    }

    public final void g(long j10) {
        this.f12608c = j10;
        e(0, 1);
    }

    public h2(r0 r0Var) {
        f(r0Var);
    }

    public h2() {
    }
}
