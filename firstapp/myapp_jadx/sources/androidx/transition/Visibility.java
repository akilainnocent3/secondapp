package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.sportybet.android.gp.tz.R;
import defpackage.bug0;
import defpackage.g9h0;
import defpackage.hai0;
import defpackage.hb5;
import defpackage.u7i0;
import defpackage.xbe0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Visibility extends Transition {
    public static final String[] X = {"android:visibility:visibility", "android:visibility:parent"};
    public int W;

    public static class c {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xbe0.c);
        int iD = g9h0.d(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iD != 0) {
            T(iD);
        }
    }

    public static void P(bug0 bug0Var) {
        View view = bug0Var.b;
        int visibility = view.getVisibility();
        HashMap map = bug0Var.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static c Q(bug0 bug0Var, bug0 bug0Var2) {
        c cVar = new c();
        cVar.a = false;
        cVar.b = false;
        if (bug0Var != null) {
            HashMap map = bug0Var.a;
            if (map.containsKey("android:visibility:visibility")) {
                cVar.c = ((Integer) map.get("android:visibility:visibility")).intValue();
                cVar.e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                cVar.c = -1;
                cVar.e = null;
            }
        } else {
            cVar.c = -1;
            cVar.e = null;
        }
        if (bug0Var2 != null) {
            HashMap map2 = bug0Var2.a;
            if (map2.containsKey("android:visibility:visibility")) {
                cVar.d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                cVar.f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                cVar.d = -1;
                cVar.f = null;
            }
        } else {
            cVar.d = -1;
            cVar.f = null;
        }
        if (bug0Var != null && bug0Var2 != null) {
            int i = cVar.c;
            int i2 = cVar.d;
            if (i != i2 || cVar.e != cVar.f) {
                if (i != i2) {
                    if (i == 0) {
                        cVar.b = false;
                        cVar.a = true;
                        return cVar;
                    }
                    if (i2 == 0) {
                        cVar.b = true;
                        cVar.a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f == null) {
                        cVar.b = false;
                        cVar.a = true;
                        return cVar;
                    }
                    if (cVar.e == null) {
                        cVar.b = true;
                        cVar.a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (bug0Var == null && cVar.d == 0) {
                cVar.b = true;
                cVar.a = true;
                return cVar;
            }
            if (bug0Var2 == null && cVar.c == 0) {
                cVar.b = false;
                cVar.a = true;
            }
        }
        return cVar;
    }

    public Animator R(ViewGroup viewGroup, View view, bug0 bug0Var, bug0 bug0Var2) {
        return null;
    }

    public Animator S(ViewGroup viewGroup, View view, bug0 bug0Var, bug0 bug0Var2) {
        return null;
    }

    public final void T(int i) {
        if ((i & (-4)) == 0) {
            this.W = i;
        } else {
            hb5.a("Only MODE_IN and MODE_OUT flags are allowed");
        }
    }

    @Override // androidx.transition.Transition
    public void d(bug0 bug0Var) {
        P(bug0Var);
    }

    @Override // androidx.transition.Transition
    public void g(bug0 bug0Var) {
        P(bug0Var);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:58:0x0126  */
    /* JADX WARN: Code duplicated, block: B:61:0x012f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0135  */
    /* JADX WARN: Code duplicated, block: B:65:0x013d  */
    /* JADX WARN: Code duplicated, block: B:66:0x015a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0176 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x01da  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x020b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (Q(p(r5, false), t(r5, false)).a != false) goto L9;
     */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator k(android.view.ViewGroup r24, defpackage.bug0 r25, defpackage.bug0 r26) {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.k(android.view.ViewGroup, bug0, bug0):android.animation.Animator");
    }

    @Override // androidx.transition.Transition
    public final String[] s() {
        return X;
    }

    @Override // androidx.transition.Transition
    public final boolean w(bug0 bug0Var, bug0 bug0Var2) {
        if (bug0Var == null && bug0Var2 == null) {
            return false;
        }
        if (bug0Var != null && bug0Var2 != null && bug0Var2.a.containsKey("android:visibility:visibility") != bug0Var.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarQ = Q(bug0Var, bug0Var2);
        if (cVarQ.a) {
            return cVarQ.c == 0 || cVarQ.d == 0;
        }
        return false;
    }

    public class b extends AnimatorListenerAdapter implements Transition.f {
        public final ViewGroup a;
        public final View b;
        public final View c;
        public boolean d = true;

        public b(ViewGroup viewGroup, View view, View view2) {
            this.a = viewGroup;
            this.b = view;
            this.c = view2;
        }

        public final void b() {
            this.c.setTag(R.id.save_overlay_view, null);
            this.a.getOverlay().remove(this.b);
            this.d = false;
        }

        @Override // androidx.transition.Transition.f
        public final void g(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public final void j(Transition transition) {
            transition.B(this);
        }

        @Override // androidx.transition.Transition.f
        public final void k(Transition transition) {
            if (this.d) {
                b();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            this.a.getOverlay().remove(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            View view = this.b;
            if (view.getParent() == null) {
                this.a.getOverlay().add(view);
            } else {
                Visibility.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                View view = this.c;
                View view2 = this.b;
                view.setTag(R.id.save_overlay_view, view2);
                this.a.getOverlay().add(view2);
                this.d = true;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            b();
        }

        @Override // androidx.transition.Transition.f
        public final void a() {
        }

        @Override // androidx.transition.Transition.f
        public final void f() {
        }
    }

    public static class a extends AnimatorListenerAdapter implements Transition.f {
        public final View a;
        public final int b;
        public final ViewGroup c;
        public boolean e;
        public boolean f = false;
        public final boolean d = true;

        public a(int i, View view) {
            this.a = view;
            this.b = i;
            this.c = (ViewGroup) view.getParent();
            b(true);
        }

        @Override // androidx.transition.Transition.f
        public final void a() {
            b(false);
            if (this.f) {
                return;
            }
            hai0.c(this.a, this.b);
        }

        public final void b(boolean z) {
            ViewGroup viewGroup;
            if (!this.d || this.e == z || (viewGroup = this.c) == null) {
                return;
            }
            this.e = z;
            u7i0.a(viewGroup, z);
        }

        @Override // androidx.transition.Transition.f
        public final void f() {
            b(true);
            if (this.f) {
                return;
            }
            hai0.c(this.a, 0);
        }

        @Override // androidx.transition.Transition.f
        public final void g(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public final void j(Transition transition) {
            transition.B(this);
        }

        @Override // androidx.transition.Transition.f
        public final void k(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            if (!this.f) {
                hai0.c(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            b(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                hai0.c(this.a, 0);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f) {
                hai0.c(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            b(false);
        }
    }

    public Visibility() {
        this.W = 3;
    }
}
