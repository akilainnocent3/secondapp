package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class z33 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m73 f158588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pq0 f158589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p92 f158590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f158591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f158592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f158593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f158594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f158595i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f158597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f158598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f158599m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n92 f158587a = new n92();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x33 f158596j = new x33();

    public abstract long a(jb2 jb2Var);

    public void a(long j10) {
        this.f158593g = j10;
    }

    public abstract boolean a(jb2 jb2Var, long j10, x33 x33Var);

    public void a(boolean z10) {
        if (z10) {
            this.f158596j = new x33();
            this.f158592f = 0L;
            this.f158594h = 0;
        } else {
            this.f158594h = 1;
        }
        this.f158591e = -1L;
        this.f158593g = 0L;
    }
}
