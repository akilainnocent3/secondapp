package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class cml0 {
    public static final c150 a = pcn.p("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(udl0 udl0Var, d150 d150Var, d150 d150Var2, tw90 tw90Var, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        aml0 aml0Var;
        char c;
        int iC = c(udl0Var);
        if (iC > 0 && (i2 != 1 || i != 1)) {
            cArr[iC] = '2';
        }
        if (g(udl0Var, d150Var2) == wdl0.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (udl0Var == udl0.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && tw90Var.d.equals(str)) {
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = '1';
                }
                return true;
            }
            if (d150Var.containsKey(udl0Var) && (aml0Var = (aml0) d150Var.get(udl0Var)) != null) {
                int iOrdinal = aml0Var.ordinal();
                wdl0 wdl0Var = wdl0.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (iOrdinal != 0) {
                    wdl0 wdl0Var2 = wdl0.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return g(udl0Var, d150Var2) == wdl0Var ? f(udl0Var, cArr, str3, z2) : e(udl0Var, cArr, str2, z);
                        }
                        if (iOrdinal == 3) {
                            return g(udl0Var, d150Var2) == wdl0Var2 ? e(udl0Var, cArr, str2, z) : f(udl0Var, cArr, str3, z2);
                        }
                        c = '0';
                    } else if (g(udl0Var, d150Var2) != wdl0Var2) {
                        return f(udl0Var, cArr, str3, z2);
                    }
                } else if (g(udl0Var, d150Var2) != wdl0Var) {
                    return e(udl0Var, cArr, str2, z);
                }
                c = '8';
            } else {
                c = '0';
            }
        }
        if (iC <= 0 || cArr[iC] == '2') {
            return false;
        }
        cArr[iC] = c;
        return false;
    }

    public static final int c(udl0 udl0Var) {
        if (udl0Var == udl0.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (udl0Var == udl0.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (udl0Var == udl0.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return udl0Var == udl0.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(udl0 udl0Var, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < udl0Var.zza()) ? "0" : String.valueOf(str.charAt(udl0Var.zza() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= udl0Var.zza()) {
            strValueOf = String.valueOf(str2.charAt(udl0Var.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean e(udl0 udl0Var, char[] cArr, String str, boolean z) {
        char c;
        int iC = c(udl0Var);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= udl0Var.zza()) {
                char cCharAt = str.charAt(udl0Var.zza() - 1);
                boolean z2 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c;
        }
        return false;
    }

    public static final boolean f(udl0 udl0Var, char[] cArr, String str, boolean z) {
        char c;
        int iC = c(udl0Var);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= udl0Var.zza()) {
                char cCharAt = str.charAt(udl0Var.zza() - 1);
                boolean z2 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c;
        }
        return false;
    }

    public static final wdl0 g(udl0 udl0Var, d150 d150Var) {
        Object obj = d150Var.get(udl0Var);
        if (obj == null) {
            obj = wdl0.e;
        }
        return (wdl0) obj;
    }
}
