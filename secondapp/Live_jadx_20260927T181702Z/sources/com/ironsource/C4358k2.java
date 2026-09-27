package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.k2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4358k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f62183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private final JSONObject f62184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    private final C4414n2 f62185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f62186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    private final String f62187e;

    public C4358k2(@oy.l String auctionId, @oy.m JSONObject jSONObject, @oy.m C4414n2 c4414n2, int i10, @oy.l String auctionFallback) {
        kotlin.jvm.internal.m0.p(auctionId, "auctionId");
        kotlin.jvm.internal.m0.p(auctionFallback, "auctionFallback");
        this.f62183a = auctionId;
        this.f62184b = jSONObject;
        this.f62185c = c4414n2;
        this.f62186d = i10;
        this.f62187e = auctionFallback;
    }

    @oy.l
    public final String a() {
        return this.f62183a;
    }

    @oy.m
    public final JSONObject b() {
        return this.f62184b;
    }

    @oy.m
    public final C4414n2 c() {
        return this.f62185c;
    }

    public final int d() {
        return this.f62186d;
    }

    @oy.l
    public final String e() {
        return this.f62187e;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4358k2)) {
            return false;
        }
        C4358k2 c4358k2 = (C4358k2) obj;
        return kotlin.jvm.internal.m0.g(this.f62183a, c4358k2.f62183a) && kotlin.jvm.internal.m0.g(this.f62184b, c4358k2.f62184b) && kotlin.jvm.internal.m0.g(this.f62185c, c4358k2.f62185c) && this.f62186d == c4358k2.f62186d && kotlin.jvm.internal.m0.g(this.f62187e, c4358k2.f62187e);
    }

    @oy.l
    public final String f() {
        return this.f62187e;
    }

    @oy.l
    public final String g() {
        return this.f62183a;
    }

    @oy.m
    public final JSONObject h() {
        return this.f62184b;
    }

    public int hashCode() {
        int iHashCode = this.f62183a.hashCode() * 31;
        JSONObject jSONObject = this.f62184b;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C4414n2 c4414n2 = this.f62185c;
        return ((((iHashCode2 + (c4414n2 != null ? c4414n2.hashCode() : 0)) * 31) + this.f62186d) * 31) + this.f62187e.hashCode();
    }

    public final int i() {
        return this.f62186d;
    }

    @oy.m
    public final C4414n2 j() {
        return this.f62185c;
    }

    @oy.l
    public String toString() {
        return "AuctionResponseData(auctionId=" + this.f62183a + ", auctionResponseGenericParam=" + this.f62184b + ", genericNotifications=" + this.f62185c + ", auctionTrial=" + this.f62186d + ", auctionFallback=" + this.f62187e + gi.j.f86771d;
    }

    @oy.l
    public final C4358k2 a(@oy.l String auctionId, @oy.m JSONObject jSONObject, @oy.m C4414n2 c4414n2, int i10, @oy.l String auctionFallback) {
        kotlin.jvm.internal.m0.p(auctionId, "auctionId");
        kotlin.jvm.internal.m0.p(auctionFallback, "auctionFallback");
        return new C4358k2(auctionId, jSONObject, c4414n2, i10, auctionFallback);
    }

    public static /* synthetic */ C4358k2 a(C4358k2 c4358k2, String str, JSONObject jSONObject, C4414n2 c4414n2, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c4358k2.f62183a;
        }
        if ((i11 & 2) != 0) {
            jSONObject = c4358k2.f62184b;
        }
        if ((i11 & 4) != 0) {
            c4414n2 = c4358k2.f62185c;
        }
        if ((i11 & 8) != 0) {
            i10 = c4358k2.f62186d;
        }
        if ((i11 & 16) != 0) {
            str2 = c4358k2.f62187e;
        }
        String str3 = str2;
        C4414n2 c4414n3 = c4414n2;
        return c4358k2.a(str, jSONObject, c4414n3, i10, str3);
    }
}
