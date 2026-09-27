package yads;

import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tk2 implements iy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hy0 f155936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f155937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zs3 f155938c;

    public /* synthetic */ tk2(hy0 hy0Var) {
        this(hy0Var, new Handler(Looper.getMainLooper()));
    }

    public static final void a(tk2 tk2Var) {
        zs3 zs3Var = tk2Var.f155938c;
        if (zs3Var != null) {
            new CallbackStackTraceMarker(new us3(zs3Var));
        }
    }

    public static final void b(tk2 tk2Var) {
        zs3 zs3Var = tk2Var.f155938c;
        if (zs3Var != null) {
            new CallbackStackTraceMarker(new vs3(zs3Var));
        }
    }

    public static final void c(tk2 tk2Var) {
        zs3 zs3Var = tk2Var.f155938c;
        if (zs3Var != null) {
            new CallbackStackTraceMarker(new ys3(zs3Var));
        }
        hy0 hy0Var = tk2Var.f155936a;
        if (hy0Var != null) {
            hy0Var.onAdShown();
        }
    }

    @Override // yads.iy0
    public final void onAdClicked() {
        this.f155937b.post(new Runnable() { // from class: yads.gb4
            @Override // java.lang.Runnable
            public final void run() {
                tk2.a(this.f149512b);
            }
        });
    }

    @Override // yads.iy0
    public final void onAdDismissed() {
        this.f155937b.post(new Runnable() { // from class: yads.jb4
            @Override // java.lang.Runnable
            public final void run() {
                tk2.b(this.f151005b);
            }
        });
    }

    @Override // yads.iy0
    public final void onAdShown() {
        this.f155937b.post(new Runnable() { // from class: yads.ib4
            @Override // java.lang.Runnable
            public final void run() {
                tk2.c(this.f150531b);
            }
        });
    }

    public tk2(hy0 hy0Var, Handler handler) {
        this.f155936a = hy0Var;
        this.f155937b = handler;
    }

    public final void a(final n7 n7Var) {
        this.f155937b.post(new Runnable() { // from class: yads.hb4
            @Override // java.lang.Runnable
            public final void run() {
                tk2.a(n7Var, this);
            }
        });
    }

    public static final void a(n7 n7Var, tk2 tk2Var) {
        String str = n7Var.f152904b;
        zs3 zs3Var = tk2Var.f155938c;
        if (zs3Var != null) {
            new CallbackStackTraceMarker(new ws3(zs3Var, new wp3(str)));
        }
    }

    @Override // yads.iy0
    public final void a(final j5 j5Var) {
        this.f155937b.post(new Runnable() { // from class: yads.fb4
            @Override // java.lang.Runnable
            public final void run() {
                tk2.a(this.f149042b, j5Var);
            }
        });
    }

    public static final void a(tk2 tk2Var, j5 j5Var) {
        zs3 zs3Var = tk2Var.f155938c;
        if (zs3Var != null) {
            new CallbackStackTraceMarker(new xs3(zs3Var, j5Var != null ? new lr3(j5Var) : null));
        }
    }
}
