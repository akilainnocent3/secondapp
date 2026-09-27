package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class e01 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f148442e = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f148443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f148444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f148445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f148446d = new byte[128];

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f148443a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f148446d;
            int length = bArr2.length;
            int i13 = this.f148444b + i12;
            if (length < i13) {
                this.f148446d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f148446d, this.f148444b, i12);
            this.f148444b += i12;
        }
    }
}
