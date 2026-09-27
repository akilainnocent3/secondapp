package com.inmobi.media;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Rh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3594ci f55449a;

    public Rh(GestureDetectorOnGestureListenerC3594ci gestureDetectorOnGestureListenerC3594ci) {
        this.f55449a = gestureDetectorOnGestureListenerC3594ci;
    }

    public final void a(JSONObject jsonObject) {
        kotlin.jvm.internal.m0.p(jsonObject, "jsonObject");
        InterfaceC3837m9 interfaceC3837m9 = this.f55449a.f56180i;
        if (interfaceC3837m9 != null) {
            String str = GestureDetectorOnGestureListenerC3594ci.f56159g1;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$cp(...)");
            ((C3862n9) interfaceC3837m9).a(str, "onCCTLifeCycleEvent");
        }
        this.f55449a.c(jsonObject);
    }
}
