package com.inmobi.media;

import android.media.MediaPlayer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Hm implements ds.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaPlayer f54810a;

    public Hm(MediaPlayer mediaPlayer) {
        this.f54810a = mediaPlayer;
    }

    @Override // ds.l
    public final Object invoke(Object obj) {
        this.f54810a.release();
        return dr.w2.f79517a;
    }
}
