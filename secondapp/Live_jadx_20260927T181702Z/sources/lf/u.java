package lf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f104342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f104343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f104344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f104345e;

    public u(int i10, int i11) {
        this.f104341a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f104344d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f104342b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f104344d;
            int length = bArr2.length;
            int i13 = this.f104345e;
            if (length < i13 + i12) {
                this.f104344d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f104344d, this.f104345e, i12);
            this.f104345e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f104342b) {
            return false;
        }
        this.f104345e -= i10;
        this.f104342b = false;
        this.f104343c = true;
        return true;
    }

    public boolean c() {
        return this.f104343c;
    }

    public void d() {
        this.f104342b = false;
        this.f104343c = false;
    }

    public void e(int i10) {
        eh.a.i(!this.f104342b);
        boolean z10 = i10 == this.f104341a;
        this.f104342b = z10;
        if (z10) {
            this.f104345e = 3;
            this.f104343c = false;
        }
    }
}
