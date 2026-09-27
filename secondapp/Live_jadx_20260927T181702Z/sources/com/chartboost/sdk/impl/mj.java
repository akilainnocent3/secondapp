package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class mj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hj f40052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f40055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f40056e;

    public mj(hj vastFetcher, int i10, int i11, List aggregatedTrackingEvents, List aggregatedAdVerifications) {
        kotlin.jvm.internal.m0.p(vastFetcher, "vastFetcher");
        kotlin.jvm.internal.m0.p(aggregatedTrackingEvents, "aggregatedTrackingEvents");
        kotlin.jvm.internal.m0.p(aggregatedAdVerifications, "aggregatedAdVerifications");
        this.f40052a = vastFetcher;
        this.f40053b = i10;
        this.f40054c = i11;
        this.f40055d = aggregatedTrackingEvents;
        this.f40056e = aggregatedAdVerifications;
    }

    public final mj a(hj vastFetcher, int i10, int i11, List aggregatedTrackingEvents, List aggregatedAdVerifications) {
        kotlin.jvm.internal.m0.p(vastFetcher, "vastFetcher");
        kotlin.jvm.internal.m0.p(aggregatedTrackingEvents, "aggregatedTrackingEvents");
        kotlin.jvm.internal.m0.p(aggregatedAdVerifications, "aggregatedAdVerifications");
        return new mj(vastFetcher, i10, i11, aggregatedTrackingEvents, aggregatedAdVerifications);
    }

    public final List b() {
        return this.f40055d;
    }

    public final int c() {
        return this.f40054c;
    }

    public final int d() {
        return this.f40053b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj)) {
            return false;
        }
        mj mjVar = (mj) obj;
        return kotlin.jvm.internal.m0.g(this.f40052a, mjVar.f40052a) && this.f40053b == mjVar.f40053b && this.f40054c == mjVar.f40054c && kotlin.jvm.internal.m0.g(this.f40055d, mjVar.f40055d) && kotlin.jvm.internal.m0.g(this.f40056e, mjVar.f40056e);
    }

    public int hashCode() {
        return (((((((this.f40052a.hashCode() * 31) + this.f40053b) * 31) + this.f40054c) * 31) + this.f40055d.hashCode()) * 31) + this.f40056e.hashCode();
    }

    public String toString() {
        return "VastParsingContext(vastFetcher=" + this.f40052a + ", maxWrapperDepth=" + this.f40053b + ", currentDepth=" + this.f40054c + ", aggregatedTrackingEvents=" + this.f40055d + ", aggregatedAdVerifications=" + this.f40056e + gi.j.f86771d;
    }

    public static /* synthetic */ mj a(mj mjVar, hj hjVar, int i10, int i11, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            hjVar = mjVar.f40052a;
        }
        if ((i12 & 2) != 0) {
            i10 = mjVar.f40053b;
        }
        if ((i12 & 4) != 0) {
            i11 = mjVar.f40054c;
        }
        if ((i12 & 8) != 0) {
            list = mjVar.f40055d;
        }
        if ((i12 & 16) != 0) {
            list2 = mjVar.f40056e;
        }
        List list3 = list2;
        int i13 = i11;
        return mjVar.a(hjVar, i10, i13, list, list3);
    }

    public final List a() {
        return this.f40056e;
    }

    public /* synthetic */ mj(hj hjVar, int i10, int i11, List list, List list2, int i12, kotlin.jvm.internal.x xVar) {
        this(hjVar, i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? new ArrayList() : list, (i12 & 16) != 0 ? new ArrayList() : list2);
    }
}
