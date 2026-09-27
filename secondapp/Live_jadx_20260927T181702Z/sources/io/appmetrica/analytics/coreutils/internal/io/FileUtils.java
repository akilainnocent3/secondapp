package io.appmetrica.analytics.coreutils.internal.io;

import android.annotation.SuppressLint;
import android.content.Context;
import cs.o;
import dr.w2;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.io.File;
import k.h1;
import oy.l;
import oy.m;
import xr.s;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class FileUtils {

    @l
    public static final FileUtils INSTANCE = new FileUtils();

    @l
    public static final String SDK_FILES_PREFIX = "appmetrica_analytics";

    @l
    public static final String SDK_STORAGE_RELATIVE_PATH = "/appmetrica/analytics";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile File f95324a;

    private FileUtils() {
    }

    @o
    public static final boolean copyToNullable(@m File file, @m File file2) {
        if (file != null && file2 != null && file.exists()) {
            try {
                s.X(file, file2, false, 0, 6, null);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    @o
    @m
    public static final File getAppDataDir(@l Context context) {
        if (AndroidUtils.isApiAchieved(24)) {
            return AppDataDirProviderForN.INSTANCE.dataDir(context);
        }
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir.getParentFile();
        }
        return null;
    }

    @o
    @m
    public static final File getAppStorageDirectory(@l Context context) {
        return context.getNoBackupFilesDir();
    }

    @o
    @m
    public static final File getCrashesDirectory(@l Context context) {
        return getFileFromSdkStorage(context, "crashes");
    }

    @o
    @m
    public static final File getFileFromAppStorage(@l Context context, @l String str) {
        File appStorageDirectory = getAppStorageDirectory(context);
        if (appStorageDirectory != null) {
            return new File(appStorageDirectory, str);
        }
        return null;
    }

    @l
    @o
    public static final File getFileFromPath(@l String str) {
        return new File(str);
    }

    @o
    @m
    public static final File getFileFromSdkStorage(@l Context context, @l String str) {
        File fileSdkStorage = sdkStorage(context);
        if (fileSdkStorage != null) {
            return new File(fileSdkStorage, str);
        }
        return null;
    }

    @o
    @m
    public static final File getNativeCrashDirectory(@l Context context) {
        return getFileFromSdkStorage(context, "native_crashes");
    }

    @o
    public static final boolean move(@m File file, @m File file2) {
        FileUtils fileUtils = INSTANCE;
        return fileUtils.moveByRename(file, file2) || fileUtils.moveByCopy(file, file2);
    }

    @h1
    @o
    public static final void resetSdkStorage() {
        synchronized (INSTANCE) {
            f95324a = null;
            w2 w2Var = w2.f79517a;
        }
    }

    @o
    @m
    public static final File sdkStorage(@l Context context) {
        File file;
        if (f95324a == null) {
            synchronized (INSTANCE) {
                try {
                    File appStorageDirectory = getAppStorageDirectory(context);
                    if (appStorageDirectory == null) {
                        file = null;
                    } else {
                        File file2 = new File(appStorageDirectory, SDK_STORAGE_RELATIVE_PATH);
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        file = file2;
                    }
                    f95324a = file;
                    w2 w2Var = w2.f79517a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f95324a;
    }

    public final boolean moveByCopy(@m File file, @m File file2) {
        if (file != null && file2 != null && file.exists()) {
            try {
                s.X(file, file2, false, 0, 6, null);
                file.delete();
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public final boolean moveByRename(@m File file, @m File file2) {
        if (file2 == null) {
            return false;
        }
        Boolean boolValueOf = file != null ? Boolean.valueOf(file.renameTo(file2)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }
}
