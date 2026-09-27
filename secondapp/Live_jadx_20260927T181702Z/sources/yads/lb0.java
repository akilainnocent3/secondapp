package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public class lb0 implements pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hk3 f151914a;

    public lb0(hk3 hk3Var) {
        this.f151914a = hk3Var;
    }

    @Override // yads.pi
    public final void a() {
        View viewB = this.f151914a.b();
        if (viewB == null) {
            return;
        }
        this.f151914a.a(viewB);
    }

    @Override // yads.pi
    public final boolean b() {
        return this.f151914a.b() != null;
    }

    @Override // yads.pi
    public final zk3 c() {
        View viewB = this.f151914a.b();
        if (viewB != null) {
            return new zk3(viewB.getWidth(), viewB.getHeight());
        }
        return null;
    }

    @Override // yads.pi
    public final boolean d() {
        return kl3.a(this.f151914a.b()) >= 100;
    }

    @Override // yads.pi
    public final boolean e() {
        return this.f151914a.c();
    }

    @Override // yads.pi
    public final void a(oi oiVar, kk3 kk3Var) {
        this.f151914a.a(oiVar, kk3Var, oiVar.f153503c);
    }

    public void b(Object obj) {
        c(obj);
    }

    @Override // yads.pi
    public final void c(Object obj) {
        View viewB = this.f151914a.b();
        if (viewB == null) {
            return;
        }
        this.f151914a.b(viewB, obj);
        viewB.setVisibility(0);
    }

    @Override // yads.pi
    public final boolean a(Object obj) {
        View viewB = this.f151914a.b();
        return viewB != null && this.f151914a.a(viewB, obj);
    }

    @Override // yads.pi
    public final void destroy() {
    }
}
