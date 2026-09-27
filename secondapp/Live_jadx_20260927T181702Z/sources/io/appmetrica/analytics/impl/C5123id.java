package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.id, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5123id extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5275od f97581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f97582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f97583c;

    public C5123id(C5275od c5275od, AdRevenue adRevenue, boolean z10) {
        this.f97581a = c5275od;
        this.f97582b = adRevenue;
        this.f97583c = z10;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C5275od.a(this.f97581a).reportAdRevenue(this.f97582b, this.f97583c);
    }
}
