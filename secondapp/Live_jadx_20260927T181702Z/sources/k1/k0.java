package k1;

import android.annotation.SuppressLint;
import android.graphics.Path;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n1#1,80:1\n43#1,3:81\n*S KotlinDebug\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n60#1:81,3\n*E\n"})
@SuppressLint({"ClassVerificationFailure"})
public final class k0 {
    @oy.l
    public static final Path a(@oy.l Path path, @oy.l Path path2) {
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.INTERSECT);
        return path3;
    }

    @k.t0(26)
    @oy.l
    public static final Iterable<m0> b(@oy.l Path path, float f10) {
        return n0.b(path, f10);
    }

    public static /* synthetic */ Iterable c(Path path, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.5f;
        }
        return b(path, f10);
    }

    @oy.l
    public static final Path d(@oy.l Path path, @oy.l Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.DIFFERENCE);
        return path3;
    }

    @oy.l
    public static final Path e(@oy.l Path path, @oy.l Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @oy.l
    public static final Path f(@oy.l Path path, @oy.l Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @oy.l
    public static final Path g(@oy.l Path path, @oy.l Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.XOR);
        return path3;
    }
}
