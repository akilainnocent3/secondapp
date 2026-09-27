package com.ironsource;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.e6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4255e6 implements Kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private InterfaceC4273f6 f61614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private WeakReference<InterfaceC4291g6> f61615b = new WeakReference<>(null);

    /* JADX INFO: renamed from: com.ironsource.e6$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f61616a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final String f61617b = "impressions";

        private a() {
        }
    }

    public final void a(@oy.l InterfaceC4273f6 loadListener) {
        kotlin.jvm.internal.m0.p(loadListener, "loadListener");
        this.f61614a = loadListener;
    }

    @Override // com.ironsource.Kc
    public void onInterstitialAdRewarded(@oy.m String str, int i10) {
        InterfaceC4291g6 interfaceC4291g6 = this.f61615b.get();
        if (interfaceC4291g6 != null) {
            interfaceC4291g6.onAdInstanceDidReward(str, i10);
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialClick() {
        InterfaceC4291g6 interfaceC4291g6 = this.f61615b.get();
        if (interfaceC4291g6 != null) {
            interfaceC4291g6.onAdInstanceDidClick();
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialClose() {
        InterfaceC4291g6 interfaceC4291g6 = this.f61615b.get();
        if (interfaceC4291g6 != null) {
            interfaceC4291g6.onAdInstanceDidDismiss();
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialEventNotificationReceived(@oy.m String str, @oy.m JSONObject jSONObject) {
        InterfaceC4291g6 interfaceC4291g6;
        if (!kotlin.jvm.internal.m0.g(str, "impressions") || (interfaceC4291g6 = this.f61615b.get()) == null) {
            return;
        }
        interfaceC4291g6.onAdInstanceDidBecomeVisible();
    }

    @Override // com.ironsource.Kc
    public void onInterstitialLoadFailed(@oy.l String description) {
        kotlin.jvm.internal.m0.p(description, "description");
        InterfaceC4273f6 interfaceC4273f6 = this.f61614a;
        if (interfaceC4273f6 != null) {
            interfaceC4273f6.a(description);
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialLoadSuccess(@oy.l O9 adInstance) {
        kotlin.jvm.internal.m0.p(adInstance, "adInstance");
        InterfaceC4273f6 interfaceC4273f6 = this.f61614a;
        if (interfaceC4273f6 != null) {
            interfaceC4273f6.a(adInstance);
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialOpen() {
        InterfaceC4291g6 interfaceC4291g6 = this.f61615b.get();
        if (interfaceC4291g6 != null) {
            interfaceC4291g6.onAdInstanceDidShow();
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialShowFailed(@oy.m String str) {
        InterfaceC4291g6 interfaceC4291g6 = this.f61615b.get();
        if (interfaceC4291g6 != null) {
            interfaceC4291g6.a(str);
        }
    }

    public final void a(@oy.l InterfaceC4291g6 showListener) {
        kotlin.jvm.internal.m0.p(showListener, "showListener");
        this.f61615b = new WeakReference<>(showListener);
    }

    @Override // com.ironsource.Kc
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.Kc
    public void onInterstitialShowSuccess() {
    }

    @Override // com.ironsource.Kc
    public void onInterstitialInitFailed(@oy.m String str) {
    }
}
