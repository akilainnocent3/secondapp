package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class i implements PurchaseHistoryResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingConfig f95150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f95151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f95152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f95153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f95154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f95155f;

    public i(BillingConfig billingConfig, BillingClient billingClient, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f95150a = billingConfig;
        this.f95151b = billingClient;
        this.f95152c = utilsProvider;
        this.f95153d = str;
        this.f95154e = dVar;
        this.f95155f = nVar;
    }

    @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
    public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        this.f95152c.getWorkerExecutor().execute(new g(this, billingResult, list));
    }
}
