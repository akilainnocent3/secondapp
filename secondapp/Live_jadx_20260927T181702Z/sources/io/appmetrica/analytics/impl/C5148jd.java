package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5148jd extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5275od f97629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f97630b;

    public C5148jd(C5275od c5275od, ModuleEvent moduleEvent) {
        this.f97629a = c5275od;
        this.f97630b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C5275od.a(this.f97629a).reportEvent(this.f97630b);
    }
}
