package yads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pp2 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f154061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f154062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qp2 f154063c;

    public pp2(qp2 qp2Var) {
        this.f154063c = qp2Var;
    }

    public final /* synthetic */ void a() {
        qp2 qp2Var = this.f154063c;
        if (qp2Var.f154552f != null) {
            qp2Var.a();
        }
    }

    public final void b() {
        qp2 qp2Var = this.f154063c;
        if (qp2Var.f154552f == null || (qp2Var.f154551e & 3) == 0) {
            return;
        }
        qp2Var.a();
    }

    public final void c() {
        this.f154063c.f154550d.post(new Runnable() { // from class: yads.o84
            @Override // java.lang.Runnable
            public final void run() {
                this.f153403b.a();
            }
        });
    }

    public final void d() {
        this.f154063c.f154550d.post(new Runnable() { // from class: yads.p84
            @Override // java.lang.Runnable
            public final void run() {
                this.f153816b.b();
            }
        });
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z10) {
        if (z10) {
            return;
        }
        d();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean zHasCapability = networkCapabilities.hasCapability(16);
        if (this.f154061a && this.f154062b == zHasCapability) {
            if (zHasCapability) {
                d();
            }
        } else {
            this.f154061a = true;
            this.f154062b = zHasCapability;
            c();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        c();
    }
}
