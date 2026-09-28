package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1nSDK.AnonymousClass3;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import defpackage.j180;
import defpackage.k180;
import defpackage.ux5;
import defpackage.v4l;
import defpackage.w4l;
import j$.util.DesugarTimeZone;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1uSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String AFAdRevenueData;
    private static char[] AFInAppEventParameterName = null;
    private static int AFInAppEventType = 0;
    private static int AFKeystoreWrapper = 0;
    private static boolean AFLogger = false;
    private static AFa1uSDK areAllFieldsValid = null;
    private static int d = 1;
    static AppsFlyerInAppPurchaseValidatorListener getCurrencyIso4217Code;
    public static final String getRevenue;
    private static boolean registerClient;
    Application component3;
    private volatile SharedPreferences copy;
    private Map<Long, String> copydefault;
    private AFf1nSDK equals;
    private boolean toString;
    public volatile AppsFlyerConversionListener getMediationNetwork = null;
    private long component4 = -1;
    long getMonetizationNetwork = -1;
    private long component2 = 5000;
    boolean component1 = false;
    private final AFc1dSDK hashCode = new AFc1dSDK();

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1uSDK$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            getRevenue = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getRevenue[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        component3();
        getRevenue = "356";
        AFAdRevenueData = "6.17";
        getCurrencyIso4217Code = null;
        areAllFieldsValid = new AFa1uSDK();
        int i = d + 61;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            int i2 = 48 / 0;
        }
    }

    public AFa1uSDK() {
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afErrorLog().getMediationNetwork();
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afErrorLog().getRevenue();
        AFe1nSDK aFe1nSDKCopydefault = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).copydefault();
        aFe1nSDKCopydefault.getMonetizationNetwork.add(new C0182AFa1uSDK());
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00db A[LOOP:4: B:21:0x006f->B:41:0x00db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x004c A[EDGE_INSN: B:59:0x004c->B:56:0x004c BREAK  A[LOOP:3: B:15:0x004d->B:62:0x004d], SYNTHETIC] */
    private static void AFAdRevenueData(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            int i = 0;
            if (!itKeys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(itKeys.next()));
                while (i < jSONArray.length()) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                    i++;
                    AFKeystoreWrapper = (d + 45) % 128;
                }
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> itKeys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (true) {
                if (!itKeys2.hasNext()) {
                    break loop2;
                }
                d = (AFKeystoreWrapper + 1) % 128;
                if (str != null) {
                    break loop2;
                }
                String next = itKeys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i2) == ((Long) arrayList.get(0)).longValue()) {
                            break;
                        }
                        int i3 = d + 21;
                        AFKeystoreWrapper = i3 % 128;
                        if (i3 % 2 == 0) {
                            if (jSONArray2.getLong(i2) == ((Long) arrayList.get(1)).longValue()) {
                                break;
                            }
                            AFKeystoreWrapper = (d + 61) % 128;
                            if (jSONArray2.getLong(i2) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                break;
                                break;
                            } else {
                                i2++;
                                str = next;
                            }
                        } else {
                            if (jSONArray2.getLong(i2) == ((Long) arrayList.get(1)).longValue()) {
                                break;
                            }
                            AFKeystoreWrapper = (d + 61) % 128;
                            if (jSONArray2.getLong(i2) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                break;
                            }
                            i2++;
                            str = next;
                        }
                    }
                } catch (JSONException e2) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e2);
                }
            }
        }
        if (str != null) {
            jSONObject.remove(str);
            d = (AFKeystoreWrapper + 113) % 128;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0070 -> B:22:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(java.lang.String r10, java.lang.String r11, int[] r12, int r13, java.lang.Object[] r14) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.a(java.lang.String, java.lang.String, int[], int, java.lang.Object[]):void");
    }

    private boolean areAllFieldsValid() {
        d = (AFKeystoreWrapper + 19) % 128;
        if (this.component4 > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.component4;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            String mediationNetwork = getMediationNetwork(simpleDateFormat, this.component4);
            String mediationNetwork2 = getMediationNetwork(simpleDateFormat, this.getMonetizationNetwork);
            if (jCurrentTimeMillis < this.component2 && !isStopped()) {
                int i = AFKeystoreWrapper + 121;
                d = i % 128;
                if (i % 2 == 0) {
                    Object[] objArr = new Object[4];
                    objArr[1] = mediationNetwork;
                    objArr[1] = mediationNetwork2;
                    objArr[4] = Long.valueOf(jCurrentTimeMillis);
                    objArr[2] = Long.valueOf(this.component2);
                    AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", objArr));
                    return false;
                }
                long j = this.component2;
                StringBuilder sbA = ux5.a("Last Launch attempt: ", mediationNetwork, ";\nLast successful Launch event: ", mediationNetwork2, ";\nThis launch is blocked: ");
                sbA.append(jCurrentTimeMillis);
                sbA.append(" ms < ");
                sbA.append(j);
                sbA.append(" ms");
                AFLogger.afInfoLog(sbA.toString());
                return true;
            }
            if (!isStopped()) {
                AFKeystoreWrapper = (d + 97) % 128;
                StringBuilder sbA2 = ux5.a("Last Launch attempt: ", mediationNetwork, ";\nLast successful Launch event: ", mediationNetwork2, ";\nSending launch (+");
                sbA2.append(jCurrentTimeMillis);
                sbA2.append(" ms)");
                AFLogger.afInfoLog(sbA2.toString());
            }
        } else if (!isStopped()) {
            int i2 = AFKeystoreWrapper + 77;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                AFLogger.afInfoLog("Sending first launch for this session!");
                throw null;
            }
            AFLogger.afInfoLog("Sending first launch for this session!");
        }
        return false;
    }

    private static void c_(Context context, PackageInfo packageInfo) {
        try {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                int i = AFKeystoreWrapper + 7;
                d = i % 128;
                if (i % 2 == 0) {
                    int i2 = applicationInfo.flags;
                    throw null;
                }
                if ((applicationInfo.flags & 32768) != 0) {
                    if (Build.VERSION.SDK_INT < 31) {
                        if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                            AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                            return;
                        } else {
                            AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                            return;
                        }
                    }
                    if (context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName()) == 0) {
                        AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                    } else {
                        AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
                        AFKeystoreWrapper = (d + 109) % 128;
                    }
                }
            }
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while checking BackupRules: ", th);
        }
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        int i = 0;
        final AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        int i2 = 1;
        String str = (String) objArr[1];
        AppsFlyerConversionListener appsFlyerConversionListener = (AppsFlyerConversionListener) objArr[2];
        Context context = (Context) objArr[3];
        int i3 = AFKeystoreWrapper + 65;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = aFa1uSDK.toString;
            throw null;
        }
        if (!aFa1uSDK.toString) {
            aFa1uSDK.toString = true;
            ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).AFKeystoreWrapper().getMonetizationNetwork(str);
            if (context != null) {
                aFa1uSDK.getMediationNetwork(context);
                Application applicationO_ = AFj1iSDK.O_(context);
                if (applicationO_ != null) {
                    aFa1uSDK.component3 = applicationO_;
                    ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).getMediationNetwork().execute(new k180(aFa1uSDK, i2));
                    AFe1nSDK aFe1nSDKCopydefault = ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).copydefault();
                    aFe1nSDKCopydefault.AFAdRevenueData.execute(aFe1nSDKCopydefault.new AnonymousClass3(new AFe1fSDK(aFa1uSDK.getCurrencyIso4217Code())));
                    ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).afWarnLog().getMediationNetwork(new AFd1xSDK.AFa1ySDK() { // from class: com.appsflyer.internal.d
                        @Override // com.appsflyer.internal.AFd1xSDK.AFa1ySDK
                        public final void onConfigurationChanged(boolean z2) {
                            this.a.getMediationNetwork(z2);
                        }
                    });
                    ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).component1().getRevenue(aFa1uSDK.AFAdRevenueData());
                    AFj1rSDK aFj1rSDKAFLogger = ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).AFLogger();
                    Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.e
                        @Override // java.lang.Runnable
                        public final void run() throws UnsupportedEncodingException {
                            this.a.equals();
                        }
                    };
                    AFi1bSDK monetizationNetwork = aFj1rSDKAFLogger.getMonetizationNetwork(runnable);
                    Runnable revenue = aFj1rSDKAFLogger.getRevenue(monetizationNetwork, runnable);
                    aFj1rSDKAFLogger.getCurrencyIso4217Code.add(monetizationNetwork);
                    aFj1rSDKAFLogger.getCurrencyIso4217Code.add(new AFj1mSDK(aFj1rSDKAFLogger.getMonetizationNetwork.getCurrencyIso4217Code(), revenue));
                    aFj1rSDKAFLogger.getCurrencyIso4217Code.add(new AFj1zSDK(revenue, aFj1rSDKAFLogger.getMonetizationNetwork, new AFj1vSDK()));
                    aFj1rSDKAFLogger.getCurrencyIso4217Code.add(new AFj1lSDK(revenue, aFj1rSDKAFLogger.getMonetizationNetwork));
                    aFj1rSDKAFLogger.getCurrencyIso4217Code.add(new AFj1uSDK(aFj1rSDKAFLogger.getMonetizationNetwork.getMediationNetwork(), aFj1rSDKAFLogger.getMonetizationNetwork.getCurrencyIso4217Code(), revenue));
                    aFj1rSDKAFLogger.getMediationNetwork(revenue);
                    AFj1qSDK[] aFj1qSDKArr = (AFj1qSDK[]) aFj1rSDKAFLogger.getCurrencyIso4217Code.toArray(new AFj1qSDK[0]);
                    int length = aFj1qSDKArr.length;
                    while (i < length) {
                        int i4 = AFKeystoreWrapper + 89;
                        d = i4 % 128;
                        if (i4 % 2 == 0) {
                            aFj1qSDKArr[i].getCurrencyIso4217Code(aFj1rSDKAFLogger.getMonetizationNetwork.registerClient().getRevenue);
                            i += 21;
                        } else {
                            aFj1qSDKArr[i].getCurrencyIso4217Code(aFj1rSDKAFLogger.getMonetizationNetwork.registerClient().getRevenue);
                            i++;
                        }
                    }
                    if (!aFj1rSDKAFLogger.getMediationNetwork()) {
                        aFj1rSDKAFLogger.AFAdRevenueData(aFj1rSDKAFLogger.getMonetizationNetwork.registerClient().getRevenue, revenue, aFj1rSDKAFLogger.getMonetizationNetwork);
                        d = (AFKeystoreWrapper + 47) % 128;
                    }
                }
            } else {
                AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
            }
            ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).equals().getCurrencyIso4217Code("init", str, appsFlyerConversionListener == null ? "null" : "conversionDataListener");
            AFLogger.INSTANCE.force(AFg1cSDK.GENERAL, "Initializing AppsFlyer SDK: (v6.17.3." + getRevenue + ")");
            aFa1uSDK.getMediationNetwork = appsFlyerConversionListener;
            return aFa1uSDK;
        }
        return aFa1uSDK;
    }

    private static void component2(Context context) {
        try {
            List listAsList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!listAsList.contains("android.permission.INTERNET")) {
                d = (AFKeystoreWrapper + 73) % 128;
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
            }
            if (!listAsList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                AFKeystoreWrapper = (d + 95) % 128;
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT > 32 && (!listAsList.contains("com.google.android.gms.permission.AD_ID"))) {
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                d = (AFKeystoreWrapper + 33) % 128;
            }
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while validation permissions. ", e);
        }
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        DeepLinkListener deepLinkListener = (DeepLinkListener) objArr[1];
        d = (AFKeystoreWrapper + 59) % 128;
        aFa1uSDK.subscribeForDeepLink(deepLinkListener, 3000L);
        int i = AFKeystoreWrapper + 11;
        d = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        int i = AFKeystoreWrapper + 21;
        d = i % 128;
        if (i % 2 == 0) {
            ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).equals().getCurrencyIso4217Code("unregisterConversionListener", new String[0]);
        } else {
            ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).equals().getCurrencyIso4217Code("unregisterConversionListener", new String[0]);
        }
        aFa1uSDK.getMediationNetwork = null;
        int i2 = d + 57;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void copy() {
        AFi1pSDK aFi1qSDK;
        int i = AFKeystoreWrapper + 125;
        d = i % 128;
        if (i % 2 == 0) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afRDLog().getMonetizationNetwork();
            throw null;
        }
        if (((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afRDLog().getMonetizationNetwork()) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afRDLog().getRevenue();
        }
        AFi1sSDK aFi1sSDKW = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).w();
        if (Build.VERSION.SDK_INT >= 31) {
            aFi1qSDK = new AFi1oSDK(aFi1sSDKW.getCurrencyIso4217Code);
        } else {
            aFi1qSDK = new AFi1qSDK(aFi1sSDKW.getCurrencyIso4217Code);
            AFKeystoreWrapper = (d + 67) % 128;
        }
        aFi1sSDKW.getMediationNetwork = aFi1qSDK;
        AFf1cSDK aFf1cSDKAFKeystoreWrapper = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper();
        AFf1cSDK.getRevenue(new Object[]{aFf1cSDKAFKeystoreWrapper, ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).getCurrencyIso4217Code()}, 826598914, -826598912, System.identityHashCode(aFf1cSDKAFKeystoreWrapper));
        AFh1tSDK aFh1tSDKComponent3 = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).component3();
        aFh1tSDKComponent3.component2 = System.currentTimeMillis();
        int mediationNetwork = aFh1tSDKComponent3.getMediationNetwork.getMonetizationNetwork.getMediationNetwork("appsFlyerCount", 0);
        if (mediationNetwork == 1 && aFh1tSDKComponent3.getCurrencyIso4217Code.getRevenue("first_launch")) {
            AFKeystoreWrapper = (d + 71) % 128;
            aFh1tSDKComponent3.getMonetizationNetwork.putAll(aFh1tSDKComponent3.AFAdRevenueData("first_launch"));
        }
        if (mediationNetwork > 0 && aFh1tSDKComponent3.getCurrencyIso4217Code.getRevenue("gcd")) {
            AFKeystoreWrapper = (d + 75) % 128;
            aFh1tSDKComponent3.AFAdRevenueData.putAll(aFh1tSDKComponent3.AFAdRevenueData("gcd"));
        }
        aFh1tSDKComponent3.hashCode = aFh1tSDKComponent3.getCurrencyIso4217Code.getCurrencyIso4217Code("prev_session_dur", 0L);
        component2();
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFInAppEventType().getCurrencyIso4217Code();
    }

    private static /* synthetic */ Object copydefault(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        Context context = (Context) objArr[1];
        int i = AFKeystoreWrapper + 51;
        d = i % 128;
        if (i % 2 == 0) {
            aFa1uSDK.getMediationNetwork(context);
            ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).component2();
            throw null;
        }
        aFa1uSDK.getMediationNetwork(context);
        AFc1oSDK aFc1oSDKComponent2 = ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).component2();
        int i2 = AFKeystoreWrapper + 47;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 57 / 0;
        }
        return aFc1oSDKComponent2;
    }

    public static SharedPreferences d_(Context context) {
        int i = AFKeystoreWrapper + 43;
        d = i % 128;
        if (i % 2 == 0) {
            SharedPreferences sharedPreferences = getMonetizationNetwork().copy;
            throw null;
        }
        if (getMonetizationNetwork().copy == null) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                getMonetizationNetwork().copy = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        }
        SharedPreferences sharedPreferences2 = getMonetizationNetwork().copy;
        int i2 = AFKeystoreWrapper + 21;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return sharedPreferences2;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e_(Context context, Intent intent) {
        getRevenue(new Object[]{this, context, intent}, 253751881, -253751860, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void equals() throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new AFh1kSDK());
        int i = AFKeystoreWrapper + 69;
        d = i % 128;
        if (i % 2 == 0) {
            int i2 = 11 / 0;
        }
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        Context context = (Context) objArr[1];
        AFj1kSDK aFj1kSDK = new AFj1kSDK((Intent) objArr[2]);
        if (aFj1kSDK.getCurrencyIso4217Code("appsflyer_preinstall") != null) {
            int i = AFKeystoreWrapper + 53;
            d = i % 128;
            if (i % 2 == 0) {
                getRevenue(new Object[]{aFj1kSDK.getCurrencyIso4217Code("appsflyer_preinstall")}, 698517988, -698517984, (int) System.currentTimeMillis());
                throw null;
            }
            getRevenue(new Object[]{aFj1kSDK.getCurrencyIso4217Code("appsflyer_preinstall")}, 698517988, -698517984, (int) System.currentTimeMillis());
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String currencyIso4217Code = aFj1kSDK.getCurrencyIso4217Code("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(currencyIso4217Code)));
        if (currencyIso4217Code != null) {
            d = (AFKeystoreWrapper + 87) % 128;
            ((AFc1oSDK) getRevenue(new Object[]{aFa1uSDK, context}, -1595266545, 1595266567, System.identityHashCode(aFa1uSDK))).AFAdRevenueData("referrer", currencyIso4217Code);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", currencyIso4217Code);
            appsFlyerProperties.AFAdRevenueData = currencyIso4217Code;
            if (AppsFlyerProperties.getInstance().AFAdRevenueData()) {
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                aFa1uSDK.getMediationNetwork(context, AFh1xSDK.onReceive);
                aFa1uSDK.getRevenue(currencyIso4217Code);
                AFKeystoreWrapper = (d + 55) % 128;
            }
        }
        int i2 = d + 35;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 83 / 0;
        }
        return null;
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-667)) + (i * (-1335));
        int i5 = ~i2;
        int i6 = i | i3;
        switch (((i5 | i6) * 668) + ((i | (~(i3 | i5))) * 1336) + (((~i6) | i5) * (-668)) + i4) {
            case 1:
                return getCurrencyIso4217Code(objArr);
            case 2:
                AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
                String[] strArr = (String[]) objArr[1];
                d = (AFKeystoreWrapper + 89) % 128;
                aFa1uSDK.setSharingFilterForPartners(strArr);
                d = (AFKeystoreWrapper + 21) % 128;
                return null;
            case 3:
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                AFKeystoreWrapper = (d + 109) % 128;
                getCurrencyIso4217Code(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(zBooleanValue));
                AFKeystoreWrapper = (d + 105) % 128;
                return null;
            case 4:
                return getMonetizationNetwork(objArr);
            case 5:
                return getRevenue(objArr);
            case 6:
                AFa1uSDK aFa1uSDK2 = (AFa1uSDK) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                d = (AFKeystoreWrapper + 61) % 128;
                aFa1uSDK2.component2 = TimeUnit.SECONDS.toMillis(iIntValue);
                AFKeystoreWrapper = (d + 111) % 128;
                return null;
            case 7:
                return getMediationNetwork(objArr);
            case 8:
                return AFAdRevenueData(objArr);
            case 9:
                return areAllFieldsValid(objArr);
            case 10:
                AFa1uSDK aFa1uSDK3 = (AFa1uSDK) objArr[0];
                Context context = (Context) objArr[1];
                String str = (String) objArr[2];
                Map<String, Object> map = (Map) objArr[3];
                d = (AFKeystoreWrapper + 7) % 128;
                aFa1uSDK3.logEvent(context, str, map, null);
                d = (AFKeystoreWrapper + 119) % 128;
                return null;
            case 11:
                return component4(objArr);
            case 12:
                Boolean bool = (Boolean) objArr[1];
                boolean zBooleanValue2 = bool.booleanValue();
                AFKeystoreWrapper = (d + 111) % 128;
                AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(zBooleanValue2)));
                getRevenue(new Object[]{AppsFlyerProperties.DISABLE_NETWORK_DATA, bool}, -222394073, 222394090, (int) System.currentTimeMillis());
                d = (AFKeystoreWrapper + 69) % 128;
                return null;
            case 13:
                return component2(objArr);
            case 14:
                return component3(objArr);
            case 15:
                return component1(objArr);
            case 16:
                AFa1uSDK aFa1uSDK4 = (AFa1uSDK) objArr[0];
                Context context2 = (Context) objArr[1];
                URI uri = (URI) objArr[2];
                int i7 = (AFKeystoreWrapper + 37) % 128;
                d = i7;
                if (uri != null) {
                    AFKeystoreWrapper = (i7 + 1) % 128;
                    if (!uri.toString().isEmpty()) {
                        if (context2 != null) {
                            aFa1uSDK4.getMediationNetwork(context2);
                            ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK4}, 389316487, -389316474, System.identityHashCode(aFa1uSDK4))).i().g_(AFa1gSDK.getMonetizationNetwork(((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK4}, 389316487, -389316474, System.identityHashCode(aFa1uSDK4))).afErrorLogForExcManagerOnly()), Uri.parse(uri.toString()));
                            return null;
                        }
                        AFa1rSDK aFa1rSDKI = ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK4}, 389316487, -389316474, System.identityHashCode(aFa1uSDK4))).i();
                        StringBuilder sb = new StringBuilder("Context is \"");
                        sb.append(context2);
                        sb.append("\"");
                        aFa1rSDKI.getMediationNetwork(sb.toString(), DeepLinkResult.Error.NETWORK);
                        return null;
                    }
                }
                AFa1rSDK aFa1rSDKI2 = ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK4}, 389316487, -389316474, System.identityHashCode(aFa1uSDK4))).i();
                StringBuilder sb2 = new StringBuilder("Link is \"");
                sb2.append(uri);
                sb2.append("\"");
                aFa1rSDKI2.getMediationNetwork(sb2.toString(), DeepLinkResult.Error.NETWORK);
                return null;
            case 17:
                return copy(objArr);
            case 18:
                AFa1uSDK aFa1uSDK5 = (AFa1uSDK) objArr[0];
                int i8 = d + 47;
                AFKeystoreWrapper = i8 % 128;
                return (AFj1qSDK[]) (i8 % 2 != 0 ? ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK5}, 389316487, -389316474, System.identityHashCode(aFa1uSDK5))).AFLogger().getCurrencyIso4217Code.toArray(new AFj1qSDK[1]) : ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK5}, 389316487, -389316474, System.identityHashCode(aFa1uSDK5))).AFLogger().getCurrencyIso4217Code.toArray(new AFj1qSDK[0]));
            case 19:
                return toString(objArr);
            case 20:
                AFa1uSDK aFa1uSDK6 = (AFa1uSDK) objArr[0];
                ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK6}, 389316487, -389316474, System.identityHashCode(aFa1uSDK6))).afInfoLog().getRevenue = new AFb1uSDK((String[]) objArr[1]);
                AFKeystoreWrapper = (d + 31) % 128;
                return null;
            case 21:
                return hashCode(objArr);
            case 22:
                return copydefault(objArr);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                AFa1uSDK aFa1uSDK7 = (AFa1uSDK) objArr[0];
                Context context3 = (Context) objArr[1];
                String str2 = (String) objArr[2];
                aFa1uSDK7.getMediationNetwork(context3);
                AFg1tSDK aFg1tSDK = new AFg1tSDK(context3);
                if (str2 == null || str2.trim().isEmpty()) {
                    AFLogger.INSTANCE.w(AFg1cSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
                    return null;
                }
                AFLogger.INSTANCE.i(AFg1cSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str2));
                AFf1aSDK revenue = aFg1tSDK.getRevenue();
                if (revenue == null || !str2.equals(revenue.getMonetizationNetwork)) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    boolean z = revenue == null || jCurrentTimeMillis - revenue.getCurrencyIso4217Code > 2000;
                    AFf1aSDK aFf1aSDK = new AFf1aSDK(str2, jCurrentTimeMillis, !z);
                    aFg1tSDK.getMonetizationNetwork.AFAdRevenueData("afUninstallToken", aFf1aSDK.getMonetizationNetwork);
                    aFg1tSDK.getMonetizationNetwork.getRevenue("afUninstallToken_received_time", aFf1aSDK.getCurrencyIso4217Code);
                    aFg1tSDK.getMonetizationNetwork.getCurrencyIso4217Code("afUninstallToken_queued", aFf1aSDK.getMediationNetwork);
                    if (z) {
                        AFa1uSDK monetizationNetwork = getMonetizationNetwork();
                        AFc1bSDK aFc1bSDK = (AFc1bSDK) getRevenue(new Object[]{monetizationNetwork}, 389316487, -389316474, System.identityHashCode(monetizationNetwork));
                        AFf1pSDK aFf1pSDK = new AFf1pSDK(str2, aFc1bSDK);
                        AFe1nSDK aFe1nSDKCopydefault = aFc1bSDK.copydefault();
                        aFe1nSDKCopydefault.AFAdRevenueData.execute(aFe1nSDKCopydefault.new AnonymousClass3(aFf1pSDK));
                    }
                }
                return null;
            case 24:
                AFa1uSDK aFa1uSDK8 = (AFa1uSDK) objArr[0];
                Context context4 = (Context) objArr[1];
                Map<String, Object> map2 = (Map) objArr[2];
                PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback = (PurchaseHandler.PurchaseValidationCallback) objArr[3];
                AFKeystoreWrapper = (d + 5) % 128;
                aFa1uSDK8.getMediationNetwork(context4);
                PurchaseHandler purchaseHandlerAreAllFieldsValid = ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK8}, 389316487, -389316474, System.identityHashCode(aFa1uSDK8))).areAllFieldsValid();
                if (purchaseHandlerAreAllFieldsValid.getMonetizationNetwork(map2, purchaseValidationCallback, "purchases")) {
                    AFe1bSDK aFe1bSDK = new AFe1bSDK(map2, purchaseValidationCallback, purchaseHandlerAreAllFieldsValid.AFAdRevenueData);
                    AFe1nSDK aFe1nSDK = purchaseHandlerAreAllFieldsValid.getCurrencyIso4217Code;
                    aFe1nSDK.AFAdRevenueData.execute(aFe1nSDK.new AnonymousClass3(aFe1bSDK));
                }
                AFKeystoreWrapper = (d + 65) % 128;
                return null;
            default:
                AFa1uSDK aFa1uSDK9 = (AFa1uSDK) objArr[0];
                boolean zBooleanValue3 = ((Boolean) objArr[1]).booleanValue();
                int i9 = AFKeystoreWrapper + 57;
                d = i9 % 128;
                if (i9 % 2 == 0) {
                    AFd1mSDK aFd1mSDKEquals = ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK9}, 389316487, -389316474, System.identityHashCode(aFa1uSDK9))).equals();
                    String[] strArr2 = new String[1];
                    strArr2[1] = String.valueOf(zBooleanValue3);
                    aFd1mSDKEquals.getCurrencyIso4217Code("setCollectAndroidID", strArr2);
                } else {
                    ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK9}, 389316487, -389316474, System.identityHashCode(aFa1uSDK9))).equals().getCurrencyIso4217Code("setCollectAndroidID", String.valueOf(zBooleanValue3));
                }
                getCurrencyIso4217Code(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(zBooleanValue3));
                getCurrencyIso4217Code(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(zBooleanValue3));
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0063  */
    /* JADX WARN: Code duplicated, block: B:20:0x008c  */
    private static /* synthetic */ Object hashCode(Object[] objArr) {
        Uri data;
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        boolean z = true;
        Context context = (Context) objArr[1];
        Intent intent = (Intent) objArr[2];
        aFa1uSDK.getMediationNetwork(context);
        AFa1rSDK aFa1rSDKI = ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).i();
        AFc1oSDK aFc1oSDKComponent2 = ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).component2();
        if (intent != null) {
            int i = AFKeystoreWrapper + 35;
            d = i % 128;
            if (i % 2 == 0) {
                "android.intent.action.VIEW".equals(intent.getAction());
                throw null;
            }
            if ("android.intent.action.VIEW".equals(intent.getAction())) {
                data = intent.getData();
            } else {
                data = null;
            }
        } else {
            data = null;
        }
        if (data != null) {
            int i2 = AFKeystoreWrapper + 7;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                data.toString().isEmpty();
                throw null;
            }
            if (data.toString().isEmpty()) {
                z = false;
            } else {
                AFKeystoreWrapper = (d + 93) % 128;
            }
        } else {
            z = false;
        }
        if (!aFc1oSDKComponent2.getMediationNetwork("ddl_sent", false) || z) {
            aFa1rSDKI.f_(AFa1gSDK.getMonetizationNetwork(aFa1rSDKI.component1.afErrorLogForExcManagerOnly()), intent, context);
            return null;
        }
        int i3 = AFKeystoreWrapper + 93;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            aFa1rSDKI.getMediationNetwork("No direct deep link", null);
            int i4 = 37 / 0;
        } else {
            aFa1rSDKI.getMediationNetwork("No direct deep link", null);
        }
        return null;
    }

    private static /* synthetic */ Object toString(Object[] objArr) {
        boolean monetizationNetwork;
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        int i = AFKeystoreWrapper + 99;
        d = i % 128;
        if (i % 2 == 0) {
            monetizationNetwork = ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).AFKeystoreWrapper().getMonetizationNetwork();
            int i2 = 64 / 0;
        } else {
            monetizationNetwork = ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).AFKeystoreWrapper().getMonetizationNetwork();
        }
        int i3 = AFKeystoreWrapper + 107;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            return Boolean.valueOf(monetizationNetwork);
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        getRevenue(new Object[]{this, strArr}, -503631880, 503631889, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        int i = d + 67;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            AFd1mSDK aFd1mSDKEquals = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z);
            aFd1mSDKEquals.getCurrencyIso4217Code("anonymizeUser", strArr);
        } else {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("anonymizeUser", String.valueOf(z));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
        int i2 = AFKeystoreWrapper + 87;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 42 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i = d + 45;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            AFa1rSDK aFa1rSDKI = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i();
            aFa1rSDKI.getMonetizationNetwork = str;
            aFa1rSDKI.getMediationNetwork = map;
            throw null;
        }
        AFa1rSDK aFa1rSDKI2 = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i();
        aFa1rSDKI2.getMonetizationNetwork = str;
        aFa1rSDKI2.getMediationNetwork = map;
        d = (AFKeystoreWrapper + 99) % 128;
    }

    public final void b_(Context context, Intent intent) {
        getRevenue(new Object[]{this, context, intent}, -1666869813, 1666869820, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void disableAppSetId() {
        int i = AFKeystoreWrapper + 11;
        d = i % 128;
        ((AFc1bSDK) (i % 2 == 0 ? getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this)) : getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this)))).afInfoLog().component1 = true;
        int i2 = AFKeystoreWrapper + 33;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z) {
        d = (AFKeystoreWrapper + 47) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).unregisterClient().getMonetizationNetwork(z);
        d = (AFKeystoreWrapper + 73) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z) {
        getRevenue(new Object[]{this, Boolean.valueOf(z)}, 163982159, -163982156, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        getMediationNetwork(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006d, code lost:
    
        return com.appsflyer.internal.AFb1jSDK.getRevenue(((com.appsflyer.internal.AFc1bSDK) getRevenue(new java.lang.Object[]{r6}, 389316487, -389316474, java.lang.System.identityHashCode(r6))).getCurrencyIso4217Code().getMonetizationNetwork);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
    
        if (r7 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        if (r7 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper = (com.appsflyer.internal.AFa1uSDK.d + 115) % 128;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getAppsFlyerUID(android.content.Context r7) {
        /*
            r6 = this;
            int r0 = com.appsflyer.internal.AFa1uSDK.d
            int r0 = r0 + 55
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r2 = "getAppsFlyerUID"
            r3 = -389316474(0xffffffffe8cb8086, float:-7.68809E24)
            r4 = 389316487(0x17347f87, float:5.83221E-25)
            if (r0 == 0) goto L2f
            java.lang.Object[] r0 = new java.lang.Object[]{r6}
            int r5 = java.lang.System.identityHashCode(r6)
            java.lang.Object r0 = getRevenue(r0, r4, r3, r5)
            com.appsflyer.internal.AFc1bSDK r0 = (com.appsflyer.internal.AFc1bSDK) r0
            com.appsflyer.internal.AFd1mSDK r0 = r0.equals()
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.getCurrencyIso4217Code(r2, r1)
            if (r7 != 0) goto L52
            goto L48
        L2f:
            java.lang.Object[] r0 = new java.lang.Object[]{r6}
            int r5 = java.lang.System.identityHashCode(r6)
            java.lang.Object r0 = getRevenue(r0, r4, r3, r5)
            com.appsflyer.internal.AFc1bSDK r0 = (com.appsflyer.internal.AFc1bSDK) r0
            com.appsflyer.internal.AFd1mSDK r0 = r0.equals()
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.getCurrencyIso4217Code(r2, r1)
            if (r7 != 0) goto L52
        L48:
            int r6 = com.appsflyer.internal.AFa1uSDK.d
            int r6 = r6 + 115
            int r6 = r6 % 128
            com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper = r6
            r6 = 0
            return r6
        L52:
            r6.getMediationNetwork(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r6}
            int r6 = java.lang.System.identityHashCode(r6)
            java.lang.Object r6 = getRevenue(r7, r4, r3, r6)
            com.appsflyer.internal.AFc1bSDK r6 = (com.appsflyer.internal.AFc1bSDK) r6
            com.appsflyer.internal.AFc1pSDK r6 = r6.getCurrencyIso4217Code()
            com.appsflyer.internal.AFc1oSDK r6 = r6.getMonetizationNetwork
            java.lang.String r6 = com.appsflyer.internal.AFb1jSDK.getRevenue(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.getAppsFlyerUID(android.content.Context):java.lang.String");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        int i = d + 21;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            getMediationNetwork(context);
            return ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).getCurrencyIso4217Code().getRevenue(context);
        }
        getMediationNetwork(context);
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).getCurrencyIso4217Code().getRevenue(context);
        throw null;
    }

    public final void getCurrencyIso4217Code(AFh1jSDK aFh1jSDK) throws UnsupportedEncodingException {
        long j;
        Context context = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).registerClient().getRevenue;
        boolean z = true;
        if (context == null) {
            int i = d + 71;
            AFKeystoreWrapper = i % 128;
            if (i % 2 != 0) {
                AFLogger.INSTANCE.d(AFg1cSDK.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
                return;
            } else {
                AFLogger.INSTANCE.d(AFg1cSDK.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
                return;
            }
        }
        String mediationNetwork = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMediationNetwork();
        AppsFlyerRequestListener appsFlyerRequestListener = aFh1jSDK.getMonetizationNetwork;
        if (mediationNetwork == null || mediationNetwork.length() == 0) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
            aFLogger.i(aFg1cSDK, "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ", true);
            aFLogger.i(aFg1cSDK, "AppsFlyer will not track this event.", true);
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(41, "No dev key");
                return;
            }
            return;
        }
        AFc1oSDK aFc1oSDK = (AFc1oSDK) getRevenue(new Object[]{this, context}, -1595266545, 1595266567, System.identityHashCode(this));
        AppsFlyerProperties.getInstance().saveProperties(aFc1oSDK);
        if (!((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMonetizationNetwork()) {
            AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "sendWithEvent from activity: ".concat(context.getClass().getName()), true);
        }
        boolean mediationNetwork2 = aFh1jSDK.getMediationNetwork();
        Map<String, ?> revenue = getRevenue(aFh1jSDK);
        if (((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMonetizationNetwork()) {
            AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyerLib.sendWithEvent");
            AFKeystoreWrapper = (d + 109) % 128;
        }
        int monetizationNetwork = getMonetizationNetwork(aFc1oSDK, false);
        getRevenue(new Object[]{this, revenue}, 1290570600, -1290570599, System.identityHashCode(this));
        AFa1tSDK aFa1tSDK = new AFa1tSDK(getCurrencyIso4217Code(), aFh1jSDK.getMonetizationNetwork(revenue).getMonetizationNetwork(monetizationNetwork), getCurrencyIso4217Code().unregisterClient().getCurrencyIso4217Code());
        if (mediationNetwork2) {
            boolean z2 = false;
            for (AFj1qSDK aFj1qSDK : (AFj1qSDK[]) getRevenue(new Object[]{this}, -187960988, 187961006, System.identityHashCode(this))) {
                if (aFj1qSDK.areAllFieldsValid == AFj1qSDK.AFa1vSDK.STARTED) {
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK2 = AFg1cSDK.REFERRER;
                    StringBuilder sb = new StringBuilder("Failed to get ");
                    sb.append(aFj1qSDK.getCurrencyIso4217Code);
                    sb.append(" referrer, wait ...");
                    aFLogger2.d(aFg1cSDK2, sb.toString());
                    z2 = true;
                }
            }
            if (((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).unregisterClient().getRevenue()) {
                AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "fetching Facebook deferred AppLink data, wait ...");
                z2 = true;
            }
            if (((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().AFAdRevenueData()) {
                AFKeystoreWrapper = (d + 15) % 128;
            } else {
                z = z2;
            }
        } else {
            z = false;
        }
        ScheduledExecutorService monetizationNetwork2 = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).getMonetizationNetwork();
        if (z) {
            int i2 = AFKeystoreWrapper + 99;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 29 / 0;
            }
            j = 500;
        } else {
            j = 0;
        }
        AFj1aSDK.AFAdRevenueData(monetizationNetwork2, aFa1tSDK, j, TimeUnit.MILLISECONDS);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        int i = d + 59;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            return ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFInAppEventParameterName().getCurrencyIso4217Code();
        }
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFInAppEventParameterName().getCurrencyIso4217Code();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        return (String) getRevenue(new Object[]{this}, 103305784, -103305776, System.identityHashCode(this));
    }

    public final void getMonetizationNetwork(Context context, String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String monetizationNetwork = ((AFc1oSDK) getRevenue(new Object[]{this, context}, -1595266545, 1595266567, System.identityHashCode(this))).getMonetizationNetwork("extraReferrers", null);
            if (monetizationNetwork == null) {
                jSONObject = new JSONObject();
                jSONArray = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(monetizationNetwork);
                jSONArray = jSONObject2.has(str) ? new JSONArray((String) jSONObject2.get(str)) : new JSONArray();
                jSONObject = jSONObject2;
            }
            if (jSONArray.length() < 5) {
                d = (AFKeystoreWrapper + 21) % 128;
                jSONArray.put(jCurrentTimeMillis);
                AFKeystoreWrapper = (d + 57) % 128;
            }
            if (jSONObject.length() >= 4) {
                int i = AFKeystoreWrapper + 117;
                d = i % 128;
                if (i % 2 == 0) {
                    AFAdRevenueData(jSONObject);
                    int i2 = 14 / 0;
                } else {
                    AFAdRevenueData(jSONObject);
                }
            }
            jSONObject.put(str, jSONArray.toString());
            ((AFc1oSDK) getRevenue(new Object[]{this, context}, -1595266545, 1595266567, System.identityHashCode(this))).AFAdRevenueData("extraReferrers", jSONObject.toString());
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        int i = AFKeystoreWrapper + 107;
        d = i % 128;
        if (i % 2 == 0) {
            AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            throw null;
        }
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            return string;
        }
        String currencyIso4217Code = getCurrencyIso4217Code(context, "AF_STORE");
        if (currencyIso4217Code == null) {
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        int i2 = AFKeystoreWrapper + 71;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 72 / 0;
        }
        return currencyIso4217Code;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        d = (AFKeystoreWrapper + 105) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("getSdkVersion", new String[0]);
        String strComponent2 = AFc1pSDK.component2();
        int i = AFKeystoreWrapper + 125;
        d = i % 128;
        if (i % 2 != 0) {
            return strComponent2;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        return (AppsFlyerLib) getRevenue(new Object[]{this, str, appsFlyerConversionListener, context}, 519263238, -519263223, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        d = (AFKeystoreWrapper + 35) % 128;
        getMediationNetwork(context);
        boolean mediationNetwork = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).getCurrencyIso4217Code().getMediationNetwork(context);
        d = (AFKeystoreWrapper + 15) % 128;
        return mediationNetwork;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        return ((Boolean) getRevenue(new Object[]{this}, 224962975, -224962956, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logAdRevenue(AFAdRevenueData aFAdRevenueData, Map<String, Object> map) throws UnsupportedEncodingException {
        if (!this.toString) {
            getMediationNetwork("logAdRevenue");
            d = (AFKeystoreWrapper + 119) % 128;
            return;
        }
        if (!aFAdRevenueData.areAllFieldsValid()) {
            int i = AFKeystoreWrapper + 9;
            d = i % 128;
            if (i % 2 != 0) {
                AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
                return;
            } else {
                AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
                int i2 = 32 / 0;
                return;
            }
        }
        if (!((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMonetizationNetwork()) {
            if (AFk1xSDK.getRevenue(((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMediationNetwork())) {
                copydefault();
                return;
            } else {
                getMonetizationNetwork(new AFh1nSDK(aFAdRevenueData, map));
                return;
            }
        }
        int i3 = AFKeystoreWrapper + 87;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "SDK is stopped");
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "SDK is stopped");
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap map2 = map == null ? null : new HashMap(map);
        getMediationNetwork(context);
        AFh1hSDK aFh1hSDK = new AFh1hSDK();
        aFh1hSDK.component4 = str;
        aFh1hSDK.getMonetizationNetwork = appsFlyerRequestListener;
        if (map2 != null && map2.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap map3 = new HashMap();
            Object obj = map2.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap map4 = new HashMap();
                map4.put("x", Float.valueOf(motionEvent.getX()));
                map4.put("y", Float.valueOf(motionEvent.getY()));
                map3.put("loc", map4);
                map3.put("pf", Float.valueOf(motionEvent.getPressure()));
                map3.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                map3.put(AnalyticsEvent.BI_TRACKING_KIND_ERROR, "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(AFg1cSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> mapSingletonMap = Collections.singletonMap("tch_data", map3);
            map2.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1hSDK.getMonetizationNetwork(mapSingletonMap);
        }
        aFh1hSDK.AFAdRevenueData = map2;
        AFd1mSDK aFd1mSDKEquals = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals();
        Map map5 = aFh1hSDK.AFAdRevenueData;
        if (map5 == null) {
            map5 = new HashMap();
        }
        aFd1mSDKEquals.getCurrencyIso4217Code("logEvent", str, new JSONObject(map5).toString());
        if (str == null) {
            getMediationNetwork(context, AFh1xSDK.logEvent);
        }
        getMediationNetwork(aFh1hSDK, AFAdRevenueData(context));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d2, double d3) throws UnsupportedEncodingException {
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("logLocation", String.valueOf(d2), String.valueOf(d3));
        HashMap map = new HashMap();
        map.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d3));
        map.put(AFInAppEventParameterName.LATITUDE, Double.toString(d2));
        AFAdRevenueData(context, AFInAppEventType.LOCATION_COORDINATES, map);
        int i = d + 59;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            int i2 = 60 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) throws UnsupportedEncodingException {
        d = (AFKeystoreWrapper + 25) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("logSession", new String[0]);
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getMonetizationNetwork();
        getMediationNetwork(context, AFh1xSDK.logSession);
        AFAdRevenueData(context, (String) null, (Map<String, Object>) null);
        int i = AFKeystoreWrapper + 107;
        d = i % 128;
        if (i % 2 == 0) {
            int i2 = 63 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i = d + 57;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afDebugLog().getMonetizationNetwork();
        } else {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afDebugLog().getMonetizationNetwork();
            int i2 = 92 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(Context context, URI uri) {
        getRevenue(new Object[]{this, context, uri}, 1798513644, -1798513628, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(final Intent intent, Context context) {
        int i = (AFKeystoreWrapper + 45) % 128;
        d = i;
        if (intent == null) {
            int i2 = i + 71;
            AFKeystoreWrapper = i2 % 128;
            if (i2 % 2 == 0) {
                ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i().getMediationNetwork("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            } else {
                ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i().getMediationNetwork("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
                throw null;
            }
        }
        if (context == null) {
            int i3 = i + 123;
            AFKeystoreWrapper = i3 % 128;
            if (i3 % 2 == 0) {
                ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i().getMediationNetwork("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            } else {
                ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i().getMediationNetwork("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                int i4 = 4 / 0;
                return;
            }
        }
        final Context applicationContext = context.getApplicationContext();
        getMediationNetwork(applicationContext);
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).getMediationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.f
            @Override // java.lang.Runnable
            public final void run() {
                this.a.e_(applicationContext, intent);
            }
        });
        int i5 = d + 97;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = d + 111;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("registerConversionListener", new String[1]);
        } else {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("registerConversionListener", new String[0]);
        }
        getRevenue(appsFlyerConversionListener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        com.appsflyer.internal.AFa1uSDK.getCurrencyIso4217Code = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
    
        if (r7 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:
    
        if (r7 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        com.appsflyer.internal.AFa1uSDK.d = (com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper + 9) % 128;
        com.appsflyer.AFLogger.afDebugLog("registerValidatorListener null listener");
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void registerValidatorListener(android.content.Context r6, com.appsflyer.AppsFlyerInAppPurchaseValidatorListener r7) {
        /*
            r5 = this;
            int r6 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper
            int r6 = r6 + 97
            int r0 = r6 % 128
            com.appsflyer.internal.AFa1uSDK.d = r0
            int r6 = r6 % 2
            java.lang.String r0 = "registerValidatorListener called"
            r1 = 0
            java.lang.String r2 = "registerValidatorListener"
            r3 = -389316474(0xffffffffe8cb8086, float:-7.68809E24)
            r4 = 389316487(0x17347f87, float:5.83221E-25)
            if (r6 != 0) goto L34
            java.lang.Object[] r6 = new java.lang.Object[]{r5}
            int r5 = java.lang.System.identityHashCode(r5)
            java.lang.Object r5 = getRevenue(r6, r4, r3, r5)
            com.appsflyer.internal.AFc1bSDK r5 = (com.appsflyer.internal.AFc1bSDK) r5
            com.appsflyer.internal.AFd1mSDK r5 = r5.equals()
            java.lang.String[] r6 = new java.lang.String[r1]
            r5.getCurrencyIso4217Code(r2, r6)
            com.appsflyer.AFLogger.afDebugLog(r0)
            if (r7 != 0) goto L5e
            goto L50
        L34:
            java.lang.Object[] r6 = new java.lang.Object[]{r5}
            int r5 = java.lang.System.identityHashCode(r5)
            java.lang.Object r5 = getRevenue(r6, r4, r3, r5)
            com.appsflyer.internal.AFc1bSDK r5 = (com.appsflyer.internal.AFc1bSDK) r5
            com.appsflyer.internal.AFd1mSDK r5 = r5.equals()
            java.lang.String[] r6 = new java.lang.String[r1]
            r5.getCurrencyIso4217Code(r2, r6)
            com.appsflyer.AFLogger.afDebugLog(r0)
            if (r7 != 0) goto L5e
        L50:
            int r5 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper
            int r5 = r5 + 9
            int r5 = r5 % 128
            com.appsflyer.internal.AFa1uSDK.d = r5
            java.lang.String r5 = "registerValidatorListener null listener"
            com.appsflyer.AFLogger.afDebugLog(r5)
            return
        L5e:
            com.appsflyer.internal.AFa1uSDK.getCurrencyIso4217Code = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.registerValidatorListener(android.content.Context, com.appsflyer.AppsFlyerInAppPurchaseValidatorListener):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        getRevenue(new Object[]{this, context, map, purchaseValidationCallback}, 788315212, -788315188, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFKeystoreWrapper = (d + 65) % 128;
        getMediationNetwork(context);
        PurchaseHandler purchaseHandlerAreAllFieldsValid = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).areAllFieldsValid();
        if (purchaseHandlerAreAllFieldsValid.getMonetizationNetwork(map, purchaseValidationCallback, "subscriptions")) {
            AFe1jSDK aFe1jSDK = new AFe1jSDK(map, purchaseValidationCallback, purchaseHandlerAreAllFieldsValid.AFAdRevenueData);
            AFe1nSDK aFe1nSDK = purchaseHandlerAreAllFieldsValid.getCurrencyIso4217Code;
            aFe1nSDK.AFAdRevenueData.execute(aFe1nSDK.new AnonymousClass3(aFe1jSDK));
            d = (AFKeystoreWrapper + 91) % 128;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:18:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:23:0x00fd A[Catch: all -> 0x017f, TRY_LEAVE, TryCatch #2 {all -> 0x017f, blocks: (B:21:0x00f7, B:23:0x00fd), top: B:57:0x00f7 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0127 A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:25:0x011d, B:27:0x0127, B:29:0x0135, B:33:0x0157, B:37:0x0169, B:38:0x016e, B:40:0x0176), top: B:53:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0161  */
    /* JADX WARN: Code duplicated, block: B:40:0x0176 A[Catch: all -> 0x0155, TRY_LEAVE, TryCatch #0 {all -> 0x0155, blocks: (B:25:0x011d, B:27:0x0127, B:29:0x0135, B:33:0x0157, B:37:0x0169, B:38:0x016e, B:40:0x0176), top: B:53:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x01af  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPushNotificationData(Activity activity) {
        AFc1eSDK aFc1eSDKAfInfoLog;
        String currencyIso4217Code;
        long jCurrentTimeMillis;
        long j;
        long jLongValue;
        long j2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i = d + 91;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            if (activity != null) {
                if (activity.getIntent() != null) {
                    AFd1mSDK aFd1mSDKEquals = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals();
                    String localClassName = activity.getLocalClassName();
                    StringBuilder sb = new StringBuilder("activity_intent_");
                    sb.append(activity.getIntent().toString());
                    aFd1mSDKEquals.getCurrencyIso4217Code("sendPushNotificationData", localClassName, sb.toString());
                    d = (AFKeystoreWrapper + 85) % 128;
                }
            }
            aFc1eSDKAfInfoLog = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afInfoLog();
            currencyIso4217Code = getCurrencyIso4217Code(activity);
            aFc1eSDKAfInfoLog.getMediationNetwork = currencyIso4217Code;
            if (currencyIso4217Code != null) {
                jCurrentTimeMillis = System.currentTimeMillis();
                if (this.copydefault == null) {
                    AFLogger.afInfoLog("pushes: initializing pushes history..");
                    this.copydefault = new ConcurrentHashMap();
                    jLongValue = jCurrentTimeMillis;
                    j = jLongValue;
                } else {
                    j2 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                    AFKeystoreWrapper = (d + 79) % 128;
                    jLongValue = jCurrentTimeMillis;
                    for (Long l : this.copydefault.keySet()) {
                        jSONObject = new JSONObject(aFc1eSDKAfInfoLog.getMediationNetwork);
                        jSONObject2 = new JSONObject(this.copydefault.get(l));
                        j = jCurrentTimeMillis;
                        if (!jSONObject.opt("pid").equals(jSONObject2.opt("pid"))) {
                        }
                        if (j - l.longValue() > j2) {
                            AFKeystoreWrapper = (d + 63) % 128;
                            this.copydefault.remove(l);
                        }
                        if (l.longValue() <= jLongValue) {
                            jLongValue = l.longValue();
                        }
                        jCurrentTimeMillis = j;
                    }
                    j = jCurrentTimeMillis;
                }
                if (this.copydefault.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                    StringBuilder sb2 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                    sb2.append(jLongValue);
                    sb2.append(")");
                    AFLogger.afInfoLog(sb2.toString());
                    this.copydefault.remove(Long.valueOf(jLongValue));
                }
                this.copydefault.put(Long.valueOf(j), aFc1eSDKAfInfoLog.getMediationNetwork);
                start(activity);
            }
        }
        int i2 = 72 / 0;
        if (activity != null) {
            if (activity.getIntent() != null) {
                AFd1mSDK aFd1mSDKEquals2 = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals();
                String localClassName2 = activity.getLocalClassName();
                StringBuilder sb3 = new StringBuilder("activity_intent_");
                sb3.append(activity.getIntent().toString());
                aFd1mSDKEquals2.getCurrencyIso4217Code("sendPushNotificationData", localClassName2, sb3.toString());
                d = (AFKeystoreWrapper + 85) % 128;
            }
        }
        aFc1eSDKAfInfoLog = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afInfoLog();
        currencyIso4217Code = getCurrencyIso4217Code(activity);
        aFc1eSDKAfInfoLog.getMediationNetwork = currencyIso4217Code;
        if (currencyIso4217Code != null) {
            jCurrentTimeMillis = System.currentTimeMillis();
            if (this.copydefault == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.copydefault = new ConcurrentHashMap();
                jLongValue = jCurrentTimeMillis;
                j = jLongValue;
            } else {
                try {
                    j2 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                    AFKeystoreWrapper = (d + 79) % 128;
                    jLongValue = jCurrentTimeMillis;
                    while (r7.hasNext()) {
                        try {
                            jSONObject = new JSONObject(aFc1eSDKAfInfoLog.getMediationNetwork);
                            jSONObject2 = new JSONObject(this.copydefault.get(l));
                            j = jCurrentTimeMillis;
                            try {
                                if (!jSONObject.opt("pid").equals(jSONObject2.opt("pid")) && jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                    StringBuilder sb4 = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
                                    sb4.append(jSONObject2);
                                    sb4.append(", new: ");
                                    sb4.append(jSONObject);
                                    sb4.append(")");
                                    AFLogger.afInfoLog(sb4.toString());
                                    aFc1eSDKAfInfoLog.getMediationNetwork = null;
                                    return;
                                }
                                if (j - l.longValue() > j2) {
                                    AFKeystoreWrapper = (d + 63) % 128;
                                    this.copydefault.remove(l);
                                }
                                if (l.longValue() <= jLongValue) {
                                    jLongValue = l.longValue();
                                }
                                jCurrentTimeMillis = j;
                            } catch (Throwable th) {
                                th = th;
                                AFLogger.afErrorLog("Error while handling push notification measurement: ".concat(th.getClass().getSimpleName()), th);
                                if (this.copydefault.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                                    StringBuilder sb5 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                                    sb5.append(jLongValue);
                                    sb5.append(")");
                                    AFLogger.afInfoLog(sb5.toString());
                                    this.copydefault.remove(Long.valueOf(jLongValue));
                                }
                                this.copydefault.put(Long.valueOf(j), aFc1eSDKAfInfoLog.getMediationNetwork);
                                start(activity);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j = jCurrentTimeMillis;
                        }
                    }
                    j = jCurrentTimeMillis;
                } catch (Throwable th3) {
                    th = th3;
                    j = jCurrentTimeMillis;
                    jLongValue = j;
                }
            }
            if (this.copydefault.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                StringBuilder sb6 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                sb6.append(jLongValue);
                sb6.append(")");
                AFLogger.afInfoLog(sb6.toString());
                this.copydefault.remove(Long.valueOf(jLongValue));
            }
            this.copydefault.put(Long.valueOf(j), aFc1eSDKAfInfoLog.getMediationNetwork);
            start(activity);
        }
        if (activity != null) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
        } else {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("sendPushNotificationData", "activity_null");
        }
        aFc1eSDKAfInfoLog = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afInfoLog();
        currencyIso4217Code = getCurrencyIso4217Code(activity);
        aFc1eSDKAfInfoLog.getMediationNetwork = currencyIso4217Code;
        if (currencyIso4217Code != null) {
            jCurrentTimeMillis = System.currentTimeMillis();
            if (this.copydefault == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.copydefault = new ConcurrentHashMap();
                jLongValue = jCurrentTimeMillis;
                j = jLongValue;
            } else {
                j2 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                AFKeystoreWrapper = (d + 79) % 128;
                jLongValue = jCurrentTimeMillis;
                while (r7.hasNext()) {
                    jSONObject = new JSONObject(aFc1eSDKAfInfoLog.getMediationNetwork);
                    jSONObject2 = new JSONObject(this.copydefault.get(l));
                    j = jCurrentTimeMillis;
                    if (!jSONObject.opt("pid").equals(jSONObject2.opt("pid"))) {
                    }
                    if (j - l.longValue() > j2) {
                        AFKeystoreWrapper = (d + 63) % 128;
                        this.copydefault.remove(l);
                    }
                    if (l.longValue() <= jLongValue) {
                        jLongValue = l.longValue();
                    }
                    jCurrentTimeMillis = j;
                }
                j = jCurrentTimeMillis;
            }
            if (this.copydefault.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                StringBuilder sb7 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                sb7.append(jLongValue);
                sb7.append(")");
                AFLogger.afInfoLog(sb7.toString());
                this.copydefault.remove(Long.valueOf(jLongValue));
            }
            this.copydefault.put(Long.valueOf(j), aFc1eSDKAfInfoLog.getMediationNetwork);
            start(activity);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        AFKeystoreWrapper = (d + 23) % 128;
        if (map != null) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
        }
        d = (AFKeystoreWrapper + 9) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        d = (AFKeystoreWrapper + 25) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setAndroidIdData", str);
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afInfoLog().AFAdRevenueData = str;
        AFKeystoreWrapper = (d + 53) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i = AFKeystoreWrapper + 111;
        d = i % 128;
        if (i % 2 == 0) {
            AFd1mSDK aFd1mSDKEquals = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals();
            String[] strArr = new String[0];
            strArr[0] = str;
            aFd1mSDKEquals.getCurrencyIso4217Code("setAppId", strArr);
        } else {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setAppId", str);
        }
        getCurrencyIso4217Code(AppsFlyerProperties.APP_ID, str);
        AFKeystoreWrapper = (d + 89) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) {
        AFKeystoreWrapper = (d + 89) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        }
        getCurrencyIso4217Code(AppsFlyerProperties.ONELINK_ID, str);
        AFKeystoreWrapper = (d + 91) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) {
        getRevenue(new Object[]{this, Boolean.valueOf(z)}, 454542992, -454542992, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z) {
        d = (AFKeystoreWrapper + 111) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setCollectIMEI", String.valueOf(z));
        getCurrencyIso4217Code(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        getCurrencyIso4217Code(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
        AFKeystoreWrapper = (d + 115) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z) {
        AFKeystoreWrapper = (d + 43) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setCollectOaid", String.valueOf(z));
        getCurrencyIso4217Code(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
        d = (AFKeystoreWrapper + 55) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(AppsFlyerConsent appsFlyerConsent) {
        d = (AFKeystoreWrapper + 117) % 128;
        Objects.requireNonNull(appsFlyerConsent);
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afInfoLog().areAllFieldsValid = appsFlyerConsent;
        d = (AFKeystoreWrapper + 63) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        d = (AFKeystoreWrapper + 117) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        AFKeystoreWrapper = (d + 15) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) throws UnsupportedEncodingException {
        if (context != null) {
            int i = d + HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS;
            AFKeystoreWrapper = i % 128;
            if (i % 2 != 0) {
                getRevenue();
                throw null;
            }
            if (!getRevenue()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                d = (AFKeystoreWrapper + 51) % 128;
                return;
            }
            setCustomerUserId(str);
            StringBuilder sb = new StringBuilder("CustomerUserId set: ");
            sb.append(str);
            sb.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).component2());
            getMediationNetwork(context, AFh1xSDK.setCustomerIdAndLogSession);
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMediationNetwork();
            if (referrer == null) {
                referrer = "";
            }
            if (context instanceof Activity) {
                int i2 = d + 113;
                AFKeystoreWrapper = i2 % 128;
                if (i2 % 2 != 0) {
                    ((Activity) context).getIntent();
                    int i3 = 4 / 0;
                } else {
                    ((Activity) context).getIntent();
                }
            }
            getRevenue(context, referrer);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        d = (AFKeystoreWrapper + 25) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getCurrencyIso4217Code(AppsFlyerProperties.APP_USER_ID, str);
        getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.FALSE}, -222394073, 222394090, (int) System.currentTimeMillis());
        d = (AFKeystoreWrapper + 5) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z) {
        AFKeystoreWrapper = (d + 65) % 128;
        setLogLevel(z ? AFLogger.LogLevel.DEBUG : AFLogger.LogLevel.NONE);
        d = (AFKeystoreWrapper + 3) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z) {
        int i = AFKeystoreWrapper + 39;
        d = i % 128;
        boolean z2 = false;
        if (i % 2 == 0) {
            AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
            int i2 = 82 / 0;
            if (!z) {
                z2 = true;
            }
        } else {
            AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
            if (!z) {
                z2 = true;
            }
        }
        AFb1kSDK.getMediationNetwork = Boolean.valueOf(z2);
        AFc1bSDK aFc1bSDK = (AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this));
        aFc1bSDK.afInfoLog().component3 = z;
        if (!z) {
            AFe1nSDK aFe1nSDKCopydefault = aFc1bSDK.copydefault();
            aFe1nSDKCopydefault.AFAdRevenueData.execute(aFe1nSDKCopydefault.new AnonymousClass3(new AFe1fSDK(getCurrencyIso4217Code())));
            return;
        }
        int i3 = d + 109;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            aFc1bSDK.afInfoLog().component2 = null;
            throw null;
        }
        aFc1bSDK.afInfoLog().component2 = null;
        int i4 = d + 7;
        AFKeystoreWrapper = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z) {
        getRevenue(new Object[]{this, Boolean.valueOf(z)}, 775079759, -775079747, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        AFKeystoreWrapper = (d + 9) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i = AFKeystoreWrapper + 23;
        d = i % 128;
        if (i % 2 == 0) {
            int i2 = 59 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        String strTrim;
        if (AFk1xSDK.getMonetizationNetwork(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        int i = d;
        AFKeystoreWrapper = (i + 5) % 128;
        if (str != null) {
            AFKeystoreWrapper = (i + 67) % 128;
            strTrim = str.trim();
        } else {
            strTrim = "";
        }
        AFe1ySDK.getMediationNetwork(new AFe1wSDK(strTrim, str2.trim()));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        Object revenue;
        int i = d + 37;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setImeiData", str);
            revenue = getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this));
        } else {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setImeiData", str);
            revenue = getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this));
        }
        ((AFc1bSDK) revenue).AFKeystoreWrapper().getCurrencyIso4217Code(str);
        int i2 = AFKeystoreWrapper + 61;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        int i = d + 55;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setIsUpdate", String.valueOf(z));
        } else {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setIsUpdate", String.valueOf(z));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        boolean z;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            AFKeystoreWrapper = (d + 125) % 128;
            z = true;
        } else {
            AFKeystoreWrapper = (d + 43) % 128;
            z = false;
        }
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("log", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (z) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afErrorLog().areAllFieldsValid();
            return;
        }
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afErrorLog().getRevenue();
        int i = AFKeystoreWrapper + 11;
        d = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i) {
        getRevenue(new Object[]{this, Integer.valueOf(i)}, 1308989660, -1308989654, i);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        Object revenue;
        int i = d + 91;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            AFLogger.afDebugLog("setOneLinkCustomDomain " + Arrays.toString(strArr));
            revenue = getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this));
        } else {
            AFLogger.afDebugLog("setOneLinkCustomDomain " + Arrays.toString(strArr));
            revenue = getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this));
        }
        ((AFc1bSDK) revenue).i().areAllFieldsValid = strArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i = d;
        AFKeystoreWrapper = (i + 75) % 128;
        if (str == null) {
            AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
            return;
        }
        int i2 = i + 1;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            String lowerCase = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
        } else {
            String lowerCase2 = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase2);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase2)), true);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(String str, Map<String, Object> map) {
        d = (AFKeystoreWrapper + 9) % 128;
        AFc1eSDK aFc1eSDKAfInfoLog = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afInfoLog();
        AFb1rSDK aFb1rSDK = aFc1eSDKAfInfoLog.getCurrencyIso4217Code;
        if (aFb1rSDK == null) {
            aFb1rSDK = new AFb1rSDK();
            aFc1eSDKAfInfoLog.getCurrencyIso4217Code = aFb1rSDK;
        }
        if (str != null) {
            AFKeystoreWrapper = (d + 53) % 128;
            if (!str.isEmpty()) {
                if (map != null) {
                    int i = d + 5;
                    AFKeystoreWrapper = i % 128;
                    if (i % 2 != 0) {
                        map.isEmpty();
                        throw null;
                    }
                    if (!map.isEmpty()) {
                        StringBuilder sb = new StringBuilder("Setting partner data for ");
                        sb.append(str);
                        sb.append(": ");
                        sb.append(map);
                        AFLogger.afDebugLog(sb.toString());
                        int length = new JSONObject(map).toString().length();
                        if (length <= 1000) {
                            aFb1rSDK.getRevenue.put(str, map);
                            aFb1rSDK.getCurrencyIso4217Code.remove(str);
                            return;
                        } else {
                            AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                            HashMap map2 = new HashMap();
                            map2.put(AnalyticsEvent.BI_TRACKING_KIND_ERROR, "limit exceeded: ".concat(String.valueOf(length)));
                            aFb1rSDK.getCurrencyIso4217Code.put(str, map2);
                            return;
                        }
                    }
                }
                AFLogger.afWarnLog(aFb1rSDK.getRevenue.remove(str) == null ? "Partner data is missing or `null`" : "Cleared partner data for ".concat(str));
                int i2 = d + 65;
                AFKeystoreWrapper = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
        }
        AFLogger.afWarnLog("Partner ID is missing or `null`");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i = AFKeystoreWrapper + 23;
        d = i % 128;
        if (i % 2 == 0) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afInfoLog().getMonetizationNetwork = AFj1bSDK.getCurrencyIso4217Code(str);
            throw null;
        }
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afInfoLog().getMonetizationNetwork = AFj1bSDK.getCurrencyIso4217Code(str);
        d = (AFKeystoreWrapper + 5) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(PluginInfo pluginInfo) {
        getRevenue(new Object[]{this, pluginInfo}, 1343916491, -1343916486, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        try {
            if (str != null) {
                int i = d + 73;
                AFKeystoreWrapper = i % 128;
                if (i % 2 != 0) {
                    jSONObject.put("pid", str);
                    int i2 = 48 / 0;
                } else {
                    jSONObject.put("pid", str);
                }
            }
            if (str2 != null) {
                jSONObject.put("c", str2);
                AFKeystoreWrapper = (d + 69) % 128;
            }
            if (str3 != null) {
                jSONObject.put("af_siteid", str3);
            }
        } catch (JSONException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
        }
        if (!jSONObject.has("pid")) {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        } else {
            AFKeystoreWrapper = (d + 77) % 128;
            getCurrencyIso4217Code("preInstallName", jSONObject.toString());
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        AFKeystoreWrapper = (d + 51) % 128;
        AFLogger.afDebugLog("setResolveDeepLinkURLs " + Arrays.toString(strArr));
        AFa1rSDK aFa1rSDKI = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i();
        aFa1rSDKI.component4.clear();
        aFa1rSDKI.component4.addAll(Arrays.asList(strArr));
        d = (AFKeystoreWrapper + 37) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(String... strArr) {
        getRevenue(new Object[]{this, strArr}, -134062068, 134062070, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        AFKeystoreWrapper = (d + 113) % 128;
        setSharingFilterForPartners("all");
        int i = AFKeystoreWrapper + 57;
        d = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        getRevenue(new Object[]{this, strArr}, -251208297, 251208317, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        String str = null;
        for (int i = 0; i < length; i++) {
            int i2 = d + 121;
            AFKeystoreWrapper = i2 % 128;
            if (i2 % 2 != 0) {
                String str2 = strArr[i];
                int i3 = AnonymousClass2.getRevenue[emailsCryptType.ordinal()];
                throw null;
            }
            String str3 = strArr[i];
            if (AnonymousClass2.getRevenue[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFj1bSDK.getCurrencyIso4217Code(str3));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str3);
                str = "plain_el_arr";
            }
        }
        map.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(map).toString());
        int i4 = d + 35;
        AFKeystoreWrapper = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        if (((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afDebugLog().getCurrencyIso4217Code()) {
            return;
        }
        if (!this.toString) {
            getMediationNetwork("start");
            if (str == null) {
                int i = AFKeystoreWrapper + 79;
                int i2 = i % 128;
                d = i2;
                if (i % 2 == 0) {
                    throw null;
                }
                if (appsFlyerRequestListener != null) {
                    int i3 = i2 + 21;
                    AFKeystoreWrapper = i3 % 128;
                    if (i3 % 2 != 0) {
                        appsFlyerRequestListener.onError(88, "No dev key");
                        return;
                    } else {
                        appsFlyerRequestListener.onError(41, "No dev key");
                        return;
                    }
                }
                return;
            }
        }
        getMediationNetwork(context);
        final AFh1tSDK aFh1tSDKComponent3 = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).component3();
        aFh1tSDKComponent3.getRevenue(AFh1uSDK.getRevenue(context));
        if (this.component3 == null) {
            d = (AFKeystoreWrapper + 35) % 128;
            Application applicationO_ = AFj1iSDK.O_(context);
            if (applicationO_ == null) {
                return;
            }
            d = (AFKeystoreWrapper + 109) % 128;
            this.component3 = applicationO_;
        }
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
        String str2 = getRevenue;
        aFLogger.i(aFg1cSDK, "Starting AppsFlyer: (v6.17.3." + str2 + ")");
        StringBuilder sb = new StringBuilder("Build Number: ");
        sb.append(str2);
        aFLogger.i(aFg1cSDK, sb.toString());
        AppsFlyerProperties.getInstance().loadProperties(((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).component2());
        if (!TextUtils.isEmpty(str)) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMonetizationNetwork(str);
        } else if (TextUtils.isEmpty(((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMediationNetwork())) {
            int i4 = AFKeystoreWrapper + 63;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                copydefault();
                int i5 = 69 / 0;
                if (appsFlyerRequestListener == null) {
                    return;
                }
            } else {
                copydefault();
                if (appsFlyerRequestListener == null) {
                    return;
                }
            }
            AFKeystoreWrapper = (d + 29) % 128;
            appsFlyerRequestListener.onError(41, "No dev key");
            return;
        }
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).component1().getRevenue(AFAdRevenueData());
        component4();
        c_(this.component3.getBaseContext(), this.hashCode.getCurrencyIso4217Code().n_());
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).unregisterClient().getMediationNetwork();
        this.hashCode.afDebugLog().getCurrencyIso4217Code(context, new AFb1aSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFa1uSDK.3
            @Override // com.appsflyer.internal.AFb1aSDK.AFa1ySDK
            public final void getMediationNetwork() {
                AFa1uSDK aFa1uSDK = AFa1uSDK.this;
                Context context2 = ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).registerClient().getRevenue;
                AFLogger.afInfoLog("onBecameBackground");
                AFh1tSDK aFh1tSDK = aFh1tSDKComponent3;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = aFh1tSDK.component3;
                if (j != 0) {
                    long j2 = jCurrentTimeMillis - j;
                    if (j2 > 0 && j2 < 1000) {
                        j2 = 1000;
                    }
                    long j3 = j2 / 1000;
                    aFh1tSDK.hashCode = j3;
                    aFh1tSDK.getCurrencyIso4217Code.getRevenue("prev_session_dur", j3);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFa1uSDK aFa1uSDK2 = AFa1uSDK.this;
                ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK2}, 389316487, -389316474, System.identityHashCode(aFa1uSDK2))).afWarnLog().getCurrencyIso4217Code();
                AFa1uSDK aFa1uSDK3 = AFa1uSDK.this;
                AFd1mSDK aFd1mSDKEquals = ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK3}, 389316487, -389316474, System.identityHashCode(aFa1uSDK3))).equals();
                if (aFd1mSDKEquals.areAllFieldsValid()) {
                    aFd1mSDKEquals.AFAdRevenueData();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        aFd1mSDKEquals.q_(context2.getPackageName(), context2.getPackageManager());
                    }
                    aFd1mSDKEquals.getRevenue();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFa1uSDK aFa1uSDK4 = AFa1uSDK.this;
                ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK4}, 389316487, -389316474, System.identityHashCode(aFa1uSDK4))).copy().getMediationNetwork();
                AFa1uSDK aFa1uSDK5 = AFa1uSDK.this;
                ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK5}, 389316487, -389316474, System.identityHashCode(aFa1uSDK5))).afErrorLogForExcManagerOnly().getMediationNetwork();
                AFa1uSDK aFa1uSDK6 = AFa1uSDK.this;
                ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK6}, 389316487, -389316474, System.identityHashCode(aFa1uSDK6))).AFAdRevenueData().AFAdRevenueData();
                AFa1uSDK aFa1uSDK7 = AFa1uSDK.this;
                AFh1qSDK aFh1qSDKAfLogForce = ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK7}, 389316487, -389316474, System.identityHashCode(aFa1uSDK7))).afLogForce();
                if (aFh1qSDKAfLogForce != null) {
                    aFh1qSDKAfLogForce.getCurrencyIso4217Code();
                }
            }

            @Override // com.appsflyer.internal.AFb1aSDK.AFa1ySDK
            public final void getMonetizationNetwork(AFh1rSDK aFh1rSDK) throws UnsupportedEncodingException {
                Intent intent;
                aFh1tSDKComponent3.getMonetizationNetwork();
                AFa1uSDK aFa1uSDK = AFa1uSDK.this;
                AFc1bSDK aFc1bSDK = (AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK));
                aFc1bSDK.component1().getRevenue(AFa1uSDK.this.AFAdRevenueData());
                AFa1uSDK.this.component4();
                int mediationNetwork = aFc1bSDK.getCurrencyIso4217Code().getMonetizationNetwork.getMediationNetwork("appsFlyerCount", 0);
                AFLogger.afInfoLog("onBecameForeground");
                if (mediationNetwork < 2) {
                    AFa1uSDK aFa1uSDK2 = AFa1uSDK.this;
                    ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK2}, 389316487, -389316474, System.identityHashCode(aFa1uSDK2))).copy().getMonetizationNetwork();
                }
                AFh1eSDK aFh1eSDK = new AFh1eSDK();
                AFa1uSDK aFa1uSDK3 = AFa1uSDK.this;
                ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK3}, 389316487, -389316474, System.identityHashCode(aFa1uSDK3))).i().f_(AFa1gSDK.AFAdRevenueData(aFh1eSDK), aFh1rSDK.getMediationNetwork, aFc1bSDK.registerClient().getRevenue);
                AFh1qSDK aFh1qSDKAfLogForce = aFc1bSDK.afLogForce();
                if (aFh1qSDKAfLogForce != null && (intent = aFh1rSDK.getMediationNetwork) != null) {
                    AFa1uSDK aFa1uSDK4 = AFa1uSDK.this;
                    aFh1qSDKAfLogForce.u_(intent, ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK4}, 389316487, -389316474, System.identityHashCode(aFa1uSDK4))).i());
                }
                AFa1uSDK aFa1uSDK5 = AFa1uSDK.this;
                aFh1eSDK.getMonetizationNetwork = appsFlyerRequestListener;
                aFa1uSDK5.getMediationNetwork(aFh1eSDK, aFh1rSDK);
                AFa1uSDK aFa1uSDK6 = AFa1uSDK.this;
                ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK6}, 389316487, -389316474, System.identityHashCode(aFa1uSDK6))).AFAdRevenueData().AFAdRevenueData();
                AFa1uSDK aFa1uSDK7 = AFa1uSDK.this;
                ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK7}, 389316487, -389316474, System.identityHashCode(aFa1uSDK7))).AFAdRevenueData().getRevenue.getCurrencyIso4217Code("didSendRevenueTriggerOnLastBackground", false);
            }
        });
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) {
        d = (AFKeystoreWrapper + 63) % 128;
        getMediationNetwork(context);
        AFc1bSDK aFc1bSDK = (AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this));
        aFc1bSDK.AFKeystoreWrapper().getRevenue(z);
        aFc1bSDK.getMediationNetwork().submit(new j180(aFc1bSDK, 1));
        if (z) {
            int i = AFKeystoreWrapper + 31;
            d = i % 128;
            if (i % 2 == 0) {
                aFc1bSDK.component2().getCurrencyIso4217Code("is_stop_tracking_used", false);
            } else {
                aFc1bSDK.component2().getCurrencyIso4217Code("is_stop_tracking_used", true);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j) {
        int i = AFKeystoreWrapper + 61;
        d = i % 128;
        if (i % 2 != 0) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i().getRevenue = deepLinkListener;
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i().component2 = j;
        } else {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i().getRevenue = deepLinkListener;
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i().component2 = j;
            int i2 = 45 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        getRevenue(new Object[]{this}, 1122585742, -1122585731, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        getRevenue(new Object[]{this, context, str}, 912251885, -912251862, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("validateAndTrackInAppPurchase", str, str2, str3, str4, str5, map == null ? "" : map.toString());
        if (!((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMonetizationNetwork()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.PURCHASE_VALIDATION;
            StringBuilder sbA = ux5.a("Validate in app called with parameters: ", str3, " ", str4, " ");
            sbA.append(str5);
            aFLogger.i(aFg1cSDK, sbA.toString());
        }
        if (str != null && str4 != null) {
            int i = AFKeystoreWrapper;
            d = (i + 55) % 128;
            if (str2 != null) {
                int i2 = i + 105;
                int i3 = i2 % 128;
                d = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                if (str5 != null) {
                    AFKeystoreWrapper = (i3 + 35) % 128;
                    if (str3 != null) {
                        new Thread(new AFa1vSDK(context.getApplicationContext(), getCurrencyIso4217Code().AFKeystoreWrapper().getMediationNetwork(), str, str2, str3, str4, str5, map)).start();
                        return;
                    }
                }
            }
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = getCurrencyIso4217Code;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z) {
        AFKeystoreWrapper = (d + 43) % 128;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.valueOf(z)}, -222394073, 222394090, (int) System.currentTimeMillis());
        d = (AFKeystoreWrapper + 107) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        if ((r6 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        r6 = 52 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
    
        if (((com.appsflyer.internal.AFc1bSDK) getRevenue(new java.lang.Object[]{r6}, 389316487, -389316474, java.lang.System.identityHashCode(r6))).getCurrencyIso4217Code().getRevenue("APPSFLYER_ALLOW_CUSTOM_INSTALL_ID") != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0080, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.d(com.appsflyer.internal.AFg1cSDK.GENERAL, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0089, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008a, code lost:
    
        if (r7 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        r6 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper + 83;
        com.appsflyer.internal.AFa1uSDK.d = r6 % 128;
        r6 = r6 % 2;
        r7 = androidx.transition.nfj.CaBJCMnsV.gAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        if (r6 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.d(com.appsflyer.internal.AFg1cSDK.GENERAL, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.d(com.appsflyer.internal.AFg1cSDK.GENERAL, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        com.appsflyer.internal.AFb1jSDK.getCurrencyIso4217Code(r7, ((com.appsflyer.internal.AFc1bSDK) getRevenue(new java.lang.Object[]{r6}, 389316487, -389316474, java.lang.System.identityHashCode(r6))).component2());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        if (r6.toString == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004b, code lost:
    
        if (r6.toString == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.d(com.appsflyer.internal.AFg1cSDK.GENERAL, "AppsFlyerLib.init() method should be called first");
        r6 = com.appsflyer.internal.AFa1uSDK.d + 57;
        com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper = r6 % 128;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setInstallId(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper
            int r0 = r0 + 95
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1uSDK.d = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r1 = com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf.vxWftGtuSaH
            r2 = 0
            r3 = -389316474(0xffffffffe8cb8086, float:-7.68809E24)
            r4 = 389316487(0x17347f87, float:5.83221E-25)
            if (r0 != 0) goto L32
            java.lang.Object[] r0 = new java.lang.Object[]{r6}
            int r5 = java.lang.System.identityHashCode(r6)
            java.lang.Object r0 = getRevenue(r0, r4, r3, r5)
            com.appsflyer.internal.AFc1bSDK r0 = (com.appsflyer.internal.AFc1bSDK) r0
            com.appsflyer.internal.AFd1mSDK r0 = r0.equals()
            java.lang.String[] r5 = new java.lang.String[r2]
            r0.getCurrencyIso4217Code(r1, r5)
            boolean r0 = r6.toString
            if (r0 != 0) goto L66
            goto L4d
        L32:
            java.lang.Object[] r0 = new java.lang.Object[]{r6}
            int r5 = java.lang.System.identityHashCode(r6)
            java.lang.Object r0 = getRevenue(r0, r4, r3, r5)
            com.appsflyer.internal.AFc1bSDK r0 = (com.appsflyer.internal.AFc1bSDK) r0
            com.appsflyer.internal.AFd1mSDK r0 = r0.equals()
            java.lang.String[] r5 = new java.lang.String[r2]
            r0.getCurrencyIso4217Code(r1, r5)
            boolean r0 = r6.toString
            if (r0 != 0) goto L66
        L4d:
            com.appsflyer.AFLogger r6 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r7 = com.appsflyer.internal.AFg1cSDK.GENERAL
            java.lang.String r0 = "AppsFlyerLib.init() method should be called first"
            r6.d(r7, r0)
            int r6 = com.appsflyer.internal.AFa1uSDK.d
            int r6 = r6 + 57
            int r7 = r6 % 128
            com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper = r7
            int r6 = r6 % 2
            if (r6 == 0) goto L65
            r6 = 52
            int r6 = r6 / r2
        L65:
            return
        L66:
            java.lang.Object[] r0 = new java.lang.Object[]{r6}
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.Object r0 = getRevenue(r0, r4, r3, r1)
            com.appsflyer.internal.AFc1bSDK r0 = (com.appsflyer.internal.AFc1bSDK) r0
            com.appsflyer.internal.AFc1pSDK r0 = r0.getCurrencyIso4217Code()
            java.lang.String r1 = "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID"
            boolean r0 = r0.getRevenue(r1)
            if (r0 != 0) goto L8a
            com.appsflyer.AFLogger r6 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r7 = com.appsflyer.internal.AFg1cSDK.GENERAL
            java.lang.String r0 = "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first"
            r6.d(r7, r0)
            return
        L8a:
            if (r7 != 0) goto Lac
            int r6 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper
            int r6 = r6 + 83
            int r7 = r6 % 128
            com.appsflyer.internal.AFa1uSDK.d = r7
            int r6 = r6 % 2
            r7 = 0
            java.lang.String r7 = androidx.transition.nfj.CaBJCMnsV.gAN
            if (r6 == 0) goto La3
            com.appsflyer.AFLogger r6 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r0 = com.appsflyer.internal.AFg1cSDK.GENERAL
            r6.d(r0, r7)
            return
        La3:
            com.appsflyer.AFLogger r6 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r0 = com.appsflyer.internal.AFg1cSDK.GENERAL
            r6.d(r0, r7)
            r6 = 0
            throw r6
        Lac:
            java.lang.Object[] r0 = new java.lang.Object[]{r6}
            int r6 = java.lang.System.identityHashCode(r6)
            java.lang.Object r6 = getRevenue(r0, r4, r3, r6)
            com.appsflyer.internal.AFc1bSDK r6 = (com.appsflyer.internal.AFc1bSDK) r6
            com.appsflyer.internal.AFc1oSDK r6 = r6.component2()
            com.appsflyer.internal.AFb1jSDK.getCurrencyIso4217Code(r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.setInstallId(java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        d = (AFKeystoreWrapper + 3) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code(iKBWavCysVP.qnOteFQyrLj, str);
        AFb1kSDK.getRevenue = str;
        int i = AFKeystoreWrapper + 3;
        d = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1uSDK$AFa1uSDK, reason: collision with other inner class name */
    public class C0182AFa1uSDK implements AFe1sSDK {
        public C0182AFa1uSDK() {
        }

        private boolean getMediationNetwork() {
            return AFa1uSDK.this.getMediationNetwork != null;
        }

        @Override // com.appsflyer.internal.AFe1sSDK
        public final void getMonetizationNetwork(AFe1lSDK<?> aFe1lSDK, AFe1uSDK aFe1uSDK) {
            JSONObject jSONObjectAFAdRevenueData;
            AFf1aSDK revenue;
            if (!(aFe1lSDK instanceof AFf1uSDK)) {
                if (!(aFe1lSDK instanceof AFg1iSDK) || aFe1uSDK == AFe1uSDK.SUCCESS) {
                    return;
                }
                AFg1nSDK aFg1nSDK = new AFg1nSDK(AFa1uSDK.this.getCurrencyIso4217Code());
                AFa1uSDK aFa1uSDK = AFa1uSDK.this;
                AFe1nSDK aFe1nSDKCopydefault = ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).copydefault();
                aFe1nSDKCopydefault.AFAdRevenueData.execute(aFe1nSDKCopydefault.new AnonymousClass3(aFg1nSDK));
                return;
            }
            AFf1uSDK aFf1uSDK = (AFf1uSDK) aFe1lSDK;
            boolean z = aFe1lSDK instanceof AFf1rSDK;
            if (z && getMediationNetwork()) {
                AFf1rSDK aFf1rSDK = (AFf1rSDK) aFe1lSDK;
                if (aFf1rSDK.AFAdRevenueData == AFe1uSDK.SUCCESS || aFf1rSDK.getMonetizationNetwork == 1) {
                    AFg1iSDK aFg1iSDK = new AFg1iSDK(aFf1rSDK, AFa1uSDK.this.getCurrencyIso4217Code().component2());
                    AFa1uSDK aFa1uSDK2 = AFa1uSDK.this;
                    AFe1nSDK aFe1nSDKCopydefault2 = ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK2}, 389316487, -389316474, System.identityHashCode(aFa1uSDK2))).copydefault();
                    aFe1nSDKCopydefault2.AFAdRevenueData.execute(aFe1nSDKCopydefault2.new AnonymousClass3(aFg1iSDK));
                }
            }
            AFa1uSDK aFa1uSDK3 = AFa1uSDK.this;
            AFh1qSDK aFh1qSDKAfLogForce = ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK3}, 389316487, -389316474, System.identityHashCode(aFa1uSDK3))).afLogForce();
            if (aFh1qSDKAfLogForce != null && z) {
                aFh1qSDKAfLogForce.getMonetizationNetwork((AFf1rSDK) aFe1lSDK, new Function0() { // from class: com.appsflyer.internal.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.a.getMonetizationNetwork();
                    }
                });
            }
            if (aFe1uSDK == AFe1uSDK.SUCCESS) {
                AFa1uSDK aFa1uSDK4 = AFa1uSDK.this;
                ((AFc1oSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK4, aFa1uSDK4.component3}, -1595266545, 1595266567, System.identityHashCode(aFa1uSDK4))).AFAdRevenueData("sentSuccessfully", "true");
                if (!(aFe1lSDK instanceof AFf1pSDK) && (revenue = new AFg1tSDK(AFa1uSDK.this.component3).getRevenue()) != null && revenue.getMediationNetwork) {
                    String str = revenue.getMonetizationNetwork;
                    AFLogger.INSTANCE.d(AFg1cSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                    AFa1uSDK monetizationNetwork = AFa1uSDK.getMonetizationNetwork();
                    AFc1bSDK aFc1bSDK = (AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{monetizationNetwork}, 389316487, -389316474, System.identityHashCode(monetizationNetwork));
                    AFf1pSDK aFf1pSDK = new AFf1pSDK(str, aFc1bSDK);
                    AFe1nSDK aFe1nSDKCopydefault3 = aFc1bSDK.copydefault();
                    aFe1nSDKCopydefault3.AFAdRevenueData.execute(aFe1nSDKCopydefault3.new AnonymousClass3(aFf1pSDK));
                }
                ResponseNetwork responseNetwork = ((AFe1eSDK) aFf1uSDK).component3;
                if (responseNetwork != null && (jSONObjectAFAdRevenueData = AFa1oSDK.AFAdRevenueData((String) responseNetwork.getBody())) != null) {
                    AFa1uSDK.this.component1 = jSONObjectAFAdRevenueData.optBoolean("send_background", false);
                }
                if (z) {
                    AFa1uSDK.this.getMonetizationNetwork = System.currentTimeMillis();
                }
            }
        }

        @Override // com.appsflyer.internal.AFe1sSDK
        public final void getMediationNetwork(AFe1lSDK<?> aFe1lSDK) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit getMonetizationNetwork() throws UnsupportedEncodingException {
            AFa1uSDK.this.getCurrencyIso4217Code(new AFh1kSDK());
            return Unit.a;
        }
    }

    public static void component3() {
        AFInAppEventParameterName = new char[]{35848, 35853, 35850, 35871, 35840, 35844, 35852, 35870, 35867};
        AFInAppEventType = 1912311211;
        registerClient = true;
        AFLogger = true;
    }

    private static void copydefault() {
        int i = d + 121;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            throw null;
        }
    }

    public final void component4() {
        d = (AFKeystoreWrapper + 9) % 128;
        if (AFe1dSDK.component2()) {
            int i = AFKeystoreWrapper + 45;
            d = i % 128;
            if (i % 2 == 0) {
                int i2 = 68 / 0;
                return;
            }
            return;
        }
        AFc1bSDK aFc1bSDK = (AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this));
        AFe1nSDK aFe1nSDKCopydefault = aFc1bSDK.copydefault();
        aFe1nSDKCopydefault.AFAdRevenueData.execute(aFe1nSDKCopydefault.new AnonymousClass3(new AFe1dSDK(aFc1bSDK)));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        getRevenue(new Object[]{this, deepLinkListener}, 1831672072, -1831672058, System.identityHashCode(this));
    }

    private void component2() {
        d = (AFKeystoreWrapper + 77) % 128;
        try {
            final AFi1jSDK aFi1jSDKV = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).v();
            if (aFi1jSDKV == null) {
                return;
            }
            if (aFi1jSDKV.getMonetizationNetwork()) {
                AFKeystoreWrapper = (d + 9) % 128;
                aFi1jSDKV.getMonetizationNetwork(new AFi1eSDK() { // from class: com.appsflyer.internal.a
                    @Override // com.appsflyer.internal.AFi1eSDK
                    public final void onRequestFinished() {
                        this.a.getMediationNetwork(aFi1jSDKV);
                    }
                });
            } else {
                if (aFi1jSDKV.getMediationNetwork()) {
                    return;
                }
                getMonetizationNetwork(aFi1jSDKV);
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Error at attempt to request PIA token", th);
            AFLogger.afRDLog("Get PIA token failed with exception:".concat(String.valueOf(th)));
        }
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        int i = (d + 45) % 128;
        AFKeystoreWrapper = i;
        AFc1dSDK aFc1dSDK = aFa1uSDK.hashCode;
        int i2 = i + 73;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 82 / 0;
        }
        return aFc1dSDK;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i = d + 89;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            int i2 = 48 / 0;
        } else {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        AFe1nSDK aFe1nSDKCopydefault = this.hashCode.copydefault();
        aFe1nSDKCopydefault.AFAdRevenueData.execute(aFe1nSDKCopydefault.new AnonymousClass3(new AFf1zSDK(this.hashCode, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        int i = d + 119;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final void getMediationNetwork(Context context) {
        int i = (d + 37) % 128;
        AFKeystoreWrapper = i;
        AFc1dSDK aFc1dSDK = this.hashCode;
        if (context != null) {
            int i2 = i + 25;
            d = i2 % 128;
            if (i2 % 2 != 0) {
                AFc1gSDK aFc1gSDK = aFc1dSDK.getMonetizationNetwork;
                int i3 = i + 3;
                d = i3 % 128;
                if (i3 % 2 != 0) {
                    aFc1gSDK.getRevenue = context.getApplicationContext();
                    return;
                } else {
                    aFc1gSDK.getRevenue = context.getApplicationContext();
                    throw null;
                }
            }
            AFc1gSDK aFc1gSDK2 = aFc1dSDK.getMonetizationNetwork;
            throw null;
        }
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        String[] strArr = (String[]) objArr[1];
        int i = d + 47;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            List<String> listAsList = Arrays.asList(strArr);
            List<List<String>> list = ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).i().AFAdRevenueData;
            if (!list.contains(listAsList)) {
                list.add(listAsList);
                d = (AFKeystoreWrapper + 71) % 128;
            }
            return null;
        }
        ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).i().AFAdRevenueData.contains(Arrays.asList(strArr));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getMediationNetwork(AFc1bSDK aFc1bSDK) {
        int i = d + 49;
        AFKeystoreWrapper = i % 128;
        int i2 = i % 2;
        aFc1bSDK.AFInAppEventType().getMonetizationNetwork();
        if (i2 != 0) {
            int i3 = 22 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(boolean z) {
        int i = AFKeystoreWrapper;
        d = (i + 113) % 128;
        if (z) {
            d = (i + 99) % 128;
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afErrorLog().getCurrencyIso4217Code();
        } else {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afErrorLog().getMonetizationNetwork();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        getRevenue(new Object[]{this, context, str, map}, -1613836572, 1613836582, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(AFi1jSDK aFi1jSDK) {
        int i = d + 57;
        AFKeystoreWrapper = i % 128;
        int i2 = i % 2;
        getMonetizationNetwork(aFi1jSDK);
        if (i2 != 0) {
            throw null;
        }
    }

    public static String getMediationNetwork() {
        AFKeystoreWrapper = (d + 63) % 128;
        String currencyIso4217Code = getCurrencyIso4217Code(AppsFlyerProperties.APP_USER_ID);
        int i = AFKeystoreWrapper + 85;
        d = i % 128;
        if (i % 2 == 0) {
            int i2 = 76 / 0;
        }
        return currencyIso4217Code;
    }

    private void getMediationNetwork(Context context, AFh1xSDK aFh1xSDK) {
        AFKeystoreWrapper = (d + 29) % 128;
        getMediationNetwork(context);
        AFh1tSDK aFh1tSDKComponent3 = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).component3();
        AFh1uSDK revenue = AFh1uSDK.getRevenue(context);
        if (aFh1tSDKComponent3.getCurrencyIso4217Code()) {
            int i = d + 125;
            AFKeystoreWrapper = i % 128;
            int i2 = i % 2;
            Map<String, Object> map = aFh1tSDKComponent3.getMonetizationNetwork;
            if (i2 != 0) {
                map.put("api_name", aFh1xSDK.toString());
                aFh1tSDKComponent3.getRevenue(revenue);
                int i3 = 2 / 0;
            } else {
                map.put("api_name", aFh1xSDK.toString());
                aFh1tSDKComponent3.getRevenue(revenue);
            }
        }
        aFh1tSDKComponent3.getMonetizationNetwork();
    }

    public static AFa1uSDK getMonetizationNetwork() {
        int i = (d + 87) % 128;
        AFKeystoreWrapper = i;
        AFa1uSDK aFa1uSDK = areAllFieldsValid;
        d = (i + 85) % 128;
        return aFa1uSDK;
    }

    private void getMonetizationNetwork(AFi1jSDK aFi1jSDK) {
        AFf1ySDK aFf1ySDK = new AFf1ySDK(aFi1jSDK, getCurrencyIso4217Code().getCurrencyIso4217Code(), getCurrencyIso4217Code(), getCurrencyIso4217Code().component4(), getCurrencyIso4217Code().registerClient());
        AFe1nSDK aFe1nSDKCopydefault = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).copydefault();
        aFe1nSDKCopydefault.AFAdRevenueData.execute(aFe1nSDKCopydefault.new AnonymousClass3(aFf1ySDK));
        d = (AFKeystoreWrapper + 1) % 128;
    }

    @Deprecated
    public static Map<String, Object> getMonetizationNetwork(Map<String, Object> map) {
        Map<String, Object> map2;
        AFKeystoreWrapper = (d + 27) % 128;
        if (map.containsKey("meta")) {
            d = (AFKeystoreWrapper + 109) % 128;
            map2 = (Map) map.get("meta");
        } else {
            HashMap map3 = new HashMap();
            map.put("meta", map3);
            map2 = map3;
        }
        int i = AFKeystoreWrapper + 7;
        d = i % 128;
        if (i % 2 == 0) {
            int i2 = 71 / 0;
        }
        return map2;
    }

    public final void getMediationNetwork(AFh1jSDK aFh1jSDK, AFh1rSDK aFh1rSDK) throws UnsupportedEncodingException {
        AppsFlyerRequestListener appsFlyerRequestListener;
        AFAdRevenueData(aFh1jSDK, aFh1rSDK);
        if (((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMediationNetwork() == null) {
            int i = AFKeystoreWrapper + 117;
            d = i % 128;
            if (i % 2 == 0) {
                AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
                appsFlyerRequestListener = aFh1jSDK.getMonetizationNetwork;
                int i2 = 1 / 0;
                if (appsFlyerRequestListener == null) {
                    return;
                }
            } else {
                AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
                appsFlyerRequestListener = aFh1jSDK.getMonetizationNetwork;
                if (appsFlyerRequestListener == null) {
                    return;
                }
            }
            appsFlyerRequestListener.onError(41, "No dev key");
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).component2());
        if (referrer == null) {
            int i3 = d + 117;
            AFKeystoreWrapper = i3 % 128;
            if (i3 % 2 == 0) {
                referrer = "";
            } else {
                throw null;
            }
        }
        aFh1jSDK.areAllFieldsValid = referrer;
        getMonetizationNetwork(aFh1jSDK);
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        String str = (String) objArr[0];
        try {
            if (new JSONObject(str).has("pid")) {
                int i = AFKeystoreWrapper + 45;
                d = i % 128;
                if (i % 2 != 0) {
                    getCurrencyIso4217Code("preInstallName", str);
                    AFKeystoreWrapper = (d + 43) % 128;
                    return null;
                }
                getCurrencyIso4217Code("preInstallName", str);
                throw null;
            }
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            d = (AFKeystoreWrapper + 113) % 128;
            return null;
        } catch (JSONException e) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
            return null;
        }
    }

    public static int getMonetizationNetwork(AFc1oSDK aFc1oSDK, boolean z) {
        int i = d + 95;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            AFAdRevenueData(aFc1oSDK, "appsFlyerCount", z);
            throw null;
        }
        int iAFAdRevenueData = AFAdRevenueData(aFc1oSDK, "appsFlyerCount", z);
        AFKeystoreWrapper = (d + 97) % 128;
        return iAFAdRevenueData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (areAllFieldsValid() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (areAllFieldsValid() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        r4 = r5.getMonetizationNetwork;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r4 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper = (com.appsflyer.internal.AFa1uSDK.d + 7) % 128;
        r4.onError(10, coil3.compose.internal.CBvK.lobGSRIlnSGJY.DmSahaAfrkOL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void getMonetizationNetwork(com.appsflyer.internal.AFh1jSDK r5) throws java.io.UnsupportedEncodingException {
        /*
            r4 = this;
            java.lang.String r0 = r5.component4
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            int r0 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper
            int r0 = r0 + 25
            int r0 = r0 % 128
            com.appsflyer.internal.AFa1uSDK.d = r0
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            boolean r3 = r4.getRevenue()
            if (r3 == 0) goto L2d
            int r4 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper
            int r4 = r4 + 107
            int r5 = r4 % 128
            com.appsflyer.internal.AFa1uSDK.d = r5
            int r4 = r4 % 2
            java.lang.String r5 = "CustomerUserId not set, reporting is disabled"
            if (r4 != 0) goto L29
            com.appsflyer.AFLogger.afInfoLog(r5, r1)
            return
        L29:
            com.appsflyer.AFLogger.afInfoLog(r5, r2)
            return
        L2d:
            if (r0 == 0) goto L77
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r3 = "launchProtectEnabled"
            boolean r0 = r0.getBoolean(r3, r2)
            if (r0 == 0) goto L6c
            int r0 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper
            int r0 = r0 + 105
            int r2 = r0 % 128
            com.appsflyer.internal.AFa1uSDK.d = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L51
            boolean r0 = r4.areAllFieldsValid()
            r2 = 53
            int r2 = r2 / r1
            if (r0 == 0) goto L71
            goto L57
        L51:
            boolean r0 = r4.areAllFieldsValid()
            if (r0 == 0) goto L71
        L57:
            com.appsflyer.attribution.AppsFlyerRequestListener r4 = r5.getMonetizationNetwork
            if (r4 == 0) goto L6b
            int r5 = com.appsflyer.internal.AFa1uSDK.d
            int r5 = r5 + 7
            int r5 = r5 % 128
            com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper = r5
            r5 = 10
            r0 = 0
            java.lang.String r0 = coil3.compose.internal.CBvK.lobGSRIlnSGJY.DmSahaAfrkOL
            r4.onError(r5, r0)
        L6b:
            return
        L6c:
            java.lang.String r0 = "Allowing multiple launches within a 5 second time window."
            com.appsflyer.AFLogger.afInfoLog(r0)
        L71:
            long r0 = java.lang.System.currentTimeMillis()
            r4.component4 = r0
        L77:
            r4.getCurrencyIso4217Code(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.getMonetizationNetwork(com.appsflyer.internal.AFh1jSDK):void");
    }

    public static String getMediationNetwork(SimpleDateFormat simpleDateFormat, long j) {
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date(j));
        d = (AFKeystoreWrapper + 35) % 128;
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(AFh1jSDK aFh1jSDK) throws UnsupportedEncodingException {
        int i = d + 11;
        AFKeystoreWrapper = i % 128;
        int i2 = i % 2;
        getCurrencyIso4217Code(aFh1jSDK);
        if (i2 != 0) {
            throw null;
        }
    }

    private static int getMediationNetwork(AFc1oSDK aFc1oSDK, boolean z) {
        int i = AFKeystoreWrapper + 15;
        d = i % 128;
        if (i % 2 != 0) {
            return AFAdRevenueData(aFc1oSDK, "appsFlyerInAppEventCount", z);
        }
        AFAdRevenueData(aFc1oSDK, "appsFlyerInAppEventCount", z);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001c A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:3:0x0001, B:15:0x001c, B:17:0x0026, B:18:0x002e, B:11:0x0017, B:7:0x0011, B:20:0x0036), top: B:27:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:3:0x0001, B:15:0x001c, B:17:0x0026, B:18:0x002e, B:11:0x0017, B:7:0x0011, B:20:0x0036), top: B:27:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x002e A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #1 {all -> 0x0018, blocks: (B:3:0x0001, B:15:0x001c, B:17:0x0026, B:18:0x002e, B:11:0x0017, B:7:0x0011, B:20:0x0036), top: B:27:0x0001, inners: #0 }] */
    public final synchronized AFf1nSDK AFAdRevenueData() {
        AFf1nSDK aFf1nSDK;
        int i;
        try {
            int i2 = AFKeystoreWrapper + 83;
            int i3 = i2 % 128;
            d = i3;
            int i4 = i2 % 2;
            aFf1nSDK = this.equals;
            if (i4 == 0) {
                int i5 = 14 / 0;
                if (aFf1nSDK == null) {
                    i = i3 + 123;
                    AFKeystoreWrapper = i % 128;
                    if (i % 2 == 0) {
                        aFf1nSDK = new AFf1nSDK() { // from class: com.appsflyer.internal.b
                            @Override // com.appsflyer.internal.AFf1nSDK
                            public final void onRemoteConfigUpdateFinished(AFf1oSDK aFf1oSDK) {
                                this.a.AFAdRevenueData(aFf1oSDK);
                            }
                        };
                        this.equals = aFf1nSDK;
                    } else {
                        this.equals = new AFf1nSDK() { // from class: com.appsflyer.internal.b
                            @Override // com.appsflyer.internal.AFf1nSDK
                            public final void onRemoteConfigUpdateFinished(AFf1oSDK aFf1oSDK) {
                                this.a.AFAdRevenueData(aFf1oSDK);
                            }
                        };
                        throw null;
                    }
                }
            } else if (aFf1nSDK == null) {
                i = i3 + 123;
                AFKeystoreWrapper = i % 128;
                if (i % 2 == 0) {
                    aFf1nSDK = new AFf1nSDK() { // from class: com.appsflyer.internal.b
                        @Override // com.appsflyer.internal.AFf1nSDK
                        public final void onRemoteConfigUpdateFinished(AFf1oSDK aFf1oSDK) {
                            this.a.AFAdRevenueData(aFf1oSDK);
                        }
                    };
                    this.equals = aFf1nSDK;
                } else {
                    this.equals = new AFf1nSDK() { // from class: com.appsflyer.internal.b
                        @Override // com.appsflyer.internal.AFf1nSDK
                        public final void onRemoteConfigUpdateFinished(AFf1oSDK aFf1oSDK) {
                            this.a.AFAdRevenueData(aFf1oSDK);
                        }
                    };
                    throw null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return aFf1nSDK;
    }

    private static void getMediationNetwork(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.SDK_LIFECYCLE;
        StringBuilder sb = new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '");
        sb.append(str);
        sb.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        aFLogger.w(aFg1cSDK, sb.toString());
        int i = AFKeystoreWrapper + 3;
        d = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(AFf1oSDK aFf1oSDK) {
        int i = d + 61;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            AFc1bSDK aFc1bSDK = (AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this));
            if (aFf1oSDK == AFf1oSDK.SUCCESS) {
                int i2 = AFKeystoreWrapper + HttpStatusCodesKt.HTTP_EARLY_HINTS;
                d = i2 % 128;
                if (i2 % 2 != 0) {
                    aFc1bSDK.afWarnLog().getRevenue();
                } else {
                    aFc1bSDK.afWarnLog().getRevenue();
                    throw null;
                }
            }
            if (!aFc1bSDK.equals().getCurrencyIso4217Code()) {
                d = (AFKeystoreWrapper + 77) % 128;
                aFc1bSDK.afErrorLog().AFAdRevenueData();
                return;
            } else {
                aFc1bSDK.afErrorLog().getMediationNetwork();
                return;
            }
        }
        AFf1oSDK aFf1oSDK2 = AFf1oSDK.SUCCESS;
        throw null;
    }

    private static void getMonetizationNetwork(String str) {
        getRevenue(new Object[]{str}, 698517988, -698517984, (int) System.currentTimeMillis());
    }

    private static boolean AFAdRevenueData(String str) {
        int i = AFKeystoreWrapper + 63;
        d = i % 128;
        int i2 = i % 2;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(str, false);
        AFKeystoreWrapper = (d + 87) % 128;
        return z;
    }

    private AFh1rSDK AFAdRevenueData(Context context) {
        d = (AFKeystoreWrapper + 87) % 128;
        if (!(context instanceof Activity)) {
            return null;
        }
        AFh1rSDK aFh1rSDK = new AFh1rSDK((Activity) context, getCurrencyIso4217Code().d());
        int i = AFKeystoreWrapper + 67;
        d = i % 128;
        if (i % 2 != 0) {
            return aFh1rSDK;
        }
        throw null;
    }

    private void AFAdRevenueData(Context context, String str, Map<String, Object> map) throws UnsupportedEncodingException {
        AFh1hSDK aFh1hSDK = new AFh1hSDK();
        aFh1hSDK.component4 = str;
        aFh1hSDK.AFAdRevenueData = map;
        getMediationNetwork(aFh1hSDK, AFAdRevenueData(context));
        int i = d + 7;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            int i2 = 38 / 0;
        }
    }

    private static void AFAdRevenueData(AFh1jSDK aFh1jSDK, AFh1rSDK aFh1rSDK) {
        int i = d + 89;
        int i2 = i % 128;
        AFKeystoreWrapper = i2;
        if (i % 2 != 0) {
            throw null;
        }
        if (aFh1rSDK != null) {
            aFh1jSDK.getMediationNetwork = aFh1rSDK.AFAdRevenueData;
            aFh1jSDK.component2 = aFh1rSDK.getMonetizationNetwork;
            d = (i2 + 95) % 128;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r0
      0x001b: PHI (r0v4 int) = (r0v3 int), (r0v7 int) binds: [B:8:0x0019, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    private static int AFAdRevenueData(AFc1oSDK aFc1oSDK, String str, boolean z) {
        int mediationNetwork;
        int i = AFKeystoreWrapper + 33;
        d = i % 128;
        if (i % 2 == 0) {
            mediationNetwork = aFc1oSDK.getMediationNetwork(str, 1);
            if (z) {
                mediationNetwork++;
                aFc1oSDK.getRevenue(str, mediationNetwork);
            }
        } else {
            mediationNetwork = aFc1oSDK.getMediationNetwork(str, 0);
            if (z) {
                mediationNetwork++;
                aFc1oSDK.getRevenue(str, mediationNetwork);
            }
        }
        int i2 = d + 99;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 63 / 0;
        }
        return mediationNetwork;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        int i = d + 11;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            return ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).AFInAppEventParameterName().getMonetizationNetwork();
        }
        int i2 = 26 / 0;
        return ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).AFInAppEventParameterName().getMonetizationNetwork();
    }

    private static /* synthetic */ Object copy(Object[] objArr) {
        String str = (String) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = AFKeystoreWrapper + 83;
        d = i % 128;
        if (i % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, zBooleanValue);
            return null;
        }
        AppsFlyerProperties.getInstance().set(str, zBooleanValue);
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) {
        d = (AFKeystoreWrapper + 1) % 128;
        start(context, str, null);
        d = (AFKeystoreWrapper + 29) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        int i = d + 27;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            start(context, null);
            AFKeystoreWrapper = (d + 61) % 128;
        } else {
            start(context, null);
            throw null;
        }
    }

    private AFj1qSDK[] component1() {
        return (AFj1qSDK[]) getRevenue(new Object[]{this}, -187960988, 187961006, System.identityHashCode(this));
    }

    private static String getCurrencyIso4217Code(String str) {
        int i = AFKeystoreWrapper + 105;
        d = i % 128;
        if (i % 2 != 0) {
            return AppsFlyerProperties.getInstance().getString(str);
        }
        AppsFlyerProperties.getInstance().getString(str);
        throw null;
    }

    private static void getCurrencyIso4217Code(String str, String str2) {
        int i = AFKeystoreWrapper + 5;
        d = i % 128;
        if (i % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, str2);
            int i2 = AFKeystoreWrapper + 105;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 84 / 0;
                return;
            }
            return;
        }
        AppsFlyerProperties.getInstance().set(str, str2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0091 A[Catch: Exception -> 0x0075, TryCatch #1 {Exception -> 0x0075, blocks: (B:16:0x0056, B:18:0x006f, B:30:0x009e, B:32:0x00ba, B:34:0x00c2, B:27:0x0091, B:29:0x0099, B:25:0x0077), top: B:41:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0099 A[Catch: Exception -> 0x0075, TryCatch #1 {Exception -> 0x0075, blocks: (B:16:0x0056, B:18:0x006f, B:30:0x009e, B:32:0x00ba, B:34:0x00c2, B:27:0x0091, B:29:0x0099, B:25:0x0077), top: B:41:0x0054 }] */
    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i = AFKeystoreWrapper + 85;
        d = i % 128;
        if (i % 2 != 0 ? !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) : !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, true)) {
            if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) && map.get("advertiserId") != null) {
                int i2 = AFKeystoreWrapper + 39;
                d = i2 % 128;
                try {
                    if (i2 % 2 == 0) {
                        int i3 = 3 / 0;
                        if (AFk1xSDK.getRevenue(((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).afInfoLog().AFAdRevenueData)) {
                            if (map.remove("android_id") != null) {
                                AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                            }
                        }
                    } else if (AFk1xSDK.getRevenue(((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).afInfoLog().AFAdRevenueData)) {
                        if (map.remove("android_id") != null) {
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                        }
                    }
                    if (AFk1xSDK.getRevenue(((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).AFKeystoreWrapper().getCurrencyIso4217Code()) && map.remove("imei") != null) {
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                        d = (AFKeystoreWrapper + 55) % 128;
                    }
                    return null;
                } catch (Exception e) {
                    AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
                }
            }
        }
        return null;
    }

    private static String getCurrencyIso4217Code(Activity activity) {
        Intent intent;
        String string = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            AFKeystoreWrapper = (d + 123) % 128;
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    int i = AFKeystoreWrapper + 125;
                    d = i % 128;
                    if (i % 2 == 0) {
                        string = extras.getString("af");
                        int i2 = 53 / 0;
                        if (string != null) {
                            AFKeystoreWrapper = (d + 11) % 128;
                            AFLogger.INSTANCE.w(AFg1cSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(string));
                            extras.remove("af");
                            activity.setIntent(intent.putExtras(extras));
                            AFKeystoreWrapper = (d + 69) % 128;
                        }
                    } else {
                        string = extras.getString("af");
                        if (string != null) {
                            AFKeystoreWrapper = (d + 11) % 128;
                            AFLogger.INSTANCE.w(AFg1cSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(string));
                            extras.remove("af");
                            activity.setIntent(intent.putExtras(extras));
                            AFKeystoreWrapper = (d + 69) % 128;
                        }
                    }
                }
                return string;
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1cSDK.ENGAGEMENT, th.getMessage(), th);
            }
        }
        return string;
    }

    private String getCurrencyIso4217Code(Context context, String str) {
        d = (AFKeystoreWrapper + 117) % 128;
        if (context == null) {
            return null;
        }
        getMediationNetwork(context);
        String monetizationNetwork = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).getCurrencyIso4217Code().getMonetizationNetwork(str);
        d = (AFKeystoreWrapper + 33) % 128;
        return monetizationNetwork;
    }

    public static String getCurrencyIso4217Code(AFc1oSDK aFc1oSDK, String str) {
        String monetizationNetwork = aFc1oSDK.getMonetizationNetwork("CACHED_CHANNEL", null);
        if (monetizationNetwork != null) {
            int i = d;
            int i2 = i + 99;
            AFKeystoreWrapper = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 83 / 0;
            }
            int i4 = i + 111;
            AFKeystoreWrapper = i4 % 128;
            if (i4 % 2 == 0) {
                return monetizationNetwork;
            }
            throw null;
        }
        aFc1oSDK.AFAdRevenueData("CACHED_CHANNEL", str);
        int i5 = d + 77;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final AFc1oSDK getCurrencyIso4217Code(Context context) {
        return (AFc1oSDK) getRevenue(new Object[]{this, context}, -1595266545, 1595266567, System.identityHashCode(this));
    }

    public final AFc1bSDK getCurrencyIso4217Code() {
        return (AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this));
    }

    public static boolean getRevenue(Context context) {
        try {
            if (v4l.d.c(context, w4l.a) == 0) {
                int i = AFKeystoreWrapper + 71;
                d = i % 128;
                if (i % 2 != 0) {
                    return true;
                }
                throw null;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            int i2 = d + 107;
            AFKeystoreWrapper = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 15 / 0;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    public final boolean getRevenue() {
        AFKeystoreWrapper = (d + 27) % 128;
        if (!AFAdRevenueData(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID) || getMediationNetwork() != null) {
            return false;
        }
        int i = d + 49;
        AFKeystoreWrapper = i % 128;
        return i % 2 == 0;
    }

    private void getRevenue(AppsFlyerConversionListener appsFlyerConversionListener) {
        if (appsFlyerConversionListener == null) {
            AFKeystoreWrapper = (d + 13) % 128;
            return;
        }
        this.getMediationNetwork = appsFlyerConversionListener;
        int i = d + 109;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            int i2 = 20 / 0;
        }
    }

    private void getRevenue(Context context, String str) throws UnsupportedEncodingException {
        AFh1eSDK aFh1eSDK = new AFh1eSDK();
        getMediationNetwork(context);
        aFh1eSDK.component4 = null;
        aFh1eSDK.AFAdRevenueData = null;
        aFh1eSDK.areAllFieldsValid = str;
        aFh1eSDK.getMediationNetwork = null;
        getMonetizationNetwork(aFh1eSDK);
        d = (AFKeystoreWrapper + 5) % 128;
    }

    private void getRevenue(String str) {
        final AFh1jSDK monetizationNetwork = new AFh1lSDK().getMonetizationNetwork(((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).getCurrencyIso4217Code().getMonetizationNetwork.getMediationNetwork("appsFlyerCount", 0));
        monetizationNetwork.areAllFieldsValid = str;
        if (str != null) {
            int i = d + 39;
            AFKeystoreWrapper = i % 128;
            if (i % 2 == 0 ? str.length() > 5 : str.length() > 2) {
                int i2 = d + 35;
                AFKeystoreWrapper = i2 % 128;
                if (i2 % 2 == 0) {
                    if (((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFLogger().AFAdRevenueData(monetizationNetwork)) {
                        AFj1aSDK.AFAdRevenueData(((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).getMonetizationNetwork(), new Runnable() { // from class: com.appsflyer.internal.c
                            @Override // java.lang.Runnable
                            public final void run() throws UnsupportedEncodingException {
                                this.a.getMediationNetwork(monetizationNetwork);
                            }
                        }, 5L, TimeUnit.MILLISECONDS);
                    }
                } else {
                    ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFLogger().AFAdRevenueData(monetizationNetwork);
                    throw null;
                }
            }
        }
        d = (AFKeystoreWrapper + 111) % 128;
    }

    public final Map<String, Object> getRevenue(AFh1jSDK aFh1jSDK) throws UnsupportedEncodingException {
        int i;
        Context context = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).registerClient().getRevenue;
        AFc1oSDK aFc1oSDK = (AFc1oSDK) getRevenue(new Object[]{this, context}, -1595266545, 1595266567, System.identityHashCode(this));
        AFg1rSDK aFg1rSDKComponent4 = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).component4();
        boolean monetizationNetwork = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMonetizationNetwork();
        boolean mediationNetwork = aFh1jSDK.getMediationNetwork();
        Map<String, Object> map = aFh1jSDK.getCurrencyIso4217Code;
        long time = new Date().getTime();
        Object[] objArr = new Object[1];
        a(null, "\u0089\u0086\u0081\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (monetizationNetwork) {
                d = (AFKeystoreWrapper + 29) % 128;
                AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
                i = AFKeystoreWrapper + 123;
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                sb.append(mediationNetwork ? "Launch" : aFh1jSDK.component4);
                aFLogger.i(aFg1cSDK, sb.toString(), true);
                i = AFKeystoreWrapper + 57;
            }
            d = i % 128;
            component2(context);
            int monetizationNetwork2 = getMonetizationNetwork(aFc1oSDK, mediationNetwork);
            int mediationNetwork2 = getMediationNetwork(aFc1oSDK, aFh1jSDK.component4 != null);
            if (mediationNetwork && monetizationNetwork2 == 1) {
                AppsFlyerProperties.getInstance().getRevenue = true;
            }
            aFg1rSDKComponent4.getCurrencyIso4217Code(map, monetizationNetwork2, mediationNetwork2);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Error while preparing to send event", th, true, true, true);
        }
        d = (AFKeystoreWrapper + 115) % 128;
        return map;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        PluginInfo pluginInfo = (PluginInfo) objArr[1];
        int i = AFKeystoreWrapper + 79;
        d = i % 128;
        if (i % 2 != 0) {
            Objects.requireNonNull(pluginInfo);
            ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).e().getMediationNetwork(pluginInfo);
            return null;
        }
        Objects.requireNonNull(pluginInfo);
        ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).e().getMediationNetwork(pluginInfo);
        throw null;
    }

    private void getRevenue(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, 1290570600, -1290570599, System.identityHashCode(this));
    }

    private static void getRevenue(String str, boolean z) {
        getRevenue(new Object[]{str, Boolean.valueOf(z)}, -222394073, 222394090, (int) System.currentTimeMillis());
    }
}
