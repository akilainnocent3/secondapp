package yads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class k1 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f151354a;

    public k1(o1 o1Var) {
        this.f151354a = o1Var;
    }

    public final Activity a() {
        Activity activity;
        o1 o1Var = this.f151354a;
        synchronized (o1Var) {
            fr.m0.N0(o1Var.f153299a, m1.f152259b);
            WeakReference weakReference = (WeakReference) fr.r0.L2(o1Var.f153299a);
            activity = weakReference != null ? (Activity) weakReference.get() : null;
        }
        return activity;
    }

    public final Activity b() {
        Activity activity;
        o1 o1Var = this.f151354a;
        synchronized (o1Var) {
            fr.m0.N0(o1Var.f153299a, n1.f152820b);
            WeakReference weakReference = (WeakReference) fr.r0.A3(o1Var.f153299a);
            activity = weakReference != null ? (Activity) weakReference.get() : null;
        }
        return activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f151354a.a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f151354a.b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f151354a.b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
