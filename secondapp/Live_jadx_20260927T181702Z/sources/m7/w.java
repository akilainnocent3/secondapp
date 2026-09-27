package m7;

import java.util.Arrays;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f107086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f107087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f107088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f107089e;

    public w(int i10, int i11) {
        this.f107085a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f107088d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f107086b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f107088d;
            int length = bArr2.length;
            int i13 = this.f107089e;
            if (length < i13 + i12) {
                this.f107088d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f107088d, this.f107089e, i12);
            this.f107089e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f107086b) {
            return false;
        }
        this.f107089e -= i10;
        this.f107086b = false;
        this.f107087c = true;
        return true;
    }

    public boolean c() {
        return this.f107087c;
    }

    public void d() {
        this.f107086b = false;
        this.f107087c = false;
    }

    public void e(int i10) {
        zi.l0.g0(!this.f107086b);
        boolean z10 = i10 == this.f107085a;
        this.f107086b = z10;
        if (z10) {
            this.f107089e = 3;
            this.f107087c = false;
        }
    }
}
