package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.applovin.impl.sdk.utils.JsonUtils;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class j extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f95156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f95157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f95158c;

    public j(k kVar, BillingResult billingResult, List list) {
        this.f95156a = kVar;
        this.f95157b = billingResult;
        this.f95158c = list;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0198  */
    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        ProductInfo productInfo;
        String originalJson;
        String priceCurrencyCode;
        String originalJson2;
        k kVar = this.f95156a;
        BillingResult billingResult = this.f95157b;
        List<Purchase> list = this.f95158c;
        kVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            kVar.f95164f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Purchase purchase : list) {
                Iterator<String> it = purchase.getProducts().iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(it.next(), purchase);
                }
            }
            List<PurchaseHistoryRecord> list2 = kVar.f95161c;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list2) {
                Iterator<String> it2 = purchaseHistoryRecord.getProducts().iterator();
                while (it2.hasNext()) {
                    linkedHashMap2.put(it2.next(), purchaseHistoryRecord);
                }
            }
            List<ProductDetails> list3 = kVar.f95162d;
            ArrayList arrayList = new ArrayList();
            for (ProductDetails productDetails : list3) {
                PurchaseHistoryRecord purchaseHistoryRecord2 = (PurchaseHistoryRecord) linkedHashMap2.get(productDetails.getProductId());
                if (purchaseHistoryRecord2 != null) {
                    Purchase purchase2 = (Purchase) linkedHashMap.get(productDetails.getProductId());
                    String productType = productDetails.getProductType();
                    int iHashCode = productType.hashCode();
                    if (iHashCode != 3541555) {
                        if (iHashCode == 100343516 && productType.equals("inapp")) {
                            String productType2 = productDetails.getProductType();
                            ProductType productType3 = m0.g(productType2, "inapp") ? ProductType.INAPP : m0.g(productType2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN;
                            String productId = productDetails.getProductId();
                            int quantity = purchaseHistoryRecord2.getQuantity();
                            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                            long priceAmountMicros = oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.getPriceAmountMicros() : 0L;
                            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2 = productDetails.getOneTimePurchaseOfferDetails();
                            if (oneTimePurchaseOfferDetails2 == null || (priceCurrencyCode = oneTimePurchaseOfferDetails2.getPriceCurrencyCode()) == null) {
                                priceCurrencyCode = "";
                            }
                            productInfo = new ProductInfo(productType3, productId, quantity, priceAmountMicros, priceCurrencyCode, 0L, null, 1, null, purchaseHistoryRecord2.getSignature(), purchaseHistoryRecord2.getPurchaseToken(), purchaseHistoryRecord2.getPurchaseTime(), purchase2 != null ? purchase2.isAutoRenewing() : false, (purchase2 == null || (originalJson2 = purchase2.getOriginalJson()) == null) ? JsonUtils.EMPTY_JSON : originalJson2);
                        } else {
                            productInfo = null;
                        }
                    } else if (productType.equals("subs")) {
                        String productType4 = productDetails.getProductType();
                        productInfo = new ProductInfo(m0.g(productType4, "inapp") ? ProductType.INAPP : m0.g(productType4, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, productDetails.getProductId(), purchaseHistoryRecord2.getQuantity(), 0L, "", 0L, null, 1, null, purchaseHistoryRecord2.getSignature(), purchaseHistoryRecord2.getPurchaseToken(), purchaseHistoryRecord2.getPurchaseTime(), purchase2 != null ? purchase2.isAutoRenewing() : false, (purchase2 == null || (originalJson = purchase2.getOriginalJson()) == null) ? JsonUtils.EMPTY_JSON : originalJson);
                    } else {
                        productInfo = null;
                    }
                } else {
                    productInfo = null;
                }
                ProductInfo productInfo2 = productInfo;
                if (productInfo2 != null) {
                    arrayList.add(productInfo2);
                }
            }
            kVar.f95159a.getBillingInfoSender().sendInfo(arrayList);
            kVar.f95160b.invoke();
            kVar.f95164f.onUpdateFinished();
        }
        k kVar2 = this.f95156a;
        kVar2.f95163e.a(kVar2);
    }
}
