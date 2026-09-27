package com.fyber.inneractive.sdk.activities;

import com.fyber.inneractive.sdk.click.q;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements com.fyber.inneractive.sdk.click.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f44143a;

    public h(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f44143a = inneractiveInternalBrowserActivity;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        if (bVar.f44245a != q.FAILED) {
            InneractiveInternalBrowserActivity.a(this.f44143a, bVar);
            this.f44143a.finish();
        }
    }
}
