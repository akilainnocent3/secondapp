package sg.bigo.ads.common.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f133421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f133422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f133423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f133424d;

    public static long a() {
        if (System.currentTimeMillis() - f133422b > 60000) {
            f133421a = e();
            f133422b = System.currentTimeMillis();
        }
        return f133421a;
    }

    public static long b(Context context) {
        ActivityManager.MemoryInfo memoryInfoD = d(context);
        if (memoryInfoD == null) {
            return 0L;
        }
        return f.a(memoryInfoD.totalMem, 3);
    }

    public static int c(Context context) {
        try {
            return (int) Math.min(15728640L, (((long) ((ActivityManager) context.getSystemService(androidx.appcompat.widget.c.f6970r)).getLargeMemoryClass()) / 8) * 1048576);
        } catch (Exception unused) {
            return 15728640;
        }
    }

    private static ActivityManager.MemoryInfo d(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(androidx.appcompat.widget.c.f6970r);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    private static long e() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "StorageUtils", "getExternalStorageRemainSpace" + th2.getMessage());
            return 0L;
        }
    }

    private static long f() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfoD = d(context);
        if (memoryInfoD == null) {
            return 0L;
        }
        return f.a(memoryInfoD.availMem, 3);
    }

    public static boolean b() {
        return f() > ServiceProvider.HTTP_CACHE_DISK_SIZE;
    }

    public static long c() {
        if (System.currentTimeMillis() - f133424d > 60000) {
            try {
                f133423c = f();
            } catch (Throwable th2) {
                sg.bigo.ads.common.t.a.a(0, "StorageUtils", th2.toString());
            }
            f133424d = System.currentTimeMillis();
        }
        return f133423c;
    }

    public static File d() {
        return new File(Environment.getExternalStorageDirectory(), "Pictures");
    }

    public static <T> Set<T> a(final int i10) {
        return Collections.newSetFromMap(new LinkedHashMap<T, Boolean>() { // from class: sg.bigo.ads.common.utils.p.1
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<T, Boolean> entry) {
                return size() > i10;
            }
        });
    }
}
