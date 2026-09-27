package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.t f47043a = new com.fyber.inneractive.sdk.player.exoplayer2.util.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f47045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f47046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f47047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f47048f;

    public final synchronized void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.s sVar;
        int i10;
        float f10;
        try {
            if (this.f47044b <= 0) {
                throw new IllegalStateException();
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i11 = (int) (jElapsedRealtime - this.f47045c);
            long j10 = i11;
            this.f47047e += j10;
            long j11 = this.f47048f;
            long j12 = this.f47046d;
            this.f47048f = j11 + j12;
            if (i11 > 0) {
                float f11 = (RtspMediaSource.f48924s * j12) / j10;
                com.fyber.inneractive.sdk.player.exoplayer2.util.t tVar = this.f47043a;
                int iSqrt = (int) Math.sqrt(j12);
                if (tVar.f47146d != 1) {
                    Collections.sort(tVar.f47144b, com.fyber.inneractive.sdk.player.exoplayer2.util.t.f47141h);
                    tVar.f47146d = 1;
                }
                int i12 = tVar.f47149g;
                if (i12 > 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.s[] sVarArr = tVar.f47145c;
                    int i13 = i12 - 1;
                    tVar.f47149g = i13;
                    sVar = sVarArr[i13];
                } else {
                    sVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.s();
                }
                int i14 = tVar.f47147e;
                tVar.f47147e = i14 + 1;
                sVar.f47138a = i14;
                sVar.f47139b = iSqrt;
                sVar.f47140c = f11;
                tVar.f47144b.add(sVar);
                tVar.f47148f += iSqrt;
                while (true) {
                    int i15 = tVar.f47148f;
                    int i16 = tVar.f47143a;
                    i10 = 0;
                    if (i15 <= i16) {
                        break;
                    }
                    int i17 = i15 - i16;
                    com.fyber.inneractive.sdk.player.exoplayer2.util.s sVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.util.s) tVar.f47144b.get(0);
                    int i18 = sVar2.f47139b;
                    if (i18 <= i17) {
                        tVar.f47148f -= i18;
                        tVar.f47144b.remove(0);
                        int i19 = tVar.f47149g;
                        if (i19 < 5) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.s[] sVarArr2 = tVar.f47145c;
                            tVar.f47149g = i19 + 1;
                            sVarArr2[i19] = sVar2;
                        }
                    } else {
                        sVar2.f47139b = i18 - i17;
                        tVar.f47148f -= i17;
                    }
                }
                if (this.f47047e >= 2000 || this.f47048f >= 524288) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.t tVar2 = this.f47043a;
                    if (tVar2.f47146d != 0) {
                        Collections.sort(tVar2.f47144b, com.fyber.inneractive.sdk.player.exoplayer2.util.t.f47142i);
                        tVar2.f47146d = 0;
                    }
                    float f12 = 0.5f * tVar2.f47148f;
                    int i20 = 0;
                    while (true) {
                        if (i10 >= tVar2.f47144b.size()) {
                            if (!tVar2.f47144b.isEmpty()) {
                                ArrayList arrayList = tVar2.f47144b;
                                f10 = ((com.fyber.inneractive.sdk.player.exoplayer2.util.s) arrayList.get(arrayList.size() - 1)).f47140c;
                                break;
                            } else {
                                f10 = Float.NaN;
                                break;
                            }
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.util.s sVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.util.s) tVar2.f47144b.get(i10);
                        i20 += sVar3.f47139b;
                        if (i20 >= f12) {
                            f10 = sVar3.f47140c;
                            break;
                        }
                        i10++;
                    }
                    Float.isNaN(f10);
                }
            }
            int i21 = this.f47044b - 1;
            this.f47044b = i21;
            if (i21 > 0) {
                this.f47045c = jElapsedRealtime;
            }
            this.f47046d = 0L;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
