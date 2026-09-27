package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class hk3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ns.o[] f150175b = {wb.a(hk3.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f150176a;

    public hk3(View view) {
        this.f150176a = mm2.a(view);
    }

    public void a() {
    }

    public abstract boolean a(View view, Object obj);

    public final View b() {
        lm2 lm2Var = this.f150176a;
        ns.o oVar = f150175b[0];
        return (View) lm2Var.f152056a.get();
    }

    public abstract void b(View view, Object obj);

    public final boolean c() {
        View viewB = b();
        return viewB != null && !kl3.b(viewB) && viewB.getWidth() >= 1 && viewB.getHeight() >= 1;
    }

    public void a(View view) {
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    public void a(oi oiVar, kk3 kk3Var, Object obj) {
        View viewB = b();
        if (viewB == null) {
            return;
        }
        kk3Var.a(viewB, oiVar);
        kk3Var.a(oiVar, new jk3(viewB));
    }
}
