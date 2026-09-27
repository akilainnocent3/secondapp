package xr;

import dr.g1;
import dr.l1;
import fr.d0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@cs.j(name = "ByteStreamsKt")
public final class b {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends d0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f145497b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f145498c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f145499d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ BufferedInputStream f145500e;

        public a(BufferedInputStream bufferedInputStream) {
            this.f145500e = bufferedInputStream;
        }

        public final boolean b() {
            return this.f145499d;
        }

        public final int d() {
            return this.f145497b;
        }

        public final boolean e() {
            return this.f145498c;
        }

        public final void f() throws IOException {
            if (this.f145498c || this.f145499d) {
                return;
            }
            int i10 = this.f145500e.read();
            this.f145497b = i10;
            this.f145498c = true;
            this.f145499d = i10 == -1;
        }

        public final void g(boolean z10) {
            this.f145499d = z10;
        }

        public final void h(int i10) {
            this.f145497b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            f();
            return !this.f145499d;
        }

        public final void i(boolean z10) {
            this.f145498c = z10;
        }

        @Override // fr.d0
        public byte nextByte() throws IOException {
            f();
            if (this.f145499d) {
                throw new NoSuchElementException("Input stream is over.");
            }
            byte b10 = (byte) this.f145497b;
            this.f145498c = false;
            return b10;
        }
    }

    @ur.f
    public static final BufferedInputStream a(InputStream inputStream, int i10) {
        m0.p(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i10);
    }

    @ur.f
    public static final BufferedOutputStream b(OutputStream outputStream, int i10) {
        m0.p(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i10);
    }

    public static /* synthetic */ BufferedInputStream c(InputStream inputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        m0.p(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i10);
    }

    public static /* synthetic */ BufferedOutputStream d(OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        m0.p(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i10);
    }

    @ur.f
    public static final BufferedReader e(InputStream inputStream, Charset charset) {
        m0.p(inputStream, "<this>");
        m0.p(charset, "charset");
        return new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
    }

    public static /* synthetic */ BufferedReader f(InputStream inputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = cv.g.f77202b;
        }
        m0.p(inputStream, "<this>");
        m0.p(charset, "charset");
        return new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
    }

    @ur.f
    public static final BufferedWriter g(OutputStream outputStream, Charset charset) {
        m0.p(outputStream, "<this>");
        m0.p(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
    }

    public static /* synthetic */ BufferedWriter h(OutputStream outputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = cv.g.f77202b;
        }
        m0.p(outputStream, "<this>");
        m0.p(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
    }

    @ur.f
    public static final ByteArrayInputStream i(String str, Charset charset) {
        m0.p(str, "<this>");
        m0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        m0.o(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }

    public static /* synthetic */ ByteArrayInputStream j(String str, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = cv.g.f77202b;
        }
        m0.p(str, "<this>");
        m0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        m0.o(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }

    public static final long k(@oy.l InputStream inputStream, @oy.l OutputStream out, int i10) throws IOException {
        m0.p(inputStream, "<this>");
        m0.p(out, "out");
        byte[] bArr = new byte[i10];
        int i11 = inputStream.read(bArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(bArr, 0, i11);
            j10 += (long) i11;
            i11 = inputStream.read(bArr);
        }
        return j10;
    }

    public static /* synthetic */ long l(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return k(inputStream, outputStream, i10);
    }

    @ur.f
    public static final ByteArrayInputStream m(byte[] bArr) {
        m0.p(bArr, "<this>");
        return new ByteArrayInputStream(bArr);
    }

    @ur.f
    public static final ByteArrayInputStream n(byte[] bArr, int i10, int i11) {
        m0.p(bArr, "<this>");
        return new ByteArrayInputStream(bArr, i10, i11);
    }

    @oy.l
    public static final d0 o(@oy.l BufferedInputStream bufferedInputStream) {
        m0.p(bufferedInputStream, "<this>");
        return new a(bufferedInputStream);
    }

    @oy.l
    @l1(version = "1.3")
    public static final byte[] p(@oy.l InputStream inputStream) {
        m0.p(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        m0.o(byteArray, "toByteArray(...)");
        return byteArray;
    }

    @oy.l
    @dr.p(errorSince = "1.5", warningSince = "1.3")
    @dr.o(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @g1(expression = "readBytes()", imports = {}))
    public static final byte[] q(@oy.l InputStream inputStream, int i10) {
        m0.p(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i10, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        m0.o(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static /* synthetic */ byte[] r(InputStream inputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        return q(inputStream, i10);
    }

    @ur.f
    public static final InputStreamReader s(InputStream inputStream, Charset charset) {
        m0.p(inputStream, "<this>");
        m0.p(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    public static /* synthetic */ InputStreamReader t(InputStream inputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = cv.g.f77202b;
        }
        m0.p(inputStream, "<this>");
        m0.p(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    @ur.f
    public static final OutputStreamWriter u(OutputStream outputStream, Charset charset) {
        m0.p(outputStream, "<this>");
        m0.p(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    public static /* synthetic */ OutputStreamWriter v(OutputStream outputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = cv.g.f77202b;
        }
        m0.p(outputStream, "<this>");
        m0.p(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }
}
