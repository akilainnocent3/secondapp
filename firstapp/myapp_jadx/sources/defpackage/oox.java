package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class oox extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ pox a;

    public oox(pox poxVar) {
        this.a = poxVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        jgt.e().a(qox.a, "Network capabilities changed: " + networkCapabilities);
        int i = Build.VERSION.SDK_INT;
        pox poxVar = this.a;
        poxVar.b(i >= 28 ? new nox(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18)) : qox.a(poxVar.f));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        jgt.e().a(qox.a, "Network connection lost");
        pox poxVar = this.a;
        poxVar.b(qox.a(poxVar.f));
    }
}
