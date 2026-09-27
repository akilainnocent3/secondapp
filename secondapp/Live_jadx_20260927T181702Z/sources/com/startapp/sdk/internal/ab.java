package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yf f74538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yf f74539b;

    public ab(yf yfVar, yf yfVar2) {
        this.f74538a = yfVar;
        this.f74539b = yfVar2;
    }

    public final void a(de... deVarArr) {
        for (de deVar : deVarArr) {
            if (deVar.f74695d) {
                this.f74539b.a(deVar, deVar.f74696e.longValue());
            } else {
                this.f74538a.a(deVar, deVar.f74696e.longValue());
            }
        }
    }
}
