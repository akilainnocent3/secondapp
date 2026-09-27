package yads;

import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mw3 implements xv3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f152710b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gw3 f152711c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f152709a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public final void a() {
        gw3 gw3Var = (gw3) this.f152710b.poll();
        this.f152711c = gw3Var;
        if (gw3Var != null) {
            gw3Var.a(this.f152709a);
        }
    }

    public final void a(gw3 gw3Var) {
        gw3Var.f149809a = this;
        this.f152710b.add(gw3Var);
        if (this.f152711c == null) {
            a();
        }
    }
}
