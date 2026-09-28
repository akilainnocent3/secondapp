package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import com.sportygames.commons.models.NetworkStateManager;

/* JADX INFO: loaded from: classes7.dex */
public final class pnx extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ qnx a;

    public pnx(qnx qnxVar) {
        this.a = qnxVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        super.onAvailable(network);
        NetworkStateManager networkStateManager = this.a.c;
        if (networkStateManager != null) {
            networkStateManager.setNetworkConnectivityStatus(true);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        super.onLost(network);
        NetworkStateManager networkStateManager = this.a.c;
        if (networkStateManager != null) {
            networkStateManager.setNetworkConnectivityStatus(false);
        }
    }
}
