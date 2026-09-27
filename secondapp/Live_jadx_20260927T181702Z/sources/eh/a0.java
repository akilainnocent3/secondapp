package eh;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a0 f80892g = new a0(-1, -1, -1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f80895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f80896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f80897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f80898f;

    public a0(int i10, int i11, int i12, int i13, int i14) {
        this.f80893a = i10;
        this.f80894b = i11;
        this.f80895c = i12;
        this.f80896d = i13;
        this.f80897e = i14;
    }

    public int a() {
        a.i(!this.f80898f);
        return this.f80894b;
    }

    public int b() {
        a.i(!this.f80898f);
        return this.f80897e;
    }

    public int c() {
        a.i(!this.f80898f);
        return this.f80895c;
    }

    public int d() {
        a.i(!this.f80898f);
        return this.f80893a;
    }

    public int e() {
        a.i(!this.f80898f);
        return this.f80896d;
    }

    public void f() throws b0.b {
        this.f80898f = true;
        int i10 = this.f80893a;
        if (i10 != -1) {
            b0.x(i10);
        }
        int i11 = this.f80894b;
        if (i11 != -1) {
            b0.v(i11);
        }
        int i12 = this.f80895c;
        if (i12 != -1) {
            b0.w(i12);
        }
    }
}
