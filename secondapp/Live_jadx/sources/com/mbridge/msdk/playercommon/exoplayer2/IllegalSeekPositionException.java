package com.mbridge.msdk.playercommon.exoplayer2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final Timeline timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(Timeline timeline, int i10, long j10) {
        this.timeline = timeline;
        this.windowIndex = i10;
        this.positionMs = j10;
    }
}
