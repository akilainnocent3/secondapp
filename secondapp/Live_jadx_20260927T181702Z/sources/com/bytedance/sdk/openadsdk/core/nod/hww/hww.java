package com.bytedance.sdk.openadsdk.core.nod.hww;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import fw.b;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww implements Application.ActivityLifecycleCallbacks {
    private static volatile hww hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final tq f36489tq;

    private hww(Application application) {
        this.f36489tq = tq.hww(application);
    }

    public static hww hww(Application application) {
        if (hww == null) {
            synchronized (hww.class) {
                try {
                    if (hww == null) {
                        hww = new hww(application);
                        application.registerActivityLifecycleCallbacks(hww);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hww;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        tq tqVar = this.f36489tq;
        if (tqVar != null) {
            tqVar.hww(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        tq tqVar = this.f36489tq;
        if (tqVar != null) {
            tqVar.tq(activity);
        }
    }

    public String hww(String str, long j10, int i10) {
        tq tqVar = this.f36489tq;
        if (tqVar != null) {
            return tqVar.hww(str, j10, i10);
        }
        return b.f85379f;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
