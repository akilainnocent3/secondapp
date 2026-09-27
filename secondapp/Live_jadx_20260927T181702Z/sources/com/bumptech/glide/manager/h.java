package com.bumptech.glide.manager;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import dc.d0;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@t0(26)
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Activity> f31485a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f31486b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f31487b;

        /* JADX INFO: renamed from: com.bumptech.glide.manager.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class RunnableC0286a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnDrawListener f31489b;

            public RunnableC0286a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f31489b = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                d0.c().i();
                h.this.f31486b = true;
                h.b(a.this.f31487b, this.f31489b);
                h.this.f31485a.clear();
            }
        }

        public a(View view) {
            this.f31487b = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            pc.o.y(new RunnableC0286a(this));
        }
    }

    public static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // com.bumptech.glide.manager.i
    public void a(Activity activity) {
        if (!this.f31486b && this.f31485a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
