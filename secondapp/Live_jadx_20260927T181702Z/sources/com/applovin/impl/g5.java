package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap f27111a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f27112b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f27113c = new Handler();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27114d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference f27115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f27116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f27117g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(int i10, int i11);
    }

    public g5(View view) {
        this.f27115e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f27116f = null;
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.ma
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f27564b.b();
            }
        };
        this.f27116f = onPreDrawListener;
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f27112b) {
            try {
                this.f27114d = false;
                int iMin = -1;
                int iMax = -1;
                for (Map.Entry entry : this.f27111a.entrySet()) {
                    if (a((View) entry.getKey())) {
                        Integer num = (Integer) entry.getValue();
                        if (iMin == -1 && iMax == -1) {
                            iMin = num.intValue();
                            iMax = num.intValue();
                        } else {
                            iMin = Math.min(iMin, ((Integer) entry.getValue()).intValue());
                            iMax = Math.max(iMax, ((Integer) entry.getValue()).intValue());
                        }
                    }
                }
                a aVar = this.f27117g;
                if (aVar != null) {
                    aVar.a(iMin, iMax);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void d() {
        if (this.f27114d) {
            return;
        }
        this.f27114d = true;
        this.f27113c.postDelayed(new Runnable() { // from class: com.applovin.impl.la
            @Override // java.lang.Runnable
            public final void run() {
                this.f27511b.c();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f27117g = null;
        View view = (View) this.f27115e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f27116f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f27115e.clear();
        }
    }

    public void b(View view) {
        synchronized (this.f27112b) {
            this.f27111a.remove(view);
        }
    }

    public void a(a aVar) {
        this.f27117g = aVar;
    }

    public void a(View view, int i10) {
        synchronized (this.f27112b) {
            this.f27111a.put(view, Integer.valueOf(i10));
            d();
        }
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }
}
