package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
@fae
public final class vox {
    public static rox a(ConnectivityManager connectivityManager) {
        try {
            Network[] allNetworks = connectivityManager.getAllNetworks();
            allNetworks.getClass();
            for (Network network : allNetworks) {
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                if (networkInfo != null && networkInfo.isConnected()) {
                    return networkInfo.getType() == 0 ? rox.b : rox.c;
                }
            }
            return rox.a;
        } catch (Exception unused) {
            return rox.d;
        }
    }

    public static final List<String> b(Context context) {
        List<InetAddress> dnsServers;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return m2g.a;
        }
        ArrayList arrayList = new ArrayList();
        Network[] allNetworks = connectivityManager.getAllNetworks();
        allNetworks.getClass();
        for (Network network : allNetworks) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties != null && (dnsServers = linkProperties.getDnsServers()) != null) {
                for (InetAddress inetAddress : dnsServers) {
                    if (networkCapabilities != null && (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1))) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (hostAddress == null) {
                            hostAddress = "Unknown";
                        }
                        arrayList.add(hostAddress);
                    }
                }
            }
        }
        return CollectionsKt.A0(arrayList);
    }

    public static final rox c(Context context) {
        context.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return rox.d;
        }
        if (Build.VERSION.SDK_INT < 28) {
            return a(connectivityManager);
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
                return rox.a;
            }
            return networkCapabilities.hasTransport(0) ? rox.b : rox.c;
        } catch (Exception unused) {
            return a(connectivityManager);
        }
    }

    public static final boolean d(Context context) {
        context.getClass();
        return c(context) != rox.a;
    }
}
