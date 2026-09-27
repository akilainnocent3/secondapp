package e2;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f79783d = "AtomicFile";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f79784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f79785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f79786c;

    public c(@NonNull File file) {
        this.f79784a = file;
        this.f79785b = new File(file.getPath() + ".new");
        this.f79786c = new File(file.getPath() + ".bak");
    }

    public static void g(@NonNull File file, @NonNull File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public static boolean i(@NonNull FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void a() {
        this.f79784a.delete();
        this.f79785b.delete();
        this.f79786c.delete();
    }

    public void b(@Nullable FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!i(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e10) {
            Log.e("AtomicFile", "Failed to close file output stream", e10);
        }
        if (this.f79785b.delete()) {
            return;
        }
        Log.e("AtomicFile", "Failed to delete new file " + this.f79785b);
    }

    public void c(@Nullable FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!i(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e10) {
            Log.e("AtomicFile", "Failed to close file output stream", e10);
        }
        g(this.f79785b, this.f79784a);
    }

    @NonNull
    public File d() {
        return this.f79784a;
    }

    @NonNull
    public FileInputStream e() throws FileNotFoundException {
        if (this.f79786c.exists()) {
            g(this.f79786c, this.f79784a);
        }
        if (this.f79785b.exists() && this.f79784a.exists() && !this.f79785b.delete()) {
            Log.e("AtomicFile", "Failed to delete outdated new file " + this.f79785b);
        }
        return new FileInputStream(this.f79784a);
    }

    @NonNull
    public byte[] f() throws IOException {
        FileInputStream fileInputStreamE = e();
        try {
            byte[] bArr = new byte[fileInputStreamE.available()];
            int i10 = 0;
            while (true) {
                int i11 = fileInputStreamE.read(bArr, i10, bArr.length - i10);
                if (i11 <= 0) {
                    fileInputStreamE.close();
                    return bArr;
                }
                i10 += i11;
                int iAvailable = fileInputStreamE.available();
                if (iAvailable > bArr.length - i10) {
                    byte[] bArr2 = new byte[iAvailable + i10];
                    System.arraycopy(bArr, 0, bArr2, 0, i10);
                    bArr = bArr2;
                }
            }
        } catch (Throwable th2) {
            fileInputStreamE.close();
            throw th2;
        }
    }

    @NonNull
    public FileOutputStream h() throws IOException {
        if (this.f79786c.exists()) {
            g(this.f79786c, this.f79784a);
        }
        try {
            return new FileOutputStream(this.f79785b);
        } catch (FileNotFoundException unused) {
            if (!this.f79785b.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + this.f79785b);
            }
            try {
                return new FileOutputStream(this.f79785b);
            } catch (FileNotFoundException e10) {
                throw new IOException("Failed to create new file " + this.f79785b, e10);
            }
        }
    }
}
