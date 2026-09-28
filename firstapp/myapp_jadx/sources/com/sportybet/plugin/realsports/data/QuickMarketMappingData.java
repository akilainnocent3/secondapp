package com.sportybet.plugin.realsports.data;

import android.text.TextUtils;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class QuickMarketMappingData {
    private static QuickMarketMappingData instance;
    private HashMap<String, RegularMarketRule> marketMapping = new HashMap<>();

    private QuickMarketMappingData() {
    }

    private String genKey(QuickMarketSpotEnum quickMarketSpotEnum, String str, String str2) {
        return quickMarketSpotEnum.getBlockCode() + ";" + str + ";" + str2;
    }

    public static QuickMarketMappingData getInstance() {
        QuickMarketMappingData quickMarketMappingData;
        QuickMarketMappingData quickMarketMappingData2 = instance;
        if (quickMarketMappingData2 != null) {
            return quickMarketMappingData2;
        }
        synchronized (QuickMarketMappingData.class) {
            try {
                quickMarketMappingData = instance;
                if (quickMarketMappingData == null) {
                    quickMarketMappingData = new QuickMarketMappingData();
                    instance = quickMarketMappingData;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return quickMarketMappingData;
    }

    public void add(QuickMarketSpotEnum quickMarketSpotEnum, String str, RegularMarketRule regularMarketRule) {
        if (quickMarketSpotEnum == null || TextUtils.isEmpty(str) || regularMarketRule == null) {
            return;
        }
        this.marketMapping.put(genKey(quickMarketSpotEnum, str, regularMarketRule.a), regularMarketRule);
    }

    public RegularMarketRule get(QuickMarketSpotEnum quickMarketSpotEnum, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        RegularMarketRule regularMarketRule = (quickMarketSpotEnum == null || TextUtils.isEmpty(str)) ? null : this.marketMapping.get(genKey(quickMarketSpotEnum, str, str2));
        return regularMarketRule == null ? RegularMarketRule.a(str2, null) : regularMarketRule;
    }
}
