package fx;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nGzipSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,152:1\n51#2:153\n1#3:154\n85#4:155\n*S KotlinDebug\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n*L\n62#1:153\n130#1:155\n*E\n"})
public final class b0 implements b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final w0 f85558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final Deflater f85559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final r f85560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f85561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public final CRC32 f85562f;

    public b0(@oy.l b1 sink) {
        kotlin.jvm.internal.m0.p(sink, "sink");
        w0 w0Var = new w0(sink);
        this.f85558b = w0Var;
        Deflater deflater = new Deflater(gx.b0.b(), true);
        this.f85559c = deflater;
        this.f85560d = new r((m) w0Var, deflater);
        this.f85562f = new CRC32();
        l lVar = w0Var.f85728c;
        lVar.writeShort(8075);
        lVar.writeByte(8);
        lVar.writeByte(0);
        lVar.writeInt(0);
        lVar.writeByte(0);
        lVar.writeByte(0);
    }

    @Override // fx.b1
    public void T1(@oy.l l source, long j10) throws IOException {
        kotlin.jvm.internal.m0.p(source, "source");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return;
        }
        i(source, j10);
        this.f85560d.T1(source, j10);
    }

    @Override // fx.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f85561e) {
            return;
        }
        this.f85560d.d();
        k();
        th = null;
        try {
            this.f85559c.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f85558b.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f85561e = true;
        if (th != null) {
            throw th;
        }
    }

    @cs.j(name = "-deprecated_deflater")
    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @dr.g1(expression = "deflater", imports = {}))
    public final Deflater d() {
        return this.f85559c;
    }

    @Override // fx.b1, java.io.Flushable
    public void flush() throws IOException {
        this.f85560d.flush();
    }

    @cs.j(name = "deflater")
    @oy.l
    public final Deflater h() {
        return this.f85559c;
    }

    public final void i(l lVar, long j10) {
        y0 y0Var = lVar.f85645b;
        kotlin.jvm.internal.m0.m(y0Var);
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, y0Var.f85742c - y0Var.f85741b);
            this.f85562f.update(y0Var.f85740a, y0Var.f85741b, iMin);
            j10 -= (long) iMin;
            y0Var = y0Var.f85745f;
            kotlin.jvm.internal.m0.m(y0Var);
        }
    }

    public final void k() {
        this.f85558b.writeIntLe((int) this.f85562f.getValue());
        this.f85558b.writeIntLe((int) this.f85559c.getBytesRead());
    }

    @Override // fx.b1
    @oy.l
    public g1 timeout() {
        return this.f85558b.timeout();
    }
}
