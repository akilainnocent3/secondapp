package com.apm.insight.b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f25865a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f25866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f25867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Printer f25868d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements Printer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List<Printer> f25869a = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<Printer> f25872d = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<Printer> f25870b = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f25873e = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f25871c = false;

        @Override // android.util.Printer
        public final void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            i.b();
            if (str.charAt(0) == '>' && this.f25871c) {
                for (Printer printer : this.f25870b) {
                    if (!this.f25869a.contains(printer)) {
                        this.f25869a.add(printer);
                    }
                }
                this.f25870b.clear();
                this.f25871c = false;
            }
            if (this.f25869a.size() > i.f25865a) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (Printer printer2 : this.f25869a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            str.charAt(0);
            i.b();
        }
    }

    public static void a() {
        if (f25867c) {
            return;
        }
        f25867c = true;
        f25866b = new b();
        Printer printerD = d();
        f25868d = printerD;
        if (printerD != null) {
            f25866b.f25869a.add(printerD);
        }
        if (com.apm.insight.e.s()) {
            Looper.getMainLooper().setMessageLogging(f25866b);
        }
    }

    public static /* synthetic */ a b() {
        return null;
    }

    private static Printer d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Printer printer) {
        if (printer == null || f25866b.f25870b.contains(printer)) {
            return;
        }
        f25866b.f25870b.add(printer);
        f25866b.f25871c = true;
    }
}
