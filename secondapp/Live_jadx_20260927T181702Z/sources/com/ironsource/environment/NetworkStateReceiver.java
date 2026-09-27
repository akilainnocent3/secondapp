package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.C4485r4;
import com.ironsource.Cc;
import com.ironsource.environment.thread.IronSourceThreadManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class NetworkStateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConnectivityManager f61706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Cc f61707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f61708c = false;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NetworkStateReceiver networkStateReceiver = NetworkStateReceiver.this;
            Cc cc2 = networkStateReceiver.f61707b;
            if (cc2 != null) {
                cc2.a(networkStateReceiver.f61708c);
            }
        }
    }

    public NetworkStateReceiver(Context context, Cc cc2) {
        this.f61707b = cc2;
        if (context != null) {
            this.f61706a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        a();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null || !a()) {
            return;
        }
        b();
    }

    private boolean a() {
        boolean z10 = this.f61708c;
        ConnectivityManager connectivityManager = this.f61706a;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                this.f61708c = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            } catch (Exception e10) {
                C4485r4.d().a(e10);
                this.f61708c = false;
            }
        } else {
            this.f61708c = false;
        }
        return z10 != this.f61708c;
    }

    private void b() {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a());
    }
}
