package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.g2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4287g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f61846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f61847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f61848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    private String f61849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    private Map<String, ? extends Object> f61850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.m
    private com.ironsource.mediationsdk.h f61851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    private Map<String, Object> f61852g;

    public C4287g2(@oy.l String name, boolean z10) {
        kotlin.jvm.internal.m0.p(name, "name");
        this.f61846a = name;
        this.f61847b = z10;
        this.f61849d = "";
        this.f61850e = fr.n1.z();
        this.f61852g = new HashMap();
    }

    @oy.l
    public final String a() {
        return this.f61846a;
    }

    public final boolean b() {
        return this.f61847b;
    }

    @oy.l
    public final Map<String, Object> c() {
        return this.f61852g;
    }

    @oy.m
    public final com.ironsource.mediationsdk.h d() {
        return this.f61851f;
    }

    public final boolean e() {
        return this.f61847b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4287g2)) {
            return false;
        }
        C4287g2 c4287g2 = (C4287g2) obj;
        return kotlin.jvm.internal.m0.g(this.f61846a, c4287g2.f61846a) && this.f61847b == c4287g2.f61847b;
    }

    @oy.l
    public final Map<String, Object> f() {
        return this.f61850e;
    }

    @oy.l
    public final String g() {
        return this.f61846a;
    }

    @oy.l
    public final String h() {
        return this.f61849d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.f61846a.hashCode() * 31;
        boolean z10 = this.f61847b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final boolean i() {
        return this.f61848c;
    }

    @oy.l
    public String toString() {
        return "AuctionRequestInstanceInfo(name=" + this.f61846a + ", bidder=" + this.f61847b + gi.j.f86771d;
    }

    @oy.l
    public final C4287g2 a(@oy.l String name, boolean z10) {
        kotlin.jvm.internal.m0.p(name, "name");
        return new C4287g2(name, z10);
    }

    public final void b(@oy.l Map<String, ? extends Object> map) {
        kotlin.jvm.internal.m0.p(map, "<set-?>");
        this.f61850e = map;
    }

    public static /* synthetic */ C4287g2 a(C4287g2 c4287g2, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4287g2.f61846a;
        }
        if ((i10 & 2) != 0) {
            z10 = c4287g2.f61847b;
        }
        return c4287g2.a(str, z10);
    }

    public final void a(boolean z10) {
        this.f61848c = z10;
    }

    public final void a(@oy.l String str) {
        kotlin.jvm.internal.m0.p(str, "<set-?>");
        this.f61849d = str;
    }

    public final void a(@oy.m com.ironsource.mediationsdk.h hVar) {
        this.f61851f = hVar;
    }

    public final void a(@oy.l Map<String, Object> map) {
        kotlin.jvm.internal.m0.p(map, "<set-?>");
        this.f61852g = map;
    }
}
