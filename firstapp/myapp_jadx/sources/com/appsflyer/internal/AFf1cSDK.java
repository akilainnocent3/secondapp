package com.appsflyer.internal;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1cSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 0;
    private static int copydefault = 1;
    private long AFAdRevenueData;
    private volatile String areAllFieldsValid;
    private volatile String component1;
    Map<String, Object> getCurrencyIso4217Code;
    private final AFc1gSDK getMonetizationNetwork;
    private final AFf1eSDK getRevenue;
    private static char[] component4 = {6849, 65232, 53971, 46742, 35473, 28323, 16961, 9801, 14948, 7687, 61969, 54818};
    private static long component3 = -3612185266591219208L;
    private boolean getMediationNetwork = false;
    private volatile boolean component2 = false;

    public AFf1cSDK(AFc1gSDK aFc1gSDK, AFf1eSDK aFf1eSDK) {
        this.getMonetizationNetwork = aFc1gSDK;
        this.getRevenue = aFf1eSDK;
    }

    private static void a(int i, int i2, char c, Object[] objArr) {
        int i3;
        AFk1hSDK aFk1hSDK = new AFk1hSDK();
        long[] jArr = new long[i];
        aFk1hSDK.getCurrencyIso4217Code = 0;
        while (true) {
            int i4 = aFk1hSDK.getCurrencyIso4217Code;
            if (i4 >= i) {
                break;
            }
            $11 = ($10 + 7) % 128;
            jArr[i4] = (((long) ((char) (((long) component4[i2 + i4]) ^ 8195019394385815022L))) ^ (((long) i4) * (8195019394385815022L ^ component3))) ^ ((long) c);
            aFk1hSDK.getCurrencyIso4217Code = i4 + 1;
        }
        char[] cArr = new char[i];
        aFk1hSDK.getCurrencyIso4217Code = 0;
        while (true) {
            int i5 = aFk1hSDK.getCurrencyIso4217Code;
            if (i5 >= i) {
                objArr[0] = new String(cArr);
                return;
            }
            int i6 = $10 + 67;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr[i5] = (char) jArr[i5];
                i3 = i5 >>> 1;
            } else {
                cArr[i5] = (char) jArr[i5];
                i3 = i5 + 1;
            }
            aFk1hSDK.getCurrencyIso4217Code = i3;
        }
    }

    private long areAllFieldsValid() {
        int i = copydefault + 25;
        copy = i % 128;
        int i2 = i % 2;
        long j = this.AFAdRevenueData;
        if (i2 != 0) {
            int i3 = 66 / 0;
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    private boolean component1() {
        int i = copy + 25;
        copydefault = i % 128;
        int i2 = i % 2;
        Map<String, Object> map = this.getCurrencyIso4217Code;
        if (i2 == 0) {
            int i3 = 16 / 0;
            if (map != null) {
                if (!map.isEmpty()) {
                    copydefault = (copy + 47) % 128;
                    return true;
                }
            }
        } else if (map != null) {
            if (!map.isEmpty()) {
                copydefault = (copy + 47) % 128;
                return true;
            }
        }
        int i4 = copydefault + 43;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public static void getCurrencyIso4217Code(AFh1jSDK aFh1jSDK) throws Throwable {
        try {
            new AFb1sSDK(aFh1jSDK).afInfoLog();
            int i = copydefault + 15;
            copy = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e);
        }
    }

    public static void getMonetizationNetwork(Map<String, Object> map, AFc1pSDK aFc1pSDK) {
        copydefault = (copy + 75) % 128;
        if (AFk1xSDK.getRevenue(aFc1pSDK.getMediationNetwork)) {
            copy = (copydefault + 59) % 128;
            String monetizationNetwork = aFc1pSDK.getMonetizationNetwork("com.appsflyer.security.uuid");
            if (AFk1xSDK.getRevenue(monetizationNetwork)) {
                monetizationNetwork = AFc1pSDK.getMonetizationNetwork();
            }
            aFc1pSDK.getMediationNetwork = monetizationNetwork.substring(0, 8);
            copy = (copydefault + 19) % 128;
        }
        String str = aFc1pSDK.getMediationNetwork;
        try {
            Object[] objArr = new Object[1];
            a((Process.myPid() >> 22) + 12, View.MeasureSpec.makeMeasureSpec(0, 0), (char) (48974 - TextUtils.indexOf("", "", 0, 0)), objArr);
            long j = Long.parseLong(String.valueOf(map.get(((String) objArr[0]).intern())));
            char[] charArray = str.toCharArray();
            int i = ((int) (j % 94)) + 33;
            for (int i2 = 0; i2 < charArray.length; i2++) {
                charArray[i2] = (char) (charArray[i2] ^ i);
            }
            map.put("sbid", new String(charArray));
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception occurred while generating sbid ", e);
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        try {
            try {
                Object[] objArr2 = {(Map) objArr[1], ((AFf1cSDK) objArr[0]).getMonetizationNetwork.getRevenue};
                Map map = AFa1jSDK.unregisterClient;
                Object declaredConstructor = map.get(-1144864810);
                if (declaredConstructor == null) {
                    declaredConstructor = ((Class) AFa1jSDK.AFAdRevenueData(125 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 36 - View.MeasureSpec.getSize(0))).getDeclaredConstructor(Map.class, Context.class);
                    map.put(-1144864810, declaredConstructor);
                }
                Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr2);
                copydefault = (copy + 125) % 128;
                return objNewInstance;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", th2);
            return new HashMap();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final boolean AFAdRevenueData() {
        int i = copydefault + 57;
        copy = i % 128;
        int i2 = i % 2;
        boolean z = this.getMediationNetwork;
        if (i2 != 0) {
            int i3 = 32 / 0;
            if (z) {
                if (!component1()) {
                    return true;
                }
            }
        } else if (z) {
            if (!component1()) {
                return true;
            }
        }
        copy = (copydefault + 109) % 128;
        return false;
    }

    public final void component2() {
        copydefault = (copy + 75) % 128;
        this.getCurrencyIso4217Code.put("ttr", Long.valueOf(System.currentTimeMillis() - this.AFAdRevenueData));
        this.getCurrencyIso4217Code.put("lvl_timestamp", Long.valueOf(areAllFieldsValid()));
        copydefault = (copy + 11) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    public final String getMediationNetwork(AFc1oSDK aFc1oSDK) {
        String str;
        copy = (copydefault + 57) % 128;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String monetizationNetwork = aFc1oSDK.getMonetizationNetwork("imeiCached", null);
        if (z && AFk1xSDK.getRevenue(this.areAllFieldsValid)) {
            copydefault = (copy + 75) % 128;
            Context context = this.getMonetizationNetwork.getRevenue;
            if (context == null || !getMediationNetwork(context)) {
                str = null;
            } else {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    str = (String) telephonyManager.getClass().getMethod("getDeviceId", null).invoke(telephonyManager, null);
                    if (str == null) {
                        if (monetizationNetwork != null) {
                            AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(monetizationNetwork)));
                        } else {
                            monetizationNetwork = null;
                        }
                        str = monetizationNetwork;
                    }
                } catch (InvocationTargetException e) {
                    if (monetizationNetwork != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(monetizationNetwork));
                    } else {
                        monetizationNetwork = null;
                    }
                    StringBuilder sb = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                    sb.append(e.getMessage());
                    AFLogger.afErrorLog(sb.toString(), e);
                } catch (Exception e2) {
                    if (monetizationNetwork != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(monetizationNetwork));
                    } else {
                        monetizationNetwork = null;
                    }
                    StringBuilder sb2 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                    sb2.append(e2.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e2);
                }
            }
        } else if (this.areAllFieldsValid != null) {
            copy = (copydefault + 5) % 128;
            str = this.areAllFieldsValid;
        } else {
            str = null;
        }
        if (AFk1xSDK.getRevenue(str)) {
            AFLogger.afInfoLog("IMEI was not collected.");
            int i = copy + 47;
            copydefault = i % 128;
            if (i % 2 == 0) {
                int i2 = 91 / 0;
            }
            return null;
        }
        int i3 = copy + 111;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            aFc1oSDK.AFAdRevenueData("imeiCached", str);
            return str;
        }
        aFc1oSDK.AFAdRevenueData("imeiCached", str);
        throw null;
    }

    public final String getCurrencyIso4217Code() {
        int i = copy + 111;
        copydefault = i % 128;
        int i2 = i % 2;
        String str = this.areAllFieldsValid;
        if (i2 != 0) {
            return str;
        }
        throw null;
    }

    public final void getCurrencyIso4217Code(String str) {
        copydefault = (copy + 67) % 128;
        this.areAllFieldsValid = str;
        copydefault = (copy + 15) % 128;
    }

    public final void getRevenue(boolean z) {
        int i = copydefault + 63;
        copy = i % 128;
        if (i % 2 == 0) {
            this.component2 = z;
            copydefault = (copy + 117) % 128;
        } else {
            this.component2 = z;
            throw null;
        }
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ((i | i4) * 983) + (i2 * 984) + (i * (-1965));
        int i6 = ~i;
        int i7 = ~i3;
        int i8 = (((~(i6 | i2)) | (~(i7 | i6))) * 983) + (((~(i4 | i7)) | i6) * (-983)) + i5;
        if (i8 != 1) {
            return i8 != 2 ? getMediationNetwork(objArr) : getMonetizationNetwork(objArr);
        }
        return getRevenue(objArr);
    }

    public final Map<String, Object> getRevenue() {
        HashMap map = new HashMap();
        if (component1()) {
            int i = copy + 37;
            copydefault = i % 128;
            int i2 = i % 2;
            Map<String, Object> map2 = this.getCurrencyIso4217Code;
            if (i2 == 0) {
                map.put("lvl", map2);
                throw null;
            }
            map.put("lvl", map2);
        } else if (this.getMediationNetwork) {
            this.getCurrencyIso4217Code = new HashMap();
            component2();
            this.getCurrencyIso4217Code.put(AnalyticsEvent.BI_TRACKING_KIND_ERROR, "pending LVL response");
            map.put("lvl", this.getCurrencyIso4217Code);
        }
        copydefault = (copy + 113) % 128;
        return map;
    }

    public final void getRevenue(AFc1pSDK aFc1pSDK) {
        getRevenue(new Object[]{this, aFc1pSDK}, 826598914, -826598912, System.identityHashCode(this));
    }

    public final void getMonetizationNetwork(String str) {
        int i = copy + 77;
        copydefault = i % 128;
        if (i % 2 == 0) {
            this.component1 = str;
            int i2 = 49 / 0;
        } else {
            this.component1 = str;
        }
        copy = (copydefault + 47) % 128;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFf1cSDK aFf1cSDK = (AFf1cSDK) objArr[0];
        AFc1pSDK aFc1pSDK = (AFc1pSDK) objArr[1];
        aFf1cSDK.AFAdRevenueData = System.currentTimeMillis();
        aFf1cSDK.getMediationNetwork = aFf1cSDK.getRevenue.AFAdRevenueData(aFf1cSDK.getMonetizationNetwork(aFc1pSDK), aFf1cSDK.getMonetizationNetwork.getRevenue, new AFf1eSDK.AFa1tSDK() { // from class: com.appsflyer.internal.AFf1cSDK.3
            @Override // com.appsflyer.internal.AFf1eSDK.AFa1tSDK
            public final void AFAdRevenueData(String str, String str2) {
                AFf1cSDK.this.getCurrencyIso4217Code = new ConcurrentHashMap();
                AFf1cSDK.this.getCurrencyIso4217Code.put("signedData", str);
                AFf1cSDK.this.getCurrencyIso4217Code.put("signature", str2);
                AFf1cSDK.this.component2();
                AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
            }

            @Override // com.appsflyer.internal.AFf1eSDK.AFa1tSDK
            public final void AFAdRevenueData(String str, Exception exc) {
                AFf1cSDK.this.getCurrencyIso4217Code = new ConcurrentHashMap();
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                AFf1cSDK.this.component2();
                AFf1cSDK.this.getCurrencyIso4217Code.put(AnalyticsEvent.BI_TRACKING_KIND_ERROR, message);
                AFLogger.afErrorLog(str, exc, true, true, false);
            }
        });
        int i = copy + 107;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    private long getMonetizationNetwork(AFc1pSDK aFc1pSDK) {
        StringBuilder sb = new StringBuilder();
        sb.append(AFb1jSDK.getRevenue(aFc1pSDK.getMonetizationNetwork));
        sb.append(areAllFieldsValid());
        long monetizationNetwork = AFj1bSDK.getMonetizationNetwork(AFj1bSDK.getMonetizationNetwork(sb.toString()));
        copy = (copydefault + 41) % 128;
        return monetizationNetwork;
    }

    public final Map<String, Object> getMonetizationNetwork(Map<String, Object> map) {
        return (Map) getRevenue(new Object[]{this, map}, 855506449, -855506448, System.identityHashCode(this));
    }

    public final boolean getMonetizationNetwork() {
        return ((Boolean) getRevenue(new Object[]{this}, 680071429, -680071429, System.identityHashCode(this))).booleanValue();
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFf1cSDK aFf1cSDK = (AFf1cSDK) objArr[0];
        copydefault = (copy + 115) % 128;
        boolean z = aFf1cSDK.component2;
        int i = copydefault + 75;
        copy = i % 128;
        if (i % 2 == 0) {
            return Boolean.valueOf(z);
        }
        throw null;
    }

    public final String getMediationNetwork() {
        copy = (copydefault + 65) % 128;
        String str = this.component1;
        copy = (copydefault + 119) % 128;
        return str;
    }

    public final Map<String, Object> getMediationNetwork(Map<String, Object> map) {
        AFc1iSDK aFc1iSDK = new AFc1iSDK(map, this.getMonetizationNetwork.getRevenue);
        int i = copy + 83;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return aFc1iSDK;
        }
        throw null;
    }

    private static boolean getMediationNetwork(Context context) {
        int i = copydefault + 83;
        copy = i % 128;
        if (i % 2 != 0) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
                return true;
            }
        } else if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return true;
        }
        copy = (copydefault + 87) % 128;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        int i2 = copy + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        AFa1uSDK.getMonetizationNetwork();
        if (i3 != 0) {
            return !AFa1uSDK.getRevenue(context);
        }
        AFa1uSDK.getRevenue(context);
        throw null;
    }
}
