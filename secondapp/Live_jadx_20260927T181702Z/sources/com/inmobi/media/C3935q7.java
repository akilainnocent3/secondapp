package com.inmobi.media;

import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.q7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3935q7 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C3860n7 f57410k = new C3860n7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f57411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f57414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f57415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3837m9 f57416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public J8 f57417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public T7 f57418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f57419i = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3885o7 f57420j = new C3885o7(this);

    public C3935q7(byte b10, String str, int i10, int i11, int i12, InterfaceC3837m9 interfaceC3837m9) {
        this.f57411a = b10;
        this.f57412b = str;
        this.f57413c = i10;
        this.f57414d = i11;
        this.f57415e = i12;
        this.f57416f = interfaceC3837m9;
    }

    public final void a(View view) {
        J8 j10;
        kotlin.jvm.internal.m0.p(view, "view");
        InterfaceC3837m9 interfaceC3837m9 = this.f57416f;
        if (interfaceC3837m9 != null) {
            ((C3862n9) interfaceC3837m9).c("HtmlAdTracker", "stopTrackingForImpression");
        }
        if (kotlin.jvm.internal.m0.g(this.f57412b, "video") || kotlin.jvm.internal.m0.g(this.f57412b, "audio") || (j10 = this.f57417g) == null) {
            return;
        }
        kotlin.jvm.internal.m0.p(view, "view");
        j10.f54887a.remove(view);
        j10.f54888b.remove(view);
        j10.f54889c.a(view);
        if (j10.f54887a.isEmpty()) {
            InterfaceC3837m9 interfaceC3837m10 = this.f57416f;
            if (interfaceC3837m10 != null) {
                ((C3862n9) interfaceC3837m10).a("HtmlAdTracker", "Impression tracker is free, removing it");
            }
            J8 j11 = this.f57417g;
            if (j11 != null) {
                j11.f54887a.clear();
                j11.f54888b.clear();
                j11.f54889c.a();
                j11.f54891e.removeMessages(0);
                j11.f54889c.b();
            }
            this.f57417g = null;
        }
    }

    public final void b(View view) {
        kotlin.jvm.internal.m0.p(view, "view");
        InterfaceC3837m9 interfaceC3837m9 = this.f57416f;
        if (interfaceC3837m9 != null) {
            ((C3862n9) interfaceC3837m9).c("HtmlAdTracker", "stopTrackingForVisibility");
        }
        T7 t10 = this.f57418h;
        if (t10 != null) {
            t10.a(view);
            if (t10.f55515a.isEmpty()) {
                InterfaceC3837m9 interfaceC3837m10 = this.f57416f;
                if (interfaceC3837m10 != null) {
                    ((C3862n9) interfaceC3837m10).a("HtmlAdTracker", "Visibility tracker is free, removing it");
                }
                T7 t11 = this.f57418h;
                if (t11 != null) {
                    t11.b();
                }
                this.f57418h = null;
            }
        }
        this.f57419i.remove(view);
    }

    public final void a(View view, View token, Ln listener, AdConfig.ViewabilityConfig config, boolean z10) {
        int companionVisibilityMinPercentageViewed;
        kotlin.jvm.internal.m0.p(view, "view");
        kotlin.jvm.internal.m0.p(token, "token");
        kotlin.jvm.internal.m0.p(listener, "listener");
        kotlin.jvm.internal.m0.p(config, "config");
        InterfaceC3837m9 interfaceC3837m9 = this.f57416f;
        if (interfaceC3837m9 != null) {
            ((C3862n9) interfaceC3837m9).c("HtmlAdTracker", "startTrackingForVisibility");
        }
        T7 t10 = this.f57418h;
        if (t10 == null) {
            if (z10) {
                t10 = new S3(config, this.f57416f);
            } else {
                t10 = new T7(config, (byte) 1, this.f57416f);
            }
            this.f57418h = t10;
        }
        C3910p7 c3910p7 = new C3910p7(this);
        InterfaceC3837m9 interfaceC3837m10 = t10.f55518d;
        if (interfaceC3837m10 != null) {
            ((C3862n9) interfaceC3837m10).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        t10.f55522h = c3910p7;
        this.f57419i.put(view, listener);
        if (z10) {
            companionVisibilityMinPercentageViewed = config.getCompanionVisibilityMinPercentageViewed();
        } else {
            companionVisibilityMinPercentageViewed = this.f57415e;
        }
        kotlin.jvm.internal.m0.p(view, "view");
        t10.a(view, view, token, companionVisibilityMinPercentageViewed);
    }

    public final void a() {
        InterfaceC3837m9 interfaceC3837m9 = this.f57416f;
        if (interfaceC3837m9 != null) {
            ((C3862n9) interfaceC3837m9).c("HtmlAdTracker", "onActivityStarted");
        }
        J8 j10 = this.f57417g;
        if (j10 != null) {
            String TAG = j10.f54890d;
            kotlin.jvm.internal.m0.o(TAG, "TAG");
            for (Map.Entry entry : j10.f54887a.entrySet()) {
                View view = (View) entry.getKey();
                H8 h10 = (H8) entry.getValue();
                T7 t10 = j10.f54889c;
                View view2 = h10.f54771a;
                int i10 = h10.f54772b;
                t10.getClass();
                kotlin.jvm.internal.m0.p(view, "view");
                t10.a(view, view, view2, i10);
            }
            if (!j10.f54891e.hasMessages(0)) {
                j10.f54891e.postDelayed(j10.f54892f, j10.f54893g);
            }
            j10.f54889c.e();
        }
        T7 t11 = this.f57418h;
        if (t11 != null) {
            t11.e();
        }
    }

    public final J8 a(byte b10, AdConfig.ViewabilityConfig viewabilityConfig) {
        J8 j10 = this.f57417g;
        if (j10 != null) {
            return j10;
        }
        InterfaceC3837m9 interfaceC3837m9 = this.f57416f;
        if (interfaceC3837m9 != null) {
            ((C3862n9) interfaceC3837m9).c("HtmlAdTracker", "creating Visibility Tracker for " + ((int) b10));
        }
        T7 t10 = new T7(viewabilityConfig, b10, this.f57416f);
        InterfaceC3837m9 interfaceC3837m10 = this.f57416f;
        if (interfaceC3837m10 != null) {
            ((C3862n9) interfaceC3837m10).c("HtmlAdTracker", "creating Impression Tracker for " + ((int) b10));
        }
        J8 j11 = new J8(viewabilityConfig, t10, this.f57420j);
        this.f57417g = j11;
        return j11;
    }
}
