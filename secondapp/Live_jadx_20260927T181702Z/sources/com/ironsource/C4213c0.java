package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4213c0 implements InterfaceC4195b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final Ac f61147a;

    public C4213c0(@oy.l Ac networkShowApi) {
        kotlin.jvm.internal.m0.p(networkShowApi, "networkShowApi");
        this.f61147a = networkShowApi;
    }

    @Override // com.ironsource.InterfaceC4195b0
    public void a(@oy.l Activity activity, @oy.l O9 adInstance) {
        kotlin.jvm.internal.m0.p(activity, "activity");
        kotlin.jvm.internal.m0.p(adInstance, "adInstance");
        IronLog.ADAPTER_API.verbose("Show: networkInstanceId=" + adInstance.g() + " adInstanceId=" + adInstance.e());
        this.f61147a.a(activity, adInstance, new HashMap());
    }

    @Override // com.ironsource.InterfaceC4195b0
    public boolean a(@oy.l O9 adInstance) {
        kotlin.jvm.internal.m0.p(adInstance, "adInstance");
        return this.f61147a.a(adInstance);
    }
}
