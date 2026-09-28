package defpackage;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class hbu {
    public final mpe0 a = hwr.b(new fbu());
    public final mpe0 b = hwr.b(new gbu());
    public final LinkedHashMap c = new LinkedHashMap();

    public static File a(Context context, String str) {
        str.getClass();
        File file = new File(context.getExternalFilesDir(null), str);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        return file;
    }
}
