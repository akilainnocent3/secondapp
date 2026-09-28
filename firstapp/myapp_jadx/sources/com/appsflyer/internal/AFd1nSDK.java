package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.media.AudioTrack;
import android.os.Build;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1nSDK implements AFd1mSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] component2 = null;
    private static int copy = 1;
    private static char equals;
    private static final int getRevenue;
    private static int hashCode;
    private final AFc1bSDK component1;
    private List<String> getCurrencyIso4217Code = new ArrayList();
    private boolean AFAdRevenueData = true;
    private final Map<String, Object> getMediationNetwork = new HashMap();
    private SecureRandom component3 = new SecureRandom();
    private boolean areAllFieldsValid = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int getMonetizationNetwork = 0;
    private boolean component4 = false;

    static {
        component2();
        getRevenue = 98166;
        hashCode = (copy + 61) % 128;
    }

    public AFd1nSDK(AFc1bSDK aFc1bSDK) {
        this.component1 = aFc1bSDK;
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-755)) + (i * (-755));
        int i5 = ~((~i) | (~i2));
        int i6 = i | i2;
        int i7 = ((~(i6 | i3)) | i5) * (-756);
        int i8 = ((i6 | (~i3)) * 756) + i7 + (i5 * 1512) + i4;
        if (i8 == 1) {
            return getMediationNetwork(objArr);
        }
        if (i8 == 2) {
            return getRevenue(objArr);
        }
        if (i8 != 3) {
            AFd1nSDK aFd1nSDK = (AFd1nSDK) objArr[0];
            int i9 = hashCode + 43;
            copy = i9 % 128;
            int i10 = i9 % 2;
            boolean mediationNetwork = aFd1nSDK.component1.component2().getMediationNetwork("participantInProxy", false);
            copy = (hashCode + 45) % 128;
            return Boolean.valueOf(mediationNetwork);
        }
        AFd1nSDK aFd1nSDK2 = (AFd1nSDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i11 = copy + 45;
        hashCode = i11 % 128;
        if (i11 % 2 == 0) {
            aFd1nSDK2.getCurrencyIso4217Code("server_request", str, str2);
            return null;
        }
        String[] strArr = new String[0];
        strArr[0] = str2;
        aFd1nSDK2.getCurrencyIso4217Code("server_request", str, strArr);
        return null;
    }

    private boolean AFInAppEventParameterName() {
        return ((Boolean) AFAdRevenueData(new Object[]{this}, 59516456, -59516456, System.identityHashCode(this))).booleanValue();
    }

    private void AFKeystoreWrapper() {
        AFAdRevenueData(new Object[]{this}, -788691882, 788691884, System.identityHashCode(this));
    }

    private static void a(byte b, String str, int i, Object[] objArr) {
        int i2;
        int length;
        char[] cArr;
        int i3;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        AFk1jSDK aFk1jSDK = new AFk1jSDK();
        char[] cArr3 = component2;
        if (cArr3 != null) {
            int i4 = $10 + 53;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                $10 = ($11 + 31) % 128;
                cArr[i3] = (char) (((long) cArr3[i3]) ^ (-8266694153104071789L));
                i3++;
            }
            cArr3 = cArr;
        }
        char c = (char) ((-8266694153104071789L) ^ ((long) equals));
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            aFk1jSDK.getMonetizationNetwork = 0;
            while (true) {
                int i5 = aFk1jSDK.getMonetizationNetwork;
                if (i5 >= i2) {
                    break;
                }
                char c2 = cArr2[i5];
                aFk1jSDK.getCurrencyIso4217Code = c2;
                char c3 = cArr2[i5 + 1];
                aFk1jSDK.getMediationNetwork = c3;
                if (c2 == c3) {
                    $11 = ($10 + 115) % 128;
                    cArr4[i5] = (char) (c2 - b);
                    cArr4[i5 + 1] = (char) (c3 - b);
                } else {
                    int i6 = c2 / c;
                    aFk1jSDK.getRevenue = i6;
                    int i7 = c2 % c;
                    aFk1jSDK.areAllFieldsValid = i7;
                    int i8 = c3 / c;
                    aFk1jSDK.AFAdRevenueData = i8;
                    int i9 = c3 % c;
                    aFk1jSDK.component2 = i9;
                    if (i7 == i9) {
                        int i10 = ((i6 + c) - 1) % c;
                        aFk1jSDK.getRevenue = i10;
                        int i11 = ((i8 + c) - 1) % c;
                        aFk1jSDK.AFAdRevenueData = i11;
                        cArr4[i5] = cArr3[(i10 * c) + i7];
                        cArr4[i5 + 1] = cArr3[(i11 * c) + i9];
                    } else if (i6 == i8) {
                        int i12 = ((i7 + c) - 1) % c;
                        aFk1jSDK.areAllFieldsValid = i12;
                        int i13 = ((i9 + c) - 1) % c;
                        aFk1jSDK.component2 = i13;
                        cArr4[i5] = cArr3[(i6 * c) + i12];
                        cArr4[i5 + 1] = cArr3[(i8 * c) + i13];
                    } else {
                        cArr4[i5] = cArr3[(i6 * c) + i9];
                        cArr4[i5 + 1] = cArr3[(i8 * c) + i7];
                    }
                }
                aFk1jSDK.getMonetizationNetwork = i5 + 2;
            }
        }
        $11 = ($10 + 35) % 128;
        for (int i14 = 0; i14 < i; i14++) {
            cArr4[i14] = (char) (cArr4[i14] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private float component1() {
        int i = copy + 29;
        hashCode = i % 128;
        int i2 = i % 2;
        SecureRandom secureRandom = this.component3;
        if (i2 != 0) {
            secureRandom.nextFloat();
            throw null;
        }
        float fNextFloat = secureRandom.nextFloat();
        int i3 = copy + 123;
        hashCode = i3 % 128;
        if (i3 % 2 == 0) {
            return fNextFloat;
        }
        throw null;
    }

    public static void component2() {
        component2 = new char[]{58256, 58263, 54893, 58257, 54887, 54907, 54888, 58258, 54891};
        equals = (char) 58256;
    }

    private synchronized void component3() {
        int i = hashCode;
        copy = (i + 109) % 128;
        if (this.component4) {
            copy = (i + HttpStatusCodesKt.HTTP_EARLY_HINTS) % 128;
            return;
        }
        this.component4 = true;
        try {
            getCurrencyIso4217Code("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while starting remote debugger", th, true, true, true);
        }
    }

    private static String component4() {
        int i = (copy + 23) % 128;
        hashCode = i;
        int i2 = i + HttpStatusCodesKt.HTTP_EARLY_HINTS;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 65 / 0;
        }
        return "6.17.3";
    }

    private boolean copy() {
        if (!this.areAllFieldsValid) {
            return false;
        }
        int i = copy;
        hashCode = (i + 91) % 128;
        if (this.AFAdRevenueData) {
            return true;
        }
        int i2 = i + 111;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.component4;
        if (i3 == 0) {
            return z;
        }
        throw null;
    }

    private synchronized void copydefault() {
        this.getCurrencyIso4217Code = new ArrayList();
        this.getMonetizationNetwork = 0;
        hashCode = (copy + 43) % 128;
    }

    private synchronized Map<String, Object> equals() {
        int i = copy + 47;
        hashCode = i % 128;
        int i2 = i % 2;
        Map<String, Object> map = this.getMediationNetwork;
        if (i2 != 0) {
            map.put("data", this.getCurrencyIso4217Code);
            copydefault();
            throw null;
        }
        map.put("data", this.getCurrencyIso4217Code);
        copydefault();
        return this.getMediationNetwork;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r1 >= 98304) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if (r1 >= 98304) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        r0 = java.lang.System.currentTimeMillis();
        r7 = android.text.TextUtils.join(", ", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if (r5 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        r2 = new java.lang.StringBuilder();
        r2.append(r0);
        r2.append(" ");
        r2.append(java.lang.Thread.currentThread().getId());
        r2.append(" _/AppsFlyer_6.17.3 [");
        r2.append(r5);
        r2.append("] ");
        r2.append(r6);
        r2.append(" ");
        r2.append(r7);
        r5 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        r5 = new java.lang.StringBuilder();
        r5.append(r0);
        r5.append(" ");
        r5.append(java.lang.Thread.currentThread().getId());
        r5.append(" ");
        r5.append(r6);
        r5.append("/AppsFlyer_6.17.3 ");
        r5.append(r7);
        r5 = r5.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        r6 = r4.getMonetizationNetwork + (r5.length() << 1);
        r7 = com.appsflyer.internal.AFd1nSDK.getRevenue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        if (r6 <= r7) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
    
        r5 = r5.substring(0, (r7 - r4.getMonetizationNetwork) / 2);
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ad, code lost:
    
        r4.getCurrencyIso4217Code.add(r5);
        r4.getMonetizationNetwork += r5.length() << 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        if (r3 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00be, code lost:
    
        r5 = com.appsflyer.internal.AFd1nSDK.hashCode + okhttp3.internal.http.HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS;
        com.appsflyer.internal.AFd1nSDK.copy = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c8, code lost:
    
        r6 = r4.getCurrencyIso4217Code;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ca, code lost:
    
        if (r5 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
    
        r6.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
        r4.getMonetizationNetwork *= 10496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d8, code lost:
    
        r6.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
        r4.getMonetizationNetwork += 138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e3, code lost:
    
        com.appsflyer.internal.AFd1nSDK.copy = (com.appsflyer.internal.AFd1nSDK.hashCode + 11) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ec, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ee, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void getCurrencyIso4217Code(java.lang.String r5, java.lang.String r6, java.lang.String... r7) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1nSDK.getCurrencyIso4217Code(java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
    
        if (r6 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getMediationNetwork(java.lang.Object[] r6) {
        /*
            r0 = 0
            r1 = r6[r0]
            com.appsflyer.internal.AFd1nSDK r1 = (com.appsflyer.internal.AFd1nSDK) r1
            r2 = 1
            r2 = r6[r2]
            java.lang.String r2 = (java.lang.String) r2
            r3 = 2
            r6 = r6[r3]
            android.content.pm.PackageManager r6 = (android.content.pm.PackageManager) r6
            int r6 = com.appsflyer.internal.AFd1nSDK.copy
            int r6 = r6 + 61
            int r4 = r6 % 128
            com.appsflyer.internal.AFd1nSDK.hashCode = r4
            int r6 = r6 % r3
            r4 = 0
            if (r6 == 0) goto L3b
            java.util.Map r6 = r1.getMonetizationNetwork(r2)     // Catch: java.lang.Throwable -> L39
            com.appsflyer.internal.AFc1bSDK r2 = r1.component1     // Catch: java.lang.Throwable -> L39
            com.appsflyer.internal.AFf1cSDK r2 = r2.AFKeystoreWrapper()     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = r2.getMediationNetwork()     // Catch: java.lang.Throwable -> L39
            com.appsflyer.internal.AFc1bSDK r5 = r1.component1     // Catch: java.lang.Throwable -> L39
            com.appsflyer.internal.AFd1lSDK r5 = r5.getRevenue()     // Catch: java.lang.Throwable -> L39
            com.appsflyer.internal.AFd1oSDK r6 = r5.getMediationNetwork(r6, r2)     // Catch: java.lang.Throwable -> L39
            r2 = 37
            int r2 = r2 / r0
            if (r6 != 0) goto L62
            goto L55
        L39:
            r6 = move-exception
            goto L7d
        L3b:
            java.util.Map r6 = r1.getMonetizationNetwork(r2)     // Catch: java.lang.Throwable -> L39
            com.appsflyer.internal.AFc1bSDK r0 = r1.component1     // Catch: java.lang.Throwable -> L39
            com.appsflyer.internal.AFf1cSDK r0 = r0.AFKeystoreWrapper()     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = r0.getMediationNetwork()     // Catch: java.lang.Throwable -> L39
            com.appsflyer.internal.AFc1bSDK r2 = r1.component1     // Catch: java.lang.Throwable -> L39
            com.appsflyer.internal.AFd1lSDK r2 = r2.getRevenue()     // Catch: java.lang.Throwable -> L39
            com.appsflyer.internal.AFd1oSDK r6 = r2.getMediationNetwork(r6, r0)     // Catch: java.lang.Throwable -> L39
            if (r6 != 0) goto L62
        L55:
            java.lang.String r6 = "could not send null proxy data"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = "request was null"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L39
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r6, r0)     // Catch: java.lang.Throwable -> L39
            return r4
        L62:
            com.appsflyer.internal.AFc1bSDK r0 = r1.component1     // Catch: java.lang.Throwable -> L39
            java.util.concurrent.ExecutorService r0 = r0.getMediationNetwork()     // Catch: java.lang.Throwable -> L39
            com.appsflyer.internal.q r1 = new com.appsflyer.internal.q     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            r0.execute(r1)     // Catch: java.lang.Throwable -> L39
            int r6 = com.appsflyer.internal.AFd1nSDK.hashCode
            int r6 = r6 + 75
            int r0 = r6 % 128
            com.appsflyer.internal.AFd1nSDK.copy = r0
            int r6 = r6 % r3
            if (r6 == 0) goto L7c
            return r4
        L7c:
            throw r4
        L7d:
            java.lang.String r0 = "could not send proxy data"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1nSDK.getMediationNetwork(java.lang.Object[]):java.lang.Object");
    }

    private synchronized void getMonetizationNetwork(String str, AFf1cSDK aFf1cSDK, AFc1eSDK aFc1eSDK) {
        try {
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            String string = appsFlyerProperties.getString("remote_debug_static_data");
            this.getMediationNetwork.clear();
            if (string != null) {
                try {
                    this.getMediationNetwork.putAll(AFg1hSDK.getMonetizationNetwork(new JSONObject(string)));
                    copy = (hashCode + 49) % 128;
                } catch (Throwable unused) {
                }
            } else {
                getRevenue(this.component1.getCurrencyIso4217Code().component4(), aFf1cSDK.getCurrencyIso4217Code(), aFc1eSDK.AFAdRevenueData);
                StringBuilder sb = new StringBuilder("6.17.3.");
                sb.append(AFa1uSDK.getRevenue);
                getRevenue(sb.toString(), this.component1.AFKeystoreWrapper().getMediationNetwork(), appsFlyerProperties.getString("KSAppsFlyerId"), AFb1jSDK.getRevenue(this.component1.getCurrencyIso4217Code().getMonetizationNetwork));
                try {
                    int i = this.component1.getCurrencyIso4217Code().n_().versionCode;
                    getCurrencyIso4217Code(str, String.valueOf(i), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                } catch (Throwable unused2) {
                }
                appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.getMediationNetwork).toString());
            }
            this.getMediationNetwork.put("launch_counter", String.valueOf(this.component1.getCurrencyIso4217Code().getMonetizationNetwork.getMediationNetwork("appsFlyerCount", 0)));
            copy = (hashCode + 17) % 128;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void getRevenue(String str, String str2, String str3) {
        try {
            Map<String, Object> map = this.getMediationNetwork;
            Object[] objArr = new Object[1];
            a((byte) (114 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), "\u0002\b\u0007\u0003㙰", 6 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.getMediationNetwork.put("model", Build.MODEL);
            this.getMediationNetwork.put("platform", jbkEboCkTqmGf.orirkAZErY);
            this.getMediationNetwork.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                try {
                    hashCode = (copy + 43) % 128;
                    if (str.length() > 0) {
                        hashCode = (copy + 45) % 128;
                        this.getMediationNetwork.put("advertiserId", str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (str2 != null && str2.length() > 0) {
                this.getMediationNetwork.put("imei", str2);
            }
            if (str3 != null) {
                copy = (hashCode + 49) % 128;
                if (str3.length() > 0) {
                    this.getMediationNetwork.put("android_id", str3);
                    copy = (hashCode + 63) % 128;
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final boolean areAllFieldsValid() {
        int i = (copy + 17) % 128;
        hashCode = i;
        boolean z = this.component4;
        copy = (i + 47) % 128;
        return z;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final void q_(String str, PackageManager packageManager) {
        AFAdRevenueData(new Object[]{this, str, packageManager}, 389372347, -389372346, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final synchronized void AFAdRevenueData() {
        try {
            if (!this.component4 && !this.AFAdRevenueData) {
                int i = copy + 93;
                hashCode = i % 128;
                if (i % 2 == 0) {
                    return;
                } else {
                    throw null;
                }
            }
            this.component4 = false;
            this.AFAdRevenueData = false;
            try {
                getCurrencyIso4217Code("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
                copy = (hashCode + 41) % 128;
                return;
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while stopping remote debugger", th, true, true, true);
                return;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final synchronized void getMediationNetwork() {
        try {
            int i = copy + 13;
            hashCode = i % 128;
            if (i % 2 != 0) {
                this.AFAdRevenueData = false;
            } else {
                this.AFAdRevenueData = false;
            }
            getRevenue();
            copydefault();
            int i2 = copy + 81;
            hashCode = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 88 / 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        r2 = 1;
        r0 = new java.lang.String[r4.length + 1];
        r0[0] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r2 >= r4.length) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        r0[r2] = r4[r2].toString();
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        r3 = com.appsflyer.internal.AFd1nSDK.copy + 17;
        com.appsflyer.internal.AFd1nSDK.hashCode = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if ((r3 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r3 = 26 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        return new java.lang.String[]{r3};
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String[] getMediationNetwork(java.lang.String r3, java.lang.StackTraceElement[] r4) {
        /*
            int r0 = com.appsflyer.internal.AFd1nSDK.copy
            int r0 = r0 + 49
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1nSDK.hashCode = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L13
            r0 = 54
            int r0 = r0 / r1
            if (r4 != 0) goto L1a
            goto L15
        L13:
            if (r4 != 0) goto L1a
        L15:
            java.lang.String[] r3 = new java.lang.String[]{r3}
            return r3
        L1a:
            int r0 = r4.length
            r2 = 1
            int r0 = r0 + r2
            java.lang.String[] r0 = new java.lang.String[r0]
            r0[r1] = r3
        L21:
            int r3 = r4.length
            if (r2 >= r3) goto L2f
            r3 = r4[r2]
            java.lang.String r3 = r3.toString()
            r0[r2] = r3
            int r2 = r2 + 1
            goto L21
        L2f:
            int r3 = com.appsflyer.internal.AFd1nSDK.copy
            int r3 = r3 + 17
            int r4 = r3 % 128
            com.appsflyer.internal.AFd1nSDK.hashCode = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L3e
            r3 = 26
            int r3 = r3 / r1
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1nSDK.getMediationNetwork(java.lang.String, java.lang.StackTraceElement[]):java.lang.String[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if ((r3 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        r3 = r4.equals(r3.component1.getCurrencyIso4217Code().n_().versionName);
        com.appsflyer.internal.AFd1nSDK.copy = (com.appsflyer.internal.AFd1nSDK.hashCode + 123) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (com.appsflyer.internal.AFk1xSDK.getMonetizationNetwork(r4) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (com.appsflyer.internal.AFk1xSDK.getMonetizationNetwork(r4) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r3 = com.appsflyer.internal.AFd1nSDK.copy + 29;
        com.appsflyer.internal.AFd1nSDK.hashCode = r3 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean getMediationNetwork(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFd1nSDK.hashCode
            int r0 = r0 + 97
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1nSDK.copy = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L17
            boolean r0 = com.appsflyer.internal.AFk1xSDK.getMonetizationNetwork(r4)
            r2 = 55
            int r2 = r2 / r1
            if (r0 == 0) goto L2c
            goto L1d
        L17:
            boolean r0 = com.appsflyer.internal.AFk1xSDK.getMonetizationNetwork(r4)
            if (r0 == 0) goto L2c
        L1d:
            int r3 = com.appsflyer.internal.AFd1nSDK.copy
            int r3 = r3 + 29
            int r4 = r3 % 128
            com.appsflyer.internal.AFd1nSDK.hashCode = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L2a
            return r1
        L2a:
            r3 = 1
            return r3
        L2c:
            com.appsflyer.internal.AFc1bSDK r3 = r3.component1
            com.appsflyer.internal.AFc1pSDK r3 = r3.getCurrencyIso4217Code()
            android.content.pm.PackageInfo r3 = r3.n_()
            java.lang.String r3 = r3.versionName
            boolean r3 = r4.equals(r3)
            int r4 = com.appsflyer.internal.AFd1nSDK.hashCode
            int r4 = r4 + 123
            int r4 = r4 % 128
            com.appsflyer.internal.AFd1nSDK.copy = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1nSDK.getMediationNetwork(java.lang.String):boolean");
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final void getRevenue(String str, String str2) {
        int i = copy + 3;
        hashCode = i % 128;
        if (i % 2 != 0) {
            String[] strArr = new String[0];
            strArr[0] = str2;
            getCurrencyIso4217Code(null, str, strArr);
        } else {
            getCurrencyIso4217Code(null, str, str2);
        }
        int i2 = hashCode + 61;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 81 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final synchronized void getRevenue() {
        hashCode = (copy + 53) % 128;
        this.getMediationNetwork.clear();
        this.getCurrencyIso4217Code.clear();
        this.getMonetizationNetwork = 0;
        hashCode = (copy + 125) % 128;
    }

    private synchronized void getRevenue(String str, String str2, String str3, String str4) {
        try {
            hashCode = (copy + 11) % 128;
            try {
                this.getMediationNetwork.put(EventKeys.SDK_VERSION_KEY, str);
                if (str2 != null) {
                    copy = (hashCode + 109) % 128;
                    if (str2.length() > 0) {
                        int i = copy + HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS;
                        hashCode = i % 128;
                        int i2 = i % 2;
                        Map<String, Object> map = this.getMediationNetwork;
                        if (i2 != 0) {
                            map.put("devkey", str2);
                            throw null;
                        }
                        map.put("devkey", str2);
                    }
                }
                if (str3 != null && str3.length() > 0) {
                    this.getMediationNetwork.put("originalAppsFlyerId", str3);
                }
                if (str4 != null && str4.length() > 0) {
                    this.getMediationNetwork.put("uid", str4);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean getRevenue(AFi1ySDK aFi1ySDK, AFi1ySDK aFi1ySDK2) {
        boolean zAFInAppEventParameterName;
        if (aFi1ySDK.equals(aFi1ySDK2)) {
            int i = hashCode + 51;
            copy = i % 128;
            if (i % 2 == 0) {
                AFInAppEventParameterName();
                throw null;
            }
            zAFInAppEventParameterName = AFInAppEventParameterName();
        } else {
            boolean currencyIso4217Code = getCurrencyIso4217Code(aFi1ySDK.AFAdRevenueData);
            getMonetizationNetwork(currencyIso4217Code);
            zAFInAppEventParameterName = currencyIso4217Code;
        }
        int i2 = copy + 61;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 53 / 0;
        }
        return zAFInAppEventParameterName;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1nSDK aFd1nSDK = (AFd1nSDK) objArr[0];
        int i = hashCode + 33;
        copy = i % 128;
        if (i % 2 == 0) {
            aFd1nSDK.component1.component2().getCurrencyIso4217Code("participantInProxy");
            int i2 = 63 / 0;
            return null;
        }
        aFd1nSDK.component1.component2().getCurrencyIso4217Code("participantInProxy");
        return null;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final void getMonetizationNetwork(String str, int i, String str2) {
        hashCode = (copy + 111) % 128;
        getCurrencyIso4217Code("server_response", str, String.valueOf(i), str2);
        int i2 = hashCode + 5;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final void getMonetizationNetwork() {
        int i = (copy + 83) % 128;
        hashCode = i;
        this.areAllFieldsValid = false;
        copy = (i + 99) % 128;
    }

    private Map<String, Object> getMonetizationNetwork(String str) {
        hashCode = (copy + 39) % 128;
        getMonetizationNetwork(str, this.component1.AFKeystoreWrapper(), this.component1.afInfoLog());
        Map<String, Object> mapEquals = equals();
        int i = hashCode + 45;
        copy = i % 128;
        if (i % 2 == 0) {
            int i2 = 30 / 0;
        }
        return mapEquals;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final void getMonetizationNetwork(Throwable th) {
        String message;
        hashCode = (copy + 21) % 128;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        if (cause == null) {
            message = th.getMessage();
        } else {
            message = cause.getMessage();
            copy = (hashCode + 61) % 128;
        }
        getCurrencyIso4217Code(AnalyticsParam.EVENT_PARAM_EXCEPTION, simpleName, getMediationNetwork(message, cause == null ? th.getStackTrace() : cause.getStackTrace()));
    }

    private static AFi1ySDK getMonetizationNetwork(AFi1wSDK aFi1wSDK) {
        AFi1zSDK aFi1zSDK;
        int i = hashCode + 65;
        int i2 = i % 128;
        copy = i2;
        if (i % 2 == 0) {
            throw null;
        }
        if (aFi1wSDK != null && (aFi1zSDK = aFi1wSDK.getMonetizationNetwork) != null) {
            return aFi1zSDK.getMediationNetwork;
        }
        hashCode = (i2 + 85) % 128;
        return null;
    }

    private void getMonetizationNetwork(boolean z) {
        copy = (hashCode + 47) % 128;
        this.component1.component2().getCurrencyIso4217Code("participantInProxy", z);
        int i = copy + 39;
        hashCode = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final void getMonetizationNetwork(String str, String str2) {
        AFAdRevenueData(new Object[]{this, str, str2}, 115232387, -115232384, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final void getCurrencyIso4217Code(String str, String... strArr) {
        int i = hashCode + 105;
        copy = i % 128;
        if (i % 2 == 0) {
            getCurrencyIso4217Code("public_api_call", str, strArr);
            int i2 = 57 / 0;
        } else {
            getCurrencyIso4217Code("public_api_call", str, strArr);
        }
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String str3, String str4) {
        try {
            copy = (hashCode + 35) % 128;
            if (str != null) {
                try {
                    if (str.length() > 0) {
                        copy = (hashCode + 7) % 128;
                        this.getMediationNetwork.put(PublisherMetadata.APP_ID, str);
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
            if (str2 != null && str2.length() > 0) {
                this.getMediationNetwork.put("app_version", str2);
                copy = (hashCode + 77) % 128;
            }
            if (str3 != null) {
                hashCode = (copy + 63) % 128;
                if (str3.length() > 0) {
                    copy = (hashCode + 35) % 128;
                    this.getMediationNetwork.put(AppsFlyerProperties.CHANNEL, str3);
                }
            }
            if (str4 != null && str4.length() > 0) {
                this.getMediationNetwork.put("preInstall", str4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
    
        getMediationNetwork();
        AFAdRevenueData();
        com.appsflyer.internal.AFd1nSDK.copy = (com.appsflyer.internal.AFd1nSDK.hashCode + 81) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
    
        if (r0 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0051, code lost:
    
        if (r0 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        component3();
     */
    @Override // com.appsflyer.internal.AFd1mSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getCurrencyIso4217Code() {
        /*
            r2 = this;
            int r0 = com.appsflyer.internal.AFd1nSDK.hashCode
            int r0 = r0 + 45
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1nSDK.copy = r1
            int r0 = r0 % 2
            com.appsflyer.internal.AFc1bSDK r1 = r2.component1
            if (r0 != 0) goto L33
            com.appsflyer.internal.AFf1lSDK r0 = r1.component1()
            com.appsflyer.internal.AFf1iSDK r0 = r0.AFAdRevenueData
            com.appsflyer.internal.AFi1wSDK r0 = r0.AFAdRevenueData
            com.appsflyer.internal.AFi1ySDK r0 = getMonetizationNetwork(r0)
            com.appsflyer.internal.AFc1bSDK r1 = r2.component1
            com.appsflyer.internal.AFf1lSDK r1 = r1.component1()
            com.appsflyer.internal.AFf1iSDK r1 = r1.AFAdRevenueData
            com.appsflyer.internal.AFi1wSDK r1 = r1.getMediationNetwork
            com.appsflyer.internal.AFi1ySDK r1 = getMonetizationNetwork(r1)
            boolean r0 = r2.getCurrencyIso4217Code(r0, r1)
            r1 = 94
            int r1 = r1 / 0
            if (r0 == 0) goto L57
            goto L53
        L33:
            com.appsflyer.internal.AFf1lSDK r0 = r1.component1()
            com.appsflyer.internal.AFf1iSDK r0 = r0.AFAdRevenueData
            com.appsflyer.internal.AFi1wSDK r0 = r0.AFAdRevenueData
            com.appsflyer.internal.AFi1ySDK r0 = getMonetizationNetwork(r0)
            com.appsflyer.internal.AFc1bSDK r1 = r2.component1
            com.appsflyer.internal.AFf1lSDK r1 = r1.component1()
            com.appsflyer.internal.AFf1iSDK r1 = r1.AFAdRevenueData
            com.appsflyer.internal.AFi1wSDK r1 = r1.getMediationNetwork
            com.appsflyer.internal.AFi1ySDK r1 = getMonetizationNetwork(r1)
            boolean r0 = r2.getCurrencyIso4217Code(r0, r1)
            if (r0 == 0) goto L57
        L53:
            r2.component3()
            return r0
        L57:
            r2.getMediationNetwork()
            r2.AFAdRevenueData()
            int r2 = com.appsflyer.internal.AFd1nSDK.hashCode
            int r2 = r2 + 81
            int r2 = r2 % 128
            com.appsflyer.internal.AFd1nSDK.copy = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1nSDK.getCurrencyIso4217Code():boolean");
    }

    private synchronized boolean getCurrencyIso4217Code(AFi1ySDK aFi1ySDK, AFi1ySDK aFi1ySDK2) {
        boolean z = true;
        try {
            if (aFi1ySDK == null) {
                int i = hashCode + 9;
                copy = i % 128;
                if (i % 2 == 0) {
                    AFAdRevenueData(new Object[]{this}, -788691882, 788691884, System.identityHashCode(this));
                } else {
                    AFAdRevenueData(new Object[]{this}, -788691882, 788691884, System.identityHashCode(this));
                    z = false;
                }
                copy = (hashCode + 45) % 128;
                return z;
            }
            if (!aFi1ySDK.getMonetizationNetwork()) {
                int i2 = hashCode + 99;
                copy = i2 % 128;
                return i2 % 2 == 0 ? false : false;
            }
            if (this.component1.getCurrencyIso4217Code().getMonetizationNetwork.getMediationNetwork("appsFlyerCount", 0) > aFi1ySDK.getMonetizationNetwork) {
                copy = (hashCode + 47) % 128;
                return false;
            }
            copy = (hashCode + 25) % 128;
            if (!getRevenue(aFi1ySDK, aFi1ySDK2)) {
                return false;
            }
            if (getMediationNetwork(aFi1ySDK.getMediationNetwork)) {
                return getCurrencyIso4217Code(aFi1ySDK.getRevenue);
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static boolean getCurrencyIso4217Code(String str) {
        hashCode = (copy + 45) % 128;
        if (AFk1xSDK.getMonetizationNetwork(str)) {
            copy = (hashCode + 43) % 128;
            return true;
        }
        new AFd1sSDK();
        return AFd1sSDK.getCurrencyIso4217Code(component4(), str);
    }

    private boolean getCurrencyIso4217Code(float f) {
        int i = hashCode;
        copy = (i + 39) % 128;
        double d = f;
        if (d >= 1.0d) {
            return true;
        }
        if (d <= 0.0d) {
            int i2 = i + 121;
            copy = i2 % 128;
            return i2 % 2 == 0;
        }
        if (component1() > f) {
            return false;
        }
        int i3 = hashCode + 123;
        copy = i3 % 128;
        return i3 % 2 != 0;
    }
}
