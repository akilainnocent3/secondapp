package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zd0 implements sf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ib0 f158765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f158766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f158767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f158768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f158769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f158770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f158771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f158772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f158773i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f158774j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f158775k;

    public zd0() {
        this(new ib0(), 50000, 50000, 2500, 5000, -1, false);
    }

    public static void a(int i10, int i11, String str, String str2) {
        ni.a(str + " cannot be less than " + str2, i10 >= i11);
    }

    public final boolean b() {
        return this.f158773i;
    }

    public zd0(ib0 ib0Var, int i10, int i11, int i12, int i13, int i14, boolean z10) {
        a(i12, 0, "bufferForPlaybackMs", "0");
        a(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        a(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i11, i10, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f158765a = ib0Var;
        this.f158766b = ib3.a(i10);
        this.f158767c = ib3.a(i11);
        this.f158768d = ib3.a(i12);
        this.f158769e = ib3.a(i13);
        this.f158770f = i14;
        this.f158774j = i14 == -1 ? 13107200 : i14;
        this.f158771g = z10;
        this.f158772h = ib3.a(0);
        this.f158773i = false;
    }

    public final long a() {
        return this.f158772h;
    }

    public final void a(boolean z10) {
        int i10 = this.f158770f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f158774j = i10;
        this.f158775k = false;
        if (z10) {
            ib0 ib0Var = this.f158765a;
            synchronized (ib0Var) {
                if (ib0Var.f150504a) {
                    ib0Var.a(0);
                }
            }
        }
    }
}
