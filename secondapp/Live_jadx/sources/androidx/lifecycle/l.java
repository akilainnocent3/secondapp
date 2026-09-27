package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class l implements Application.ActivityLifecycleCallbacks {
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
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@oy.l Activity activity) {
        kotlin.jvm.internal.m0.p(activity, "activity");
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
