package h9;

import java.nio.ByteBuffer;
import java.util.UUID;
import k.y0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@cs.j(name = "UUIDUtil")
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public final class y {
    @oy.l
    public static final UUID a(@oy.l byte[] bytes) {
        m0.p(bytes, "bytes");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bytes);
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }

    @oy.l
    public static final byte[] b(@oy.l UUID uuid) {
        m0.p(uuid, "uuid");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        m0.o(bArrArray, "array(...)");
        return bArrArray;
    }
}
