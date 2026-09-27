package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class F3 extends SimpleThreadSafeToggle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4918af f95809a;

    public F3(@oy.l C4918af c4918af) {
        super(c4918af.e(), "[ClientApiTrackingStatusToggle]");
        this.f95809a = c4918af;
    }

    public final void a(boolean z10) {
        updateState(z10);
        this.f95809a.f(z10);
    }
}
