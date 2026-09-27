package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class eu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lu2 f148837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f148838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nv.j0 f148839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jv.s0 f148840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public as0 f148841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nv.z0 f148842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f148843g = new AtomicInteger(-1);

    public eu0(iu3 iu3Var, d4 d4Var, nv.j0 j0Var, ws0 ws0Var, jv.s0 s0Var) {
        this.f148837a = iu3Var;
        this.f148838b = d4Var;
        this.f148839c = j0Var;
        this.f148840d = s0Var;
        this.f148842f = ws0Var.a();
        b();
    }

    public final lu2 a() {
        return this.f148837a;
    }

    public final void b() {
        jv.k.f(this.f148840d, null, null, new bu0(this, null), 3, null);
    }

    public final void c() {
        if (((xt0) this.f148842f.getValue()).f157985b.isEmpty() && this.f148843g.get() == -1 && !(((xt0) this.f148842f.getValue()).f157984a instanceof mt0)) {
            this.f148843g.getAndIncrement();
            jv.k.f(this.f148840d, null, null, new du0(this, null), 3, null);
            return;
        }
        l4 l4Var = h9.f149993p;
        as0 as0Var = this.f148841e;
        if (as0Var != null) {
            new CallbackStackTraceMarker(new yr0(as0Var, new AdRequestError(l4Var.f151857a, l4Var.f151859c, l4Var.f151860d)));
        }
    }
}
