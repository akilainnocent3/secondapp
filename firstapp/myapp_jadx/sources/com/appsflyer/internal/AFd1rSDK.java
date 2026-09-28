package com.appsflyer.internal;

import com.sportybet.plugin.realsports.data.CashOut;
import defpackage.ay0;
import defpackage.n8v;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1rSDK {
    public static final String AFAdRevenueData(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        bArrDigest.getClass();
        String strConcat = "";
        for (byte b : bArrDigest) {
            strConcat = strConcat.concat(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        return strConcat;
    }

    public static final Pair<Integer, Integer> getCurrencyIso4217Code(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        str.getClass();
        n8v n8vVarE = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").e(str);
        if (n8vVarE != null) {
            n8v.b bVar = n8vVarE.c;
            MatchGroup matchGroupC = bVar.c(1);
            Integer intOrNull = (matchGroupC == null || (str7 = matchGroupC.a) == null) ? null : StringsKt.toIntOrNull(str7);
            MatchGroup matchGroupC2 = bVar.c(2);
            Integer intOrNull2 = (matchGroupC2 == null || (str6 = matchGroupC2.a) == null) ? null : StringsKt.toIntOrNull(str6);
            MatchGroup matchGroupC3 = bVar.c(3);
            Integer intOrNull3 = (matchGroupC3 == null || (str5 = matchGroupC3.a) == null) ? null : StringsKt.toIntOrNull(str5);
            MatchGroup matchGroupC4 = bVar.c(4);
            Integer intOrNull4 = (matchGroupC4 == null || (str4 = matchGroupC4.a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup matchGroupC5 = bVar.c(5);
            Integer intOrNull5 = (matchGroupC5 == null || (str3 = matchGroupC5.a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup matchGroupC6 = bVar.c(6);
            Integer intOrNull6 = (matchGroupC6 == null || (str2 = matchGroupC6.a) == null) ? null : StringsKt.toIntOrNull(str2);
            Integer num = intOrNull6;
            if (getMonetizationNetwork(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
                intOrNull.getClass();
                int iIntValue = intOrNull.intValue() * CashOut.BIG_NUMBER;
                intOrNull2.getClass();
                int iIntValue2 = (intOrNull2.intValue() * 1000) + iIntValue;
                intOrNull3.getClass();
                Integer numValueOf = Integer.valueOf(intOrNull3.intValue() + iIntValue2);
                intOrNull4.getClass();
                int iIntValue3 = intOrNull4.intValue() * CashOut.BIG_NUMBER;
                intOrNull5.getClass();
                int iIntValue4 = (intOrNull5.intValue() * 1000) + iIntValue3;
                num.getClass();
                return new Pair<>(numValueOf, Integer.valueOf(num.intValue() + iIntValue4));
            }
        }
        return null;
    }

    public static final Pair<Integer, Integer> getMonetizationNetwork(String str) {
        String str2;
        String str3;
        String str4;
        str.getClass();
        n8v n8vVarE = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").e(str);
        if (n8vVarE != null) {
            n8v.b bVar = n8vVarE.c;
            MatchGroup matchGroupC = bVar.c(1);
            Integer intOrNull = (matchGroupC == null || (str4 = matchGroupC.a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup matchGroupC2 = bVar.c(3);
            Integer intOrNull2 = (matchGroupC2 == null || (str3 = matchGroupC2.a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup matchGroupC3 = bVar.c(4);
            Integer intOrNull3 = (matchGroupC3 == null || (str2 = matchGroupC3.a) == null) ? null : StringsKt.toIntOrNull(str2);
            if (intOrNull != null) {
                return new Pair<>(Integer.valueOf(intOrNull.intValue() * CashOut.BIG_NUMBER), Integer.valueOf(((intOrNull.intValue() + 1) * CashOut.BIG_NUMBER) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return new Pair<>(Integer.valueOf((intOrNull3.intValue() * 1000) + (intOrNull2.intValue() * CashOut.BIG_NUMBER)), Integer.valueOf((((intOrNull3.intValue() + 1) * 1000) + (intOrNull2.intValue() * CashOut.BIG_NUMBER)) - 1));
            }
        }
        return null;
    }

    public static final String getRevenue(String str) {
        str.getClass();
        return "[Exception Manager]: " + str;
    }

    private static boolean getMonetizationNetwork(Object... objArr) {
        objArr.getClass();
        return !ay0.s(null, objArr);
    }
}
