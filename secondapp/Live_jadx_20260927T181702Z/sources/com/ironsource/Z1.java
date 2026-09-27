package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f60396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f60397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f60398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    private String f60399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    private Map<String, ? extends Object> f60400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.m
    private com.ironsource.mediationsdk.h f60401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    private Map<String, Object> f60402g;

    public Z1(@oy.l String name, boolean z10) {
        kotlin.jvm.internal.m0.p(name, "name");
        this.f60396a = name;
        this.f60397b = z10;
        this.f60399d = "";
        this.f60400e = fr.n1.z();
        this.f60402g = new HashMap();
    }

    @oy.l
    public final String a() {
        return this.f60396a;
    }

    public final boolean b() {
        return this.f60397b;
    }

    @oy.l
    public final Map<String, Object> c() {
        return this.f60402g;
    }

    @oy.m
    public final com.ironsource.mediationsdk.h d() {
        return this.f60401f;
    }

    public final boolean e() {
        return this.f60397b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z1)) {
            return false;
        }
        Z1 z10 = (Z1) obj;
        return kotlin.jvm.internal.m0.g(this.f60396a, z10.f60396a) && this.f60397b == z10.f60397b;
    }

    @oy.l
    public final Map<String, Object> f() {
        return this.f60400e;
    }

    @oy.l
    public final String g() {
        return this.f60396a;
    }

    @oy.l
    public final String h() {
        return this.f60399d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.f60396a.hashCode() * 31;
        boolean z10 = this.f60397b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final boolean i() {
        return this.f60398c;
    }

    @oy.l
    public String toString() {
        return "AuctionInstanceInfo(name=" + this.f60396a + ", bidder=" + this.f60397b + gi.j.f86771d;
    }

    @oy.l
    public final Z1 a(@oy.l String name, boolean z10) {
        kotlin.jvm.internal.m0.p(name, "name");
        return new Z1(name, z10);
    }

    public final void b(@oy.l Map<String, ? extends Object> map) {
        kotlin.jvm.internal.m0.p(map, "<set-?>");
        this.f60400e = map;
    }

    public static /* synthetic */ Z1 a(Z1 z10, String str, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = z10.f60396a;
        }
        if ((i10 & 2) != 0) {
            z11 = z10.f60397b;
        }
        return z10.a(str, z11);
    }

    public final void a(boolean z10) {
        this.f60398c = z10;
    }

    public final void a(@oy.l String str) {
        kotlin.jvm.internal.m0.p(str, "<set-?>");
        this.f60399d = str;
    }

    public final void a(@oy.m com.ironsource.mediationsdk.h hVar) {
        this.f60401f = hVar;
    }

    public final void a(@oy.l Map<String, Object> map) {
        kotlin.jvm.internal.m0.p(map, "<set-?>");
        this.f60402g = map;
    }
}
