package zr;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@dr.l1(version = "2.1")
@dr.a3(markerClass = {r.class})
public interface s {
    void a(@oy.l ds.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar);

    void b(@oy.l ds.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar);

    void c(@oy.l ds.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar);

    void d(@oy.l ds.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar);
}
