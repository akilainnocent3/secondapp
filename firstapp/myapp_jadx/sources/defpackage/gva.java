package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes6.dex */
public final class gva implements nsm {
    public volatile boolean a;
    public final ConnectivityManager b;

    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            network.getClass();
            gva.this.a = true;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            NetworkCapabilities networkCapabilities;
            network.getClass();
            gva gvaVar = gva.this;
            ConnectivityManager connectivityManager = gvaVar.b;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            boolean zHasCapability = false;
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                zHasCapability = networkCapabilities.hasCapability(12);
            }
            gvaVar.a = zHasCapability;
        }
    }

    public gva(Context context) {
        NetworkCapabilities networkCapabilities;
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        this.b = connectivityManager;
        a aVar = new a();
        Network activeNetwork = connectivityManager.getActiveNetwork();
        boolean zHasCapability = false;
        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
            zHasCapability = networkCapabilities.hasCapability(12);
        }
        this.a = zHasCapability;
        connectivityManager.registerDefaultNetworkCallback(aVar);
    }

    @Override // defpackage.nsm
    public final boolean isConnected() {
        return this.a;
    }
}
