package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ic, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4333ic implements InterfaceC4556v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f62020a = C4333ic.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f62021b = 23;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4573w7 f62022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f62023d;

    /* JADX INFO: renamed from: com.ironsource.ic$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f62024a;

        public a(Context context) {
            this.f62024a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network != null) {
                C4333ic.this.f62022c.a(C4181a4.a(network, this.f62024a), C4181a4.a(this.f62024a, network));
                return;
            }
            InterfaceC4573w7 interfaceC4573w7 = C4333ic.this.f62022c;
            String strB = C4181a4.b(this.f62024a);
            Context context = this.f62024a;
            interfaceC4573w7.a(strB, C4181a4.a(context, C4181a4.a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                C4333ic.this.f62022c.b(C4181a4.a(network, this.f62024a), C4181a4.a(this.f62024a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                C4333ic.this.f62022c.b(C4181a4.a(network, this.f62024a), C4181a4.a(this.f62024a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (C4181a4.b(this.f62024a).equals("none")) {
                C4333ic.this.f62022c.a();
            }
        }
    }

    public C4333ic(InterfaceC4573w7 interfaceC4573w7) {
        this.f62022c = interfaceC4573w7;
    }

    @Override // com.ironsource.InterfaceC4556v7
    @SuppressLint({"NewApi", "MissingPermission"})
    public void b(Context context) {
        if (Build.VERSION.SDK_INT >= this.f62021b) {
            a(context);
            if (C4181a4.b(context).equals("none")) {
                this.f62022c.a();
            }
            if (this.f62023d == null) {
                this.f62023d = new a(context);
            }
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(networkRequestBuild, this.f62023d);
                }
            } catch (Exception e10) {
                C4485r4.d().a(e10);
                Log.e(this.f62020a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.ironsource.InterfaceC4556v7
    public JSONObject c(Context context) {
        return C4181a4.a(context, C4181a4.a(context));
    }

    @Override // com.ironsource.InterfaceC4556v7
    @SuppressLint({"NewApi"})
    public void a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.f62021b || this.f62023d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.f62023d);
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            Log.e(this.f62020a, "NetworkCallback for was not registered or already unregistered");
        }
    }

    @Override // com.ironsource.InterfaceC4556v7
    public void a() {
        this.f62023d = null;
    }
}
