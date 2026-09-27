package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.z0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TelephonyManager f44330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f44331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CopyOnWriteArrayList f44332c = new CopyOnWriteArrayList();

    public d(Context context) {
        this.f44330a = (TelephonyManager) context.getSystemService("phone");
        this.f44331b = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public abstract void a();

    public abstract void a(a aVar);

    public abstract void a(h hVar);

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(z0 z0Var) {
        CopyOnWriteArrayList<h> copyOnWriteArrayList = this.f44332c;
        if (copyOnWriteArrayList == null) {
            IAlog.a("NetworkDetector: onNetworkUpdated: no update listeners", new Object[0]);
            return;
        }
        for (h hVar : copyOnWriteArrayList) {
            if (hVar != null) {
                hVar.a(z0Var);
            }
        }
    }
}
