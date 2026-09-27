package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class l61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m61 f151873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f151874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ul3 f151875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oc1 f151876d;

    public l61(m61 m61Var, Handler handler, ul3 ul3Var, oc1 oc1Var) {
        this.f151873a = m61Var;
        this.f151874b = handler;
        this.f151875c = ul3Var;
        this.f151876d = oc1Var;
    }

    public /* synthetic */ l61(j52 j52Var, List list) {
        this(new m61(), new Handler(Looper.getMainLooper()), new ul3(), pc1.a(j52Var, list));
    }
}
