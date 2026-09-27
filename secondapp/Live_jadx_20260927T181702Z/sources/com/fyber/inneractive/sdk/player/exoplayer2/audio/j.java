package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AudioTrack f45599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f45600b;

    public j(r rVar, AudioTrack audioTrack) {
        this.f45600b = rVar;
        this.f45599a = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f45599a.flush();
            this.f45599a.release();
        } finally {
            this.f45600b.f45624e.open();
        }
    }
}
