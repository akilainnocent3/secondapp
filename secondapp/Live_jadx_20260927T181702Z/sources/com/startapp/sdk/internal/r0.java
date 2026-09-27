package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class r0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f75442a;

    public r0(s0 s0Var) {
        this.f75442a = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s0 s0Var = this.f75442a;
        s0Var.getClass();
        try {
            b9.a(s0Var.f75481a, (List) s0.a(s0Var.f75482b), new TrackingParams().a("APP_PRESENCE"));
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }
}
