package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j32 implements c6w {
    public final Context a;
    public final ExtendedFloatingActionButton b;
    public final ArrayList<Animator.AnimatorListener> c = new ArrayList<>();
    public final mk0 d;
    public b6w e;
    public b6w f;

    public class a extends Property<ExtendedFloatingActionButton, Float> {
        public a() {
            super(Float.class, "LABEL_OPACITY_PROPERTY");
        }

        @Override // android.util.Property
        public final Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
            return Float.valueOf(dj0.a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton2.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton2.n0.getColorForState(extendedFloatingActionButton2.getDrawableState(), j32.this.b.n0.getDefaultColor()))));
        }

        @Override // android.util.Property
        public final void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
            ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
            Float f2 = f;
            int colorForState = extendedFloatingActionButton2.n0.getColorForState(extendedFloatingActionButton2.getDrawableState(), j32.this.b.n0.getDefaultColor());
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (dj0.a(0.0f, Color.alpha(colorForState) / 255.0f, f2.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f2.floatValue() == 1.0f) {
                extendedFloatingActionButton2.l(extendedFloatingActionButton2.n0);
            } else {
                extendedFloatingActionButton2.l(colorStateListValueOf);
            }
        }
    }

    public j32(ExtendedFloatingActionButton extendedFloatingActionButton, mk0 mk0Var) {
        this.b = extendedFloatingActionButton;
        this.a = extendedFloatingActionButton.getContext();
        this.d = mk0Var;
    }

    @Override // defpackage.c6w
    public void b() {
        this.d.a = null;
    }

    @Override // defpackage.c6w
    public AnimatorSet f() {
        b6w b6wVarB = this.f;
        if (b6wVarB == null) {
            b6wVarB = this.e;
            if (b6wVarB == null) {
                b6wVarB = b6w.b(this.a, e());
                this.e = b6wVarB;
            }
            b6wVarB.getClass();
        }
        return g(b6wVarB);
    }

    public final AnimatorSet g(b6w b6wVar) {
        ArrayList arrayList = new ArrayList();
        boolean zG = b6wVar.g("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        if (zG) {
            arrayList.add(b6wVar.d("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (b6wVar.g("scale")) {
            arrayList.add(b6wVar.d("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(b6wVar.d("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (b6wVar.g("width")) {
            arrayList.add(b6wVar.d("width", extendedFloatingActionButton, ExtendedFloatingActionButton.q0));
        }
        if (b6wVar.g("height")) {
            arrayList.add(b6wVar.d("height", extendedFloatingActionButton, ExtendedFloatingActionButton.r0));
        }
        if (b6wVar.g("paddingStart")) {
            arrayList.add(b6wVar.d("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.s0));
        }
        if (b6wVar.g("paddingEnd")) {
            arrayList.add(b6wVar.d("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.t0));
        }
        if (b6wVar.g("labelOpacity")) {
            arrayList.add(b6wVar.d("labelOpacity", extendedFloatingActionButton, new a()));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        lk0.a(animatorSet, arrayList);
        return animatorSet;
    }
}
