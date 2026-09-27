package com.cleveradssolutions.adapters.exchange.rendering.models.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.cleveradssolutions.adapters.exchange.rendering.models.ntv.a f42232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f42236e = Long.MIN_VALUE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42237a;

        static {
            int[] iArr = new int[com.cleveradssolutions.adapters.exchange.rendering.models.ntv.a.values().length];
            f42237a = iArr;
            try {
                iArr[com.cleveradssolutions.adapters.exchange.rendering.models.ntv.a.IMPRESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42237a[com.cleveradssolutions.adapters.exchange.rendering.models.ntv.a.OMID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42237a[com.cleveradssolutions.adapters.exchange.rendering.models.ntv.a.VIEWABLE_MRC50.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42237a[com.cleveradssolutions.adapters.exchange.rendering.models.ntv.a.VIEWABLE_MRC100.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42237a[com.cleveradssolutions.adapters.exchange.rendering.models.ntv.a.VIEWABLE_VIDEO50.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public e(com.cleveradssolutions.adapters.exchange.rendering.models.ntv.a aVar) {
        this.f42232a = aVar;
        this.f42233b = g(aVar);
        this.f42234c = b(aVar);
    }

    public static int b(com.cleveradssolutions.adapters.exchange.rendering.models.ntv.a aVar) {
        int i10 = a.f42237a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 50;
        }
        if (i10 != 4) {
            return i10 != 5 ? 0 : 50;
        }
        return 100;
    }

    public static int g(com.cleveradssolutions.adapters.exchange.rendering.models.ntv.a aVar) {
        int i10 = a.f42237a[aVar.ordinal()];
        if (i10 == 3 || i10 == 4) {
            return 1000;
        }
        return i10 != 5 ? 0 : 2000;
    }

    public int a() {
        return this.f42234c;
    }

    public int c() {
        return this.f42233b;
    }

    public boolean d(com.cleveradssolutions.adapters.exchange.rendering.models.ntv.a aVar) {
        return this.f42232a.equals(aVar);
    }

    public long e() {
        return this.f42236e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f42233b == eVar.f42233b && this.f42234c == eVar.f42234c && this.f42235d == eVar.f42235d && this.f42236e == eVar.f42236e && this.f42232a == eVar.f42232a) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f42235d;
    }

    public com.cleveradssolutions.adapters.exchange.rendering.models.ntv.a h() {
        return this.f42232a;
    }

    public int hashCode() {
        com.cleveradssolutions.adapters.exchange.rendering.models.ntv.a aVar = this.f42232a;
        int iHashCode = (((((((aVar != null ? aVar.hashCode() : 0) * 31) + this.f42233b) * 31) + this.f42234c) * 31) + (this.f42235d ? 1 : 0)) * 31;
        long j10 = this.f42236e;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public void i(long j10) {
        this.f42236e = j10;
    }

    public void j(boolean z10) {
        this.f42235d = z10;
    }
}
