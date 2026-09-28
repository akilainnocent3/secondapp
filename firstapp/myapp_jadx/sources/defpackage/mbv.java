package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class mbv {
    public final MaterialButton a;
    public rx80 b;
    public exd0 c;
    public dkd0 d;
    public fcv.d e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public PorterDuff.Mode l;
    public ColorStateList m;
    public ColorStateList n;
    public ColorStateList o;
    public fcv p;
    public boolean t;
    public RippleDrawable v;
    public int w;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean u = true;

    public mbv(MaterialButton materialButton, rx80 rx80Var) {
        this.a = materialButton;
        this.b = rx80Var;
    }

    public final fcv a(boolean z) {
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (fcv) ((LayerDrawable) ((InsetDrawable) this.v.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b(int i, int i2) {
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.h;
        int i4 = this.i;
        this.i = i2;
        this.h = i;
        if (!this.r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void c() {
        fcv fcvVar = new fcv(this.b);
        exd0 exd0Var = this.c;
        if (exd0Var != null) {
            fcvVar.x(exd0Var);
        }
        dkd0 dkd0Var = this.d;
        if (dkd0Var != null) {
            fcvVar.q(dkd0Var);
        }
        fcv.d dVar = this.e;
        if (dVar != null) {
            fcvVar.T = dVar;
        }
        MaterialButton materialButton = this.a;
        fcvVar.o(materialButton.getContext());
        fcvVar.setTintList(this.m);
        PorterDuff.Mode mode = this.l;
        if (mode != null) {
            fcvVar.setTintMode(mode);
        }
        float f = this.k;
        ColorStateList colorStateList = this.n;
        fcvVar.z(f);
        fcvVar.y(colorStateList);
        fcv fcvVar2 = new fcv(this.b);
        exd0 exd0Var2 = this.c;
        if (exd0Var2 != null) {
            fcvVar2.x(exd0Var2);
        }
        dkd0 dkd0Var2 = this.d;
        if (dkd0Var2 != null) {
            fcvVar2.q(dkd0Var2);
        }
        fcvVar2.setTint(0);
        float f2 = this.k;
        int iB = this.q ? vbv.b(R.attr.colorSurface, materialButton) : 0;
        fcvVar2.z(f2);
        fcvVar2.y(ColorStateList.valueOf(iB));
        fcv fcvVar3 = new fcv(this.b);
        this.p = fcvVar3;
        exd0 exd0Var3 = this.c;
        if (exd0Var3 != null) {
            fcvVar3.x(exd0Var3);
        }
        dkd0 dkd0Var3 = this.d;
        if (dkd0Var3 != null) {
            this.p.q(dkd0Var3);
        }
        this.p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(yt50.c(this.o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{fcvVar2, fcvVar}), this.f, this.h, this.g, this.i), this.p);
        this.v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        fcv fcvVarA = a(false);
        if (fcvVarA != null) {
            fcvVarA.r(this.w);
            fcvVarA.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        qy80 qy80Var;
        fcv fcvVarA = a(false);
        if (fcvVarA != null) {
            exd0 exd0Var = this.c;
            if (exd0Var != null) {
                fcvVarA.x(exd0Var);
            } else {
                fcvVarA.setShapeAppearanceModel(this.b);
            }
            dkd0 dkd0Var = this.d;
            if (dkd0Var != null) {
                fcvVarA.q(dkd0Var);
            }
        }
        fcv fcvVarA2 = a(true);
        if (fcvVarA2 != null) {
            exd0 exd0Var2 = this.c;
            if (exd0Var2 != null) {
                fcvVarA2.x(exd0Var2);
            } else {
                fcvVarA2.setShapeAppearanceModel(this.b);
            }
            dkd0 dkd0Var2 = this.d;
            if (dkd0Var2 != null) {
                fcvVarA2.q(dkd0Var2);
            }
        }
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            qy80Var = null;
        } else {
            int numberOfLayers = this.v.getNumberOfLayers();
            RippleDrawable rippleDrawable2 = this.v;
            qy80Var = numberOfLayers > 2 ? (qy80) rippleDrawable2.getDrawable(2) : (qy80) rippleDrawable2.getDrawable(1);
        }
        if (qy80Var != null) {
            qy80Var.setShapeAppearanceModel(this.b);
            if (qy80Var instanceof fcv) {
                fcv fcvVar = (fcv) qy80Var;
                exd0 exd0Var3 = this.c;
                if (exd0Var3 != null) {
                    fcvVar.x(exd0Var3);
                }
                dkd0 dkd0Var3 = this.d;
                if (dkd0Var3 != null) {
                    fcvVar.q(dkd0Var3);
                }
            }
        }
    }

    public final void e() {
        fcv fcvVarA = a(false);
        fcv fcvVarA2 = a(true);
        if (fcvVarA != null) {
            float f = this.k;
            ColorStateList colorStateList = this.n;
            fcvVarA.z(f);
            fcvVarA.y(colorStateList);
            if (fcvVarA2 != null) {
                float f2 = this.k;
                int iB = this.q ? vbv.b(R.attr.colorSurface, this.a) : 0;
                fcvVarA2.z(f2);
                fcvVarA2.y(ColorStateList.valueOf(iB));
            }
        }
    }
}
