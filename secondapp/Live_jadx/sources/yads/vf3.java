package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf3 f156949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rf3 f156950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f156951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f156952d;

    public /* synthetic */ vf3(hf3 hf3Var, rf3 rf3Var) {
        this(hf3Var, rf3Var, new Handler(Looper.getMainLooper()));
    }

    public final void a() {
        if (this.f156952d) {
            this.f156950b.b();
            this.f156951c.removeCallbacksAndMessages(null);
            this.f156952d = false;
        }
    }

    public vf3(hf3 hf3Var, rf3 rf3Var, Handler handler) {
        this.f156949a = hf3Var;
        this.f156950b = rf3Var;
        this.f156951c = handler;
    }
}
