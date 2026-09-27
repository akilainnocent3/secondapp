package d3;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import androidx.media3.session.fe;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class c extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File f77717c;

    public c(@Nullable a aVar, File file) {
        super(aVar);
        this.f77717c = file;
    }

    public static boolean w(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zW = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zW &= w(file2);
                }
                if (!file2.delete()) {
                    Log.w("DocumentFile", "Failed to delete " + file2);
                    zW = false;
                }
            }
        }
        return zW;
    }

    public static String x(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(iLastIndexOf + 1).toLowerCase());
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // d3.a
    public boolean a() {
        return this.f77717c.canRead();
    }

    @Override // d3.a
    public boolean b() {
        return this.f77717c.canWrite();
    }

    @Override // d3.a
    @Nullable
    public a c(String str) {
        File file = new File(this.f77717c, str);
        if (file.isDirectory() || file.mkdir()) {
            return new c(this, file);
        }
        return null;
    }

    @Override // d3.a
    @Nullable
    public a d(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = str2 + fe.F + extensionFromMimeType;
        }
        File file = new File(this.f77717c, str2);
        try {
            file.createNewFile();
            return new c(this, file);
        } catch (IOException e10) {
            Log.w("DocumentFile", "Failed to createFile: " + e10);
            return null;
        }
    }

    @Override // d3.a
    public boolean e() {
        w(this.f77717c);
        return this.f77717c.delete();
    }

    @Override // d3.a
    public boolean f() {
        return this.f77717c.exists();
    }

    @Override // d3.a
    public String k() {
        return this.f77717c.getName();
    }

    @Override // d3.a
    @Nullable
    public String m() {
        if (this.f77717c.isDirectory()) {
            return null;
        }
        return x(this.f77717c.getName());
    }

    @Override // d3.a
    public Uri n() {
        return Uri.fromFile(this.f77717c);
    }

    @Override // d3.a
    public boolean o() {
        return this.f77717c.isDirectory();
    }

    @Override // d3.a
    public boolean q() {
        return this.f77717c.isFile();
    }

    @Override // d3.a
    public boolean r() {
        return false;
    }

    @Override // d3.a
    public long s() {
        return this.f77717c.lastModified();
    }

    @Override // d3.a
    public long t() {
        return this.f77717c.length();
    }

    @Override // d3.a
    public a[] u() {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = this.f77717c.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                arrayList.add(new c(this, file));
            }
        }
        return (a[]) arrayList.toArray(new a[arrayList.size()]);
    }

    @Override // d3.a
    public boolean v(String str) {
        File file = new File(this.f77717c.getParentFile(), str);
        if (!this.f77717c.renameTo(file)) {
            return false;
        }
        this.f77717c = file;
        return true;
    }
}
