package com.chartboost.sdk.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class rd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f40793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f40794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f40795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f40796d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a();

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001d  */
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            boolean z10;
            a aVar;
            kotlin.jvm.internal.m0.p(network, "network");
            NetworkCapabilities networkCapabilities = rd.this.f40794b.getNetworkCapabilities(network);
            rd rdVar = rd.this;
            if (networkCapabilities != null) {
                z10 = networkCapabilities.hasCapability(12);
            }
            rdVar.f40793a = z10;
            if (!rd.this.f40793a || (aVar = rd.this.f40795c) == null) {
                return;
            }
            aVar.a();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            kotlin.jvm.internal.m0.p(network, "network");
            rd.this.f40793a = false;
            a aVar = rd.this.f40795c;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    public rd(Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        Object systemService = context.getSystemService("connectivity");
        kotlin.jvm.internal.m0.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f40794b = (ConnectivityManager) systemService;
        this.f40796d = new b();
    }

    public final void b() {
        this.f40794b.unregisterNetworkCallback(this.f40796d);
        this.f40795c = null;
    }

    public final boolean a() {
        return this.f40793a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002e  */
    public final void a(a aVar) {
        boolean z10;
        this.f40795c = aVar;
        this.f40794b.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), this.f40796d);
        NetworkCapabilities networkCapabilities = this.f40794b.getNetworkCapabilities(this.f40794b.getActiveNetwork());
        if (networkCapabilities != null) {
            z10 = networkCapabilities.hasCapability(12);
        }
        this.f40793a = z10;
        if (!z10 || aVar == null) {
            return;
        }
        aVar.a();
    }

    public static /* synthetic */ void a(rd rdVar, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        rdVar.a(aVar);
    }
}
