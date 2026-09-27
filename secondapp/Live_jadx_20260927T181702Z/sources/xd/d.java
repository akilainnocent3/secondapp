package xd;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class d extends c.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f144852m;

    public d(final boolean bigEndian, final f parser) throws IOException {
        this.f144836a = bigEndian;
        this.f144852m = parser;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(bigEndian ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f144837b = parser.l(byteBufferAllocate, 16L);
        this.f144838c = parser.o(byteBufferAllocate, 28L);
        this.f144839d = parser.o(byteBufferAllocate, 32L);
        this.f144840e = parser.l(byteBufferAllocate, 42L);
        this.f144841f = parser.l(byteBufferAllocate, 44L);
        this.f144842g = parser.l(byteBufferAllocate, 46L);
        this.f144843h = parser.l(byteBufferAllocate, 48L);
        this.f144844i = parser.l(byteBufferAllocate, 50L);
    }

    @Override // xd.c.b
    public c.a a(final long baseOffset, final int index) throws IOException {
        return new a(this.f144852m, this, baseOffset, index);
    }

    @Override // xd.c.b
    public c.AbstractC1525c b(final long index) throws IOException {
        return new g(this.f144852m, this, index);
    }

    @Override // xd.c.b
    public c.d c(final int index) throws IOException {
        return new i(this.f144852m, this, index);
    }
}
