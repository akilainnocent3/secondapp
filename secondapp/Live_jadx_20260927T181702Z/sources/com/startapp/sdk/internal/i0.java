package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class i0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f74967a;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        try {
            try {
                if (si.a(th2) != null) {
                    if ("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n".equals(th2.getMessage())) {
                        try {
                            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f74967a;
                            if (uncaughtExceptionHandler != null) {
                                uncaughtExceptionHandler.uncaughtException(thread, th2);
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                            return;
                        }
                    }
                    d9.a(th2, e9.f74724g);
                    th.printStackTrace();
                }
                try {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f74967a;
                    if (uncaughtExceptionHandler2 != null) {
                        uncaughtExceptionHandler2.uncaughtException(thread, th2);
                    }
                } catch (Throwable th4) {
                    th4.printStackTrace();
                }
            } catch (Throwable unused) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f74967a;
                if (uncaughtExceptionHandler3 != null) {
                    uncaughtExceptionHandler3.uncaughtException(thread, th2);
                }
            }
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
    }
}
