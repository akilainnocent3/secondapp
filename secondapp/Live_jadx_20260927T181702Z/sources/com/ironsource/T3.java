package com.ironsource;

import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class T3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final Zd f60095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private final H9 f60096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    private final U2 f60097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    private final Qb f60098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.m
    private final A1 f60099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.m
    private final Of f60100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.m
    private final com.ironsource.mediationsdk.adquality.a f60101g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.m
        private Zd f60102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.m
        private H9 f60103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.m
        private U2 f60104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.m
        private Qb f60105d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oy.m
        private A1 f60106e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @oy.m
        private Of f60107f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @oy.m
        private com.ironsource.mediationsdk.adquality.a f60108g;

        public a() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        @oy.l
        public final a a(@oy.m Zd zd2, @oy.m H9 h10, @oy.m U2 u10, @oy.m Qb qb2, @oy.m A1 a10, @oy.m Of of2, @oy.m com.ironsource.mediationsdk.adquality.a aVar) {
            return new a(zd2, h10, u10, qb2, a10, of2, aVar);
        }

        @oy.m
        public final Zd b() {
            return this.f60102a;
        }

        @oy.m
        public final H9 c() {
            return this.f60103b;
        }

        @oy.m
        public final U2 d() {
            return this.f60104c;
        }

        @oy.m
        public final Qb e() {
            return this.f60105d;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.m0.g(this.f60102a, aVar.f60102a) && kotlin.jvm.internal.m0.g(this.f60103b, aVar.f60103b) && kotlin.jvm.internal.m0.g(this.f60104c, aVar.f60104c) && kotlin.jvm.internal.m0.g(this.f60105d, aVar.f60105d) && kotlin.jvm.internal.m0.g(this.f60106e, aVar.f60106e) && kotlin.jvm.internal.m0.g(this.f60107f, aVar.f60107f) && kotlin.jvm.internal.m0.g(this.f60108g, aVar.f60108g);
        }

        @oy.m
        public final A1 f() {
            return this.f60106e;
        }

        @oy.m
        public final Of g() {
            return this.f60107f;
        }

        @oy.m
        public final com.ironsource.mediationsdk.adquality.a h() {
            return this.f60108g;
        }

        public int hashCode() {
            Zd zd2 = this.f60102a;
            int iHashCode = (zd2 == null ? 0 : zd2.hashCode()) * 31;
            H9 h10 = this.f60103b;
            int iHashCode2 = (iHashCode + (h10 == null ? 0 : h10.hashCode())) * 31;
            U2 u10 = this.f60104c;
            int iHashCode3 = (iHashCode2 + (u10 == null ? 0 : u10.hashCode())) * 31;
            Qb qb2 = this.f60105d;
            int iHashCode4 = (iHashCode3 + (qb2 == null ? 0 : qb2.hashCode())) * 31;
            A1 a10 = this.f60106e;
            int iHashCode5 = (iHashCode4 + (a10 == null ? 0 : a10.hashCode())) * 31;
            Of of2 = this.f60107f;
            int iHashCode6 = (iHashCode5 + (of2 == null ? 0 : of2.hashCode())) * 31;
            com.ironsource.mediationsdk.adquality.a aVar = this.f60108g;
            return iHashCode6 + (aVar != null ? aVar.hashCode() : 0);
        }

        @oy.m
        public final com.ironsource.mediationsdk.adquality.a i() {
            return this.f60108g;
        }

        @oy.m
        public final A1 j() {
            return this.f60106e;
        }

        @oy.m
        public final U2 k() {
            return this.f60104c;
        }

        @oy.m
        public final H9 l() {
            return this.f60103b;
        }

        @oy.m
        public final Qb m() {
            return this.f60105d;
        }

        @oy.m
        public final Zd n() {
            return this.f60102a;
        }

        @oy.m
        public final Of o() {
            return this.f60107f;
        }

        @oy.l
        public String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.f60102a + ", interstitialConfigurations=" + this.f60103b + ", bannerConfigurations=" + this.f60104c + ", nativeAdConfigurations=" + this.f60105d + ", applicationConfigurations=" + this.f60106e + ", testSuiteSettings=" + this.f60107f + ", adQualityConfigurations=" + this.f60108g + gi.j.f86771d;
        }

        public a(@oy.m Zd zd2, @oy.m H9 h10, @oy.m U2 u10, @oy.m Qb qb2, @oy.m A1 a10, @oy.m Of of2, @oy.m com.ironsource.mediationsdk.adquality.a aVar) {
            this.f60102a = zd2;
            this.f60103b = h10;
            this.f60104c = u10;
            this.f60105d = qb2;
            this.f60106e = a10;
            this.f60107f = of2;
            this.f60108g = aVar;
        }

        public static /* synthetic */ a a(a aVar, Zd zd2, H9 h10, U2 u10, Qb qb2, A1 a10, Of of2, com.ironsource.mediationsdk.adquality.a aVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                zd2 = aVar.f60102a;
            }
            if ((i10 & 2) != 0) {
                h10 = aVar.f60103b;
            }
            if ((i10 & 4) != 0) {
                u10 = aVar.f60104c;
            }
            if ((i10 & 8) != 0) {
                qb2 = aVar.f60105d;
            }
            if ((i10 & 16) != 0) {
                a10 = aVar.f60106e;
            }
            if ((i10 & 32) != 0) {
                of2 = aVar.f60107f;
            }
            if ((i10 & 64) != 0) {
                aVar2 = aVar.f60108g;
            }
            Of of3 = of2;
            com.ironsource.mediationsdk.adquality.a aVar3 = aVar2;
            A1 a11 = a10;
            U2 u11 = u10;
            return aVar.a(zd2, h10, u11, qb2, a11, of3, aVar3);
        }

        public final void b(@oy.m Zd zd2) {
            this.f60102a = zd2;
        }

        public final void a(@oy.m Of of2) {
            this.f60107f = of2;
        }

        public final void b(@oy.m H9 h10) {
            this.f60103b = h10;
        }

        @oy.l
        public final a a(@oy.m Zd zd2) {
            this.f60102a = zd2;
            return this;
        }

        public final void b(@oy.m U2 u10) {
            this.f60104c = u10;
        }

        @oy.l
        public final a a(@oy.m H9 h10) {
            this.f60103b = h10;
            return this;
        }

        public final void b(@oy.m Qb qb2) {
            this.f60105d = qb2;
        }

        @oy.l
        public final a a(@oy.m U2 u10) {
            this.f60104c = u10;
            return this;
        }

        public final void b(@oy.m A1 a10) {
            this.f60106e = a10;
        }

        @oy.l
        public final a a(@oy.m Qb qb2) {
            this.f60105d = qb2;
            return this;
        }

        public final void b(@oy.m com.ironsource.mediationsdk.adquality.a aVar) {
            this.f60108g = aVar;
        }

        @oy.l
        public final a a(@oy.m A1 a10) {
            this.f60106e = a10;
            return this;
        }

        @oy.l
        public final a b(@oy.m Of of2) {
            this.f60107f = of2;
            return this;
        }

        @oy.l
        public final a a(@oy.m com.ironsource.mediationsdk.adquality.a aVar) {
            this.f60108g = aVar;
            return this;
        }

        public /* synthetic */ a(Zd zd2, H9 h10, U2 u10, Qb qb2, A1 a10, Of of2, com.ironsource.mediationsdk.adquality.a aVar, int i10, kotlin.jvm.internal.x xVar) {
            this((i10 & 1) != 0 ? null : zd2, (i10 & 2) != 0 ? null : h10, (i10 & 4) != 0 ? null : u10, (i10 & 8) != 0 ? null : qb2, (i10 & 16) != 0 ? null : a10, (i10 & 32) != 0 ? null : of2, (i10 & 64) != 0 ? null : aVar);
        }

        @oy.l
        public final T3 a() {
            return new T3(this.f60102a, this.f60103b, this.f60104c, this.f60105d, this.f60106e, this.f60107f, this.f60108g, null);
        }
    }

    public /* synthetic */ T3(Zd zd2, H9 h10, U2 u10, Qb qb2, A1 a10, Of of2, com.ironsource.mediationsdk.adquality.a aVar, kotlin.jvm.internal.x xVar) {
        this(zd2, h10, u10, qb2, a10, of2, aVar);
    }

    @oy.m
    public final com.ironsource.mediationsdk.adquality.a a() {
        return this.f60101g;
    }

    @oy.m
    public final A1 b() {
        return this.f60099e;
    }

    @oy.m
    public final U2 c() {
        return this.f60097c;
    }

    @oy.m
    public final H9 d() {
        return this.f60096b;
    }

    @oy.m
    public final Qb e() {
        return this.f60098d;
    }

    @oy.m
    public final Zd f() {
        return this.f60095a;
    }

    @oy.m
    public final Of g() {
        return this.f60100f;
    }

    @oy.l
    public String toString() {
        return "configurations(\n" + this.f60095a + IOUtils.LINE_SEPARATOR_UNIX + this.f60096b + IOUtils.LINE_SEPARATOR_UNIX + this.f60097c + IOUtils.LINE_SEPARATOR_UNIX + this.f60098d + gi.j.f86771d;
    }

    private T3(Zd zd2, H9 h10, U2 u10, Qb qb2, A1 a10, Of of2, com.ironsource.mediationsdk.adquality.a aVar) {
        this.f60095a = zd2;
        this.f60096b = h10;
        this.f60097c = u10;
        this.f60098d = qb2;
        this.f60099e = a10;
        this.f60100f = of2;
        this.f60101g = aVar;
    }
}
