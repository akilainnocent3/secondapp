package dc;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f78814a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f78815b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f78816c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f78817d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f78818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f78819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f78820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final tb.h<r> f78821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f78822i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends r {
        @Override // dc.r
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // dc.r
        public float b(int i10, int i11, int i12, int i13) {
            int iMin = Math.min(i11 / i13, i10 / i12);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends r {
        @Override // dc.r
        public g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        @Override // dc.r
        public float b(int i10, int i11, int i12, int i13) {
            int iCeil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends r {
        @Override // dc.r
        public g a(int i10, int i11, int i12, int i13) {
            return b(i10, i11, i12, i13) == 1.0f ? g.QUALITY : r.f78816c.a(i10, i11, i12, i13);
        }

        @Override // dc.r
        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, r.f78816c.b(i10, i11, i12, i13));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends r {
        @Override // dc.r
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // dc.r
        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e extends r {
        @Override // dc.r
        public g a(int i10, int i11, int i12, int i13) {
            return r.f78822i ? g.QUALITY : g.MEMORY;
        }

        @Override // dc.r
        public float b(int i10, int i11, int i12, int i13) {
            if (r.f78822i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            int iMax = Math.max(i11 / i13, i10 / i12);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class f extends r {
        @Override // dc.r
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // dc.r
        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f78818e = dVar;
        f78819f = new f();
        f78820g = dVar;
        f78821h = tb.h.g("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f78822i = true;
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
