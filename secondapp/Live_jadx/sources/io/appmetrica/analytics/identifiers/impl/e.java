package io.appmetrica.analytics.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class e implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f95424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IBinder f95425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f95426c = new Object();

    public e(Intent intent, String str) {
        this.f95424a = intent;
        String.format("[AdvServiceConnection-%s]", str);
    }

    public final void a(Context context) {
        synchronized (this.f95426c) {
            this.f95425b = null;
            this.f95426c.notifyAll();
        }
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        synchronized (this.f95426c) {
            this.f95425b = null;
            this.f95426c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        synchronized (this.f95426c) {
            this.f95426c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f95426c) {
            this.f95425b = iBinder;
            this.f95426c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f95426c) {
            this.f95425b = null;
            this.f95426c.notifyAll();
        }
    }
}
