package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class k implements PurchasesResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UtilsProvider f95212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ds.a f95213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f95214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f95215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f95216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f95217f;

    public k(UtilsProvider utilsProvider, ds.a aVar, List list, List list2, d dVar, n nVar) {
        this.f95212a = utilsProvider;
        this.f95213b = aVar;
        this.f95214c = list;
        this.f95215d = list2;
        this.f95216e = dVar;
        this.f95217f = nVar;
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f95212a.getWorkerExecutor().execute(new j(this, billingResult, list));
    }
}
