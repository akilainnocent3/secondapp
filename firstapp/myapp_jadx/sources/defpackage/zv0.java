package defpackage;

import android.text.TextUtils;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AppsFlyerConversionListener;
import com.sporty.android.core.model.MyLog;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zv0 implements AppsFlyerConversionListener {
    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onAppOpenAttribution(Map<String, String> map) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_APPSFLYER);
        aVar.a("onAppOpenAttribution: " + map, new Object[0]);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onAttributionFailure(String str) {
        itf0.a aVar = itf0.a;
        aVar.n(yv0.a(aVar, MyLog.TAG_APPSFLYER, "onAttributionFailure: ", str), new Object[0]);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onConversionDataFail(String str) {
        itf0.a aVar = itf0.a;
        aVar.n(yv0.a(aVar, MyLog.TAG_APPSFLYER, "onConversionDataFail: ", str), new Object[0]);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onConversionDataSuccess(Map<String, ? extends Object> map) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_APPSFLYER);
        aVar.g("onConversionDataSuccess, " + map, new Object[0]);
        if (map != null) {
            boolean z = Boolean.parseBoolean(String.valueOf(map.get("is_first_launch")));
            f00 f00Var = xv0.b;
            if (f00Var == null) {
                Intrinsics.n("dependenciesProvider");
                throw null;
            }
            xi5 xi5VarH = f00Var.g.b().h();
            xi5VarH.getClass();
            boolean z2 = xi5VarH == xi5.c;
            if (!z || z2) {
                aVar.q(MyLog.TAG_APPSFLYER);
                Boolean boolValueOf = Boolean.valueOf(z);
                f00 f00Var2 = xv0.b;
                if (f00Var2 != null) {
                    aVar.g("skip AppsFlyer referral data, isFirstLaunch: %s, BUILD_CHANNEL: %s", boolValueOf, f00Var2.g.b().h());
                    return;
                } else {
                    Intrinsics.n("dependenciesProvider");
                    throw null;
                }
            }
            String str = nnn.d;
            if (!TextUtils.isEmpty(str)) {
                aVar.q(MyLog.TAG_APPSFLYER);
                aVar.g("skip AppsFlyer referral data, because current referral is not empty: %s", str);
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (map.containsKey("media_source")) {
                sb.append("utm_source=");
                sb.append(map.get("media_source"));
            } else {
                sb.append("no_source=unknown");
            }
            if (map.containsKey("campaign_id")) {
                sb.append("&utm_campaign=" + map.get("campaign_id"));
            }
            if (map.containsKey("af_ad_type")) {
                sb.append("&utm_medium=" + map.get("af_ad_type"));
            }
            if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                sb.append("&af_channel=" + map.get(AFInAppEventParameterName.AF_CHANNEL));
            }
            if (map.containsKey("http_referrer")) {
                sb.append("&http_referrer=" + map.get("http_referrer"));
            }
            if (map.containsKey("adset")) {
                sb.append("&adset=" + map.get("adset"));
            }
            if (map.containsKey("gclid")) {
                sb.append("&gclid=");
                sb.append(map.get("gclid"));
            }
            String strA = nnn.a(sb.toString());
            nnn.d = strA;
            nnn.a aVar2 = nnn.c;
            if (aVar2 != null) {
                aVar2.e.a(nnn.a.f[0], strA);
            } else {
                Intrinsics.n("configPreferences");
                throw null;
            }
        }
    }
}
