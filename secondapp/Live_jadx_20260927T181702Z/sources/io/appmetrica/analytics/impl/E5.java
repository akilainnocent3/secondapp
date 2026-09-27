package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class E5 implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F5 f95750a;

    public E5(F5 f10) {
        this.f95750a = f10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@oy.l Activity activity, @oy.l ActivityEvent activityEvent) {
        int i10 = D5.f95722a[activityEvent.ordinal()];
        if (i10 == 1) {
            this.f95750a.f95811b.resumeSession();
        } else {
            if (i10 != 2) {
                return;
            }
            this.f95750a.f95811b.pauseSession();
        }
    }
}
