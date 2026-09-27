package fx;

import dr.r2;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nGzipSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 GzipSource.kt\nokio/-GzipSourceExtensions\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,222:1\n1#2:223\n63#3:224\n63#3:226\n63#3:228\n63#3:229\n63#3:230\n63#3:232\n63#3:234\n204#4:225\n204#4:227\n204#4:231\n204#4:233\n88#5:235\n*S KotlinDebug\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n*L\n103#1:224\n105#1:226\n117#1:228\n118#1:229\n120#1:230\n131#1:232\n142#1:234\n104#1:225\n115#1:227\n128#1:231\n139#1:233\n185#1:235\n*E\n"})
public final class c0 implements d1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f85564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final x0 f85565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final Inflater f85566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public final f0 f85567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public final CRC32 f85568f;

    public c0(@oy.l d1 source) {
        kotlin.jvm.internal.m0.p(source, "source");
        x0 x0Var = new x0(source);
        this.f85565c = x0Var;
        Inflater inflater = new Inflater(true);
        this.f85566d = inflater;
        this.f85567e = new f0((n) x0Var, inflater);
        this.f85568f = new CRC32();
    }

    public final void a(String str, int i10, int i11) throws IOException {
        if (i11 == i10) {
            return;
        }
        throw new IOException(str + ": actual 0x" + cv.p0.m4(i.u(i11), 8, '0') + " != expected 0x" + cv.p0.m4(i.u(i10), 8, '0'));
    }

    @Override // fx.d1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f85567e.close();
    }

    public final void d() throws IOException {
        this.f85565c.require(10L);
        byte bL = this.f85565c.f85733c.L(3L);
        boolean z10 = ((bL >> 1) & 1) == 1;
        if (z10) {
            i(this.f85565c.f85733c, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f85565c.readShort());
        this.f85565c.skip(8L);
        if (((bL >> 2) & 1) == 1) {
            this.f85565c.require(2L);
            if (z10) {
                i(this.f85565c.f85733c, 0L, 2L);
            }
            long shortLe = this.f85565c.f85733c.readShortLe() & r2.f79504e;
            this.f85565c.require(shortLe);
            if (z10) {
                i(this.f85565c.f85733c, 0L, shortLe);
            }
            this.f85565c.skip(shortLe);
        }
        if (((bL >> 3) & 1) == 1) {
            long jIndexOf = this.f85565c.indexOf((byte) 0);
            if (jIndexOf == -1) {
                throw new EOFException();
            }
            if (z10) {
                i(this.f85565c.f85733c, 0L, jIndexOf + 1);
            }
            this.f85565c.skip(jIndexOf + 1);
        }
        if (((bL >> 4) & 1) == 1) {
            long jIndexOf2 = this.f85565c.indexOf((byte) 0);
            if (jIndexOf2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                i(this.f85565c.f85733c, 0L, jIndexOf2 + 1);
            }
            this.f85565c.skip(jIndexOf2 + 1);
        }
        if (z10) {
            a("FHCRC", this.f85565c.readShortLe(), (short) this.f85568f.getValue());
            this.f85568f.reset();
        }
    }

    public final void h() throws IOException {
        a("CRC", this.f85565c.readIntLe(), (int) this.f85568f.getValue());
        a("ISIZE", this.f85565c.readIntLe(), (int) this.f85566d.getBytesWritten());
    }

    public final void i(l lVar, long j10, long j11) {
        y0 y0Var = lVar.f85645b;
        kotlin.jvm.internal.m0.m(y0Var);
        while (true) {
            int i10 = y0Var.f85742c;
            int i11 = y0Var.f85741b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            y0Var = y0Var.f85745f;
            kotlin.jvm.internal.m0.m(y0Var);
        }
        while (j11 > 0) {
            int i12 = (int) (((long) y0Var.f85741b) + j10);
            int iMin = (int) Math.min(y0Var.f85742c - i12, j11);
            this.f85568f.update(y0Var.f85740a, i12, iMin);
            j11 -= (long) iMin;
            y0Var = y0Var.f85745f;
            kotlin.jvm.internal.m0.m(y0Var);
            j10 = 0;
        }
    }

    @Override // fx.d1
    public long read(@oy.l l sink, long j10) throws IOException {
        c0 c0Var;
        kotlin.jvm.internal.m0.p(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f85564b == 0) {
            d();
            this.f85564b = (byte) 1;
        }
        if (this.f85564b == 1) {
            long size = sink.size();
            long j11 = this.f85567e.read(sink, j10);
            if (j11 != -1) {
                i(sink, size, j11);
                return j11;
            }
            c0Var = this;
            c0Var.f85564b = (byte) 2;
        } else {
            c0Var = this;
        }
        if (c0Var.f85564b == 2) {
            h();
            c0Var.f85564b = (byte) 3;
            if (!c0Var.f85565c.exhausted()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // fx.d1
    @oy.l
    public g1 timeout() {
        return this.f85565c.timeout();
    }
}
