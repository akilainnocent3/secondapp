package yads;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vp f158984a;

    public zp(vp vpVar) {
        this.f158984a = vpVar;
    }

    public final void a() {
        gq0 gq0Var;
        vp vpVar = this.f158984a;
        if (vpVar != null) {
            ViewGroup viewGroup = (ViewGroup) vpVar.f157040c.get();
            if (viewGroup != null && (gq0Var = vpVar.f157042e) != null) {
                viewGroup.removeView(gq0Var);
            }
            vpVar.f157042e = null;
            n00 n00Var = vpVar.f157039b;
            n00Var.f152796b.f151451b = null;
            n00Var.c();
            n00Var.invalidateAdPlayer();
            n00Var.a();
        }
    }
}
