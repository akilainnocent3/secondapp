package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerProperties;
import defpackage.jpu;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1fSDK implements AFf1gSDK {
    private final AFc1eSDK getMediationNetwork;
    private final AFf1bSDK getMonetizationNetwork;
    private final AppsFlyerProperties getRevenue;

    public AFf1fSDK(AFf1bSDK aFf1bSDK, AFc1eSDK aFc1eSDK, AppsFlyerProperties appsFlyerProperties) {
        aFf1bSDK.getClass();
        aFc1eSDK.getClass();
        appsFlyerProperties.getClass();
        this.getMonetizationNetwork = aFf1bSDK;
        this.getMediationNetwork = aFc1eSDK;
        this.getRevenue = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    public final void getMediationNetwork(Map<String, Object> map, AFe1mSDK aFe1mSDK) {
        map.getClass();
        aFe1mSDK.getClass();
        AFg1ySDK currencyIso4217Code = this.getMonetizationNetwork.getCurrencyIso4217Code();
        AppsFlyerConsent appsFlyerConsent = this.getMediationNetwork.areAllFieldsValid;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (appsFlyerConsent != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Boolean boolIsUserSubjectToGDPR = appsFlyerConsent.isUserSubjectToGDPR();
            if (boolIsUserSubjectToGDPR != null) {
                linkedHashMap2.put("gdpr_applies", boolIsUserSubjectToGDPR);
            }
            Boolean hasConsentForDataUsage = appsFlyerConsent.getHasConsentForDataUsage();
            if (hasConsentForDataUsage != null) {
                linkedHashMap2.put("ad_user_data_enabled", hasConsentForDataUsage);
            }
            Boolean hasConsentForAdsPersonalization = appsFlyerConsent.getHasConsentForAdsPersonalization();
            if (hasConsentForAdsPersonalization != null) {
                linkedHashMap2.put("ad_personalization_enabled", hasConsentForAdsPersonalization);
            }
            Boolean hasConsentForAdStorage = appsFlyerConsent.getHasConsentForAdStorage();
            if (hasConsentForAdStorage != null) {
                linkedHashMap2.put("ad_storage_enabled", hasConsentForAdStorage);
            }
            linkedHashMap.put("manual", linkedHashMap2);
        }
        if (currencyIso4217Code != null) {
            boolean z = appsFlyerConsent != null;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("policy_version", Integer.valueOf(currencyIso4217Code.getCurrencyIso4217Code));
            linkedHashMap3.put("cmp_sdk_id", Integer.valueOf(currencyIso4217Code.getMonetizationNetwork));
            linkedHashMap3.put("cmp_sdk_version", Integer.valueOf(currencyIso4217Code.getRevenue));
            if (z) {
                linkedHashMap3.put("gdpr_applies", -1);
                linkedHashMap3.put("tcstring", "");
            } else {
                linkedHashMap3.put("gdpr_applies", Integer.valueOf(currencyIso4217Code.AFAdRevenueData));
                linkedHashMap3.put("tcstring", currencyIso4217Code.getMediationNetwork);
            }
            linkedHashMap.put("tcf", linkedHashMap3);
        }
        if (!linkedHashMap.isEmpty()) {
            map.put("consent_data", linkedHashMap);
        }
        if (aFe1mSDK != AFe1mSDK.CONVERSION || this.getRevenue.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION) == null) {
            return;
        }
        Map<String, Object> monetizationNetwork = AFa1uSDK.getMonetizationNetwork(map);
        monetizationNetwork.getClass();
        monetizationNetwork.put("api", jpu.b(new Pair(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, this.getRevenue.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))));
    }
}
