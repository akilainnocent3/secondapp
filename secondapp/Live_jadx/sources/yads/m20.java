package yads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class m20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f152268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f152269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f152270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f152271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f152272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f152273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f152274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f152275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f152276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l20 f152277j;

    public m20() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f152276i = cryptoInfo;
        this.f152277j = ib3.f150516a >= 24 ? new l20(cryptoInfo) : null;
    }

    public final void a(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f152273f = i10;
        this.f152271d = iArr;
        this.f152272e = iArr2;
        this.f152269b = bArr;
        this.f152268a = bArr2;
        this.f152270c = i11;
        this.f152274g = i12;
        this.f152275h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f152276i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (ib3.f150516a >= 24) {
            l20 l20Var = this.f152277j;
            l20Var.getClass();
            l20Var.a(i12, i13);
        }
    }
}
