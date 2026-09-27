package to;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final l f137118a = new l();

    public final boolean a(@oy.m Context context) {
        ConnectivityManager connectivityManager = context != null ? (ConnectivityManager) context.getSystemService(ConnectivityManager.class) : null;
        NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(connectivityManager != null ? connectivityManager.getActiveNetwork() : null) : null;
        if (networkCapabilities == null || !networkCapabilities.hasTransport(1)) {
            return networkCapabilities != null && networkCapabilities.hasTransport(0);
        }
        return true;
    }
}
