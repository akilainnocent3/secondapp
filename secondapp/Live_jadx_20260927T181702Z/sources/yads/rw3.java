package yads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public class rw3 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f155171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f155172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pw3 f155173c;

    public void a(boolean z10) {
    }

    public final void b() {
        boolean z10 = true;
        this.f155171a = true;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        if (runningAppProcessInfo.importance != 100 && !a()) {
            z10 = false;
        }
        this.f155172b = z10;
        a(z10);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f155172b) {
            this.f155172b = true;
            if (this.f155171a) {
                a(true);
                pw3 pw3Var = this.f155173c;
                if (pw3Var != null) {
                    pw3Var.a(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z10 = runningAppProcessInfo.importance == 100 || a();
        if (this.f155172b != z10) {
            this.f155172b = z10;
            if (this.f155171a) {
                a(z10);
                pw3 pw3Var = this.f155173c;
                if (pw3Var != null) {
                    pw3Var.a(z10);
                }
            }
        }
    }

    public boolean a() {
        return false;
    }

    public final void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
