package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class wg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f41362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Mediation f41363e;

    public wg(String str, String location, int i10, String adTypeName, Mediation mediation) {
        kotlin.jvm.internal.m0.p(location, "location");
        kotlin.jvm.internal.m0.p(adTypeName, "adTypeName");
        this.f41359a = str;
        this.f41360b = location;
        this.f41361c = i10;
        this.f41362d = adTypeName;
        this.f41363e = mediation;
    }

    public final String a() {
        return this.f41359a;
    }

    public final String b() {
        return this.f41362d;
    }

    public final String c() {
        return this.f41360b;
    }

    public final Mediation d() {
        return this.f41363e;
    }

    public final int e() {
        return this.f41361c;
    }
}
