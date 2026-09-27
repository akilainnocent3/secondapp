package com.ironsource;

import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.o2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4432o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f63197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.ironsource.mediationsdk.d f63198b;

    public C4432o2(@oy.l String serverData) {
        kotlin.jvm.internal.m0.p(serverData, "serverData");
        this.f63197a = serverData;
        this.f63198b = com.ironsource.mediationsdk.d.b();
    }

    private final String c() {
        return this.f63197a;
    }

    @oy.l
    public final C4432o2 a(@oy.l String serverData) {
        kotlin.jvm.internal.m0.p(serverData, "serverData");
        return new C4432o2(serverData);
    }

    @oy.l
    public final Map<String, String> b() {
        Map<String, String> mapB = this.f63198b.b(this.f63197a);
        kotlin.jvm.internal.m0.o(mapB, "auctionDataUtils.getAuct…verDataParams(serverData)");
        return mapB;
    }

    @oy.l
    public final String d() {
        String strC = this.f63198b.c(this.f63197a);
        kotlin.jvm.internal.m0.o(strC, "auctionDataUtils.getDyna…romServerData(serverData)");
        return strC;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4432o2) && kotlin.jvm.internal.m0.g(this.f63197a, ((C4432o2) obj).f63197a);
    }

    public int hashCode() {
        return this.f63197a.hashCode();
    }

    @oy.l
    public String toString() {
        return "AuctionServerData(serverData=" + this.f63197a + gi.j.f86771d;
    }

    public static /* synthetic */ C4432o2 a(C4432o2 c4432o2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4432o2.f63197a;
        }
        return c4432o2.a(str);
    }

    @oy.l
    public final String a() {
        String strA = this.f63198b.a(this.f63197a);
        kotlin.jvm.internal.m0.o(strA, "auctionDataUtils.getAdmFromServerData(serverData)");
        return strA;
    }
}
