package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class wfn extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int b = 0;
    public final aox.b a;

    public wfn(aox.b bVar) {
        this.a = bVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        jgt.e().a(quj0.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.a.invoke(rxa.a.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        jgt.e().a(quj0.a, "NetworkRequestConstraintController onLost callback");
        this.a.invoke(new rxa.b(7));
    }
}
