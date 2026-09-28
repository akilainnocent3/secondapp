package com.appsflyer.internal;

import com.sportybet.plugin.realsports.data.CashOut;
import defpackage.n8v;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1zSDK {
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

    public static final int getMediationNetwork(String str) {
        String str2;
        Integer intOrNull;
        String str3;
        Integer intOrNull2;
        String str4;
        Integer intOrNull3;
        str.getClass();
        n8v n8vVarE = new Regex("(\\d+).(\\d+).(\\d+).*").e(str);
        if (n8vVarE == null) {
            return -1;
        }
        n8v.b bVar = n8vVarE.c;
        MatchGroup matchGroupC = bVar.c(1);
        int iIntValue = 0;
        int iIntValue2 = ((matchGroupC == null || (str4 = matchGroupC.a) == null || (intOrNull3 = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull3.intValue()) * CashOut.BIG_NUMBER;
        MatchGroup matchGroupC2 = bVar.c(2);
        int iIntValue3 = (((matchGroupC2 == null || (str3 = matchGroupC2.a) == null || (intOrNull2 = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull2.intValue()) * 1000) + iIntValue2;
        MatchGroup matchGroupC3 = bVar.c(3);
        if (matchGroupC3 != null && (str2 = matchGroupC3.a) != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
            iIntValue = intOrNull.intValue();
        }
        return iIntValue3 + iIntValue;
    }
}
