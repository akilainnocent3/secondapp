package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f45710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f45711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f45712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f45713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f45714e;

    public b() {
        int i10 = z.f47158a;
        MediaCodec.CryptoInfo cryptoInfo = i10 >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f45713d = cryptoInfo;
        this.f45714e = i10 >= 24 ? new a(cryptoInfo) : null;
    }

    public final void a(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2) {
        this.f45711b = iArr;
        this.f45712c = iArr2;
        this.f45710a = bArr2;
        int i11 = z.f47158a;
        if (i11 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f45713d;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i11 >= 24) {
                a.a(this.f45714e);
            }
        }
    }
}
