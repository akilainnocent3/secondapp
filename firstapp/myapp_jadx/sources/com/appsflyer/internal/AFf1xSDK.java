package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import defpackage.he;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1xSDK extends AFe1lSDK<Map<String, Object>> {
    private static final int component4 = 2000;
    private final AFa1rSDK areAllFieldsValid;
    private final AFa1gSDK component1;
    private Map<String, Object> component2;
    private final Uri component3;
    private final List<String> equals;

    public AFf1xSDK(AFa1rSDK aFa1rSDK, AFa1gSDK aFa1gSDK, Uri uri, List<String> list) {
        super(AFe1mSDK.RESOLVE_ESP, new AFe1mSDK[]{AFe1mSDK.RC_CDN}, "ResolveEsp");
        this.areAllFieldsValid = aFa1rSDK;
        this.component1 = aFa1gSDK;
        this.component3 = uri;
        this.equals = list;
    }

    private boolean getMonetizationNetwork(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sbA = he.a("Validate if link ", str, " belongs to ESP domains: ");
        sbA.append(this.equals);
        AFLogger.afRDLog(sbA.toString());
        try {
            return this.equals.contains(new URL(str).getHost());
        } catch (MalformedURLException e) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final long getCurrencyIso4217Code() {
        return RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final AFe1uSDK getMediationNetwork() {
        Integer num = null;
        if (!getMonetizationNetwork(this.component3.toString())) {
            this.areAllFieldsValid.j_(this.component1, this.component3, null);
            return AFe1uSDK.SUCCESS;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = this.component3.toString();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        String str = null;
        while (i < 5) {
            Map<String, Object> mapR_ = r_(Uri.parse(string));
            String str2 = (String) mapR_.get("res");
            Integer num2 = (Integer) mapR_.get(AnalyticsParam.EVENT_STATUS);
            String str3 = (String) mapR_.get(AnalyticsEvent.BI_TRACKING_KIND_ERROR);
            if (str2 == null || !getMonetizationNetwork(str2)) {
                str = str3;
                string = str2;
                num = num2;
                break;
            }
            if (i < 4) {
                arrayList.add(str2);
            }
            i++;
            str = str3;
            string = str2;
            num = num2;
        }
        HashMap map = new HashMap();
        map.put("res", string != null ? string : "");
        map.put(AnalyticsParam.EVENT_STATUS, Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            map.put(AnalyticsEvent.BI_TRACKING_KIND_ERROR, str);
        }
        if (!arrayList.isEmpty()) {
            map.put("redirects", arrayList);
        }
        map.put("latency", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        synchronized (this.component1) {
            this.component1.getCurrencyIso4217Code("af_deeplink_r", map);
            this.component1.getCurrencyIso4217Code("af_deeplink", this.component3.toString());
        }
        this.areAllFieldsValid.j_(this.component1, string != null ? Uri.parse(string) : this.component3, this.component3);
        this.component2 = map;
        return AFe1uSDK.SUCCESS;
    }

    private static Map<String, Object> r_(Uri uri) {
        HashMap map = new HashMap();
        try {
            StringBuilder sb = new StringBuilder(siPCzPFw.crlnOJPwisct);
            sb.append(uri.toString());
            AFLogger.afDebugLog(sb.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
            httpURLConnection.setInstanceFollowRedirects(false);
            int i = component4;
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.17.3");
            int responseCode = httpURLConnection.getResponseCode();
            map.put(AnalyticsParam.EVENT_STATUS, Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                map.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
            return map;
        } catch (Throwable th) {
            map.put(AnalyticsEvent.BI_TRACKING_KIND_ERROR, th.getLocalizedMessage());
            AFLogger.afErrorLog(th.getMessage(), th);
            return map;
        }
    }
}
