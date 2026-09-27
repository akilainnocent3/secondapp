package yads;

import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vk2 implements iy0, qr2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hy0 f157000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f157001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public eu3 f157002c;

    public /* synthetic */ vk2(hy0 hy0Var) {
        this(hy0Var, new Handler(Looper.getMainLooper()));
    }

    public static final void a(vk2 vk2Var) {
        eu3 eu3Var = vk2Var.f157002c;
        if (eu3Var != null) {
            new CallbackStackTraceMarker(new yt3(eu3Var));
        }
    }

    public static final void b(vk2 vk2Var) {
        eu3 eu3Var = vk2Var.f157002c;
        if (eu3Var != null) {
            new CallbackStackTraceMarker(new zt3(eu3Var));
        }
    }

    public static final void c(vk2 vk2Var) {
        eu3 eu3Var = vk2Var.f157002c;
        if (eu3Var != null) {
            new CallbackStackTraceMarker(new cu3(eu3Var));
        }
        hy0 hy0Var = vk2Var.f157000a;
        if (hy0Var != null) {
            hy0Var.onAdShown();
        }
    }

    @Override // yads.iy0
    public final void onAdClicked() {
        this.f157001b.post(new Runnable() { // from class: yads.qc4
            @Override // java.lang.Runnable
            public final void run() {
                vk2.a(this.f154431b);
            }
        });
    }

    @Override // yads.iy0
    public final void onAdDismissed() {
        this.f157001b.post(new Runnable() { // from class: yads.sc4
            @Override // java.lang.Runnable
            public final void run() {
                vk2.b(this.f155370b);
            }
        });
    }

    @Override // yads.iy0
    public final void onAdShown() {
        this.f157001b.post(new Runnable() { // from class: yads.rc4
            @Override // java.lang.Runnable
            public final void run() {
                vk2.c(this.f154879b);
            }
        });
    }

    public vk2(hy0 hy0Var, Handler handler) {
        this.f157000a = hy0Var;
        this.f157001b = handler;
    }

    public final void a(final n7 n7Var) {
        this.f157001b.post(new Runnable() { // from class: yads.vc4
            @Override // java.lang.Runnable
            public final void run() {
                vk2.a(n7Var, this);
            }
        });
    }

    public static final void a(n7 n7Var, vk2 vk2Var) {
        String str = n7Var.f152904b;
        eu3 eu3Var = vk2Var.f157002c;
        if (eu3Var != null) {
            new CallbackStackTraceMarker(new au3(eu3Var, new wp3(str)));
        }
    }

    @Override // yads.iy0
    public final void a(final j5 j5Var) {
        this.f157001b.post(new Runnable() { // from class: yads.uc4
            @Override // java.lang.Runnable
            public final void run() {
                vk2.a(this.f156357b, j5Var);
            }
        });
    }

    public static final void a(vk2 vk2Var, j5 j5Var) {
        eu3 eu3Var = vk2Var.f157002c;
        if (eu3Var != null) {
            new CallbackStackTraceMarker(new bu3(eu3Var, j5Var != null ? new lr3(j5Var) : null));
        }
    }

    @Override // yads.qr2
    public final void a(final bw2 bw2Var) {
        this.f157001b.post(new Runnable() { // from class: yads.tc4
            @Override // java.lang.Runnable
            public final void run() {
                vk2.a(this.f155821b, bw2Var);
            }
        });
    }

    public static final void a(vk2 vk2Var, pq2 pq2Var) {
        eu3 eu3Var = vk2Var.f157002c;
        if (eu3Var != null) {
            new CallbackStackTraceMarker(new du3(eu3Var, new wt3(pq2Var)));
        }
    }
}
