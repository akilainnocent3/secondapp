package com.startapp.sdk.common.advertisingid;

import android.content.Context;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.k0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f74445a;

    public a(b bVar) {
        this.f74445a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        k0 k0VarB;
        try {
            this.f74445a.f74449d.lock();
            try {
                b bVar2 = this.f74445a;
                AtomicReference atomicReference = bVar2.f74451f;
                Context context = bVar2.f74446a;
                try {
                    try {
                        k0VarB = b.a(context);
                    } catch (Throwable th2) {
                        if (bVar2.a(128)) {
                            d9.a(th2);
                        }
                        try {
                            try {
                                k0VarB = b.b(context);
                            } catch (AdvertisingIdResolver$InternalException e10) {
                                bVar2.b(e10.infoEventFlags);
                                k0VarB = k0.f75069d;
                            }
                        } catch (Throwable th3) {
                            if (bVar2.a(256)) {
                                d9.a(th3);
                            }
                            k0VarB = k0.f75069d;
                        }
                    }
                } catch (AdvertisingIdResolver$InternalException e11) {
                    bVar2.b(e11.infoEventFlags);
                    k0VarB = b.b(context);
                }
                atomicReference.set(k0VarB);
                bVar = this.f74445a;
            } catch (Throwable th4) {
                try {
                    if (this.f74445a.a(64)) {
                        d9.a(th4);
                    }
                    bVar = this.f74445a;
                } finally {
                    this.f74445a.f74453h = 2;
                    this.f74445a.f74450e.signalAll();
                    this.f74445a.f74449d.unlock();
                }
            }
            bVar.f74453h = 2;
        } catch (Throwable th5) {
            this.f74445a.f74453h = 2;
            if (this.f74445a.a(16384)) {
                d9.a(th5);
            }
        }
    }
}
