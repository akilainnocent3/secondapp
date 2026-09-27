package yads;

import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class lh3 implements wh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f151989a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public jv3 f151990b;

    public final void a() {
        this.f151989a.post(new Runnable() { // from class: yads.r54
            @Override // java.lang.Runnable
            public final void run() {
                lh3.a(this.f154761b);
            }
        });
    }

    public static final void a(lh3 lh3Var) {
        jv3 jv3Var = lh3Var.f151990b;
        if (jv3Var != null) {
            new CallbackStackTraceMarker(new iv3(jv3Var));
        }
    }
}
