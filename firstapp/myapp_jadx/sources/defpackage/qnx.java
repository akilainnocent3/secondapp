package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import com.sportygames.commons.models.NetworkStateManager;
import com.sportygames.commons.views.GameMainActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class qnx {
    public ConnectivityManager b;
    public NetworkStateManager c;
    public final pnx d = new pnx(this);
    public NetworkRequest a = new NetworkRequest.Builder().addTransportType(1).addTransportType(0).build();

    public qnx(GameMainActivity gameMainActivity) {
        Object systemService = gameMainActivity.getSystemService("connectivity");
        systemService.getClass();
        this.b = (ConnectivityManager) systemService;
        this.c = NetworkStateManager.INSTANCE.getInstance();
    }

    public final void a() {
        try {
            ConnectivityManager connectivityManager = this.b;
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            NetworkStateManager networkStateManager = this.c;
            if (networkStateManager != null) {
                networkStateManager.setNetworkConnectivityStatus(activeNetworkInfo != null && activeNetworkInfo.isConnected());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void b() {
        ConnectivityManager connectivityManager;
        try {
            NetworkRequest networkRequest = this.a;
            if (networkRequest == null || (connectivityManager = this.b) == null) {
                return;
            }
            connectivityManager.registerNetworkCallback(networkRequest, this.d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
