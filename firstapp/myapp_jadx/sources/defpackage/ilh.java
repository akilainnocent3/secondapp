package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ilh {
    public static Uri a(File file, File file2) throws k8n {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new k8n("Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    public static File b(h8n.g gVar) {
        try {
            File file = gVar.a;
            String parent = file.getParent();
            StringBuilder sb = new StringBuilder("CameraX");
            sb.append(UUID.randomUUID().toString());
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            sb.append(iLastIndexOf >= 0 ? name.substring(iLastIndexOf) : "");
            return new File(parent, sb.toString());
        } catch (IOException e) {
            throw new k8n("Failed to create temp file.", e);
        }
    }

    public static void c(File file, h8n.g gVar) {
        try {
            try {
                a(file, gVar.a);
                file.delete();
            } catch (IOException unused) {
                throw new k8n("Failed to write to OutputStream.", null);
            }
        } catch (Throwable th) {
            file.delete();
            throw th;
        }
    }
}
