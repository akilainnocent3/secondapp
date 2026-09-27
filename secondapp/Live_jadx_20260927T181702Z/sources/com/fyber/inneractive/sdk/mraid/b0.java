package com.fyber.inneractive.sdk.mraid;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.web.c0 f45247a;

    public b0(com.fyber.inneractive.sdk.web.c0 c0Var) {
        this.f45247a = c0Var;
    }

    @Override // com.fyber.inneractive.sdk.mraid.y
    public final String a() {
        return "placementType: '" + this.f45247a.toString().toLowerCase(Locale.US) + "'";
    }
}
