package com.inmobi.media;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Oc {
    public static final String a(String str, Mc nativeBeaconModel, Map extraMacros) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        kotlin.jvm.internal.m0.p(nativeBeaconModel, "nativeBeaconModel");
        kotlin.jvm.internal.m0.p(extraMacros, "extraMacros");
        String strZ2 = cv.k0.z2(cv.k0.z2(cv.k0.z2(str, "$TS", String.valueOf(System.currentTimeMillis()), false, 4, null), "$LTS", String.valueOf(nativeBeaconModel.f55138a.f56125g), false, 4, null), "$STS", String.valueOf(nativeBeaconModel.f55138a.f56122d), false, 4, null);
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb2 = new StringBuilder();
        int iNextInt = 0;
        while (iNextInt == 0) {
            iNextInt = (secureRandom.nextInt() & Integer.MAX_VALUE) % 10;
        }
        sb2.append(iNextInt);
        for (int i10 = 1; i10 < 8; i10++) {
            sb2.append((secureRandom.nextInt() & Integer.MAX_VALUE) % 10);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        String strZ3 = cv.k0.z2(strZ2, "[CACHEBUSTING]", string, false, 4, null);
        String str2 = nativeBeaconModel.f55139b;
        if (str2 != null) {
            strZ3 = cv.k0.z2(strZ3, "[UNIVERSALADID]", str2, false, 4, null);
        }
        String strZ4 = strZ3;
        String str3 = nativeBeaconModel.f55140c;
        if (str3 != null) {
            strZ4 = cv.k0.z2(strZ4, "[ADSERVINGID]", str3, false, 4, null);
        }
        String strZ5 = strZ4;
        String str4 = nativeBeaconModel.f55141d;
        if (str4 != null) {
            strZ5 = cv.k0.z2(strZ5, "[ASSETURI]", str4, false, 4, null);
        }
        int i11 = nativeBeaconModel.f55142e;
        kotlin.jvm.internal.u1 u1Var = kotlin.jvm.internal.u1.f102789a;
        Locale locale = Locale.US;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j10 = i11;
        String str5 = String.format(locale, "%02d:%02d:%02d.%03d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j10)), Long.valueOf(timeUnit.toMinutes(j10) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(j10))), Long.valueOf(timeUnit.toSeconds(j10) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(j10))), Long.valueOf(j10 - (timeUnit.toSeconds(j10) * ((long) 1000)))}, 4));
        kotlin.jvm.internal.m0.o(str5, "format(...)");
        String strZ6 = cv.k0.z2(strZ5, "[CONTENTPLAYHEAD]", str5, false, 4, null);
        String strZ7 = strZ6;
        for (Map.Entry entry : extraMacros.entrySet()) {
            strZ7 = cv.k0.z2(strZ7, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
        }
        return strZ7;
    }
}
