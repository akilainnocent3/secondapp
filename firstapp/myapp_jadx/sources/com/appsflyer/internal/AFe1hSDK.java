package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFe1hSDK extends AFe1gSDK {
    private final PurchaseHandler.PurchaseValidationCallback areAllFieldsValid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1hSDK(AFe1mSDK aFe1mSDK, AFe1mSDK[] aFe1mSDKArr, AFc1bSDK aFc1bSDK, Map<String, ? extends Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFe1mSDK, aFe1mSDKArr, aFc1bSDK, null, map);
        aFe1mSDK.getClass();
        aFe1mSDKArr.getClass();
        aFc1bSDK.getClass();
        map.getClass();
        this.areAllFieldsValid = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1lSDK
    public boolean AFAdRevenueData() {
        ResponseNetwork responseNetwork = ((AFe1eSDK) this).component3;
        if (responseNetwork != null) {
            responseNetwork.getClass();
            if (responseNetwork.getStatusCode() == 503) {
                return true;
            }
        }
        return super.AFAdRevenueData();
    }

    @Override // com.appsflyer.internal.AFe1gSDK
    public final boolean component2() {
        return true;
    }

    @Override // com.appsflyer.internal.AFe1gSDK
    public final String getMediationNetwork(Map<String, Object> map) {
        map.getClass();
        if (map.containsKey("billing_library_version")) {
            Object objRemove = map.remove("billing_library_version");
            if (objRemove instanceof String) {
                return (String) objRemove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFe1gSDK
    public final String getMonetizationNetwork(Map<String, Object> map) {
        map.getClass();
        if (map.containsKey("connector_version")) {
            Object objRemove = map.remove("connector_version");
            if (objRemove instanceof String) {
                return (String) objRemove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1lSDK
    public final void getRevenue() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.getRevenue();
        Throwable thComponent1 = component1();
        if (thComponent1 != null && (purchaseValidationCallback2 = this.areAllFieldsValid) != null) {
            purchaseValidationCallback2.onFailure(thComponent1);
        }
        ResponseNetwork<String> responseNetwork = ((AFe1eSDK) this).component3;
        if (responseNetwork == null || (purchaseValidationCallback = this.areAllFieldsValid) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }
}
