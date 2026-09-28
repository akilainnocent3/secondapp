package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import defpackage.o2g;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1lSDK implements AFa1hSDK {
    private final AFc1oSDK getCurrencyIso4217Code;

    public AFa1lSDK(AFc1oSDK aFc1oSDK) {
        aFc1oSDK.getClass();
        this.getCurrencyIso4217Code = aFc1oSDK;
    }

    @Override // com.appsflyer.internal.AFa1hSDK
    public final void getMediationNetwork() {
        this.getCurrencyIso4217Code.getCurrencyIso4217Code("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFa1hSDK
    public final Map<String, Object> getMonetizationNetwork() {
        if (this.getCurrencyIso4217Code.getRevenue("deeplink_data")) {
            try {
                String monetizationNetwork = this.getCurrencyIso4217Code.getMonetizationNetwork("deeplink_data", null);
                if (monetizationNetwork != null) {
                    return AFj1cSDK.getRevenue(new JSONObject(monetizationNetwork));
                }
                o2g o2gVar = o2g.a;
                o2gVar.getClass();
                return o2gVar;
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
            }
        }
        o2g o2gVar2 = o2g.a;
        o2gVar2.getClass();
        return o2gVar2;
    }

    @Override // com.appsflyer.internal.AFa1hSDK
    public final void getMonetizationNetwork(Map<String, ? extends Object> map) {
        map.getClass();
        this.getCurrencyIso4217Code.AFAdRevenueData("deeplink_data", new JSONObject(map).toString());
    }
}
