package com.iab.omid.library.prebidorg.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class zt implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    protected boolean f53744zr;

    /* JADX INFO: renamed from: zs, reason: collision with root package name */
    private zz f53745zs;
    private boolean zz;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface zz {
        void zz(boolean z10);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        zz(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        zz(zz());
    }

    public void zr(boolean z10) {
    }

    public boolean zs() {
        return this.f53744zr;
    }

    public boolean zt() {
        return false;
    }

    public void zu() {
        this.zz = true;
        boolean zZz = zz();
        this.f53744zr = zZz;
        zr(zZz);
    }

    public void zv() {
        this.zz = false;
        this.f53745zs = null;
    }

    public void zz(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public ActivityManager.RunningAppProcessInfo zr() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public void zz(zz zzVar) {
        this.f53745zs = zzVar;
    }

    private void zz(boolean z10) {
        if (this.f53744zr != z10) {
            this.f53744zr = z10;
            if (this.zz) {
                zr(z10);
                zz zzVar = this.f53745zs;
                if (zzVar != null) {
                    zzVar.zz(z10);
                }
            }
        }
    }

    private boolean zz() {
        return zr().importance == 100 || zt();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
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
