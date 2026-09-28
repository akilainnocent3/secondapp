package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.b;
import androidx.fragment.app.q;
import com.sportybet.android.gp.tz.R;
import defpackage.dq40;
import defpackage.g9i0;
import defpackage.gc6;
import defpackage.hb5;
import defpackage.hce0;
import defpackage.ib5;
import defpackage.l48;
import defpackage.nyi;
import defpackage.ox0;
import defpackage.oyi;
import defpackage.p48;
import defpackage.pgd;
import defpackage.q7i0;
import defpackage.qlr;
import defpackage.qry;
import defpackage.qyi;
import defpackage.r6i0;
import defpackage.ryi;
import defpackage.sr1;
import defpackage.vgx;
import defpackage.z290;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends q {

    public static final class a extends q.a {
        public final C0059b c;

        /* JADX INFO: renamed from: androidx.fragment.app.b$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC0058a implements Animation.AnimationListener {
            public final /* synthetic */ q.c a;
            public final /* synthetic */ ViewGroup b;
            public final /* synthetic */ View c;
            public final /* synthetic */ a d;

            public AnimationAnimationListenerC0058a(q.c cVar, ViewGroup viewGroup, View view, a aVar) {
                this.a = cVar;
                this.b = viewGroup;
                this.c = view;
                this.d = aVar;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                animation.getClass();
                final ViewGroup viewGroup = this.b;
                final View view = this.c;
                final a aVar = this.d;
                viewGroup.post(new Runnable() { // from class: ggd
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewGroup viewGroup2 = viewGroup;
                        viewGroup2.getClass();
                        viewGroup2.endViewTransition(view);
                        b.a aVar2 = aVar;
                        aVar2.c.a.c(aVar2);
                    }
                });
                if (FragmentManager.R(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
                animation.getClass();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                animation.getClass();
                if (FragmentManager.R(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
                }
            }
        }

        public a(C0059b c0059b) {
            this.c = c0059b;
        }

        @Override // androidx.fragment.app.q.a
        public final void b(ViewGroup viewGroup) {
            viewGroup.getClass();
            C0059b c0059b = this.c;
            q.c cVar = c0059b.a;
            View view = cVar.c.mView;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            c0059b.a.c(this);
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Animation from operation " + cVar + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.q.a
        public final void c(ViewGroup viewGroup) {
            viewGroup.getClass();
            C0059b c0059b = this.c;
            boolean zA = c0059b.a();
            q.c cVar = c0059b.a;
            if (zA) {
                cVar.c(this);
                return;
            }
            Context context = viewGroup.getContext();
            View view = cVar.c.mView;
            context.getClass();
            androidx.fragment.app.f.a aVarB = c0059b.b(context);
            if (aVarB == null) {
                ib5.a("Required value was null.");
                return;
            }
            Animation animation = aVarB.a;
            if (animation == null) {
                ib5.a("Required value was null.");
                return;
            }
            if (cVar.a != q.c.b.a) {
                view.startAnimation(animation);
                cVar.c(this);
                return;
            }
            viewGroup.startViewTransition(view);
            androidx.fragment.app.f.b bVar = new androidx.fragment.app.f.b(animation, viewGroup, view);
            bVar.setAnimationListener(new AnimationAnimationListenerC0058a(cVar, viewGroup, view, this));
            view.startAnimation(bVar);
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Animation from operation " + cVar + " has started.");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$b, reason: collision with other inner class name */
    public static final class C0059b extends f {
        public final boolean b;
        public boolean c;
        public androidx.fragment.app.f.a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0059b(q.c cVar, boolean z) {
            super(cVar);
            cVar.getClass();
            this.b = z;
        }

        /* JADX WARN: Code duplicated, block: B:74:0x00f8 A[Catch: RuntimeException -> 0x00fe, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00fe, blocks: (B:72:0x00f2, B:74:0x00f8), top: B:85:0x00f2 }] */
        public final androidx.fragment.app.f.a b(Context context) {
            int enterAnim;
            androidx.fragment.app.f.a aVar;
            Animator animatorLoadAnimator;
            int iA;
            context.getClass();
            if (this.c) {
                return this.d;
            }
            q.c cVar = this.a;
            Fragment fragment = cVar.c;
            boolean z = cVar.a == q.c.b.b;
            int nextTransition = fragment.getNextTransition();
            if (this.b) {
                enterAnim = z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
            } else {
                enterAnim = z ? fragment.getEnterAnim() : fragment.getExitAnim();
            }
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            androidx.fragment.app.f.a aVar2 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z, enterAnim);
                if (animationOnCreateAnimation != null) {
                    aVar2 = new androidx.fragment.app.f.a(animationOnCreateAnimation);
                } else {
                    Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z, enterAnim);
                    if (animatorOnCreateAnimator != null) {
                        aVar2 = new androidx.fragment.app.f.a(animatorOnCreateAnimator);
                    } else {
                        if (enterAnim == 0 && nextTransition != 0) {
                            if (nextTransition == 4097) {
                                iA = z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                            } else if (nextTransition == 8194) {
                                iA = z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                            } else if (nextTransition == 8197) {
                                iA = z ? androidx.fragment.app.f.a(context, android.R.attr.activityCloseEnterAnimation) : androidx.fragment.app.f.a(context, android.R.attr.activityCloseExitAnimation);
                            } else if (nextTransition == 4099) {
                                iA = z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                            } else if (nextTransition != 4100) {
                                iA = -1;
                            } else {
                                iA = z ? androidx.fragment.app.f.a(context, android.R.attr.activityOpenEnterAnimation) : androidx.fragment.app.f.a(context, android.R.attr.activityOpenExitAnimation);
                            }
                            enterAnim = iA;
                        }
                        if (enterAnim != 0) {
                            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
                            if (zEquals) {
                                try {
                                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation != null) {
                                        aVar = new androidx.fragment.app.f.a(animationLoadAnimation);
                                        aVar2 = aVar;
                                    }
                                } catch (Resources.NotFoundException e) {
                                    throw e;
                                } catch (RuntimeException unused) {
                                    try {
                                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                        if (animatorLoadAnimator != null) {
                                            aVar = new androidx.fragment.app.f.a(animatorLoadAnimator);
                                            aVar2 = aVar;
                                        }
                                    } catch (RuntimeException e2) {
                                        if (zEquals) {
                                            throw e2;
                                        }
                                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                        if (animationLoadAnimation2 != null) {
                                            aVar2 = new androidx.fragment.app.f.a(animationLoadAnimation2);
                                        }
                                    }
                                }
                            } else {
                                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                if (animatorLoadAnimator != null) {
                                    aVar = new androidx.fragment.app.f.a(animatorLoadAnimator);
                                    aVar2 = aVar;
                                }
                            }
                        }
                    }
                }
            }
            this.d = aVar2;
            this.c = true;
            return aVar2;
        }
    }

    public static final class c extends q.a {
        public final C0059b c;
        public AnimatorSet d;

        public static final class a extends AnimatorListenerAdapter {
            public final /* synthetic */ ViewGroup a;
            public final /* synthetic */ View b;
            public final /* synthetic */ boolean c;
            public final /* synthetic */ q.c d;
            public final /* synthetic */ c e;

            public a(ViewGroup viewGroup, View view, boolean z, q.c cVar, c cVar2) {
                this.a = viewGroup;
                this.b = view;
                this.c = z;
                this.d = cVar;
                this.e = cVar2;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animator.getClass();
                ViewGroup viewGroup = this.a;
                View view = this.b;
                viewGroup.endViewTransition(view);
                boolean z = this.c;
                q.c cVar = this.d;
                if (z || cVar.a == q.c.b.c) {
                    q.c.b bVar = cVar.a;
                    view.getClass();
                    bVar.a(view, viewGroup);
                }
                c cVar2 = this.e;
                cVar2.c.a.c(cVar2);
                if (FragmentManager.R(2)) {
                    Log.v("FragmentManager", "Animator from operation " + cVar + " has ended.");
                }
            }
        }

        public c(C0059b c0059b) {
            this.c = c0059b;
        }

        @Override // androidx.fragment.app.q.a
        public final void b(ViewGroup viewGroup) {
            viewGroup.getClass();
            AnimatorSet animatorSet = this.d;
            C0059b c0059b = this.c;
            if (animatorSet == null) {
                c0059b.a.c(this);
                return;
            }
            q.c cVar = c0059b.a;
            if (!cVar.g) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                e.a.a(animatorSet);
            }
            if (FragmentManager.R(2)) {
                StringBuilder sb = new StringBuilder("Animator from operation ");
                sb.append(cVar);
                sb.append(" has been canceled");
                sb.append(cVar.g ? " with seeking." : ".");
                sb.append(' ');
                Log.v("FragmentManager", sb.toString());
            }
        }

        @Override // androidx.fragment.app.q.a
        public final void c(ViewGroup viewGroup) {
            viewGroup.getClass();
            q.c cVar = this.c.a;
            AnimatorSet animatorSet = this.d;
            if (animatorSet == null) {
                cVar.c(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Animator from operation " + cVar + " has started.");
            }
        }

        @Override // androidx.fragment.app.q.a
        public final void d(sr1 sr1Var, ViewGroup viewGroup) {
            viewGroup.getClass();
            q.c cVar = this.c.a;
            AnimatorSet animatorSet = this.d;
            if (animatorSet == null) {
                cVar.c(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !cVar.c.mTransitioning) {
                return;
            }
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + cVar);
            }
            long jA = d.a.a(animatorSet);
            long j = (long) (sr1Var.c * jA);
            if (j == 0) {
                j = 1;
            }
            if (j == jA) {
                j = jA - 1;
            }
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + cVar);
            }
            e.a.b(animatorSet, j);
        }

        @Override // androidx.fragment.app.q.a
        public final void e(ViewGroup viewGroup) {
            c cVar;
            viewGroup.getClass();
            C0059b c0059b = this.c;
            if (c0059b.a()) {
                return;
            }
            Context context = viewGroup.getContext();
            context.getClass();
            androidx.fragment.app.f.a aVarB = c0059b.b(context);
            this.d = aVarB != null ? aVarB.b : null;
            q.c cVar2 = c0059b.a;
            Fragment fragment = cVar2.c;
            boolean z = cVar2.a == q.c.b.c;
            View view = fragment.mView;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null) {
                cVar = this;
                animatorSet.addListener(new a(viewGroup, view, z, cVar2, cVar));
            } else {
                cVar = this;
            }
            AnimatorSet animatorSet2 = cVar.d;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }
    }

    public static final class d {
        public static final d a = new d();

        public final long a(AnimatorSet animatorSet) {
            animatorSet.getClass();
            return animatorSet.getTotalDuration();
        }
    }

    public static final class e {
        public static final e a = new e();

        public final void a(AnimatorSet animatorSet) {
            animatorSet.getClass();
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long j) {
            animatorSet.getClass();
            animatorSet.setCurrentPlayTime(j);
        }
    }

    public static class f {
        public final q.c a;

        public f(q.c cVar) {
            cVar.getClass();
            this.a = cVar;
        }

        public final boolean a() {
            q.c.b bVar;
            q.c cVar = this.a;
            View view = cVar.c.mView;
            q.c.b bVar2 = q.c.b.b;
            if (view != null) {
                float alpha = view.getAlpha();
                bVar = q.c.b.d;
                if (alpha != 0.0f || view.getVisibility() != 0) {
                    int visibility = view.getVisibility();
                    if (visibility == 0) {
                        bVar = bVar2;
                    } else if (visibility != 4) {
                        if (visibility != 8) {
                            hb5.a(hce0.a(visibility, "Unknown visibility "));
                            return false;
                        }
                        bVar = q.c.b.c;
                    }
                }
            } else {
                bVar = null;
            }
            q.c.b bVar3 = cVar.a;
            if (bVar != bVar3) {
                return (bVar == bVar2 || bVar3 == bVar2) ? false : true;
            }
            return true;
        }
    }

    public static final class g extends q.a {
        public final ArrayList c;
        public final q.c d;
        public final q.c e;
        public final ryi f;
        public final Object g;
        public final ArrayList<View> h;
        public final ArrayList<View> i;
        public final ox0<String, String> j;
        public final ArrayList<String> k;
        public final ArrayList<String> l;
        public final ox0<String, View> m;
        public final ox0<String, View> n;
        public final boolean o;
        public final gc6 p;
        public Object q;
        public boolean r;

        public static final class a extends qlr implements Function0<Unit> {
            public final /* synthetic */ g a;
            public final /* synthetic */ ViewGroup b;
            public final /* synthetic */ Object c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewGroup viewGroup, g gVar, Object obj) {
                super(0);
                this.a = gVar;
                this.b = viewGroup;
                this.c = obj;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                this.a.f.e(this.b, this.c);
                return Unit.a;
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.b$g$b, reason: collision with other inner class name */
        public static final class C0060b extends qlr implements Function0<Unit> {
            public final /* synthetic */ ViewGroup b;
            public final /* synthetic */ Object c;
            public final /* synthetic */ dq40<Function0<Unit>> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0060b(ViewGroup viewGroup, Object obj, dq40<Function0<Unit>> dq40Var) {
                super(0);
                this.b = viewGroup;
                this.c = obj;
                this.d = dq40Var;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [T, androidx.fragment.app.c] */
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                if (FragmentManager.R(2)) {
                    Log.v("FragmentManager", "Attempting to create TransitionSeekController");
                }
                g gVar = g.this;
                ryi ryiVar = gVar.f;
                ViewGroup viewGroup = this.b;
                Object obj = this.c;
                Object objI = ryiVar.i(viewGroup, obj);
                gVar.q = objI;
                if (objI == null) {
                    if (FragmentManager.R(2)) {
                        Log.v("FragmentManager", "TransitionSeekController was not created.");
                    }
                    gVar.r = true;
                } else {
                    this.d.a = new androidx.fragment.app.c(viewGroup, gVar, obj);
                    if (FragmentManager.R(2)) {
                        Log.v("FragmentManager", "Started executing operations from " + gVar.d + " to " + gVar.e);
                    }
                }
                return Unit.a;
            }
        }

        public g(ArrayList arrayList, q.c cVar, q.c cVar2, ryi ryiVar, Object obj, ArrayList arrayList2, ArrayList arrayList3, ox0 ox0Var, ArrayList arrayList4, ArrayList arrayList5, ox0 ox0Var2, ox0 ox0Var3, boolean z) {
            arrayList4.getClass();
            this.c = arrayList;
            this.d = cVar;
            this.e = cVar2;
            this.f = ryiVar;
            this.g = obj;
            this.h = arrayList2;
            this.i = arrayList3;
            this.j = ox0Var;
            this.k = arrayList4;
            this.l = arrayList5;
            this.m = ox0Var2;
            this.n = ox0Var3;
            this.o = z;
            this.p = new gc6();
        }

        public static void f(View view, ArrayList arrayList) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            WindowInsets windowInsets = q7i0.a;
            if (viewGroup.isTransitionGroup()) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    f(childAt, arrayList);
                }
            }
        }

        @Override // androidx.fragment.app.q.a
        public final boolean a() {
            Object obj;
            Object obj2;
            ryi ryiVar = this.f;
            if (ryiVar.l()) {
                ArrayList arrayList = this.c;
                if (arrayList != null && arrayList.isEmpty()) {
                    obj2 = this.g;
                    return obj2 != null ? true : true;
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    h hVar = (h) obj3;
                    if (Build.VERSION.SDK_INT < 34 || (obj = hVar.b) == null || !ryiVar.m(obj)) {
                    }
                }
                obj2 = this.g;
                if (obj2 != null || ryiVar.m(obj2)) {
                }
            }
            return false;
        }

        @Override // androidx.fragment.app.q.a
        public final void b(ViewGroup viewGroup) {
            viewGroup.getClass();
            this.p.a();
        }

        @Override // androidx.fragment.app.q.a
        public final void c(ViewGroup viewGroup) {
            viewGroup.getClass();
            boolean zIsLaidOut = viewGroup.isLaidOut();
            int i = 0;
            ArrayList arrayList = this.c;
            if (!zIsLaidOut || this.r) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    h hVar = (h) obj;
                    q.c cVar = hVar.a;
                    if (FragmentManager.R(2)) {
                        if (this.r) {
                            Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + cVar);
                        } else {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + cVar);
                        }
                    }
                    hVar.a.c(this);
                }
                this.r = false;
                return;
            }
            Object obj2 = this.q;
            ryi ryiVar = this.f;
            q.c cVar2 = this.e;
            q.c cVar3 = this.d;
            if (obj2 != null) {
                ryiVar.c(obj2);
                if (FragmentManager.R(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + cVar3 + " to " + cVar2);
                    return;
                }
                return;
            }
            Pair<ArrayList<View>, Object> pairG = g(viewGroup, cVar2, cVar3);
            ArrayList<View> arrayList2 = pairG.a;
            Object obj3 = pairG.b;
            ArrayList arrayList3 = new ArrayList(l48.r(arrayList, 10));
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj4 = arrayList.get(i3);
                i3++;
                arrayList3.add(((h) obj4).a);
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj5 = arrayList3.get(i);
                i++;
                final q.c cVar4 = (q.c) obj5;
                ryiVar.u(cVar4.c, obj3, this.p, new Runnable() { // from class: jgd
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zR = FragmentManager.R(2);
                        q.c cVar5 = cVar4;
                        if (zR) {
                            Log.v("FragmentManager", "Transition for operation " + cVar5 + " has completed");
                        }
                        cVar5.c(this);
                    }
                });
            }
            i(arrayList2, viewGroup, new a(viewGroup, this, obj3));
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + cVar3 + " to " + cVar2);
            }
        }

        @Override // androidx.fragment.app.q.a
        public final void d(sr1 sr1Var, ViewGroup viewGroup) {
            viewGroup.getClass();
            Object obj = this.q;
            if (obj != null) {
                this.f.r(obj, sr1Var.c);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v2, types: [hgd] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // androidx.fragment.app.q.a
        public final void e(ViewGroup viewGroup) {
            Object obj;
            viewGroup.getClass();
            boolean zIsLaidOut = viewGroup.isLaidOut();
            int i = 0;
            ArrayList arrayList = this.c;
            if (!zIsLaidOut) {
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    q.c cVar = ((h) obj2).a;
                    if (FragmentManager.R(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + cVar);
                    }
                }
                return;
            }
            boolean zH = h();
            q.c cVar2 = this.e;
            q.c cVar3 = this.d;
            if (zH && (obj = this.g) != null && !a()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + cVar3 + " and " + cVar2 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (a() && h()) {
                final dq40 dq40Var = new dq40();
                Pair<ArrayList<View>, Object> pairG = g(viewGroup, cVar2, cVar3);
                ArrayList<View> arrayList2 = pairG.a;
                Object obj3 = pairG.b;
                ArrayList arrayList3 = new ArrayList(l48.r(arrayList, 10));
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj4 = arrayList.get(i2);
                    i2++;
                    arrayList3.add(((h) obj4).a);
                }
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj5 = arrayList3.get(i);
                    i++;
                    final q.c cVar4 = (q.c) obj5;
                    ?? r7 = new Runnable() { // from class: hgd
                        @Override // java.lang.Runnable
                        public final void run() {
                            Function0 function0 = (Function0) dq40Var.a;
                            if (function0 != null) {
                                function0.invoke();
                            }
                        }
                    };
                    Fragment fragment = cVar4.c;
                    this.f.v(obj3, this.p, r7, new Runnable() { // from class: igd
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zR = FragmentManager.R(2);
                            q.c cVar5 = cVar4;
                            if (zR) {
                                Log.v("FragmentManager", "Transition for operation " + cVar5 + " has completed");
                            }
                            cVar5.c(this);
                        }
                    });
                }
                i(arrayList2, viewGroup, new C0060b(viewGroup, obj3, dq40Var));
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x00af  */
        public final Pair<ArrayList<View>, Object> g(ViewGroup viewGroup, final q.c cVar, final q.c cVar2) {
            ArrayList<View> arrayList;
            ArrayList<View> arrayList2;
            Object obj;
            final ryi ryiVar;
            Object obj2;
            final ArrayList<View> arrayList3;
            this = this;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            ArrayList arrayList4 = this.c;
            int size = arrayList4.size();
            View view2 = null;
            boolean z = false;
            int i = 0;
            while (true) {
                arrayList = this.i;
                arrayList2 = this.h;
                obj = this.g;
                ryiVar = this.f;
                if (i >= size) {
                    break;
                }
                Object obj3 = arrayList4.get(i);
                int i2 = i + 1;
                if (((h) obj3).d == null || cVar2 == null || cVar == null || this.j.isEmpty() || obj == null) {
                    z = z;
                } else {
                    Fragment fragment = cVar.c;
                    Fragment fragment2 = cVar2.c;
                    boolean z2 = z;
                    boolean z3 = this.o;
                    ox0<String, View> ox0Var = this.m;
                    nyi.a(fragment, fragment2, z3, ox0Var);
                    qry.a(viewGroup, new Runnable() { // from class: kgd
                        @Override // java.lang.Runnable
                        public final void run() {
                            Fragment fragment3 = cVar.c;
                            Fragment fragment4 = cVar2.c;
                            b.g gVar = this;
                            nyi.a(fragment3, fragment4, gVar.o, gVar.n);
                        }
                    });
                    arrayList2.addAll(ox0Var.values());
                    ArrayList<String> arrayList5 = this.l;
                    if (!arrayList5.isEmpty()) {
                        String str = arrayList5.get(0);
                        str.getClass();
                        View view3 = ox0Var.get(str);
                        ryiVar.s(view3, obj);
                        view2 = view3;
                    }
                    ox0<String, View> ox0Var2 = this.n;
                    arrayList.addAll(ox0Var2.values());
                    ArrayList<String> arrayList6 = this.k;
                    if (arrayList6.isEmpty()) {
                        z = z2;
                    } else {
                        String str2 = arrayList6.get(0);
                        str2.getClass();
                        final View view4 = ox0Var2.get(str2);
                        if (view4 != null) {
                            qry.a(viewGroup, new Runnable() { // from class: lgd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ryiVar.getClass();
                                    ryi.j(rect, view4);
                                }
                            });
                            z = true;
                        } else {
                            z = z2;
                        }
                    }
                    ryiVar.w(obj, view, arrayList2);
                    ryi ryiVar2 = this.f;
                    Object obj4 = this.g;
                    ryiVar2.q(obj4, null, null, obj4, arrayList);
                }
                size = size;
                i = i2;
            }
            boolean z4 = z;
            ArrayList arrayList7 = new ArrayList();
            int size2 = arrayList4.size();
            Object objO = null;
            Object objO2 = null;
            int i3 = 0;
            while (true) {
                arrayList2 = arrayList2;
                if (i3 >= size2) {
                    break;
                }
                arrayList4 = arrayList4;
                h hVar = (h) arrayList4.get(i3);
                size2 = size2;
                q.c cVar3 = hVar.a;
                i3++;
                Object objH = ryiVar.h(hVar.b);
                if (objH != null) {
                    Object obj5 = obj;
                    ArrayList<View> arrayList8 = new ArrayList<>();
                    Object obj6 = objO2;
                    Fragment fragment3 = cVar3.c;
                    Object obj7 = objO;
                    View view5 = fragment3.mView;
                    view5.getClass();
                    f(view5, arrayList8);
                    if (obj5 != null && (cVar3 == cVar2 || cVar3 == cVar)) {
                        if (cVar3 == cVar2) {
                            arrayList8.removeAll(CollectionsKt.E0(arrayList2));
                        } else {
                            arrayList8.removeAll(CollectionsKt.E0(arrayList));
                        }
                    }
                    if (arrayList8.isEmpty()) {
                        ryiVar.a(view, objH);
                        obj2 = objH;
                        arrayList3 = arrayList8;
                    } else {
                        ryiVar.b(objH, arrayList8);
                        this.f.q(objH, objH, arrayList8, null, null);
                        obj2 = objH;
                        arrayList3 = arrayList8;
                        if (cVar3.a == q.c.b.c) {
                            cVar3.i = false;
                            ArrayList<View> arrayList9 = new ArrayList<>(arrayList3);
                            arrayList9.remove(fragment3.mView);
                            ryiVar.p(obj2, fragment3.mView, arrayList9);
                            qry.a(viewGroup, new Runnable() { // from class: mgd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    nyi.c(4, arrayList3);
                                }
                            });
                        }
                    }
                    if (cVar3.a == q.c.b.b) {
                        arrayList7.addAll(arrayList3);
                        if (z4) {
                            ryiVar.t(obj2, rect);
                        }
                        if (FragmentManager.R(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + obj2);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            int i4 = 0;
                            for (int size3 = arrayList3.size(); i4 < size3; size3 = size3) {
                                View view6 = arrayList3.get(i4);
                                i4++;
                                view6.getClass();
                                Log.v("FragmentManager", "View: " + view6);
                            }
                        }
                    } else {
                        ryiVar.s(view2, obj2);
                        if (FragmentManager.R(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + obj2);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            int i5 = 0;
                            for (int size4 = arrayList3.size(); i5 < size4; size4 = size4) {
                                View view7 = arrayList3.get(i5);
                                i5++;
                                view7.getClass();
                                Log.v("FragmentManager", "View: " + view7);
                            }
                        }
                    }
                    if (hVar.c) {
                        objO = ryiVar.o(obj7, obj2);
                        arrayList2 = arrayList2;
                        size2 = size2;
                        arrayList4 = arrayList4;
                        i3 = i3;
                        obj = obj5;
                        objO2 = obj6;
                    } else {
                        objO2 = ryiVar.o(obj6, obj2);
                        objO = obj7;
                        obj = obj5;
                    }
                }
            }
            Object objN = ryiVar.n(objO, objO2, obj);
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Final merged transition: " + objN + " for container " + viewGroup);
            }
            return new Pair<>(arrayList7, objN);
        }

        public final boolean h() {
            ArrayList arrayList = this.c;
            if (arrayList != null && arrayList.isEmpty()) {
                return true;
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (!((h) obj).a.c.mTransitioning) {
                    return false;
                }
            }
            return true;
        }

        public final void i(ArrayList<View> arrayList, ViewGroup viewGroup, Function0<Unit> function0) {
            nyi.c(4, arrayList);
            ryi ryiVar = this.f;
            ryiVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<View> arrayList3 = this.i;
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                View view = arrayList3.get(i);
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                arrayList2.add(r6i0.d.f(view));
                r6i0.d.o(view, null);
            }
            boolean zR = FragmentManager.R(2);
            ArrayList<View> arrayList4 = this.h;
            if (zR) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                int size2 = arrayList4.size();
                int i2 = 0;
                while (i2 < size2) {
                    View view2 = arrayList4.get(i2);
                    i2++;
                    view2.getClass();
                    View view3 = view2;
                    StringBuilder sb = new StringBuilder("View: ");
                    sb.append(view3);
                    sb.append(" Name: ");
                    WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
                    sb.append(r6i0.d.f(view3));
                    Log.v("FragmentManager", sb.toString());
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                int size3 = arrayList3.size();
                int i3 = 0;
                while (i3 < size3) {
                    View view4 = arrayList3.get(i3);
                    i3++;
                    view4.getClass();
                    View view5 = view4;
                    StringBuilder sb2 = new StringBuilder("View: ");
                    sb2.append(view5);
                    sb2.append(" Name: ");
                    WeakHashMap<View, g9i0> weakHashMap3 = r6i0.a;
                    sb2.append(r6i0.d.f(view5));
                    Log.v("FragmentManager", sb2.toString());
                }
            }
            function0.invoke();
            int size4 = arrayList3.size();
            ArrayList arrayList5 = new ArrayList();
            for (int i4 = 0; i4 < size4; i4++) {
                View view6 = arrayList4.get(i4);
                WeakHashMap<View, g9i0> weakHashMap4 = r6i0.a;
                String strF = r6i0.d.f(view6);
                arrayList5.add(strF);
                if (strF != null) {
                    r6i0.d.o(view6, null);
                    String str = this.j.get(strF);
                    for (int i5 = 0; i5 < size4; i5++) {
                        if (str.equals(arrayList2.get(i5))) {
                            r6i0.d.o(arrayList3.get(i5), strF);
                            break;
                        }
                    }
                }
            }
            qry.a(viewGroup, new qyi(size4, arrayList3, arrayList2, arrayList4, arrayList5));
            nyi.c(0, arrayList);
            ryiVar.x(this.g, arrayList4, arrayList3);
        }
    }

    public static final class h extends f {
        public final Object b;
        public final boolean c;
        public final Object d;

        public h(q.c cVar, boolean z, boolean z2) {
            super(cVar);
            Fragment fragment = cVar.c;
            q.c.b bVar = cVar.a;
            q.c.b bVar2 = q.c.b.b;
            this.b = bVar == bVar2 ? z ? fragment.getReenterTransition() : fragment.getEnterTransition() : z ? fragment.getReturnTransition() : fragment.getExitTransition();
            this.c = cVar.a == bVar2 ? z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
            this.d = z2 ? z ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
        }

        public final ryi b() {
            Object obj = this.b;
            ryi ryiVarC = c(obj);
            Object obj2 = this.d;
            ryi ryiVarC2 = c(obj2);
            if (ryiVarC == null || ryiVarC2 == null || ryiVarC == ryiVarC2) {
                return ryiVarC == null ? ryiVarC2 : ryiVarC;
            }
            vgx.a(this.a.c, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment ", " returned Transition ", obj, " which uses a different Transition  type than its shared element transition ", obj2);
            return null;
        }

        public final ryi c(Object obj) {
            if (obj == null) {
                return null;
            }
            oyi oyiVar = nyi.a;
            if (oyiVar != null && (obj instanceof Transition)) {
                return oyiVar;
            }
            ryi ryiVar = nyi.b;
            if (ryiVar != null && ryiVar.g(obj)) {
                return ryiVar;
            }
            StringBuilder sb = new StringBuilder("Transition ");
            sb.append(obj);
            Fragment fragment = this.a.c;
            sb.append(" for fragment ");
            sb.append(fragment);
            sb.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static void n(ox0 ox0Var, View view) {
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        String strF = r6i0.d.f(view);
        if (strF != null) {
            ox0Var.put(strF, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    n(ox0Var, childAt);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:180:0x04ea A[LOOP:19: B:179:0x04e8->B:180:0x04ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.q
    public final void b(ArrayList arrayList, boolean z) {
        q.c.b bVar;
        q.c.b bVar2;
        q.c.b bVar3;
        float f2;
        Object obj;
        int i;
        Object objPrevious;
        ArrayList arrayList2;
        g gVar;
        q.c.b bVar4;
        int size;
        int i2;
        String strB;
        q.c.b bVar5;
        q.c.b bVar6;
        int i3 = 2;
        if (FragmentManager.R(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        int size2 = arrayList.size();
        int i4 = 0;
        while (true) {
            bVar = q.c.b.c;
            bVar2 = q.c.b.b;
            bVar3 = q.c.b.d;
            if (i4 >= size2) {
                f2 = 0.0f;
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            f2 = 0.0f;
            q.c cVar = (q.c) obj;
            View view = cVar.c.mView;
            view.getClass();
            if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                bVar6 = bVar3;
            } else {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    bVar6 = bVar2;
                } else if (visibility == 4) {
                    bVar6 = bVar3;
                } else {
                    if (visibility != 8) {
                        hb5.a(hce0.a(visibility, "Unknown visibility "));
                        return;
                    }
                    bVar6 = bVar;
                }
            }
            if (bVar6 == bVar2 && cVar.a != bVar2) {
                break;
            }
        }
        q.c cVar2 = (q.c) obj;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = i3;
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            q.c cVar3 = (q.c) objPrevious;
            i = i3;
            View view2 = cVar3.c.mView;
            view2.getClass();
            if (view2.getAlpha() == f2 && view2.getVisibility() == 0) {
                bVar5 = bVar3;
            } else {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    bVar5 = bVar2;
                } else if (visibility2 == 4) {
                    bVar5 = bVar3;
                } else {
                    if (visibility2 != 8) {
                        hb5.a(hce0.a(visibility2, "Unknown visibility "));
                        return;
                    }
                    bVar5 = bVar;
                }
            }
            if (bVar5 != bVar2 && cVar3.a == bVar2) {
                break;
            } else {
                i3 = i;
            }
        }
        q.c cVar4 = (q.c) objPrevious;
        if (FragmentManager.R(i)) {
            Log.v("FragmentManager", "Executing operations from " + cVar2 + " to " + cVar4);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Fragment fragment = ((q.c) CollectionsKt.b0(arrayList)).c;
        int size3 = arrayList.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj2 = arrayList.get(i5);
            i5++;
            Fragment.k kVar = ((q.c) obj2).c.mAnimationInfo;
            Fragment.k kVar2 = fragment.mAnimationInfo;
            kVar.b = kVar2.b;
            kVar.c = kVar2.c;
            kVar.d = kVar2.d;
            kVar.e = kVar2.e;
        }
        int size4 = arrayList.size();
        int i6 = 0;
        while (i6 < size4) {
            Object obj3 = arrayList.get(i6);
            i6++;
            final q.c cVar5 = (q.c) obj3;
            arrayList3.add(new C0059b(cVar5, z));
            arrayList4.add(new h(cVar5, z, !z ? cVar5 != cVar4 : cVar5 != cVar2));
            cVar5.d.add(new Runnable() { // from class: fgd
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a(cVar5);
                }
            });
        }
        ArrayList arrayList5 = new ArrayList();
        int size5 = arrayList4.size();
        int i7 = 0;
        while (i7 < size5) {
            Object obj4 = arrayList4.get(i7);
            i7++;
            if (!((h) obj4).a()) {
                arrayList5.add(obj4);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int size6 = arrayList5.size();
        int i8 = 0;
        while (i8 < size6) {
            Object obj5 = arrayList5.get(i8);
            i8++;
            if (((h) obj5).b() != null) {
                arrayList6.add(obj5);
            }
        }
        int size7 = arrayList6.size();
        ryi ryiVar = null;
        int i9 = 0;
        while (i9 < size7) {
            Object obj6 = arrayList6.get(i9);
            i9++;
            h hVar = (h) obj6;
            ryi ryiVarB = hVar.b();
            if (ryiVar != null && ryiVarB != ryiVar) {
                StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append(hVar.a.c);
                Object obj7 = hVar.b;
                sb.append(" returned Transition ");
                sb.append(obj7);
                sb.append(" which uses a different Transition type than other Fragments.");
                throw new IllegalArgumentException(sb.toString().toString());
            }
            ryiVar = ryiVarB;
        }
        if (ryiVar == null) {
            arrayList2 = arrayList3;
            bVar4 = bVar;
        } else {
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            ox0 ox0Var = new ox0();
            ArrayList<String> arrayList9 = new ArrayList<>();
            ArrayList<String> arrayList10 = new ArrayList<>();
            ox0 ox0Var2 = new ox0();
            ox0 ox0Var3 = new ox0();
            int size8 = arrayList6.size();
            ArrayList<String> sharedElementSourceNames = arrayList10;
            int i10 = 0;
            Object obj8 = null;
            while (i10 < size8) {
                Object obj9 = arrayList6.get(i10);
                int i11 = i10 + 1;
                size8 = size8;
                Object obj10 = ((h) obj9).d;
                if (obj10 == null || cVar2 == null) {
                    i10 = i11;
                    i10 = i10;
                    size8 = size8;
                    arrayList8 = arrayList8;
                    arrayList3 = arrayList3;
                } else {
                    i10 = i11;
                    Fragment fragment2 = cVar2.c;
                    if (cVar4 != null) {
                        Fragment fragment3 = cVar4.c;
                        Object objY = ryiVar.y(ryiVar.h(obj10));
                        sharedElementSourceNames = fragment3.getSharedElementSourceNames();
                        sharedElementSourceNames.getClass();
                        ArrayList<String> sharedElementSourceNames2 = fragment2.getSharedElementSourceNames();
                        sharedElementSourceNames2.getClass();
                        arrayList8 = arrayList8;
                        ArrayList<String> sharedElementTargetNames = fragment2.getSharedElementTargetNames();
                        sharedElementTargetNames.getClass();
                        int size9 = sharedElementTargetNames.size();
                        arrayList3 = arrayList3;
                        int i12 = 0;
                        while (i12 < size9) {
                            int i13 = size9;
                            int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i12));
                            if (iIndexOf != -1) {
                                sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i12));
                            }
                            i12++;
                            size9 = i13;
                        }
                        arrayList9 = fragment3.getSharedElementTargetNames();
                        arrayList9.getClass();
                        Pair pair = !z ? new Pair(fragment2.getExitTransitionCallback(), fragment3.getEnterTransitionCallback()) : new Pair(fragment2.getEnterTransitionCallback(), fragment3.getExitTransitionCallback());
                        z290 z290Var = (z290) pair.a;
                        z290 z290Var2 = (z290) pair.b;
                        int size10 = sharedElementSourceNames.size();
                        int i14 = 0;
                        while (i14 < size10) {
                            String str = sharedElementSourceNames.get(i14);
                            str.getClass();
                            z290 z290Var3 = z290Var;
                            String str2 = str;
                            String str3 = arrayList9.get(i14);
                            str3.getClass();
                            ox0Var.put(str2, str3);
                            i14++;
                            z290Var = z290Var3;
                            z290Var2 = z290Var2;
                        }
                        z290 z290Var4 = z290Var;
                        z290 z290Var5 = z290Var2;
                        if (FragmentManager.R(i)) {
                            Log.v("FragmentManager", ">>> entering view names <<<");
                            int i15 = 0;
                            for (int size11 = arrayList9.size(); i15 < size11; size11 = size11) {
                                String str4 = arrayList9.get(i15);
                                i15++;
                                Log.v("FragmentManager", "Name: " + str4);
                            }
                            Log.v("FragmentManager", ">>> exiting view names <<<");
                            int i16 = 0;
                            for (int size12 = sharedElementSourceNames.size(); i16 < size12; size12 = size12) {
                                String str5 = sharedElementSourceNames.get(i16);
                                i16++;
                                Log.v("FragmentManager", "Name: " + str5);
                            }
                        }
                        View view3 = fragment2.mView;
                        view3.getClass();
                        n(ox0Var2, view3);
                        ox0Var2.n(sharedElementSourceNames);
                        if (z290Var4 != null) {
                            if (FragmentManager.R(i)) {
                                Log.v("FragmentManager", "Executing exit callback for operation " + cVar2);
                            }
                            int size13 = sharedElementSourceNames.size() - 1;
                            if (size13 >= 0) {
                                while (true) {
                                    int i17 = size13 - 1;
                                    String str6 = sharedElementSourceNames.get(size13);
                                    str6.getClass();
                                    String str7 = str6;
                                    View view4 = (View) ox0Var2.get(str7);
                                    if (view4 == null) {
                                        ox0Var.remove(str7);
                                    } else {
                                        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                                        if (!str7.equals(r6i0.d.f(view4))) {
                                            ox0Var.put(r6i0.d.f(view4), (String) ox0Var.remove(str7));
                                        }
                                    }
                                    if (i17 < 0) {
                                        break;
                                    } else {
                                        size13 = i17;
                                    }
                                }
                            }
                        } else {
                            ox0Var.n(ox0Var2.keySet());
                        }
                        View view5 = fragment3.mView;
                        view5.getClass();
                        n(ox0Var3, view5);
                        ox0Var3.n(arrayList9);
                        ox0Var3.n(ox0Var.values());
                        if (z290Var5 != null) {
                            if (FragmentManager.R(i)) {
                                Log.v("FragmentManager", "Executing enter callback for operation " + cVar4);
                            }
                            int size14 = arrayList9.size() - 1;
                            if (size14 >= 0) {
                                while (true) {
                                    int i18 = size14 - 1;
                                    String str8 = arrayList9.get(size14);
                                    str8.getClass();
                                    String str9 = str8;
                                    View view6 = (View) ox0Var3.get(str9);
                                    if (view6 == null) {
                                        String strB2 = nyi.b(ox0Var, str9);
                                        if (strB2 != null) {
                                            ox0Var.remove(strB2);
                                        }
                                    } else {
                                        WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
                                        if (!str9.equals(r6i0.d.f(view6)) && (strB = nyi.b(ox0Var, str9)) != null) {
                                            ox0Var.put(strB, r6i0.d.f(view6));
                                        }
                                    }
                                    if (i18 < 0) {
                                        break;
                                    } else {
                                        size14 = i18;
                                    }
                                }
                            }
                        } else {
                            oyi oyiVar = nyi.a;
                            for (int i19 = ox0Var.c - 1; -1 < i19; i19--) {
                                if (!ox0Var3.containsKey((String) ox0Var.k(i19))) {
                                    ox0Var.i(i19);
                                }
                            }
                        }
                        p48.y(ox0Var2.entrySet(), new pgd(ox0Var.keySet()), false);
                        p48.y(ox0Var3.entrySet(), new pgd(ox0Var.values()), false);
                        if (ox0Var.isEmpty()) {
                            Log.i("FragmentManager", "Ignoring shared elements transition " + objY + " between " + cVar2 + " and " + cVar4 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                            arrayList7.clear();
                            arrayList8.clear();
                            obj8 = null;
                        } else {
                            obj8 = objY;
                        }
                    } else {
                        i10 = i10;
                        size8 = size8;
                        arrayList8 = arrayList8;
                        arrayList3 = arrayList3;
                    }
                }
            }
            ryi ryiVar2 = ryiVar;
            ArrayList arrayList11 = arrayList8;
            arrayList2 = arrayList3;
            if (obj8 != null) {
                bVar4 = bVar;
                gVar = new g(arrayList6, cVar2, cVar4, ryiVar2, obj8, arrayList7, arrayList11, ox0Var, arrayList9, sharedElementSourceNames, ox0Var2, ox0Var3, z);
                size = arrayList6.size();
                i2 = 0;
                while (i2 < size) {
                    Object obj11 = arrayList6.get(i2);
                    i2++;
                    ((h) obj11).a.j.add(gVar);
                }
            } else {
                if (!arrayList6.isEmpty()) {
                    int size15 = arrayList6.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 < size15) {
                            Object obj12 = arrayList6.get(i20);
                            i20++;
                            if (((h) obj12).b != null) {
                                bVar4 = bVar;
                                gVar = new g(arrayList6, cVar2, cVar4, ryiVar2, obj8, arrayList7, arrayList11, ox0Var, arrayList9, sharedElementSourceNames, ox0Var2, ox0Var3, z);
                                size = arrayList6.size();
                                i2 = 0;
                                while (i2 < size) {
                                    Object obj13 = arrayList6.get(i2);
                                    i2++;
                                    ((h) obj13).a.j.add(gVar);
                                }
                            }
                        }
                    }
                }
                bVar4 = bVar;
            }
        }
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        int size16 = arrayList2.size();
        int i21 = 0;
        while (i21 < size16) {
            Object obj14 = arrayList2.get(i21);
            i21++;
            p48.w(((C0059b) obj14).a.k, arrayList13);
        }
        ArrayList arrayList14 = arrayList2;
        boolean zIsEmpty = arrayList13.isEmpty();
        int size17 = arrayList14.size();
        boolean z2 = false;
        int i22 = 0;
        while (i22 < size17) {
            Object obj15 = arrayList14.get(i22);
            i22++;
            C0059b c0059b = (C0059b) obj15;
            Context context = this.a.getContext();
            q.c cVar6 = c0059b.a;
            context.getClass();
            androidx.fragment.app.f.a aVarB = c0059b.b(context);
            if (aVarB != null) {
                if (aVarB.b == null) {
                    arrayList12.add(c0059b);
                } else {
                    Fragment fragment4 = cVar6.c;
                    if (cVar6.k.isEmpty()) {
                        if (cVar6.a == bVar4) {
                            cVar6.i = false;
                        }
                        cVar6.j.add(new c(c0059b));
                        z2 = true;
                    } else if (FragmentManager.R(i)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + fragment4 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        int i23 = 0;
        int size18 = arrayList12.size();
        while (i23 < size18) {
            Object obj16 = arrayList12.get(i23);
            i23++;
            C0059b c0059b2 = (C0059b) obj16;
            q.c cVar7 = c0059b2.a;
            Fragment fragment5 = cVar7.c;
            if (zIsEmpty) {
                if (!z2) {
                    cVar7.j.add(new a(c0059b2));
                } else if (FragmentManager.R(i)) {
                    Log.v(r3, "Ignoring Animation set on " + fragment5 + " as Animations cannot run alongside Animators.");
                }
            } else if (FragmentManager.R(i)) {
                Log.v(r3, "Ignoring Animation set on " + fragment5 + " as Animations cannot run alongside Transitions.");
            }
        }
    }
}
