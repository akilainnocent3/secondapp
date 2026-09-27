package fx;

import dr.w2;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n+ 2 -JvmPlatform.kt\nokio/_JvmPlatformKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 5 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 6 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,444:1\n40#2:445\n40#2:447\n40#2:448\n40#2:449\n40#2:450\n40#2:451\n40#2:452\n40#2:453\n40#2:457\n40#2:459\n1#3:446\n63#4:454\n63#4:455\n63#4:456\n51#5:458\n85#6:460\n85#6:461\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n*L\n69#1:445\n81#1:447\n92#1:448\n105#1:449\n119#1:450\n129#1:451\n139#1:452\n151#1:453\n221#1:457\n287#1:459\n169#1:454\n195#1:455\n202#1:456\n248#1:458\n345#1:460\n374#1:461\n*E\n"})
public abstract class t implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f85681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public final ReentrantLock f85684e = k1.b();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n40#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n*L\n410#1:446\n*E\n"})
    public static final class a implements b1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public final t f85685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f85686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f85687d;

        public a(@oy.l t fileHandle, long j10) {
            kotlin.jvm.internal.m0.p(fileHandle, "fileHandle");
            this.f85685b = fileHandle;
            this.f85686c = j10;
        }

        @Override // fx.b1
        public void T1(@oy.l l source, long j10) throws IOException {
            kotlin.jvm.internal.m0.p(source, "source");
            if (this.f85687d) {
                throw new IllegalStateException("closed");
            }
            this.f85685b.d0(this.f85686c, source, j10);
            this.f85686c += j10;
        }

        @Override // fx.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f85687d) {
                return;
            }
            this.f85687d = true;
            ReentrantLock reentrantLockL = this.f85685b.l();
            reentrantLockL.lock();
            try {
                this.f85685b.f85683d--;
                if (this.f85685b.f85683d == 0 && this.f85685b.f85682c) {
                    w2 w2Var = w2.f79517a;
                    reentrantLockL.unlock();
                    this.f85685b.p();
                    return;
                }
                reentrantLockL.unlock();
            } catch (Throwable th2) {
                reentrantLockL.unlock();
                throw th2;
            }
        }

        public final boolean d() {
            return this.f85687d;
        }

        @Override // fx.b1, java.io.Flushable
        public void flush() throws IOException {
            if (this.f85687d) {
                throw new IllegalStateException("closed");
            }
            this.f85685b.q();
        }

        @oy.l
        public final t h() {
            return this.f85685b;
        }

        public final long k() {
            return this.f85686c;
        }

        public final void l(boolean z10) {
            this.f85687d = z10;
        }

        public final void m(long j10) {
            this.f85686c = j10;
        }

        @Override // fx.b1
        @oy.l
        public g1 timeout() {
            return g1.f85601f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n40#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n*L\n436#1:446\n*E\n"})
    public static final class b implements d1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public final t f85688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f85689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f85690d;

        public b(@oy.l t fileHandle, long j10) {
            kotlin.jvm.internal.m0.p(fileHandle, "fileHandle");
            this.f85688b = fileHandle;
            this.f85689c = j10;
        }

        @Override // fx.d1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f85690d) {
                return;
            }
            this.f85690d = true;
            ReentrantLock reentrantLockL = this.f85688b.l();
            reentrantLockL.lock();
            try {
                this.f85688b.f85683d--;
                if (this.f85688b.f85683d == 0 && this.f85688b.f85682c) {
                    w2 w2Var = w2.f79517a;
                    reentrantLockL.unlock();
                    this.f85688b.p();
                    return;
                }
                reentrantLockL.unlock();
            } catch (Throwable th2) {
                reentrantLockL.unlock();
                throw th2;
            }
        }

        public final boolean d() {
            return this.f85690d;
        }

        @oy.l
        public final t h() {
            return this.f85688b;
        }

        public final long k() {
            return this.f85689c;
        }

        public final void l(boolean z10) {
            this.f85690d = z10;
        }

        public final void m(long j10) {
            this.f85689c = j10;
        }

        @Override // fx.d1
        public long read(@oy.l l sink, long j10) throws IOException {
            kotlin.jvm.internal.m0.p(sink, "sink");
            if (this.f85690d) {
                throw new IllegalStateException("closed");
            }
            long jG = this.f85688b.G(this.f85689c, sink, j10);
            if (jG != -1) {
                this.f85689c += jG;
            }
            return jG;
        }

        @Override // fx.d1
        @oy.l
        public g1 timeout() {
            return g1.f85601f;
        }
    }

    public t(boolean z10) {
        this.f85681b = z10;
    }

    public static /* synthetic */ b1 O(t tVar, long j10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        return tVar.N(j10);
    }

    public static /* synthetic */ d1 U(t tVar, long j10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: source");
        }
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        return tVar.S(j10);
    }

    public abstract void D(long j10, @oy.l byte[] bArr, int i10, int i11) throws IOException;

    public final int E(long j10, @oy.l byte[] array, int i10, int i11) throws IOException {
        kotlin.jvm.internal.m0.p(array, "array");
        ReentrantLock reentrantLock = this.f85684e;
        reentrantLock.lock();
        try {
            if (this.f85682c) {
                throw new IllegalStateException("closed");
            }
            w2 w2Var = w2.f79517a;
            reentrantLock.unlock();
            return r(j10, array, i10, i11);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long F(long j10, @oy.l l sink, long j11) throws IOException {
        kotlin.jvm.internal.m0.p(sink, "sink");
        ReentrantLock reentrantLock = this.f85684e;
        reentrantLock.lock();
        try {
            if (this.f85682c) {
                throw new IllegalStateException("closed");
            }
            w2 w2Var = w2.f79517a;
            reentrantLock.unlock();
            return G(j10, sink, j11);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long G(long j10, l lVar, long j11) throws IOException {
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        long j12 = j11 + j10;
        long j13 = j10;
        while (j13 < j12) {
            y0 y0VarA0 = lVar.A0(1);
            byte[] bArr = y0VarA0.f85740a;
            int i10 = y0VarA0.f85742c;
            int iR = r(j13, bArr, i10, (int) Math.min(j12 - j13, 8192 - i10));
            if (iR == -1) {
                if (y0VarA0.f85741b == y0VarA0.f85742c) {
                    lVar.f85645b = y0VarA0.b();
                    z0.d(y0VarA0);
                }
                if (j10 != j13) {
                    break;
                }
                return -1L;
            }
            y0VarA0.f85742c += iR;
            long j14 = iR;
            j13 += j14;
            lVar.o0(lVar.size() + j14);
        }
        return j13 - j10;
    }

    public final void H(@oy.l b1 sink, long j10) throws IOException {
        kotlin.jvm.internal.m0.p(sink, "sink");
        if (!(sink instanceof w0)) {
            if (!(sink instanceof a) || ((a) sink).h() != this) {
                throw new IllegalArgumentException("sink was not created by this FileHandle");
            }
            a aVar = (a) sink;
            if (aVar.d()) {
                throw new IllegalStateException("closed");
            }
            aVar.m(j10);
            return;
        }
        w0 w0Var = (w0) sink;
        b1 b1Var = w0Var.f85727b;
        if (!(b1Var instanceof a) || ((a) b1Var).h() != this) {
            throw new IllegalArgumentException("sink was not created by this FileHandle");
        }
        a aVar2 = (a) b1Var;
        if (aVar2.d()) {
            throw new IllegalStateException("closed");
        }
        w0Var.emit();
        aVar2.m(j10);
    }

    public final void I(@oy.l d1 source, long j10) throws IOException {
        kotlin.jvm.internal.m0.p(source, "source");
        if (!(source instanceof x0)) {
            if (!(source instanceof b) || ((b) source).h() != this) {
                throw new IllegalArgumentException("source was not created by this FileHandle");
            }
            b bVar = (b) source;
            if (bVar.d()) {
                throw new IllegalStateException("closed");
            }
            bVar.m(j10);
            return;
        }
        x0 x0Var = (x0) source;
        d1 d1Var = x0Var.f85732b;
        if (!(d1Var instanceof b) || ((b) d1Var).h() != this) {
            throw new IllegalArgumentException("source was not created by this FileHandle");
        }
        b bVar2 = (b) d1Var;
        if (bVar2.d()) {
            throw new IllegalStateException("closed");
        }
        long size = x0Var.f85733c.size();
        long jK = j10 - (bVar2.k() - size);
        if (0 <= jK && jK < size) {
            x0Var.skip(jK);
        } else {
            x0Var.f85733c.l();
            bVar2.m(j10);
        }
    }

    public final void L(long j10) throws IOException {
        if (!this.f85681b) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f85684e;
        reentrantLock.lock();
        try {
            if (this.f85682c) {
                throw new IllegalStateException("closed");
            }
            w2 w2Var = w2.f79517a;
            reentrantLock.unlock();
            t(j10);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @oy.l
    public final b1 N(long j10) throws IOException {
        if (!this.f85681b) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f85684e;
        reentrantLock.lock();
        try {
            if (this.f85682c) {
                throw new IllegalStateException("closed");
            }
            this.f85683d++;
            reentrantLock.unlock();
            return new a(this, j10);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @oy.l
    public final d1 S(long j10) throws IOException {
        ReentrantLock reentrantLock = this.f85684e;
        reentrantLock.lock();
        try {
            if (this.f85682c) {
                throw new IllegalStateException("closed");
            }
            this.f85683d++;
            reentrantLock.unlock();
            return new b(this, j10);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void W(long j10, @oy.l l source, long j11) throws IOException {
        kotlin.jvm.internal.m0.p(source, "source");
        if (!this.f85681b) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f85684e;
        reentrantLock.lock();
        try {
            if (this.f85682c) {
                throw new IllegalStateException("closed");
            }
            w2 w2Var = w2.f79517a;
            reentrantLock.unlock();
            d0(j10, source, j11);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void Y(long j10, @oy.l byte[] array, int i10, int i11) throws IOException {
        kotlin.jvm.internal.m0.p(array, "array");
        if (!this.f85681b) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f85684e;
        reentrantLock.lock();
        try {
            if (this.f85682c) {
                throw new IllegalStateException("closed");
            }
            w2 w2Var = w2.f79517a;
            reentrantLock.unlock();
            D(j10, array, i10, i11);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.f85684e;
        reentrantLock.lock();
        try {
            if (this.f85682c) {
                reentrantLock.unlock();
                return;
            }
            this.f85682c = true;
            if (this.f85683d != 0) {
                reentrantLock.unlock();
                return;
            }
            w2 w2Var = w2.f79517a;
            reentrantLock.unlock();
            p();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void d0(long j10, l lVar, long j11) throws IOException {
        i.e(lVar.size(), 0L, j11);
        long j12 = j10 + j11;
        long j13 = j10;
        while (j13 < j12) {
            y0 y0Var = lVar.f85645b;
            kotlin.jvm.internal.m0.m(y0Var);
            int iMin = (int) Math.min(j12 - j13, y0Var.f85742c - y0Var.f85741b);
            D(j13, y0Var.f85740a, y0Var.f85741b, iMin);
            y0Var.f85741b += iMin;
            long j14 = iMin;
            j13 += j14;
            lVar.o0(lVar.size() - j14);
            if (y0Var.f85741b == y0Var.f85742c) {
                lVar.f85645b = y0Var.b();
                z0.d(y0Var);
            }
        }
    }

    public final void flush() throws IOException {
        if (!this.f85681b) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f85684e;
        reentrantLock.lock();
        try {
            if (this.f85682c) {
                throw new IllegalStateException("closed");
            }
            w2 w2Var = w2.f79517a;
            reentrantLock.unlock();
            q();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @oy.l
    public final b1 k() throws IOException {
        return N(size());
    }

    @oy.l
    public final ReentrantLock l() {
        return this.f85684e;
    }

    public final boolean m() {
        return this.f85681b;
    }

    public final long n(@oy.l b1 sink) throws IOException {
        long size;
        kotlin.jvm.internal.m0.p(sink, "sink");
        if (sink instanceof w0) {
            w0 w0Var = (w0) sink;
            size = w0Var.f85728c.size();
            sink = w0Var.f85727b;
        } else {
            size = 0;
        }
        if (!(sink instanceof a) || ((a) sink).h() != this) {
            throw new IllegalArgumentException("sink was not created by this FileHandle");
        }
        a aVar = (a) sink;
        if (aVar.d()) {
            throw new IllegalStateException("closed");
        }
        return aVar.k() + size;
    }

    public final long o(@oy.l d1 source) throws IOException {
        long size;
        kotlin.jvm.internal.m0.p(source, "source");
        if (source instanceof x0) {
            x0 x0Var = (x0) source;
            size = x0Var.f85733c.size();
            source = x0Var.f85732b;
        } else {
            size = 0;
        }
        if (!(source instanceof b) || ((b) source).h() != this) {
            throw new IllegalArgumentException("source was not created by this FileHandle");
        }
        b bVar = (b) source;
        if (bVar.d()) {
            throw new IllegalStateException("closed");
        }
        return bVar.k() - size;
    }

    public abstract void p() throws IOException;

    public abstract void q() throws IOException;

    public abstract int r(long j10, @oy.l byte[] bArr, int i10, int i11) throws IOException;

    public final long size() throws IOException {
        ReentrantLock reentrantLock = this.f85684e;
        reentrantLock.lock();
        try {
            if (this.f85682c) {
                throw new IllegalStateException("closed");
            }
            w2 w2Var = w2.f79517a;
            reentrantLock.unlock();
            return y();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public abstract void t(long j10) throws IOException;

    public abstract long y() throws IOException;
}
