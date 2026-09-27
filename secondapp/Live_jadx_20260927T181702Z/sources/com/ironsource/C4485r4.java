package com.ironsource;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.r4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4485r4 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f63447k = "1.0.6";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f63448l = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B7 f63449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f63451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f63452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f63453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ContextProvider f63454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f63455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f63456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f63457i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f63458j;

    /* JADX INFO: renamed from: com.ironsource.r4$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f63460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f63461b;

        public b(Context context, String str) {
            this.f63460a = context;
            this.f63461b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strI = C4485r4.this.f63449a.I(this.f63460a);
                if (!TextUtils.isEmpty(strI)) {
                    C4485r4.this.f63451c = strI;
                }
                String strB = C4485r4.this.f63449a.b(this.f63460a);
                if (!TextUtils.isEmpty(strB)) {
                    C4485r4.this.f63453e = strB;
                }
                SharedPreferences.Editor editorEdit = this.f63460a.getSharedPreferences("CRep", 0).edit();
                editorEdit.putString("String1", C4485r4.this.f63451c);
                editorEdit.putString("sId", this.f63461b);
                editorEdit.apply();
            } catch (Exception e10) {
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r4$c */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends RunnableC4502s4 {
        public c(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r4$d */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @SuppressLint({"StaticFieldLeak"})
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static volatile C4485r4 f63464a = new C4485r4();

        private d() {
        }
    }

    public String e() {
        return this.f63457i;
    }

    private C4485r4() {
        this.f63458j = false;
        this.f63449a = Lb.U().i();
        this.f63454f = ContextProvider.getInstance();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f63455g = defaultUncaughtExceptionHandler;
        this.f63457i = " ";
        this.f63456h = "https://o-crash.mediation.unity3d.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new C4452p4(defaultUncaughtExceptionHandler));
    }

    public static List<P5> c() {
        return null;
    }

    public static C4485r4 d() {
        return d.f63464a;
    }

    public void a(HashSet<String> hashSet, String str, String str2, boolean z10, String str3, int i10, boolean z11) {
        Context applicationContext = this.f63454f.getApplicationContext();
        if (applicationContext != null) {
            Log.d("automation_log", "init ISCrashReporter");
            if (!TextUtils.isEmpty(str2)) {
                this.f63457i = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f63456h = str;
            }
            this.f63452d = str3;
            if (z10) {
                new C4176a(i10).a(z11).b(true).a(new a()).start();
            }
            a(applicationContext, hashSet);
            new Thread(new b(applicationContext, str3)).start();
        }
        this.f63458j = true;
        IronLog.INTERNAL.verbose("initialized");
    }

    public String b() {
        return f63447k;
    }

    public void a(Throwable th2) {
        IronLog.INTERNAL.verbose("isInitialized=" + this.f63458j);
        if (!this.f63458j || th2 == null) {
            return;
        }
        new P5(new C4469q4(th2).b(), "" + System.currentTimeMillis(), "Caught_IS_Crash").a();
    }

    /* JADX INFO: renamed from: com.ironsource.r4$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements InterfaceC4194b {
        public a() {
        }

        @Override // com.ironsource.InterfaceC4194b
        public void a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb2 = new StringBuilder(128);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb2.append("*** Thread Name ");
                    sb2.append(thread.getName());
                    sb2.append(" Thread ID ");
                    sb2.append(thread.getId());
                    sb2.append(" ");
                    sb2.append(gi.j.f86770c);
                    sb2.append(thread.getState().toString());
                    sb2.append(gi.j.f86771d);
                    sb2.append(" ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb2.append(stackTraceElement.toString());
                        sb2.append(" ");
                        sb2.append(thread.getState().toString());
                        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                    }
                }
            }
            C4485r4.f63448l = sb2.toString();
        }

        @Override // com.ironsource.InterfaceC4194b
        public void b() {
        }
    }

    private void a(Context context, HashSet<String> hashSet) {
        String strA = a(a());
        if (strA.equals("none")) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
        String string = sharedPreferences.getString("String1", this.f63451c);
        String string2 = sharedPreferences.getString("sId", this.f63452d);
        List<P5> listB = I4.b();
        IronLog.INTERNAL.verbose("reportList size " + listB.size());
        for (P5 p10 : listB) {
            JSONObject jSONObject = new JSONObject();
            String strB = p10.b();
            String strE = p10.e();
            String strD = p10.d();
            String packageName = context.getPackageName();
            JSONObject jSONObject2 = new JSONObject();
            try {
                ActivityManager.MemoryInfo memoryInfoN = this.f63449a.n(context);
                if (memoryInfoN != null) {
                    jSONObject2.put("availRam", this.f63449a.c(memoryInfoN));
                    jSONObject2.put(Q6.f59920x, this.f63449a.b(memoryInfoN));
                    jSONObject2.put("mThreshold", this.f63449a.a(memoryInfoN));
                }
                String strT = this.f63449a.t();
                if (strT != null) {
                    jSONObject2.put(Q6.f59926z, strT);
                }
                jSONObject2.put("crashDate", strB);
                jSONObject2.put("stacktraceCrash", strE);
                jSONObject2.put("crashType", strD);
                jSONObject2.put("CrashReporterVersion", f63447k);
                jSONObject2.put(C4235d4.j.f61486q, "9.2.0");
                jSONObject2.put(C4235d4.j.f61497x, this.f63449a.c(context));
                jSONObject2.put("appVersion", C1.b(context, packageName));
                jSONObject2.put(C4235d4.j.f61480n, this.f63449a.i());
                jSONObject2.put("network", strA);
                jSONObject2.put(C4235d4.j.f61484p, this.f63449a.e());
                jSONObject2.put("deviceModel", this.f63449a.l());
                jSONObject2.put("totalRam", this.f63449a.q(context));
                jSONObject2.put(C4206bb.f61103o, this.f63449a.f());
                jSONObject2.put("advertisingId", string);
                jSONObject2.put("deviceOEM", this.f63449a.q());
                jSONObject2.put("systemProperties", System.getProperties());
                jSONObject2.put("bundleId", packageName);
                jSONObject2.put("sId", string2);
                if (!TextUtils.isEmpty(this.f63453e)) {
                    jSONObject2.put(C4235d4.j.M, Boolean.parseBoolean(this.f63453e));
                }
                if (hashSet == null || hashSet.isEmpty()) {
                    jSONObject = jSONObject2;
                } else {
                    for (String str : hashSet) {
                        try {
                            if (jSONObject2.has(str)) {
                                jSONObject.put(str, jSONObject2.opt(str));
                            }
                        } catch (Exception e10) {
                            IronLog.INTERNAL.error(e10.toString());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (jSONObject.length() == 0) {
                Log.d("ISCrashReport", " Is Empty");
            } else {
                new Thread(new c(jSONObject)).start();
            }
        }
        I4.a();
    }

    public Context a() {
        return this.f63454f.getApplicationContext();
    }

    private String a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return Z3.f60406b;
            }
            return networkCapabilities.hasTransport(0) ? Z3.f60411g : "none";
        } catch (Exception e10) {
            IronLog.INTERNAL.error(e10.toString());
            return "none";
        }
    }
}
