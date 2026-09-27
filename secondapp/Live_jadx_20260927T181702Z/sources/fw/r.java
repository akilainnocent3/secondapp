package fw;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final InputStream f85504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Charset f85505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final CharsetDecoder f85506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final ByteBuffer f85507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f85508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f85509f;

    public r(@oy.l InputStream inputStream, @oy.l Charset charset) {
        kotlin.jvm.internal.m0.p(inputStream, "inputStream");
        kotlin.jvm.internal.m0.p(charset, "charset");
        this.f85504a = inputStream;
        this.f85505b = charset;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.f85506c = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(k.f85460c.d());
        this.f85507d = byteBufferWrap;
        byteBufferWrap.flip();
    }

    public final int a(char[] cArr, int i10, int i11) throws CharacterCodingException {
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i10, i11);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        boolean z10 = false;
        while (true) {
            CoderResult coderResultDecode = this.f85506c.decode(this.f85507d, charBufferWrap, z10);
            if (coderResultDecode.isUnderflow()) {
                if (!z10 && charBufferWrap.hasRemaining()) {
                    if (b() < 0) {
                        if (charBufferWrap.position() == 0 && !this.f85507d.hasRemaining()) {
                            z10 = true;
                            break;
                        }
                        this.f85506c.reset();
                        z10 = true;
                    } else {
                        continue;
                    }
                } else {
                    break;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBufferWrap.position();
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z10) {
            this.f85506c.reset();
        }
        if (charBufferWrap.position() == 0) {
            return -1;
        }
        return charBufferWrap.position();
    }

    public final int b() {
        this.f85507d.compact();
        try {
            int iLimit = this.f85507d.limit();
            int iPosition = this.f85507d.position();
            int i10 = this.f85504a.read(this.f85507d.array(), this.f85507d.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
            if (i10 < 0) {
                return i10;
            }
            ByteBuffer byteBuffer = this.f85507d;
            kotlin.jvm.internal.m0.n(byteBuffer, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer.position(iPosition + i10);
            return this.f85507d.remaining();
        } finally {
            this.f85507d.flip();
        }
    }

    public final int c() {
        if (this.f85508e) {
            this.f85508e = false;
            return this.f85509f;
        }
        char[] cArr = new char[2];
        int iD = d(cArr, 0, 2);
        if (iD == -1) {
            return -1;
        }
        if (iD == 1) {
            return cArr[0];
        }
        if (iD == 2) {
            this.f85509f = cArr[1];
            this.f85508e = true;
            return cArr[0];
        }
        throw new IllegalStateException(("Unreachable state: " + iD).toString());
    }

    public final int d(@oy.l char[] array, int i10, int i11) {
        kotlin.jvm.internal.m0.p(array, "array");
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        if (i10 < 0 || i10 >= array.length || i11 < 0 || i10 + i11 > array.length) {
            throw new IllegalArgumentException(("Unexpected arguments: " + i10 + ", " + i11 + ", " + array.length).toString());
        }
        if (this.f85508e) {
            array[i10] = this.f85509f;
            i10++;
            i11--;
            this.f85508e = false;
            if (i11 == 0) {
                return 1;
            }
            i12 = 1;
        }
        if (i11 != 1) {
            return a(array, i10, i11) + i12;
        }
        int iC = c();
        if (iC != -1) {
            array[i10] = (char) iC;
            return i12 + 1;
        }
        if (i12 == 0) {
            return -1;
        }
        return i12;
    }

    public final void e() {
        k kVar = k.f85460c;
        byte[] bArrArray = this.f85507d.array();
        kotlin.jvm.internal.m0.o(bArrArray, "array(...)");
        kVar.c(bArrArray);
    }
}
