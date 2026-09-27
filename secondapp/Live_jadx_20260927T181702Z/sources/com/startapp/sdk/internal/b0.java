package com.startapp.sdk.internal;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class b0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f74572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.adsbase.adinformation.a f74573b;

    public b0(com.startapp.sdk.adsbase.adinformation.a aVar, q qVar) {
        this.f74573b = aVar;
        this.f74572a = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q qVar = this.f74572a;
        com.startapp.sdk.adsbase.adinformation.a aVar = this.f74573b;
        qVar.a(aVar.f74263e, aVar.f74264f);
    }
}
