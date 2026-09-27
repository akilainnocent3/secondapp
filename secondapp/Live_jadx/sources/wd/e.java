package wd;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(Context context, String[] abis, String mappedLibraryName, File destination, f logger);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        String a(String mappedLibraryName);

        String[] b();

        void c(String libraryPath);

        void d(String libraryName);

        String e(String libraryName);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        void a(Throwable t10);

        void success();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        void a(String message);
    }

    public static f a() {
        return new f().c();
    }

    public static void b(final Context context, final String library) {
        d(context, library, null, null);
    }

    public static void c(final Context context, final String library, final String version) {
        d(context, library, version, null);
    }

    public static void d(final Context context, final String library, final String version, final c listener) {
        new f().h(context, library, version, listener);
    }

    public static void e(final Context context, final String library, final c listener) {
        d(context, library, null, listener);
    }

    public static f f(final d logger) {
        return new f().k(logger);
    }

    public static f g() {
        return new f().n();
    }
}
