package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class a5 {
    public static u a(ByteBuffer buffer) {
        return u.m0(buffer);
    }

    public static u b(byte[] buffer) {
        return u.n0(buffer);
    }

    public static u c(byte[] buffer, int offset, int length) {
        return u.q0(buffer, offset, length);
    }

    public static void d(u bytes, t output) throws IOException {
        bytes.r0(output);
    }
}
