package ij;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@yi.c
@r
@yi.d
public final class h0 extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Reader f94351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharsetEncoder f94352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f94353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharBuffer f94354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f94355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f94356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f94357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f94358i;

    /* JADX WARN: Illegal instructions before constructor call */
    public h0(Reader reader, Charset charset, int bufferSize) {
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this(reader, charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction), bufferSize);
    }

    public static int a(Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    public static CharBuffer c(CharBuffer buf) {
        CharBuffer charBufferWrap = CharBuffer.wrap(Arrays.copyOf(buf.array(), buf.capacity() * 2));
        x.e(charBufferWrap, buf.position());
        x.c(charBufferWrap, buf.limit());
        return charBufferWrap;
    }

    public final int b(byte[] b10, int off, int len) {
        int iMin = Math.min(len, this.f94355f.remaining());
        this.f94355f.get(b10, off, iMin);
        return iMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f94351b.close();
    }

    public final void d() throws IOException {
        if (a(this.f94354e) == 0) {
            if (this.f94354e.position() > 0) {
                x.b(this.f94354e.compact());
            } else {
                this.f94354e = c(this.f94354e);
            }
        }
        int iLimit = this.f94354e.limit();
        int i10 = this.f94351b.read(this.f94354e.array(), iLimit, a(this.f94354e));
        if (i10 == -1) {
            this.f94356g = true;
        } else {
            x.c(this.f94354e, iLimit + i10);
        }
    }

    public final void h(boolean overflow) {
        x.b(this.f94355f);
        if (overflow && this.f94355f.remaining() == 0) {
            this.f94355f = ByteBuffer.allocate(this.f94355f.capacity() * 2);
        } else {
            this.f94357h = true;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f94353d) == 1) {
            return lj.u.p(this.f94353d[0]);
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] b10, int off, int len) throws IOException {
        CoderResult coderResultFlush;
        zi.l0.f0(off, off + len, b10.length);
        if (len == 0) {
            return 0;
        }
        boolean z10 = this.f94356g;
        int iB = 0;
        while (true) {
            if (this.f94357h) {
                iB += b(b10, off + iB, len - iB);
                if (iB == len || this.f94358i) {
                    break;
                }
                this.f94357h = false;
                x.a(this.f94355f);
            }
            while (true) {
                if (this.f94358i) {
                    coderResultFlush = CoderResult.UNDERFLOW;
                } else {
                    coderResultFlush = z10 ? this.f94352c.flush(this.f94355f) : this.f94352c.encode(this.f94354e, this.f94355f, this.f94356g);
                }
                if (coderResultFlush.isOverflow()) {
                    h(true);
                    break;
                }
                if (coderResultFlush.isUnderflow()) {
                    if (z10) {
                        this.f94358i = true;
                        h(false);
                        break;
                    }
                    if (this.f94356g) {
                        z10 = true;
                    } else {
                        d();
                    }
                } else if (coderResultFlush.isError()) {
                    coderResultFlush.throwException();
                    return 0;
                }
            }
        }
        if (iB > 0) {
            return iB;
        }
        return -1;
    }

    public h0(Reader reader, CharsetEncoder encoder, int bufferSize) {
        this.f94353d = new byte[1];
        this.f94351b = (Reader) zi.l0.E(reader);
        this.f94352c = (CharsetEncoder) zi.l0.E(encoder);
        zi.l0.k(bufferSize > 0, "bufferSize must be positive: %s", bufferSize);
        encoder.reset();
        CharBuffer charBufferAllocate = CharBuffer.allocate(bufferSize);
        this.f94354e = charBufferAllocate;
        x.b(charBufferAllocate);
        this.f94355f = ByteBuffer.allocate(bufferSize);
    }
}
