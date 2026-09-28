package androidx.transition;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import defpackage.bug0;
import defpackage.g9h0;
import defpackage.hb5;
import defpackage.rh90;
import defpackage.xbe0;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class Slide extends Visibility {
    public static final DecelerateInterpolator Z = new DecelerateInterpolator();
    public static final AccelerateInterpolator a0 = new AccelerateInterpolator();
    public static final a b0 = new a();
    public static final b c0 = new b();
    public static final c d0 = new c();
    public static final d e0 = new d();
    public static final e f0 = new e();
    public static final f g0 = new f();
    public g Y;

    public class a extends h {
        @Override // androidx.transition.Slide.g
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    public class b extends h {
        @Override // androidx.transition.Slide.g
        public final float a(View view, ViewGroup viewGroup) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    public class c extends i {
        @Override // androidx.transition.Slide.g
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    public class d extends h {
        @Override // androidx.transition.Slide.g
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    public class e extends h {
        @Override // androidx.transition.Slide.g
        public final float a(View view, ViewGroup viewGroup) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    public class f extends i {
        @Override // androidx.transition.Slide.g
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    public interface g {
        float a(View view, ViewGroup viewGroup);

        float b(View view, ViewGroup viewGroup);
    }

    public static abstract class h implements g {
        @Override // androidx.transition.Slide.g
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY();
        }
    }

    public static abstract class i implements g {
        @Override // androidx.transition.Slide.g
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX();
        }
    }

    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y = g0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xbe0.f);
        int iD = g9h0.d(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        U(iD);
    }

    @Override // androidx.transition.Visibility
    public final Animator R(ViewGroup viewGroup, View view, bug0 bug0Var, bug0 bug0Var2) {
        if (bug0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) bug0Var2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return androidx.transition.g.a(view, bug0Var2, iArr[0], iArr[1], this.Y.a(view, viewGroup), this.Y.b(view, viewGroup), translationX, translationY, Z, this);
    }

    @Override // androidx.transition.Visibility
    public final Animator S(ViewGroup viewGroup, View view, bug0 bug0Var, bug0 bug0Var2) {
        if (bug0Var == null) {
            return null;
        }
        int[] iArr = (int[]) bug0Var.a.get("android:slide:screenPosition");
        return androidx.transition.g.a(view, bug0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.Y.a(view, viewGroup), this.Y.b(view, viewGroup), a0, this);
    }

    public final void U(int i2) {
        if (i2 == 3) {
            this.Y = b0;
        } else if (i2 == 5) {
            this.Y = e0;
        } else if (i2 == 48) {
            this.Y = d0;
        } else if (i2 == 80) {
            this.Y = g0;
        } else if (i2 == 8388611) {
            this.Y = c0;
        } else {
            if (i2 != 8388613) {
                hb5.a("Invalid slide direction");
                return;
            }
            this.Y = f0;
        }
        rh90 rh90Var = new rh90();
        rh90Var.b = i2;
        this.M = rh90Var;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void d(bug0 bug0Var) {
        Visibility.P(bug0Var);
        int[] iArr = new int[2];
        bug0Var.b.getLocationOnScreen(iArr);
        bug0Var.a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void g(bug0 bug0Var) {
        Visibility.P(bug0Var);
        int[] iArr = new int[2];
        bug0Var.b.getLocationOnScreen(iArr);
        bug0Var.a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Transition
    public final boolean v() {
        return true;
    }

    public Slide() {
        this.Y = g0;
        U(80);
    }
}
