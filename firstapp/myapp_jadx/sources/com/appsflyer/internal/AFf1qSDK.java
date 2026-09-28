package com.appsflyer.internal;

import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1qSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFAdRevenueData = 0;
    private static int areAllFieldsValid = 0;
    private static int component1 = 1;
    private static int getCurrencyIso4217Code;
    private static byte[] getMediationNetwork;
    private static short[] getMonetizationNetwork;
    private static int getRevenue;

    static {
        getRevenue();
        ViewConfiguration.getMaximumDrawingCacheSize();
        TypedValue.complexToFloat(0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        AndroidCharacter.getMirror('0');
        AndroidCharacter.getMirror('0');
        int i = areAllFieldsValid + 71;
        component1 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void a(int i, byte b, short s, int i2, int i3, Object[] objArr) {
        int i4;
        char c;
        int length;
        byte[] bArr;
        int i5;
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        StringBuilder sb = new StringBuilder();
        int i6 = i2 + ((int) (((long) AFAdRevenueData) ^ 6918351348135370604L));
        boolean z = i6 == -1;
        if (z) {
            byte[] bArr2 = getMediationNetwork;
            if (bArr2 != null) {
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    $10 = ($11 + 69) % 128;
                    bArr3[i7] = (byte) (((long) bArr2[i7]) ^ 6918351348135370604L);
                }
                bArr2 = bArr3;
            }
            if (bArr2 != null) {
                i6 = (byte) (((byte) (((long) getMediationNetwork[((int) (((long) getCurrencyIso4217Code) ^ 6918351348135370604L)) + i]) ^ 6918351348135370604L)) + ((int) (((long) AFAdRevenueData) ^ 6918351348135370604L)));
                $10 = ($11 + 91) % 128;
            } else {
                i6 = (short) (((short) (((long) getMonetizationNetwork[((int) (((long) getCurrencyIso4217Code) ^ 6918351348135370604L)) + i]) ^ 6918351348135370604L)) + ((int) (((long) AFAdRevenueData) ^ 6918351348135370604L)));
            }
        }
        if (i6 > 0) {
            int i8 = ((i + i6) - 2) + ((int) (((long) getCurrencyIso4217Code) ^ 6918351348135370604L));
            if (z) {
                i4 = 1;
            } else {
                $10 = ($11 + 107) % 128;
                i4 = 0;
            }
            aFk1kSDK.getCurrencyIso4217Code = i8 + i4;
            char c2 = (char) (i3 + ((int) (((long) getRevenue) ^ 6918351348135370604L)));
            aFk1kSDK.getRevenue = c2;
            sb.append(c2);
            aFk1kSDK.getMediationNetwork = aFk1kSDK.getRevenue;
            byte[] bArr4 = getMediationNetwork;
            if (bArr4 != null) {
                int i9 = $10 + 97;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i5 = 1;
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i5 = 0;
                }
                while (i5 < length) {
                    bArr[i5] = (byte) (((long) bArr4[i5]) ^ 6918351348135370604L);
                    i5++;
                }
                bArr4 = bArr;
            }
            boolean z2 = bArr4 != null;
            aFk1kSDK.AFAdRevenueData = 1;
            while (aFk1kSDK.AFAdRevenueData < i6) {
                int i10 = aFk1kSDK.getCurrencyIso4217Code;
                if (z2) {
                    byte[] bArr5 = getMediationNetwork;
                    aFk1kSDK.getCurrencyIso4217Code = i10 - 1;
                    c = (char) (aFk1kSDK.getMediationNetwork + (((byte) (((byte) (((long) bArr5[i10]) ^ 6918351348135370604L)) + s)) ^ b));
                    aFk1kSDK.getRevenue = c;
                } else {
                    short[] sArr = getMonetizationNetwork;
                    aFk1kSDK.getCurrencyIso4217Code = i10 - 1;
                    c = (char) (aFk1kSDK.getMediationNetwork + (((short) (((short) (((long) sArr[i10]) ^ 6918351348135370604L)) + s)) ^ b));
                    aFk1kSDK.getRevenue = c;
                }
                sb.append(c);
                aFk1kSDK.getMediationNetwork = aFk1kSDK.getRevenue;
                aFk1kSDK.AFAdRevenueData++;
                $10 = ($11 + 31) % 128;
            }
        }
        objArr[0] = sb.toString();
    }

    private static AFi1rSDK getCurrencyIso4217Code(AFi1wSDK aFi1wSDK, String str, String str2, String str3) {
        if (str == null) {
            return new AFi1rSDK(aFi1wSDK.getMediationNetwork == AFh1cSDK.DEFAULT, AFi1uSDK.NA);
        }
        String string = "";
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1522762699, (byte) (-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 107), (-82) - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 1963671201, objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (aFi1wSDK.getMediationNetwork == AFh1cSDK.CUSTOM) {
            string = new StringBuilder(str2).reverse().toString();
        } else {
            str3 = strIntern;
        }
        boolean zEquals = getMediationNetwork(new StringBuilder(str3).reverse().toString(), aFi1wSDK.getRevenue, "android", "v1", string).equals(str);
        return new AFi1rSDK(zEquals, zEquals ? AFi1uSDK.SUCCESS : AFi1uSDK.FAILURE);
    }

    private static String getMediationNetwork(String str, String str2, String str3, String str4, String str5) {
        component1 = (areAllFieldsValid + 17) % 128;
        String revenue = AFj1bSDK.getRevenue(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (revenue.length() >= 12) {
            return revenue.substring(0, 12);
        }
        component1 = (areAllFieldsValid + 109) % 128;
        return revenue;
    }

    public static void getRevenue() {
        getCurrencyIso4217Code = -842505383;
        AFAdRevenueData = 1760829245;
        getRevenue = 503259577;
        getMediationNetwork = new byte[]{-125, -23, -7, -7, -7, -3, -49, -26, -30, -7, -11, -8, -8, -4, -7, -5, -3, -1, -2, -10, -14, -28, -56, -23, -7, -2, -52, -27, -2, -7, -7, -8, -29, -12, -2, -5, -50, -24, -4, -12, -12, -4, -11, -31, -5, -1, -6, -4, -8, -6, -8, -2, -9, -2, -6, -30, -5, -7, -1, -3, -8, -12, -4, -8};
    }

    public final AFi1rSDK getRevenue(AFi1wSDK aFi1wSDK, String str, String str2, String str3) {
        int i = (areAllFieldsValid + 67) % 128;
        component1 = i;
        if (aFi1wSDK != null && str2 != null) {
            int i2 = i + 61;
            areAllFieldsValid = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (str3 != null) {
                return getCurrencyIso4217Code(aFi1wSDK, str, str2, str3);
            }
        }
        AFi1rSDK aFi1rSDK = new AFi1rSDK(false, AFi1uSDK.INTERNAL_ERROR);
        areAllFieldsValid = (component1 + 59) % 128;
        return aFi1rSDK;
    }
}
