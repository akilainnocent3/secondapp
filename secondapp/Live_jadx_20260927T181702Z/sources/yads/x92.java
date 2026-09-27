package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class x92 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v92 f157741g = new v92();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f157742h = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile x92 f157743i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u92 f157746c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f157748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f157749f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f157744a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f157745b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s92 f157747d = new s92();

    public x92(Context context) {
        this.f157746c = new u92(context);
    }

    public final void a(ld3 ld3Var) {
        synchronized (this.f157744a) {
            try {
                this.f157747d.b(ld3Var);
                if (!this.f157747d.a()) {
                    u92 u92Var = this.f157746c;
                    xo2 xo2Var = u92Var.f156325c;
                    Context context = u92Var.f156323a;
                    xo2Var.getClass();
                    xo2.a(context, "om_sdk_js_request_tag");
                }
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(ld3 ld3Var) {
        boolean z10;
        synchronized (this.f157744a) {
            try {
                z10 = this.f157749f;
                if (!z10) {
                    this.f157747d.a(ld3Var);
                }
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            ld3Var.a();
        } else {
            a();
        }
    }

    public final void c() {
        synchronized (this.f157744a) {
            this.f157745b.removeCallbacksAndMessages(null);
            this.f157748e = false;
            dr.w2 w2Var = dr.w2.f79517a;
        }
    }

    public final void b() {
        this.f157745b.postDelayed(new Runnable() { // from class: yads.de4
            @Override // java.lang.Runnable
            public final void run() {
                x92.a(this.f148195b);
            }
        }, f157742h);
    }

    public final void a() {
        boolean z10;
        synchronized (this.f157744a) {
            try {
                if (this.f157748e) {
                    z10 = false;
                } else {
                    z10 = true;
                    this.f157748e = true;
                }
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            b();
            this.f157746c.a(new w92(this));
        }
    }

    public static final void a(x92 x92Var) {
        u92 u92Var = x92Var.f157746c;
        xo2 xo2Var = u92Var.f156325c;
        Context context = u92Var.f156323a;
        xo2Var.getClass();
        xo2.a(context, "om_sdk_js_request_tag");
        synchronized (x92Var.f157744a) {
            x92Var.f157749f = true;
            dr.w2 w2Var = dr.w2.f79517a;
        }
        x92Var.c();
        x92Var.f157747d.b();
    }
}
