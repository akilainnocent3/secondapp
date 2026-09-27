package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements b0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f13422k = 700;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13425c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.m
    public Handler f13428f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oy.l
    public static final b f13421j = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @oy.l
    public static final r0 f13423l = new r0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13426d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13427e = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    public final d0 f13429g = new d0(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    public final Runnable f13430h = new Runnable() { // from class: androidx.lifecycle.q0
        @Override // java.lang.Runnable
        public final void run() {
            r0.i(this.f13410b);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.l
    public final s0.a f13431i = new d();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(29)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f13432a = new a();

        @cs.o
        @k.t
        public static final void a(@oy.l Activity activity, @oy.l Application.ActivityLifecycleCallbacks callback) {
            kotlin.jvm.internal.m0.p(activity, "activity");
            kotlin.jvm.internal.m0.p(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        @cs.o
        public final b0 a() {
            return r0.f13423l;
        }

        @cs.o
        public final void c(@oy.l Context context) {
            kotlin.jvm.internal.m0.p(context, "context");
            r0.f13423l.h(context);
        }

        public b() {
        }

        @k.h1
        public static /* synthetic */ void b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends l {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a extends l {
            final /* synthetic */ r0 this$0;

            public a(r0 r0Var) {
                this.this$0 = r0Var;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(@oy.l Activity activity) {
                kotlin.jvm.internal.m0.p(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(@oy.l Activity activity) {
                kotlin.jvm.internal.m0.p(activity, "activity");
                this.this$0.f();
            }
        }

        public c() {
        }

        @Override // androidx.lifecycle.l, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@oy.l Activity activity, @oy.m Bundle bundle) {
            kotlin.jvm.internal.m0.p(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                s0.f13436c.b(activity).h(r0.this.f13431i);
            }
        }

        @Override // androidx.lifecycle.l, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@oy.l Activity activity) {
            kotlin.jvm.internal.m0.p(activity, "activity");
            r0.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        @k.t0(29)
        public void onActivityPreCreated(@oy.l Activity activity, @oy.m Bundle bundle) {
            kotlin.jvm.internal.m0.p(activity, "activity");
            a.a(activity, new a(r0.this));
        }

        @Override // androidx.lifecycle.l, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@oy.l Activity activity) {
            kotlin.jvm.internal.m0.p(activity, "activity");
            r0.this.g();
        }
    }

    public static final void i(r0 this$0) {
        kotlin.jvm.internal.m0.p(this$0, "this$0");
        this$0.j();
        this$0.k();
    }

    @oy.l
    @cs.o
    public static final b0 l() {
        return f13421j.a();
    }

    @cs.o
    public static final void m(@oy.l Context context) {
        f13421j.c(context);
    }

    public final void d() {
        int i10 = this.f13425c - 1;
        this.f13425c = i10;
        if (i10 == 0) {
            Handler handler = this.f13428f;
            kotlin.jvm.internal.m0.m(handler);
            handler.postDelayed(this.f13430h, 700L);
        }
    }

    public final void e() {
        int i10 = this.f13425c + 1;
        this.f13425c = i10;
        if (i10 == 1) {
            if (this.f13426d) {
                this.f13429g.g(r.a.ON_RESUME);
                this.f13426d = false;
            } else {
                Handler handler = this.f13428f;
                kotlin.jvm.internal.m0.m(handler);
                handler.removeCallbacks(this.f13430h);
            }
        }
    }

    public final void f() {
        int i10 = this.f13424b + 1;
        this.f13424b = i10;
        if (i10 == 1 && this.f13427e) {
            this.f13429g.g(r.a.ON_START);
            this.f13427e = false;
        }
    }

    public final void g() {
        this.f13424b--;
        k();
    }

    @Override // androidx.lifecycle.b0
    @oy.l
    public r getLifecycle() {
        return this.f13429g;
    }

    public final void h(@oy.l Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        this.f13428f = new Handler();
        this.f13429g.g(r.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.m0.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.f13425c == 0) {
            this.f13426d = true;
            this.f13429g.g(r.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f13424b == 0 && this.f13426d) {
            this.f13429g.g(r.a.ON_STOP);
            this.f13427e = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d implements s0.a {
        public d() {
        }

        @Override // androidx.lifecycle.s0.a
        public void onResume() {
            r0.this.e();
        }

        @Override // androidx.lifecycle.s0.a
        public void onStart() {
            r0.this.f();
        }

        @Override // androidx.lifecycle.s0.a
        public void onCreate() {
        }
    }
}
