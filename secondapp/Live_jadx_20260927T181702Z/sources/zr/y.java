package zr;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final y f162125a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final LinkOption[] f162126b = {LinkOption.NOFOLLOW_LINKS};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final LinkOption[] f162127c = new LinkOption[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final Set<FileVisitOption> f162128d = fr.y1.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final Set<FileVisitOption> f162129e = fr.x1.f(FileVisitOption.FOLLOW_LINKS);

    @oy.l
    public final LinkOption[] a(boolean z10) {
        return z10 ? f162127c : f162126b;
    }

    @oy.l
    public final Set<FileVisitOption> b(boolean z10) {
        return z10 ? f162129e : f162128d;
    }
}
