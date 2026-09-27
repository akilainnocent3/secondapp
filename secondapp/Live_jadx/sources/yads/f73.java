package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class f73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f149003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l73 f149005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f149006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f149007e;

    public f73(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        ni.a((bArr2 == null) ^ (i10 == 0));
        this.f149003a = z10;
        this.f149004b = str;
        this.f149006d = i10;
        this.f149007e = bArr2;
        this.f149005c = new l73(a(str), i11, i12, bArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(String str) {
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
                ih1.d("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
