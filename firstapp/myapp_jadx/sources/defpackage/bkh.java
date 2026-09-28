package defpackage;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class bkh implements Closeable {
    public boolean a;
    public int b;
    public final ReentrantLock c = new ReentrantLock();

    public static final class a implements zpa0 {
        public final bkh a;
        public long b;
        public boolean c;

        public a(bkh bkhVar, long j) {
            this.a = bkhVar;
            this.b = j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.c) {
                return;
            }
            this.c = true;
            bkh bkhVar = this.a;
            ReentrantLock reentrantLock = bkhVar.c;
            reentrantLock.lock();
            try {
                int i = bkhVar.b - 1;
                bkhVar.b = i;
                if (i == 0 && bkhVar.a) {
                    Unit unit = Unit.a;
                    reentrantLock.unlock();
                    bkhVar.d();
                    return;
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @Override // defpackage.zpa0
        public final long read(lb5 lb5Var, long j) {
            long j2;
            long j3;
            lb5Var.getClass();
            if (this.c) {
                ib5.a("closed");
                return 0L;
            }
            long j4 = this.b;
            if (j < 0) {
                kb5.a(avg.a(j, "byteCount < 0: "));
                return 0L;
            }
            long j5 = j + j4;
            long j6 = j4;
            while (true) {
                if (j6 < j5) {
                    e580 e580VarB0 = lb5Var.b0(1);
                    byte[] bArr = e580VarB0.a;
                    int i = e580VarB0.c;
                    j2 = -1;
                    int iF = this.a.f(j6, bArr, i, (int) Math.min(j5 - j6, 8192 - i));
                    if (iF == -1) {
                        if (e580VarB0.b == e580VarB0.c) {
                            lb5Var.a = e580VarB0.a();
                            h580.a(e580VarB0);
                        }
                        if (j4 == j6) {
                            j3 = -1;
                            break;
                        }
                    } else {
                        e580VarB0.c += iF;
                        long j7 = iF;
                        j6 += j7;
                        lb5Var.b += j7;
                    }
                } else {
                    j2 = -1;
                }
                j3 = j6 - j4;
                break;
            }
            if (j3 != j2) {
                this.b += j3;
            }
            return j3;
        }

        @Override // defpackage.zpa0
        public final sxf0 timeout() {
            return sxf0.NONE;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (this.a) {
                reentrantLock.unlock();
                return;
            }
            this.a = true;
            if (this.b != 0) {
                reentrantLock.unlock();
                return;
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
            d();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public abstract void d();

    public abstract int f(long j, byte[] bArr, int i, int i2);

    public abstract long g();

    public final a l(long j) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (this.a) {
                throw new IllegalStateException("closed");
            }
            this.b++;
            reentrantLock.unlock();
            return new a(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (this.a) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
            return g();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
