package xr;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class g extends ByteArrayOutputStream {
    public g(int i10) {
        super(i10);
    }

    @oy.l
    public final byte[] d() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        m0.o(buf, "buf");
        return buf;
    }
}
