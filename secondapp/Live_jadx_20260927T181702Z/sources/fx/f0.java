package fx;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nInflaterSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,132:1\n1#2:133\n85#3:134\n*S KotlinDebug\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n*L\n66#1:134\n*E\n"})
public final class f0 implements d1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final n f85578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final Inflater f85579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f85581e;

    public f0(@oy.l n source, @oy.l Inflater inflater) {
        kotlin.jvm.internal.m0.p(source, "source");
        kotlin.jvm.internal.m0.p(inflater, "inflater");
        this.f85578b = source;
        this.f85579c = inflater;
    }

    public final long a(@oy.l l sink, long j10) throws IOException {
        kotlin.jvm.internal.m0.p(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f85581e) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            y0 y0VarA0 = sink.A0(1);
            int iMin = (int) Math.min(j10, 8192 - y0VarA0.f85742c);
            d();
            int iInflate = this.f85579c.inflate(y0VarA0.f85740a, y0VarA0.f85742c, iMin);
            h();
            if (iInflate > 0) {
                y0VarA0.f85742c += iInflate;
                long j11 = iInflate;
                sink.o0(sink.size() + j11);
                return j11;
            }
            if (y0VarA0.f85741b == y0VarA0.f85742c) {
                sink.f85645b = y0VarA0.b();
                z0.d(y0VarA0);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    @Override // fx.d1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f85581e) {
            return;
        }
        this.f85579c.end();
        this.f85581e = true;
        this.f85578b.close();
    }

    public final boolean d() throws IOException {
        if (!this.f85579c.needsInput()) {
            return false;
        }
        if (this.f85578b.exhausted()) {
            return true;
        }
        y0 y0Var = this.f85578b.getBuffer().f85645b;
        kotlin.jvm.internal.m0.m(y0Var);
        int i10 = y0Var.f85742c;
        int i11 = y0Var.f85741b;
        int i12 = i10 - i11;
        this.f85580d = i12;
        this.f85579c.setInput(y0Var.f85740a, i11, i12);
        return false;
    }

    public final void h() throws IOException {
        int i10 = this.f85580d;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f85579c.getRemaining();
        this.f85580d -= remaining;
        this.f85578b.skip(remaining);
    }

    @Override // fx.d1
    public long read(@oy.l l sink, long j10) throws IOException {
        kotlin.jvm.internal.m0.p(sink, "sink");
        do {
            long jA = a(sink, j10);
            if (jA > 0) {
                return jA;
            }
            if (this.f85579c.finished() || this.f85579c.needsDictionary()) {
                return -1L;
            }
        } while (!this.f85578b.exhausted());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // fx.d1
    @oy.l
    public g1 timeout() {
        return this.f85578b.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(@oy.l d1 source, @oy.l Inflater inflater) {
        this(n0.e(source), inflater);
        kotlin.jvm.internal.m0.p(source, "source");
        kotlin.jvm.internal.m0.p(inflater, "inflater");
    }
}
