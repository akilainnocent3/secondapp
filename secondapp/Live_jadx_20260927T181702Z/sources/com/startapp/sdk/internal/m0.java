package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class m0 extends e6 {
    public m0(Context context, ConnectivityManager connectivityManager) {
        super(context, connectivityManager);
    }

    @Override // com.startapp.sdk.internal.e6
    public final int a() {
        if (!p0.a(this.f74718a, com.bumptech.glide.manager.e.f31484b)) {
            return 0;
        }
        int iA = 0;
        for (Network network : this.f74719b.getAllNetworks()) {
            if (network != null) {
                iA |= f6.a(this.f74719b.getNetworkCapabilities(network));
            }
        }
        return iA;
    }
}
