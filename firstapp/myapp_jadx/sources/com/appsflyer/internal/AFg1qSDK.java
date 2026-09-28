package com.appsflyer.internal;

import android.app.UiModeManager;
import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import defpackage.hwr;
import defpackage.inm;
import defpackage.kpu;
import defpackage.qlr;
import defpackage.ttr;
import defpackage.zi50;
import j$.util.DesugarTimeZone;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1qSDK implements AFg1rSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int i = 1;
    private static int w;
    private final AFg1sSDK AFAdRevenueData;
    private final ttr AFKeystoreWrapper;
    private final AFc1pSDK areAllFieldsValid;
    private final AFc1oSDK component1;
    private final AFg1vSDK component2;
    private final AFh1tSDK component3;
    private final AFi1sSDK component4;
    private final AFf1cSDK copy;
    private final ttr copydefault;
    private final AFc1gSDK equals;
    private final AFi1lSDK getCurrencyIso4217Code;
    private final Context getMediationNetwork;
    private final AFj1pSDK getMonetizationNetwork;
    private final String getRevenue;
    private final AFg1xSDK hashCode;
    private final AFc1eSDK toString;
    private static char[] AFInAppEventType = {35909, 35928, 35921, 35926, 35927, 35903, 35904, 35924, 35933, 35910, 35931, 35879, 35908, 35905, 35911};
    private static int AFLogger = 1912311267;
    private static boolean AFInAppEventParameterName = true;
    private static boolean registerClient = true;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1qSDK$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/text/SimpleDateFormat;", "AFAdRevenueData", "()Ljava/text/SimpleDateFormat;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass3 extends qlr implements Function0<SimpleDateFormat> {
        public static final AnonymousClass3 getRevenue = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1qSDK$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/AppsFlyerProperties;", "getCurrencyIso4217Code", "()Lcom/appsflyer/AppsFlyerProperties;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass5 extends qlr implements Function0<AppsFlyerProperties> {
        public static final AnonymousClass5 getMonetizationNetwork = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AppsFlyerProperties invoke() {
            return AppsFlyerProperties.getInstance();
        }
    }

    public AFg1qSDK(String str, Context context, AFi1lSDK aFi1lSDK, AFg1sSDK aFg1sSDK, AFj1pSDK aFj1pSDK, AFg1vSDK aFg1vSDK, AFh1tSDK aFh1tSDK, AFc1oSDK aFc1oSDK, AFc1pSDK aFc1pSDK, AFi1sSDK aFi1sSDK, AFf1cSDK aFf1cSDK, AFc1gSDK aFc1gSDK, AFg1xSDK aFg1xSDK, AFc1eSDK aFc1eSDK) {
        str.getClass();
        context.getClass();
        aFi1lSDK.getClass();
        aFg1sSDK.getClass();
        aFj1pSDK.getClass();
        aFg1vSDK.getClass();
        aFh1tSDK.getClass();
        aFc1oSDK.getClass();
        aFc1pSDK.getClass();
        aFi1sSDK.getClass();
        aFf1cSDK.getClass();
        aFc1gSDK.getClass();
        aFg1xSDK.getClass();
        aFc1eSDK.getClass();
        this.getRevenue = str;
        this.getMediationNetwork = context;
        this.getCurrencyIso4217Code = aFi1lSDK;
        this.AFAdRevenueData = aFg1sSDK;
        this.getMonetizationNetwork = aFj1pSDK;
        this.component2 = aFg1vSDK;
        this.component3 = aFh1tSDK;
        this.component1 = aFc1oSDK;
        this.areAllFieldsValid = aFc1pSDK;
        this.component4 = aFi1sSDK;
        this.copy = aFf1cSDK;
        this.equals = aFc1gSDK;
        this.hashCode = aFg1xSDK;
        this.toString = aFc1eSDK;
        this.copydefault = hwr.b(AnonymousClass5.getMonetizationNetwork);
        this.AFKeystoreWrapper = hwr.b(AnonymousClass3.getRevenue);
    }

    private void AFInAppEventParameterName(Map<String, Object> map) {
        map.getClass();
        long j = this.component3.hashCode;
        if (j != 0) {
            w = (i + 41) % 128;
            map.put("prev_session_dur", Long.valueOf(j));
            i = (w + 31) % 128;
        }
        w = (i + 111) % 128;
    }

    private void AFInAppEventType(Map<String, Object> map) {
        getMediationNetwork(new Object[]{this, map}, -2015365334, 2015365335, System.identityHashCode(this));
    }

    private static void AFKeystoreWrapper(Map<String, Object> map) {
        int i2 = w + 41;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            map.getClass();
            AFa1zSDK.getMonetizationNetwork();
            AFa1zSDK.getRevenue();
            throw null;
        }
        map.getClass();
        Object monetizationNetwork = AFa1zSDK.getMonetizationNetwork();
        String revenue = AFa1zSDK.getRevenue();
        if (monetizationNetwork == null || revenue == null || Integer.parseInt(revenue) <= 0) {
            return;
        }
        w = (i + 57) % 128;
        map.put("reinstallCounter", revenue);
        map.put("originalAppsflyerId", monetizationNetwork);
    }

    private void AFLogger(Map<String, Object> map) {
        map.getClass();
        String string = getMonetizationNetwork().getString(AppsFlyerProperties.EXTENSION);
        if (string != null) {
            w = (i + 39) % 128;
            if (string.length() == 0) {
                return;
            }
            w = (i + 117) % 128;
            map.put(AppsFlyerProperties.EXTENSION, string);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007a -> B:20:0x006a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(java.lang.String r10, java.lang.String r11, int[] r12, int r13, java.lang.Object[] r14) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1qSDK.a(java.lang.String, java.lang.String, int[], int, java.lang.Object[]):void");
    }

    private void afDebugLog(Map<String, Object> map) {
        String revenue;
        map.getClass();
        if (getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            i = (w + 113) % 128;
            try {
                this.getMediationNetwork.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                revenue = this.areAllFieldsValid.getRevenue(this.getMediationNetwork);
                w = (i + 105) % 128;
            } catch (Throwable unused) {
                revenue = null;
            }
            if (revenue != null) {
                w = (i + 119) % 128;
                map.put("fb", revenue);
            }
        }
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        Map map = (Map) objArr[1];
        map.getClass();
        AFh1tSDK aFh1tSDK = aFg1qSDK.component3;
        HashMap map2 = new HashMap(aFh1tSDK.AFAdRevenueData);
        aFh1tSDK.AFAdRevenueData.clear();
        aFh1tSDK.getCurrencyIso4217Code.getCurrencyIso4217Code("gcd");
        if (map2.isEmpty()) {
            w = (i + 29) % 128;
            return null;
        }
        int i2 = (i + 111) % 128;
        w = i2;
        int i3 = i2 + 31;
        i = i3 % 128;
        if (i3 % 2 != 0) {
            Map<String, Object> monetizationNetwork = AFa1uSDK.getMonetizationNetwork((Map<String, Object>) map);
            monetizationNetwork.getClass();
            monetizationNetwork.put("gcd", map2);
            return null;
        }
        Map<String, Object> monetizationNetwork2 = AFa1uSDK.getMonetizationNetwork((Map<String, Object>) map);
        monetizationNetwork2.getClass();
        monetizationNetwork2.put("gcd", map2);
        int i4 = 88 / 0;
        return null;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        Map map = (Map) objArr[1];
        AFg1sSDK.AFa1uSDK aFa1uSDKAFAdRevenueData = aFg1qSDK.AFAdRevenueData.AFAdRevenueData(aFg1qSDK.getMediationNetwork);
        float f = aFa1uSDKAFAdRevenueData.getRevenue;
        String str = aFa1uSDKAFAdRevenueData.AFAdRevenueData;
        map.put("btl", String.valueOf(f));
        if (str != null) {
            i = (w + 95) % 128;
            map.put("btch", str);
        }
        int i2 = i + 31;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 14 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        w = (i + 79) % 128;
        String monetizationNetwork = aFg1qSDK.component1.getMonetizationNetwork("androidIdCached", null);
        try {
            String string = Settings.Secure.getString(aFg1qSDK.getMediationNetwork.getContentResolver(), "android_id");
            if (string != null) {
                w = (i + 13) % 128;
                return string;
            }
        } catch (Exception e) {
            AFLogger.afErrorLog(e.getMessage(), e);
        }
        if (monetizationNetwork == null) {
            return null;
        }
        AFLogger.afDebugLog("use cached AndroidId: " + monetizationNetwork);
        int i2 = w + 3;
        i = i2 % 128;
        if (i2 % 2 != 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        i = (w + 85) % 128;
        map.getClass();
        if (aFg1qSDK.getMonetizationNetwork().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            return null;
        }
        String mediationNetwork = aFg1qSDK.copy.getMediationNetwork(aFg1qSDK.component1);
        if (mediationNetwork != null && mediationNetwork.length() != 0) {
            int i2 = w + 87;
            i = i2 % 128;
            if (i2 % 2 == 0) {
                map.put("imei", mediationNetwork);
                int i3 = 7 / 0;
            } else {
                map.put("imei", mediationNetwork);
            }
        }
        String revenue = aFg1qSDK.getRevenue(str);
        if (revenue != null) {
            int i4 = w + 43;
            i = i4 % 128;
            int i5 = i4 % 2;
            AFc1oSDK aFc1oSDK = aFg1qSDK.component1;
            if (i5 == 0) {
                aFc1oSDK.AFAdRevenueData("androidIdCached", revenue);
                map.put("android_id", revenue);
                int i6 = 37 / 0;
            } else {
                aFc1oSDK.AFAdRevenueData("androidIdCached", revenue);
                map.put("android_id", revenue);
            }
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
        }
        AFb1mSDK currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(aFg1qSDK.getMediationNetwork);
        if (currencyIso4217Code != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = currencyIso4217Code.getMediationNetwork;
            bool.getClass();
            linkedHashMap.put("isManual", bool);
            String str2 = currencyIso4217Code.getCurrencyIso4217Code;
            str2.getClass();
            linkedHashMap.put("val", str2);
            Boolean bool2 = currencyIso4217Code.getRevenue;
            if (bool2 != null) {
                linkedHashMap.put("isLat", bool2);
            }
            map.put("oaid", linkedHashMap);
        }
        return null;
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        Map map = (Map) objArr[0];
        int i2 = i + 107;
        w = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                map.getClass();
                map.put("lang", Locale.getDefault().getDisplayLanguage());
                throw null;
            }
            map.getClass();
            map.put("lang", Locale.getDefault().getDisplayLanguage());
            try {
                map.put("lang_code", Locale.getDefault().getLanguage());
                i = (w + 51) % 128;
            } catch (Exception e) {
                AFLogger.afErrorLog("Exception while collecting display language code. ", e);
            }
            try {
                map.put("country", Locale.getDefault().getCountry());
                return null;
            } catch (Exception e2) {
                AFLogger.afErrorLog("Exception while collecting country name. ", e2);
                return null;
            }
        } catch (Exception e3) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e3);
        }
    }

    private final void copy(Map<String, Object> map) {
        UiModeManager uiModeManager;
        int i2 = w + 19;
        i = i2 % 128;
        if (i2 % 2 != 0 || Build.VERSION.SDK_INT >= 117) {
            uiModeManager = (UiModeManager) this.getMediationNetwork.getSystemService(UiModeManager.class);
        } else {
            Object systemService = this.getMediationNetwork.getSystemService("uimode");
            uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
        }
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return;
        }
        map.put("tv", Boolean.TRUE);
        i = (w + 63) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        if (r1.toString.equals != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if (r1.toString.equals != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        com.appsflyer.internal.AFg1qSDK.w = (com.appsflyer.internal.AFg1qSDK.i + 93) % 128;
        com.appsflyer.internal.AFh1ySDK.i$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.internal.AFg1cSDK.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0078, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        com.appsflyer.internal.AFh1ySDK.i$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.internal.AFg1cSDK.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object copydefault(java.lang.Object[] r18) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1qSDK.copydefault(java.lang.Object[]):java.lang.Object");
    }

    private void d(Map<String, Object> map) {
        map.getClass();
        if (this.component1.getRevenue("is_stop_tracking_used")) {
            i = (w + 49) % 128;
            map.put("istu", String.valueOf(this.component1.getMediationNetwork("is_stop_tracking_used", false)));
            i = (w + 79) % 128;
        }
        int i2 = i + 125;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0055  */
    /* JADX WARN: Code duplicated, block: B:12:0x005b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0047  */
    private void e(Map<String, Object> map) {
        int i2;
        int i3 = w + 5;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            map.getClass();
            boolean mediationNetwork = AFg1tSDK.getMediationNetwork(this.getMediationNetwork);
            AFLogger.afDebugLog("didConfigureTokenRefreshService=" + mediationNetwork);
            int i4 = 45 / 0;
            if (!mediationNetwork) {
                i2 = i + 33;
                w = i2 % 128;
                if (i2 % 2 == 0) {
                    map.put("tokenRefreshConfigured", Boolean.FALSE);
                    throw null;
                }
                map.put("tokenRefreshConfigured", Boolean.FALSE);
            }
        } else {
            map.getClass();
            boolean mediationNetwork2 = AFg1tSDK.getMediationNetwork(this.getMediationNetwork);
            AFLogger.afDebugLog("didConfigureTokenRefreshService=" + mediationNetwork2);
            if (!mediationNetwork2) {
                i2 = i + 33;
                w = i2 % 128;
                if (i2 % 2 == 0) {
                    map.put("tokenRefreshConfigured", Boolean.FALSE);
                    throw null;
                }
                map.put("tokenRefreshConfigured", Boolean.FALSE);
            }
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1tSDK.getCurrencyIso4217Code(this.component1)));
    }

    private final String equals() {
        File fileAFAdRevenueData = AFAdRevenueData(getMediationNetwork("ro.appsflyer.preinstall.path"));
        if (getMonetizationNetwork(fileAFAdRevenueData)) {
            fileAFAdRevenueData = AFAdRevenueData(getCurrencyIso4217Code("AF_PRE_INSTALL_PATH"));
        }
        if (getMonetizationNetwork(fileAFAdRevenueData)) {
            fileAFAdRevenueData = AFAdRevenueData("/data/local/tmp/pre_install.appsflyer");
        }
        if (getMonetizationNetwork(fileAFAdRevenueData)) {
            fileAFAdRevenueData = AFAdRevenueData("/etc/pre_install.appsflyer");
            w = (i + 51) % 128;
        }
        if (getMonetizationNetwork(fileAFAdRevenueData)) {
            i = (w + HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS) % 128;
            return null;
        }
        String packageName = this.getMediationNetwork.getPackageName();
        packageName.getClass();
        return getMonetizationNetwork(fileAFAdRevenueData, packageName);
    }

    private final void getCurrencyIso4217Code(Map<String, Object> map, int i2) {
        w = (i + 75) % 128;
        try {
            if (this.areAllFieldsValid.n_().versionCode > this.component1.getMediationNetwork("versionCode", 0)) {
                w = (i + 39) % 128;
                this.component1.getRevenue("versionCode", this.areAllFieldsValid.n_().versionCode);
            }
            map.put("app_version_code", String.valueOf(this.areAllFieldsValid.n_().versionCode));
            map.put("app_version_name", this.areAllFieldsValid.n_().versionName);
            map.put("targetSDKver", Integer.valueOf(this.areAllFieldsValid.getRevenue.getRevenue.getApplicationInfo().targetSdkVersion));
            map.put("date1", getMediationNetwork().format(new Date(((Long) getMediationNetwork(new Object[]{this}, -1521351773, 1521351785, System.identityHashCode(this))).longValue())));
            map.put("date2", getMediationNetwork().format(new Date(this.areAllFieldsValid.n_().lastUpdateTime)));
            Object[] objArr = new Object[1];
            a(null, "\u008d\u0085\u0087\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, 126 - TextUtils.lastIndexOf("", '0', 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            SimpleDateFormat mediationNetwork = getMediationNetwork();
            mediationNetwork.getClass();
            map.put(strIntern, getCurrencyIso4217Code(mediationNetwork, i2));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0092  */
    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i2, int i3, int i4) {
        int i5 = ~i3;
        int i6 = ~i4;
        switch ((((~(i2 | i3)) | (~(i4 | i5))) * 49) + (((~((~i2) | i6)) | i5 | (~(i2 | i4))) * (-49)) + (((~(i5 | i6)) | (~(i5 | i2))) * 98) + (i3 * (-97)) + (i2 * 50)) {
            case 1:
                return AFAdRevenueData(objArr);
            case 2:
                return getMonetizationNetwork(objArr);
            case 3:
                return getRevenue(objArr);
            case 4:
                return getMediationNetwork(objArr);
            case 5:
                return areAllFieldsValid(objArr);
            case 6:
                return component1(objArr);
            case 7:
                return component3(objArr);
            case 8:
                return component2(objArr);
            case 9:
                return component4(objArr);
            case 10:
                return copydefault(objArr);
            case 11:
                AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
                if (aFg1qSDK.getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
                    w = (i + 93) % 128;
                } else {
                    i = (w + 57) % 128;
                    if (aFg1qSDK.getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                        w = (i + 93) % 128;
                    } else {
                        w = (i + 81) % 128;
                        AFa1uSDK.getMonetizationNetwork();
                        if (AFa1uSDK.getRevenue(aFg1qSDK.getMediationNetwork)) {
                            i = (w + 59) % 128;
                            return Boolean.FALSE;
                        }
                    }
                }
                return Boolean.TRUE;
            case 12:
                AFg1qSDK aFg1qSDK2 = (AFg1qSDK) objArr[0];
                w = (i + 83) % 128;
                Long lValueOf = Long.valueOf(aFg1qSDK2.areAllFieldsValid.n_().firstInstallTime);
                i = (w + 45) % 128;
                return lValueOf;
            default:
                return getCurrencyIso4217Code(objArr);
        }
    }

    private void hashCode(Map<String, Object> map) {
        int i2 = w + HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS;
        i = i2 % 128;
        if (i2 % 2 != 0) {
            map.getClass();
            map.put("is_pc", Boolean.valueOf(this.getMediationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        } else {
            map.getClass();
            map.put("is_pc", Boolean.valueOf(this.getMediationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            throw null;
        }
    }

    private void i(Map<String, Object> map) {
        AFb1mSDK aFb1mSDKL_;
        int i2 = i + 57;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            map.getClass();
            aFb1mSDKL_ = AFb1kSDK.l_(this.getMediationNetwork.getContentResolver());
            int i3 = 54 / 0;
            if (aFb1mSDKL_ == null) {
                return;
            }
        } else {
            map.getClass();
            aFb1mSDKL_ = AFb1kSDK.l_(this.getMediationNetwork.getContentResolver());
            if (aFb1mSDKL_ == null) {
                return;
            }
        }
        i = (w + 97) % 128;
        map.put("amazon_aid", aFb1mSDKL_.getCurrencyIso4217Code);
        map.put("amazon_aid_limit", String.valueOf(aFb1mSDKL_.getRevenue));
    }

    private void registerClient(Map<String, Object> map) {
        i = (w + 51) % 128;
        map.getClass();
        map.put("af_preinstalled", String.valueOf(this.areAllFieldsValid.getMediationNetwork(this.getMediationNetwork)));
        int i2 = w + 91;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private final void toString(Map<String, Object> map) {
        int i2 = i + 117;
        w = i2 % 128;
        int i3 = i2 % 2;
        Context context = this.getMediationNetwork;
        if (i3 != 0) {
            AFg1kSDK.AFAdRevenueData(context);
            throw null;
        }
        if (AFg1kSDK.AFAdRevenueData(context)) {
            map.put("inst_app", Boolean.TRUE);
            i = (w + 29) % 128;
        }
    }

    private static void unregisterClient(Map<String, Object> map) {
        getMediationNetwork(new Object[]{map}, -43428876, 43428885, (int) System.currentTimeMillis());
    }

    private void w(Map<String, Object> map) {
        int i2 = i + 31;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            map.getClass();
            this.copy.getMediationNetwork();
            throw null;
        }
        map.getClass();
        String mediationNetwork = this.copy.getMediationNetwork();
        if (mediationNetwork == null || mediationNetwork.length() == 0) {
            return;
        }
        int i3 = w + 83;
        i = i3 % 128;
        if (i3 % 2 != 0) {
            map.put("appsflyerKey", mediationNetwork);
        } else {
            map.put("appsflyerKey", mediationNetwork);
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void AFAdRevenueData(AFh1jSDK aFh1jSDK) {
        boolean zG;
        AFd1aSDK aFd1aSDK;
        aFh1jSDK.getClass();
        if (this.areAllFieldsValid.component1()) {
            AFh1pSDK aFh1pSDK = this.areAllFieldsValid.AFAdRevenueData.component2;
            if (aFh1pSDK == null) {
                i = (w + HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS) % 128;
                return;
            }
            String str = aFh1pSDK.getMonetizationNetwork;
            if (str != null && str.length() != 0) {
                aFh1jSDK.getMonetizationNetwork("gaidError", aFh1pSDK.getMonetizationNetwork);
            }
            String str2 = aFh1pSDK.getRevenue;
            if (str2 != null) {
                i = (w + 121) % 128;
                if (aFh1pSDK.getCurrencyIso4217Code != null) {
                    aFh1jSDK.getMonetizationNetwork("advertiserId", str2);
                    aFh1jSDK.getMonetizationNetwork("advertiserIdEnabled", String.valueOf(aFh1pSDK.getCurrencyIso4217Code));
                    aFh1jSDK.getMonetizationNetwork("isGaidWithGps", String.valueOf(aFh1pSDK.getMediationNetwork));
                }
            }
        } else {
            int i2 = i + 37;
            w = i2 % 128;
            if (i2 % 2 != 0) {
                Map<String, Object> monetizationNetwork = AFa1uSDK.getMonetizationNetwork(aFh1jSDK.getCurrencyIso4217Code);
                monetizationNetwork.getClass();
                monetizationNetwork.put("ad_ids_disabled", Boolean.TRUE);
                throw null;
            }
            Map<String, Object> monetizationNetwork2 = AFa1uSDK.getMonetizationNetwork(aFh1jSDK.getCurrencyIso4217Code);
            monetizationNetwork2.getClass();
            monetizationNetwork2.put("ad_ids_disabled", Boolean.TRUE);
        }
        AFh1pSDK aFh1pSDK2 = this.areAllFieldsValid.AFAdRevenueData.component2;
        if (aFh1pSDK2 != null) {
            i = (w + 45) % 128;
            zG = Intrinsics.g(aFh1pSDK2.component3, Boolean.TRUE);
        } else {
            zG = false;
        }
        aFh1jSDK.getMonetizationNetwork("GAID_retry", String.valueOf(zG));
        if (!kotlin.collections.b.k(AFe1mSDK.CONVERSION, AFe1mSDK.LAUNCH).contains(aFh1jSDK.getCurrencyIso4217Code()) || (aFd1aSDK = this.toString.component4) == null) {
            return;
        }
        int i3 = w + 7;
        i = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = aFh1jSDK.getCurrencyIso4217Code;
        if (i4 == 0) {
            Map<String, Object> monetizationNetwork3 = AFa1uSDK.getMonetizationNetwork(map);
            monetizationNetwork3.getClass();
            monetizationNetwork3.put("fetchAdIdLatency", Long.valueOf(aFd1aSDK.getRevenue));
            throw null;
        }
        Map<String, Object> monetizationNetwork4 = AFa1uSDK.getMonetizationNetwork(map);
        monetizationNetwork4.getClass();
        monetizationNetwork4.put("fetchAdIdLatency", Long.valueOf(aFd1aSDK.getRevenue));
        int i5 = i + 33;
        w = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getMonetizationNetwork(AFh1jSDK aFh1jSDK) {
        w = (i + 21) % 128;
        aFh1jSDK.getClass();
        Map<String, Object> map = aFh1jSDK.getCurrencyIso4217Code;
        if (aFh1jSDK.getMediationNetwork()) {
            String str = aFh1jSDK.areAllFieldsValid;
            AFc1eSDK aFc1eSDK = this.toString;
            getCurrencyIso4217Code(aFh1jSDK, str, aFc1eSDK.getMonetizationNetwork, aFc1eSDK.getCurrencyIso4217Code);
        } else if (!(aFh1jSDK instanceof AFh1fSDK)) {
            map.getClass();
            String str2 = aFh1jSDK.component4;
            str2.getClass();
            getMediationNetwork(new Object[]{this, map, str2}, 1127076864, -1127076862, System.identityHashCode(this));
        }
        if (kotlin.collections.b.k(AFe1mSDK.CONVERSION, AFe1mSDK.LAUNCH, AFe1mSDK.INAPP).contains(aFh1jSDK.getCurrencyIso4217Code())) {
            map.getClass();
            hashCode(map);
        }
        if (aFh1jSDK.getMonetizationNetwork()) {
            i = (w + 29) % 128;
            map.getClass();
            component1(map);
            i = (w + 81) % 128;
        }
        map.getClass();
        w(map);
        AFKeystoreWrapper(map);
        getMediationNetwork(new Object[]{this, map}, -2015365334, 2015365335, System.identityHashCode(this));
        AFLogger(map);
        getMediationNetwork(map);
        AFAdRevenueData(map, aFh1jSDK.getMediationNetwork());
        e(map);
        d(map);
        AFAdRevenueData(map, aFh1jSDK);
        map.put("af_events_api", "1");
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getRevenue(Map<String, Object> map) {
        map.getClass();
        AFi1pSDK aFi1pSDK = this.component4.getMediationNetwork;
        AFi1tSDK aFi1tSDKAFAdRevenueData = aFi1pSDK != null ? aFi1pSDK.AFAdRevenueData() : null;
        if (aFi1tSDKAFAdRevenueData != null) {
            map.put("network", aFi1tSDKAFAdRevenueData.getRevenue);
            map.put("ivc", Boolean.valueOf(aFi1tSDKAFAdRevenueData.getCurrencyIso4217Code()));
            if (getMonetizationNetwork().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                w = (i + 95) % 128;
            } else {
                w = (i + 89) % 128;
                String str = aFi1tSDKAFAdRevenueData.getCurrencyIso4217Code;
                if (str != null) {
                    map.put("operator", str);
                }
                String str2 = aFi1tSDKAFAdRevenueData.getMediationNetwork;
                if (str2 != null) {
                    map.put("carrier", str2);
                    return;
                }
            }
            int i2 = i + 7;
            w = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }

    private void component1(Map<String, Object> map) {
        i = (w + 53) % 128;
        map.getClass();
        AFf1cSDK.getMonetizationNetwork(map, this.areAllFieldsValid);
        int i2 = i + 43;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final String component1() {
        return (String) getMediationNetwork(new Object[]{this}, 969328908, -969328900, System.identityHashCode(this));
    }

    private final boolean copy() {
        return ((Boolean) getMediationNetwork(new Object[]{this}, -932948428, 932948439, System.identityHashCode(this))).booleanValue();
    }

    private String component2() {
        String string = getMonetizationNetwork().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string == null) {
            i = (w + 75) % 128;
            string = getCurrencyIso4217Code("AF_STORE");
        }
        int i2 = i + 95;
        w = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    private final void equals(Map<String, Object> map) {
        int i2 = w + 85;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 / 0;
            if (!getMonetizationNetwork().isOtherSdkStringDisabled()) {
                map.put("batteryLevel", String.valueOf(this.AFAdRevenueData.AFAdRevenueData(this.getMediationNetwork).getRevenue));
            }
        } else if (!getMonetizationNetwork().isOtherSdkStringDisabled()) {
            map.put("batteryLevel", String.valueOf(this.AFAdRevenueData.AFAdRevenueData(this.getMediationNetwork).getRevenue));
        }
        int i4 = i + 69;
        w = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private void component2(Map<String, ? extends Object> map) {
        getMediationNetwork(new Object[]{this, map}, -2029029470, 2029029475, System.identityHashCode(this));
    }

    private static long areAllFieldsValid() {
        i = (w + 121) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        i = (w + 3) % 128;
        return jCurrentTimeMillis;
    }

    private static void areAllFieldsValid(Map<String, Object> map) throws UnsupportedEncodingException {
        w = (i + 59) % 128;
        map.getClass();
        Object[] objArr = new Object[1];
        a(null, "\u008f\u0089\u0087\u0083\u008e", null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put(LastLoginDeviceInfo.KEY_DEVICE, Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        w = (i + 21) % 128;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getRevenue(AFh1jSDK aFh1jSDK) {
        int i2 = i + 89;
        w = i2 % 128;
        if (i2 % 2 == 0) {
            aFh1jSDK.getClass();
            Map<String, Object> map = aFh1jSDK.getCurrencyIso4217Code;
            map.getClass();
            map.put("open_referrer", aFh1jSDK.getMediationNetwork);
            String str = aFh1jSDK.component2;
            if (str == null || StringsKt.U(str)) {
                return;
            }
            int i3 = i + 41;
            w = i3 % 128;
            if (i3 % 2 == 0) {
                map.put("af_web_referrer", aFh1jSDK.component2);
                return;
            } else {
                map.put("af_web_referrer", aFh1jSDK.component2);
                throw null;
            }
        }
        aFh1jSDK.getClass();
        Map<String, Object> map2 = aFh1jSDK.getCurrencyIso4217Code;
        map2.getClass();
        map2.put("open_referrer", aFh1jSDK.getMediationNetwork);
        throw null;
    }

    private boolean component4() {
        w = (i + 59) % 128;
        boolean z = Boolean.parseBoolean(this.component1.getMonetizationNetwork("sentSuccessfully", null));
        w = (i + 69) % 128;
        return z;
    }

    private final void component4(Map<String, Object> map) {
        getMediationNetwork(new Object[]{this, map}, -217749996, 217750002, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i2 = i + 77;
        w = i2 % 128;
        if (i2 % 2 == 0) {
            map.getClass();
            String string = aFg1qSDK.getMonetizationNetwork().getString(AppsFlyerProperties.ONELINK_ID);
            String string2 = aFg1qSDK.getMonetizationNetwork().getString(AppsFlyerProperties.ONELINK_VERSION);
            if (string != null) {
                map.put("onelink_id", string);
            }
            if (string2 != null) {
                map.put("onelink_ver", string2);
                w = (i + 121) % 128;
            }
            return null;
        }
        map.getClass();
        aFg1qSDK.getMonetizationNetwork().getString(AppsFlyerProperties.ONELINK_ID);
        aFg1qSDK.getMonetizationNetwork().getString(AppsFlyerProperties.ONELINK_VERSION);
        throw null;
    }

    private final String getRevenue(String str) {
        if (!getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false) || (str != null && str.length() != 0)) {
            if (str == null) {
                return null;
            }
            w = (i + 85) % 128;
            return str;
        }
        int i2 = w + 39;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            copy();
            throw null;
        }
        if (!copy()) {
            return null;
        }
        String str2 = (String) getMediationNetwork(new Object[]{this}, 969328908, -969328900, System.identityHashCode(this));
        w = (i + 55) % 128;
        return str2;
    }

    private String getRevenue() {
        return (String) getMediationNetwork(new Object[]{this}, -1875348758, 1875348758, System.identityHashCode(this));
    }

    private final AppsFlyerProperties getMonetizationNetwork() {
        int i2 = i + 79;
        w = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) this.copydefault.getValue();
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        return appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getMonetizationNetwork(Map<String, Object> map) {
        Object bVar;
        i = (w + 27) % 128;
        map.getClass();
        String str = this.toString.getMediationNetwork;
        if (str != null) {
            int i2 = i + 25;
            w = i2 % 128;
            if (i2 % 2 == 0) {
                if (map.get("af_deeplink") != null) {
                    AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                } else {
                    try {
                        zi50.a aVar = zi50.b;
                        JSONObject jSONObject = new JSONObject(str);
                        jSONObject.put("isPush", "true");
                        map.put("af_deeplink", jSONObject.toString());
                        bVar = Unit.a;
                    } catch (Throwable th) {
                        zi50.a aVar2 = zi50.b;
                        bVar = new zi50.b(th);
                    }
                    Throwable thA = zi50.a(bVar);
                    if (thA != null) {
                        i = (w + 123) % 128;
                        AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", thA, false, false, false, false, 120, null);
                    }
                }
            } else {
                map.get("af_deeplink");
                throw null;
            }
        }
        this.toString.getMediationNetwork = null;
        w = (i + 53) % 128;
    }

    private void component3(Map<String, Object> map) {
        getMediationNetwork(new Object[]{this, map}, 1978462197, -1978462194, System.identityHashCode(this));
    }

    private static String component3() {
        return (String) getMediationNetwork(new Object[0], -879088668, 879088672, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        i = (w + 81) % 128;
        map.getClass();
        str.getClass();
        try {
            String monetizationNetwork = aFg1qSDK.component1.getMonetizationNetwork("prev_event_name", null);
            if (monetizationNetwork != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", aFg1qSDK.component1.getCurrencyIso4217Code("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", monetizationNetwork);
                map.put("prev_event", jSONObject);
            }
            aFg1qSDK.component1.AFAdRevenueData("prev_event_name", str);
            aFg1qSDK.component1.getRevenue("prev_event_timestamp", System.currentTimeMillis());
            int i2 = i + 59;
            w = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        } catch (Exception e) {
            AFLogger.afErrorLog("Error while processing previous event.", e);
            return null;
        }
    }

    private void copydefault(Map<String, Object> map) {
        long j;
        map.getClass();
        long currencyIso4217Code = this.component1.getCurrencyIso4217Code("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.component1.getRevenue("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
        if (currencyIso4217Code > 0) {
            int i2 = w + 121;
            i = i2 % 128;
            j = (i2 % 2 == 0 ? jCurrentTimeMillis % currencyIso4217Code : jCurrentTimeMillis - currencyIso4217Code) / 1000;
        } else {
            w = (i + 13) % 128;
            j = -1;
        }
        map.put("timepassedsincelastlaunch", String.valueOf(j));
    }

    private final SimpleDateFormat getMediationNetwork() {
        w = (i + 87) % 128;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.AFKeystoreWrapper.getValue();
        int i2 = w + 45;
        i = i2 % 128;
        if (i2 % 2 != 0) {
            return simpleDateFormat;
        }
        throw null;
    }

    private String getMonetizationNetwork(int i2) {
        int i3 = w + 57;
        i = i3 % 128;
        int i4 = i3 % 2;
        AFc1oSDK aFc1oSDK = this.component1;
        String strComponent2 = null;
        if (i4 == 0) {
            aFc1oSDK.getRevenue("INSTALL_STORE");
            throw null;
        }
        if (aFc1oSDK.getRevenue("INSTALL_STORE")) {
            return this.component1.getMonetizationNetwork("INSTALL_STORE", null);
        }
        if (i2 <= 1) {
            strComponent2 = component2();
        } else {
            int i5 = (w + 117) % 128;
            i = i5;
            w = (i5 + 23) % 128;
        }
        this.component1.AFAdRevenueData("INSTALL_STORE", strComponent2);
        return strComponent2;
    }

    private static List<AFe1mSDK> copydefault() {
        w = (i + HttpStatusCodesKt.HTTP_EARLY_HINTS) % 128;
        List<AFe1mSDK> listK = kotlin.collections.b.k(AFe1mSDK.CONVERSION, AFe1mSDK.LAUNCH, AFe1mSDK.INAPP, AFe1mSDK.MANUAL_PURCHASE_VALIDATION, AFe1mSDK.ARS_VALIDATE, AFe1mSDK.PURCHASE_VALIDATE, AFe1mSDK.ADREVENUE);
        w = (i + 67) % 128;
        return listK;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getMediationNetwork(AFh1jSDK aFh1jSDK) {
        w = (i + 55) % 128;
        aFh1jSDK.getClass();
        Map<String, Object> map = aFh1jSDK.getCurrencyIso4217Code;
        map.getClass();
        AFAdRevenueData(map);
        Map<String, Object> map2 = aFh1jSDK.getCurrencyIso4217Code;
        map2.getClass();
        getCurrencyIso4217Code(map2, aFh1jSDK.component1);
        Map<String, Object> map3 = aFh1jSDK.getCurrencyIso4217Code;
        map3.getClass();
        AFAdRevenueData(map3, aFh1jSDK.component1);
        Map<String, Object> map4 = aFh1jSDK.getCurrencyIso4217Code;
        map4.getClass();
        registerClient(map4);
        Map<String, Object> map5 = aFh1jSDK.getCurrencyIso4217Code;
        map5.getClass();
        afDebugLog(map5);
        Map<String, Object> map6 = aFh1jSDK.getCurrencyIso4217Code;
        map6.getClass();
        AFe1mSDK currencyIso4217Code = aFh1jSDK.getCurrencyIso4217Code();
        currencyIso4217Code.getClass();
        getMediationNetwork(new Object[]{this, map6, currencyIso4217Code}, -1926240735, 1926240745, System.identityHashCode(this));
        int i2 = i + 119;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static void getMonetizationNetwork(Map<String, Object> map, String str) {
        i = (w + 43) % 128;
        map.getClass();
        if (str != null) {
            i = (w + 77) % 128;
            map.put("phone", str);
            w = (i + 1) % 128;
        }
    }

    private static boolean getMonetizationNetwork(File file) {
        w = (i + 93) % 128;
        if (file == null || !file.exists()) {
            return true;
        }
        i = (w + 39) % 128;
        return false;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map, int i2, int i3) {
        boolean z;
        map.getClass();
        map.put("counter", String.valueOf(i2));
        map.put("iaecounter", String.valueOf(i3));
        if (component4()) {
            w = (i + 61) % 128;
            z = false;
        } else {
            i = (w + 115) % 128;
            z = true;
        }
        map.put("isFirstCall", String.valueOf(z));
        i = (w + 37) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0059 A[EXC_TOP_SPLITTER, PHI: r2
      0x0059: PHI (r2v6 java.io.InputStreamReader) = (r2v14 java.io.InputStreamReader), (r2v15 java.io.InputStreamReader) binds: [B:21:0x0057, B:30:0x007c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r2v7 */
    private static String getMonetizationNetwork(File file, String str) {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        int i2 = w;
        int i3 = i2 + 87;
        i = i3 % 128;
        ?? r2 = i3 % 2;
        if (r2 == 0) {
            throw null;
        }
        try {
            if (file == null) {
                int i4 = i2 + 39;
                i = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 58 / 0;
                }
                return null;
            }
            try {
                Properties properties = new Properties();
                inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                try {
                    properties.load(inputStreamReader);
                    AFLogger.afInfoLog("Found PreInstall property!");
                    String property = properties.getProperty(str);
                    try {
                        inputStreamReader.close();
                        return property;
                    } catch (Throwable th) {
                        AFLogger.afErrorLog(th.getMessage(), th);
                        return property;
                    }
                } catch (FileNotFoundException unused) {
                    AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
                    r2 = inputStreamReader;
                    inputStreamReader2 = inputStreamReader;
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader2.close();
                            r2 = inputStreamReader2;
                        } catch (Throwable th2) {
                            AFLogger.afErrorLog(th2.getMessage(), th2);
                            r2 = inputStreamReader2;
                        }
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    AFLogger.afErrorLog(th.getMessage(), th);
                    r2 = inputStreamReader;
                    inputStreamReader2 = inputStreamReader;
                    if (inputStreamReader != null) {
                        inputStreamReader2.close();
                        r2 = inputStreamReader2;
                    }
                    return null;
                }
            } catch (FileNotFoundException unused2) {
                inputStreamReader = null;
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader = null;
            }
        } catch (Throwable th5) {
            if (r2 != 0) {
                try {
                    r2.close();
                } catch (Throwable th6) {
                    AFLogger.afErrorLog(th6.getMessage(), th6);
                }
            }
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0079  */
    /* JADX WARN: Code duplicated, block: B:13:0x0086  */
    /* JADX WARN: Code duplicated, block: B:14:0x008e  */
    private void getCurrencyIso4217Code(Map<String, Object> map, boolean z) {
        int i2;
        AFj1pSDK aFj1pSDK;
        map.getClass();
        HashMap map2 = new HashMap();
        map2.put(lobGSRIlnSGJY.BAbjpBcyU, getMediationNetwork("ro.product.cpu.abi"));
        map2.put("cpu_abi2", getMediationNetwork("ro.product.cpu.abi2"));
        map2.put("arch", getMediationNetwork("os.arch"));
        map2.put("build_display_id", getMediationNetwork("ro.build.display.id"));
        if (z) {
            int i3 = w + 41;
            i = i3 % 128;
            if (i3 % 2 == 0) {
                getMediationNetwork(new Object[]{this, map2}, -217749996, 217750002, System.identityHashCode(this));
                if (this.areAllFieldsValid.getMonetizationNetwork.getMediationNetwork("appsFlyerCount", 1) <= 5) {
                    int i4 = i + 85;
                    w = i4 % 128;
                    i2 = i4 % 2;
                    aFj1pSDK = this.getMonetizationNetwork;
                    if (i2 == 0) {
                        map2.putAll(aFj1pSDK.AFAdRevenueData());
                        throw null;
                    }
                    map2.putAll(aFj1pSDK.AFAdRevenueData());
                }
            } else {
                getMediationNetwork(new Object[]{this, map2}, -217749996, 217750002, System.identityHashCode(this));
                if (this.areAllFieldsValid.getMonetizationNetwork.getMediationNetwork("appsFlyerCount", 0) <= 2) {
                    int i5 = i + 85;
                    w = i5 % 128;
                    i2 = i5 % 2;
                    aFj1pSDK = this.getMonetizationNetwork;
                    if (i2 == 0) {
                        map2.putAll(aFj1pSDK.AFAdRevenueData());
                        throw null;
                    }
                    map2.putAll(aFj1pSDK.AFAdRevenueData());
                }
            }
        }
        map2.put("dim", this.component2.getMediationNetwork(this.getMediationNetwork));
        map.put("deviceData", map2);
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double dPow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / dPow)) + "/" + ((long) (blockCountLong / dPow));
        int i2 = w + 117;
        i = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getMediationNetwork(Map<String, Object> map) {
        i = (w + 77) % 128;
        map.getClass();
        String revenue = AFb1jSDK.getRevenue(this.areAllFieldsValid.getMonetizationNetwork);
        if (revenue != null) {
            map.put("uid", revenue);
            if (this.areAllFieldsValid.getMonetizationNetwork.getMediationNetwork("CUSTOM_INSTALL_ID_APPLIED", false)) {
                map.put("custom_install_id", Boolean.TRUE);
                return;
            }
            return;
        }
        int i2 = w + 93;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getMonetizationNetwork(Map<String, Object> map, AFe1mSDK aFe1mSDK) {
        getMediationNetwork(new Object[]{this, map, aFe1mSDK}, -1926240735, 1926240745, System.identityHashCode(this));
    }

    private static String getMediationNetwork(String str) {
        w = (i + 95) % 128;
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            objInvoke.getClass();
            String str2 = (String) objInvoke;
            int i2 = w + 69;
            i = i2 % 128;
            if (i2 % 2 != 0) {
                return str2;
            }
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private String getCurrencyIso4217Code(SimpleDateFormat simpleDateFormat, int i2) {
        String str;
        simpleDateFormat.getClass();
        String monetizationNetwork = this.component1.getMonetizationNetwork("appsFlyerFirstInstall", null);
        if (monetizationNetwork == null) {
            int i3 = i + 125;
            w = i3 % 128;
            if (i3 % 2 == 0 ? i2 <= 1 : i2 <= 0) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                str = simpleDateFormat.format(new Date());
                w = (i + 121) % 128;
            } else {
                str = "";
            }
            monetizationNetwork = str;
            this.component1.AFAdRevenueData("appsFlyerFirstInstall", monetizationNetwork);
            i = (w + 59) % 128;
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, inm.a("AppsFlyer: first launch date: ", monetizationNetwork), false, 4, null);
        monetizationNetwork.getClass();
        return monetizationNetwork;
    }

    private void getMediationNetwork(Map<String, Object> map, String str) {
        getMediationNetwork(new Object[]{this, map, str}, 1127076864, -1127076862, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getCurrencyIso4217Code(AFh1jSDK aFh1jSDK) throws UnsupportedEncodingException {
        i = (w + 1) % 128;
        aFh1jSDK.getClass();
        Map<String, Object> map = aFh1jSDK.getCurrencyIso4217Code;
        map.getClass();
        getCurrencyIso4217Code(map, aFh1jSDK.getMediationNetwork());
        areAllFieldsValid(map);
        getMediationNetwork(new Object[]{map}, -43428876, 43428885, (int) System.currentTimeMillis());
        getRevenue(map);
        getMediationNetwork(new Object[]{this, map, this.toString.AFAdRevenueData}, -361587280, 361587287, System.identityHashCode(this));
        i(map);
        map.put("cell", kpu.f(new Pair("mcc", Integer.valueOf(this.getMediationNetwork.getResources().getConfiguration().mcc)), new Pair("mnc", Integer.valueOf(this.getMediationNetwork.getResources().getConfiguration().mnc))));
        map.put("sig", (String) getMediationNetwork(new Object[]{this}, -1875348758, 1875348758, System.identityHashCode(this)));
        map.put("last_boot_time", Long.valueOf(areAllFieldsValid()));
        map.put("disk", (String) getMediationNetwork(new Object[0], -879088668, 879088672, (int) System.currentTimeMillis()));
        i = (w + 85) % 128;
    }

    private void AFAdRevenueData(Map<String, Object> map, int i2) {
        boolean z;
        map.getClass();
        String strAreAllFieldsValid = this.areAllFieldsValid.areAllFieldsValid();
        String strAFAdRevenueData = AFAdRevenueData(this.component1, strAreAllFieldsValid);
        boolean z2 = false;
        if (strAFAdRevenueData == null || strAFAdRevenueData.equals(strAreAllFieldsValid)) {
            z = false;
        } else {
            i = (w + 17) % 128;
            z = true;
        }
        if (strAFAdRevenueData == null) {
            int i3 = i + 79;
            w = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (strAreAllFieldsValid != null) {
                z2 = true;
            }
        }
        if (z || z2) {
            map.put("af_latestchannel", strAreAllFieldsValid);
        }
        String monetizationNetwork = getMonetizationNetwork(i2);
        if (monetizationNetwork != null) {
            Locale locale = Locale.getDefault();
            locale.getClass();
            Object lowerCase = monetizationNetwork.toLowerCase(locale);
            lowerCase.getClass();
            map.put("af_installstore", lowerCase);
        }
        String strAFAdRevenueData2 = AFAdRevenueData(i2);
        if (strAFAdRevenueData2 != null) {
            int i4 = i + 11;
            w = i4 % 128;
            if (i4 % 2 == 0) {
                Locale locale2 = Locale.getDefault();
                locale2.getClass();
                Object lowerCase2 = strAFAdRevenueData2.toLowerCase(locale2);
                lowerCase2.getClass();
                map.put("af_preinstall_name", lowerCase2);
            } else {
                Locale locale3 = Locale.getDefault();
                locale3.getClass();
                Object lowerCase3 = strAFAdRevenueData2.toLowerCase(locale3);
                lowerCase3.getClass();
                map.put("af_preinstall_name", lowerCase3);
                throw null;
            }
        } else {
            i = (w + 77) % 128;
        }
        String strComponent2 = component2();
        if (strComponent2 != null) {
            Locale locale4 = Locale.getDefault();
            locale4.getClass();
            Object lowerCase4 = strComponent2.toLowerCase(locale4);
            lowerCase4.getClass();
            map.put("af_currentstore", lowerCase4);
        }
    }

    private final void AFAdRevenueData(Map<String, Object> map) {
        try {
            long jLongValue = ((Long) getMediationNetwork(new Object[]{this}, -1521351773, 1521351785, System.identityHashCode(this))).longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(jLongValue)));
            int i2 = i + 15;
            w = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e);
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map) {
        String[] strArr;
        w = (i + 15) % 128;
        map.getClass();
        String string = getMonetizationNetwork().getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            i = (w + 53) % 128;
            map.put(AppsFlyerProperties.APP_ID, string);
        }
        String string2 = getMonetizationNetwork().getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            if (string2.length() != 3) {
                StringBuilder sb = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb.append(string2);
                sb.append("' is not a legal value.");
                AFLogger.afWarnLog(sb.toString());
                w = (i + 87) % 128;
            }
            map.put("currency", string2);
        }
        String string3 = getMonetizationNetwork().getString(AppsFlyerProperties.IS_UPDATE);
        if (string3 != null) {
            map.put("isUpdate", string3);
        }
        String string4 = getMonetizationNetwork().getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string4 != null) {
            int i2 = w + 123;
            i = i2 % 128;
            if (i2 % 2 != 0) {
                map.put("customData", string4);
            } else {
                map.put("customData", string4);
                throw null;
            }
        }
        String string5 = getMonetizationNetwork().getString(AppsFlyerProperties.APP_USER_ID);
        if (string5 != null) {
            map.put("appUserId", string5);
        }
        String string6 = getMonetizationNetwork().getString(AppsFlyerProperties.USER_EMAILS);
        if (string6 != null) {
            i = (w + 39) % 128;
            map.put("user_emails", string6);
        }
        AFb1uSDK aFb1uSDK = this.toString.getRevenue;
        if (aFb1uSDK == null || (strArr = aFb1uSDK.getMediationNetwork) == null) {
            return;
        }
        int i3 = i + 19;
        w = i3 % 128;
        if (i3 % 2 == 0) {
            map.put("sharing_filter", strArr);
        } else {
            map.put("sharing_filter", strArr);
            throw null;
        }
    }

    private void AFAdRevenueData(Map<String, Object> map, boolean z) {
        w = (i + 53) % 128;
        map.getClass();
        map.put("platformextension", this.getRevenue);
        if (z) {
            map.put("platform_extension_v2", this.getCurrencyIso4217Code.AFAdRevenueData());
            w = (i + 125) % 128;
        }
    }

    private String AFAdRevenueData(int i2) {
        String monetizationNetwork;
        w = (i + 53) % 128;
        String string = getMonetizationNetwork().getString("preInstallName");
        if (string != null) {
            int i3 = w + 15;
            i = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 12 / 0;
            }
            return string;
        }
        if (this.component1.getRevenue("preInstallName")) {
            monetizationNetwork = this.component1.getMonetizationNetwork("preInstallName", null);
        } else {
            if (i2 <= 1) {
                int i5 = i + 99;
                w = i5 % 128;
                if (i5 % 2 == 0) {
                    String strEquals = equals();
                    if (strEquals == null) {
                        int i6 = w + 19;
                        i = i6 % 128;
                        if (i6 % 2 != 0) {
                            strEquals = getCurrencyIso4217Code("AF_PRE_INSTALL_NAME");
                        } else {
                            getCurrencyIso4217Code("AF_PRE_INSTALL_NAME");
                            throw null;
                        }
                    }
                    string = strEquals;
                } else {
                    equals();
                    throw null;
                }
            }
            if (string != null) {
                this.component1.AFAdRevenueData("preInstallName", string);
            }
            monetizationNetwork = string;
        }
        if (monetizationNetwork != null) {
            i = (w + 73) % 128;
            getMonetizationNetwork().set("preInstallName", monetizationNetwork);
        }
        return monetizationNetwork;
    }

    private void AFAdRevenueData(Map<String, Object> map, String str) {
        int i2 = w + HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS;
        i = i2 % 128;
        if (i2 % 2 != 0) {
            map.getClass();
            if (str != null && str.length() != 0) {
                int i3 = i + 17;
                w = i3 % 128;
                if (i3 % 2 == 0) {
                    map.put("referrer", str);
                    w = (i + 67) % 128;
                } else {
                    map.put("referrer", str);
                    throw null;
                }
            }
            String monetizationNetwork = this.component1.getMonetizationNetwork("extraReferrers", null);
            if (monetizationNetwork != null) {
                map.put("extraReferrers", monetizationNetwork);
            }
            String referrer = getMonetizationNetwork().getReferrer(this.component1);
            if (referrer != null && referrer.length() != 0) {
                int i4 = w + 67;
                i = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 10 / 0;
                    if (map.get("referrer") != null) {
                        return;
                    }
                } else if (map.get("referrer") != null) {
                    return;
                }
                map.put("referrer", referrer);
                return;
            }
            w = (i + 17) % 128;
            return;
        }
        map.getClass();
        throw null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) throws NoSuchAlgorithmException {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        i = (w + 55) % 128;
        String strN_ = AFj1iSDK.N_(aFg1qSDK.getMediationNetwork.getApplicationContext().getPackageManager(), aFg1qSDK.getMediationNetwork.getApplicationContext().getPackageName());
        int i2 = i + 121;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 27 / 0;
        }
        return strN_;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final long getCurrencyIso4217Code() {
        w = (i + 7) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis();
        i = (w + 105) % 128;
        return jCurrentTimeMillis;
    }

    private void getCurrencyIso4217Code(AFh1jSDK aFh1jSDK, String str, String str2, AFb1rSDK aFb1rSDK) {
        i = (w + 53) % 128;
        aFh1jSDK.getClass();
        Map<String, Object> map = aFh1jSDK.getCurrencyIso4217Code;
        if (aFh1jSDK.getCurrencyIso4217Code() == AFe1mSDK.CONVERSION) {
            i = (w + 13) % 128;
            map.getClass();
            equals(map);
            copy(map);
            toString(map);
            AFa1zSDK.getMonetizationNetwork(this.equals, this.areAllFieldsValid);
            i = (w + 3) % 128;
        }
        map.getClass();
        copydefault(map);
        getMediationNetwork(new Object[]{this, map}, 1978462197, -1978462194, System.identityHashCode(this));
        getMediationNetwork(new Object[]{this, map}, -2029029470, 2029029475, System.identityHashCode(this));
        getMonetizationNetwork(map, str2);
        AFAdRevenueData(map, str);
        AFInAppEventParameterName(map);
        if (aFb1rSDK != null) {
            int i2 = i + 9;
            w = i2 % 128;
            if (i2 % 2 == 0) {
                aFb1rSDK.getMonetizationNetwork(map);
            } else {
                aFb1rSDK.getMonetizationNetwork(map);
                int i3 = 18 / 0;
            }
        }
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i2 = i + 119;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            map.getClass();
            map.putAll(aFg1qSDK.hashCode.getCurrencyIso4217Code());
            int i3 = 68 / 0;
        } else {
            map.getClass();
            map.putAll(aFg1qSDK.hashCode.getCurrencyIso4217Code());
        }
        int i4 = i + 53;
        w = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return null;
    }

    private final String getCurrencyIso4217Code(String str) {
        w = (i + 63) % 128;
        String monetizationNetwork = this.areAllFieldsValid.getMonetizationNetwork(str);
        int i2 = i + 3;
        w = i2 % 128;
        if (i2 % 2 == 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    private void getCurrencyIso4217Code(Map<String, Object> map, String str) {
        getMediationNetwork(new Object[]{this, map, str}, -361587280, 361587287, System.identityHashCode(this));
    }

    private static String AFAdRevenueData(AFc1oSDK aFc1oSDK, String str) {
        w = (i + 77) % 128;
        String monetizationNetwork = aFc1oSDK.getMonetizationNetwork("CACHED_CHANNEL", null);
        if (monetizationNetwork != null) {
            i = (w + 27) % 128;
            return monetizationNetwork;
        }
        aFc1oSDK.AFAdRevenueData("CACHED_CHANNEL", str);
        return str;
    }

    private static File AFAdRevenueData(String str) {
        if (str != null) {
            try {
                if (StringsKt.t0(str).toString().length() > 0) {
                    return new File(StringsKt.t0(str).toString());
                }
                i = (w + 3) % 128;
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
            }
        }
        w = (i + 5) % 128;
        return null;
    }

    private static void AFAdRevenueData(Map<String, Object> map, AFh1jSDK aFh1jSDK) {
        map.getClass();
        aFh1jSDK.getClass();
        String str = aFh1jSDK.component4;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFh1jSDK.AFAdRevenueData;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final Long AFAdRevenueData() {
        return (Long) getMediationNetwork(new Object[]{this}, -1521351773, 1521351785, System.identityHashCode(this));
    }
}
