package defpackage;

import com.sportybet.android.globalpay.data.AccumulatedAmount;
import com.sportybet.android.globalpay.data.FullSummaryData;
import com.sportybet.android.globalpay.data.KycLimitData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o1l {
    public static int a(KycLimitData kycLimitData, FullSummaryData fullSummaryData, String str, String str2, double d, ga00 ga00Var) {
        List<KycLimitData.PaymentLimitLevelData> paymentLimitTierLevels;
        FullSummaryData.CombinedSummary combinedSummary;
        FullSummaryData.CombinedSummary combinedSummary2;
        FullSummaryData.CombinedSummary combinedSummary3;
        Map<Integer, FullSummaryData.MapValue> providerSummary;
        FullSummaryData.MapValue mapValue;
        Map<Integer, FullSummaryData.MapValue> providerSummary2;
        FullSummaryData.MapValue mapValue2;
        Map<Integer, FullSummaryData.MapValue> providerSummary3;
        FullSummaryData.MapValue mapValue3;
        Map<Integer, FullSummaryData.MapValue> channelSummary;
        FullSummaryData.MapValue mapValue4;
        Map<Integer, FullSummaryData.MapValue> channelSummary2;
        FullSummaryData.MapValue mapValue5;
        Map<Integer, FullSummaryData.MapValue> channelSummary3;
        FullSummaryData.MapValue mapValue6;
        str.getClass();
        str2.getClass();
        ga00Var.getClass();
        List<AccumulatedAmount> lifetime = null;
        double d2 = d((fullSummaryData == null || (channelSummary3 = fullSummaryData.getChannelSummary()) == null || (mapValue6 = channelSummary3.get(Integer.valueOf(Integer.parseInt(str2)))) == null) ? null : mapValue6.getDaily());
        double d3 = d((fullSummaryData == null || (channelSummary2 = fullSummaryData.getChannelSummary()) == null || (mapValue5 = channelSummary2.get(Integer.valueOf(Integer.parseInt(str2)))) == null) ? null : mapValue5.getMonthly());
        double d4 = d((fullSummaryData == null || (channelSummary = fullSummaryData.getChannelSummary()) == null || (mapValue4 = channelSummary.get(Integer.valueOf(Integer.parseInt(str2)))) == null) ? null : mapValue4.getLifetime());
        double d5 = d((fullSummaryData == null || (providerSummary3 = fullSummaryData.getProviderSummary()) == null || (mapValue3 = providerSummary3.get(Integer.valueOf(Integer.parseInt(str)))) == null) ? null : mapValue3.getDaily());
        double d6 = d((fullSummaryData == null || (providerSummary2 = fullSummaryData.getProviderSummary()) == null || (mapValue2 = providerSummary2.get(Integer.valueOf(Integer.parseInt(str)))) == null) ? null : mapValue2.getMonthly());
        double d7 = d((fullSummaryData == null || (providerSummary = fullSummaryData.getProviderSummary()) == null || (mapValue = providerSummary.get(Integer.valueOf(Integer.parseInt(str)))) == null) ? null : mapValue.getLifetime());
        double d8 = d((fullSummaryData == null || (combinedSummary3 = fullSummaryData.getCombinedSummary()) == null) ? null : combinedSummary3.getDaily());
        double d9 = d((fullSummaryData == null || (combinedSummary2 = fullSummaryData.getCombinedSummary()) == null) ? null : combinedSummary2.getMonthly());
        if (fullSummaryData != null && (combinedSummary = fullSummaryData.getCombinedSummary()) != null) {
            lifetime = combinedSummary.getLifetime();
        }
        double d10 = d(lifetime);
        if (kycLimitData != null && (paymentLimitTierLevels = kycLimitData.getPaymentLimitTierLevels()) != null) {
            for (KycLimitData.PaymentLimitLevelData paymentLimitLevelData : paymentLimitTierLevels) {
                boolean z = true;
                boolean z2 = true;
                boolean z3 = true;
                for (KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData paymentLimitTypeInfoDetailsData : paymentLimitLevelData.getPaymentLimitTypeInfoDetails()) {
                    if (paymentLimitTypeInfoDetailsData.getChannelId().length() <= 0 || !Intrinsics.g(paymentLimitTypeInfoDetailsData.getChannelId(), str2)) {
                        if (paymentLimitTypeInfoDetailsData.getChannelId().length() == 0 && paymentLimitTypeInfoDetailsData.getProviderId().length() > 0 && Intrinsics.g(paymentLimitTypeInfoDetailsData.getProviderId(), str)) {
                            if (!e(paymentLimitTypeInfoDetailsData.getPaymentLimitTypeDetails(), ga00Var.a, d5, d6, d7, d)) {
                                z2 = false;
                            }
                        } else if (paymentLimitTypeInfoDetailsData.getChannelId().length() == 0 && paymentLimitTypeInfoDetailsData.getProviderId().length() == 0 && !e(paymentLimitTypeInfoDetailsData.getPaymentLimitTypeDetails(), ga00Var.a, d8, d9, d10, d)) {
                            z3 = false;
                        }
                    } else if (!e(paymentLimitTypeInfoDetailsData.getPaymentLimitTypeDetails(), ga00Var.a, d2, d3, d4, d)) {
                        z = false;
                    }
                }
                if (z && z2 && z3) {
                    return paymentLimitLevelData.getLevel();
                }
            }
        }
        if (kycLimitData != null) {
            return kycLimitData.getMaxLevel();
        }
        return 0;
    }

    public static double b(KycLimitData kycLimitData, FullSummaryData fullSummaryData, String str, String str2, double d, int i) {
        double dC;
        double d2;
        FullSummaryData.CombinedSummary combinedSummary;
        FullSummaryData.CombinedSummary combinedSummary2;
        FullSummaryData.CombinedSummary combinedSummary3;
        Map<Integer, FullSummaryData.MapValue> providerSummary;
        FullSummaryData.MapValue mapValue;
        Map<Integer, FullSummaryData.MapValue> providerSummary2;
        FullSummaryData.MapValue mapValue2;
        Map<Integer, FullSummaryData.MapValue> providerSummary3;
        FullSummaryData.MapValue mapValue3;
        Map<Integer, FullSummaryData.MapValue> channelSummary;
        FullSummaryData.MapValue mapValue4;
        Map<Integer, FullSummaryData.MapValue> channelSummary2;
        FullSummaryData.MapValue mapValue5;
        Map<Integer, FullSummaryData.MapValue> channelSummary3;
        FullSummaryData.MapValue mapValue6;
        str.getClass();
        str2.getClass();
        List<AccumulatedAmount> lifetime = null;
        double d3 = d((fullSummaryData == null || (channelSummary3 = fullSummaryData.getChannelSummary()) == null || (mapValue6 = channelSummary3.get(Integer.valueOf(Integer.parseInt(str2)))) == null) ? null : mapValue6.getDaily());
        double d4 = d((fullSummaryData == null || (channelSummary2 = fullSummaryData.getChannelSummary()) == null || (mapValue5 = channelSummary2.get(Integer.valueOf(Integer.parseInt(str2)))) == null) ? null : mapValue5.getMonthly());
        double d5 = d((fullSummaryData == null || (channelSummary = fullSummaryData.getChannelSummary()) == null || (mapValue4 = channelSummary.get(Integer.valueOf(Integer.parseInt(str2)))) == null) ? null : mapValue4.getLifetime());
        double d6 = d((fullSummaryData == null || (providerSummary3 = fullSummaryData.getProviderSummary()) == null || (mapValue3 = providerSummary3.get(Integer.valueOf(Integer.parseInt(str)))) == null) ? null : mapValue3.getDaily());
        double d7 = d((fullSummaryData == null || (providerSummary2 = fullSummaryData.getProviderSummary()) == null || (mapValue2 = providerSummary2.get(Integer.valueOf(Integer.parseInt(str)))) == null) ? null : mapValue2.getMonthly());
        double d8 = d((fullSummaryData == null || (providerSummary = fullSummaryData.getProviderSummary()) == null || (mapValue = providerSummary.get(Integer.valueOf(Integer.parseInt(str)))) == null) ? null : mapValue.getLifetime());
        double d9 = d((fullSummaryData == null || (combinedSummary3 = fullSummaryData.getCombinedSummary()) == null) ? null : combinedSummary3.getDaily());
        double d10 = d((fullSummaryData == null || (combinedSummary2 = fullSummaryData.getCombinedSummary()) == null) ? null : combinedSummary2.getMonthly());
        if (fullSummaryData != null && (combinedSummary = fullSummaryData.getCombinedSummary()) != null) {
            lifetime = combinedSummary.getLifetime();
        }
        double d11 = d(lifetime);
        if (kycLimitData != null) {
            dC = d;
            for (KycLimitData.PaymentLimitLevelData paymentLimitLevelData : kycLimitData.getPaymentLimitTierLevels()) {
                if (paymentLimitLevelData.getLevel() == kycLimitData.getMaxLevel()) {
                    Iterator<T> it = paymentLimitLevelData.getPaymentLimitTypeInfoDetails().iterator();
                    while (true) {
                        d2 = dC;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData paymentLimitTypeInfoDetailsData = (KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData) it.next();
                            if (paymentLimitTypeInfoDetailsData.getChannelId().length() <= 0 || !Intrinsics.g(paymentLimitTypeInfoDetailsData.getChannelId(), str2)) {
                                if (paymentLimitTypeInfoDetailsData.getChannelId().length() == 0 && paymentLimitTypeInfoDetailsData.getProviderId().length() > 0) {
                                    if (Intrinsics.g(paymentLimitTypeInfoDetailsData.getProviderId(), str)) {
                                        dC = c(paymentLimitTypeInfoDetailsData.getPaymentLimitTypeDetails(), i, d6, d7, d8, d2);
                                    }
                                }
                                if (paymentLimitTypeInfoDetailsData.getChannelId().length() == 0 && paymentLimitTypeInfoDetailsData.getProviderId().length() == 0) {
                                    dC = c(paymentLimitTypeInfoDetailsData.getPaymentLimitTypeDetails(), i, d9, d10, d11, d2);
                                }
                            } else {
                                dC = c(paymentLimitTypeInfoDetailsData.getPaymentLimitTypeDetails(), i, d3, d4, d5, d2);
                            }
                        }
                    }
                    dC = d2;
                }
            }
        } else {
            dC = d;
        }
        return new BigDecimal(dC).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048 A[PHI: r3
      0x0048: PHI (r3v12 double) = (r3v9 double), (r3v10 double), (r3v11 double), (r3v8 double) binds: [B:33:0x0065, B:28:0x005b, B:23:0x0051, B:18:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    public static double c(List list, int i, double d, double d2, double d3, double d4) {
        double maxAmount;
        Iterator it = list.iterator();
        double d5 = d4;
        while (it.hasNext()) {
            KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData paymentLimitTypeDetailsData = (KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) it.next();
            if (paymentLimitTypeDetailsData.getPaymentType() == i) {
                double d6 = 0.0d;
                if (paymentLimitTypeDetailsData.getMaxAmount() == 0) {
                    maxAmount = 0.0d;
                } else {
                    maxAmount = paymentLimitTypeDetailsData.getMaxAmount() < 0 ? Double.MAX_VALUE : paymentLimitTypeDetailsData.getMaxAmount();
                }
                int amountType = paymentLimitTypeDetailsData.getAmountType();
                c800 c800Var = c800.MIN_ALLOWED;
                if (amountType == 10) {
                    if (maxAmount >= 0.0d) {
                        d6 = maxAmount;
                    }
                } else if (amountType == 20) {
                    maxAmount -= d;
                    if (maxAmount >= 0.0d) {
                        d6 = maxAmount;
                    }
                } else if (amountType == 30) {
                    maxAmount -= d2;
                    if (maxAmount >= 0.0d) {
                        d6 = maxAmount;
                    }
                } else if (amountType == 40) {
                    maxAmount -= d3;
                    if (maxAmount >= 0.0d) {
                        d6 = maxAmount;
                    }
                }
                double d7 = d6 / 10000.0d;
                if (d5 < d7) {
                    d5 = d7;
                }
            }
        }
        return d5;
    }

    public static double d(List list) {
        AccumulatedAmount accumulatedAmount;
        if (list == null || list.isEmpty() || (accumulatedAmount = (AccumulatedAmount) list.get(0)) == null) {
            return 0.0d;
        }
        return accumulatedAmount.getSummaryAmount();
    }

    public static boolean e(List list, int i, double d, double d2, double d3, double d4) {
        double maxAmount;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData paymentLimitTypeDetailsData = (KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) it.next();
            if (paymentLimitTypeDetailsData.getPaymentType() == i) {
                if (paymentLimitTypeDetailsData.getMaxAmount() == 0) {
                    maxAmount = 0.0d;
                } else {
                    maxAmount = paymentLimitTypeDetailsData.getMaxAmount() < 0 ? Double.MAX_VALUE : paymentLimitTypeDetailsData.getMaxAmount();
                }
                int amountType = paymentLimitTypeDetailsData.getAmountType();
                c800 c800Var = c800.MIN_ALLOWED;
                if (amountType == 10) {
                    if (d4 > maxAmount) {
                        return false;
                    }
                } else if (amountType == 20) {
                    if (d4 > maxAmount - d) {
                        return false;
                    }
                } else if (amountType == 30) {
                    if (d4 > maxAmount - d2) {
                        return false;
                    }
                } else if (amountType == 40 && d4 > maxAmount - d3) {
                    return false;
                }
            }
        }
        return true;
    }
}
