package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fi1 implements uh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f149124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public uh1 f149125b;

    public /* synthetic */ fi1() {
        this(new Handler(Looper.getMainLooper()));
    }

    public static final void a(fi1 fi1Var) {
        uh1 uh1Var = fi1Var.f149125b;
        if (uh1Var != null) {
            uh1Var.onInstreamAdBreakCompleted();
        }
    }

    public static final void b(fi1 fi1Var) {
        uh1 uh1Var = fi1Var.f149125b;
        if (uh1Var != null) {
            uh1Var.onInstreamAdBreakPrepared();
        }
    }

    public static final void c(fi1 fi1Var) {
        uh1 uh1Var = fi1Var.f149125b;
        if (uh1Var != null) {
            uh1Var.onInstreamAdBreakStarted();
        }
    }

    @Override // yads.uh1
    public final void onInstreamAdBreakCompleted() {
        this.f149124a.post(new Runnable() { // from class: yads.r04
            @Override // java.lang.Runnable
            public final void run() {
                fi1.a(this.f154706b);
            }
        });
    }

    @Override // yads.uh1
    public final void onInstreamAdBreakError(final String str) {
        this.f149124a.post(new Runnable() { // from class: yads.t04
            @Override // java.lang.Runnable
            public final void run() {
                fi1.a(this.f155656b, str);
            }
        });
    }

    @Override // yads.uh1
    public final void onInstreamAdBreakPrepared() {
        this.f149124a.post(new Runnable() { // from class: yads.u04
            @Override // java.lang.Runnable
            public final void run() {
                fi1.b(this.f156185b);
            }
        });
    }

    @Override // yads.uh1
    public final void onInstreamAdBreakStarted() {
        this.f149124a.post(new Runnable() { // from class: yads.s04
            @Override // java.lang.Runnable
            public final void run() {
                fi1.c(this.f155221b);
            }
        });
    }

    public static final void a(fi1 fi1Var, String str) {
        uh1 uh1Var = fi1Var.f149125b;
        if (uh1Var != null) {
            uh1Var.onInstreamAdBreakError(str);
        }
    }

    public fi1(Handler handler) {
        this.f149124a = handler;
    }
}
