package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class pox extends xwa<nox> {
    public final ConnectivityManager f;
    public final oox g;

    public pox(Context context, vvj0 vvj0Var) {
        super(context, vvj0Var);
        Object systemService = this.b.getSystemService("connectivity");
        systemService.getClass();
        this.f = (ConnectivityManager) systemService;
        this.g = new oox(this);
    }

    @Override // defpackage.xwa
    public final nox a() {
        return qox.a(this.f);
    }

    @Override // defpackage.xwa
    public final void c() {
        try {
            jgt.e().a(qox.a, "Registering network callback");
            ConnectivityManager connectivityManager = this.f;
            oox ooxVar = this.g;
            connectivityManager.getClass();
            ooxVar.getClass();
            connectivityManager.registerDefaultNetworkCallback(ooxVar);
        } catch (IllegalArgumentException e) {
            jgt.e().d(qox.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            jgt.e().d(qox.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.xwa
    public final void d() {
        try {
            jgt.e().a(qox.a, "Unregistering network callback");
            ConnectivityManager connectivityManager = this.f;
            oox ooxVar = this.g;
            connectivityManager.getClass();
            ooxVar.getClass();
            connectivityManager.unregisterNetworkCallback(ooxVar);
        } catch (IllegalArgumentException e) {
            jgt.e().d(qox.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            jgt.e().d(qox.a, "Received exception while unregistering network callback", e2);
        }
    }
}
