package com.appsflyer.internal;

import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AdRevenueScheme;
import com.twilio.voice.EventKeys;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1sSDK extends AFf1uSDK {
    private final AFh1nSDK toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1sSDK(AFh1nSDK aFh1nSDK, AFc1bSDK aFc1bSDK) {
        super(aFh1nSDK, aFc1bSDK);
        aFh1nSDK.getClass();
        aFc1bSDK.getClass();
        this.toString = aFh1nSDK;
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final void getMediationNetwork(AFh1jSDK aFh1jSDK) {
        aFh1jSDK.getClass();
        super.getMediationNetwork(aFh1jSDK);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        AFAdRevenueData aFAdRevenueData = this.toString.hashCode;
        aFAdRevenueData.getClass();
        linkedHashMap.put("monetization_network", aFAdRevenueData.getMonetizationNetwork());
        linkedHashMap.put("event_revenue_currency", aFAdRevenueData.getCurrencyIso4217Code());
        linkedHashMap.put("mediation_network", aFAdRevenueData.getMediationNetwork().getValue());
        linkedHashMap.put("event_revenue", Double.valueOf(aFAdRevenueData.getRevenue()));
        Map<String, Object> map = this.toString.copydefault;
        if (map != null && !map.isEmpty()) {
            List listK = kotlin.collections.b.k(AdRevenueScheme.AD_TYPE, AdRevenueScheme.AD_UNIT, "country", AdRevenueScheme.PLACEMENT);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (listK.contains(key)) {
                    linkedHashMap.put(key, value);
                } else {
                    linkedHashMap2.put(key, value);
                }
            }
            linkedHashMap.put("custom_parameters", linkedHashMap2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("name", "adrevenue_sdk");
        linkedHashMap3.put(EventKeys.PAYLOAD, linkedHashMap);
        Map<String, Object> map2 = aFh1jSDK.getCurrencyIso4217Code;
        map2.getClass();
        map2.put("ad_network", linkedHashMap3);
    }
}
