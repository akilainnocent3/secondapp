package com.startapp.sdk.internal;

import android.net.ConnectivityManager;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class d6 implements ConnectivityManager.OnNetworkActiveListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f6 f74670a;

    public d6(f6 f6Var) {
        this.f74670a = f6Var;
    }

    @Override // android.net.ConnectivityManager.OnNetworkActiveListener
    public final void onNetworkActive() {
        f6 f6Var = this.f74670a;
        synchronized (f6Var.f74787c) {
            try {
                Iterator it = f6Var.f74787c.iterator();
                while (it.hasNext()) {
                    ((i7) it.next()).a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
