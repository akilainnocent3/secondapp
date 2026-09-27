package com.ironsource;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4373l implements qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f62250a;

    public C4373l(Activity activity) {
        this.f62250a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.qg
    public void a() {
        Activity activity = this.f62250a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}
