package com.mbridge.msdk.playercommon.exoplayer2.text;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface Subtitle {
    List<Cue> getCues(long j10);

    long getEventTime(int i10);

    int getEventTimeCount();

    int getNextEventTimeIndex(long j10);
}
