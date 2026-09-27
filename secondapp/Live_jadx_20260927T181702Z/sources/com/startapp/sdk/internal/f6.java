package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.RemoteException;
import com.startapp.sdk.adsbase.remoteconfig.ConnectivityHelperMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class f6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f74784f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f74785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k4 f74786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f74787c = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f74788d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e6 f74789e;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            arrayList.add(5);
        }
        if (i10 >= 27) {
            arrayList.add(6);
        }
        if (i10 >= 31) {
            arrayList.add(8);
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        f74784f = iArr;
    }

    public f6(Context context, k4 k4Var) {
        this.f74785a = context;
        this.f74786b = k4Var;
    }

    public final void a() {
        if (this.f74788d.getAndSet(true)) {
            return;
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f74785a.getSystemService("connectivity");
            if (connectivityManager != null) {
                connectivityManager.addDefaultNetworkActiveListener(new d6(this));
                this.f74786b.getClass();
                ConnectivityHelperMetadata connectivityHelperMetadataQ = MetaData.E().q();
                e6 m0Var = null;
                ConnectivityHelperMetadata.Transport transportA = connectivityHelperMetadataQ != null ? connectivityHelperMetadataQ.a() : null;
                if (transportA != null) {
                    if (i10 >= 24 && si.a(i10, transportA.a())) {
                        m0Var = new i(this.f74785a, connectivityManager);
                    } else if (si.a(i10, transportA.b())) {
                        m0Var = new m0(this.f74785a, connectivityManager);
                    }
                    if (m0Var != null) {
                        m0Var.b();
                        this.f74789e = m0Var;
                    }
                }
            }
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }

    public final boolean b() {
        if (p0.a(this.f74785a, com.bumptech.glide.manager.e.f31484b)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f74785a.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    return activeNetworkInfo != null && activeNetworkInfo.isConnected();
                }
            } catch (Throwable th2) {
                if (!si.a(th2, RemoteException.class)) {
                    d9.a(th2);
                }
            }
        }
        return true;
    }

    public final void a(k9 k9Var) {
        synchronized (this.f74787c) {
            try {
                if (!this.f74787c.contains(k9Var)) {
                    this.f74787c.add(k9Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 : f74784f) {
            try {
                if (networkCapabilities.hasTransport(i11)) {
                    i10 |= 1 << i11;
                }
            } catch (Throwable unused) {
            }
        }
        return i10;
    }
}
