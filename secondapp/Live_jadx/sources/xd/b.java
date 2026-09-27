package xd;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class b extends c.a {
    public b(final f parser, final c.b header, long baseOffset, final int index) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(header.f144836a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j10 = baseOffset + ((long) (index * 16));
        this.f144831a = parser.m(byteBufferAllocate, j10);
        this.f144832b = parser.m(byteBufferAllocate, j10 + 8);
    }
}
