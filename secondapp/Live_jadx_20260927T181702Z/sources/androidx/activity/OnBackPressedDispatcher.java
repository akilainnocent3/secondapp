package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import dr.w2;
import java.util.Iterator;
import java.util.ListIterator;
import k.h1;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,433:1\n1747#2,3:434\n533#2,6:437\n533#2,6:443\n533#2,6:449\n533#2,6:455\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n114#1:434,3\n233#1:437,6\n254#1:443,6\n274#1:449,6\n293#1:455,6\n*E\n"})
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    public final Runnable f6031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public final e2.e<Boolean> f6032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final fr.m<j0> f6033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    public j0 f6034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.m
    public OnBackInvokedCallback f6035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.m
    public OnBackInvokedDispatcher f6036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6038h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class LifecycleOnBackPressedCancellable implements androidx.lifecycle.x, androidx.activity.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public final androidx.lifecycle.r f6039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public final j0 f6040c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.m
        public androidx.activity.e f6041d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f6042e;

        public LifecycleOnBackPressedCancellable(@oy.l OnBackPressedDispatcher onBackPressedDispatcher, @oy.l androidx.lifecycle.r lifecycle, j0 onBackPressedCallback) {
            kotlin.jvm.internal.m0.p(lifecycle, "lifecycle");
            kotlin.jvm.internal.m0.p(onBackPressedCallback, "onBackPressedCallback");
            this.f6042e = onBackPressedDispatcher;
            this.f6039b = lifecycle;
            this.f6040c = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // androidx.activity.e
        public void cancel() {
            this.f6039b.removeObserver(this);
            this.f6040c.removeCancellable(this);
            androidx.activity.e eVar = this.f6041d;
            if (eVar != null) {
                eVar.cancel();
            }
            this.f6041d = null;
        }

        @Override // androidx.lifecycle.x
        public void onStateChanged(@oy.l androidx.lifecycle.b0 source, @oy.l androidx.lifecycle.r.a event) {
            kotlin.jvm.internal.m0.p(source, "source");
            kotlin.jvm.internal.m0.p(event, "event");
            if (event == androidx.lifecycle.r.a.ON_START) {
                this.f6041d = this.f6042e.j(this.f6040c);
                return;
            }
            if (event != androidx.lifecycle.r.a.ON_STOP) {
                if (event == androidx.lifecycle.r.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.e eVar = this.f6041d;
                if (eVar != null) {
                    eVar.cancel();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.l<androidx.activity.d, w2> {
        public a() {
            super(1);
        }

        public final void a(@oy.l androidx.activity.d backEvent) {
            kotlin.jvm.internal.m0.p(backEvent, "backEvent");
            OnBackPressedDispatcher.this.r(backEvent);
        }

        @Override // ds.l
        public /* bridge */ /* synthetic */ w2 invoke(androidx.activity.d dVar) {
            a(dVar);
            return w2.f79517a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<androidx.activity.d, w2> {
        public b() {
            super(1);
        }

        public final void a(@oy.l androidx.activity.d backEvent) {
            kotlin.jvm.internal.m0.p(backEvent, "backEvent");
            OnBackPressedDispatcher.this.q(backEvent);
        }

        @Override // ds.l
        public /* bridge */ /* synthetic */ w2 invoke(androidx.activity.d dVar) {
            a(dVar);
            return w2.f79517a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends kotlin.jvm.internal.o0 implements ds.a<w2> {
        public c() {
            super(0);
        }

        @Override // ds.a
        public /* bridge */ /* synthetic */ w2 invoke() {
            invoke2();
            return w2.f79517a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBackPressedDispatcher.this.p();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends kotlin.jvm.internal.o0 implements ds.a<w2> {
        public d() {
            super(0);
        }

        @Override // ds.a
        public /* bridge */ /* synthetic */ w2 invoke() {
            invoke2();
            return w2.f79517a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBackPressedDispatcher.this.o();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e extends kotlin.jvm.internal.o0 implements ds.a<w2> {
        public e() {
            super(0);
        }

        @Override // ds.a
        public /* bridge */ /* synthetic */ w2 invoke() {
            invoke2();
            return w2.f79517a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBackPressedDispatcher.this.p();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(33)
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final f f6048a = new f();

        public static final void c(ds.a onBackInvoked) {
            kotlin.jvm.internal.m0.p(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        @oy.l
        @k.t
        public final OnBackInvokedCallback b(@oy.l final ds.a<w2> onBackInvoked) {
            kotlin.jvm.internal.m0.p(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.l0
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.f.c(onBackInvoked);
                }
            };
        }

        @k.t
        public final void d(@oy.l Object dispatcher, int i10, @oy.l Object callback) {
            kotlin.jvm.internal.m0.p(dispatcher, "dispatcher");
            kotlin.jvm.internal.m0.p(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
        }

        @k.t
        public final void e(@oy.l Object dispatcher, @oy.l Object callback) {
            kotlin.jvm.internal.m0.p(dispatcher, "dispatcher");
            kotlin.jvm.internal.m0.p(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(34)
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final g f6049a = new g();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ds.l<androidx.activity.d, w2> f6050a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ds.l<androidx.activity.d, w2> f6051b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ds.a<w2> f6052c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ds.a<w2> f6053d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(ds.l<? super androidx.activity.d, w2> lVar, ds.l<? super androidx.activity.d, w2> lVar2, ds.a<w2> aVar, ds.a<w2> aVar2) {
                this.f6050a = lVar;
                this.f6051b = lVar2;
                this.f6052c = aVar;
                this.f6053d = aVar2;
            }

            public void onBackCancelled() {
                this.f6053d.invoke();
            }

            public void onBackInvoked() {
                this.f6052c.invoke();
            }

            public void onBackProgressed(@oy.l BackEvent backEvent) {
                kotlin.jvm.internal.m0.p(backEvent, "backEvent");
                this.f6051b.invoke(new androidx.activity.d(backEvent));
            }

            public void onBackStarted(@oy.l BackEvent backEvent) {
                kotlin.jvm.internal.m0.p(backEvent, "backEvent");
                this.f6050a.invoke(new androidx.activity.d(backEvent));
            }
        }

        @oy.l
        @k.t
        public final OnBackInvokedCallback a(@oy.l ds.l<? super androidx.activity.d, w2> onBackStarted, @oy.l ds.l<? super androidx.activity.d, w2> onBackProgressed, @oy.l ds.a<w2> onBackInvoked, @oy.l ds.a<w2> onBackCancelled) {
            kotlin.jvm.internal.m0.p(onBackStarted, "onBackStarted");
            kotlin.jvm.internal.m0.p(onBackProgressed, "onBackProgressed");
            kotlin.jvm.internal.m0.p(onBackInvoked, "onBackInvoked");
            kotlin.jvm.internal.m0.p(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class h implements androidx.activity.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public final j0 f6054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f6055c;

        public h(@oy.l OnBackPressedDispatcher onBackPressedDispatcher, j0 onBackPressedCallback) {
            kotlin.jvm.internal.m0.p(onBackPressedCallback, "onBackPressedCallback");
            this.f6055c = onBackPressedDispatcher;
            this.f6054b = onBackPressedCallback;
        }

        @Override // androidx.activity.e
        public void cancel() {
            this.f6055c.f6033c.remove(this.f6054b);
            if (kotlin.jvm.internal.m0.g(this.f6055c.f6034d, this.f6054b)) {
                this.f6054b.handleOnBackCancelled();
                this.f6055c.f6034d = null;
            }
            this.f6054b.removeCancellable(this);
            ds.a<w2> enabledChangedCallback$activity_release = this.f6054b.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.f6054b.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class i extends kotlin.jvm.internal.i0 implements ds.a<w2> {
        public i(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // ds.a
        public /* bridge */ /* synthetic */ w2 invoke() {
            k();
            return w2.f79517a;
        }

        public final void k() {
            ((OnBackPressedDispatcher) this.receiver).u();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class j extends kotlin.jvm.internal.i0 implements ds.a<w2> {
        public j(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // ds.a
        public /* bridge */ /* synthetic */ w2 invoke() {
            k();
            return w2.f79517a;
        }

        public final void k() {
            ((OnBackPressedDispatcher) this.receiver).u();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cs.k
    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @k.j0
    public final void h(@oy.l j0 onBackPressedCallback) {
        kotlin.jvm.internal.m0.p(onBackPressedCallback, "onBackPressedCallback");
        j(onBackPressedCallback);
    }

    @k.j0
    public final void i(@oy.l androidx.lifecycle.b0 owner, @oy.l j0 onBackPressedCallback) {
        kotlin.jvm.internal.m0.p(owner, "owner");
        kotlin.jvm.internal.m0.p(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.r lifecycle = owner.getLifecycle();
        if (lifecycle.getCurrentState() == androidx.lifecycle.r.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        u();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new i(this));
    }

    @oy.l
    @k.j0
    public final androidx.activity.e j(@oy.l j0 onBackPressedCallback) {
        kotlin.jvm.internal.m0.p(onBackPressedCallback, "onBackPressedCallback");
        this.f6033c.add(onBackPressedCallback);
        h hVar = new h(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(hVar);
        u();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new j(this));
        return hVar;
    }

    @h1
    @k.j0
    public final void k() {
        o();
    }

    @h1
    @k.j0
    public final void l(@oy.l androidx.activity.d backEvent) {
        kotlin.jvm.internal.m0.p(backEvent, "backEvent");
        q(backEvent);
    }

    @h1
    @k.j0
    public final void m(@oy.l androidx.activity.d backEvent) {
        kotlin.jvm.internal.m0.p(backEvent, "backEvent");
        r(backEvent);
    }

    @k.j0
    public final boolean n() {
        return this.f6038h;
    }

    @k.j0
    public final void o() {
        j0 j0VarPrevious;
        j0 j0Var = this.f6034d;
        if (j0Var == null) {
            fr.m<j0> mVar = this.f6033c;
            ListIterator<j0> listIterator = mVar.listIterator(mVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    j0VarPrevious = null;
                    break;
                }
                j0VarPrevious = listIterator.previous();
            } while (!j0VarPrevious.isEnabled());
            j0Var = j0VarPrevious;
        }
        this.f6034d = null;
        if (j0Var != null) {
            j0Var.handleOnBackCancelled();
        }
    }

    @k.j0
    public final void p() {
        j0 j0VarPrevious;
        j0 j0Var = this.f6034d;
        if (j0Var == null) {
            fr.m<j0> mVar = this.f6033c;
            ListIterator<j0> listIterator = mVar.listIterator(mVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    j0VarPrevious = null;
                    break;
                }
                j0VarPrevious = listIterator.previous();
            } while (!j0VarPrevious.isEnabled());
            j0Var = j0VarPrevious;
        }
        this.f6034d = null;
        if (j0Var != null) {
            j0Var.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f6031a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @k.j0
    public final void q(androidx.activity.d dVar) {
        j0 j0VarPrevious;
        j0 j0Var = this.f6034d;
        if (j0Var == null) {
            fr.m<j0> mVar = this.f6033c;
            ListIterator<j0> listIterator = mVar.listIterator(mVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    j0VarPrevious = null;
                    break;
                }
                j0VarPrevious = listIterator.previous();
            } while (!j0VarPrevious.isEnabled());
            j0Var = j0VarPrevious;
        }
        if (j0Var != null) {
            j0Var.handleOnBackProgressed(dVar);
        }
    }

    @k.j0
    public final void r(androidx.activity.d dVar) {
        j0 j0VarPrevious;
        fr.m<j0> mVar = this.f6033c;
        ListIterator<j0> listIterator = mVar.listIterator(mVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                j0VarPrevious = null;
                break;
            }
            j0VarPrevious = listIterator.previous();
        } while (!j0VarPrevious.isEnabled());
        j0 j0Var = j0VarPrevious;
        if (this.f6034d != null) {
            o();
        }
        this.f6034d = j0Var;
        if (j0Var != null) {
            j0Var.handleOnBackStarted(dVar);
        }
    }

    @k.t0(33)
    public final void s(@oy.l OnBackInvokedDispatcher invoker) {
        kotlin.jvm.internal.m0.p(invoker, "invoker");
        this.f6036f = invoker;
        t(this.f6038h);
    }

    @k.t0(33)
    public final void t(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f6036f;
        OnBackInvokedCallback onBackInvokedCallback = this.f6035e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z10 && !this.f6037g) {
            f.f6048a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f6037g = true;
        } else {
            if (z10 || !this.f6037g) {
                return;
            }
            f.f6048a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f6037g = false;
        }
    }

    public final void u() {
        boolean z10 = this.f6038h;
        fr.m<j0> mVar = this.f6033c;
        boolean z11 = false;
        if (!k0.a(mVar) || !mVar.isEmpty()) {
            Iterator<j0> it = mVar.iterator();
            while (it.hasNext()) {
                if (it.next().isEnabled()) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f6038h = z11;
        if (z11 != z10) {
            e2.e<Boolean> eVar = this.f6032b;
            if (eVar != null) {
                eVar.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                t(z11);
            }
        }
    }

    public OnBackPressedDispatcher(@oy.m Runnable runnable, @oy.m e2.e<Boolean> eVar) {
        this.f6031a = runnable;
        this.f6032b = eVar;
        this.f6033c = new fr.m<>();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f6035e = i10 >= 34 ? g.f6049a.a(new a(), new b(), new c(), new d()) : f.f6048a.b(new e());
        }
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? null : runnable);
    }

    @cs.k
    public OnBackPressedDispatcher(@oy.m Runnable runnable) {
        this(runnable, null);
    }
}
