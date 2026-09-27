package hk;

import com.ironsource.C4235d4;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class h implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f88426h = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f88427i = 4096;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f88428j = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RandomAccessFile f88429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f88432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f88433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f88434g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f88435a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f88436b;

        public a(StringBuilder sb2) {
            this.f88436b = sb2;
        }

        @Override // hk.h.d
        public void a(InputStream inputStream, int i10) throws IOException {
            if (this.f88435a) {
                this.f88435a = false;
            } else {
                this.f88436b.append(", ");
            }
            this.f88436b.append(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f88438c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f88439d = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f88440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f88441b;

        public b(int i10, int i11) {
            this.f88440a = i10;
            this.f88441b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f88440a + ", length = " + this.f88441b + C4235d4.j.f61462e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class c extends InputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f88442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f88443c;

        public /* synthetic */ c(h hVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            h.q(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f88443c;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            h.this.I(this.f88442b, bArr, i10, i11);
            this.f88442b = h.this.U(this.f88442b + i11);
            this.f88443c -= i11;
            return i11;
        }

        public c(b bVar) {
            this.f88442b = h.this.U(bVar.f88440a + 4);
            this.f88443c = bVar.f88441b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f88443c == 0) {
                return -1;
            }
            h.this.f88429b.seek(this.f88442b);
            int i10 = h.this.f88429b.read();
            this.f88442b = h.this.U(this.f88442b + 1);
            this.f88443c--;
            return i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        void a(InputStream inputStream, int i10) throws IOException;
    }

    public h(File file) throws IOException {
        this.f88434g = new byte[16];
        if (!file.exists()) {
            o(file);
        }
        this.f88429b = r(file);
        E();
    }

    public static int F(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    public static void Y(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public static void d0(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            Y(bArr, i10, i11);
            i10 += 4;
        }
    }

    public static void o(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileR = r(file2);
        try {
            randomAccessFileR.setLength(4096L);
            randomAccessFileR.seek(0L);
            byte[] bArr = new byte[16];
            d0(bArr, 4096, 0, 0, 0);
            randomAccessFileR.write(bArr);
            randomAccessFileR.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th2) {
            randomAccessFileR.close();
            throw th2;
        }
    }

    public static <T> T q(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static RandomAccessFile r(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    public final b D(int i10) throws IOException {
        if (i10 == 0) {
            return b.f88439d;
        }
        this.f88429b.seek(i10);
        return new b(i10, this.f88429b.readInt());
    }

    public final void E() throws IOException {
        this.f88429b.seek(0L);
        this.f88429b.readFully(this.f88434g);
        int iF = F(this.f88434g, 0);
        this.f88430c = iF;
        if (iF <= this.f88429b.length()) {
            this.f88431d = F(this.f88434g, 4);
            int iF2 = F(this.f88434g, 8);
            int iF3 = F(this.f88434g, 12);
            this.f88432e = D(iF2);
            this.f88433f = D(iF3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f88430c + ", Actual length: " + this.f88429b.length());
    }

    public final int G() {
        return this.f88430c - S();
    }

    public synchronized void H() throws IOException {
        try {
            if (p()) {
                throw new NoSuchElementException();
            }
            if (this.f88431d == 1) {
                k();
            } else {
                b bVar = this.f88432e;
                int iU = U(bVar.f88440a + 4 + bVar.f88441b);
                I(iU, this.f88434g, 0, 4);
                int iF = F(this.f88434g, 0);
                W(this.f88430c, this.f88431d - 1, iU, this.f88433f.f88440a);
                this.f88431d--;
                this.f88432e = new b(iU, iF);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void I(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iU = U(i10);
        int i13 = iU + i12;
        int i14 = this.f88430c;
        if (i13 <= i14) {
            this.f88429b.seek(iU);
            this.f88429b.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iU;
        this.f88429b.seek(iU);
        this.f88429b.readFully(bArr, i11, i15);
        this.f88429b.seek(16L);
        this.f88429b.readFully(bArr, i11 + i15, i12 - i15);
    }

    public final void L(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iU = U(i10);
        int i13 = iU + i12;
        int i14 = this.f88430c;
        if (i13 <= i14) {
            this.f88429b.seek(iU);
            this.f88429b.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iU;
        this.f88429b.seek(iU);
        this.f88429b.write(bArr, i11, i15);
        this.f88429b.seek(16L);
        this.f88429b.write(bArr, i11 + i15, i12 - i15);
    }

    public final void N(int i10) throws IOException {
        this.f88429b.setLength(i10);
        this.f88429b.getChannel().force(true);
    }

    public synchronized int O() {
        return this.f88431d;
    }

    public int S() {
        if (this.f88431d == 0) {
            return 16;
        }
        b bVar = this.f88433f;
        int i10 = bVar.f88440a;
        int i11 = this.f88432e.f88440a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f88441b + 16 : (((i10 + 4) + bVar.f88441b) + this.f88430c) - i11;
    }

    public final int U(int i10) {
        int i11 = this.f88430c;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public final void W(int i10, int i11, int i12, int i13) throws IOException {
        d0(this.f88434g, i10, i11, i12, i13);
        this.f88429b.seek(0L);
        this.f88429b.write(this.f88434g);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f88429b.close();
    }

    public void h(byte[] bArr) throws IOException {
        i(bArr, 0, bArr.length);
    }

    public synchronized void i(byte[] bArr, int i10, int i11) throws IOException {
        int iU;
        try {
            q(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            l(i11);
            boolean zP = p();
            if (zP) {
                iU = 16;
            } else {
                b bVar = this.f88433f;
                iU = U(bVar.f88440a + 4 + bVar.f88441b);
            }
            b bVar2 = new b(iU, i11);
            Y(this.f88434g, 0, i11);
            L(bVar2.f88440a, this.f88434g, 0, 4);
            L(bVar2.f88440a + 4, bArr, i10, i11);
            W(this.f88430c, this.f88431d + 1, zP ? bVar2.f88440a : this.f88432e.f88440a, bVar2.f88440a);
            this.f88433f = bVar2;
            this.f88431d++;
            if (zP) {
                this.f88432e = bVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void k() throws IOException {
        try {
            W(4096, 0, 0, 0);
            this.f88431d = 0;
            b bVar = b.f88439d;
            this.f88432e = bVar;
            this.f88433f = bVar;
            if (this.f88430c > 4096) {
                N(4096);
            }
            this.f88430c = 4096;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void l(int i10) throws IOException {
        int i11 = i10 + 4;
        int iG = G();
        if (iG >= i11) {
            return;
        }
        int i12 = this.f88430c;
        do {
            iG += i12;
            i12 <<= 1;
        } while (iG < i11);
        N(i12);
        b bVar = this.f88433f;
        int iU = U(bVar.f88440a + 4 + bVar.f88441b);
        if (iU < this.f88432e.f88440a) {
            FileChannel channel = this.f88429b.getChannel();
            channel.position(this.f88430c);
            long j10 = iU - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f88433f.f88440a;
        int i14 = this.f88432e.f88440a;
        if (i13 < i14) {
            int i15 = (this.f88430c + i13) - 16;
            W(i12, this.f88431d, i14, i15);
            this.f88433f = new b(i15, this.f88433f.f88441b);
        } else {
            W(i12, this.f88431d, i14, i13);
        }
        this.f88430c = i12;
    }

    public synchronized void m(d dVar) throws IOException {
        int iU = this.f88432e.f88440a;
        for (int i10 = 0; i10 < this.f88431d; i10++) {
            b bVarD = D(iU);
            dVar.a(new c(this, bVarD, null), bVarD.f88441b);
            iU = U(bVarD.f88440a + 4 + bVarD.f88441b);
        }
    }

    public boolean n(int i10, int i11) {
        return (S() + 4) + i10 <= i11;
    }

    public synchronized boolean p() {
        return this.f88431d == 0;
    }

    public synchronized void t(d dVar) throws IOException {
        if (this.f88431d > 0) {
            dVar.a(new c(this, this.f88432e, null), this.f88432e.f88441b);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(fw.b.f85384k);
        sb2.append("fileLength=");
        sb2.append(this.f88430c);
        sb2.append(", size=");
        sb2.append(this.f88431d);
        sb2.append(", first=");
        sb2.append(this.f88432e);
        sb2.append(", last=");
        sb2.append(this.f88433f);
        sb2.append(", element lengths=[");
        try {
            m(new a(sb2));
        } catch (IOException e10) {
            f88426h.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public synchronized byte[] y() throws IOException {
        if (p()) {
            return null;
        }
        b bVar = this.f88432e;
        int i10 = bVar.f88441b;
        byte[] bArr = new byte[i10];
        I(bVar.f88440a + 4, bArr, 0, i10);
        return bArr;
    }

    public h(RandomAccessFile randomAccessFile) throws IOException {
        this.f88434g = new byte[16];
        this.f88429b = randomAccessFile;
        E();
    }
}
