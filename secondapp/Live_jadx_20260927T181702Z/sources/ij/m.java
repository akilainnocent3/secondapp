package ij;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@yi.c
@r
@yi.d
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @yi.e
    public static final Logger f94381a = Logger.getLogger(m.class.getName());

    public static void a(@zq.a Closeable closeable, boolean swallowIOException) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            if (!swallowIOException) {
                throw e10;
            }
            f94381a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e10);
        }
    }

    public static void b(@zq.a InputStream inputStream) {
        try {
            a(inputStream, true);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public static void c(@zq.a Reader reader) {
        try {
            a(reader, true);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
