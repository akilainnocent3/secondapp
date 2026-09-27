package yads;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class at1 implements io2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f146922e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f146923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f146924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f146925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dr.i0 f146926d;

    public at1(gh ghVar, dr.i0 i0Var, boolean z10, Executor executor) {
        this.f146923a = ghVar;
        this.f146924b = z10;
        this.f146925c = executor;
        this.f146926d = i0Var;
    }

    public static void a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(fr.m1.j(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), fr.a0.Uy((Object[]) entry.getValue()));
        }
        linkedHashMap.toString();
        boolean z10 = ad1.f146762a;
    }

    @Override // yads.io2
    public final void reportAnr(final Map map) {
        if (this.f146923a != null) {
            this.f146925c.execute(new Runnable() { // from class: yads.qx3
                @Override // java.lang.Runnable
                public final void run() {
                    at1.a(this.f154656b, map);
                }
            });
        } else {
            boolean z10 = ad1.f146762a;
        }
    }

    @Override // yads.rm0
    public final void reportError(final String str, final Throwable th2) {
        if (this.f146924b) {
            if (this.f146923a != null) {
                this.f146925c.execute(new Runnable() { // from class: yads.px3
                    @Override // java.lang.Runnable
                    public final void run() {
                        at1.a(this.f154183b, str, th2);
                    }
                });
            } else {
                boolean z10 = ad1.f146762a;
            }
        }
    }

    @Override // yads.io2
    public final void reportUnhandledException(final Throwable th2) {
        if (this.f146923a != null) {
            this.f146925c.execute(new Runnable() { // from class: yads.rx3
                @Override // java.lang.Runnable
                public final void run() {
                    at1.a(this.f155186b, th2);
                }
            });
        } else {
            boolean z10 = ad1.f146762a;
        }
    }

    public static void a(String str, Throwable th2) {
        Objects.toString(th2);
        boolean z10 = ad1.f146762a;
    }

    public static void a(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(fr.m1.j(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), fr.p.h(new Object[]{entry.getValue()}));
        }
        linkedHashMap.toString();
        boolean z10 = ad1.f146762a;
    }

    public static void a(Throwable th2) {
        Objects.toString(th2);
        boolean z10 = ad1.f146762a;
    }

    public static final void a(at1 at1Var, Map map) {
        try {
            at1Var.getClass();
            a(map);
            at1Var.f146923a.reportAnr(map);
        } catch (Throwable unused) {
            boolean z10 = ad1.f146762a;
        }
    }

    public static final void a(at1 at1Var, String str, Throwable th2) {
        try {
            at1Var.getClass();
            a(str, th2);
            at1Var.f146923a.reportError(str, th2);
        } catch (Throwable unused) {
            boolean z10 = ad1.f146762a;
        }
    }

    @Override // yads.io2
    public final void a(final eo2 eo2Var) {
        if (this.f146923a != null) {
            this.f146925c.execute(new Runnable() { // from class: yads.ox3
                @Override // java.lang.Runnable
                public final void run() {
                    at1.a(this.f153642b, eo2Var);
                }
            });
        } else {
            boolean z10 = ad1.f146762a;
        }
    }

    public static final void a(at1 at1Var, eo2 eo2Var) {
        try {
            xb3.a((ou3) at1Var.f146926d.getValue(), eo2Var);
            a(eo2Var.f148795a, eo2Var.f148796b);
            at1Var.f146923a.a(eo2Var);
        } catch (Throwable unused) {
            boolean z10 = ad1.f146762a;
        }
    }

    public static final void a(at1 at1Var, Throwable th2) {
        try {
            at1Var.getClass();
            a(th2);
            at1Var.f146923a.reportUnhandledException(th2);
        } catch (Throwable unused) {
            boolean z10 = ad1.f146762a;
        }
    }
}
