package yl;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@cr.f
public final class u0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final w0 f159706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f159707c;

    @cr.a
    public u0(@oy.l w0 sharedSessionRepository) {
        kotlin.jvm.internal.m0.p(sharedSessionRepository, "sharedSessionRepository");
        this.f159706b = sharedSessionRepository;
        this.f159707c = true;
    }

    public final void a() {
        this.f159707c = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@oy.l Activity activity, @oy.m Bundle bundle) {
        kotlin.jvm.internal.m0.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@oy.l Activity activity) {
        kotlin.jvm.internal.m0.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@oy.l Activity activity) {
        kotlin.jvm.internal.m0.p(activity, "activity");
        if (this.f159707c) {
            this.f159706b.c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@oy.l Activity activity) {
        kotlin.jvm.internal.m0.p(activity, "activity");
        if (this.f159707c) {
            this.f159706b.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@oy.l Activity activity, @oy.l Bundle outState) {
        kotlin.jvm.internal.m0.p(activity, "activity");
        kotlin.jvm.internal.m0.p(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@oy.l Activity activity) {
        kotlin.jvm.internal.m0.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@oy.l Activity activity) {
        kotlin.jvm.internal.m0.p(activity, "activity");
    }
}
