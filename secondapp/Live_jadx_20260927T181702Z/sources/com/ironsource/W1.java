package com.ironsource;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.s1({"SMAP\nAuctionDataReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuctionDataReporter.kt\ncom/unity3d/ironsourceads/internal/auction/AuctionDataReporter\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,50:1\n32#2,2:51\n*S KotlinDebug\n*F\n+ 1 AuctionDataReporter.kt\ncom/unity3d/ironsourceads/internal/auction/AuctionDataReporter\n*L\n34#1:51,2\n*E\n"})
public final class W1 implements X1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final C4439o9 f60259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final com.ironsource.mediationsdk.d f60260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    private final C4233d2 f60261c;

    public W1(@oy.l C4439o9 instanceInfo, @oy.l com.ironsource.mediationsdk.d auctionDataUtils, @oy.m C4233d2 c4233d2) {
        kotlin.jvm.internal.m0.p(instanceInfo, "instanceInfo");
        kotlin.jvm.internal.m0.p(auctionDataUtils, "auctionDataUtils");
        this.f60259a = instanceInfo;
        this.f60260b = auctionDataUtils;
        this.f60261c = c4233d2;
    }

    @Override // com.ironsource.X1
    public void a(@oy.l String methodName) {
        List<String> listJ;
        kotlin.jvm.internal.m0.p(methodName, "methodName");
        C4233d2 c4233d2 = this.f60261c;
        if (c4233d2 == null || (listJ = c4233d2.b()) == null) {
            listJ = fr.h0.J();
        }
        a(listJ, methodName);
    }

    @Override // com.ironsource.X1
    public void b(@oy.l String methodName) {
        List<String> listJ;
        kotlin.jvm.internal.m0.p(methodName, "methodName");
        C4233d2 c4233d2 = this.f60261c;
        if (c4233d2 == null || (listJ = c4233d2.a()) == null) {
            listJ = fr.h0.J();
        }
        a(listJ, methodName);
    }

    @Override // com.ironsource.X1
    public void c(@oy.l String methodName) {
        List<String> listJ;
        kotlin.jvm.internal.m0.p(methodName, "methodName");
        C4233d2 c4233d2 = this.f60261c;
        if (c4233d2 == null || (listJ = c4233d2.c()) == null) {
            listJ = fr.h0.J();
        }
        a(listJ, methodName);
    }

    private final void a(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f60260b.a(str, this.f60259a.e(), com.ironsource.mediationsdk.d.b().a(it.next(), this.f60259a.e(), this.f60259a.f(), this.f60259a.d(), "", "", "", ""));
        }
    }
}
