package lk;

import android.content.Context;
import androidx.annotation.Nullable;
import ck.j;
import fk.i;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f104705h = ".com.google.firebase.crashlytics.files.v1";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f104706i = ".com.google.firebase.crashlytics.files.v2";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f104707j = ".crashlytics.v3";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f104708k = "open-sessions";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f104709l = "native";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f104710m = "reports";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f104711n = "priority-reports";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f104712o = "native-reports";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f104714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f104715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f104716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f104717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f104718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final File f104719g;

    public g(Context context) {
        String str;
        String strD = j.f24841a.g(context).d();
        this.f104713a = strD;
        File filesDir = context.getFilesDir();
        this.f104714b = filesDir;
        if (y()) {
            str = f104707j + File.separator + x(strD);
        } else {
            str = f104705h;
        }
        File fileT = t(new File(filesDir, str));
        this.f104715c = fileT;
        this.f104716d = t(new File(fileT, f104708k));
        this.f104717e = t(new File(fileT, f104710m));
        this.f104718f = t(new File(fileT, f104711n));
        this.f104719g = t(new File(fileT, f104712o));
    }

    public static synchronized File t(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                ck.g.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                ck.g.f().d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static File u(File file) {
        file.mkdirs();
        return file;
    }

    public static boolean v(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                v(file2);
            }
        }
        return file.delete();
    }

    public static <T> List<T> w(@Nullable T[] tArr) {
        return tArr == null ? Collections.EMPTY_LIST : Arrays.asList(tArr);
    }

    @h1
    public static String x(String str) {
        return str.length() > 40 ? i.D(str) : str.replaceAll("[^a-zA-Z0-9.]", e.f104695m);
    }

    public final void b(String str) {
        File file = new File(this.f104714b, str);
        if (file.exists() && v(file)) {
            ck.g.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    public final void c(final String str) {
        String[] list;
        if (!this.f104714b.exists() || (list = this.f104714b.list(new FilenameFilter() { // from class: lk.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.startsWith(str);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            b(str2);
        }
    }

    public void d() {
        b(".com.google.firebase.crashlytics");
        b(".com.google.firebase.crashlytics-ndk");
        if (y()) {
            b(f104705h);
            c(f104706i + File.pathSeparator);
        }
    }

    @h1
    public void e() {
        v(this.f104715c);
    }

    public boolean f(String str) {
        return v(new File(this.f104716d, str));
    }

    public List<String> g() {
        return w(this.f104716d.list());
    }

    public File h(String str) {
        return new File(this.f104715c, str);
    }

    public List<File> i(FilenameFilter filenameFilter) {
        return w(this.f104715c.listFiles(filenameFilter));
    }

    public File j(String str) {
        return new File(this.f104719g, str);
    }

    public List<File> k() {
        return w(this.f104719g.listFiles());
    }

    public File l(String str) {
        return u(new File(q(str), "native"));
    }

    public File m(String str) {
        return new File(this.f104718f, str);
    }

    public List<File> n() {
        return w(this.f104718f.listFiles());
    }

    public File o(String str) {
        return new File(this.f104717e, str);
    }

    public List<File> p() {
        return w(this.f104717e.listFiles());
    }

    public final File q(String str) {
        return u(new File(this.f104716d, str));
    }

    public File r(String str, String str2) {
        return new File(q(str), str2);
    }

    public List<File> s(String str, FilenameFilter filenameFilter) {
        return w(q(str).listFiles(filenameFilter));
    }

    public final boolean y() {
        return !this.f104713a.isEmpty();
    }
}
