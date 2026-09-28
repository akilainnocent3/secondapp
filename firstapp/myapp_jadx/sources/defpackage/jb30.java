package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class jb30 implements Closeable {
    public static final Logger i = Logger.getLogger(jb30.class.getName());
    public final RandomAccessFile a;
    public int b;
    public int c;
    public b d;
    public b e;
    public final byte[] f;

    public class a implements d {
        public boolean a = true;
        public final /* synthetic */ StringBuilder b;

        public a(StringBuilder sb) {
            this.b = sb;
        }

        @Override // jb30.d
        public final void a(c cVar, int i) {
            boolean z = this.a;
            StringBuilder sb = this.b;
            if (z) {
                this.a = false;
            } else {
                sb.append(", ");
            }
            sb.append(i);
        }
    }

    public static class b {
        public static final b c = new b(0, 0);
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(b.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.a);
            sb.append(", length = ");
            return zk1.a(this.b, "]", sb);
        }
    }

    public interface d {
        void a(c cVar, int i);
    }

    public jb30(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    V(bArr2, i2, iArr[i3]);
                    i2 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    i08.a("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iO = o(0, bArr);
        this.b = iO;
        if (iO <= randomAccessFile2.length()) {
            this.c = o(4, bArr);
            int iO2 = o(8, bArr);
            int iO3 = o(12, bArr);
            this.d = m(iO2);
            this.e = m(iO3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + randomAccessFile2.length());
    }

    public static void V(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    public static int o(int i2, byte[] bArr) {
        return ((bArr[i2] & 255) << 24) + ((bArr[i2 + 1] & 255) << 16) + ((bArr[i2 + 2] & 255) << 8) + (bArr[i2 + 3] & 255);
    }

    public final void F(int i2, int i3, int i4, byte[] bArr) throws IOException {
        int iJ = J(i2);
        int i5 = iJ + i4;
        int i6 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i5 <= i6) {
            randomAccessFile.seek(iJ);
            randomAccessFile.readFully(bArr, i3, i4);
            return;
        }
        int i7 = i6 - iJ;
        randomAccessFile.seek(iJ);
        randomAccessFile.readFully(bArr, i3, i7);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i3 + i7, i4 - i7);
    }

    public final void G(byte[] bArr, int i2, int i3) throws IOException {
        int iJ = J(i2);
        int i4 = iJ + i3;
        int i5 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i4 <= i5) {
            randomAccessFile.seek(iJ);
            randomAccessFile.write(bArr, 0, i3);
            return;
        }
        int i6 = i5 - iJ;
        randomAccessFile.seek(iJ);
        randomAccessFile.write(bArr, 0, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i6, i3 - i6);
    }

    public final int H() {
        if (this.c == 0) {
            return 16;
        }
        b bVar = this.e;
        int i2 = bVar.a;
        int i3 = this.d.a;
        return i2 >= i3 ? (i2 - i3) + 4 + bVar.b + 16 : (((i2 + 4) + bVar.b) + this.b) - i3;
    }

    public final int J(int i2) {
        int i3 = this.b;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    public final void P(int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr = {i2, i3, i4, i5};
        int i6 = 0;
        int i7 = 0;
        while (true) {
            byte[] bArr = this.f;
            if (i6 >= 4) {
                RandomAccessFile randomAccessFile = this.a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                V(bArr, i7, iArr[i6]);
                i7 += 4;
                i6++;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    public final void d(byte[] bArr) {
        int iJ;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    f(length);
                    boolean zL = l();
                    if (zL) {
                        iJ = 16;
                    } else {
                        b bVar = this.e;
                        iJ = J(bVar.a + 4 + bVar.b);
                    }
                    b bVar2 = new b(iJ, length);
                    V(this.f, 0, length);
                    G(this.f, iJ, 4);
                    G(bArr, iJ + 4, length);
                    P(this.b, this.c + 1, zL ? iJ : this.d.a, iJ);
                    this.e = bVar2;
                    this.c++;
                    if (zL) {
                        this.d = bVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void f(int i2) throws IOException {
        int i3 = i2 + 4;
        int iH = this.b - H();
        if (iH >= i3) {
            return;
        }
        int i4 = this.b;
        do {
            iH += i4;
            i4 <<= 1;
        } while (iH < i3);
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.setLength(i4);
        randomAccessFile.getChannel().force(true);
        b bVar = this.e;
        int iJ = J(bVar.a + 4 + bVar.b);
        if (iJ < this.d.a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.b);
            long j = iJ - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                jb5.a("Copied insufficient number of bytes!");
                return;
            }
        }
        int i5 = this.e.a;
        int i6 = this.d.a;
        if (i5 < i6) {
            int i7 = (this.b + i5) - 16;
            P(i4, this.c, i6, i7);
            this.e = new b(i7, this.e.b);
        } else {
            P(i4, this.c, i6, i5);
        }
        this.b = i4;
    }

    public final synchronized void g(d dVar) {
        int iJ = this.d.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            b bVarM = m(iJ);
            dVar.a(new c(bVarM), bVarM.b);
            iJ = J(bVarM.a + 4 + bVarM.b);
        }
    }

    public final synchronized boolean l() {
        return this.c == 0;
    }

    public final b m(int i2) throws IOException {
        if (i2 == 0) {
            return b.c;
        }
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.seek(i2);
        return new b(i2, randomAccessFile.readInt());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(jb30.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", first=");
        sb.append(this.d);
        sb.append(", last=");
        sb.append(this.e);
        sb.append(", element lengths=[");
        try {
            g(new a(sb));
        } catch (IOException e) {
            i.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final synchronized void u() {
        if (l()) {
            throw new NoSuchElementException();
        }
        if (this.c == 1) {
            synchronized (this) {
                P(4096, 0, 0, 0);
                this.c = 0;
                b bVar = b.c;
                this.d = bVar;
                this.e = bVar;
                if (this.b > 4096) {
                    RandomAccessFile randomAccessFile = this.a;
                    randomAccessFile.setLength(4096L);
                    randomAccessFile.getChannel().force(true);
                }
                this.b = 4096;
            }
        } else {
            b bVar2 = this.d;
            int iJ = J(bVar2.a + 4 + bVar2.b);
            F(iJ, 0, 4, this.f);
            int iO = o(0, this.f);
            P(this.b, this.c - 1, iJ, this.e.a);
            this.c--;
            this.d = new b(iJ, iO);
        }
    }

    public final class c extends InputStream {
        public int a;
        public int b;

        public c(b bVar) {
            this.a = jb30.this.J(bVar.a + 4);
            this.b = bVar.b;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            if (bArr == null) {
                bmy.a("buffer");
                return 0;
            }
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.b;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            int i4 = this.a;
            jb30 jb30Var = jb30.this;
            jb30Var.F(i4, i, i2, bArr);
            this.a = jb30Var.J(this.a + i2);
            this.b -= i2;
            return i2;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            jb30 jb30Var = jb30.this;
            RandomAccessFile randomAccessFile = jb30Var.a;
            if (this.b == 0) {
                return -1;
            }
            randomAccessFile.seek(this.a);
            int i = randomAccessFile.read();
            this.a = jb30Var.J(this.a + 1);
            this.b--;
            return i;
        }
    }
}
