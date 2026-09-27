package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5563d implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f99071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f99072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C5569j f99073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dr.i0 f99074d = dr.k0.b(new C5560a(this));

    public C5563d(@oy.l ClientContext clientContext, @oy.l U u10) {
        this.f99071a = clientContext;
        this.f99072b = u10;
    }

    public static final Activity.ScreenCaptureCallback d(C5563d c5563d) {
        return yq.d.a(c5563d.f99074d.getValue());
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(@oy.m C5572m c5572m) {
        this.f99073c = c5572m != null ? c5572m.f99102a : null;
    }

    @oy.l
    public final String b() {
        return "AndroidApiScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        if (AndroidUtils.isApiAchieved(34)) {
            this.f99071a.getActivityLifecycleRegistry().registerListener(new C5562c(this), ActivityEvent.STARTED, ActivityEvent.STOPPED);
        }
    }
}
