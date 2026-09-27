package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class W0 extends C4430o0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    private final C4430o0 f60256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    private final S0 f60257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.m
    private InterfaceC4305h2 f60258i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(@oy.l C4430o0 adTools, @oy.l AbstractC4566w0 adUnitData, @oy.l E0.b level) {
        super(adTools, level);
        kotlin.jvm.internal.m0.p(adTools, "adTools");
        kotlin.jvm.internal.m0.p(adUnitData, "adUnitData");
        kotlin.jvm.internal.m0.p(level, "level");
        this.f60256g = adTools;
        S0 s0A = C4581wf.a(adUnitData, adUnitData.e().c());
        kotlin.jvm.internal.m0.o(s0A, "getAdUnitPerformance(\n  …auctionSavedHistoryLimit)");
        this.f60257h = s0A;
    }

    public final void a(@oy.m InterfaceC4305h2 interfaceC4305h2) {
        this.f60258i = interfaceC4305h2;
    }

    public final void c(@oy.l AbstractRunnableC4335ie task) {
        kotlin.jvm.internal.m0.p(task, "task");
        C4598xf.a(C4598xf.f64456a, task, 0L, 2, null);
    }

    @oy.l
    public final String e(@oy.l String serverData) {
        kotlin.jvm.internal.m0.p(serverData, "serverData");
        String strC = com.ironsource.mediationsdk.d.b().c(serverData);
        kotlin.jvm.internal.m0.o(strC, "getInstance().getDynamic…romServerData(serverData)");
        return strC;
    }

    @oy.l
    public final S0 h() {
        return this.f60257h;
    }

    @oy.m
    public final InterfaceC4305h2 i() {
        return this.f60258i;
    }

    @oy.m
    public final String j() {
        return com.ironsource.mediationsdk.r.m().l();
    }

    @oy.m
    public final C4259ea k() {
        return C4581wf.a();
    }

    @oy.l
    public final P8.a l() {
        return Lb.f59407s.a().h();
    }

    @oy.m
    public final BaseAdAdapter<?, ?> a(@oy.l B instanceData) {
        kotlin.jvm.internal.m0.p(instanceData, "instanceData");
        return com.ironsource.mediationsdk.c.b().a(instanceData.u(), instanceData.h(), instanceData.i().b().b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(@oy.l W0 adUnitTools, @oy.l E0.b level) {
        super(adUnitTools, level);
        kotlin.jvm.internal.m0.p(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.m0.p(level, "level");
        this.f60256g = adUnitTools.f60256g;
        this.f60257h = adUnitTools.f60257h;
        this.f60258i = adUnitTools.f60258i;
    }

    @oy.m
    public final BaseAdAdapter<?, ?> a(@oy.l NetworkSettings providerSettings, @oy.l IronSource.a adFormat, @oy.l UUID adId) {
        kotlin.jvm.internal.m0.p(providerSettings, "providerSettings");
        kotlin.jvm.internal.m0.p(adFormat, "adFormat");
        kotlin.jvm.internal.m0.p(adId, "adId");
        return com.ironsource.mediationsdk.c.b().a(providerSettings, adFormat, adId);
    }

    @oy.l
    public final String a(long j10, @oy.l String instanceName) {
        kotlin.jvm.internal.m0.p(instanceName, "instanceName");
        String strA = IronSourceUtils.a(j10, instanceName);
        kotlin.jvm.internal.m0.o(strA, "getTransId(timeStamp, instanceName)");
        return strA;
    }
}
