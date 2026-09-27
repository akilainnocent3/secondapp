package com.startapp.sdk.internal;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class yh implements yf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f75906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f75907b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f75908c = Executors.newScheduledThreadPool(1, new u5("scheduler"));

    public yh(Context context) {
        this.f75906a = new WeakReference(context);
    }

    @Override // com.startapp.sdk.internal.yf
    public final boolean a(de deVar, long j10) {
        Context context = (Context) this.f75906a.get();
        if (context == null) {
            return false;
        }
        return new wh(this, deVar, j10).a(context, deVar.f74692a, new xh(), null);
    }

    @Override // com.startapp.sdk.internal.yf
    public final synchronized boolean a(int i10) {
        Future future = (Future) this.f75907b.get(Integer.valueOf(i10));
        if (future == null) {
            return false;
        }
        this.f75907b.remove(Integer.valueOf(i10));
        return future.cancel(true);
    }
}
