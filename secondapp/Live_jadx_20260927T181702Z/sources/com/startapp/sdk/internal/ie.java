package com.startapp.sdk.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ie implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f74990b;

    public ie(String str, CountDownLatch countDownLatch) {
        this.f74989a = str;
        this.f74990b = countDownLatch;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IInterface v8Var;
        try {
            int i10 = w8.f75774a;
            if (iBinder == null) {
                v8Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                v8Var = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof x8)) ? new v8(iBinder) : (x8) iInterfaceQueryLocalInterface;
            }
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f74989a);
            je.f75056a = new qe(((v8) v8Var).a(bundle));
        } catch (Throwable unused) {
        }
        this.f74990b.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f74990b.countDown();
    }
}
