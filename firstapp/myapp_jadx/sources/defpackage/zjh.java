package defpackage;

import android.os.StatFs;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class zjh {
    public static final long a(File file) {
        long blockCountLong;
        file.getClass();
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            blockCountLong = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            blockCountLong = 5242880;
        }
        return Math.max(Math.min(blockCountLong, 262144000L), 5242880L);
    }
}
