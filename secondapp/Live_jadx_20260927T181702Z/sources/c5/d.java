package c5;

import android.media.MediaCodec;
import android.os.Build;
import androidx.annotation.Nullable;
import k.t0;
import x4.m1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public byte[] f22395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public byte[] f22396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public int[] f22398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public int[] f22399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f22403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final b f22404j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(24)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f22405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f22406b;

        public final void b(int i10, int i11) {
            this.f22406b.set(i10, i11);
            this.f22405a.setPattern(this.f22406b);
        }

        public b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f22405a = cryptoInfo;
            this.f22406b = g.a(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f22403i = cryptoInfo;
        this.f22404j = Build.VERSION.SDK_INT >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f22403i;
    }

    public void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f22398d == null) {
            int[] iArr = new int[1];
            this.f22398d = iArr;
            this.f22403i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f22398d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f22400f = i10;
        this.f22398d = iArr;
        this.f22399e = iArr2;
        this.f22396b = bArr;
        this.f22395a = bArr2;
        this.f22397c = i11;
        this.f22401g = i12;
        this.f22402h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f22403i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (Build.VERSION.SDK_INT >= 24) {
            ((b) l0.E(this.f22404j)).b(i12, i13);
        }
    }
}
