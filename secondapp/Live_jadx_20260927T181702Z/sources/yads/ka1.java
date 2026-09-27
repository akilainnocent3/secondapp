package yads;

import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ka1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f151450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gs3 f151451b;

    public /* synthetic */ ka1() {
        this(new Handler(Looper.getMainLooper()));
    }

    public final void a() {
        this.f151450a.post(new Runnable() { // from class: yads.f34
            @Override // java.lang.Runnable
            public final void run() {
                ka1.a(this.f148964b);
            }
        });
    }

    public final void b() {
        this.f151450a.post(new Runnable() { // from class: yads.g34
            @Override // java.lang.Runnable
            public final void run() {
                ka1.b(this.f149385b);
            }
        });
    }

    public final void c() {
        final String str = "Video player returned error";
        this.f151450a.post(new Runnable() { // from class: yads.e34
            @Override // java.lang.Runnable
            public final void run() {
                ka1.a(this.f148488b, str);
            }
        });
    }

    public static final void a(ka1 ka1Var) {
        gs3 gs3Var = ka1Var.f151451b;
        if (gs3Var != null) {
            new CallbackStackTraceMarker(new fs3(gs3Var));
        }
    }

    public static final void b(ka1 ka1Var) {
        gs3 gs3Var = ka1Var.f151451b;
        if (gs3Var != null) {
            new CallbackStackTraceMarker(new es3(gs3Var));
        }
    }

    public ka1(Handler handler) {
        this.f151450a = handler;
    }

    public static final void a(ka1 ka1Var, String str) {
        gs3 gs3Var = ka1Var.f151451b;
        if (gs3Var != null) {
            new CallbackStackTraceMarker(new ds3(gs3Var, str));
        }
    }
}
