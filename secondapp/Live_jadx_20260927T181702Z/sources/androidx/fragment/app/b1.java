package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import dr.w2;
import f2.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n288#2,2:711\n288#2,2:713\n533#2,6:715\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n*L\n69#1:711,2\n75#1:713,2\n166#1:715,6\n*E\n"})
public abstract class b1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public static final a f10865f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final ViewGroup f10866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final List<c> f10867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final List<c> f10868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10870e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        @cs.o
        public final b1 a(@oy.l ViewGroup container, @oy.l FragmentManager fragmentManager) {
            kotlin.jvm.internal.m0.p(container, "container");
            kotlin.jvm.internal.m0.p(fragmentManager, "fragmentManager");
            d1 d1VarP0 = fragmentManager.P0();
            kotlin.jvm.internal.m0.o(d1VarP0, "fragmentManager.specialEffectsControllerFactory");
            return b(container, d1VarP0);
        }

        @oy.l
        @cs.o
        public final b1 b(@oy.l ViewGroup container, @oy.l d1 factory) {
            kotlin.jvm.internal.m0.p(container, "container");
            kotlin.jvm.internal.m0.p(factory, "factory");
            Object tag = container.getTag(m3.a.c.f106238b);
            if (tag instanceof b1) {
                return (b1) tag;
            }
            b1 b1VarA = factory.a(container);
            kotlin.jvm.internal.m0.o(b1VarA, "factory.createController(container)");
            container.setTag(m3.a.c.f106238b, b1VarA);
            return b1VarA;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @oy.l
        public final n0 f10871h;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(@oy.l c.b finalState, @oy.l c.a lifecycleImpact, @oy.l n0 fragmentStateManager, @oy.l u1.e cancellationSignal) {
            kotlin.jvm.internal.m0.p(finalState, "finalState");
            kotlin.jvm.internal.m0.p(lifecycleImpact, "lifecycleImpact");
            kotlin.jvm.internal.m0.p(fragmentStateManager, "fragmentStateManager");
            kotlin.jvm.internal.m0.p(cancellationSignal, "cancellationSignal");
            Fragment fragmentK = fragmentStateManager.k();
            kotlin.jvm.internal.m0.o(fragmentK, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, fragmentK, cancellationSignal);
            this.f10871h = fragmentStateManager;
        }

        @Override // androidx.fragment.app.b1.c
        public void e() {
            super.e();
            this.f10871h.m();
        }

        @Override // androidx.fragment.app.b1.c
        public void n() {
            if (i() != c.a.ADDING) {
                if (i() == c.a.REMOVING) {
                    Fragment fragmentK = this.f10871h.k();
                    kotlin.jvm.internal.m0.o(fragmentK, "fragmentStateManager.fragment");
                    View viewRequireView = fragmentK.requireView();
                    kotlin.jvm.internal.m0.o(viewRequireView, "fragment.requireView()");
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragmentK);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragmentK2 = this.f10871h.k();
            kotlin.jvm.internal.m0.o(fragmentK2, "fragmentStateManager.fragment");
            View viewFindFocus = fragmentK2.mView.findFocus();
            if (viewFindFocus != null) {
                fragmentK2.setFocusedView(viewFindFocus);
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentK2);
                }
            }
            View viewRequireView2 = h().requireView();
            kotlin.jvm.internal.m0.o(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                this.f10871h.b();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragmentK2.getPostOnViewCreatedAlpha());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10891a;

        static {
            int[] iArr = new int[c.a.values().length];
            try {
                iArr[c.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f10891a = iArr;
        }
    }

    public b1(@oy.l ViewGroup container) {
        kotlin.jvm.internal.m0.p(container, "container");
        this.f10866a = container;
        this.f10867b = new ArrayList();
        this.f10868c = new ArrayList();
    }

    public static final void d(b1 this$0, b operation) {
        kotlin.jvm.internal.m0.p(this$0, "this$0");
        kotlin.jvm.internal.m0.p(operation, "$operation");
        if (this$0.f10867b.contains(operation)) {
            c.b bVarG = operation.g();
            View view = operation.h().mView;
            kotlin.jvm.internal.m0.o(view, "operation.fragment.mView");
            bVarG.e(view);
        }
    }

    public static final void e(b1 this$0, b operation) {
        kotlin.jvm.internal.m0.p(this$0, "this$0");
        kotlin.jvm.internal.m0.p(operation, "$operation");
        this$0.f10867b.remove(operation);
        this$0.f10868c.remove(operation);
    }

    @oy.l
    @cs.o
    public static final b1 r(@oy.l ViewGroup viewGroup, @oy.l FragmentManager fragmentManager) {
        return f10865f.a(viewGroup, fragmentManager);
    }

    @oy.l
    @cs.o
    public static final b1 s(@oy.l ViewGroup viewGroup, @oy.l d1 d1Var) {
        return f10865f.b(viewGroup, d1Var);
    }

    public final void c(c.b bVar, c.a aVar, n0 n0Var) {
        synchronized (this.f10867b) {
            u1.e eVar = new u1.e();
            Fragment fragmentK = n0Var.k();
            kotlin.jvm.internal.m0.o(fragmentK, "fragmentStateManager.fragment");
            c cVarL = l(fragmentK);
            if (cVarL != null) {
                cVarL.m(bVar, aVar);
                return;
            }
            final b bVar2 = new b(bVar, aVar, n0Var, eVar);
            this.f10867b.add(bVar2);
            bVar2.c(new Runnable() { // from class: androidx.fragment.app.z0
                @Override // java.lang.Runnable
                public final void run() {
                    b1.d(this.f11128b, bVar2);
                }
            });
            bVar2.c(new Runnable() { // from class: androidx.fragment.app.a1
                @Override // java.lang.Runnable
                public final void run() {
                    b1.e(this.f10860b, bVar2);
                }
            });
            w2 w2Var = w2.f79517a;
        }
    }

    public final void f(@oy.l c.b finalState, @oy.l n0 fragmentStateManager) {
        kotlin.jvm.internal.m0.p(finalState, "finalState");
        kotlin.jvm.internal.m0.p(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.k());
        }
        c(finalState, c.a.ADDING, fragmentStateManager);
    }

    public final void g(@oy.l n0 fragmentStateManager) {
        kotlin.jvm.internal.m0.p(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.k());
        }
        c(c.b.GONE, c.a.NONE, fragmentStateManager);
    }

    public final void h(@oy.l n0 fragmentStateManager) {
        kotlin.jvm.internal.m0.p(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.k());
        }
        c(c.b.REMOVED, c.a.REMOVING, fragmentStateManager);
    }

    public final void i(@oy.l n0 fragmentStateManager) {
        kotlin.jvm.internal.m0.p(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.k());
        }
        c(c.b.VISIBLE, c.a.NONE, fragmentStateManager);
    }

    public abstract void j(@oy.l List<c> list, boolean z10);

    public final void k() {
        if (this.f10870e) {
            return;
        }
        if (!z1.R0(this.f10866a)) {
            n();
            this.f10869d = false;
            return;
        }
        synchronized (this.f10867b) {
            try {
                if (!this.f10867b.isEmpty()) {
                    List<c> listD6 = fr.r0.d6(this.f10868c);
                    this.f10868c.clear();
                    for (c cVar : listD6) {
                        if (FragmentManager.X0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + cVar);
                        }
                        cVar.d();
                        if (!cVar.k()) {
                            this.f10868c.add(cVar);
                        }
                    }
                    u();
                    List<c> listD7 = fr.r0.d6(this.f10867b);
                    this.f10867b.clear();
                    this.f10868c.addAll(listD7);
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator<c> it = listD7.iterator();
                    while (it.hasNext()) {
                        it.next().n();
                    }
                    j(listD7, this.f10869d);
                    this.f10869d = false;
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                w2 w2Var = w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final c l(Fragment fragment) {
        Object next;
        Iterator<T> it = this.f10867b.iterator();
        while (it.hasNext()) {
            next = it.next();
            c cVar = (c) next;
            if (kotlin.jvm.internal.m0.g(cVar.h(), fragment) && !cVar.j()) {
                return (c) next;
            }
        }
        next = null;
        return (c) next;
    }

    public final c m(Fragment fragment) {
        Object next;
        Iterator<T> it = this.f10868c.iterator();
        while (it.hasNext()) {
            next = it.next();
            c cVar = (c) next;
            if (kotlin.jvm.internal.m0.g(cVar.h(), fragment) && !cVar.j()) {
                return (c) next;
            }
        }
        next = null;
        return (c) next;
    }

    public final void n() {
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zR0 = z1.R0(this.f10866a);
        synchronized (this.f10867b) {
            try {
                u();
                Iterator<c> it = this.f10867b.iterator();
                while (it.hasNext()) {
                    it.next().n();
                }
                for (c cVar : fr.r0.d6(this.f10868c)) {
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zR0 ? "" : "Container " + this.f10866a + " is not attached to window. ") + "Cancelling running operation " + cVar);
                    }
                    cVar.d();
                }
                for (c cVar2 : fr.r0.d6(this.f10867b)) {
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zR0 ? "" : "Container " + this.f10866a + " is not attached to window. ") + "Cancelling pending operation " + cVar2);
                    }
                    cVar2.d();
                }
                w2 w2Var = w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o() {
        if (this.f10870e) {
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f10870e = false;
            k();
        }
    }

    @oy.m
    public final c.a p(@oy.l n0 fragmentStateManager) {
        kotlin.jvm.internal.m0.p(fragmentStateManager, "fragmentStateManager");
        Fragment fragmentK = fragmentStateManager.k();
        kotlin.jvm.internal.m0.o(fragmentK, "fragmentStateManager.fragment");
        c cVarL = l(fragmentK);
        c.a aVarI = cVarL != null ? cVarL.i() : null;
        c cVarM = m(fragmentK);
        c.a aVarI2 = cVarM != null ? cVarM.i() : null;
        int i10 = aVarI == null ? -1 : d.f10891a[aVarI.ordinal()];
        return (i10 == -1 || i10 == 1) ? aVarI2 : aVarI;
    }

    @oy.l
    public final ViewGroup q() {
        return this.f10866a;
    }

    public final void t() {
        c cVarPrevious;
        synchronized (this.f10867b) {
            try {
                u();
                List<c> list = this.f10867b;
                ListIterator<c> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        cVarPrevious = null;
                        break;
                    }
                    cVarPrevious = listIterator.previous();
                    c cVar = cVarPrevious;
                    c.b.a aVar = c.b.f10883b;
                    View view = cVar.h().mView;
                    kotlin.jvm.internal.m0.o(view, "operation.fragment.mView");
                    c.b bVarA = aVar.a(view);
                    c.b bVarG = cVar.g();
                    c.b bVar = c.b.VISIBLE;
                    if (bVarG == bVar && bVarA != bVar) {
                        break;
                    }
                }
                c cVar2 = cVarPrevious;
                Fragment fragmentH = cVar2 != null ? cVar2.h() : null;
                this.f10870e = fragmentH != null ? fragmentH.isPostponed() : false;
                w2 w2Var = w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void u() {
        for (c cVar : this.f10867b) {
            if (cVar.i() == c.a.ADDING) {
                View viewRequireView = cVar.h().requireView();
                kotlin.jvm.internal.m0.o(viewRequireView, "fragment.requireView()");
                cVar.m(c.b.f10883b.b(viewRequireView.getVisibility()), c.a.NONE);
            }
        }
    }

    public final void v(boolean z10) {
        this.f10869d = z10;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n1855#2,2:711\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n*L\n607#1:711,2\n*E\n"})
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public b f10872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public a f10873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public final Fragment f10874c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        public final List<Runnable> f10875d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oy.l
        public final Set<u1.e> f10876e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f10877f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f10878g;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @oy.l
            public static final a f10883b = new a(null);

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public static final class a {
                public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
                    this();
                }

                @oy.l
                public final b a(@oy.l View view) {
                    kotlin.jvm.internal.m0.p(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                @oy.l
                @cs.o
                public final b b(int i10) {
                    if (i10 == 0) {
                        return b.VISIBLE;
                    }
                    if (i10 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i10 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i10);
                }

                public a() {
                }
            }

            /* JADX INFO: renamed from: androidx.fragment.app.b1$c$b$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public /* synthetic */ class C0066b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f10889a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f10889a = iArr;
                }
            }

            @oy.l
            @cs.o
            public static final b f(int i10) {
                return f10883b.b(i10);
            }

            public final void e(@oy.l View view) {
                kotlin.jvm.internal.m0.p(view, "view");
                int i10 = C0066b.f10889a[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.X0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.b1$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public /* synthetic */ class C0067c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f10890a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f10890a = iArr;
            }
        }

        public c(@oy.l b finalState, @oy.l a lifecycleImpact, @oy.l Fragment fragment, @oy.l u1.e cancellationSignal) {
            kotlin.jvm.internal.m0.p(finalState, "finalState");
            kotlin.jvm.internal.m0.p(lifecycleImpact, "lifecycleImpact");
            kotlin.jvm.internal.m0.p(fragment, "fragment");
            kotlin.jvm.internal.m0.p(cancellationSignal, "cancellationSignal");
            this.f10872a = finalState;
            this.f10873b = lifecycleImpact;
            this.f10874c = fragment;
            this.f10875d = new ArrayList();
            this.f10876e = new LinkedHashSet();
            cancellationSignal.d(new u1.e.a() { // from class: androidx.fragment.app.c1
                @Override // u1.e.a
                public final void onCancel() {
                    b1.c.b(this.f10897a);
                }
            });
        }

        public static final void b(c this$0) {
            kotlin.jvm.internal.m0.p(this$0, "this$0");
            this$0.d();
        }

        public final void c(@oy.l Runnable listener) {
            kotlin.jvm.internal.m0.p(listener, "listener");
            this.f10875d.add(listener);
        }

        public final void d() {
            if (this.f10877f) {
                return;
            }
            this.f10877f = true;
            if (this.f10876e.isEmpty()) {
                e();
                return;
            }
            Iterator it = fr.r0.e6(this.f10876e).iterator();
            while (it.hasNext()) {
                ((u1.e) it.next()).a();
            }
        }

        @k.i
        public void e() {
            if (this.f10878g) {
                return;
            }
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f10878g = true;
            Iterator<T> it = this.f10875d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void f(@oy.l u1.e signal) {
            kotlin.jvm.internal.m0.p(signal, "signal");
            if (this.f10876e.remove(signal) && this.f10876e.isEmpty()) {
                e();
            }
        }

        @oy.l
        public final b g() {
            return this.f10872a;
        }

        @oy.l
        public final Fragment h() {
            return this.f10874c;
        }

        @oy.l
        public final a i() {
            return this.f10873b;
        }

        public final boolean j() {
            return this.f10877f;
        }

        public final boolean k() {
            return this.f10878g;
        }

        public final void l(@oy.l u1.e signal) {
            kotlin.jvm.internal.m0.p(signal, "signal");
            n();
            this.f10876e.add(signal);
        }

        public final void m(@oy.l b finalState, @oy.l a lifecycleImpact) {
            kotlin.jvm.internal.m0.p(finalState, "finalState");
            kotlin.jvm.internal.m0.p(lifecycleImpact, "lifecycleImpact");
            int i10 = C0067c.f10890a[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.f10872a == b.REMOVED) {
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f10874c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f10873b + " to ADDING.");
                    }
                    this.f10872a = b.VISIBLE;
                    this.f10873b = a.ADDING;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f10874c + " mFinalState = " + this.f10872a + " -> REMOVED. mLifecycleImpact  = " + this.f10873b + " to REMOVING.");
                }
                this.f10872a = b.REMOVED;
                this.f10873b = a.REMOVING;
                return;
            }
            if (i10 == 3 && this.f10872a != b.REMOVED) {
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f10874c + " mFinalState = " + this.f10872a + " -> " + finalState + kj.e.f102543c);
                }
                this.f10872a = finalState;
            }
        }

        public final void o(@oy.l b bVar) {
            kotlin.jvm.internal.m0.p(bVar, "<set-?>");
            this.f10872a = bVar;
        }

        public final void p(@oy.l a aVar) {
            kotlin.jvm.internal.m0.p(aVar, "<set-?>");
            this.f10873b = aVar;
        }

        @oy.l
        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f10872a + " lifecycleImpact = " + this.f10873b + " fragment = " + this.f10874c + fw.b.f85383j;
        }

        public void n() {
        }
    }
}
