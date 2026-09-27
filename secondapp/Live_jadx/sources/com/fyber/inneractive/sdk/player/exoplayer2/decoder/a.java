package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;
import c5.g;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f45708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaCodec.CryptoInfo.Pattern f45709b = g.a(0, 0);

    public a(MediaCodec.CryptoInfo cryptoInfo) {
        this.f45708a = cryptoInfo;
    }

    public static void a(a aVar) {
        aVar.f45709b.set(0, 0);
        aVar.f45708a.setPattern(aVar.f45709b);
    }
}
