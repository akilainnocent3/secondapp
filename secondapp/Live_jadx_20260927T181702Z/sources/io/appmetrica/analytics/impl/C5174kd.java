package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5174kd extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5275od f97723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f97725c;

    public C5174kd(C5275od c5275od, int i10, String str) {
        this.f97723a = c5275od;
        this.f97724b = i10;
        this.f97725c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C5275od.a(this.f97723a).a(new G9(this.f97724b, this.f97725c));
    }
}
