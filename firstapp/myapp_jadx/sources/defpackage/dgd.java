package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class dgd implements fja0 {
    public final Socket a;
    public final AtomicInteger b = new AtomicInteger();
    public final b c = new b();
    public final a d = new a();

    public final class a implements uw90 {
        public final OutputStream a;
        public final gja0 b;

        public a() {
            Socket socket = dgd.this.a;
            this.a = socket.getOutputStream();
            this.b = new gja0(socket);
        }

        @Override // defpackage.uw90, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            int i;
            OutputStream outputStream = this.a;
            dgd dgdVar = dgd.this;
            gja0 gja0Var = this.b;
            gja0Var.enter();
            try {
                try {
                    AtomicInteger atomicInteger = dgdVar.b;
                    Socket socket = dgdVar.a;
                    atomicInteger.getClass();
                    while (true) {
                        int i2 = atomicInteger.get();
                        if ((i2 & 1) != 0) {
                            i = 0;
                            break;
                        }
                        int i3 = i2 | 1;
                        if (atomicInteger.compareAndSet(i2, i3)) {
                            i = i3;
                            break;
                        }
                    }
                    if (i == 0) {
                        gja0Var.exit();
                        return;
                    }
                    if (i != 3) {
                        if (!socket.isClosed() && !socket.isOutputShutdown()) {
                            outputStream.flush();
                            try {
                                socket.shutdownOutput();
                            } catch (UnsupportedOperationException unused) {
                                outputStream.close();
                            }
                        }
                        gja0Var.exit();
                        return;
                    }
                    socket.close();
                    Unit unit = Unit.a;
                    if (gja0Var.exit()) {
                        throw gja0Var.access$newTimeoutException(null);
                    }
                } catch (IOException e) {
                    if (!gja0Var.exit()) {
                        throw e;
                    }
                    throw gja0Var.access$newTimeoutException(e);
                }
            } catch (Throwable th) {
                gja0Var.exit();
                throw th;
            }
        }

        @Override // defpackage.uw90, java.io.Flushable
        public final void flush() throws IOException {
            gja0 gja0Var = this.b;
            gja0Var.enter();
            try {
                try {
                    this.a.flush();
                    Unit unit = Unit.a;
                    if (gja0Var.exit()) {
                        throw gja0Var.access$newTimeoutException(null);
                    }
                } catch (IOException e) {
                    if (!gja0Var.exit()) {
                        throw e;
                    }
                    throw gja0Var.access$newTimeoutException(e);
                }
            } catch (Throwable th) {
                gja0Var.exit();
                throw th;
            }
        }

        @Override // defpackage.uw90
        public final sxf0 timeout() {
            return this.b;
        }

        public final String toString() {
            return "sink(" + dgd.this.a + ')';
        }

        @Override // defpackage.uw90
        public final void write(lb5 lb5Var, long j) throws IOException {
            lb5Var.getClass();
            l.b(lb5Var.b, 0L, j);
            while (j > 0) {
                gja0 gja0Var = this.b;
                gja0Var.throwIfReached();
                e580 e580Var = lb5Var.a;
                e580Var.getClass();
                int iMin = (int) Math.min(j, e580Var.c - e580Var.b);
                gja0Var.enter();
                try {
                    try {
                        this.a.write(e580Var.a, e580Var.b, iMin);
                        Unit unit = Unit.a;
                        if (gja0Var.exit()) {
                            throw gja0Var.access$newTimeoutException(null);
                        }
                        int i = e580Var.b + iMin;
                        e580Var.b = i;
                        long j2 = iMin;
                        j -= j2;
                        lb5Var.b -= j2;
                        if (i == e580Var.c) {
                            lb5Var.a = e580Var.a();
                            h580.a(e580Var);
                        }
                    } catch (IOException e) {
                        if (!gja0Var.exit()) {
                            throw e;
                        }
                        throw gja0Var.access$newTimeoutException(e);
                    }
                } catch (Throwable th) {
                    gja0Var.exit();
                    throw th;
                }
            }
        }
    }

    public final class b implements zpa0 {
        public final InputStream a;
        public final gja0 b;

        public b() {
            Socket socket = dgd.this.a;
            this.a = socket.getInputStream();
            this.b = new gja0(socket);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            int i;
            dgd dgdVar = dgd.this;
            gja0 gja0Var = this.b;
            gja0Var.enter();
            try {
                try {
                    AtomicInteger atomicInteger = dgdVar.b;
                    Socket socket = dgdVar.a;
                    atomicInteger.getClass();
                    while (true) {
                        int i2 = atomicInteger.get();
                        if ((i2 & 2) != 0) {
                            i = 0;
                            break;
                        }
                        int i3 = i2 | 2;
                        if (atomicInteger.compareAndSet(i2, i3)) {
                            i = i3;
                            break;
                        }
                    }
                    if (i == 0) {
                        gja0Var.exit();
                        return;
                    }
                    if (i == 3) {
                        socket.close();
                    } else if (socket.isClosed() || socket.isInputShutdown()) {
                        gja0Var.exit();
                        return;
                    } else {
                        try {
                            socket.shutdownInput();
                        } catch (UnsupportedOperationException unused) {
                            this.a.close();
                        }
                    }
                    Unit unit = Unit.a;
                    if (gja0Var.exit()) {
                        throw gja0Var.access$newTimeoutException(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!gja0Var.exit()) {
                        throw e;
                    }
                    throw gja0Var.access$newTimeoutException(e);
                }
            } catch (Throwable th) {
                gja0Var.exit();
                throw th;
            }
            gja0Var.exit();
            throw th;
        }

        @Override // defpackage.zpa0
        public final long read(lb5 lb5Var, long j) throws IOException {
            lb5Var.getClass();
            if (j == 0) {
                return 0L;
            }
            if (j < 0) {
                kb5.a(avg.a(j, "byteCount < 0: "));
                return 0L;
            }
            gja0 gja0Var = this.b;
            gja0Var.throwIfReached();
            e580 e580VarB0 = lb5Var.b0(1);
            int iMin = (int) Math.min(j, 8192 - e580VarB0.c);
            try {
                gja0Var.enter();
                try {
                    try {
                        int i = this.a.read(e580VarB0.a, e580VarB0.c, iMin);
                        if (gja0Var.exit()) {
                            throw gja0Var.access$newTimeoutException(null);
                        }
                        if (i != -1) {
                            e580VarB0.c += i;
                            long j2 = i;
                            lb5Var.b += j2;
                            return j2;
                        }
                        if (e580VarB0.b != e580VarB0.c) {
                            return -1L;
                        }
                        lb5Var.a = e580VarB0.a();
                        h580.a(e580VarB0);
                        return -1L;
                    } catch (IOException e) {
                        if (gja0Var.exit()) {
                            throw gja0Var.access$newTimeoutException(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    gja0Var.exit();
                    throw th;
                }
            } catch (AssertionError e2) {
                if (cdk0.a(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            }
        }

        @Override // defpackage.zpa0
        public final sxf0 timeout() {
            return this.b;
        }

        public final String toString() {
            return "source(" + dgd.this.a + ')';
        }
    }

    public dgd(Socket socket) {
        this.a = socket;
    }

    @Override // defpackage.fja0
    public final void cancel() throws IOException {
        this.a.close();
    }

    @Override // defpackage.fja0
    public final uw90 getSink() {
        return this.d;
    }

    @Override // defpackage.fja0
    public final zpa0 getSource() {
        return this.c;
    }

    public final String toString() {
        String string = this.a.toString();
        string.getClass();
        return string;
    }
}
