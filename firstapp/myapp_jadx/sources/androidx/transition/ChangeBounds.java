package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.sportybet.android.gp.tz.R;
import defpackage.bug0;
import defpackage.g9h0;
import defpackage.hai0;
import defpackage.lby;
import defpackage.nk40;
import defpackage.u7i0;
import defpackage.xbe0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ChangeBounds extends Transition {
    public static final String[] X = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final a Y = new a(PointF.class, "topLeft");
    public static final b Z = new b(PointF.class, "bottomRight");
    public static final c a0 = new c(PointF.class, "bottomRight");
    public static final d b0 = new d(PointF.class, "topLeft");
    public static final e c0 = new e(PointF.class, "position");
    public static final nk40 d0 = new nk40();
    public final boolean W;

    public class a extends Property<i, PointF> {
        @Override // android.util.Property
        public final PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            iVar2.b = iRound;
            int i = iVar2.f + 1;
            iVar2.f = i;
            if (i == iVar2.g) {
                hai0.a(iVar2.e, iVar2.a, iRound, iVar2.c, iVar2.d);
                iVar2.f = 0;
                iVar2.g = 0;
            }
        }
    }

    public class b extends Property<i, PointF> {
        @Override // android.util.Property
        public final PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            iVar2.d = iRound;
            int i = iVar2.g + 1;
            iVar2.g = i;
            if (iVar2.f == i) {
                hai0.a(iVar2.e, iVar2.a, iVar2.b, iVar2.c, iRound);
                iVar2.f = 0;
                iVar2.g = 0;
            }
        }
    }

    public class c extends Property<View, PointF> {
        @Override // android.util.Property
        public final PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            hai0.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    public class d extends Property<View, PointF> {
        @Override // android.util.Property
        public final PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            hai0.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    public class e extends Property<View, PointF> {
        @Override // android.util.Property
        public final PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            hai0.a(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    public class f extends AnimatorListenerAdapter {
        private final i mViewBounds;

        public f(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    public static class h extends androidx.transition.d {
        public boolean a = false;
        public final ViewGroup b;

        public h(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // androidx.transition.d, androidx.transition.Transition.f
        public final void a() {
            u7i0.a(this.b, false);
        }

        @Override // androidx.transition.d, androidx.transition.Transition.f
        public final void f() {
            u7i0.a(this.b, true);
        }

        @Override // androidx.transition.d, androidx.transition.Transition.f
        public final void j(Transition transition) {
            if (!this.a) {
                u7i0.a(this.b, false);
            }
            transition.B(this);
        }

        @Override // androidx.transition.d, androidx.transition.Transition.f
        public final void k(Transition transition) {
            u7i0.a(this.b, false);
            this.a = true;
        }
    }

    public static class i {
        public int a;
        public int b;
        public int c;
        public int d;
        public final View e;
        public int f;
        public int g;

        public i(View view) {
            this.e = view;
        }
    }

    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xbe0.b);
        boolean z = g9h0.e((XmlResourceParser) attributeSet, "resizeClip") ? typedArrayObtainStyledAttributes.getBoolean(0, false) : false;
        typedArrayObtainStyledAttributes.recycle();
        this.W = z;
    }

    public final void P(bug0 bug0Var) {
        View view = bug0Var.b;
        HashMap map = bug0Var.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
        if (this.W) {
            map.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // androidx.transition.Transition
    public final void d(bug0 bug0Var) {
        P(bug0Var);
    }

    @Override // androidx.transition.Transition
    public final void g(bug0 bug0Var) {
        Rect rect;
        P(bug0Var);
        if (!this.W || (rect = (Rect) bug0Var.b.getTag(R.id.transition_clip)) == null) {
            return;
        }
        bug0Var.a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.Transition
    public final Animator k(ViewGroup viewGroup, bug0 bug0Var, bug0 bug0Var2) {
        int i2;
        int i3;
        Rect rect;
        Animator animator;
        Animator animatorA;
        if (bug0Var != null) {
            HashMap map = bug0Var.a;
            if (bug0Var2 != null) {
                HashMap map2 = bug0Var2.a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = bug0Var2.b;
                    Rect rect2 = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect3 = (Rect) map2.get("android:changeBounds:bounds");
                    int i4 = rect2.left;
                    int i5 = rect3.left;
                    int i6 = rect2.top;
                    int i7 = rect3.top;
                    int i8 = rect2.right;
                    int i9 = rect3.right;
                    int i10 = rect2.bottom;
                    int i11 = rect3.bottom;
                    int i12 = i8 - i4;
                    int i13 = i10 - i6;
                    int i14 = i9 - i5;
                    int i15 = i11 - i7;
                    Rect rect4 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect5 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
                        i2 = 0;
                    } else {
                        i2 = (i4 == i5 && i6 == i7) ? 0 : 1;
                        if (i8 != i9 || i10 != i11) {
                            i2++;
                        }
                    }
                    if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                        i2++;
                    }
                    int i16 = i2;
                    if (i16 <= 0) {
                        return null;
                    }
                    boolean z = this.W;
                    e eVar = c0;
                    if (z) {
                        hai0.a(view, i4, i6, i4 + Math.max(i12, i14), i6 + Math.max(i13, i15));
                        ObjectAnimator objectAnimatorA = (i4 == i5 && i6 == i7) ? null : lby.a(view, eVar, this.O.a(i4, i6, i5, i7));
                        boolean z2 = rect4 == null;
                        if (z2) {
                            i3 = 0;
                            rect = new Rect(0, 0, i12, i13);
                        } else {
                            i3 = 0;
                            rect = rect4;
                        }
                        int i17 = rect5 == null ? 1 : i3;
                        Rect rect6 = i17 != 0 ? new Rect(i3, i3, i14, i15) : rect5;
                        if (rect.equals(rect6)) {
                            animator = null;
                        } else {
                            view.setClipBounds(rect);
                            Animator animatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", d0, rect, rect6);
                            g gVar = new g(view, rect, z2, rect6, i17, i4, i6, i8, i10, i5, i7, i9, i11);
                            animatorOfObject.addListener(gVar);
                            a(gVar);
                            animator = animatorOfObject;
                        }
                        boolean z3 = androidx.transition.f.a;
                        animatorA = objectAnimatorA;
                        if (objectAnimatorA == null) {
                            animatorA = animator;
                        } else if (animator != null) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorA, animator);
                            animatorA = animatorSet;
                        }
                    } else {
                        hai0.a(view, i4, i6, i8, i10);
                        if (i16 != 2) {
                            animatorA = (i4 == i5 && i6 == i7) ? lby.a(view, a0, this.O.a(i8, i10, i9, i11)) : lby.a(view, b0, this.O.a(i4, i6, i5, i7));
                        } else if (i12 == i14 && i13 == i15) {
                            animatorA = lby.a(view, eVar, this.O.a(i4, i6, i5, i7));
                        } else {
                            i iVar = new i(view);
                            ObjectAnimator objectAnimatorA2 = lby.a(iVar, Y, this.O.a(i4, i6, i5, i7));
                            ObjectAnimator objectAnimatorA3 = lby.a(iVar, Z, this.O.a(i8, i10, i9, i11));
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.playTogether(objectAnimatorA2, objectAnimatorA3);
                            animatorSet2.addListener(new f(iVar));
                            animatorA = animatorSet2;
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        u7i0.a(viewGroup4, true);
                        q().a(new h(viewGroup4));
                    }
                    return animatorA;
                }
            }
        }
        return null;
    }

    @Override // androidx.transition.Transition
    public final String[] s() {
        return X;
    }

    public ChangeBounds() {
        this.W = false;
    }

    public static class g extends AnimatorListenerAdapter implements Transition.f {
        public final int A;
        public final int B;
        public boolean C;
        public final View a;
        public final Rect b;
        public final boolean c;
        public final Rect d;
        public final boolean e;
        public final int f;
        public final int i;
        public final int v;
        public final int w;
        public final int y;
        public final int z;

        public g(View view, Rect rect, boolean z, Rect rect2, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.a = view;
            this.b = rect;
            this.c = z;
            this.d = rect2;
            this.e = z2;
            this.f = i;
            this.i = i2;
            this.v = i3;
            this.w = i4;
            this.y = i5;
            this.z = i6;
            this.A = i7;
            this.B = i8;
        }

        @Override // androidx.transition.Transition.f
        public final void a() {
            View view = this.a;
            view.setTag(R.id.transition_clip, view.getClipBounds());
            view.setClipBounds(this.e ? null : this.d);
        }

        @Override // androidx.transition.Transition.f
        public final void f() {
            View view = this.a;
            Rect rect = (Rect) view.getTag(R.id.transition_clip);
            view.setTag(R.id.transition_clip, null);
            view.setClipBounds(rect);
        }

        @Override // androidx.transition.Transition.f
        public final void g(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public final void j(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public final void k(Transition transition) {
            this.C = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (this.C) {
                return;
            }
            Rect rect = null;
            if (z) {
                if (!this.c) {
                    rect = this.b;
                }
            } else if (!this.e) {
                rect = this.d;
            }
            View view = this.a;
            view.setClipBounds(rect);
            if (z) {
                hai0.a(view, this.f, this.i, this.v, this.w);
            } else {
                hai0.a(view, this.y, this.z, this.A, this.B);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            int i = this.v;
            int i2 = this.f;
            int i3 = this.A;
            int i4 = this.y;
            int iMax = Math.max(i - i2, i3 - i4);
            int i5 = this.w;
            int i6 = this.i;
            int i7 = this.B;
            int i8 = this.z;
            int iMax2 = Math.max(i5 - i6, i7 - i8);
            if (z) {
                i2 = i4;
            }
            if (z) {
                i6 = i8;
            }
            View view = this.a;
            hai0.a(view, i2, i6, iMax + i2, iMax2 + i6);
            view.setClipBounds(z ? this.d : this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }
    }
}
