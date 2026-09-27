package ij;

import java.io.Flushable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@yi.c
@r
@yi.d
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f94407a = Logger.getLogger(v.class.getName());

    public static void a(Flushable flushable, boolean swallowIOException) throws IOException {
        try {
            flushable.flush();
        } catch (IOException e10) {
            if (!swallowIOException) {
                throw e10;
            }
            f94407a.log(Level.WARNING, "IOException thrown while flushing Flushable.", (Throwable) e10);
        }
    }

    @yi.a
    public static void b(Flushable flushable) {
        try {
            a(flushable, true);
        } catch (IOException e10) {
            f94407a.log(Level.SEVERE, "IOException should not have been thrown.", (Throwable) e10);
        }
    }
}
