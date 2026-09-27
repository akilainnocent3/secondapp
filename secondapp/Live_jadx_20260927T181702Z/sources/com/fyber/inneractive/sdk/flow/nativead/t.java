package com.fyber.inneractive.sdk.flow.nativead;

import android.net.Uri;
import com.fyber.inneractive.sdk.network.f0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.f f44834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f44835b;

    public t(com.fyber.inneractive.sdk.response.nativead.f fVar, s sVar) {
        this.f44834a = fVar;
        this.f44835b = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        Uri uri = (Uri) obj;
        if (exc instanceof com.fyber.inneractive.sdk.network.g) {
            return;
        }
        if (exc != null || uri == null) {
            this.f44835b.a(null, exc, this.f44834a);
            return;
        }
        s sVar = this.f44835b;
        com.fyber.inneractive.sdk.response.nativead.f fVar = this.f44834a;
        sVar.a(new g(fVar.f47751a, uri), null, fVar);
    }
}
