package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gq0 {
    public final View a;
    public dyf0 d;
    public dyf0 e;
    public dyf0 f;
    public int c = -1;
    public final zq0 b = zq0.a();

    public gq0(View view) {
        this.a = view;
    }

    public final void a() {
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                dyf0 dyf0Var = this.f;
                if (dyf0Var == null) {
                    dyf0Var = new dyf0();
                    this.f = dyf0Var;
                }
                dyf0Var.a = null;
                dyf0Var.d = false;
                dyf0Var.b = null;
                dyf0Var.c = false;
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                ColorStateList colorStateListC = r6i0.d.c(view);
                if (colorStateListC != null) {
                    dyf0Var.d = true;
                    dyf0Var.a = colorStateListC;
                }
                PorterDuff.Mode modeD = r6i0.d.d(view);
                if (modeD != null) {
                    dyf0Var.c = true;
                    dyf0Var.b = modeD;
                }
                if (dyf0Var.d || dyf0Var.c) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = zq0.b;
                    jh50.h(background, dyf0Var, drawableState);
                    return;
                }
            }
            dyf0 dyf0Var2 = this.e;
            if (dyf0Var2 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = zq0.b;
                jh50.h(background, dyf0Var2, drawableState2);
            } else {
                dyf0 dyf0Var3 = this.d;
                if (dyf0Var3 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    PorterDuff.Mode mode3 = zq0.b;
                    jh50.h(background, dyf0Var3, drawableState3);
                }
            }
        }
    }

    public final ColorStateList b() {
        dyf0 dyf0Var = this.e;
        if (dyf0Var != null) {
            return dyf0Var.a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        dyf0 dyf0Var = this.e;
        if (dyf0Var != null) {
            return dyf0Var.b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListF;
        View view = this.a;
        Context context = view.getContext();
        int[] iArr = dl30.C;
        fyf0 fyf0VarF = fyf0.f(context, attributeSet, iArr, i);
        TypedArray typedArray = fyf0VarF.b;
        View view2 = this.a;
        r6i0.o(view2, view2.getContext(), iArr, attributeSet, fyf0VarF.b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.c = typedArray.getResourceId(0, -1);
                zq0 zq0Var = this.b;
                Context context2 = view.getContext();
                int i2 = this.c;
                synchronized (zq0Var) {
                    colorStateListF = zq0Var.a.f(context2, i2);
                }
                if (colorStateListF != null) {
                    g(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                r6i0.d.j(view, fyf0VarF.a(1));
            }
            if (typedArray.hasValue(2)) {
                r6i0.d.k(view, sdf.c(typedArray.getInt(2, -1), null));
            }
            fyf0VarF.g();
        } catch (Throwable th) {
            fyf0VarF.g();
            throw th;
        }
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateListF;
        this.c = i;
        zq0 zq0Var = this.b;
        if (zq0Var != null) {
            Context context = this.a.getContext();
            synchronized (zq0Var) {
                colorStateListF = zq0Var.a.f(context, i);
            }
        } else {
            colorStateListF = null;
        }
        g(colorStateListF);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            dyf0 dyf0Var = this.d;
            if (dyf0Var == null) {
                dyf0Var = new dyf0();
                this.d = dyf0Var;
            }
            dyf0Var.a = colorStateList;
            dyf0Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        dyf0 dyf0Var = this.e;
        if (dyf0Var == null) {
            dyf0Var = new dyf0();
            this.e = dyf0Var;
        }
        dyf0Var.a = colorStateList;
        dyf0Var.d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        dyf0 dyf0Var = this.e;
        if (dyf0Var == null) {
            dyf0Var = new dyf0();
            this.e = dyf0Var;
        }
        dyf0Var.b = mode;
        dyf0Var.c = true;
        a();
    }
}
