package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ironsource.EnumC4422na;
import com.ironsource.InterfaceC4402ma;
import com.ironsource.environment.thread.IronSourceThreadManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final b f62285m = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static AtomicBoolean f62286n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final long f62287o = 700;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f62288a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f62289b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f62290c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f62291d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EnumC4422na f62292e = EnumC4422na.NONE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<InterfaceC4402ma> f62293f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f62294g = new Runnable() { // from class: com.ironsource.lifecycle.c
        @Override // java.lang.Runnable
        public final void run() {
            this.f62301b.f();
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f62295h = new Runnable() { // from class: com.ironsource.lifecycle.d
        @Override // java.lang.Runnable
        public final void run() {
            this.f62302b.g();
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f62296i = new Runnable() { // from class: com.ironsource.lifecycle.e
        @Override // java.lang.Runnable
        public final void run() {
            this.f62303b.h();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f62297j = new Runnable() { // from class: com.ironsource.lifecycle.f
        @Override // java.lang.Runnable
        public final void run() {
            this.f62304b.i();
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f62298k = new Runnable() { // from class: com.ironsource.lifecycle.g
        @Override // java.lang.Runnable
        public final void run() {
            this.f62305b.j();
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.ironsource.lifecycle.a.InterfaceC0583a f62299l = new a();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        a();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        Iterator<InterfaceC4402ma> it = this.f62293f.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        Iterator<InterfaceC4402ma> it = this.f62293f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        Iterator<InterfaceC4402ma> it = this.f62293f.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        Iterator<InterfaceC4402ma> it = this.f62293f.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        com.ironsource.lifecycle.a.b(activity);
        com.ironsource.lifecycle.a aVarA = com.ironsource.lifecycle.a.a(activity);
        if (aVarA != null) {
            aVarA.d(this.f62299l);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        d(activity);
    }

    public static b d() {
        return f62285m;
    }

    public void a(InterfaceC4402ma interfaceC4402ma) {
        if (!IronsourceLifecycleProvider.a() || interfaceC4402ma == null || this.f62293f.contains(interfaceC4402ma)) {
            return;
        }
        this.f62293f.add(interfaceC4402ma);
    }

    public void b(InterfaceC4402ma interfaceC4402ma) {
        if (this.f62293f.contains(interfaceC4402ma)) {
            this.f62293f.remove(interfaceC4402ma);
        }
    }

    public EnumC4422na c() {
        return this.f62292e;
    }

    public boolean e() {
        return this.f62292e == EnumC4422na.STOPPED;
    }

    public void c(Activity activity) {
        int i10 = this.f62288a + 1;
        this.f62288a = i10;
        if (i10 == 1 && this.f62291d) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f62298k);
            this.f62291d = false;
            this.f62292e = EnumC4422na.STARTED;
        }
    }

    public void d(Activity activity) {
        this.f62288a--;
        b();
    }

    public void b(Activity activity) {
        int i10 = this.f62289b + 1;
        this.f62289b = i10;
        if (i10 == 1) {
            if (this.f62290c) {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f62297j);
                this.f62290c = false;
                this.f62292e = EnumC4422na.RESUMED;
                return;
            }
            IronSourceThreadManager.INSTANCE.removeUiThreadTask(this.f62294g);
        }
    }

    public void a(Context context) {
        Application application;
        if (!f62286n.compareAndSet(false, true) || (application = (Application) context.getApplicationContext()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    public void a(Activity activity) {
        int i10 = this.f62289b - 1;
        this.f62289b = i10;
        if (i10 == 0) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(this.f62294g, 700L);
        }
    }

    private void a() {
        if (this.f62289b == 0) {
            this.f62290c = true;
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f62295h);
            this.f62292e = EnumC4422na.PAUSED;
        }
    }

    private void b() {
        if (this.f62288a == 0 && this.f62290c) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f62296i);
            this.f62291d = true;
            this.f62292e = EnumC4422na.STOPPED;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements com.ironsource.lifecycle.a.InterfaceC0583a {
        public a() {
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0583a
        public void a(Activity activity) {
            b.this.c(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0583a
        public void onResume(Activity activity) {
            b.this.b(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0583a
        public void b(Activity activity) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
