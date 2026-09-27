package com.applovin.shadow.okio;

import dr.g1;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@s1({"SMAP\nGzipSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,153:1\n51#2:154\n1#3:155\n86#4:156\n*S KotlinDebug\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n*L\n63#1:154\n131#1:156\n*E\n"})
public final class GzipSink implements Sink {
    private boolean closed;

    @oy.l
    private final CRC32 crc;

    @oy.l
    private final Deflater deflater;

    @oy.l
    private final DeflaterSink deflaterSink;

    @oy.l
    private final RealBufferedSink sink;

    public GzipSink(@oy.l Sink sink) {
        m0.p(sink, "sink");
        RealBufferedSink realBufferedSink = new RealBufferedSink(sink);
        this.sink = realBufferedSink;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new DeflaterSink((BufferedSink) realBufferedSink, deflater);
        this.crc = new CRC32();
        Buffer buffer = realBufferedSink.bufferField;
        buffer.writeShort(8075);
        buffer.writeByte(8);
        buffer.writeByte(0);
        buffer.writeInt(0);
        buffer.writeByte(0);
        buffer.writeByte(0);
    }

    private final void updateCrc(Buffer buffer, long j10) {
        Segment segment = buffer.head;
        m0.m(segment);
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, segment.limit - segment.pos);
            this.crc.update(segment.data, segment.pos, iMin);
            j10 -= (long) iMin;
            segment = segment.next;
            m0.m(segment);
        }
    }

    private final void writeFooter() {
        this.sink.writeIntLe((int) this.crc.getValue());
        this.sink.writeIntLe((int) this.deflater.getBytesRead());
    }

    @cs.j(name = "-deprecated_deflater")
    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @g1(expression = "deflater", imports = {}))
    /* JADX INFO: renamed from: -deprecated_deflater, reason: not valid java name */
    public final Deflater m155deprecated_deflater() {
        return this.deflater;
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        this.deflaterSink.finishDeflate$okio();
        writeFooter();
        th = null;
        try {
            this.deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @cs.j(name = "deflater")
    @oy.l
    public final Deflater deflater() {
        return this.deflater;
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.deflaterSink.flush();
    }

    @Override // com.applovin.shadow.okio.Sink
    @oy.l
    public Timeout timeout() {
        return this.sink.timeout();
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(@oy.l Buffer source, long j10) throws IOException {
        m0.p(source, "source");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return;
        }
        updateCrc(source, j10);
        this.deflaterSink.write(source, j10);
    }
}
