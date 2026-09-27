package yads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class l20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f151845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaCodec.CryptoInfo.Pattern f151846b = c5.g.a(0, 0);

    public l20(MediaCodec.CryptoInfo cryptoInfo) {
        this.f151845a = cryptoInfo;
    }

    public final void a(int i10, int i11) {
        this.f151846b.set(i10, i11);
        this.f151845a.setPattern(this.f151846b);
    }
}
