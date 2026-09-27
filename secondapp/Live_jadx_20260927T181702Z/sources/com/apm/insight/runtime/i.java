package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static i f26244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f26245b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Printer> f26246c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Printer> f26247d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26248e = false;

    static {
        new Printer() { // from class: com.apm.insight.runtime.i.1
            @Override // android.util.Printer
            public final void println(String str) {
                if (str == null) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    i.a().a(str);
                } else if (str.charAt(0) == '<') {
                    i.a().b(str);
                }
                i.c();
            }
        };
    }

    private i() {
    }

    public static i a() {
        if (f26244a == null) {
            synchronized (i.class) {
                try {
                    if (f26244a == null) {
                        f26244a = new i();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f26244a;
    }

    public static /* synthetic */ Printer c() {
        return null;
    }

    public final boolean b() {
        return this.f26245b != -1 && SystemClock.uptimeMillis() - this.f26245b > 5000;
    }

    public final void b(String str) {
        this.f26245b = SystemClock.uptimeMillis();
        try {
            a(this.f26247d, str);
        } catch (Exception e10) {
            com.apm.insight.a.b((Throwable) e10);
        }
    }

    public final void a(String str) {
        this.f26245b = -1L;
        try {
            a(this.f26246c, str);
        } catch (Exception e10) {
            com.apm.insight.a.a((Throwable) e10);
        }
    }

    private static void a(List<? extends Printer> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Printer printer = list.get(i10);
                if (printer == null) {
                    return;
                }
                printer.println(str);
            }
        } catch (Throwable th2) {
            com.apm.insight.a.a(th2);
        }
    }
}
