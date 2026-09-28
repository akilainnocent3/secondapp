package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;

/* JADX INFO: loaded from: classes8.dex */
public class wux extends vgp {
    public static kkh f(Path path) {
        cxz cxzVarC;
        path.getClass();
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = cxz.b;
                cxzVarC = cxz.a.c(symbolicLink);
            } else {
                cxzVarC = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lG = fileTimeCreationTime != null ? g(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lG2 = fileTimeLastModifiedTime != null ? g(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new kkh(zIsRegularFile, zIsDirectory, cxzVarC, lValueOf, lG, lG2, fileTimeLastAccessTime != null ? g(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    public static Long g(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // defpackage.vgp, defpackage.blh
    public void atomicMove(cxz cxzVar, cxz cxzVar2) throws IOException {
        cxzVar.getClass();
        cxzVar2.getClass();
        try {
            Files.move(cxzVar.f(), cxzVar2.f(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            i08.a("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.vgp, defpackage.blh
    public void createSymlink(cxz cxzVar, cxz cxzVar2) throws IOException {
        cxzVar.getClass();
        cxzVar2.getClass();
        Files.createSymbolicLink(cxzVar.f(), cxzVar2.f(), new FileAttribute[0]);
    }

    @Override // defpackage.vgp, defpackage.blh
    public kkh metadataOrNull(cxz cxzVar) {
        cxzVar.getClass();
        return f(cxzVar.f());
    }

    @Override // defpackage.vgp
    public String toString() {
        return "NioSystemFileSystem";
    }
}
