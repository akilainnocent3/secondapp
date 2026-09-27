package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f47016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c f47017b;

    public e0(h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar) {
        hVar.getClass();
        this.f47016a = hVar;
        cVar.getClass();
        this.f47017b = cVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b {
        long jA = this.f47016a.a(kVar);
        if (kVar.f47035d == -1 && jA != -1) {
            kVar = new k(kVar.f47032a, kVar.f47033b, kVar.f47034c, jA, kVar.f47036e, kVar.f47037f);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar = this.f47017b;
        cVar.getClass();
        if (kVar.f47035d == -1 && (kVar.f47037f & 2) != 2) {
            cVar.f46945d = null;
            return jA;
        }
        cVar.f46945d = kVar;
        cVar.f46950i = 0L;
        try {
            cVar.b();
            return jA;
        } catch (IOException e10) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b {
        try {
            this.f47016a.close();
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar = this.f47017b;
            if (cVar.f46945d == null) {
                return;
            }
            try {
                cVar.a();
            } catch (IOException e10) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e10);
            }
        } catch (Throwable th2) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar2 = this.f47017b;
            if (cVar2.f46945d != null) {
                try {
                    cVar2.a();
                } catch (IOException e11) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e11);
                }
            }
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b {
        int i12 = this.f47016a.read(bArr, i10, i11);
        if (i12 > 0) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar = this.f47017b;
            if (cVar.f46945d != null) {
                int i13 = 0;
                while (i13 < i12) {
                    try {
                        if (cVar.f46949h == cVar.f46943b) {
                            cVar.a();
                            cVar.b();
                        }
                        int iMin = (int) Math.min(i12 - i13, cVar.f46943b - cVar.f46949h);
                        cVar.f46947f.write(bArr, i10 + i13, iMin);
                        i13 += iMin;
                        long j10 = iMin;
                        cVar.f46949h += j10;
                        cVar.f46950i += j10;
                    } catch (IOException e10) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e10);
                    }
                }
            }
        }
        return i12;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f47016a.a();
    }
}
