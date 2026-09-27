package com.startapp.sdk.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class j6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f75024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f75025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f75026d;

    public j6(Context context) {
        this.f75023a = context;
        this.f75026d = androidx.work.y.f20321g;
    }

    public Object a() {
        return null;
    }

    public final Object b() {
        Object objA = this.f75024b;
        if (objA == null || this.f75025c + this.f75026d < SystemClock.uptimeMillis()) {
            synchronized (this) {
                try {
                    objA = this.f75024b;
                    boolean z10 = this.f75025c + this.f75026d < SystemClock.uptimeMillis();
                    if (objA == null || z10) {
                        try {
                            objA = a(z10);
                        } catch (Throwable th2) {
                            if (!si.a(th2, RemoteException.class)) {
                                d9.a(th2);
                            }
                        }
                        if (objA != null) {
                            this.f75024b = objA;
                            this.f75025c = SystemClock.uptimeMillis();
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return objA != null ? objA : c();
    }

    public abstract Object c();

    public Object a(boolean z10) {
        return a();
    }

    public j6(Context context, long j10) {
        this.f75023a = context;
        this.f75026d = j10;
    }
}
