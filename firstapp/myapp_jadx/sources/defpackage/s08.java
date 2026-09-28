package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
public abstract class s08 {
    public static final int a;
    public static final ThreadLocal<b> b;

    public static abstract class a extends s08 {
        public final byte[] c;
        public final int d;
        public int e;

        public a(int i) {
            byte[] bArr = new byte[i];
            this.c = bArr;
            this.d = bArr.length;
        }
    }

    public static final class b extends a {
        public OutputStream f;

        public final void c() throws IOException {
            this.f.write(this.c, 0, this.e);
            this.e = 0;
        }

        public final void d(int i) throws IOException {
            if (this.d - this.e < i) {
                c();
            }
        }

        public final void e(byte b) throws IOException {
            if (this.e == this.d) {
                c();
            }
            int i = this.e;
            this.e = i + 1;
            this.c[i] = b;
        }

        public final void f(int i, byte[] bArr) throws IOException {
            int i2 = this.e;
            int i3 = this.d;
            int i4 = i3 - i2;
            byte[] bArr2 = this.c;
            if (i4 >= i) {
                System.arraycopy(bArr, 0, bArr2, i2, i);
                this.e += i;
                return;
            }
            System.arraycopy(bArr, 0, bArr2, i2, i4);
            int i5 = i - i4;
            this.e = i3;
            c();
            if (i5 > i3) {
                this.f.write(bArr, i4, i5);
            } else {
                System.arraycopy(bArr, i4, bArr2, 0, i5);
                this.e = i5;
            }
        }

        public final void g(long j) throws IOException {
            d(8);
            int i = this.e;
            int i2 = i + 1;
            this.e = i2;
            byte[] bArr = this.c;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.e = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.e = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.e = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.e = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.e = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.e = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.e = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        }

        public final void h(int i) throws IOException {
            d(5);
            while (true) {
                int i2 = i & (-128);
                int i3 = this.e;
                byte[] bArr = this.c;
                if (i2 == 0) {
                    this.e = i3 + 1;
                    bArr[i3] = (byte) i;
                    return;
                } else {
                    this.e = i3 + 1;
                    bArr[i3] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
            }
        }

        public final void i(long j) throws IOException {
            d(10);
            while (true) {
                long j2 = (-128) & j;
                int i = this.e;
                byte[] bArr = this.c;
                if (j2 == 0) {
                    this.e = i + 1;
                    bArr[i] = (byte) j;
                    return;
                } else {
                    this.e = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
            }
        }
    }

    static {
        int i = 51200;
        try {
            String strA = ipa.a("otel.experimental.otlp.buffer-size", "");
            if (!strA.isEmpty()) {
                i = Integer.parseInt(strA);
            }
        } catch (Throwable unused) {
        }
        a = i;
        b = new ThreadLocal<>();
    }

    public static int a(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int b(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }
}
