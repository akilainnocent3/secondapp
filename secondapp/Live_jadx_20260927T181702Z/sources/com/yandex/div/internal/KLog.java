package com.yandex.div.internal;

import com.yandex.div.logging.Severity;
import dr.f1;
import dr.w2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class KLog {

    @l
    public static final KLog INSTANCE = new KLog();

    @l
    private static final List<LogListener> listeners = new ArrayList();

    /* JADX INFO: renamed from: com.yandex.div.internal.KLog$e$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class AnonymousClass1 extends o0 implements ds.a<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // ds.a
        @l
        public final String invoke() {
            return "";
        }
    }

    private KLog() {
    }

    public static /* synthetic */ void e$default(KLog kLog, String str, Throwable th2, ds.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = AnonymousClass1.INSTANCE;
        }
        if (kLog.isAtLeast(Severity.ERROR)) {
            android.util.Log.e(str, (String) aVar.invoke(), th2);
        }
    }

    public final void addListener(@l LogListener logListener) {
        List<LogListener> list = listeners;
        synchronized (list) {
            list.add(logListener);
        }
    }

    public final void d(@l String str, @l ds.a<String> aVar) {
        if (isAtLeast(Severity.DEBUG)) {
            print(3, str, aVar.invoke());
        }
    }

    public final void e(@l String str, @l ds.a<String> aVar) {
        if (isAtLeast(Severity.ERROR)) {
            print(6, str, aVar.invoke());
        }
    }

    @l
    public final List<LogListener> getListeners() {
        return listeners;
    }

    public final void i(@l String str, @l ds.a<String> aVar) {
        if (isAtLeast(Severity.INFO)) {
            print(4, str, aVar.invoke());
        }
    }

    @f1
    public final boolean isAtLeast(@l Severity severity) {
        return Log.isAtLeast(severity);
    }

    @f1
    public final void print(int i10, @l String str, @l String str2) {
        android.util.Log.println(i10, str, str2);
        List<LogListener> list = listeners;
        synchronized (list) {
            try {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((LogListener) it.next()).onNewMessage(i10, str, str2);
                }
                w2 w2Var = w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void removeListener(@l LogListener logListener) {
        List<LogListener> list = listeners;
        synchronized (list) {
            list.remove(logListener);
        }
    }

    public final void v(@l String str, @l ds.a<String> aVar) {
        if (isAtLeast(Severity.VERBOSE)) {
            print(2, str, aVar.invoke());
        }
    }

    public final void w(@l String str, @l ds.a<String> aVar) {
        if (isAtLeast(Severity.WARNING)) {
            print(5, str, aVar.invoke());
        }
    }

    public final void d(@l String str, @l Throwable th2, @l ds.a<String> aVar) {
        if (isAtLeast(Severity.DEBUG)) {
            android.util.Log.d(str, aVar.invoke(), th2);
        }
    }

    public final void e(@l String str, @m Throwable th2, @l ds.a<String> aVar) {
        if (isAtLeast(Severity.ERROR)) {
            android.util.Log.e(str, aVar.invoke(), th2);
        }
    }

    public final void i(@l String str, @l Throwable th2, @l ds.a<String> aVar) {
        if (isAtLeast(Severity.INFO)) {
            android.util.Log.i(str, aVar.invoke(), th2);
        }
    }

    public final void v(@l String str, @l Throwable th2, @l ds.a<String> aVar) {
        if (isAtLeast(Severity.VERBOSE)) {
            android.util.Log.v(str, aVar.invoke(), th2);
        }
    }

    public final void w(@l String str, @l Throwable th2, @l ds.a<String> aVar) {
        if (isAtLeast(Severity.WARNING)) {
            android.util.Log.w(str, aVar.invoke(), th2);
        }
    }
}
