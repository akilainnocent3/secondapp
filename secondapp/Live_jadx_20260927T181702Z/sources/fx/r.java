package fx;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nDeflaterSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,140:1\n85#2:141\n*S KotlinDebug\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n*L\n39#1:141\n*E\n"})
public final class r implements b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final m f85673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final Deflater f85674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f85675d;

    public r(@oy.l m sink, @oy.l Deflater deflater) {
        kotlin.jvm.internal.m0.p(sink, "sink");
        kotlin.jvm.internal.m0.p(deflater, "deflater");
        this.f85673b = sink;
        this.f85674c = deflater;
    }

    @Override // fx.b1
    public void T1(@oy.l l source, long j10) throws IOException {
        kotlin.jvm.internal.m0.p(source, "source");
        i.e(source.size(), 0L, j10);
        while (j10 > 0) {
            y0 y0Var = source.f85645b;
            kotlin.jvm.internal.m0.m(y0Var);
            int iMin = (int) Math.min(j10, y0Var.f85742c - y0Var.f85741b);
            this.f85674c.setInput(y0Var.f85740a, y0Var.f85741b, iMin);
            a(false);
            long j11 = iMin;
            source.o0(source.size() - j11);
            int i10 = y0Var.f85741b + iMin;
            y0Var.f85741b = i10;
            if (i10 == y0Var.f85742c) {
                source.f85645b = y0Var.b();
                z0.d(y0Var);
            }
            j10 -= j11;
        }
        this.f85674c.setInput(gx.b0.c(), 0, 0);
    }

    public final void a(boolean z10) throws IOException {
        y0 y0VarA0;
        int iDeflate;
        l buffer = this.f85673b.getBuffer();
        while (true) {
            y0VarA0 = buffer.A0(1);
            if (z10) {
                try {
                    Deflater deflater = this.f85674c;
                    byte[] bArr = y0VarA0.f85740a;
                    int i10 = y0VarA0.f85742c;
                    iDeflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                Deflater deflater2 = this.f85674c;
                byte[] bArr2 = y0VarA0.f85740a;
                int i11 = y0VarA0.f85742c;
                iDeflate = deflater2.deflate(bArr2, i11, 8192 - i11);
            }
            if (iDeflate > 0) {
                y0VarA0.f85742c += iDeflate;
                buffer.o0(buffer.size() + ((long) iDeflate));
                this.f85673b.emitCompleteSegments();
            } else if (this.f85674c.needsInput()) {
                break;
            }
        }
        if (y0VarA0.f85741b == y0VarA0.f85742c) {
            buffer.f85645b = y0VarA0.b();
            z0.d(y0VarA0);
        }
    }

    @Override // fx.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f85675d) {
            return;
        }
        d();
        th = null;
        try {
            this.f85674c.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f85673b.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f85675d = true;
        if (th != null) {
            throw th;
        }
    }

    public final void d() throws IOException {
        this.f85674c.finish();
        a(false);
    }

    @Override // fx.b1, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.f85673b.flush();
    }

    @Override // fx.b1
    @oy.l
    public g1 timeout() {
        return this.f85673b.timeout();
    }

    @oy.l
    public String toString() {
        return "DeflaterSink(" + this.f85673b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(@oy.l b1 sink, @oy.l Deflater deflater) {
        this(n0.d(sink), deflater);
        kotlin.jvm.internal.m0.p(sink, "sink");
        kotlin.jvm.internal.m0.p(deflater, "deflater");
    }
}
