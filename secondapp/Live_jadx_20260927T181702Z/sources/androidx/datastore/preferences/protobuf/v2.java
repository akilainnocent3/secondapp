package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y
public interface v2 extends w2 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a extends w2, Cloneable {
        boolean N4(InputStream input, v0 extensionRegistry) throws IOException;

        @x
        a Y0(InputStream input, v0 extensionRegistry) throws IOException;

        v2 build();

        v2 buildPartial();

        @x
        a clear();

        /* JADX INFO: renamed from: clone */
        a mo0clone();

        @x
        /* JADX INFO: renamed from: g3 */
        a i5(z input, v0 extensionRegistry) throws IOException;

        @x
        a h(v2 other);

        boolean mergeDelimitedFrom(InputStream input) throws IOException;

        @x
        a mergeFrom(InputStream input) throws IOException;

        @x
        a mergeFrom(byte[] data) throws y1;

        @x
        /* JADX INFO: renamed from: mergeFrom */
        a n5(byte[] data, int off, int len) throws y1;

        @x
        a r3(byte[] data, v0 extensionRegistry) throws y1;

        @x
        a t3(u data, v0 extensionRegistry) throws y1;

        @x
        a u2(u data) throws y1;

        @x
        a v2(z input) throws IOException;

        @x
        a z2(byte[] data, int off, int len, v0 extensionRegistry) throws y1;
    }

    void R1(b0 output) throws IOException;

    m3<? extends v2> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    byte[] toByteArray();

    u toByteString();

    void writeDelimitedTo(OutputStream output) throws IOException;

    void writeTo(OutputStream output) throws IOException;
}
