package ah;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b0 extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f5042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f5043c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5047g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5045e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5046f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f5044d = new byte[1];

    public b0(v vVar, d0 d0Var) {
        this.f5042b = vVar;
        this.f5043c = d0Var;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f5046f) {
            return;
        }
        this.f5042b.close();
        this.f5046f = true;
    }

    public long d() {
        return this.f5047g;
    }

    public final void h() throws IOException {
        if (this.f5045e) {
            return;
        }
        this.f5042b.a(this.f5043c);
        this.f5045e = true;
    }

    public void k() throws IOException {
        h();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f5044d) == -1) {
            return -1;
        }
        return this.f5044d[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        eh.a.i(!this.f5046f);
        h();
        int i12 = this.f5042b.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f5047g += (long) i12;
        return i12;
    }
}
