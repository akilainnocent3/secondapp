package com.startapp.sdk.ads.list3d;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DView f74132a;

    public d(List3DView list3DView) {
        this.f74132a = list3DView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iA;
        List3DView list3DView = this.f74132a;
        if (list3DView.f74106b != 1 || (iA = list3DView.a(list3DView.f74107c, list3DView.f74108d)) == -1) {
            return;
        }
        this.f74132a.a(iA);
    }
}
