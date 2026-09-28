package com.appsflyer.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1pSDK extends AFf1uSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 1760829264;
    private static int AFInAppEventType = 2059786070;
    private static byte[] AFKeystoreWrapper = {-102, 97, -125, 124, 108};
    private static short[] AFLogger = null;
    private static int d = 0;
    private static int registerClient = -1524191679;
    private static int unregisterClient = 1;
    private final AFc1pSDK copydefault;
    private final AFg1rSDK equals;
    private final String hashCode;
    private final AFc1gSDK toString;

    public AFf1pSDK(String str, AFc1bSDK aFc1bSDK) {
        super(new AFg1uSDK(), aFc1bSDK, str);
        this.copydefault = aFc1bSDK.getCurrencyIso4217Code();
        this.toString = aFc1bSDK.registerClient();
        this.hashCode = str;
        this.equals = aFc1bSDK.component4();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00be  */
    private static void a(int i, byte b, short s, int i2, int i3, Object[] objArr) {
        boolean z;
        char c;
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        StringBuilder sb = new StringBuilder();
        int i4 = i2 + ((int) (((long) AFInAppEventParameterName) ^ 6918351348135370604L));
        int i5 = i4 == -1 ? 1 : 0;
        if (i5 != 0) {
            $11 = ($10 + 45) % 128;
            byte[] bArr = AFKeystoreWrapper;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    $10 = ($11 + 35) % 128;
                    bArr2[i6] = (byte) (((long) bArr[i6]) ^ 6918351348135370604L);
                }
                bArr = bArr2;
            }
            i4 = bArr != null ? (byte) (((byte) (((long) AFKeystoreWrapper[((int) (((long) registerClient) ^ 6918351348135370604L)) + i]) ^ 6918351348135370604L)) + ((int) (((long) AFInAppEventParameterName) ^ 6918351348135370604L))) : (short) (((short) (((long) AFLogger[((int) (((long) registerClient) ^ 6918351348135370604L)) + i]) ^ 6918351348135370604L)) + ((int) (((long) AFInAppEventParameterName) ^ 6918351348135370604L)));
        }
        if (i4 > 0) {
            aFk1kSDK.getCurrencyIso4217Code = ((i + i4) - 2) + ((int) (((long) registerClient) ^ 6918351348135370604L)) + i5;
            char c2 = (char) (i3 + ((int) (((long) AFInAppEventType) ^ 6918351348135370604L)));
            aFk1kSDK.getRevenue = c2;
            sb.append(c2);
            aFk1kSDK.getMediationNetwork = aFk1kSDK.getRevenue;
            byte[] bArr3 = AFKeystoreWrapper;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                $11 = ($10 + 117) % 128;
                for (int i7 = 0; i7 < length2; i7++) {
                    bArr4[i7] = (byte) (((long) bArr3[i7]) ^ 6918351348135370604L);
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                int i8 = $10 + 25;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            aFk1kSDK.AFAdRevenueData = 1;
            while (aFk1kSDK.AFAdRevenueData < i4) {
                int i9 = aFk1kSDK.getCurrencyIso4217Code;
                if (z) {
                    byte[] bArr5 = AFKeystoreWrapper;
                    aFk1kSDK.getCurrencyIso4217Code = i9 - 1;
                    c = (char) (aFk1kSDK.getMediationNetwork + (((byte) (((byte) (((long) bArr5[i9]) ^ 6918351348135370604L)) + s)) ^ b));
                    aFk1kSDK.getRevenue = c;
                } else {
                    short[] sArr = AFLogger;
                    aFk1kSDK.getCurrencyIso4217Code = i9 - 1;
                    c = (char) (aFk1kSDK.getMediationNetwork + (((short) (((short) (((long) sArr[i9]) ^ 6918351348135370604L)) + s)) ^ b));
                    aFk1kSDK.getRevenue = c;
                }
                sb.append(c);
                aFk1kSDK.getMediationNetwork = aFk1kSDK.getRevenue;
                aFk1kSDK.AFAdRevenueData++;
            }
        }
        objArr[0] = sb.toString();
    }

    private void equals() {
        unregisterClient = (d + 41) % 128;
        ((AFf1uSDK) this).areAllFieldsValid.getCurrencyIso4217Code("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        unregisterClient = (d + 9) % 128;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFf1pSDK aFf1pSDK = (AFf1pSDK) objArr[0];
        PackageManager packageManager = (PackageManager) objArr[1];
        ApplicationInfo applicationInfo = aFf1pSDK.copydefault.n_().applicationInfo;
        if (applicationInfo == null) {
            int i = unregisterClient + HttpStatusCodesKt.HTTP_EARLY_HINTS;
            d = i % 128;
            if (i % 2 == 0) {
                return "";
            }
            throw null;
        }
        String string = packageManager.getApplicationLabel(applicationInfo).toString();
        int i2 = d + 73;
        unregisterClient = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    private String s_(PackageManager packageManager) {
        return (String) getMediationNetwork(new Object[]{this, packageManager}, -182789500, 182789500, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final void AFAdRevenueData(AFh1jSDK aFh1jSDK) {
        int i = unregisterClient + 29;
        d = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final void areAllFieldsValid(AFh1jSDK aFh1jSDK) {
        int i = unregisterClient + 23;
        d = i % 128;
        int i2 = i % 2;
        AFc1pSDK aFc1pSDK = this.copydefault;
        if (i2 != 0) {
            aFc1pSDK.component4();
            throw null;
        }
        String strComponent4 = aFc1pSDK.component4();
        if (strComponent4 != null) {
            aFh1jSDK.getMonetizationNetwork("advertiserId", strComponent4);
            unregisterClient = (d + 35) % 128;
        }
    }

    @Override // com.appsflyer.internal.AFf1uSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean copydefault() {
        return ((Boolean) getMediationNetwork(new Object[]{this}, 222839034, -222839033, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final void getCurrencyIso4217Code(AFh1jSDK aFh1jSDK) {
        d = (unregisterClient + 53) % 128;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1lSDK
    public final void getRevenue() {
        d = (unregisterClient + 55) % 128;
        super.getRevenue();
        ResponseNetwork responseNetwork = ((AFe1eSDK) this).component3;
        if (responseNetwork != null && responseNetwork.isSuccessful()) {
            equals();
        }
        unregisterClient = (d + 49) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0100  */
    /* JADX WARN: Code duplicated, block: B:28:0x010f  */
    /* JADX WARN: Code duplicated, block: B:31:0x016d  */
    /* JADX WARN: Code duplicated, block: B:33:0x017b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0182  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r11.getRevenue() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        r13.getMonetizationNetwork("app_version_code", java.lang.Integer.toString(r12.copydefault.n_().versionCode));
        r13.getMonetizationNetwork("app_version_name", r12.copydefault.n_().versionName);
        r13.getMonetizationNetwork(com.twilio.voice.PublisherMetadata.APP_NAME, (java.lang.String) getMediationNetwork(new java.lang.Object[]{r12, r2.getPackageManager()}, -182789500, 182789500, java.lang.System.identityHashCode(r12)));
        r13.getMonetizationNetwork("installDate", com.appsflyer.internal.AFa1uSDK.getMediationNetwork(new java.text.SimpleDateFormat("yyyy-MM-dd_HHmmssZ", java.util.Locale.US), r12.copydefault.n_().firstInstallTime));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008d, code lost:
    
        com.appsflyer.AFLogger.afErrorLog("Exception while collecting application version info.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0186, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
        defpackage.ib5.a("CustomerUserId not set, register is not sent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0190, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0191, code lost:
    
        defpackage.ib5.a("Context is not provided, can't send register request");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0196, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r0 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        r11 = r2;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r0 != null) goto L6;
     */
    @Override // com.appsflyer.internal.AFf1uSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getMediationNetwork(com.appsflyer.internal.AFh1jSDK r13) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1pSDK.getMediationNetwork(com.appsflyer.internal.AFh1jSDK):void");
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final void getRevenue(AFh1jSDK aFh1jSDK) {
        int i = unregisterClient + 7;
        d = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final void getMonetizationNetwork(AFh1jSDK aFh1jSDK) {
        unregisterClient = (d + HttpStatusCodesKt.HTTP_EARLY_HINTS) % 128;
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = (((~((~i) | i3)) | i4) * (-318)) + (i2 * (-317)) + (i * 319);
        int i6 = ~(i4 | i3);
        int i7 = ~i3;
        return (((~((i | i2) | i3)) | (~((i4 | i7) | i))) * 318) + (((i6 | (~((i7 | i) | i2))) * 318) + i5) != 1 ? getMonetizationNetwork(objArr) : getMediationNetwork(objArr);
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        int i = (d + 35) % 128;
        unregisterClient = i;
        int i2 = i + 69;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return Boolean.FALSE;
        }
        int i3 = 75 / 0;
        return Boolean.FALSE;
    }
}
