package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1mSDK extends AFi1aSDK {
    public AFj1mSDK(AFc1pSDK aFc1pSDK, Runnable runnable) {
        super("store", "xiaomi", aFc1pSDK, runnable);
    }

    private boolean AFAdRevenueData() {
        if (!getMediationNetwork()) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            AFLogger.INSTANCE.v(AFg1cSDK.REFERRER, "Class com.miui.referrer.api.GetAppsReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, "An error occurred while trying to access GetAppsReferrerClient", th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getCurrencyIso4217Code(final Context context) {
        if (AFAdRevenueData()) {
            this.component1 = System.currentTimeMillis();
            this.areAllFieldsValid = AFj1qSDK.AFa1vSDK.STARTED;
            addObserver(new AFj1qSDK.AnonymousClass1());
            final GetAppsReferrerClient getAppsReferrerClientBuild = GetAppsReferrerClient.Companion.newBuilder(context).build();
            getAppsReferrerClientBuild.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFj1mSDK.5
                public final void onGetAppsReferrerSetupFinished(int i) {
                    AFLogger aFLogger;
                    AFg1cSDK aFg1cSDK;
                    AFj1mSDK.this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1iSDK.getCurrencyIso4217Code(context, "com.xiaomi.mipicks")));
                    AFj1mSDK.this.AFAdRevenueData.put("api_ver_name", AFj1iSDK.getRevenue(context, "com.xiaomi.mipicks"));
                    if (i == -1) {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1cSDK = AFg1cSDK.REFERRER;
                        aFLogger.w(aFg1cSDK, "XiaomiInstallReferrer SERVICE_DISCONNECTED");
                        AFj1mSDK.this.AFAdRevenueData.put("response", "SERVICE_DISCONNECTED");
                    } else if (i == 0) {
                        AFj1mSDK aFj1mSDK = AFj1mSDK.this;
                        GetAppsReferrerClient getAppsReferrerClient = getAppsReferrerClientBuild;
                        aFj1mSDK.AFAdRevenueData.put("response", "OK");
                        try {
                            AFLogger aFLogger2 = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK2 = AFg1cSDK.REFERRER;
                            aFLogger2.d(aFg1cSDK2, "XiaomiInstallReferrer connected");
                            if (getAppsReferrerClient.isReady()) {
                                GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    aFj1mSDK.AFAdRevenueData.put("referrer", installReferrer2);
                                }
                                aFj1mSDK.AFAdRevenueData.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                aFj1mSDK.AFAdRevenueData.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                HashMap map = new HashMap();
                                map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                map.put("install_version", installReferrer.getInstallVersion());
                                aFj1mSDK.AFAdRevenueData.put("xiaomi_custom", map);
                            } else {
                                aFLogger2.w(aFg1cSDK2, "XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                            }
                            aFLogger = aFLogger2;
                            aFg1cSDK = aFg1cSDK2;
                        } catch (Throwable th) {
                            AFLogger aFLogger3 = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK3 = AFg1cSDK.REFERRER;
                            StringBuilder sb = new StringBuilder("Failed to get Xiaomi install referrer: ");
                            sb.append(th.getMessage());
                            aFLogger3.w(aFg1cSDK3, sb.toString());
                            aFLogger = aFLogger3;
                            aFg1cSDK = aFg1cSDK3;
                        }
                    } else if (i == 1) {
                        AFj1mSDK.this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
                        aFLogger = AFLogger.INSTANCE;
                        aFg1cSDK = AFg1cSDK.REFERRER;
                        aFLogger.w(aFg1cSDK, "XiaomiInstallReferrer not supported");
                    } else if (i == 2) {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1cSDK = AFg1cSDK.REFERRER;
                        aFLogger.w(aFg1cSDK, "XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                        AFj1mSDK.this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                    } else if (i == 3) {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1cSDK = AFg1cSDK.REFERRER;
                        aFLogger.w(aFg1cSDK, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFj1mSDK.this.AFAdRevenueData.put("response", "DEVELOPER_ERROR");
                    } else if (i != 4) {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1cSDK = AFg1cSDK.REFERRER;
                        aFLogger.w(aFg1cSDK, "responseCode not found.");
                    } else {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1cSDK = AFg1cSDK.REFERRER;
                        aFLogger.w(aFg1cSDK, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFj1mSDK.this.AFAdRevenueData.put("response", "PERMISSION_ERROR");
                    }
                    aFLogger.d(aFg1cSDK, "Xiaomi Install Referrer collected locally");
                    AFj1mSDK.this.getMonetizationNetwork();
                    getAppsReferrerClientBuild.endConnection();
                }

                public final void onGetAppsServiceDisconnected() {
                }
            });
        }
    }
}
