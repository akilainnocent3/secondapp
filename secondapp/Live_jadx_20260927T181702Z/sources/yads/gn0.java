package yads;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gn0 implements bq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final en0 f149694a;

    public gn0(Handler handler) {
        this.f149694a = new en0(handler);
    }

    public final void a(po2 po2Var, vp2 vp2Var, sr srVar) {
        synchronized (po2Var.f154023f) {
            po2Var.f154029l = true;
        }
        po2Var.a("post-response");
        en0 en0Var = this.f149694a;
        en0Var.f148774a.post(new fn0(po2Var, vp2Var, srVar));
    }
}
