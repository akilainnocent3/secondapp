package com.yandex.mobile.ads.nativeads;

import yads.r20;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomClickHandler f76947a;

    public b(CustomClickHandler customClickHandler) {
        this.f76947a = customClickHandler;
    }

    public final void a(String str, r20 r20Var) {
        this.f76947a.handleCustomClick(str, new c(r20Var));
    }
}
