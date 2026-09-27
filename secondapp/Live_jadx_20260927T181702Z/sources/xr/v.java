package xr;

import java.io.File;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class v extends j {
    public /* synthetic */ v(File file, File file2, String str, int i10, kotlin.jvm.internal.x xVar) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@oy.l File file, @oy.m File file2, @oy.m String str) {
        super(file, file2, str);
        m0.p(file, "file");
    }
}
