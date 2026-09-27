package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.impl.j;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class j implements BillingInfoSender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceComponentModuleReporter f95039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f95040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f95041c;

    public j(@oy.l ServiceComponentModuleReporter serviceComponentModuleReporter, @oy.l Executor executor, @oy.l o oVar) {
        this.f95039a = serviceComponentModuleReporter;
        this.f95040b = executor;
        this.f95041c = oVar;
    }

    public static final void a(j jVar, ProductInfo productInfo) {
        ServiceComponentModuleReporter serviceComponentModuleReporter = jVar.f95039a;
        ServiceModuleCounterReport.Builder builderWithType = ServiceModuleCounterReport.Companion.newBuilder().withType(40976);
        jVar.f95041c.getClass();
        serviceComponentModuleReporter.handleReport(builderWithType.withValueBytes(o.a(productInfo)).build());
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender
    public final void sendInfo(@oy.l List<? extends ProductInfo> list) {
        for (final ProductInfo productInfo : list) {
            this.f95040b.execute(new Runnable() { // from class: uq.a
                @Override // java.lang.Runnable
                public final void run() {
                    j.a(this.f139642b, productInfo);
                }
            });
        }
    }

    public /* synthetic */ j(ServiceComponentModuleReporter serviceComponentModuleReporter, Executor executor, o oVar, int i10, kotlin.jvm.internal.x xVar) {
        this(serviceComponentModuleReporter, executor, (i10 & 4) != 0 ? new o() : oVar);
    }
}
