package sg.bigo.ads.api.core;

/* JADX INFO: loaded from: classes7.dex */
public final class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f132828d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f132825a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f132826b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f132827c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f132829e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f132830f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f132831g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f132832h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f132833i = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f132835k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f132836l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f132837m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f132838n = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f132834j = false;

    public t(int i10) {
        this.f132828d = i10;
    }

    public final void a(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i10 == 1) {
            if (this.f132835k <= 0) {
                this.f132835k = jCurrentTimeMillis;
            }
        } else if (i10 == 2) {
            if (this.f132836l <= 0) {
                this.f132836l = jCurrentTimeMillis;
            }
        } else {
            if (i10 != 3) {
                return;
            }
            if (this.f132837m <= 0) {
                this.f132837m = jCurrentTimeMillis;
            }
            if (this.f132838n <= 0) {
                this.f132838n = jCurrentTimeMillis;
            }
        }
    }

    public final void b(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i10 == 1) {
            if (this.f132826b <= 0) {
                long j10 = this.f132835k;
                if (j10 > 0) {
                    this.f132826b = jCurrentTimeMillis - j10;
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 2) {
            this.f132834j = true;
            if (this.f132827c <= 0) {
                long j11 = this.f132836l;
                if (j11 > 0) {
                    this.f132827c = jCurrentTimeMillis - j11;
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            if (this.f132829e <= 0) {
                long j12 = this.f132837m;
                if (j12 > 0) {
                    this.f132829e = jCurrentTimeMillis - j12;
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4 && this.f132830f <= 0) {
            long j13 = this.f132838n;
            if (j13 > 0) {
                this.f132830f = jCurrentTimeMillis - j13;
            }
        }
    }

    public final void a(String str, String str2, boolean z10) {
        this.f132831g = str;
        this.f132833i = str2;
        this.f132832h = z10;
    }
}
