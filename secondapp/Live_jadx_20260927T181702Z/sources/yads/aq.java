package yads;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wp f146889a;

    public aq(wp wpVar) {
        this.f146889a = wpVar;
    }

    public final void a() {
        gq0 gq0Var;
        wp wpVar = this.f146889a;
        if (wpVar != null) {
            ViewGroup viewGroup = (ViewGroup) wpVar.f157463c.get();
            if (viewGroup != null && (gq0Var = wpVar.f157465e) != null) {
                viewGroup.removeView(gq0Var);
            }
            wpVar.f157465e = null;
            n00 n00Var = wpVar.f157462b;
            n00Var.f152796b.f151451b = null;
            n00Var.c();
            n00Var.invalidateAdPlayer();
            n00Var.a();
        }
    }
}
