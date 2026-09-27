package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.y1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4601y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f64473a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4601y1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @oy.l
    public final String a() {
        return this.f64473a;
    }

    @oy.l
    public final String b() {
        return this.f64473a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4601y1) && kotlin.jvm.internal.m0.g(this.f64473a, ((C4601y1) obj).f64473a);
    }

    public int hashCode() {
        return this.f64473a.hashCode();
    }

    @oy.l
    public String toString() {
        return "ApplicationAuctionSettings(auctionData=" + this.f64473a + gi.j.f86771d;
    }

    public C4601y1(@oy.l String auctionData) {
        kotlin.jvm.internal.m0.p(auctionData, "auctionData");
        this.f64473a = auctionData;
    }

    @oy.l
    public final C4601y1 a(@oy.l String auctionData) {
        kotlin.jvm.internal.m0.p(auctionData, "auctionData");
        return new C4601y1(auctionData);
    }

    public /* synthetic */ C4601y1(String str, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ C4601y1 a(C4601y1 c4601y1, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4601y1.f64473a;
        }
        return c4601y1.a(str);
    }
}
