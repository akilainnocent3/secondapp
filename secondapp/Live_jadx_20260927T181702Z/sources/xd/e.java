package xd;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class e extends c.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f144853m;

    public e(final boolean bigEndian, final f parser) throws IOException {
        this.f144836a = bigEndian;
        this.f144853m = parser;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(bigEndian ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f144837b = parser.l(byteBufferAllocate, 16L);
        this.f144838c = parser.m(byteBufferAllocate, 32L);
        this.f144839d = parser.m(byteBufferAllocate, 40L);
        this.f144840e = parser.l(byteBufferAllocate, 54L);
        this.f144841f = parser.l(byteBufferAllocate, 56L);
        this.f144842g = parser.l(byteBufferAllocate, 58L);
        this.f144843h = parser.l(byteBufferAllocate, 60L);
        this.f144844i = parser.l(byteBufferAllocate, 62L);
    }

    @Override // xd.c.b
    public c.a a(final long baseOffset, final int index) throws IOException {
        return new b(this.f144853m, this, baseOffset, index);
    }

    @Override // xd.c.b
    public c.AbstractC1525c b(final long index) throws IOException {
        return new h(this.f144853m, this, index);
    }

    @Override // xd.c.b
    public c.d c(final int index) throws IOException {
        return new j(this.f144853m, this, index);
    }
}
