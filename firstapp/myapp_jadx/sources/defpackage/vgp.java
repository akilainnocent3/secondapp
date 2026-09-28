package defpackage;

import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class vgp extends blh {
    public static ArrayList d(cxz cxzVar, boolean z) throws IOException {
        File file = cxzVar.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!z) {
                return null;
            }
            if (!file.exists()) {
                throw new FileNotFoundException(alh.a(cxzVar, "no such file: "));
            }
            i08.a(alh.a(cxzVar, "failed to list "));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(cxzVar.e(str));
        }
        o48.u(arrayList);
        return arrayList;
    }

    @Override // defpackage.blh
    public uw90 appendingSink(cxz cxzVar, boolean z) throws IOException {
        cxzVar.getClass();
        if (!z || exists(cxzVar)) {
            return tmy.b(new FileOutputStream(cxzVar.toFile(), true));
        }
        ykh.a(cxzVar, " doesn't exist.");
        return null;
    }

    @Override // defpackage.blh
    public void atomicMove(cxz cxzVar, cxz cxzVar2) throws IOException {
        cxzVar.getClass();
        cxzVar2.getClass();
        if (cxzVar.toFile().renameTo(cxzVar2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + cxzVar + " to " + cxzVar2);
    }

    @Override // defpackage.blh
    public cxz canonicalize(cxz cxzVar) throws IOException {
        cxzVar.getClass();
        File canonicalFile = cxzVar.toFile().getCanonicalFile();
        if (!canonicalFile.exists()) {
            throw new FileNotFoundException("no such file");
        }
        String str = cxz.b;
        return cxz.a.b(canonicalFile);
    }

    @Override // defpackage.blh
    public void createDirectory(cxz cxzVar, boolean z) throws IOException {
        cxzVar.getClass();
        if (cxzVar.toFile().mkdir()) {
            return;
        }
        kkh kkhVarMetadataOrNull = metadataOrNull(cxzVar);
        if (kkhVarMetadataOrNull == null || !kkhVarMetadataOrNull.b) {
            i08.a(alh.a(cxzVar, "failed to create directory: "));
        } else if (z) {
            ykh.a(cxzVar, " already exists.");
        }
    }

    @Override // defpackage.blh
    public void createSymlink(cxz cxzVar, cxz cxzVar2) throws IOException {
        cxzVar.getClass();
        cxzVar2.getClass();
        throw new IOException("unsupported");
    }

    @Override // defpackage.blh
    public void delete(cxz cxzVar, boolean z) throws IOException {
        cxzVar.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = cxzVar.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            i08.a(alh.a(cxzVar, "failed to delete "));
        } else if (z) {
            throw new FileNotFoundException(alh.a(cxzVar, "no such file: "));
        }
    }

    @Override // defpackage.blh
    public List<cxz> list(cxz cxzVar) throws IOException {
        cxzVar.getClass();
        ArrayList arrayListD = d(cxzVar, true);
        arrayListD.getClass();
        return arrayListD;
    }

    @Override // defpackage.blh
    public List<cxz> listOrNull(cxz cxzVar) {
        cxzVar.getClass();
        return d(cxzVar, false);
    }

    @Override // defpackage.blh
    public kkh metadataOrNull(cxz cxzVar) {
        cxzVar.getClass();
        File file = cxzVar.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new kkh(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    @Override // defpackage.blh
    public bkh openReadOnly(cxz cxzVar) {
        cxzVar.getClass();
        return new ugp(new RandomAccessFile(cxzVar.toFile(), "r"));
    }

    @Override // defpackage.blh
    public bkh openReadWrite(cxz cxzVar, boolean z, boolean z2) throws IOException {
        cxzVar.getClass();
        if (z && z2) {
            hb5.a("Cannot require mustCreate and mustExist at the same time.");
            return null;
        }
        if (z && exists(cxzVar)) {
            ykh.a(cxzVar, " already exists.");
            return null;
        }
        if (!z2 || exists(cxzVar)) {
            return new ugp(new RandomAccessFile(cxzVar.toFile(), "rw"));
        }
        ykh.a(cxzVar, " doesn't exist.");
        return null;
    }

    @Override // defpackage.blh
    public zpa0 source(cxz cxzVar) {
        cxzVar.getClass();
        return new nmn(new FileInputStream(cxzVar.toFile()), sxf0.NONE);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // defpackage.blh
    public uw90 sink(cxz cxzVar, boolean z) throws IOException {
        cxzVar.getClass();
        if (z && exists(cxzVar)) {
            ykh.a(cxzVar, ACKxwYRsuWyGz.eMMY);
            return null;
        }
        return tmy.b(new FileOutputStream(cxzVar.toFile(), false));
    }
}
