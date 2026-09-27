package u2;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    @oy.l
    public static final w a(@oy.l File file) {
        kotlin.jvm.internal.m0.p(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.m0.o(absolutePath, "file.canonicalFile.absolutePath");
        return x.a(absolutePath);
    }
}
