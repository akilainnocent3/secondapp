package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class In {
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    public static Hn a(Throwable th2, int i10, int i11) {
        StackTraceElement[] stackTrace;
        Hn hnA;
        String name = th2.getClass().getName();
        String message = th2.getMessage();
        try {
            stackTrace = th2.getStackTrace();
        } catch (Throwable unused) {
            stackTrace = new StackTraceElement[0];
        }
        ArrayList arrayList = new ArrayList(stackTrace.length);
        for (StackTraceElement stackTraceElement : stackTrace) {
            arrayList.add(new El(stackTraceElement));
        }
        Throwable cause = th2.getCause();
        ArrayList arrayList2 = null;
        if (cause == null) {
            hnA = null;
        } else {
            if (i11 >= i10) {
                cause = null;
            }
            if (cause != null) {
                hnA = a(cause, 30, i11 + 1);
            } else {
                hnA = null;
            }
        }
        if (i11 < i10) {
            Throwable[] suppressed = th2.getSuppressed();
            arrayList2 = new ArrayList(suppressed.length);
            for (Throwable th3 : suppressed) {
                arrayList2.add(a(th3, 1, i11));
            }
        }
        return new Hn(name, message, arrayList, hnA, arrayList2);
    }
}
