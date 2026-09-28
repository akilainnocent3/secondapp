package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class k390 extends ConnectivityManager.NetworkCallback {
    public static final k390 a = new k390();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;

    public final j390 a(ConnectivityManager connectivityManager, NetworkRequest networkRequest, aox.b bVar) {
        NetworkCapabilities networkCapabilities;
        synchronized (b) {
            try {
                LinkedHashMap linkedHashMap = c;
                boolean zIsEmpty = linkedHashMap.isEmpty();
                linkedHashMap.put(bVar, networkRequest);
                if (zIsEmpty) {
                    jgt.e().a(quj0.a, "NetworkRequestConstraintController register shared callback");
                    connectivityManager.registerDefaultNetworkCallback(this);
                }
                jgt.e().a(quj0.a, "NetworkRequestConstraintController send initial capabilities");
                a.getClass();
                if (e) {
                    networkCapabilities = d;
                } else {
                    networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                    d = networkCapabilities;
                    e = true;
                }
                bVar.invoke(networkRequest.canBeSatisfiedBy(networkCapabilities) ? rxa.a.a : new rxa.b(7));
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return new j390(bVar, connectivityManager, this);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        jgt.e().a(quj0.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (b) {
            try {
                d = networkCapabilities;
                for (Map.Entry entry : c.entrySet()) {
                    ((Function1) entry.getKey()).invoke(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? rxa.a.a : new rxa.b(7));
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        jgt.e().a(quj0.a, "NetworkRequestConstraintController onLost callback");
        synchronized (b) {
            try {
                d = null;
                Iterator it = c.keySet().iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(new rxa.b(7));
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
