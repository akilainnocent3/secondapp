package com.fyber.inneractive.sdk.network;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class o1 extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jw.n0 f45350g;

    public o1(l lVar, jw.n0 n0Var) {
        this.f45350g = n0Var;
        this.f45327d = lVar.f45327d;
        this.f45326c = lVar.f45326c;
        this.f45328e = lVar.f45328e;
        this.f45324a = lVar.f45324a;
    }

    @Override // com.fyber.inneractive.sdk.network.l
    public final void a() {
        super.a();
        jw.n0 n0Var = this.f45350g;
        if (n0Var != null) {
            n0Var.close();
        }
    }
}
