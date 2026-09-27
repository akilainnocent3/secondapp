package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e9 f149185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final in2 f149186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f149187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f149188d;

    public fn2(e9 e9Var, in2 in2Var) {
        this(e9Var, in2Var, new Handler(Looper.getMainLooper()));
    }

    public fn2(e9 e9Var, in2 in2Var, Handler handler) {
        this.f149185a = e9Var;
        this.f149186b = in2Var;
        this.f149187c = handler;
    }
}
