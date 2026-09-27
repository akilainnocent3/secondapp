package yt;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f159854b = 0;

    public w d() {
        return new w(this);
    }

    public void e(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        f fVarJ = f.J(outputStream, f.u(f.v(serializedSize) + serializedSize));
        fVarJ.o0(serializedSize);
        a(fVarJ);
        fVarJ.I();
    }

    /* JADX INFO: renamed from: yt.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class AbstractC1559a<BuilderType extends AbstractC1559a> implements q.a {
        public static w d(q qVar) {
            return new w(qVar);
        }

        @Override // 
        /* JADX INFO: renamed from: b */
        public abstract BuilderType m();

        @Override // yt.q.a
        public abstract BuilderType c(e eVar, g gVar) throws IOException;

        /* JADX INFO: renamed from: yt.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C1560a extends FilterInputStream {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f159855b;

            public C1560a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f159855b = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f159855b);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f159855b <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f159855b--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) throws IOException {
                long jSkip = super.skip(Math.min(j10, this.f159855b));
                if (jSkip >= 0) {
                    this.f159855b = (int) (((long) this.f159855b) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f159855b;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f159855b -= i13;
                }
                return i13;
            }
        }
    }
}
