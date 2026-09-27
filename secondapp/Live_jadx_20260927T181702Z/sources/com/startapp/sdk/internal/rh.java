package com.startapp.sdk.internal;

import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class rh extends sh {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh f75468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh f75469e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(vh vhVar, TelephonyManager telephonyManager, Class cls) {
        super(vhVar, telephonyManager, cls);
        this.f75469e = vhVar;
        this.f75468d = new qh(this);
    }

    @Override // com.startapp.sdk.internal.sh
    public final void a() {
        this.f75511a.registerTelephonyCallback((Executor) this.f75469e.f75710b.a(), this.f75468d);
    }

    @Override // com.startapp.sdk.internal.sh
    public final void b() {
        this.f75511a.unregisterTelephonyCallback(this.f75468d);
    }
}
