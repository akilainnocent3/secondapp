package zr;

import java.nio.file.FileSystemException;
import java.nio.file.Path;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class w extends FileSystemException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@oy.l Path file, @oy.m Path path, @oy.m String str) {
        super(file.toString(), path != null ? path.toString() : null, str);
        kotlin.jvm.internal.m0.p(file, "file");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(@oy.l Path file) {
        this(file, null, null);
        kotlin.jvm.internal.m0.p(file, "file");
    }
}
