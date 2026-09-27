package i3;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class a0 extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<a> f90290b = ThreadLocal.withInitial(new Supplier() { // from class: i3.z
        @Override // java.util.function.Supplier
        public final Object get() {
            return a0.f();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharsetEncoder f90291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharsetDecoder f90292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f90293c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ByteBuffer f90294d = null;

        public a() {
            Charset charset = StandardCharsets.UTF_8;
            this.f90291a = charset.newEncoder();
            this.f90292b = charset.newDecoder();
        }
    }

    public static /* synthetic */ a f() {
        return new a();
    }

    @Override // i3.x
    public String a(ByteBuffer byteBuffer, int i10, int i11) {
        CharsetDecoder charsetDecoder = f90290b.get().f90292b;
        charsetDecoder.reset();
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i10);
        byteBufferDuplicate.limit(i10 + i11);
        try {
            return charsetDecoder.decode(byteBufferDuplicate).toString();
        } catch (CharacterCodingException e10) {
            throw new IllegalArgumentException("Bad encoding", e10);
        }
    }

    @Override // i3.x
    public void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        a aVar = f90290b.get();
        if (aVar.f90293c != charSequence) {
            c(charSequence);
        }
        byteBuffer.put(aVar.f90294d);
    }

    @Override // i3.x
    public int c(CharSequence charSequence) {
        a aVar = f90290b.get();
        int length = (int) (charSequence.length() * aVar.f90291a.maxBytesPerChar());
        ByteBuffer byteBuffer = aVar.f90294d;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            aVar.f90294d = ByteBuffer.allocate(Math.max(128, length));
        }
        aVar.f90294d.clear();
        aVar.f90293c = charSequence;
        CoderResult coderResultEncode = aVar.f90291a.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), aVar.f90294d, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (CharacterCodingException e10) {
                throw new IllegalArgumentException("bad character encoding", e10);
            }
        }
        aVar.f90294d.flip();
        return aVar.f90294d.remaining();
    }
}
