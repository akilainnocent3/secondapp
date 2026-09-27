package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f67488a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f67489b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f67490c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f67491d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f67492e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            t0.b();
        }
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f67489b) {
                return;
            }
            f67489b = true;
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                f67488a = externalFilesDir.getAbsolutePath();
            }
            try {
                b(context);
            } catch (Exception unused) {
                b(context);
            }
        } catch (Exception e10) {
            q0.b("SameSDCardTool", e10.getMessage());
        }
    }

    private static void b(Context context) {
        File externalFilesDir;
        if (TextUtils.isEmpty(f67488a) && (externalFilesDir = context.getExternalFilesDir(null)) != null) {
            f67488a = externalFilesDir.getAbsolutePath();
        }
        if (!TextUtils.isEmpty(f67488a)) {
            com.mbridge.msdk.foundation.same.directory.e.a(new com.mbridge.msdk.foundation.same.directory.d(f67488a));
            com.mbridge.msdk.foundation.same.directory.e.b().a();
        }
        b();
    }

    public static int c() {
        return f67491d;
    }

    public static int a() {
        if (System.currentTimeMillis() - f67492e > 1800000) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a());
        }
        return f67490c;
    }

    public static void b() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long blockSize = statFs.getBlockSize();
            long availableBlocks = statFs.getAvailableBlocks();
            f67491d = Long.valueOf(((((long) statFs.getBlockCount()) * blockSize) / 1000) / 1000).intValue();
            f67490c = Long.valueOf(((availableBlocks * blockSize) / 1000) / 1000).intValue();
            f67492e = System.currentTimeMillis();
        } catch (Exception e10) {
            q0.b("SameSDCardTool", e10.getMessage());
        }
    }
}
