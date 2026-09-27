package com.chartboost.sdk.impl;

import android.util.Log;
import com.chartboost.sdk.LoggingLevel;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class sb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sb f40868a = new sb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static LoggingLevel f40869b = LoggingLevel.INTEGRATION;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f40870c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f40871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f40872e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        DEBUG,
        ERROR,
        WARNING,
        INFO,
        VERBOSE,
        WTF;


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ sr.a f40880i = sr.c.c(a());
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40881a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.VERBOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.WTF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f40881a = iArr;
        }
    }

    public static final void a(String msg, Throwable th2) {
        kotlin.jvm.internal.m0.p(msg, "msg");
        f40868a.a(a.DEBUG, msg, th2);
    }

    public static final void b(String msg, Throwable th2) {
        kotlin.jvm.internal.m0.p(msg, "msg");
        f40868a.a(a.ERROR, msg, th2);
    }

    public static final void c(String msg, Throwable th2) {
        kotlin.jvm.internal.m0.p(msg, "msg");
        f40868a.a(a.INFO, msg, th2);
    }

    public static final void d(String msg, Throwable th2) {
        kotlin.jvm.internal.m0.p(msg, "msg");
        f40868a.a(a.VERBOSE, msg, th2);
    }

    public static final void e(String msg, Throwable th2) {
        kotlin.jvm.internal.m0.p(msg, "msg");
        f40868a.a(a.WARNING, msg, th2);
    }

    public static /* synthetic */ void a(String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        a(str, th2);
    }

    public static /* synthetic */ void b(String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        b(str, th2);
    }

    public static /* synthetic */ void c(String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        c(str, th2);
    }

    public static /* synthetic */ void d(String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        d(str, th2);
    }

    public static /* synthetic */ void e(String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        e(str, th2);
    }

    public final String a(int i10) {
        StackTraceElement stackTraceElementC = c(i10);
        if (stackTraceElementC == null) {
            return "";
        }
        String str = stackTraceElementC.getClassName() + ":" + stackTraceElementC.getMethodName() + ":" + stackTraceElementC.getLineNumber();
        ConcurrentHashMap concurrentHashMap = f40870c;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            if (concurrentHashMap.size() >= 1000) {
                Set setKeySet = concurrentHashMap.keySet();
                kotlin.jvm.internal.m0.o(setKeySet, "<get-keys>(...)");
                Iterator it = fr.r0.O5(setKeySet, 250).iterator();
                while (it.hasNext()) {
                    f40870c.remove((String) it.next());
                }
            }
            String className = stackTraceElementC.getClassName();
            kotlin.jvm.internal.m0.o(className, "getClassName(...)");
            obj = cv.p0.P5(className, kj.e.f102543c, null, 2, null) + androidx.media3.session.fe.F + stackTraceElementC.getMethodName() + "():";
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str, obj);
            if (objPutIfAbsent != null) {
                obj = objPutIfAbsent;
            }
        }
        kotlin.jvm.internal.m0.o(obj, "getOrPut(...)");
        return (String) obj;
    }

    public final String b(int i10) {
        StackTraceElement stackTraceElementC = c(i10);
        if (stackTraceElementC != null) {
            String className = stackTraceElementC.getClassName();
            kotlin.jvm.internal.m0.o(className, "getClassName(...)");
            String str = cv.p0.P5(className, kj.e.f102543c, null, 2, null) + androidx.media3.session.fe.F + stackTraceElementC.getMethodName() + "():";
            return str == null ? "" : str;
        }
        return "";
    }

    public final StackTraceElement c(int i10) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length > i10) {
            return stackTrace[i10];
        }
        return null;
    }

    public static /* synthetic */ String b(sb sbVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8;
        }
        return sbVar.b(i10);
    }

    public static /* synthetic */ String a(sb sbVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8;
        }
        return sbVar.a(i10);
    }

    public final boolean a() {
        Boolean bool = f40871d;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (f40872e) {
            return false;
        }
        try {
            f40872e = true;
            mg mgVar = (mg) c4.f38374b.a().b().get();
            boolean z10 = mgVar != null ? mgVar.f40030m : false;
            f40871d = Boolean.valueOf(z10);
            return z10;
        } catch (Exception unused) {
            f40871d = Boolean.FALSE;
            return false;
        } finally {
            f40872e = false;
        }
    }

    public final void a(a aVar, String str, Throwable th2) {
        String strB;
        if (f40869b == LoggingLevel.ALL || f40869b == LoggingLevel.INTEGRATION) {
            if (a()) {
                strB = a(this, 0, 1, (Object) null);
            } else {
                strB = b(this, 0, 1, (Object) null);
            }
            String str2 = strB + " " + str;
            switch (b.f40881a[aVar.ordinal()]) {
                case 1:
                    Log.d("[ChartboostMonetization]", str2, th2);
                    break;
                case 2:
                    Log.e("[ChartboostMonetization]", str2, th2);
                    break;
                case 3:
                    Log.w("[ChartboostMonetization]", str2, th2);
                    break;
                case 4:
                    Log.i("[ChartboostMonetization]", str2, th2);
                    break;
                case 5:
                    Log.v("[ChartboostMonetization]", str2, th2);
                    break;
                case 6:
                    Log.wtf("[ChartboostMonetization]", str2, th2);
                    break;
            }
        }
    }
}
