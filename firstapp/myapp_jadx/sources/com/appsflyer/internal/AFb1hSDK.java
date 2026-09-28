package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1hSDK implements AFb1bSDK {
    private final AFf1cSDK AFAdRevenueData;
    private final AFc1eSDK getMonetizationNetwork;
    private final AFc1gSDK getRevenue;

    public AFb1hSDK(AFc1eSDK aFc1eSDK, AFc1gSDK aFc1gSDK, AFf1cSDK aFf1cSDK) {
        aFc1eSDK.getClass();
        aFc1gSDK.getClass();
        aFf1cSDK.getClass();
        this.getMonetizationNetwork = aFc1eSDK;
        this.getRevenue = aFc1gSDK;
        this.AFAdRevenueData = aFf1cSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFb1hSDK aFb1hSDK, AppSetIdInfo appSetIdInfo) {
        aFb1hSDK.getClass();
        AFc1eSDK aFc1eSDK = aFb1hSDK.getMonetizationNetwork;
        int scope = appSetIdInfo.getScope();
        String id = appSetIdInfo.getId();
        id.getClass();
        aFc1eSDK.equals = new AFb1gSDK(scope, id);
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final boolean getMonetizationNetwork() {
        return !this.AFAdRevenueData.getMonetizationNetwork() && !this.getMonetizationNetwork.getMediationNetwork() && AFj1iSDK.getRevenue(this.getRevenue.getRevenue) && AFj1iSDK.getMonetizationNetwork(this.getRevenue.getRevenue);
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void getRevenue() {
        Context context = this.getRevenue.getRevenue;
        if (context != null) {
            try {
                AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener() { // from class: com.appsflyer.internal.i
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        AFb1hSDK.getMediationNetwork(this.a, (AppSetIdInfo) obj);
                    }
                }).getClass();
            } catch (Throwable th) {
                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "Error while trying to  fetch App set ID", th, false, false, false, false, 120, null);
                Unit unit = Unit.a;
            }
        }
    }
}
