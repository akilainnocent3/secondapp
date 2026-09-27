package com.fyber.inneractive.sdk.nativead;

import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.player.cache.g;
import com.fyber.inneractive.sdk.player.cache.l;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f45270a;

    public a(b bVar) {
        this.f45270a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        File fileA = b.a(this.f45270a);
        if (fileA != null) {
            try {
                IAlog.a("NativeCache opening the cache in directory - %s", fileA);
                this.f45270a.f45273b = g.a(fileA, 41943040L);
                g gVar = this.f45270a.f45273b;
                gVar.getClass();
                IAlog.e("DiskLruCache delete cache", new Object[0]);
                gVar.close();
                l.a(gVar.f45446a);
                this.f45270a.f45273b = g.a(fileA, 41943040L);
                g gVar2 = this.f45270a.f45273b;
                synchronized (gVar2) {
                    j10 = gVar2.f45453h;
                }
                IAlog.a("NativeCache opened the cache in directory - %s current size is %d", fileA, Long.valueOf(j10));
                b bVar = this.f45270a;
                bVar.f45273b.f45457l = bVar;
                bVar.f45274c = true;
            } catch (Throwable th2) {
                z.a("Failed to open cache directory", th2.getMessage(), null, null);
                IAlog.a("Failed to open cache directory", th2, new Object[0]);
            }
        }
    }
}
