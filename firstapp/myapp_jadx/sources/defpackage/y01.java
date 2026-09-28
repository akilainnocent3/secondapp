package defpackage;

import androidx.transition.nfj.CaBJCMnsV;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001:\u0002*+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010)\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006,"}, d2 = {"Ly01;", "Lsxf0;", "<init>", "()V", "", "enter", "", JsPluginCommon.GAMES_EXIT, "()Z", "cancel", "", "now", "remainingNanos$okio", "(J)J", "remainingNanos", "setTimeoutAt$okio", "(J)V", "setTimeoutAt", "Luw90;", "sink", "(Luw90;)Luw90;", "Lzpa0;", "source", "(Lzpa0;)Lzpa0;", "T", "Lkotlin/Function0;", "block", "withTimeout", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "access$newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "", "index", "I", "value", "f", "J", "getTimeoutAt$okio", "()J", "timeoutAt", "b", "a", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class y01 extends sxf0 {
    public static final a g = new a();
    public static final pw20 h;
    public static y01 i;
    public static final ReentrantLock j;
    public static final Condition k;
    public static final long l;
    public static final long m;
    public int e;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long timeoutAt;
    public int index = -1;

    public static final class b extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    y01.g.getClass();
                    ReentrantLock reentrantLock = y01.j;
                    reentrantLock.lock();
                    try {
                        y01.g.getClass();
                        y01 y01VarA = a.a();
                        y01.g.getClass();
                        if (y01VarA == y01.i) {
                            y01.g.getClass();
                            y01.i = null;
                            reentrantLock.unlock();
                            return;
                        } else {
                            Unit unit = Unit.a;
                            reentrantLock.unlock();
                            if (y01VarA != null) {
                                y01VarA.b();
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
            }
        }
    }

    public static final class c implements uw90 {
        public final /* synthetic */ uw90 b;

        public c(uw90 uw90Var) {
            this.b = uw90Var;
        }

        @Override // defpackage.uw90, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            uw90 uw90Var = this.b;
            y01 y01Var = y01.this;
            y01Var.enter();
            try {
                try {
                    uw90Var.close();
                    Unit unit = Unit.a;
                    if (y01Var.exit()) {
                        throw y01Var.access$newTimeoutException(null);
                    }
                } catch (IOException e) {
                    if (!y01Var.exit()) {
                        throw e;
                    }
                    throw y01Var.access$newTimeoutException(e);
                }
            } catch (Throwable th) {
                y01Var.exit();
                throw th;
            }
        }

        @Override // defpackage.uw90, java.io.Flushable
        public final void flush() throws IOException {
            uw90 uw90Var = this.b;
            y01 y01Var = y01.this;
            y01Var.enter();
            try {
                try {
                    uw90Var.flush();
                    Unit unit = Unit.a;
                    if (y01Var.exit()) {
                        throw y01Var.access$newTimeoutException(null);
                    }
                } catch (IOException e) {
                    if (!y01Var.exit()) {
                        throw e;
                    }
                    throw y01Var.access$newTimeoutException(e);
                }
            } catch (Throwable th) {
                y01Var.exit();
                throw th;
            }
        }

        @Override // defpackage.uw90
        public final sxf0 timeout() {
            return y01.this;
        }

        public final String toString() {
            return "AsyncTimeout.sink(" + this.b + ')';
        }

        @Override // defpackage.uw90
        public final void write(lb5 lb5Var, long j) throws IOException {
            lb5Var.getClass();
            l.b(lb5Var.b, 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                e580 e580Var = lb5Var.a;
                e580Var.getClass();
                while (j2 < 65536) {
                    j2 += (long) (e580Var.c - e580Var.b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        e580Var = e580Var.f;
                        e580Var.getClass();
                    }
                }
                uw90 uw90Var = this.b;
                y01 y01Var = y01.this;
                y01Var.enter();
                try {
                    try {
                        uw90Var.write(lb5Var, j2);
                        Unit unit = Unit.a;
                        if (y01Var.exit()) {
                            throw y01Var.access$newTimeoutException(null);
                        }
                        j -= j2;
                    } catch (IOException e) {
                        if (!y01Var.exit()) {
                            throw e;
                        }
                        throw y01Var.access$newTimeoutException(e);
                    }
                } catch (Throwable th) {
                    y01Var.exit();
                    throw th;
                }
            }
        }
    }

    public static final class d implements zpa0 {
        public final /* synthetic */ zpa0 b;

        public d(zpa0 zpa0Var) {
            this.b = zpa0Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            zpa0 zpa0Var = this.b;
            y01 y01Var = y01.this;
            y01Var.enter();
            try {
                try {
                    zpa0Var.close();
                    Unit unit = Unit.a;
                    if (y01Var.exit()) {
                        throw y01Var.access$newTimeoutException(null);
                    }
                } catch (IOException e) {
                    if (!y01Var.exit()) {
                        throw e;
                    }
                    throw y01Var.access$newTimeoutException(e);
                }
            } catch (Throwable th) {
                y01Var.exit();
                throw th;
            }
        }

        @Override // defpackage.zpa0
        public final long read(lb5 lb5Var, long j) throws IOException {
            lb5Var.getClass();
            zpa0 zpa0Var = this.b;
            y01 y01Var = y01.this;
            y01Var.enter();
            try {
                try {
                    long j2 = zpa0Var.read(lb5Var, j);
                    if (y01Var.exit()) {
                        throw y01Var.access$newTimeoutException(null);
                    }
                    return j2;
                } catch (IOException e) {
                    if (y01Var.exit()) {
                        throw y01Var.access$newTimeoutException(e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                y01Var.exit();
                throw th;
            }
        }

        @Override // defpackage.zpa0
        public final sxf0 timeout() {
            return y01.this;
        }

        public final String toString() {
            return "AsyncTimeout.source(" + this.b + ')';
        }
    }

    static {
        pw20 pw20Var = new pw20();
        pw20Var.b = new y01[8];
        h = pw20Var;
        ReentrantLock reentrantLock = new ReentrantLock();
        j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        k = conditionNewCondition;
        l = RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
        m = TimeUnit.MILLISECONDS.toNanos(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
    }

    public static /* synthetic */ void setTimeoutAt$okio$default(y01 y01Var, long j2, int i2, Object obj) {
        if (obj != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: setTimeoutAt");
            return;
        }
        if ((i2 & 1) != 0) {
            j2 = System.nanoTime();
        }
        y01Var.setTimeoutAt$okio(j2);
    }

    public IOException a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final IOException access$newTimeoutException(IOException cause) {
        return a(cause);
    }

    @Override // defpackage.sxf0
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = j;
        reentrantLock.lock();
        try {
            if (this.e == 1) {
                h.b(this);
                this.e = 3;
            }
            Unit unit = Unit.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void enter() {
        long c2 = getC();
        boolean a2 = getA();
        if (c2 != 0 || a2) {
            ReentrantLock reentrantLock = j;
            reentrantLock.lock();
            try {
                if (this.e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = 1;
                a.b(this);
                Unit unit = Unit.a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = j;
        reentrantLock.lock();
        try {
            int i2 = this.e;
            this.e = 0;
            if (i2 != 1) {
                return i2 == 2;
            }
            h.b(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: getTimeoutAt$okio, reason: from getter */
    public final long getTimeoutAt() {
        return this.timeoutAt;
    }

    public final long remainingNanos$okio(long now) {
        return this.timeoutAt - now;
    }

    public final void setTimeoutAt$okio(long now) {
        long c2 = getC();
        boolean a2 = getA();
        if (getC() != 0 && getA()) {
            this.timeoutAt = Math.min(c2, deadlineNanoTime() - now) + now;
            return;
        }
        if (c2 != 0) {
            this.timeoutAt = now + c2;
        } else if (a2) {
            this.timeoutAt = deadlineNanoTime();
        } else {
            x01.a();
        }
    }

    public final uw90 sink(uw90 sink) {
        sink.getClass();
        return new c(sink);
    }

    public final zpa0 source(zpa0 source) {
        source.getClass();
        return new d(source);
    }

    public final <T> T withTimeout(Function0<? extends T> block) throws IOException {
        block.getClass();
        enter();
        try {
            try {
                T tInvoke = block.invoke();
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                return tInvoke;
            } catch (IOException e) {
                if (exit()) {
                    throw access$newTimeoutException(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            exit();
            throw th;
        }
    }

    public static final class a {
        public static y01 a() throws InterruptedException {
            y01 y01Var = y01.h.b[1];
            if (y01Var == null) {
                long jNanoTime = System.nanoTime();
                y01.k.await(y01.l, TimeUnit.MILLISECONDS);
                if (y01.h.b[1] != null || System.nanoTime() - jNanoTime < y01.m) {
                    return null;
                }
                return y01.i;
            }
            long jRemainingNanos$okio = y01Var.remainingNanos$okio(System.nanoTime());
            if (jRemainingNanos$okio > 0) {
                y01.k.await(jRemainingNanos$okio, TimeUnit.NANOSECONDS);
                return null;
            }
            y01.h.b(y01Var);
            y01Var.e = 2;
            return y01Var;
        }

        public static void b(y01 y01Var) {
            if (y01.i == null) {
                y01.i = new y01();
                b bVar = new b(CaBJCMnsV.pOzTSHw);
                bVar.setDaemon(true);
                bVar.start();
            }
            y01.setTimeoutAt$okio$default(y01Var, 0L, 1, null);
            pw20 pw20Var = y01.h;
            pw20Var.getClass();
            int i = pw20Var.a + 1;
            pw20Var.a = i;
            y01[] y01VarArr = pw20Var.b;
            if (i == y01VarArr.length) {
                y01[] y01VarArr2 = new y01[i * 2];
                xx0.i(0, 0, 14, y01VarArr, y01VarArr2);
                pw20Var.b = y01VarArr2;
            }
            pw20Var.a(y01Var, i);
            if (y01Var.index == 1) {
                y01.k.signal();
            }
        }
    }

    public void b() {
    }
}
