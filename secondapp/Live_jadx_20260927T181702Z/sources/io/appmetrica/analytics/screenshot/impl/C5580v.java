package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5580v implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f99115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f99116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C5570k f99117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z f99118d;

    public C5580v(@oy.l ClientContext clientContext, @oy.l U u10) {
        this.f99115a = clientContext;
        this.f99116b = u10;
        this.f99118d = new Z(clientContext, new C5577s(this));
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(@oy.m C5572m c5572m) {
        this.f99117c = c5572m != null ? c5572m.f99104c : null;
        this.f99118d.f99065c = this.f99117c;
    }

    @oy.l
    public final String b() {
        return "ContentObserverScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f99115a.getActivityLifecycleRegistry().registerListener(new C5579u(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
