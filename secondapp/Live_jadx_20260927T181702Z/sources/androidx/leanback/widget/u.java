package androidx.leanback.widget;

import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY})
public class u extends v3.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f13050d;

    public u(Context context, t tVar, Drawable drawable, s1 s1Var) {
        o(context, tVar, drawable, new ColorDrawable(), s1Var);
    }

    public static int m(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(s3.a.c.f128491y, typedValue, true) ? context.getResources().getColor(typedValue.resourceId) : context.getResources().getColor(s3.a.d.f128511m);
    }

    public void j(Context context, t tVar, s1 s1Var) {
        q1.c cVarT = tVar.t();
        q1.c cVarS = tVar.s();
        tVar.a(cVarT.b(context.getResources().getDimensionPixelSize(s3.a.e.L0)), cVarT.b(context.getResources().getDimensionPixelSize(s3.a.e.M0))).l(s1Var);
        tVar.a(cVarS.d(), cVarS.e()).n(b(1), v3.e.a.f139963e);
        tVar.a(cVarT.d(), cVarT.e()).n(b(0), v3.e.a.f139964f);
    }

    public Drawable k() {
        return this.f13050d;
    }

    public Drawable l() {
        return b(0).b();
    }

    @k.k
    public int n() {
        return ((ColorDrawable) this.f13050d).getColor();
    }

    public void o(Context context, t tVar, Drawable drawable, Drawable drawable2, s1 s1Var) {
        if (drawable2 instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) drawable2;
            if (colorDrawable.getColor() == 0) {
                colorDrawable.setColor(m(context));
            }
        }
        a(drawable);
        this.f13050d = drawable2;
        a(drawable2);
        j(context, tVar, s1Var);
    }

    public void p(@k.k int i10) {
        ((ColorDrawable) this.f13050d).setColor(i10);
    }

    public u(Context context, t tVar, Drawable drawable, Drawable drawable2, s1 s1Var) {
        o(context, tVar, drawable, drawable2, s1Var);
    }

    public u(Context context, t tVar) {
        int i10 = -context.getResources().getDimensionPixelSize(s3.a.e.f128551f0);
        v3.f fVar = new v3.f();
        o(context, tVar, fVar, new ColorDrawable(), new s1.b(fVar, PropertyValuesHolder.ofInt("verticalOffset", 0, i10)));
    }
}
