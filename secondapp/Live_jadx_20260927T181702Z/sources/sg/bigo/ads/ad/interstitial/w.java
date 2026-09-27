package sg.bigo.ads.ad.interstitial;

/* JADX INFO: loaded from: classes7.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f132401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f132402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f132403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f132404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f132405e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f132410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f132411k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f132412l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f132414n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f132415o;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f132406f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f132407g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f132408h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f132409i = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f132413m = 0;

    public static int a(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 3;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 10;
        }
        return 5;
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 != 1) {
            return i10 != 3 ? 5 : 10;
        }
        return 3;
    }
}
