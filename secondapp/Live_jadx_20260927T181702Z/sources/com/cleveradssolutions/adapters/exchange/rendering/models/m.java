package com.cleveradssolutions.adapters.exchange.rendering.models;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f42252k = "zw";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewTreeObserver.OnPreDrawListener f42253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f42254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f42255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f42256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f42257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f42258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f42259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f42260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f42261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f42262j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(com.cleveradssolutions.adapters.exchange.rendering.models.internal.f fVar);
    }

    public m(View view, com.cleveradssolutions.adapters.exchange.rendering.models.internal.e eVar) {
        this(view, Collections.singleton(eVar));
    }

    public final Runnable d() {
        return new Runnable() { // from class: com.cleveradssolutions.adapters.exchange.rendering.models.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f42249b.e();
            }
        };
    }

    public final /* synthetic */ void e() {
        this.f42262j = true;
        View view = (View) this.f42255c.get();
        if (view == null) {
            k();
            return;
        }
        if (!p() || this.f42260h) {
            for (com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.k kVar : this.f42256d) {
                boolean z10 = false;
                this.f42261i = false;
                com.cleveradssolutions.adapters.exchange.rendering.utils.exposure.c cVarG = kVar.g(view);
                boolean zH = kVar.h(view, cVarG);
                com.cleveradssolutions.adapters.exchange.rendering.models.internal.e eVarF = kVar.f();
                if (zH) {
                    if (!kVar.a()) {
                        kVar.e();
                    }
                    if (kVar.c()) {
                        z10 = !eVarF.f();
                        eVarF.j(true);
                    }
                }
                n(new com.cleveradssolutions.adapters.exchange.rendering.models.internal.f(eVarF.h(), cVarG, zH, z10));
            }
            if (!p() || this.f42260h) {
                j();
            }
        }
    }

    public final /* synthetic */ boolean f() {
        j();
        return true;
    }

    public final /* synthetic */ void g() {
        if (this.f42262j) {
            return;
        }
        this.f42253a.onPreDraw();
    }

    public void h() {
        this.f42261i = false;
        j();
    }

    public final void i() {
        this.f42258f.postDelayed(new Runnable() { // from class: com.cleveradssolutions.adapters.exchange.rendering.models.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f42250b.g();
            }
        }, 200L);
    }

    public void j() {
        if (this.f42261i) {
            return;
        }
        this.f42261i = true;
        this.f42258f.postDelayed(this.f42257e, 200L);
    }

    public void k() {
        this.f42258f.removeCallbacksAndMessages(null);
        this.f42261i = false;
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f42254b.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f42253a);
        }
        this.f42254b.clear();
    }

    public void l(Context context) {
        WeakReference weakReference = this.f42255c;
        if (weakReference == null || weakReference.get() == null) {
            com.cleveradssolutions.adapters.exchange.b.a(f42252k, "Couldn't start visibility check. Target view is null");
        } else {
            m(context, (View) this.f42255c.get());
        }
    }

    public final void m(Context context, View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f42254b.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            com.cleveradssolutions.adapters.exchange.b.h(f42252k, "Original ViewTreeObserver is still alive.");
            return;
        }
        View viewC = com.cleveradssolutions.adapters.exchange.rendering.views.webview.mraid.n.c(context, view);
        if (viewC == null) {
            com.cleveradssolutions.adapters.exchange.b.h(f42252k, "Unable to set Visibility Tracker due to no available root view.");
            return;
        }
        ViewTreeObserver viewTreeObserver2 = viewC.getViewTreeObserver();
        if (!viewTreeObserver2.isAlive()) {
            com.cleveradssolutions.adapters.exchange.b.h(f42252k, "Visibility Tracker was unable to track views because the root view tree observer was not alive");
        } else {
            this.f42254b = new WeakReference(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(this.f42253a);
        }
    }

    public final void n(com.cleveradssolutions.adapters.exchange.rendering.models.internal.f fVar) {
        a aVar = this.f42259g;
        if (aVar != null) {
            aVar.a(fVar);
        }
    }

    public void o(a aVar) {
        this.f42259g = aVar;
    }

    public final boolean p() {
        Iterator it = this.f42256d.iterator();
        while (it.hasNext()) {
            if (!((com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.k) it.next()).f().f()) {
                return false;
            }
        }
        return true;
    }

    public m(View view, com.cleveradssolutions.adapters.exchange.rendering.models.internal.e eVar, boolean z10) {
        this(view, Collections.singleton(eVar), z10);
    }

    public m(View view, Set set) {
        this.f42256d = new ArrayList();
        this.f42260h = false;
        this.f42261i = false;
        this.f42262j = false;
        if (view == null) {
            com.cleveradssolutions.adapters.exchange.b.h(f42252k, "Tracked view can't be null");
            return;
        }
        this.f42255c = new WeakReference(view);
        com.cleveradssolutions.adapters.exchange.rendering.utils.exposure.b bVar = new com.cleveradssolutions.adapters.exchange.rendering.utils.exposure.b();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.f42256d.add(new com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.k((com.cleveradssolutions.adapters.exchange.rendering.models.internal.e) it.next(), bVar));
        }
        this.f42258f = new Handler(Looper.getMainLooper());
        this.f42257e = d();
        this.f42253a = new ViewTreeObserver.OnPreDrawListener() { // from class: com.cleveradssolutions.adapters.exchange.rendering.models.l
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f42251b.f();
            }
        };
        this.f42254b = new WeakReference(null);
        i();
    }

    public m(View view, Set set, boolean z10) {
        this(view, set);
        this.f42260h = z10;
    }
}
