package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.logger.FMPLogger;
import com.ironsource.C4235d4;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class IAlog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f47836a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.fyber.inneractive.sdk.logger.a f47837b = new com.fyber.inneractive.sdk.logger.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x0 f47838c = new x0();

    public static void a(String str, Object... objArr) {
        Iterator it = f47838c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).debug(str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        Iterator it = f47838c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).error(str, null, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        Iterator it = f47838c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).info(str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        Iterator it = f47838c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).log(1, null, str, objArr);
        }
    }

    public static void e(String str, Object... objArr) {
        Iterator it = f47838c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).verbose(str, objArr);
        }
    }

    public static void f(String str, Object... objArr) {
        Iterator it = f47838c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).warning(str, objArr);
        }
    }

    public static void a(String str, Throwable th2, Object... objArr) {
        Iterator it = f47838c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).error(str, th2, objArr);
        }
    }

    public static String a(Object obj) {
        return gi.j.f86770c + Thread.currentThread().getName() + "): " + obj.getClass().getSimpleName() + C4235d4.j.f61460d + Integer.toHexString(System.identityHashCode(obj)) + "] ";
    }

    public static String a(Class cls) {
        return gi.j.f86770c + Thread.currentThread().getName() + "): " + cls.getSimpleName() + C4235d4.j.f61460d + Integer.toHexString(System.identityHashCode(cls)) + "] ";
    }
}
