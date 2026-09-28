package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class x740 implements bc5 {
    public final uw90 a;
    public final lb5 b;
    public boolean c;

    public x740(uw90 uw90Var) {
        uw90Var.getClass();
        this.a = uw90Var;
        this.b = new lb5();
    }

    @Override // defpackage.bc5
    public final bc5 B(int i) {
        if (this.c) {
            ib5.a("closed");
            return null;
        }
        this.b.A0(i);
        d();
        return this;
    }

    @Override // defpackage.bc5
    public final OutputStream F1() {
        return new a();
    }

    @Override // defpackage.bc5
    public final bc5 R(String str) {
        str.getClass();
        if (this.c) {
            ib5.a("closed");
            return null;
        }
        this.b.z0(str);
        d();
        return this;
    }

    @Override // defpackage.bc5
    public final long R0(zpa0 zpa0Var) {
        zpa0Var.getClass();
        long j = 0;
        while (true) {
            long j2 = zpa0Var.read(this.b, 8192L);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            d();
        }
    }

    @Override // defpackage.uw90, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        uw90 uw90Var = this.a;
        if (this.c) {
            return;
        }
        lb5 lb5Var = this.b;
        long j = lb5Var.b;
        if (j > 0) {
            uw90Var.write(lb5Var, j);
        }
        th = null;
        try {
            uw90Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    public final bc5 d() {
        if (this.c) {
            ib5.a("closed");
            return null;
        }
        lb5 lb5Var = this.b;
        long jF = lb5Var.f();
        if (jF > 0) {
            this.a.write(lb5Var, jF);
        }
        return this;
    }

    @Override // defpackage.bc5
    public final lb5 e() {
        return this.b;
    }

    @Override // defpackage.bc5, defpackage.uw90, java.io.Flushable
    public final void flush() {
        if (this.c) {
            ib5.a("closed");
            return;
        }
        lb5 lb5Var = this.b;
        long j = lb5Var.b;
        uw90 uw90Var = this.a;
        if (j > 0) {
            uw90Var.write(lb5Var, j);
        }
        uw90Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.bc5
    public final bc5 j1(long j) {
        if (this.c) {
            ib5.a("closed");
            return null;
        }
        this.b.f0(j);
        d();
        return this;
    }

    @Override // defpackage.bc5
    public final bc5 n1(int i, int i2, String str) {
        str.getClass();
        if (this.c) {
            ib5.a("closed");
            return null;
        }
        this.b.u0(i, i2, str);
        d();
        return this;
    }

    @Override // defpackage.bc5
    public final bc5 o0(rl5 rl5Var) {
        rl5Var.getClass();
        if (this.c) {
            ib5.a("closed");
            return null;
        }
        this.b.c0(rl5Var);
        d();
        return this;
    }

    @Override // defpackage.bc5
    public final bc5 s0(long j) {
        if (this.c) {
            ib5.a("closed");
            return null;
        }
        this.b.e0(j);
        d();
        return this;
    }

    @Override // defpackage.uw90
    public final sxf0 timeout() {
        return this.a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // defpackage.bc5
    public final bc5 write(byte[] bArr) {
        bArr.getClass();
        if (this.c) {
            ib5.a("closed");
            return null;
        }
        this.b.m104write(bArr, 0, bArr.length);
        d();
        return this;
    }

    @Override // defpackage.bc5
    public final bc5 writeByte(int i) {
        if (this.c) {
            ib5.a("closed");
            return null;
        }
        this.b.d0(i);
        d();
        return this;
    }

    @Override // defpackage.bc5
    public final bc5 writeInt(int i) {
        if (this.c) {
            ib5.a("closed");
            return null;
        }
        this.b.g0(i);
        d();
        return this;
    }

    @Override // defpackage.bc5
    public final bc5 writeShort(int i) {
        if (this.c) {
            ib5.a("closed");
            return null;
        }
        this.b.l0(i);
        d();
        return this;
    }

    public static final class a extends OutputStream {
        public a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            x740.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            x740 x740Var = x740.this;
            if (x740Var.c) {
                return;
            }
            x740Var.flush();
        }

        public final String toString() {
            return x740.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            bArr.getClass();
            x740 x740Var = x740.this;
            if (x740Var.c) {
                i08.a("closed");
            } else {
                x740Var.b.m104write(bArr, i, i2);
                x740Var.d();
            }
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            x740 x740Var = x740.this;
            if (!x740Var.c) {
                x740Var.b.d0((byte) i);
                x740Var.d();
            } else {
                i08.a("closed");
            }
        }
    }

    @Override // defpackage.uw90
    public final void write(lb5 lb5Var, long j) {
        lb5Var.getClass();
        if (!this.c) {
            this.b.write(lb5Var, j);
            d();
        } else {
            ib5.a("closed");
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.c) {
            int iWrite = this.b.write(byteBuffer);
            d();
            return iWrite;
        }
        ib5.a("closed");
        return 0;
    }

    @Override // defpackage.bc5
    public final bc5 write(byte[] bArr, int i, int i2) {
        if (!this.c) {
            this.b.m104write(bArr, i, i2);
            d();
            return this;
        }
        ib5.a("closed");
        return null;
    }
}
