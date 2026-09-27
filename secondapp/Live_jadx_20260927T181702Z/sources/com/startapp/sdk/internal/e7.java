package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class e7 {
    public static boolean a(int i10) {
        try {
            AnalyticsConfig analyticsConfigH = MetaData.E().h();
            return analyticsConfigH != null && (analyticsConfigH.c() & i10) == i10;
        } catch (Throwable unused) {
        }
    }

    public static ArrayList c(Context context, String str) {
        String[] list;
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            File cacheDir = context.getCacheDir();
            if (str != null) {
                cacheDir = new File(cacheDir, str);
            }
            if (!cacheDir.exists() || !cacheDir.isDirectory() || (list = cacheDir.list()) == null) {
                return null;
            }
            for (String str2 : list) {
                FileInputStream fileInputStream = new FileInputStream(new File(cacheDir, str2));
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                Object object = objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
                arrayList.add(object);
            }
        } catch (Throwable th2) {
            if (a(2)) {
                d9.a(th2);
            }
        }
        return arrayList;
    }

    public static void d(final Context context, final String str, final Serializable serializable) {
        try {
            ((Executor) com.startapp.sdk.components.a.a(context).C.a()).execute(new Runnable() { // from class: com.startapp.sdk.internal.ll
                @Override // java.lang.Runnable
                public final void run() {
                    e7.c(context, str, serializable);
                }
            });
        } catch (Throwable th2) {
            if (a(1)) {
                d9.a(th2);
            }
        }
    }

    public static Object b(Context context, String str) {
        if (context != null) {
            try {
                File noBackupFilesDir = context.getNoBackupFilesDir();
                if (noBackupFilesDir.exists() && noBackupFilesDir.isDirectory()) {
                    File file = new File(noBackupFilesDir, str);
                    if (file.exists()) {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                        Object object = objectInputStream.readObject();
                        objectInputStream.close();
                        fileInputStream.close();
                        return object;
                    }
                }
                return null;
            } catch (Throwable th2) {
                if (a(2)) {
                    d9.a(th2);
                }
            }
        }
        return null;
    }

    public static void a(final Context context, final Serializable serializable) {
        final String str = "StartIoCachedAds";
        try {
            ((Executor) com.startapp.sdk.components.a.a(context).C.a()).execute(new Runnable() { // from class: com.startapp.sdk.internal.ml
                @Override // java.lang.Runnable
                public final void run() {
                    e7.a(context, null, str, serializable);
                }
            });
        } catch (Throwable th2) {
            if (a(1)) {
                d9.a(th2);
            }
        }
    }

    public static void a(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        a(new File(context.getNoBackupFilesDir(), str));
        a(new File(context.getCacheDir(), str));
    }

    public static Object a(Context context, String str, String str2) {
        if (context != null && str2 != null) {
            try {
                File cacheDir = context.getCacheDir();
                if (str != null) {
                    cacheDir = new File(cacheDir, str);
                }
                if (cacheDir.exists() && cacheDir.isDirectory()) {
                    File file = new File(cacheDir, str2);
                    if (file.exists()) {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                        Object object = objectInputStream.readObject();
                        objectInputStream.close();
                        fileInputStream.close();
                        return object;
                    }
                }
                return null;
            } catch (Throwable th2) {
                if (a(2)) {
                    d9.a(th2);
                }
            }
        }
        return null;
    }

    public static void c(Context context, String str, Serializable serializable) {
        if (context == null || str == null || serializable == null) {
            return;
        }
        try {
            File noBackupFilesDir = context.getNoBackupFilesDir();
            if (noBackupFilesDir.exists() || noBackupFilesDir.mkdirs()) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(noBackupFilesDir, str));
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(serializable);
                objectOutputStream.close();
                fileOutputStream.close();
            }
        } catch (Throwable th2) {
            if (a(4)) {
                d9.a(th2);
            }
        }
    }

    public static void a(Context context, String str, String str2, Serializable serializable) {
        if (context == null || str2 == null || serializable == null) {
            return;
        }
        try {
            File cacheDir = context.getCacheDir();
            if (str != null) {
                cacheDir = new File(cacheDir, str);
            }
            if (cacheDir.exists() || cacheDir.mkdirs()) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDir, str2));
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(serializable);
                objectOutputStream.close();
                fileOutputStream.close();
            }
        } catch (Throwable th2) {
            if (a(4)) {
                d9.a(th2);
            }
        }
    }

    public static void a(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                a(file2);
            }
        }
        file.delete();
    }
}
