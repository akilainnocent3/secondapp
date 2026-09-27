package xr;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class j extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final File f145506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    public final File f145507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    public final String f145508d;

    public /* synthetic */ j(File file, File file2, String str, int i10, kotlin.jvm.internal.x xVar) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }

    @oy.l
    public final File d() {
        return this.f145506b;
    }

    @oy.m
    public final File g() {
        return this.f145507c;
    }

    @oy.m
    public final String h() {
        return this.f145508d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@oy.l File file, @oy.m File file2, @oy.m String str) {
        super(f.b(file, file2, str));
        m0.p(file, "file");
        this.f145506b = file;
        this.f145507c = file2;
        this.f145508d = str;
    }
}
