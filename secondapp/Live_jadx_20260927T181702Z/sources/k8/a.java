package k8;

import android.net.Uri;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final j8.p f102085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f102086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final Uri f102087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final Uri f102088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public final List<j8.h> f102089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.m
    public final Instant f102090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.m
    public final Instant f102091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.m
    public final j8.n f102092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.m
    public final r0 f102093i;

    /* JADX INFO: renamed from: k8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nCustomAudience.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAudience.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudience$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"})
    public static final class C0964a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public j8.p f102094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public String f102095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public Uri f102096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        public Uri f102097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oy.l
        public List<j8.h> f102098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @oy.m
        public Instant f102099f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @oy.m
        public Instant f102100g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @oy.m
        public j8.n f102101h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @oy.m
        public r0 f102102i;

        public C0964a(@oy.l j8.p buyer, @oy.l String name, @oy.l Uri dailyUpdateUri, @oy.l Uri biddingLogicUri, @oy.l List<j8.h> ads) {
            kotlin.jvm.internal.m0.p(buyer, "buyer");
            kotlin.jvm.internal.m0.p(name, "name");
            kotlin.jvm.internal.m0.p(dailyUpdateUri, "dailyUpdateUri");
            kotlin.jvm.internal.m0.p(biddingLogicUri, "biddingLogicUri");
            kotlin.jvm.internal.m0.p(ads, "ads");
            this.f102094a = buyer;
            this.f102095b = name;
            this.f102096c = dailyUpdateUri;
            this.f102097d = biddingLogicUri;
            this.f102098e = ads;
        }

        @oy.l
        public final a a() {
            return new a(this.f102094a, this.f102095b, this.f102096c, this.f102097d, this.f102098e, this.f102099f, this.f102100g, this.f102101h, this.f102102i);
        }

        @oy.l
        public final C0964a b(@oy.l Instant activationTime) {
            kotlin.jvm.internal.m0.p(activationTime, "activationTime");
            this.f102099f = activationTime;
            return this;
        }

        @oy.l
        public final C0964a c(@oy.l List<j8.h> ads) {
            kotlin.jvm.internal.m0.p(ads, "ads");
            this.f102098e = ads;
            return this;
        }

        @oy.l
        public final C0964a d(@oy.l Uri biddingLogicUri) {
            kotlin.jvm.internal.m0.p(biddingLogicUri, "biddingLogicUri");
            this.f102097d = biddingLogicUri;
            return this;
        }

        @oy.l
        public final C0964a e(@oy.l j8.p buyer) {
            kotlin.jvm.internal.m0.p(buyer, "buyer");
            this.f102094a = buyer;
            return this;
        }

        @oy.l
        public final C0964a f(@oy.l Uri dailyUpdateUri) {
            kotlin.jvm.internal.m0.p(dailyUpdateUri, "dailyUpdateUri");
            this.f102096c = dailyUpdateUri;
            return this;
        }

        @oy.l
        public final C0964a g(@oy.l Instant expirationTime) {
            kotlin.jvm.internal.m0.p(expirationTime, "expirationTime");
            this.f102100g = expirationTime;
            return this;
        }

        @oy.l
        public final C0964a h(@oy.l String name) {
            kotlin.jvm.internal.m0.p(name, "name");
            this.f102095b = name;
            return this;
        }

        @oy.l
        public final C0964a i(@oy.l r0 trustedBiddingSignals) {
            kotlin.jvm.internal.m0.p(trustedBiddingSignals, "trustedBiddingSignals");
            this.f102102i = trustedBiddingSignals;
            return this;
        }

        @oy.l
        public final C0964a j(@oy.l j8.n userBiddingSignals) {
            kotlin.jvm.internal.m0.p(userBiddingSignals, "userBiddingSignals");
            this.f102101h = userBiddingSignals;
            return this;
        }
    }

    public a(@oy.l j8.p buyer, @oy.l String name, @oy.l Uri dailyUpdateUri, @oy.l Uri biddingLogicUri, @oy.l List<j8.h> ads, @oy.m Instant instant, @oy.m Instant instant2, @oy.m j8.n nVar, @oy.m r0 r0Var) {
        kotlin.jvm.internal.m0.p(buyer, "buyer");
        kotlin.jvm.internal.m0.p(name, "name");
        kotlin.jvm.internal.m0.p(dailyUpdateUri, "dailyUpdateUri");
        kotlin.jvm.internal.m0.p(biddingLogicUri, "biddingLogicUri");
        kotlin.jvm.internal.m0.p(ads, "ads");
        this.f102085a = buyer;
        this.f102086b = name;
        this.f102087c = dailyUpdateUri;
        this.f102088d = biddingLogicUri;
        this.f102089e = ads;
        this.f102090f = instant;
        this.f102091g = instant2;
        this.f102092h = nVar;
        this.f102093i = r0Var;
    }

    @oy.m
    public final Instant a() {
        return this.f102090f;
    }

    @oy.l
    public final List<j8.h> b() {
        return this.f102089e;
    }

    @oy.l
    public final Uri c() {
        return this.f102088d;
    }

    @oy.l
    public final j8.p d() {
        return this.f102085a;
    }

    @oy.l
    public final Uri e() {
        return this.f102087c;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m0.g(this.f102085a, aVar.f102085a) && kotlin.jvm.internal.m0.g(this.f102086b, aVar.f102086b) && kotlin.jvm.internal.m0.g(this.f102090f, aVar.f102090f) && kotlin.jvm.internal.m0.g(this.f102091g, aVar.f102091g) && kotlin.jvm.internal.m0.g(this.f102087c, aVar.f102087c) && kotlin.jvm.internal.m0.g(this.f102092h, aVar.f102092h) && kotlin.jvm.internal.m0.g(this.f102093i, aVar.f102093i) && kotlin.jvm.internal.m0.g(this.f102089e, aVar.f102089e);
    }

    @oy.m
    public final Instant f() {
        return this.f102091g;
    }

    @oy.l
    public final String g() {
        return this.f102086b;
    }

    @oy.m
    public final r0 h() {
        return this.f102093i;
    }

    public int hashCode() {
        int iHashCode = ((this.f102085a.hashCode() * 31) + this.f102086b.hashCode()) * 31;
        Instant instant = this.f102090f;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 31;
        Instant instant2 = this.f102091g;
        int iHashCode3 = (((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.f102087c.hashCode()) * 31;
        j8.n nVar = this.f102092h;
        int iHashCode4 = (iHashCode3 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        r0 r0Var = this.f102093i;
        return ((((iHashCode4 + (r0Var != null ? r0Var.hashCode() : 0)) * 31) + this.f102088d.hashCode()) * 31) + this.f102089e.hashCode();
    }

    @oy.m
    public final j8.n i() {
        return this.f102092h;
    }

    @oy.l
    public String toString() {
        return "CustomAudience: buyer=" + this.f102088d + ", name=" + this.f102086b + ", activationTime=" + this.f102090f + ", expirationTime=" + this.f102091g + ", dailyUpdateUri=" + this.f102087c + ", userBiddingSignals=" + this.f102092h + ", trustedBiddingSignals=" + this.f102093i + ", biddingLogicUri=" + this.f102088d + ", ads=" + this.f102089e;
    }

    public /* synthetic */ a(j8.p pVar, String str, Uri uri, Uri uri2, List list, Instant instant, Instant instant2, j8.n nVar, r0 r0Var, int i10, kotlin.jvm.internal.x xVar) {
        this(pVar, str, uri, uri2, list, (i10 & 32) != 0 ? null : instant, (i10 & 64) != 0 ? null : instant2, (i10 & 128) != 0 ? null : nVar, (i10 & 256) != 0 ? null : r0Var);
    }
}
