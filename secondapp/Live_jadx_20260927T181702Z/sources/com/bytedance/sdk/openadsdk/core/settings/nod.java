package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.hnv;
import com.bytedance.sdk.component.utils.omn;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.utils.ed;
import com.bytedance.sdk.openadsdk.utils.syb;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class nod implements hv {
    private final hww nod;
    private final String vgm;
    private boolean vhb;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f36790sd = new ConcurrentHashMap<>();
    private final Object vy = new Object();

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final Object f36787hv = new Object();

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final CountDownLatch f36786hu = new CountDownLatch(1);

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private Properties f36788ok = new Properties();

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private volatile boolean f36789rs = false;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface hww {
        void hww();

        void tq();
    }

    public nod(String str, hww hwwVar) {
        this.vgm = str;
        this.nod = hwwVar;
        syb.hww(new com.bytedance.sdk.component.ok.ok("SetL_".concat(String.valueOf(str))) { // from class: com.bytedance.sdk.openadsdk.core.settings.nod.1
            @Override // java.lang.Runnable
            public void run() {
                nod.this.hww(false);
            }
        });
    }

    @Nullable
    private File hu() {
        Context contextHww = bs.hww();
        if (contextHww != null) {
            return new File(contextHww.getFilesDir(), this.vgm);
        }
        return null;
    }

    private void hv() {
        if (this.vhb && bs.hww() != null) {
            hww(true);
        }
        if (this.f36789rs) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.f36786hu.await(syb.hu() ? 4 : 8, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            omn.hww("SdkSettings.Prop", "awaitLoadedLocked: ", e10);
        }
    }

    public void sd() {
        File fileHu = hu();
        if (fileHu == null || !fileHu.exists()) {
            return;
        }
        fileHu.delete();
    }

    public void vy() {
        hww hwwVar = this.nod;
        if (hwwVar != null) {
            hwwVar.tq();
        }
    }

    public boolean tq() {
        return this.f36789rs;
    }

    public String hww(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        hv();
        return this.f36788ok.getProperty(str, str2);
    }

    public int hww(String str, int i10) {
        if (str != null && !str.isEmpty()) {
            hv();
            try {
                return Integer.parseInt(this.f36788ok.getProperty(str, String.valueOf(i10)));
            } catch (NumberFormatException e10) {
                omn.hww("SdkSettings.Prop", "", e10);
            }
        }
        return i10;
    }

    public long hww(String str, long j10) {
        if (str != null && !str.isEmpty()) {
            hv();
            try {
                return Long.parseLong(this.f36788ok.getProperty(str, String.valueOf(j10)));
            } catch (NumberFormatException e10) {
                omn.hww("SdkSettings.Prop", "", e10);
            }
        }
        return j10;
    }

    public float hww(String str, float f10) {
        if (str != null && !str.isEmpty()) {
            hv();
            try {
                return Float.parseFloat(this.f36788ok.getProperty(str, String.valueOf(f10)));
            } catch (NumberFormatException e10) {
                omn.hww("SdkSettings.Prop", "", e10);
            }
        }
        return f10;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class tq implements hv.hww {

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private final Map<String, Object> f36792tq = new HashMap();

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private final Object f36791sd = new Object();

        public tq() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.hv.hww
        public void hww() {
            Object obj;
            Properties properties = new Properties();
            synchronized (this.f36791sd) {
                try {
                    properties.putAll(nod.this.f36788ok);
                    boolean z10 = false;
                    for (Map.Entry<String, Object> entry : this.f36792tq.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value == this || value == null) {
                            if (properties.containsKey(key)) {
                                properties.remove(key);
                                z10 = true;
                            }
                        } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(value)) {
                            properties.put(key, String.valueOf(value));
                            z10 = true;
                        }
                    }
                    this.f36792tq.clear();
                    if (z10) {
                        nod.this.hww(properties);
                        nod.this.f36788ok = properties;
                        nod.this.f36790sd.clear();
                        nod.this.vhb = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.hv.hww
        public hv.hww hww(String str, String str2) {
            synchronized (this.f36791sd) {
                this.f36792tq.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.hv.hww
        public hv.hww hww(String str, int i10) {
            synchronized (this.f36791sd) {
                this.f36792tq.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.hv.hww
        public hv.hww hww(String str, long j10) {
            synchronized (this.f36791sd) {
                this.f36792tq.put(str, Long.valueOf(j10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.hv.hww
        public hv.hww hww(String str) {
            synchronized (this.f36791sd) {
                this.f36792tq.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.hv.hww
        public hv.hww hww(String str, float f10) {
            synchronized (this.f36791sd) {
                this.f36792tq.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.hv.hww
        public hv.hww hww(String str, boolean z10) {
            synchronized (this.f36791sd) {
                this.f36792tq.put(str, Boolean.valueOf(z10));
            }
            return this;
        }
    }

    public boolean hww(String str, boolean z10) {
        if (str != null && !str.isEmpty()) {
            hv();
            try {
                return Boolean.parseBoolean(this.f36788ok.getProperty(str, String.valueOf(z10)));
            } catch (Exception e10) {
                omn.hww("SdkSettings.Prop", "", e10);
            }
        }
        return z10;
    }

    public void hww(boolean z10) {
        hww hwwVar;
        synchronized (this.vy) {
            try {
                if (!this.f36789rs || z10) {
                    if (bs.hww() != null) {
                        boolean z11 = false;
                        this.vhb = false;
                        File fileHu = hu();
                        if (fileHu != null && fileHu.exists()) {
                            Properties properties = new Properties();
                            FileInputStream fileInputStream = null;
                            try {
                                try {
                                    FileInputStream fileInputStream2 = new FileInputStream(fileHu);
                                    try {
                                        properties.load(fileInputStream2);
                                        properties.size();
                                        new StringBuilder("items from ").append(fileHu.getAbsolutePath());
                                        if (!properties.isEmpty()) {
                                            this.f36788ok = properties;
                                            this.f36790sd.clear();
                                        }
                                        ed.hww(fileInputStream2);
                                    } catch (OutOfMemoryError unused) {
                                        fileInputStream = fileInputStream2;
                                        try {
                                            com.bytedance.sdk.component.utils.vgm.sd(fileHu);
                                        } catch (Throwable th2) {
                                            omn.hww("SdkSettings.Prop", "delete: ", th2);
                                        }
                                        if (fileInputStream != null) {
                                            ed.hww(fileInputStream);
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        fileInputStream = fileInputStream2;
                                        omn.hww("SdkSettings.Prop", "reload: ", th);
                                        if (fileInputStream != null) {
                                            ed.hww(fileInputStream);
                                        }
                                    }
                                } catch (Throwable th4) {
                                    if (fileInputStream != null) {
                                        ed.hww(fileInputStream);
                                    }
                                    this.vy.notifyAll();
                                    throw th4;
                                }
                            } catch (OutOfMemoryError unused2) {
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            this.vy.notifyAll();
                        } else if (hnv.hww(bs.hww()) && "tt_sdk_settings.prop".equals(this.vgm)) {
                            try {
                                SharedPreferences sharedPreferences = bs.hww().getSharedPreferences("tt_sdk_settings", 0);
                                if (!sharedPreferences.getAll().isEmpty()) {
                                    hv.hww hwwVarHww = hww();
                                    for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                                        String key = entry.getKey();
                                        Object value = entry.getValue();
                                        if (key != null && !key.isEmpty() && value != null) {
                                            hwwVarHww.hww(key, value.toString());
                                            z11 = true;
                                        }
                                    }
                                    if (z11) {
                                        hwwVarHww.hww();
                                    }
                                    sharedPreferences.edit().clear().commit();
                                }
                            } catch (Exception unused3) {
                            }
                        }
                    } else {
                        this.vhb = true;
                    }
                    if (!this.f36789rs && (hwwVar = this.nod) != null) {
                        hwwVar.hww();
                    }
                    this.f36789rs = true;
                    this.f36786hu.countDown();
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    public hv.hww hww() {
        return new tq();
    }

    public <T> T hww(String str, T t10, hv.tq<T> tqVar) {
        T tTq;
        if (str != null && !str.isEmpty()) {
            T t11 = (T) this.f36790sd.get(str);
            if (t11 != null) {
                return t11;
            }
            hv();
            String property = this.f36788ok.getProperty(str, null);
            if (property != null && tqVar != null && (tTq = tqVar.tq(property)) != null) {
                this.f36790sd.put(str, tTq);
                return tTq;
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hww(Properties properties) {
        synchronized (this.f36787hv) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(hu());
                    try {
                        properties.store(fileOutputStream2, (String) null);
                        ed.hww(fileOutputStream2);
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream = fileOutputStream2;
                        omn.hww("SdkSettings.Prop", "saveToLocal: ", e);
                        if (fileOutputStream != null) {
                            ed.hww(fileOutputStream);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            ed.hww(fileOutputStream);
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        vhb.tq();
    }
}
