package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import defpackage.kpu;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFe1gSDK extends AFe1eSDK<String> {
    private final AFe1mSDK areAllFieldsValid;
    private final Map<String, Object> copy;
    private final AFc1pSDK copydefault;
    private final AFc1oSDK equals;
    private final AFf1gSDK hashCode;
    private final AFg1rSDK toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1gSDK(AFe1mSDK aFe1mSDK, AFe1mSDK[] aFe1mSDKArr, AFc1bSDK aFc1bSDK, String str, Map<String, ? extends Object> map) {
        super(aFe1mSDK, aFe1mSDKArr, aFc1bSDK, null);
        aFe1mSDK.getClass();
        aFe1mSDKArr.getClass();
        aFc1bSDK.getClass();
        map.getClass();
        this.areAllFieldsValid = aFe1mSDK;
        this.copy = map;
        AFc1pSDK currencyIso4217Code = aFc1bSDK.getCurrencyIso4217Code();
        currencyIso4217Code.getClass();
        this.copydefault = currencyIso4217Code;
        AFc1oSDK aFc1oSDKComponent2 = aFc1bSDK.component2();
        aFc1oSDKComponent2.getClass();
        this.equals = aFc1oSDKComponent2;
        AFg1rSDK aFg1rSDKComponent4 = aFc1bSDK.component4();
        aFg1rSDKComponent4.getClass();
        this.toString = aFg1rSDKComponent4;
        AFf1gSDK aFf1gSDKForce = aFc1bSDK.force();
        aFf1gSDKForce.getClass();
        this.hashCode = aFf1gSDKForce;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    public boolean component2() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean copydefault() {
        return true;
    }

    public abstract AFd1jSDK<String> getMediationNetwork(Map<String, Object> map, String str, String str2);

    public void getMediationNetwork(Map<String, Object> map, String str) {
        map.getClass();
        map.put(PublisherMetadata.APP_ID, this.copydefault.getRevenue.getRevenue.getPackageName());
        String revenue = AFc1pSDK.getRevenue();
        if (revenue != null) {
            map.put("cuid", revenue);
        }
        map.put("app_version_name", this.copydefault.n_().versionName);
        if (component2()) {
            map.put("event_timestamp", Long.valueOf(this.toString.getCurrencyIso4217Code()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }

    public String getMonetizationNetwork(Map<String, Object> map) {
        map.getClass();
        return null;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFd1jSDK<String> getRevenue(String str) {
        AFd1dSDK aFd1dSDK;
        str.getClass();
        Map<String, Object> mapM = kpu.m(this.copy);
        String mediationNetwork = getMediationNetwork(mapM);
        String monetizationNetwork = getMonetizationNetwork(mapM);
        Map<String, Object> linkedHashMap = new LinkedHashMap<>(mapM);
        getMediationNetwork(linkedHashMap, mediationNetwork);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String strComponent4 = this.copydefault.component4();
        if (strComponent4 != null && !StringsKt.U(strComponent4)) {
            linkedHashMap2.put("advertising_id", strComponent4);
        }
        AFb1mSDK currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(this.copydefault.getRevenue.getRevenue);
        String str2 = null;
        String str3 = currencyIso4217Code != null ? currencyIso4217Code.getCurrencyIso4217Code : null;
        if (str3 != null && !StringsKt.U(str3)) {
            linkedHashMap2.put("oaid", str3);
        }
        AFb1mSDK aFb1mSDKL_ = AFb1kSDK.l_(this.copydefault.getRevenue.getRevenue.getContentResolver());
        String str4 = aFb1mSDKL_ != null ? aFb1mSDKL_.getCurrencyIso4217Code : null;
        if (str4 != null && !StringsKt.U(str4)) {
            linkedHashMap2.put("amazon_aid", str4);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            linkedHashMap.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        } else {
            String mediationNetwork2 = ((AFe1eSDK) this).component2.getMediationNetwork(this.equals);
            if (mediationNetwork2 != null && !StringsKt.U(mediationNetwork2)) {
                linkedHashMap2.put("imei", mediationNetwork2);
            }
        }
        String revenue = AFb1jSDK.getRevenue(this.copydefault.getMonetizationNetwork);
        if (revenue == null) {
            revenue = "";
        }
        linkedHashMap2.put("appsflyer_id", revenue);
        linkedHashMap2.put(PublisherMetadata.OS_VERSION, String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap2.put(EventKeys.SDK_VERSION_KEY, "6.17.3");
        if (monetizationNetwork != null && !StringsKt.U(monetizationNetwork)) {
            linkedHashMap2.put("sdk_connector_version", monetizationNetwork);
        }
        this.toString.getMonetizationNetwork(linkedHashMap2, this.areAllFieldsValid);
        linkedHashMap.put("device_data", linkedHashMap2);
        this.hashCode.getMediationNetwork(linkedHashMap, this.areAllFieldsValid);
        AFd1jSDK<String> mediationNetwork3 = getMediationNetwork(linkedHashMap, str, mediationNetwork);
        if (mediationNetwork3 != null && (aFd1dSDK = mediationNetwork3.getRevenue) != null) {
            str2 = aFd1dSDK.getRevenue;
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            AFg1bSDK.getMediationNetwork(toString() + ": preparing data: ", jSONObject);
            AFd1mSDK aFd1mSDK = this.component4;
            String string = jSONObject.toString();
            string.getClass();
            aFd1mSDK.getMonetizationNetwork(str2, string);
        }
        return mediationNetwork3;
    }

    public String getMediationNetwork(Map<String, Object> map) {
        map.getClass();
        return null;
    }
}
