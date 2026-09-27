package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.u1;
import com.fyber.inneractive.sdk.util.v1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f44767a;

    public n0(p0 p0Var) {
        this.f44767a = p0Var;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        com.fyber.inneractive.sdk.util.r.f47892b.post(this.f44767a.f44852l);
        p0 p0Var = this.f44767a;
        v1 v1Var = p0Var.f44853m;
        if (v1Var != null) {
            v1Var.f47916e = null;
            p0Var.f44853m = null;
        }
        p0Var.f44857q = false;
    }
}
