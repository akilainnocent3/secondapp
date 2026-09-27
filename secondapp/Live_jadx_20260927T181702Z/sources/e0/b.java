package e0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.annotation.Nullable;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(21)
public class b implements e {
    @Override // e0.e
    public void a(d dVar, float f10) {
        dVar.g().setElevation(f10);
    }

    @Override // e0.e
    public void b(d dVar) {
        if (!dVar.b()) {
            dVar.a(0, 0, 0, 0);
            return;
        }
        float fN = n(dVar);
        float fI = i(dVar);
        int iCeil = (int) Math.ceil(g.c(fN, fI, dVar.f()));
        int iCeil2 = (int) Math.ceil(g.d(fN, fI, dVar.f()));
        dVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // e0.e
    public void c(d dVar, float f10) {
        p(dVar).h(f10);
    }

    @Override // e0.e
    public float d(d dVar) {
        return i(dVar) * 2.0f;
    }

    @Override // e0.e
    public void e(d dVar) {
        f(dVar, n(dVar));
    }

    @Override // e0.e
    public void f(d dVar, float f10) {
        p(dVar).g(f10, dVar.b(), dVar.f());
        b(dVar);
    }

    @Override // e0.e
    public void g(d dVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        dVar.d(new f(colorStateList, f10));
        View viewG = dVar.g();
        viewG.setClipToOutline(true);
        viewG.setElevation(f11);
        f(dVar, f12);
    }

    @Override // e0.e
    public ColorStateList h(d dVar) {
        return p(dVar).b();
    }

    @Override // e0.e
    public float i(d dVar) {
        return p(dVar).d();
    }

    @Override // e0.e
    public float k(d dVar) {
        return dVar.g().getElevation();
    }

    @Override // e0.e
    public float l(d dVar) {
        return i(dVar) * 2.0f;
    }

    @Override // e0.e
    public void m(d dVar) {
        f(dVar, n(dVar));
    }

    @Override // e0.e
    public float n(d dVar) {
        return p(dVar).c();
    }

    @Override // e0.e
    public void o(d dVar, @Nullable ColorStateList colorStateList) {
        p(dVar).f(colorStateList);
    }

    public final f p(d dVar) {
        return (f) dVar.e();
    }

    @Override // e0.e
    public void j() {
    }
}
