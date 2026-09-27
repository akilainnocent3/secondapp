package com.fyber.inneractive.sdk.config;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements com.fyber.inneractive.sdk.network.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f44425a;

    public p(s sVar) {
        this.f44425a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        o oVar = (o) obj;
        if (oVar != null) {
            s sVar = this.f44425a;
            if (oVar.equals(sVar.f44480b)) {
                return;
            }
            sVar.f44482d = true;
            sVar.f44480b = oVar;
            com.fyber.inneractive.sdk.util.r.f47891a.execute(new q(sVar));
        }
    }
}
