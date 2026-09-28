package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class tnx extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ snx a;

    public tnx(snx snxVar) {
        this.a = snxVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        snx snxVar = this.a;
        ConnectivityManager connectivityManager = snxVar.d;
        NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
        if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
            snxVar.e.add(network);
        }
        snxVar.a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        snx snxVar = this.a;
        snxVar.e.remove(network);
        snxVar.a();
    }
}
