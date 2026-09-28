package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: classes5.dex */
public final class v7v implements tse {
    public final /* synthetic */ ExoPlayer a;

    public v7v(ExoPlayer exoPlayer) {
        this.a = exoPlayer;
    }

    @Override // defpackage.tse
    public final void dispose() {
        this.a.release();
    }
}
