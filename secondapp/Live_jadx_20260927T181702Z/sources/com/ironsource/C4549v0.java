package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4549v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final String f64293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final List<NetworkSettings> f64294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private final C4458pa f64295c;

    /* JADX WARN: Multi-variable type inference failed */
    public C4549v0(@oy.m String str, @oy.l List<? extends NetworkSettings> providerList, @oy.l C4458pa publisherDataHolder) {
        kotlin.jvm.internal.m0.p(providerList, "providerList");
        kotlin.jvm.internal.m0.p(publisherDataHolder, "publisherDataHolder");
        this.f64293a = str;
        this.f64294b = providerList;
        this.f64295c = publisherDataHolder;
    }

    @oy.m
    public final String a() {
        return this.f64293a;
    }

    @oy.l
    public final List<NetworkSettings> b() {
        return this.f64294b;
    }

    @oy.l
    public final C4458pa c() {
        return this.f64295c;
    }

    @oy.l
    public final List<NetworkSettings> d() {
        return this.f64294b;
    }

    @oy.l
    public final C4458pa e() {
        return this.f64295c;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4549v0)) {
            return false;
        }
        C4549v0 c4549v0 = (C4549v0) obj;
        return kotlin.jvm.internal.m0.g(this.f64293a, c4549v0.f64293a) && kotlin.jvm.internal.m0.g(this.f64294b, c4549v0.f64294b) && kotlin.jvm.internal.m0.g(this.f64295c, c4549v0.f64295c);
    }

    @oy.m
    public final String f() {
        return this.f64293a;
    }

    public int hashCode() {
        String str = this.f64293a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f64294b.hashCode()) * 31) + this.f64295c.hashCode();
    }

    @oy.l
    public String toString() {
        return "AdUnitCommonData(userId=" + this.f64293a + ", providerList=" + this.f64294b + ", publisherDataHolder=" + this.f64295c + gi.j.f86771d;
    }

    @oy.l
    public final C4549v0 a(@oy.m String str, @oy.l List<? extends NetworkSettings> providerList, @oy.l C4458pa publisherDataHolder) {
        kotlin.jvm.internal.m0.p(providerList, "providerList");
        kotlin.jvm.internal.m0.p(publisherDataHolder, "publisherDataHolder");
        return new C4549v0(str, providerList, publisherDataHolder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4549v0 a(C4549v0 c4549v0, String str, List list, C4458pa c4458pa, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4549v0.f64293a;
        }
        if ((i10 & 2) != 0) {
            list = c4549v0.f64294b;
        }
        if ((i10 & 4) != 0) {
            c4458pa = c4549v0.f64295c;
        }
        return c4549v0.a(str, list, c4458pa);
    }
}
