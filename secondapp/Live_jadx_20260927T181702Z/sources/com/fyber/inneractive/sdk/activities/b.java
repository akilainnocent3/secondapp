package com.fyber.inneractive.sdk.activities;

import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveBaseActivity f44137a;

    public b(InneractiveBaseActivity inneractiveBaseActivity) {
        this.f44137a = inneractiveBaseActivity;
    }

    public final void onBackInvoked() {
        this.f44137a.onBackPressed();
    }
}
