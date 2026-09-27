package xd;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class h extends c.AbstractC1525c {
    public h(final f parser, final c.b header, final long index) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(header.f144836a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j10 = header.f144838c + (index * ((long) header.f144840e));
        this.f144847a = parser.o(byteBufferAllocate, j10);
        this.f144848b = parser.m(byteBufferAllocate, 8 + j10);
        this.f144849c = parser.m(byteBufferAllocate, 16 + j10);
        this.f144850d = parser.m(byteBufferAllocate, j10 + 40);
    }
}
