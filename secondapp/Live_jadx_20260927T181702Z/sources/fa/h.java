package fa;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.r;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import k.h1;
import k.t0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY_GROUP})
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f83741b = "androidx.work.workdb";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f83740a = r.f("WrkDbPathHelper");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f83742c = {"-journal", "-shm", "-wal"};

    @NonNull
    @h1
    public static File a(@NonNull Context context) {
        return c(context, f83741b);
    }

    @NonNull
    @h1
    public static File b(@NonNull Context context) {
        return context.getDatabasePath(f83741b);
    }

    @t0(23)
    public static File c(@NonNull Context context, @NonNull String filePath) {
        return new File(context.getNoBackupFilesDir(), filePath);
    }

    @NonNull
    public static String d() {
        return f83741b;
    }

    public static void e(@NonNull Context context) {
        if (b(context).exists()) {
            r.c().a(f83740a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map<File, File> mapF = f(context);
            for (File file : mapF.keySet()) {
                File file2 = mapF.get(file);
                if (file.exists() && file2 != null) {
                    if (file2.exists()) {
                        r.c().h(f83740a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                    }
                    r.c().a(f83740a, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
                }
            }
        }
    }

    @NonNull
    @h1
    public static Map<File, File> f(@NonNull Context context) {
        HashMap map = new HashMap();
        File fileB = b(context);
        File fileA = a(context);
        map.put(fileB, fileA);
        for (String str : f83742c) {
            map.put(new File(fileB.getPath() + str), new File(fileA.getPath() + str));
        }
        return map;
    }
}
