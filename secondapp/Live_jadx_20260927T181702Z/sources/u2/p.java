package u2;

import android.os.Build;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final boolean a(@oy.l File file, @oy.l File toFile) {
        kotlin.jvm.internal.m0.p(file, "<this>");
        kotlin.jvm.internal.m0.p(toFile, "toFile");
        return Build.VERSION.SDK_INT >= 26 ? b.f137610a.a(file, toFile) : file.renameTo(toFile);
    }
}
