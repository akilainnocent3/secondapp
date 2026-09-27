package fx;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface n extends d1, ReadableByteChannel {
    long A1(@oy.l o oVar, long j10) throws IOException;

    long C1(@oy.l b1 b1Var) throws IOException;

    long b0(@oy.l o oVar, long j10) throws IOException;

    @oy.l
    @dr.o(level = dr.q.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @dr.g1(expression = "buffer", imports = {}))
    l buffer();

    boolean exhausted() throws IOException;

    boolean f1(long j10, @oy.l o oVar, int i10, int i11) throws IOException;

    @oy.l
    l getBuffer();

    int h0(@oy.l r0 r0Var) throws IOException;

    long indexOf(byte b10) throws IOException;

    long indexOf(byte b10, long j10) throws IOException;

    long indexOf(byte b10, long j10, long j11) throws IOException;

    @oy.l
    InputStream inputStream();

    boolean j1(long j10, @oy.l o oVar) throws IOException;

    @oy.l
    n peek();

    long r1(@oy.l o oVar) throws IOException;

    int read(@oy.l byte[] bArr) throws IOException;

    int read(@oy.l byte[] bArr, int i10, int i11) throws IOException;

    byte readByte() throws IOException;

    @oy.l
    byte[] readByteArray() throws IOException;

    @oy.l
    byte[] readByteArray(long j10) throws IOException;

    @oy.l
    o readByteString() throws IOException;

    @oy.l
    o readByteString(long j10) throws IOException;

    long readDecimalLong() throws IOException;

    void readFully(@oy.l byte[] bArr) throws IOException;

    long readHexadecimalUnsignedLong() throws IOException;

    int readInt() throws IOException;

    int readIntLe() throws IOException;

    long readLong() throws IOException;

    long readLongLe() throws IOException;

    short readShort() throws IOException;

    short readShortLe() throws IOException;

    @oy.l
    String readString(long j10, @oy.l Charset charset) throws IOException;

    @oy.l
    String readString(@oy.l Charset charset) throws IOException;

    @oy.l
    String readUtf8() throws IOException;

    @oy.l
    String readUtf8(long j10) throws IOException;

    int readUtf8CodePoint() throws IOException;

    @oy.m
    String readUtf8Line() throws IOException;

    @oy.l
    String readUtf8LineStrict() throws IOException;

    @oy.l
    String readUtf8LineStrict(long j10) throws IOException;

    boolean request(long j10) throws IOException;

    void require(long j10) throws IOException;

    void s1(@oy.l l lVar, long j10) throws IOException;

    void skip(long j10) throws IOException;

    long u0(@oy.l o oVar) throws IOException;

    @oy.m
    <T> T x0(@oy.l h1<T> h1Var) throws IOException;

    long z1(@oy.l o oVar, long j10, long j11) throws IOException;
}
