package com.startapp.sdk.internal;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class kf extends k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pf f75090a;

    public kf(pf pfVar) {
        this.f75090a = pfVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        try {
            this.f75090a.a(activity);
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }
}
