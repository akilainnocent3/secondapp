package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f46939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f46940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f46941c;

    public b0(String str) {
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f47158a;
        this.f46939a = Executors.newSingleThreadExecutor(new com.fyber.inneractive.sdk.player.exoplayer2.util.y(str));
    }

    public final boolean a() {
        return this.f46940b != null;
    }

    public final void b() throws IOException {
        IOException iOException = this.f46941c;
        if (iOException != null) {
            throw iOException;
        }
        y yVar = this.f46940b;
        if (yVar != null) {
            int i10 = yVar.f47089c;
            IOException iOException2 = yVar.f47091e;
            if (iOException2 != null && yVar.f47092f > i10) {
                throw iOException2;
            }
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.k kVar) {
        y yVar = this.f46940b;
        if (yVar != null) {
            yVar.a(true);
        }
        if (kVar != null) {
            this.f46939a.execute(kVar);
        }
        this.f46939a.shutdown();
    }
}
