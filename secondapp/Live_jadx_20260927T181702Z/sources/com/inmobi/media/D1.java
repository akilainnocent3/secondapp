package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class D1 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1 f54472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f54473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f54474c;

    public D1(Context context) {
        this.f54474c = context;
        Looper mainLooper = Looper.getMainLooper();
        kotlin.jvm.internal.m0.o(mainLooper, "getMainLooper(...)");
        this.f54472a = new C1(mainLooper);
    }

    public static final void a(Context context, D1 d10) {
        if (E1.a(context) || d10.f54473b != null) {
            return;
        }
        d10.f54472a.sendEmptyMessageDelayed(1001, 3000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.m0.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.m0.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.m0.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.m0.p(activity, "activity");
        WeakReference weakReference = this.f54473b;
        if (!kotlin.jvm.internal.m0.g(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f54473b = new WeakReference(activity);
        }
        this.f54472a.removeMessages(1001);
        this.f54472a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.m0.p(activity, "activity");
        kotlin.jvm.internal.m0.p(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.m0.p(activity, "activity");
        WeakReference weakReference = this.f54473b;
        if (!kotlin.jvm.internal.m0.g(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f54473b = new WeakReference(activity);
        }
        this.f54472a.removeMessages(1001);
        this.f54472a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.m0.p(activity, "activity");
        WeakReference weakReference = this.f54473b;
        if (kotlin.jvm.internal.m0.g(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f54472a.sendEmptyMessageDelayed(1001, 3000L);
            return;
        }
        if (this.f54473b == null) {
            final Context context = this.f54474c;
            Runnable runnable = new Runnable() { // from class: com.inmobi.media.ip
                @Override // java.lang.Runnable
                public final void run() {
                    D1.a(context, this);
                }
            };
            Context context2 = Ji.f54934a;
            kotlin.jvm.internal.m0.p(runnable, "runnable");
            Ji.f54940g.submit(runnable);
        }
    }
}
