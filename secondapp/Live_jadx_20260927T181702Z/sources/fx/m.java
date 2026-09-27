package fx;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface m extends b1, WritableByteChannel {
    long K(@oy.l d1 d1Var) throws IOException;

    @oy.l
    m M(@oy.l o oVar) throws IOException;

    @oy.l
    m R(@oy.l d1 d1Var, long j10) throws IOException;

    @oy.l
    m X(@oy.l o oVar, int i10, int i11) throws IOException;

    @oy.l
    @dr.o(level = dr.q.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @dr.g1(expression = "buffer", imports = {}))
    l buffer();

    @oy.l
    m emit() throws IOException;

    @oy.l
    m emitCompleteSegments() throws IOException;

    @Override // fx.b1, java.io.Flushable
    void flush() throws IOException;

    @oy.l
    l getBuffer();

    @oy.l
    OutputStream outputStream();

    @oy.l
    m write(@oy.l byte[] bArr) throws IOException;

    @oy.l
    m write(@oy.l byte[] bArr, int i10, int i11) throws IOException;

    @oy.l
    m writeByte(int i10) throws IOException;

    @oy.l
    m writeDecimalLong(long j10) throws IOException;

    @oy.l
    m writeHexadecimalUnsignedLong(long j10) throws IOException;

    @oy.l
    m writeInt(int i10) throws IOException;

    @oy.l
    m writeIntLe(int i10) throws IOException;

    @oy.l
    m writeLong(long j10) throws IOException;

    @oy.l
    m writeLongLe(long j10) throws IOException;

    @oy.l
    m writeShort(int i10) throws IOException;

    @oy.l
    m writeShortLe(int i10) throws IOException;

    @oy.l
    m writeString(@oy.l String str, int i10, int i11, @oy.l Charset charset) throws IOException;

    @oy.l
    m writeString(@oy.l String str, @oy.l Charset charset) throws IOException;

    @oy.l
    m writeUtf8(@oy.l String str) throws IOException;

    @oy.l
    m writeUtf8(@oy.l String str, int i10, int i11) throws IOException;

    @oy.l
    m writeUtf8CodePoint(int i10) throws IOException;
}
