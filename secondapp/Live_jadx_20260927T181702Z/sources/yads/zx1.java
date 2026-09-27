package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f159080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f159081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f159082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f159083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f159084e;

    public zx1(int i10) {
        this.f159080a = i10;
        byte[] bArr = new byte[131];
        this.f159083d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f159081b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f159083d;
            int length = bArr2.length;
            int i13 = this.f159084e + i12;
            if (length < i13) {
                this.f159083d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f159083d, this.f159084e, i12);
            this.f159084e += i12;
        }
    }

    public final void b(int i10) {
        if (this.f159081b) {
            throw new IllegalStateException();
        }
        boolean z10 = i10 == this.f159080a;
        this.f159081b = z10;
        if (z10) {
            this.f159084e = 3;
            this.f159082c = false;
        }
    }

    public final boolean a(int i10) {
        if (!this.f159081b) {
            return false;
        }
        this.f159084e -= i10;
        this.f159081b = false;
        this.f159082c = true;
        return true;
    }
}
