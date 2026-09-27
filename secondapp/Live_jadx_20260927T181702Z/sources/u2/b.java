package u2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.t0(26)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final b f137610a = new b();

    public final boolean a(@oy.l File srcFile, @oy.l File dstFile) {
        kotlin.jvm.internal.m0.p(srcFile, "srcFile");
        kotlin.jvm.internal.m0.p(dstFile, "dstFile");
        try {
            Files.move(srcFile.toPath(), dstFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
