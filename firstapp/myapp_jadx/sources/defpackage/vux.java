package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes8.dex */
public final class vux extends wux {
    public final FileSystem a;

    public vux(FileSystem fileSystem) {
        this.a = fileSystem;
    }

    @Override // defpackage.vgp, defpackage.blh
    public final uw90 appendingSink(cxz cxzVar, boolean z) throws IOException {
        cxzVar.getClass();
        ngs ngsVarB = a.b();
        ngsVarB.add(StandardOpenOption.APPEND);
        if (!z) {
            ngsVarB.add(StandardOpenOption.CREATE);
        }
        ngs ngsVarA = a.a(ngsVarB);
        Path pathM = m(cxzVar);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) ngsVarA.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathM, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        outputStreamNewOutputStream.getClass();
        return tmy.b(outputStreamNewOutputStream);
    }

    @Override // defpackage.wux, defpackage.vgp, defpackage.blh
    public final void atomicMove(cxz cxzVar, cxz cxzVar2) throws IOException {
        cxzVar.getClass();
        cxzVar2.getClass();
        try {
            Files.move(m(cxzVar), m(cxzVar2), (CopyOption[]) Arrays.copyOf(new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING}, 2)).getClass();
        } catch (UnsupportedOperationException unused) {
            i08.a("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.vgp, defpackage.blh
    public final cxz canonicalize(cxz cxzVar) throws IOException {
        cxzVar.getClass();
        try {
            String str = cxz.b;
            Path realPath = m(cxzVar).toRealPath(new LinkOption[0]);
            realPath.getClass();
            return cxz.a.c(realPath);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(alh.a(cxzVar, "no such file: "));
        }
    }

    @Override // defpackage.blh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    @Override // defpackage.vgp, defpackage.blh
    public final void createDirectory(cxz cxzVar, boolean z) throws IOException {
        boolean z2;
        cxzVar.getClass();
        kkh kkhVarMetadataOrNull = metadataOrNull(cxzVar);
        if (kkhVarMetadataOrNull != null) {
            z2 = kkhVarMetadataOrNull.b;
        }
        if (z2 && z) {
            ykh.a(cxzVar, " already exists.");
            return;
        }
        try {
            Files.createDirectory(m(cxzVar), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)).getClass();
        } catch (IOException e) {
            if (!z2) {
                throw new IOException(alh.a(cxzVar, "failed to create directory: "), e);
            }
        }
    }

    @Override // defpackage.wux, defpackage.vgp, defpackage.blh
    public final void createSymlink(cxz cxzVar, cxz cxzVar2) {
        cxzVar.getClass();
        cxzVar2.getClass();
        Files.createSymbolicLink(m(cxzVar), m(cxzVar2), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)).getClass();
    }

    @Override // defpackage.vgp, defpackage.blh
    public final void delete(cxz cxzVar, boolean z) throws IOException {
        cxzVar.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        Path pathM = m(cxzVar);
        try {
            Files.delete(pathM);
        } catch (NoSuchFileException unused) {
            if (z) {
                throw new FileNotFoundException(alh.a(cxzVar, "no such file: "));
            }
        } catch (IOException unused2) {
            if (Files.exists(pathM, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                i08.a(alh.a(cxzVar, "failed to delete "));
            }
        }
    }

    public final ArrayList l(cxz cxzVar, boolean z) throws IOException {
        Path pathM = m(cxzVar);
        try {
            pathM.getClass();
            DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(pathM, "*");
            try {
                directoryStreamNewDirectoryStream.getClass();
                List<Path> listA0 = CollectionsKt.A0(directoryStreamNewDirectoryStream);
                directoryStreamNewDirectoryStream.close();
                ArrayList arrayList = new ArrayList();
                for (Path path : listA0) {
                    String str = cxz.b;
                    arrayList.add(cxz.a.c(path));
                }
                o48.u(arrayList);
                return arrayList;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ft7.a(directoryStreamNewDirectoryStream, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            if (!z) {
                return null;
            }
            if (!Files.exists(pathM, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new FileNotFoundException(alh.a(cxzVar, "no such file: "));
            }
            i08.a(alh.a(cxzVar, "failed to list "));
            return null;
        }
    }

    @Override // defpackage.vgp, defpackage.blh
    public final List<cxz> list(cxz cxzVar) throws IOException {
        cxzVar.getClass();
        ArrayList arrayListL = l(cxzVar, true);
        arrayListL.getClass();
        return arrayListL;
    }

    @Override // defpackage.vgp, defpackage.blh
    public final List<cxz> listOrNull(cxz cxzVar) {
        cxzVar.getClass();
        return l(cxzVar, false);
    }

    public final Path m(cxz cxzVar) {
        Path path = this.a.getPath(cxzVar.a.s(), new String[0]);
        path.getClass();
        return path;
    }

    @Override // defpackage.wux, defpackage.vgp, defpackage.blh
    public final kkh metadataOrNull(cxz cxzVar) {
        cxzVar.getClass();
        return wux.f(m(cxzVar));
    }

    @Override // defpackage.vgp, defpackage.blh
    public final bkh openReadOnly(cxz cxzVar) throws IOException {
        cxzVar.getClass();
        try {
            FileChannel fileChannelOpen = FileChannel.open(m(cxzVar), StandardOpenOption.READ);
            fileChannelOpen.getClass();
            return new nux(fileChannelOpen);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(alh.a(cxzVar, "no such file: "));
        }
    }

    @Override // defpackage.vgp, defpackage.blh
    public final bkh openReadWrite(cxz cxzVar, boolean z, boolean z2) throws IOException {
        cxzVar.getClass();
        if (z && z2) {
            hb5.a("Cannot require mustCreate and mustExist at the same time.");
            return null;
        }
        ngs ngsVarB = a.b();
        ngsVarB.add(StandardOpenOption.READ);
        ngsVarB.add(StandardOpenOption.WRITE);
        if (z) {
            ngsVarB.add(StandardOpenOption.CREATE_NEW);
        } else if (!z2) {
            ngsVarB.add(StandardOpenOption.CREATE);
        }
        ngs ngsVarA = a.a(ngsVarB);
        try {
            Path pathM = m(cxzVar);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) ngsVarA.toArray(new StandardOpenOption[0]);
            FileChannel fileChannelOpen = FileChannel.open(pathM, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            fileChannelOpen.getClass();
            return new nux(fileChannelOpen);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(alh.a(cxzVar, "no such file: "));
        }
    }

    @Override // defpackage.vgp, defpackage.blh
    public final uw90 sink(cxz cxzVar, boolean z) throws IOException {
        cxzVar.getClass();
        ngs ngsVarB = a.b();
        if (z) {
            ngsVarB.add(StandardOpenOption.CREATE_NEW);
        }
        ngs ngsVarA = a.a(ngsVarB);
        try {
            Path pathM = m(cxzVar);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) ngsVarA.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathM, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            outputStreamNewOutputStream.getClass();
            return tmy.b(outputStreamNewOutputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(alh.a(cxzVar, "no such file: "));
        }
    }

    @Override // defpackage.vgp, defpackage.blh
    public final zpa0 source(cxz cxzVar) throws IOException {
        cxzVar.getClass();
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(m(cxzVar), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            inputStreamNewInputStream.getClass();
            return tmy.c(inputStreamNewInputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(alh.a(cxzVar, "no such file: "));
        }
    }

    @Override // defpackage.wux, defpackage.vgp
    public final String toString() {
        String strK = jq40.a(this.a.getClass()).k();
        strK.getClass();
        return strK;
    }
}
