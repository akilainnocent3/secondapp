package nk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f117386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f117387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f117388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f117389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f117390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f117391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f117392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f117393h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f117394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f117395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f117396c;

        public a(boolean z10, boolean z11, boolean z12) {
            this.f117394a = z10;
            this.f117395b = z11;
            this.f117396c = z12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f117397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f117398b;

        public b(int i10, int i11) {
            this.f117397a = i10;
            this.f117398b = i11;
        }
    }

    public d(long j10, b bVar, a aVar, int i10, int i11, double d10, double d11, int i12) {
        this.f117388c = j10;
        this.f117386a = bVar;
        this.f117387b = aVar;
        this.f117389d = i10;
        this.f117390e = i11;
        this.f117391f = d10;
        this.f117392g = d11;
        this.f117393h = i12;
    }

    public boolean a(long j10) {
        return this.f117388c < j10;
    }
}
