package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class i extends e6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f74966c;

    public i(Context context, ConnectivityManager connectivityManager) {
        super(context, connectivityManager);
        this.f74966c = new HashMap();
    }

    @Override // com.startapp.sdk.internal.e6
    public final int a() {
        int iIntValue;
        synchronized (this.f74966c) {
            try {
                iIntValue = 0;
                for (Integer num : this.f74966c.values()) {
                    if (num != null) {
                        iIntValue |= num.intValue();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    @Override // com.startapp.sdk.internal.e6
    public final void b() {
        if (p0.a(this.f74718a, com.bumptech.glide.manager.e.f31484b)) {
            this.f74719b.registerDefaultNetworkCallback(new h(this));
        }
    }
}
