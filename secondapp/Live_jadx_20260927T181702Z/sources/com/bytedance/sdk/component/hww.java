package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import k.a0;
import k.t0;
import oy.l;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private static ArrayMap<File, hww> f34852ed = null;
    protected static InterfaceC0326hww hww = null;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    @a0("TTPropHelper.class")
    private static ArrayMap<String, File> f34853ny = null;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static boolean f34854tq = false;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private volatile boolean f34855hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    @a0("mLoadLock")
    private Properties f34856hv;
    private final File nod;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    @a0("this")
    private long f34857ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    @a0("mWriteLock")
    private long f34858rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final Object f34859sd;

    @a0("mLoadLock")
    private int vgm;
    private final File vhb;
    private final Object vy;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0326hww {
        HandlerThread hww(String str, int i10);

        ExecutorService hww();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class tq {

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        boolean f34864hv;
        final long hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        final CountDownLatch f34865sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        final Properties f34866tq;

        @a0("mWritingToDiskLock")
        volatile boolean vy;

        public void hww(boolean z10, boolean z11) {
            this.f34864hv = z10;
            this.vy = z11;
            this.f34865sd.countDown();
        }

        private tq(long j10, Properties properties) {
            this.f34865sd = new CountDownLatch(1);
            this.vy = false;
            this.f34864hv = false;
            this.hww = j10;
            this.f34866tq = properties;
        }
    }

    private hww(File file) {
        Object obj = new Object();
        this.f34859sd = obj;
        this.vy = new Object();
        this.f34856hv = new Properties();
        this.f34855hu = false;
        this.vgm = 0;
        this.nod = file;
        this.vhb = hww(file);
        synchronized (obj) {
            this.f34855hu = false;
        }
        InterfaceC0326hww interfaceC0326hww = hww;
        if (interfaceC0326hww == null || interfaceC0326hww.hww() == null) {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.hww.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    hww.this.hww();
                }
            }.start();
        } else {
            hww.hww().execute(new Runnable() { // from class: com.bytedance.sdk.component.hww.2
                @Override // java.lang.Runnable
                public void run() {
                    hww.this.hww();
                }
            });
        }
    }

    public static /* synthetic */ long hu(hww hwwVar) {
        long j10 = hwwVar.f34857ok;
        hwwVar.f34857ok = 1 + j10;
        return j10;
    }

    public static /* synthetic */ int hv(hww hwwVar) {
        int i10 = hwwVar.vgm;
        hwwVar.vgm = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int rs(hww hwwVar) {
        int i10 = hwwVar.vgm;
        hwwVar.vgm = i10 - 1;
        return i10;
    }

    private void vy() {
        while (!this.f34855hu) {
            try {
                this.f34859sd.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public sd tq() {
        return new sd();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class sd implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private final Object f34863tq = new Object();

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        @a0("mEditorLock")
        private final Map<String, Object> f34862sd = new HashMap();

        @a0("mEditorLock")
        private boolean vy = false;

        public sd() {
        }

        private tq tq() {
            Properties properties;
            long j10;
            Object obj;
            boolean z10;
            synchronized (hww.this.f34859sd) {
                try {
                    if (hww.this.vgm > 0) {
                        Properties properties2 = new Properties();
                        properties2.putAll(hww.this.f34856hv);
                        hww.this.f34856hv = properties2;
                    }
                    properties = hww.this.f34856hv;
                    hww.hv(hww.this);
                    synchronized (this.f34863tq) {
                        try {
                            boolean z11 = false;
                            if (this.vy) {
                                if (properties.isEmpty()) {
                                    z10 = false;
                                } else {
                                    properties.clear();
                                    z10 = true;
                                }
                                this.vy = false;
                                z11 = z10;
                            }
                            for (Map.Entry<String, Object> entry : this.f34862sd.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (value == this || value == null) {
                                    if (properties.containsKey(key)) {
                                        properties.remove(key);
                                        z11 = true;
                                    }
                                } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                    properties.put(key, String.valueOf(value));
                                    z11 = true;
                                }
                            }
                            this.f34862sd.clear();
                            if (z11) {
                                hww.hu(hww.this);
                            }
                            j10 = hww.this.f34857ok;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return new tq(j10, properties);
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            hww.this.hww(tq(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            long jCurrentTimeMillis = hww.f34854tq ? System.currentTimeMillis() : 0L;
            tq tqVarTq = tq();
            hww.this.hww(tqVarTq, true);
            try {
                tqVarTq.f34865sd.await();
                return tqVarTq.vy;
            } catch (InterruptedException unused) {
            } finally {
                if (hww.f34854tq) {
                    Log.d("TTPropHelper", hww.this.nod.getName() + ":" + tqVarTq.hww + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
            }
        }

        public sd hww(String str, Set<String> set) {
            synchronized (this.f34863tq) {
                this.f34862sd.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return hww(str, (Set<String>) set);
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public sd putInt(String str, int i10) {
            synchronized (this.f34863tq) {
                this.f34862sd.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public sd putLong(String str, long j10) {
            synchronized (this.f34863tq) {
                this.f34862sd.put(str, Long.valueOf(j10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public sd putFloat(String str, float f10) {
            synchronized (this.f34863tq) {
                this.f34862sd.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public sd putString(String str, String str2) {
            synchronized (this.f34863tq) {
                this.f34862sd.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public sd putBoolean(String str, boolean z10) {
            synchronized (this.f34863tq) {
                this.f34862sd.put(str, Boolean.valueOf(z10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public sd remove(String str) {
            synchronized (this.f34863tq) {
                this.f34862sd.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public sd clear() {
            synchronized (this.f34863tq) {
                this.vy = true;
            }
            return this;
        }
    }

    public static void hww(@l InterfaceC0326hww interfaceC0326hww) {
        hww = interfaceC0326hww;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:121:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0122 A[Catch: all -> 0x0127, TryCatch #6 {all -> 0x0127, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x011e, B:80:0x0122, B:84:0x012b, B:86:0x0134, B:88:0x013c, B:90:0x0148, B:98:0x0193, B:99:0x0194, B:59:0x00f0, B:77:0x011d, B:63:0x00f7, B:97:0x0192, B:96:0x0189), top: B:118:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0129  */
    /* JADX WARN: Code duplicated, block: B:86:0x0134 A[Catch: all -> 0x0127, TryCatch #6 {all -> 0x0127, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x011e, B:80:0x0122, B:84:0x012b, B:86:0x0134, B:88:0x013c, B:90:0x0148, B:98:0x0193, B:99:0x0194, B:59:0x00f0, B:77:0x011d, B:63:0x00f7, B:97:0x0192, B:96:0x0189), top: B:118:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x013a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0148 A[Catch: all -> 0x0127, TRY_LEAVE, TryCatch #6 {all -> 0x0127, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x011e, B:80:0x0122, B:84:0x012b, B:86:0x0134, B:88:0x013c, B:90:0x0148, B:98:0x0193, B:99:0x0194, B:59:0x00f0, B:77:0x011d, B:63:0x00f7, B:97:0x0192, B:96:0x0189), top: B:118:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x0148, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.io.FileOutputStream] */
    @a0("mWriteLock")
    public void tq(tq tqVar, boolean z10) {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        Throwable th2;
        long jCurrentTimeMillis3;
        ?? r11;
        FileOutputStream fileOutputStream;
        String str;
        long jCurrentTimeMillis4;
        long jCurrentTimeMillis5;
        boolean z11;
        long jCurrentTimeMillis6 = f34854tq ? System.currentTimeMillis() : 0L;
        boolean zExists = this.nod.exists();
        if (f34854tq) {
            jCurrentTimeMillis = System.currentTimeMillis();
            jCurrentTimeMillis2 = jCurrentTimeMillis;
        } else {
            jCurrentTimeMillis = 0;
            jCurrentTimeMillis2 = 0;
        }
        if (zExists) {
            if (this.f34858rs >= tqVar.hww) {
                z11 = false;
            } else if (z10) {
                z11 = true;
            } else {
                synchronized (this.f34859sd) {
                    z11 = this.f34857ok == tqVar.hww;
                }
            }
            if (!z11) {
                tqVar.hww(false, true);
                return;
            }
            boolean zExists2 = this.vhb.exists();
            if (f34854tq) {
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
            if (!zExists2) {
                if (!this.nod.renameTo(this.vhb)) {
                    Log.e("TTPropHelper", "Couldn't rename file " + this.nod + " to backup file " + this.vhb);
                    tqVar.hww(false, false);
                    return;
                }
            } else {
                this.nod.delete();
            }
        }
        try {
            synchronized (this.vy) {
                Object obj = null;
                String str2 = null;
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(this.nod);
                        try {
                            try {
                                jCurrentTimeMillis3 = f34854tq ? System.currentTimeMillis() : 0L;
                                try {
                                    tqVar.f34866tq.store(fileOutputStream3, (String) null);
                                    if (f34854tq) {
                                        Log.d("TTPropHelper", "save: " + tqVar.f34866tq);
                                        Log.d("TTPropHelper", "saveToLocal: save to" + this.nod.getAbsolutePath() + "success");
                                        str2 = "success";
                                    }
                                    try {
                                        fileOutputStream3.close();
                                        obj = str2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        str = "TTPropHelper";
                                        Log.w(str, th.getMessage());
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    fileOutputStream = fileOutputStream3;
                                    Log.e("TTPropHelper", "saveToLocal: ", e);
                                    tqVar.hww(false, false);
                                    obj = fileOutputStream;
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                            obj = fileOutputStream;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            str = "TTPropHelper";
                                            Log.w(str, th.getMessage());
                                        }
                                    }
                                }
                            } catch (Throwable th5) {
                                th2 = th5;
                                r11 = fileOutputStream3;
                                if (r11 != 0) {
                                    try {
                                        r11.close();
                                        throw th2;
                                    } catch (Throwable th6) {
                                        Log.w("TTPropHelper", th6.getMessage());
                                        throw th2;
                                    }
                                }
                                throw th2;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            fileOutputStream2 = fileOutputStream3;
                            jCurrentTimeMillis3 = 0;
                            fileOutputStream = fileOutputStream2;
                            Log.e("TTPropHelper", "saveToLocal: ", e);
                            tqVar.hww(false, false);
                            obj = fileOutputStream;
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                                obj = fileOutputStream;
                            }
                            if (f34854tq) {
                                jCurrentTimeMillis4 = System.currentTimeMillis();
                            } else {
                                jCurrentTimeMillis4 = 0;
                            }
                            this.vhb.delete();
                            if (f34854tq) {
                                jCurrentTimeMillis5 = System.currentTimeMillis();
                            } else {
                                jCurrentTimeMillis5 = 0;
                            }
                            this.f34858rs = tqVar.hww;
                            tqVar.hww(true, true);
                            if (f34854tq) {
                                Log.d("TTPropHelper", "write: " + (jCurrentTimeMillis - jCurrentTimeMillis6) + c.userBaseDel + (jCurrentTimeMillis2 - jCurrentTimeMillis6) + c.userBaseDel + (jCurrentTimeMillis3 - jCurrentTimeMillis6) + c.userBaseDel + (jCurrentTimeMillis4 - jCurrentTimeMillis6) + c.userBaseDel + (jCurrentTimeMillis5 - jCurrentTimeMillis6));
                            }
                        }
                    } catch (Throwable th7) {
                        th2 = th7;
                        r11 = obj;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            }
            if (f34854tq) {
                jCurrentTimeMillis4 = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis4 = 0;
            }
            this.vhb.delete();
            if (f34854tq) {
                jCurrentTimeMillis5 = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis5 = 0;
            }
            this.f34858rs = tqVar.hww;
            tqVar.hww(true, true);
            if (f34854tq) {
                Log.d("TTPropHelper", "write: " + (jCurrentTimeMillis - jCurrentTimeMillis6) + c.userBaseDel + (jCurrentTimeMillis2 - jCurrentTimeMillis6) + c.userBaseDel + (jCurrentTimeMillis3 - jCurrentTimeMillis6) + c.userBaseDel + (jCurrentTimeMillis4 - jCurrentTimeMillis6) + c.userBaseDel + (jCurrentTimeMillis5 - jCurrentTimeMillis6));
            }
        } catch (Throwable th8) {
            Log.w("TTPropHelper", "writeToFile: Got exception:", th8);
            if (this.nod.exists() && !this.nod.delete()) {
                Log.e("TTPropHelper", "Couldn't clean up partially-written file " + this.nod);
            }
            tqVar.hww(false, false);
        }
    }

    @t0(api = 19)
    public static hww hww(@l Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (hww.class) {
            try {
                if (f34853ny == null) {
                    f34853ny = new ArrayMap<>();
                }
                File file = f34853ny.get(str);
                if (file == null) {
                    file = new File(context.getFilesDir(), str);
                    f34853ny.put(str, file);
                }
                if (f34852ed == null) {
                    f34852ed = new ArrayMap<>();
                }
                hww hwwVar = f34852ed.get(file);
                if (hwwVar != null) {
                    return hwwVar;
                }
                hww hwwVar2 = new hww(file);
                f34852ed.put(file, hwwVar2);
                return hwwVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static File hww(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8 A[Catch: all -> 0x00db, TryCatch #4 {all -> 0x00db, blocks: (B:50:0x00d2, B:52:0x00d8, B:55:0x00dd, B:56:0x00e5), top: B:69:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void hww() {
        FileInputStream fileInputStream;
        Throwable th2;
        synchronized (this.f34859sd) {
            try {
                if (this.f34855hu) {
                    if (f34854tq) {
                        Log.d("TTPropHelper", "reload: already loaded, ignore");
                    }
                    return;
                }
                if (this.vhb.exists()) {
                    this.nod.delete();
                    this.vhb.renameTo(this.nod);
                }
                if (f34854tq) {
                    Log.d("TTPropHelper", "reload: " + this.nod.getAbsolutePath() + ", exist? " + this.nod.exists());
                }
                Properties properties = null;
                if (this.nod.exists()) {
                    Properties properties2 = new Properties();
                    try {
                        fileInputStream = new FileInputStream(this.nod);
                        try {
                            properties2.load(fileInputStream);
                            if (f34854tq) {
                                Log.d("TTPropHelper", "reload: find " + properties2.size() + " ,items from " + this.nod.getAbsolutePath());
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            try {
                                Log.e("TTPropHelper", "reload: ", th2);
                                if (fileInputStream != null) {
                                }
                                properties = properties2;
                                synchronized (this.f34859sd) {
                                    if (properties != null) {
                                        try {
                                            if (!properties.isEmpty()) {
                                                this.f34856hv = properties;
                                            }
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                    this.f34855hu = true;
                                    this.f34859sd.notifyAll();
                                }
                            } catch (Throwable th5) {
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th6) {
                                        Log.w("TTPropHelper", th6.getMessage());
                                    }
                                }
                                throw th5;
                            }
                        }
                    } catch (Throwable th7) {
                        fileInputStream = null;
                        th2 = th7;
                    }
                    try {
                        fileInputStream.close();
                    } catch (Throwable th8) {
                        Log.w("TTPropHelper", th8.getMessage());
                    }
                    properties = properties2;
                }
                synchronized (this.f34859sd) {
                    if (properties != null) {
                        if (!properties.isEmpty()) {
                            this.f34856hv = properties;
                        }
                    }
                    this.f34855hu = true;
                    this.f34859sd.notifyAll();
                }
            } catch (Throwable th9) {
                throw th9;
            }
        }
    }

    public String hww(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.f34859sd) {
            vy();
            property = this.f34856hv.getProperty(str, str2);
        }
        return property;
    }

    public int hww(String str, int i10) {
        int i11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f34859sd) {
                try {
                    try {
                        vy();
                        i11 = Integer.parseInt(this.f34856hv.getProperty(str, String.valueOf(i10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i11;
        }
        return i10;
    }

    public long hww(String str, long j10) {
        long j11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f34859sd) {
                try {
                    try {
                        vy();
                        j11 = Long.parseLong(this.f34856hv.getProperty(str, String.valueOf(j10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return j11;
        }
        return j10;
    }

    public float hww(String str, float f10) {
        float f11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f34859sd) {
                try {
                    try {
                        vy();
                        f11 = Float.parseFloat(this.f34856hv.getProperty(str, String.valueOf(f10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return f11;
        }
        return f10;
    }

    public boolean hww(String str, boolean z10) {
        boolean z11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f34859sd) {
                try {
                    try {
                        vy();
                        z11 = Boolean.parseBoolean(this.f34856hv.getProperty(str, String.valueOf(z10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z11;
        }
        return z10;
    }

    public boolean hww(String str) {
        boolean zContainsKey;
        synchronized (this.f34859sd) {
            try {
                try {
                    vy();
                    zContainsKey = this.f34856hv.containsKey(str);
                } catch (NumberFormatException e10) {
                    Log.e("TTPropHelper", e10.getMessage());
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zContainsKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hww(final tq tqVar, final boolean z10) {
        boolean z11;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.hww.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (hww.this.vy) {
                    try {
                        hww.this.tq(tqVar, z10);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (hww.this.f34859sd) {
                    hww.rs(hww.this);
                }
            }
        };
        if (z10) {
            synchronized (this.f34859sd) {
                z11 = this.vgm == 1;
            }
            if (z11) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.tq.hww(runnable, true ^ z10);
    }
}
