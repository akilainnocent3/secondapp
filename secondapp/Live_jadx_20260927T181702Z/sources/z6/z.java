package z6;

import androidx.annotation.Nullable;
import f6.f1;
import x4.m1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f160826f = "TrackEncryptionBox";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f160827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f160828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1.a f160829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f160830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final byte[] f160831e;

    public z(boolean z10, @Nullable String str, int i10, byte[] bArr, int i11, int i12, @Nullable byte[] bArr2) {
        l0.d((bArr2 == null) ^ (i10 == 0));
        this.f160827a = z10;
        this.f160828b = str;
        this.f160830d = i10;
        this.f160831e = bArr2;
        this.f160829c = new f1.a(a(str), bArr, i11, i12);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(@Nullable String str) {
        if (str == null) {
            return 1;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b10 = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b10 = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b10 = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b10 = 3;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return 2;
            default:
                x4.d0.n("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
