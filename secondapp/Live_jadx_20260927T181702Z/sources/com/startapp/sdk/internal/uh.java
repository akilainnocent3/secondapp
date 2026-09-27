package com.startapp.sdk.internal;

import android.telephony.TelephonyManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class uh extends sh {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final th f75654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh f75655e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh(vh vhVar, TelephonyManager telephonyManager, Class cls) {
        super(vhVar, telephonyManager, cls);
        this.f75655e = vhVar;
        this.f75654d = new th(this);
    }

    @Override // com.startapp.sdk.internal.sh
    public final void a() {
        this.f75511a.listen(this.f75654d, 257);
    }

    @Override // com.startapp.sdk.internal.sh
    public final void b() {
        this.f75511a.listen(this.f75654d, 0);
    }
}
