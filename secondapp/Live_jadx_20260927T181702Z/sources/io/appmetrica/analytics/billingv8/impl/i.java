package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class i implements PurchasesResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingConfig f95203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f95204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f95205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f95206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f95207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f95208f;

    public i(BillingConfig billingConfig, BillingClient billingClient, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f95203a = billingConfig;
        this.f95204b = billingClient;
        this.f95205c = utilsProvider;
        this.f95206d = str;
        this.f95207e = dVar;
        this.f95208f = nVar;
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f95205c.getWorkerExecutor().execute(new g(this, billingResult, list));
    }
}
