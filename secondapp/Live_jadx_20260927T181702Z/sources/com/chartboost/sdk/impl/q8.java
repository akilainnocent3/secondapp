package com.chartboost.sdk.impl;

import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class q8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f40521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r8 f40522b;

    public q8(Context context, AtomicReference atomicReference) {
        r8 r8Var = new r8(context.getCacheDir());
        this.f40522b = r8Var;
        this.f40521a = atomicReference;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(((mg) atomicReference.get()).f40033p);
            File file = new File(r8Var.f40752a, "templates");
            if (file.exists()) {
                a(file.listFiles(), jCurrentTimeMillis);
                a(r8Var);
            }
        } catch (Exception e10) {
            sb.b("Exception while cleaning up templates directory at " + this.f40522b.f40757f.getPath(), e10);
            e10.printStackTrace();
        }
    }

    public final void a(File[] fileArr, long j10) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.isDirectory()) {
                    b(file.listFiles(), j10);
                    a(file.listFiles(), file);
                }
            }
        }
    }

    public final void b(File[] fileArr, long j10) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.lastModified() < j10 && !file.delete()) {
                    sb.b("Unable to delete " + file.getPath(), null);
                }
            }
        }
    }

    public File[] c() {
        File fileB = b();
        if (fileB != null) {
            return fileB.listFiles();
        }
        return null;
    }

    public File d() {
        return this.f40522b.f40760i;
    }

    public JSONObject e() {
        String[] list;
        JSONObject jSONObject = new JSONObject();
        try {
            File file = a().f40752a;
            for (String str : ((mg) this.f40521a.get()).f40034q) {
                if (!str.equals("templates")) {
                    File file2 = new File(file, str);
                    JSONArray jSONArray = new JSONArray();
                    if (file2.exists() && (list = file2.list()) != null) {
                        for (String str2 : list) {
                            if (!str2.equals(".nomedia") && !str2.endsWith(".tmp")) {
                                jSONArray.put(str2);
                            }
                        }
                    }
                    y2.a(jSONObject, str, jSONArray);
                }
            }
            return jSONObject;
        } catch (Exception e10) {
            sb.b("getWebViewCacheAssets: " + e10, null);
            return jSONObject;
        }
    }

    public void d(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                int i10 = randomAccessFile.read();
                randomAccessFile.seek(0L);
                randomAccessFile.write(i10);
                randomAccessFile.close();
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException e10) {
            sb.b("File not found when attempting to touch", e10);
        } catch (IOException e11) {
            sb.b("IOException when attempting to touch file", e11);
        }
    }

    public boolean c(File file) {
        return file != null && file.exists() && file.length() > 0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0023 A[Catch: Exception -> 0x001e, TRY_LEAVE, TryCatch #0 {Exception -> 0x001e, blocks: (B:4:0x0004, B:6:0x000a, B:8:0x0010, B:10:0x0014, B:15:0x0023), top: B:19:0x0004 }] */
    public long b(File file) {
        long jB = 0;
        if (file != null) {
            try {
                if (file.isDirectory()) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            jB += b(file2);
                        }
                        return jB;
                    }
                } else if (file != null) {
                    return file.length();
                }
            } catch (Exception e10) {
                sb.b("getFolderSize: " + e10, null);
            }
        } else if (file != null) {
            return file.length();
        }
        return 0L;
    }

    public r8 a() {
        return this.f40522b;
    }

    public boolean a(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return file.delete();
    }

    public final void a(File[] fileArr, File file) {
        if (fileArr == null || fileArr.length != 0 || file.delete()) {
            return;
        }
        sb.b("Unable to delete " + file.getPath(), null);
    }

    public File b() {
        return this.f40522b.f40759h;
    }

    public File a(File file, String str) {
        if (file == null || str == null) {
            return null;
        }
        File file2 = new File(file, str);
        if (!file2.exists() || file2.length() <= 0) {
            return null;
        }
        return file2;
    }

    public Boolean a(b0 b0Var) {
        Map mapD = b0Var.d();
        r8 r8VarA = a();
        if (r8VarA == null) {
            return Boolean.FALSE;
        }
        File file = r8VarA.f40752a;
        for (s1 s1Var : mapD.values()) {
            File fileA = s1Var.a(file);
            if (fileA == null) {
                return Boolean.FALSE;
            }
            if (!fileA.exists()) {
                sb.b("Asset does not exist: " + s1Var.f40838b, null);
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public final void a(r8 r8Var) {
        File file = new File(r8Var.f40752a, ".adId");
        if (!file.exists() || file.delete()) {
            return;
        }
        sb.b("Unable to delete " + file.getPath(), null);
    }
}
