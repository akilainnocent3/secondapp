package zr;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class v extends SimpleFileVisitor<Path> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    public final ds.p<Path, BasicFileAttributes, FileVisitResult> f162102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public final ds.p<Path, BasicFileAttributes, FileVisitResult> f162103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    public final ds.p<Path, IOException, FileVisitResult> f162104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    public final ds.p<Path, IOException, FileVisitResult> f162105d;

    /* JADX WARN: Multi-variable type inference failed */
    public v(@oy.m ds.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar, @oy.m ds.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar2, @oy.m ds.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar3, @oy.m ds.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar4) {
        this.f162102a = pVar;
        this.f162103b = pVar2;
        this.f162104c = pVar3;
        this.f162105d = pVar4;
    }

    @oy.l
    public FileVisitResult a(@oy.l Path dir, @oy.m IOException iOException) throws IOException {
        FileVisitResult fileVisitResultA;
        kotlin.jvm.internal.m0.p(dir, "dir");
        ds.p<Path, IOException, FileVisitResult> pVar = this.f162105d;
        if (pVar != null && (fileVisitResultA = u.a(pVar.invoke(dir, iOException))) != null) {
            return fileVisitResultA;
        }
        FileVisitResult fileVisitResultPostVisitDirectory = super.postVisitDirectory(dir, iOException);
        kotlin.jvm.internal.m0.o(fileVisitResultPostVisitDirectory, "postVisitDirectory(...)");
        return fileVisitResultPostVisitDirectory;
    }

    @oy.l
    public FileVisitResult b(@oy.l Path dir, @oy.l BasicFileAttributes attrs) throws IOException {
        FileVisitResult fileVisitResultA;
        kotlin.jvm.internal.m0.p(dir, "dir");
        kotlin.jvm.internal.m0.p(attrs, "attrs");
        ds.p<Path, BasicFileAttributes, FileVisitResult> pVar = this.f162102a;
        if (pVar != null && (fileVisitResultA = u.a(pVar.invoke(dir, attrs))) != null) {
            return fileVisitResultA;
        }
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(dir, attrs);
        kotlin.jvm.internal.m0.o(fileVisitResultPreVisitDirectory, "preVisitDirectory(...)");
        return fileVisitResultPreVisitDirectory;
    }

    @oy.l
    public FileVisitResult c(@oy.l Path file, @oy.l BasicFileAttributes attrs) throws IOException {
        FileVisitResult fileVisitResultA;
        kotlin.jvm.internal.m0.p(file, "file");
        kotlin.jvm.internal.m0.p(attrs, "attrs");
        ds.p<Path, BasicFileAttributes, FileVisitResult> pVar = this.f162103b;
        if (pVar != null && (fileVisitResultA = u.a(pVar.invoke(file, attrs))) != null) {
            return fileVisitResultA;
        }
        FileVisitResult fileVisitResultVisitFile = super.visitFile(file, attrs);
        kotlin.jvm.internal.m0.o(fileVisitResultVisitFile, "visitFile(...)");
        return fileVisitResultVisitFile;
    }

    @oy.l
    public FileVisitResult d(@oy.l Path file, @oy.l IOException exc) throws IOException {
        FileVisitResult fileVisitResultA;
        kotlin.jvm.internal.m0.p(file, "file");
        kotlin.jvm.internal.m0.p(exc, "exc");
        ds.p<Path, IOException, FileVisitResult> pVar = this.f162104c;
        if (pVar != null && (fileVisitResultA = u.a(pVar.invoke(file, exc))) != null) {
            return fileVisitResultA;
        }
        FileVisitResult fileVisitResultVisitFileFailed = super.visitFileFailed(file, exc);
        kotlin.jvm.internal.m0.o(fileVisitResultVisitFileFailed, "visitFileFailed(...)");
        return fileVisitResultVisitFileFailed;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        return a(com.applovin.shadow.okio.h.a(obj), iOException);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return b(com.applovin.shadow.okio.h.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return c(com.applovin.shadow.okio.h.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        return d(com.applovin.shadow.okio.h.a(obj), iOException);
    }
}
