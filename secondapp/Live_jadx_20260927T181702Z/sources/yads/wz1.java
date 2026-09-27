package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wz1 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f157588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z00 f157589b;

    public /* synthetic */ wz1() {
        this(new Handler(Looper.getMainLooper()));
    }

    public static final void c(wz1 wz1Var) {
        z00 z00Var = wz1Var.f157589b;
        if (z00Var != null) {
            z00Var.onReturnedToApplication();
        }
    }

    public final void a() {
        this.f157588a.post(new Runnable() { // from class: yads.zd4
            @Override // java.lang.Runnable
            public final void run() {
                wz1.a(this.f158783b);
            }
        });
    }

    public final void b() {
        this.f157588a.post(new Runnable() { // from class: yads.be4
            @Override // java.lang.Runnable
            public final void run() {
                wz1.b(this.f147157b);
            }
        });
    }

    @Override // yads.g1
    public final void onReturnedToApplication() {
        this.f157588a.post(new Runnable() { // from class: yads.ce4
            @Override // java.lang.Runnable
            public final void run() {
                wz1.c(this.f147716b);
            }
        });
    }

    public static final void a(wz1 wz1Var) {
        z00 z00Var = wz1Var.f157589b;
        if (z00Var != null) {
            z00Var.closeNativeAd();
        }
    }

    public static final void b(wz1 wz1Var) {
        z00 z00Var = wz1Var.f157589b;
        if (z00Var != null) {
            z00Var.onAdClicked();
        }
        z00 z00Var2 = wz1Var.f157589b;
        if (z00Var2 != null) {
            z00Var2.onLeftApplication();
        }
    }

    public wz1(Handler handler) {
        this.f157588a = handler;
    }

    public final void a(final j5 j5Var) {
        this.f157588a.post(new Runnable() { // from class: yads.ae4
            @Override // java.lang.Runnable
            public final void run() {
                wz1.a(this.f146781b, j5Var);
            }
        });
    }

    public static final void a(wz1 wz1Var, j5 j5Var) {
        z00 z00Var = wz1Var.f157589b;
        if (z00Var != null) {
            z00Var.a(j5Var);
        }
    }
}
