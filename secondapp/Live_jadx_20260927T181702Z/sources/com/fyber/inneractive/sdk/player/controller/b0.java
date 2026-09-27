package com.fyber.inneractive.sdk.player.controller;

import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements VideoRendererEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f45481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f45482b = false;

    public b0(f fVar) {
        this.f45481a = new WeakReference(fVar);
    }

    public final String a() {
        f fVar = (f) this.f45481a.get();
        return fVar == null ? b0.class.getName() : IAlog.a(fVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        f fVar = (f) this.f45481a.get();
        if (fVar != null) {
            fVar.f45497t = i10;
            fVar.f45498u = i11;
        }
    }

    public final void a(int i10, boolean z10) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar;
        IAlog.a("%sonPlayerStateChanged called with pwr = %s state = %d", a(), Boolean.valueOf(z10), Integer.valueOf(i10));
        f fVar = (f) this.f45481a.get();
        if (fVar == null || (gVar = fVar.f45496s) == null || fVar.f45503z) {
            return;
        }
        if (i10 != 3) {
            if (i10 == 2) {
                if (fVar.f45522e == com.fyber.inneractive.sdk.player.enums.b.Playing) {
                    fVar.a(com.fyber.inneractive.sdk.player.enums.b.Buffering);
                    return;
                }
                return;
            } else {
                if (i10 == 4) {
                    fVar.a(com.fyber.inneractive.sdk.player.enums.b.Completed);
                    return;
                }
                return;
            }
        }
        if (!z10) {
            if (fVar.f45522e == com.fyber.inneractive.sdk.player.enums.b.Preparing) {
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar = gVar.f46653o;
                if (hVar != null && hVar.f46930a > 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = hVar.f46931b[0];
                    com.fyber.inneractive.sdk.player.exoplayer2.o oVar = bVar == null ? null : bVar.f46924d[bVar.a()];
                    if (oVar != null) {
                        int i11 = oVar.f46793j;
                        int i12 = oVar.f46794k;
                        fVar.f45497t = i11;
                        fVar.f45498u = i12;
                    }
                }
                this.f45482b = true;
                fVar.a(com.fyber.inneractive.sdk.player.enums.b.Prepared);
                return;
            }
            return;
        }
        fVar.a(com.fyber.inneractive.sdk.player.enums.b.Playing);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onRenderedFirstFrame(Surface surface) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoEnabled(DecoderCounters decoderCounters) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoInputFormatChanged(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onDroppedFrames(int i10, long j10) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDecoderInitialized(String str, long j10, long j11) {
    }
}
