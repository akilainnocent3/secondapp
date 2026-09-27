package yads;

import android.app.Application;
import android.content.Context;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class z0 implements w0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f158542f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile z0 f158543g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f158544a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f158545b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f158546c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f158547d = new y0(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f158548e;

    public final void a(Context context, l1 l1Var) {
        synchronized (this.f158544a) {
            try {
                this.f158545b.put(l1Var, null);
                if (!a()) {
                    a(context);
                }
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Context context, l1 l1Var) {
        synchronized (this.f158544a) {
            this.f158545b.remove(l1Var);
            b(context);
            dr.w2 w2Var = dr.w2.f79517a;
        }
    }

    public final void b(Context context) {
        synchronized (this.f158544a) {
            try {
                if (this.f158545b.isEmpty() && this.f158546c.isEmpty()) {
                    try {
                        if (a()) {
                            Context applicationContext = context.getApplicationContext();
                            kotlin.jvm.internal.m0.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
                            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.f158547d);
                            this.f158548e = false;
                        }
                    } catch (Throwable unused) {
                        boolean z10 = ad1.f146762a;
                    }
                }
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(Context context, d1 d1Var) {
        synchronized (this.f158544a) {
            try {
                this.f158546c.put(d1Var, null);
                if (!a()) {
                    a(context);
                }
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f158544a) {
            z10 = this.f158548e;
        }
        return z10;
    }

    public final void a(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.m0.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this.f158547d);
            this.f158548e = true;
        } catch (Throwable unused) {
            boolean z10 = ad1.f146762a;
        }
    }
}
