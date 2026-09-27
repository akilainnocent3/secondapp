package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class J8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f54887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f54888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T7 f54889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f54890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f54891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final I8 f54892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f54893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3885o7 f54894h;

    public J8(AdConfig.ViewabilityConfig viewabilityConfig, T7 visibilityTracker, C3885o7 listener) {
        kotlin.jvm.internal.m0.p(viewabilityConfig, "viewabilityConfig");
        kotlin.jvm.internal.m0.p(visibilityTracker, "visibilityTracker");
        kotlin.jvm.internal.m0.p(listener, "listener");
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.f54887a = weakHashMap;
        this.f54888b = weakHashMap2;
        this.f54889c = visibilityTracker;
        this.f54890d = J8.class.getSimpleName();
        this.f54893g = viewabilityConfig.getImpressionPollIntervalMillis();
        G8 g10 = new G8(this);
        InterfaceC3837m9 interfaceC3837m9 = visibilityTracker.f55518d;
        if (interfaceC3837m9 != null) {
            ((C3862n9) interfaceC3837m9).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        visibilityTracker.f55522h = g10;
        this.f54891e = handler;
        this.f54892f = new I8(this);
        this.f54894h = listener;
    }

    public final void a(View view) {
        kotlin.jvm.internal.m0.p(view, "view");
        this.f54887a.remove(view);
        this.f54888b.remove(view);
        this.f54889c.a(view);
    }
}
