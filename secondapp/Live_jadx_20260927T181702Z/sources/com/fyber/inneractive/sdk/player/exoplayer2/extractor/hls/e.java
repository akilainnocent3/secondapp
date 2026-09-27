package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45816g;

    public e(y yVar, int[] iArr) {
        super(yVar, iArr);
        int i10 = 0;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = yVar.f46910b[0];
        while (i10 < this.f46922b) {
            if (this.f46924d[i10] == oVar) {
                this.f45816g = i10;
            }
            i10++;
        }
        i10 = -1;
        this.f45816g = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final int a() {
        return this.f45816g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final Object b() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final int c() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final void d() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f46925e[this.f45816g] > jElapsedRealtime) {
            for (int i10 = this.f46922b - 1; i10 >= 0; i10--) {
                if (this.f46925e[i10] <= jElapsedRealtime) {
                    this.f45816g = i10;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
