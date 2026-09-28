package com.appsflyer.internal;

import com.appsflyer.internal.AFe1nSDK.AnonymousClass3;
import defpackage.qlr;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1qSDK {
    public final AFc1gSDK AFAdRevenueData;
    private final AFf1cSDK component2;
    private final AFe1nSDK component4;
    private final AFc1pSDK getCurrencyIso4217Code;
    private final ExecutorService getMediationNetwork;
    private final AFg1rSDK getMonetizationNetwork;
    public final AFc1oSDK getRevenue;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1qSDK$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFe1uSDK;", "p0", "", "getRevenue", "(Lcom/appsflyer/internal/AFe1uSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends qlr implements Function1<AFe1uSDK, Unit> {
        public static final AnonymousClass1 getRevenue = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void getRevenue(AFe1uSDK aFe1uSDK) {
            aFe1uSDK.getClass();
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFe1uSDK aFe1uSDK) {
            getRevenue(aFe1uSDK);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1qSDK$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFe1uSDK;", "p0", "", "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFe1uSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass5 extends qlr implements Function1<AFe1uSDK, Unit> {
        public AnonymousClass5() {
            super(1);
        }

        public final void getMonetizationNetwork(AFe1uSDK aFe1uSDK) {
            aFe1uSDK.getClass();
            if (aFe1uSDK == AFe1uSDK.SUCCESS) {
                AFe1qSDK.this.getRevenue.getCurrencyIso4217Code("didSendRevenueTriggerOnLastBackground", true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFe1uSDK aFe1uSDK) {
            getMonetizationNetwork(aFe1uSDK);
            return Unit.a;
        }
    }

    public AFe1qSDK(AFc1oSDK aFc1oSDK, AFc1gSDK aFc1gSDK, AFc1pSDK aFc1pSDK, ExecutorService executorService, AFg1rSDK aFg1rSDK, AFf1cSDK aFf1cSDK, AFe1nSDK aFe1nSDK) {
        aFc1oSDK.getClass();
        aFc1gSDK.getClass();
        aFc1pSDK.getClass();
        executorService.getClass();
        aFg1rSDK.getClass();
        aFf1cSDK.getClass();
        aFe1nSDK.getClass();
        this.getRevenue = aFc1oSDK;
        this.AFAdRevenueData = aFc1gSDK;
        this.getCurrencyIso4217Code = aFc1pSDK;
        this.getMediationNetwork = executorService;
        this.getMonetizationNetwork = aFg1rSDK;
        this.component2 = aFf1cSDK;
        this.component4 = aFe1nSDK;
    }

    public final void AFAdRevenueData(AFe1rSDK aFe1rSDK, Function1<? super AFe1uSDK, Unit> function1) {
        aFe1rSDK.getClass();
        function1.getClass();
        AFe1aSDK aFe1aSDK = new AFe1aSDK(aFe1rSDK, this.getMediationNetwork, this.getCurrencyIso4217Code, this.AFAdRevenueData, this.getMonetizationNetwork, this.component2, function1);
        AFe1nSDK aFe1nSDK = this.component4;
        aFe1nSDK.AFAdRevenueData.execute(aFe1nSDK.new AnonymousClass3(aFe1aSDK));
    }

    public final void AFAdRevenueData() {
        if (this.getRevenue.getMediationNetwork("didSendRevenueTriggerOnLastBackground", true) || !AFj1iSDK.AFAdRevenueData(this.AFAdRevenueData.getRevenue)) {
            return;
        }
        AFAdRevenueData(AFe1rSDK.AFa1tSDK.INSTANCE, new AnonymousClass5());
    }
}
