package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q1 extends g0 {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private int mMode;
    static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends AnimatorListenerAdapter implements g0.j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f19637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19638c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ViewGroup f19639d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f19640e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f19641f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f19642g = false;

        public a(View view, int i10, boolean z10) {
            this.f19637b = view;
            this.f19638c = i10;
            this.f19639d = (ViewGroup) view.getParent();
            this.f19640e = z10;
            b(true);
        }

        public final void a() {
            if (!this.f19642g) {
                d1.g(this.f19637b, this.f19638c);
                ViewGroup viewGroup = this.f19639d;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            b(false);
        }

        public final void b(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f19640e || this.f19641f == z10 || (viewGroup = this.f19639d) == null) {
                return;
            }
            this.f19641f = z10;
            c1.c(viewGroup, z10);
        }

        @Override // androidx.transition.g0.j
        public /* synthetic */ void k(g0 g0Var, boolean z10) {
            k0.a(this, g0Var, z10);
        }

        @Override // androidx.transition.g0.j
        public /* synthetic */ void m(g0 g0Var, boolean z10) {
            k0.b(this, g0Var, z10);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f19642g = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.g0.j
        public void onTransitionEnd(@NonNull g0 g0Var) {
            g0Var.removeListener(this);
        }

        @Override // androidx.transition.g0.j
        public void onTransitionPause(@NonNull g0 g0Var) {
            b(false);
            if (this.f19642g) {
                return;
            }
            d1.g(this.f19637b, this.f19638c);
        }

        @Override // androidx.transition.g0.j
        public void onTransitionResume(@NonNull g0 g0Var) {
            b(true);
            if (this.f19642g) {
                return;
            }
            d1.g(this.f19637b, 0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z10) {
            if (z10) {
                d1.g(this.f19637b, 0);
                ViewGroup viewGroup = this.f19639d;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // androidx.transition.g0.j
        public void onTransitionCancel(@NonNull g0 g0Var) {
        }

        @Override // androidx.transition.g0.j
        public void onTransitionStart(@NonNull g0 g0Var) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public @interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends AnimatorListenerAdapter implements g0.j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ViewGroup f19643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f19644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final View f19645d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f19646e = true;

        public c(ViewGroup viewGroup, View view, View view2) {
            this.f19643b = viewGroup;
            this.f19644c = view;
            this.f19645d = view2;
        }

        public final void a() {
            this.f19645d.setTag(a0.a.f19389e, null);
            this.f19643b.getOverlay().remove(this.f19644c);
            this.f19646e = false;
        }

        @Override // androidx.transition.g0.j
        public /* synthetic */ void k(g0 g0Var, boolean z10) {
            k0.a(this, g0Var, z10);
        }

        @Override // androidx.transition.g0.j
        public /* synthetic */ void m(g0 g0Var, boolean z10) {
            k0.b(this, g0Var, z10);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f19643b.getOverlay().remove(this.f19644c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f19644c.getParent() == null) {
                this.f19643b.getOverlay().add(this.f19644c);
            } else {
                q1.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z10) {
            if (z10) {
                this.f19645d.setTag(a0.a.f19389e, this.f19644c);
                this.f19643b.getOverlay().add(this.f19644c);
                this.f19646e = true;
            }
        }

        @Override // androidx.transition.g0.j
        public void onTransitionCancel(@NonNull g0 g0Var) {
            if (this.f19646e) {
                a();
            }
        }

        @Override // androidx.transition.g0.j
        public void onTransitionEnd(@NonNull g0 g0Var) {
            g0Var.removeListener(this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            a();
        }

        @Override // androidx.transition.g0.j
        public void onTransitionPause(@NonNull g0 g0Var) {
        }

        @Override // androidx.transition.g0.j
        public void onTransitionResume(@NonNull g0 g0Var) {
        }

        @Override // androidx.transition.g0.j
        public void onTransitionStart(@NonNull g0 g0Var) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f19648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f19649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19651d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ViewGroup f19652e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ViewGroup f19653f;
    }

    public q1() {
        this.mMode = 3;
    }

    private void u(y0 y0Var) {
        y0Var.f19710a.put(PROPNAME_VISIBILITY, Integer.valueOf(y0Var.f19711b.getVisibility()));
        y0Var.f19710a.put(PROPNAME_PARENT, y0Var.f19711b.getParent());
        int[] iArr = new int[2];
        y0Var.f19711b.getLocationOnScreen(iArr);
        y0Var.f19710a.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    @Override // androidx.transition.g0
    public void captureEndValues(@NonNull y0 y0Var) {
        u(y0Var);
    }

    @Override // androidx.transition.g0
    public void captureStartValues(@NonNull y0 y0Var) {
        u(y0Var);
    }

    @Override // androidx.transition.g0
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable y0 y0Var, @Nullable y0 y0Var2) {
        d dVarV = v(y0Var, y0Var2);
        if (!dVarV.f19648a) {
            return null;
        }
        if (dVarV.f19652e == null && dVarV.f19653f == null) {
            return null;
        }
        return dVarV.f19649b ? onAppear(viewGroup, y0Var, dVarV.f19650c, y0Var2, dVarV.f19651d) : onDisappear(viewGroup, y0Var, dVarV.f19650c, y0Var2, dVarV.f19651d);
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // androidx.transition.g0
    @Nullable
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.g0
    public boolean isTransitionRequired(@Nullable y0 y0Var, @Nullable y0 y0Var2) {
        if (y0Var == null && y0Var2 == null) {
            return false;
        }
        if (y0Var != null && y0Var2 != null && y0Var2.f19710a.containsKey(PROPNAME_VISIBILITY) != y0Var.f19710a.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        d dVarV = v(y0Var, y0Var2);
        return dVarV.f19648a && (dVarV.f19650c == 0 || dVarV.f19651d == 0);
    }

    public boolean isVisible(@Nullable y0 y0Var) {
        if (y0Var == null) {
            return false;
        }
        return ((Integer) y0Var.f19710a.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) y0Var.f19710a.get(PROPNAME_PARENT)) != null;
    }

    @Nullable
    public Animator onAppear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable y0 y0Var, @Nullable y0 y0Var2) {
        return null;
    }

    @Nullable
    public Animator onDisappear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable y0 y0Var, @Nullable y0 y0Var2) {
        return null;
    }

    public void setMode(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i10;
    }

    public final d v(y0 y0Var, y0 y0Var2) {
        d dVar = new d();
        dVar.f19648a = false;
        dVar.f19649b = false;
        if (y0Var == null || !y0Var.f19710a.containsKey(PROPNAME_VISIBILITY)) {
            dVar.f19650c = -1;
            dVar.f19652e = null;
        } else {
            dVar.f19650c = ((Integer) y0Var.f19710a.get(PROPNAME_VISIBILITY)).intValue();
            dVar.f19652e = (ViewGroup) y0Var.f19710a.get(PROPNAME_PARENT);
        }
        if (y0Var2 == null || !y0Var2.f19710a.containsKey(PROPNAME_VISIBILITY)) {
            dVar.f19651d = -1;
            dVar.f19653f = null;
        } else {
            dVar.f19651d = ((Integer) y0Var2.f19710a.get(PROPNAME_VISIBILITY)).intValue();
            dVar.f19653f = (ViewGroup) y0Var2.f19710a.get(PROPNAME_PARENT);
        }
        if (y0Var != null && y0Var2 != null) {
            int i10 = dVar.f19650c;
            int i11 = dVar.f19651d;
            if (i10 != i11 || dVar.f19652e != dVar.f19653f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        dVar.f19649b = false;
                        dVar.f19648a = true;
                        return dVar;
                    }
                    if (i11 == 0) {
                        dVar.f19649b = true;
                        dVar.f19648a = true;
                        return dVar;
                    }
                } else {
                    if (dVar.f19653f == null) {
                        dVar.f19649b = false;
                        dVar.f19648a = true;
                        return dVar;
                    }
                    if (dVar.f19652e == null) {
                        dVar.f19649b = true;
                        dVar.f19648a = true;
                        return dVar;
                    }
                }
            }
        } else {
            if (y0Var == null && dVar.f19651d == 0) {
                dVar.f19649b = true;
                dVar.f19648a = true;
                return dVar;
            }
            if (y0Var2 == null && dVar.f19650c == 0) {
                dVar.f19649b = false;
                dVar.f19648a = true;
            }
        }
        return dVar;
    }

    @Nullable
    public Animator onAppear(@NonNull ViewGroup viewGroup, @Nullable y0 y0Var, int i10, @Nullable y0 y0Var2, int i11) {
        if ((this.mMode & 1) != 1 || y0Var2 == null) {
            return null;
        }
        if (y0Var == null) {
            View view = (View) y0Var2.f19711b.getParent();
            if (v(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f19648a) {
                return null;
            }
        }
        return onAppear(viewGroup, y0Var2.f19711b, y0Var, y0Var2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    @Nullable
    public Animator onDisappear(@NonNull ViewGroup viewGroup, @Nullable y0 y0Var, int i10, @Nullable y0 y0Var2, int i11) {
        View view;
        boolean z10;
        View view2;
        boolean z11;
        if ((this.mMode & 2) != 2 || y0Var == null) {
            return null;
        }
        View view3 = y0Var.f19711b;
        View viewA = y0Var2 != null ? y0Var2.f19711b : null;
        View view4 = (View) view3.getTag(a0.a.f19389e);
        if (view4 != null) {
            view2 = null;
            z11 = true;
        } else {
            if (viewA == null || viewA.getParent() == null) {
                if (viewA != null) {
                    view = null;
                    z10 = false;
                } else {
                    viewA = null;
                    view = null;
                    z10 = true;
                }
            } else if (i11 == 4 || view3 == viewA) {
                view = viewA;
                z10 = false;
                viewA = null;
            } else {
                viewA = null;
                view = null;
                z10 = true;
            }
            if (z10) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (v(getTransitionValues(view5, true), getMatchedTransitionValues(view5, true)).f19648a) {
                            int id2 = view5.getId();
                            if (view5.getParent() != null || id2 == -1 || viewGroup.findViewById(id2) == null || !this.mCanRemoveViews) {
                            }
                        } else {
                            viewA = x0.a(viewGroup, view3, view5);
                        }
                    }
                    View view6 = view;
                    view4 = viewA;
                    view2 = view6;
                    z11 = false;
                }
                view2 = view;
                z11 = false;
                view4 = view3;
            } else {
                View view7 = view;
                view4 = viewA;
                view2 = view7;
                z11 = false;
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            d1.g(view2, 0);
            Animator animatorOnDisappear = onDisappear(viewGroup, view2, y0Var, y0Var2);
            if (animatorOnDisappear == null) {
                d1.g(view2, visibility);
                return animatorOnDisappear;
            }
            a aVar = new a(view2, i11, true);
            animatorOnDisappear.addListener(aVar);
            getRootTransition().addListener(aVar);
            return animatorOnDisappear;
        }
        if (!z11) {
            int[] iArr = (int[]) y0Var.f19710a.get(PROPNAME_SCREEN_LOCATION);
            int i12 = iArr[0];
            int i13 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i12 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i13 - iArr2[1]) - view4.getTop());
            viewGroup.getOverlay().add(view4);
        }
        Animator animatorOnDisappear2 = onDisappear(viewGroup, view4, y0Var, y0Var2);
        if (!z11) {
            if (animatorOnDisappear2 == null) {
                viewGroup.getOverlay().remove(view4);
                return animatorOnDisappear2;
            }
            view3.setTag(a0.a.f19389e, view4);
            c cVar = new c(viewGroup, view4, view3);
            animatorOnDisappear2.addListener(cVar);
            animatorOnDisappear2.addPauseListener(cVar);
            getRootTransition().addListener(cVar);
        }
        return animatorOnDisappear2;
    }

    public q1(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.f19488e);
        int iK = h1.n.k(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iK != 0) {
            setMode(iK);
        }
    }
}
