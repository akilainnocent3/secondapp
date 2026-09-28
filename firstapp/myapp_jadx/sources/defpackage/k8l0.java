package defpackage;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzdd;
import com.twilio.voice.EventKeys;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes4.dex */
public final class k8l0 implements zal0 {
    public static volatile k8l0 E;
    public int A;
    public int B;
    public final long D;
    public final Context a;
    public final boolean b;
    public final l9c c;
    public final wok0 d;
    public final j6l0 e;
    public final y4l0 f;
    public final p7l0 g;
    public final wll0 h;
    public final yol0 i;
    public final k4l0 j;
    public final xi9 k;
    public final khl0 l;
    public final nfl0 m;
    public final hwk0 n;
    public final xfl0 o;
    public final String p;
    public h4l0 q;
    public ikl0 r;
    public fsk0 s;
    public b4l0 t;
    public agl0 u;
    public Boolean w;
    public long x;
    public volatile Boolean y;
    public volatile boolean z;
    public boolean v = false;
    public final AtomicInteger C = new AtomicInteger(0);

    public k8l0(vbl0 vbl0Var) {
        Context context;
        Context context2 = vbl0Var.a;
        l9c l9cVar = new l9c();
        this.c = l9cVar;
        flc.b = l9cVar;
        this.a = context2;
        this.b = vbl0Var.e;
        this.y = vbl0Var.b;
        this.p = vbl0Var.g;
        this.z = true;
        if (pdl0.g == null) {
            Object obj = pdl0.f;
            synchronized (obj) {
                try {
                    if (pdl0.g == null) {
                        synchronized (obj) {
                            try {
                                nbl0 nbl0Var = pdl0.g;
                                final Context applicationContext = context2.getApplicationContext();
                                if (applicationContext == null) {
                                    applicationContext = context2;
                                }
                                if (nbl0Var == null || nbl0Var.a != applicationContext) {
                                    if (nbl0Var != null) {
                                        ubl0.c();
                                        sdl0.a();
                                        synchronized (gcl0.class) {
                                            try {
                                                gcl0 gcl0Var = gcl0.d;
                                                if (gcl0Var != null && (context = gcl0Var.a) != null && gcl0Var.b != null && gcl0Var.c) {
                                                    context.getContentResolver().unregisterContentObserver(gcl0.d.b);
                                                }
                                                gcl0.d = null;
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                    pdl0.g = new nbl0(applicationContext, nfe0.a(new mfe0() { // from class: ndl0
                                        /* JADX WARN: Code duplicated, block: B:20:0x003c A[Catch: all -> 0x0028, TryCatch #5 {all -> 0x0028, blocks: (B:6:0x000d, B:8:0x0011, B:10:0x001f, B:20:0x003c, B:73:0x0177, B:15:0x002b, B:17:0x0033, B:21:0x0041, B:23:0x0047, B:24:0x004b, B:72:0x0174, B:74:0x017a, B:75:0x017d, B:76:0x017e, B:25:0x0050, B:27:0x0054, B:28:0x0061, B:30:0x0067, B:36:0x007d, B:38:0x0083, B:39:0x008f, B:59:0x0158, B:60:0x015b, B:68:0x016b, B:67:0x0168, B:69:0x016c, B:70:0x0171, B:71:0x0172, B:31:0x006d, B:35:0x0074), top: B:89:0x000d, inners: #0 }] */
                                        @Override // defpackage.mfe0
                                        public final Object get() {
                                            l2z yo20Var;
                                            l2z yo20Var2;
                                            Object obj2 = pdl0.f;
                                            Context contextCreateDeviceProtectedStorageContext = applicationContext;
                                            l2z l2zVar = icl0.a;
                                            if (l2zVar != null) {
                                                return l2zVar;
                                            }
                                            synchronized (icl0.class) {
                                                try {
                                                    yo20Var = icl0.a;
                                                    if (yo20Var == null) {
                                                        String str = Build.TYPE;
                                                        String str2 = Build.TAGS;
                                                        ox0 ox0Var = wcl0.a;
                                                        if (!str.equals("eng") && !str.equals("userdebug")) {
                                                            yo20Var = y1.a;
                                                        } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                                                            if (!contextCreateDeviceProtectedStorageContext.isDeviceProtectedStorage()) {
                                                                contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                                                            }
                                                            Context context3 = contextCreateDeviceProtectedStorageContext;
                                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                                            try {
                                                                StrictMode.allowThreadDiskWrites();
                                                                char c = 0;
                                                                try {
                                                                    File file = new File(context3.getDir("phenotype_hermetic", 0), "overrides.txt");
                                                                    yo20Var2 = file.exists() ? new yo20(file) : y1.a;
                                                                } catch (RuntimeException e) {
                                                                    Log.e("HermeticFileOverrides", "no data dir", e);
                                                                    yo20Var2 = y1.a;
                                                                }
                                                                if (yo20Var2.b()) {
                                                                    File file2 = (File) yo20Var2.a();
                                                                    try {
                                                                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                                                        try {
                                                                            nj90 nj90Var = new nj90();
                                                                            HashMap map = new HashMap();
                                                                            while (true) {
                                                                                String line = bufferedReader.readLine();
                                                                                if (line == null) {
                                                                                    break;
                                                                                }
                                                                                String[] strArrSplit = line.split(" ", 3);
                                                                                if (strArrSplit.length != 3) {
                                                                                    StringBuilder sb = new StringBuilder(line.length() + 9);
                                                                                    sb.append("Invalid: ");
                                                                                    sb.append(line);
                                                                                    Log.e("HermeticFileOverrides", sb.toString());
                                                                                } else {
                                                                                    String str3 = new String(strArrSplit[c]);
                                                                                    String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                                                    String strDecode2 = (String) map.get(strArrSplit[2]);
                                                                                    if (strDecode2 == null) {
                                                                                        String str4 = new String(strArrSplit[2]);
                                                                                        strDecode2 = Uri.decode(str4);
                                                                                        if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                                                            map.put(str4, strDecode2);
                                                                                        }
                                                                                    }
                                                                                    nj90 nj90Var2 = (nj90) nj90Var.get(str3);
                                                                                    if (nj90Var2 == null) {
                                                                                        nj90Var2 = new nj90();
                                                                                        nj90Var.put(str3, nj90Var2);
                                                                                    }
                                                                                    nj90Var2.put(strDecode, strDecode2);
                                                                                    c = 0;
                                                                                }
                                                                            }
                                                                            String string = file2.toString();
                                                                            String packageName = context3.getPackageName();
                                                                            StringBuilder sb2 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                                                            sb2.append("Parsed ");
                                                                            sb2.append(string);
                                                                            sb2.append(" for Android package ");
                                                                            sb2.append(packageName);
                                                                            Log.w("HermeticFileOverrides", sb2.toString());
                                                                            ybl0 ybl0Var = new ybl0(nj90Var);
                                                                            bufferedReader.close();
                                                                            yo20Var = new yo20(ybl0Var);
                                                                        } catch (Throwable th2) {
                                                                            try {
                                                                                bufferedReader.close();
                                                                                throw th2;
                                                                            } catch (Throwable th3) {
                                                                                th2.addSuppressed(th3);
                                                                                throw th2;
                                                                            }
                                                                        }
                                                                    } catch (IOException e2) {
                                                                        throw new RuntimeException(e2);
                                                                    }
                                                                } else {
                                                                    yo20Var = y1.a;
                                                                }
                                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                                            } catch (Throwable th4) {
                                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                                                throw th4;
                                                            }
                                                        } else {
                                                            yo20Var = y1.a;
                                                        }
                                                        icl0.a = yo20Var;
                                                    }
                                                } catch (Throwable th5) {
                                                    throw th5;
                                                }
                                            }
                                            return yo20Var;
                                        }
                                    }));
                                    pdl0.h.incrementAndGet();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        this.k = xi9.b;
        Long l = vbl0Var.f;
        this.D = l != null ? l.longValue() : System.currentTimeMillis();
        wok0 wok0Var = new wok0(this);
        wok0Var.d = cdv.a;
        this.d = wok0Var;
        j6l0 j6l0Var = new j6l0(this);
        j6l0Var.j();
        this.e = j6l0Var;
        y4l0 y4l0Var = new y4l0(this);
        y4l0Var.j();
        this.f = y4l0Var;
        yol0 yol0Var = new yol0(this);
        yol0Var.j();
        this.i = yol0Var;
        this.j = new k4l0(new tbl0(this, vbl0Var));
        this.n = new hwk0(this);
        khl0 khl0Var = new khl0(this);
        khl0Var.i();
        this.l = khl0Var;
        nfl0 nfl0Var = new nfl0(this);
        nfl0Var.i();
        this.m = nfl0Var;
        wll0 wll0Var = new wll0(this);
        wll0Var.i();
        this.h = wll0Var;
        xfl0 xfl0Var = new xfl0(this);
        xfl0Var.a.A++;
        xfl0Var.j();
        this.o = xfl0Var;
        p7l0 p7l0Var = new p7l0(this);
        p7l0Var.j();
        this.g = p7l0Var;
        zzdd zzddVar = vbl0Var.d;
        boolean z = zzddVar == null || zzddVar.b == 0;
        if (context2.getApplicationContext() instanceof Application) {
            l(nfl0Var);
            if (nfl0Var.a.a.getApplicationContext() instanceof Application) {
                Application application = (Application) nfl0Var.a.a.getApplicationContext();
                lel0 lel0Var = nfl0Var.c;
                if (lel0Var == null) {
                    lel0Var = new lel0(nfl0Var);
                    nfl0Var.c = lel0Var;
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(lel0Var);
                    application.registerActivityLifecycleCallbacks(nfl0Var.c);
                    y4l0 y4l0Var2 = nfl0Var.a.f;
                    m(y4l0Var2);
                    y4l0Var2.n.a("Registered activity lifecycle callback");
                }
            }
        } else {
            m(y4l0Var);
            y4l0Var.i.a("Application context is not an Application");
        }
        p7l0Var.p(new g8l0(this, vbl0Var));
    }

    public static final void j(m1l0 m1l0Var) {
        if (m1l0Var != null) {
            return;
        }
        ib5.a("Component not created");
    }

    public static final void k(val0 val0Var) {
        if (val0Var != null) {
            return;
        }
        ib5.a("Component not created");
    }

    public static final void l(j3l0 j3l0Var) {
        if (j3l0Var == null) {
            ib5.a("Component not created");
        } else {
            if (j3l0Var.b) {
                return;
            }
            ib5.a("Component not initialized: ".concat(String.valueOf(j3l0Var.getClass())));
        }
    }

    public static final void m(xal0 xal0Var) {
        if (xal0Var == null) {
            ib5.a("Component not created");
        } else {
            if (xal0Var.b) {
                return;
            }
            ib5.a("Component not initialized: ".concat(String.valueOf(xal0Var.getClass())));
        }
    }

    public static k8l0 r(Context context, zzdd zzddVar, Long l) {
        Bundle bundle;
        if (zzddVar != null) {
            Bundle bundle2 = zzddVar.d;
            zzddVar = new zzdd(zzddVar.a, zzddVar.b, zzddVar.c, bundle2, null);
        }
        hm20.h(context);
        hm20.h(context.getApplicationContext());
        if (E == null) {
            synchronized (k8l0.class) {
                try {
                    if (E == null) {
                        E = new k8l0(new vbl0(context, zzddVar, l));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            hm20.h(E);
            E.y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        hm20.h(E);
        return E;
    }

    @Override // defpackage.zal0
    public final y4l0 a() {
        y4l0 y4l0Var = this.f;
        m(y4l0Var);
        return y4l0Var;
    }

    @Override // defpackage.zal0
    public final p7l0 b() {
        p7l0 p7l0Var = this.g;
        m(p7l0Var);
        return p7l0Var;
    }

    @Override // defpackage.zal0
    public final l9c c() {
        return this.c;
    }

    @Override // defpackage.zal0
    public final Context d() {
        return this.a;
    }

    @Override // defpackage.zal0
    public final xi9 e() {
        return this.k;
    }

    public final boolean f() {
        return g() == 0;
    }

    public final int g() {
        p7l0 p7l0Var = this.g;
        m(p7l0Var);
        p7l0Var.g();
        wok0 wok0Var = this.d;
        if (wok0Var.t()) {
            return 1;
        }
        m(p7l0Var);
        p7l0Var.g();
        if (!this.z) {
            return 8;
        }
        j6l0 j6l0Var = this.e;
        k(j6l0Var);
        j6l0Var.g();
        Boolean boolValueOf = j6l0Var.k().contains("measurement_enabled") ? Boolean.valueOf(j6l0Var.k().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        l9c l9cVar = wok0Var.a.c;
        Boolean boolS = wok0Var.s("firebase_analytics_collection_enabled");
        if (boolS != null) {
            return boolS.booleanValue() ? 0 : 4;
        }
        return (this.y == null || this.y.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    public final boolean h() {
        yol0 yol0Var;
        Context context;
        boolean z = false;
        if (!this.v) {
            ib5.a("AppMeasurement is not initialized");
            return false;
        }
        p7l0 p7l0Var = this.g;
        m(p7l0Var);
        p7l0Var.g();
        Boolean bool = this.w;
        xi9 xi9Var = this.k;
        if (bool == null || this.x == 0) {
            xi9Var.getClass();
            this.x = SystemClock.elapsedRealtime();
            yol0Var = this.i;
            k(yol0Var);
            if (yol0Var.E("android.permission.INTERNET") && yol0Var.E("android.permission.ACCESS_NETWORK_STATE")) {
                context = this.a;
                if (r7k0.a(context).c() || this.d.j() || (yol0.X(context) && yol0.z(context))) {
                    z = true;
                }
            }
            this.w = Boolean.valueOf(z);
            if (z) {
                this.w = Boolean.valueOf(yol0Var.k(q().n()));
            }
        } else if (!bool.booleanValue()) {
            xi9Var.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.x) > 1000) {
                xi9Var.getClass();
                this.x = SystemClock.elapsedRealtime();
                yol0Var = this.i;
                k(yol0Var);
                if (yol0Var.E("android.permission.INTERNET")) {
                    context = this.a;
                    if (r7k0.a(context).c()) {
                        z = true;
                    } else {
                        z = true;
                    }
                }
                this.w = Boolean.valueOf(z);
                if (z) {
                    this.w = Boolean.valueOf(yol0Var.k(q().n()));
                }
            }
        }
        return this.w.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public final void i(int i, Throwable th, byte[] bArr) {
        y4l0 y4l0Var;
        y4l0 y4l0Var2;
        int i2 = i;
        y4l0 y4l0Var3 = this.f;
        if (i2 == 200 || i2 == 204) {
            if (th == null) {
                j6l0 j6l0Var = this.e;
                k(j6l0Var);
                j6l0Var.t.b(true);
                if (bArr != null || bArr.length == 0) {
                    m(y4l0Var3);
                    y4l0Var3.m.a("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString("deeplink", "");
                    if (TextUtils.isEmpty(strOptString)) {
                        m(y4l0Var3);
                        y4l0Var3.m.a("Deferred Deep Link is empty.");
                        return;
                    }
                    String strOptString2 = jSONObject.optString("gclid", "");
                    String strOptString3 = jSONObject.optString("gbraid", "");
                    String strOptString4 = jSONObject.optString("gad_source", "");
                    double dOptDouble = jSONObject.optDouble(EventKeys.TIMESTAMP, 0.0d);
                    Bundle bundle = new Bundle();
                    yol0 yol0Var = this.i;
                    k(yol0Var);
                    k8l0 k8l0Var = yol0Var.a;
                    if (TextUtils.isEmpty(strOptString)) {
                        y4l0Var2 = y4l0Var3;
                    } else {
                        Context context = k8l0Var.a;
                        y4l0Var2 = y4l0Var3;
                        try {
                            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    bundle.putString("gbraid", strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    bundle.putString("gad_source", strOptString4);
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                this.m.n(StompClient.DEFAULT_ACK, "_cmp", bundle);
                                if (TextUtils.isEmpty(strOptString)) {
                                    return;
                                }
                                try {
                                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    editorEdit.putString("deeplink", strOptString);
                                    editorEdit.putLong(EventKeys.TIMESTAMP, Double.doubleToRawLongBits(dOptDouble));
                                    if (editorEdit.commit()) {
                                        Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        Context context2 = k8l0Var.a;
                                        if (Build.VERSION.SDK_INT < 34) {
                                            context2.sendBroadcast(intent);
                                            return;
                                        } else {
                                            context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    }
                                    return;
                                } catch (RuntimeException e) {
                                    y4l0 y4l0Var4 = yol0Var.a.f;
                                    m(y4l0Var4);
                                    y4l0Var4.f.b(e, "Failed to persist Deferred Deep Link. exception");
                                    return;
                                }
                                m(y4l0Var);
                                y4l0Var.f.b(e, "Failed to parse the Deferred Deep Link response. exception");
                                return;
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            y4l0Var = y4l0Var2;
                        }
                    }
                    m(y4l0Var2);
                    y4l0Var = y4l0Var2;
                    try {
                        y4l0Var.i.d(strOptString2, "Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString3, strOptString);
                        return;
                    } catch (JSONException e3) {
                        e = e3;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    y4l0Var = y4l0Var3;
                }
            }
        } else if (i2 == 304) {
            i2 = 304;
            if (th == null) {
                j6l0 j6l0Var2 = this.e;
                k(j6l0Var2);
                j6l0Var2.t.b(true);
                if (bArr != null) {
                }
                m(y4l0Var3);
                y4l0Var3.m.a("Deferred Deep Link response empty.");
                return;
            }
        }
        m(y4l0Var3);
        y4l0Var3.i.c(Integer.valueOf(i2), "Network Request for Deferred Deep Link failed. response, exception", th);
    }

    public final h4l0 n() {
        l(this.q);
        return this.q;
    }

    public final ikl0 o() {
        l(this.r);
        return this.r;
    }

    public final fsk0 p() {
        m(this.s);
        return this.s;
    }

    public final b4l0 q() {
        l(this.t);
        return this.t;
    }
}
