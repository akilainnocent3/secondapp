package defpackage;

import com.sporty.android.book.domain.entity.BetTypeFlexiBetConfig;
import com.sporty.android.core.model.config.Version;
import com.sportybet.plugin.realsports.betslip.Selection;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes4.dex */
public final class lvh {
    public static final lvh a = new lvh();

    public static final BigDecimal a(boolean z, ArrayList arrayList, BetTypeFlexiBetConfig betTypeFlexiBetConfig, BigDecimal bigDecimal, String str) {
        boolean zBooleanValue;
        Object bVar;
        str.getClass();
        BigDecimal bigDecimalMin = null;
        if (betTypeFlexiBetConfig == null) {
            return null;
        }
        if (z) {
            arrayList.size();
            return betTypeFlexiBetConfig.getOddsKey();
        }
        if (betTypeFlexiBetConfig.getFlexiWeightedRtpEnabled()) {
            String flexiWeightedRtpSupportedMinVersion = betTypeFlexiBetConfig.getFlexiWeightedRtpSupportedMinVersion();
            a.getClass();
            int i = 0;
            if (flexiWeightedRtpSupportedMinVersion == null || StringsKt.U(flexiWeightedRtpSupportedMinVersion)) {
                zBooleanValue = false;
            } else {
                try {
                    zi50.a aVar = zi50.b;
                    bVar = Boolean.valueOf(new Version(str).compareTo(new Version(flexiWeightedRtpSupportedMinVersion)) < 0);
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
                Object obj = Boolean.FALSE;
                if (bVar instanceof zi50.b) {
                    bVar = obj;
                }
                zBooleanValue = ((Boolean) bVar).booleanValue();
            }
            if (!zBooleanValue) {
                BigDecimal flexiAverageWeightedRtpMultiplier = betTypeFlexiBetConfig.getFlexiAverageWeightedRtpMultiplier();
                BigDecimal flexiAverageWeightedMinEffectiveRtp = betTypeFlexiBetConfig.getFlexiAverageWeightedMinEffectiveRtp();
                flexiAverageWeightedRtpMultiplier.getClass();
                flexiAverageWeightedMinEffectiveRtp.getClass();
                BigDecimal bigDecimalAdd = BigDecimal.ZERO;
                try {
                    zi50.a aVar3 = zi50.b;
                    int size = arrayList.size();
                    BigDecimal bigDecimalAdd2 = bigDecimalAdd;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        Selection selection = (Selection) obj2;
                        String str2 = selection.c.odds;
                        str2.getClass();
                        BigDecimal bigDecimalG = b.g(str2);
                        if (bigDecimalG != null) {
                            BigDecimal bigDecimalMultiply = bigDecimalG.multiply(new BigDecimal(String.valueOf(selection.c.probability)));
                            bigDecimalAdd2.getClass();
                            BigDecimal bigDecimalMultiply2 = bigDecimalG.multiply(bigDecimalMultiply);
                            bigDecimalMultiply2.getClass();
                            bigDecimalAdd2 = bigDecimalAdd2.add(bigDecimalMultiply2);
                            bigDecimalAdd2.getClass();
                            bigDecimalAdd.getClass();
                            bigDecimalAdd = bigDecimalAdd.add(bigDecimalG);
                            bigDecimalAdd.getClass();
                        }
                    }
                    if (bigDecimalAdd.compareTo(BigDecimal.ZERO) != 0) {
                        BigDecimal bigDecimalMax = bigDecimalAdd2.divide(bigDecimalAdd, 12, RoundingMode.HALF_UP).max(flexiAverageWeightedMinEffectiveRtp);
                        bigDecimalMin = bigDecimalMax.min(new BigDecimal(String.valueOf(Math.pow(bigDecimal.doubleValue(), flexiAverageWeightedRtpMultiplier.multiply(BigDecimal.ONE.subtract(bigDecimalMax)).doubleValue()))));
                    }
                } catch (Throwable th2) {
                    zi50.a aVar4 = zi50.b;
                    if (zi50.a(new zi50.b(th2)) == null) {
                        fkd.a();
                        return null;
                    }
                }
            }
        }
        if (bigDecimalMin != null) {
            return bigDecimalMin;
        }
        BigDecimal oddsKey = betTypeFlexiBetConfig.getOddsKeys().get(Integer.valueOf(arrayList.size()));
        if (oddsKey == null) {
            oddsKey = betTypeFlexiBetConfig.getOddsKey();
        }
        return oddsKey;
    }
}
