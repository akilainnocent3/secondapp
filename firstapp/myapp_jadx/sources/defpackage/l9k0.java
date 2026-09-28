package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.globalpay.data.AccumulatedAmount;
import com.sportybet.android.globalpay.data.FullSummaryData;
import com.sportybet.android.globalpay.data.KycLimitData;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class l9k0 extends f0l {
    public final boolean g;
    public final String h;
    public final Function0<Unit> i;
    public Integer j;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return vl8.b((Long) ((Pair) t).b, (Long) ((Pair) t2).b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9k0(String str, Function0 function0, boolean z) {
        super(z, str);
        str.getClass();
        this.g = z;
        this.h = str;
        this.i = function0;
    }

    /* JADX WARN: Code duplicated, block: B:95:0x016e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.f0l
    public final void a(ga00 ga00Var, FullSummaryData fullSummaryData, KycLimitData kycLimitData, String str, String str2, int i) {
        KycLimitData.PaymentLimitLevelData paymentLimitLevelData;
        Long lValueOf;
        List<KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData> paymentLimitTypeInfoDetails;
        ArrayList arrayListA;
        List<KycLimitData.PaymentLimitLevelData> paymentLimitTierLevels;
        Object next;
        List<AccumulatedAmount> lifetime;
        AccumulatedAmount accumulatedAmount;
        List<AccumulatedAmount> lifetime2;
        AccumulatedAmount accumulatedAmount2;
        List<AccumulatedAmount> monthly;
        AccumulatedAmount accumulatedAmount3;
        List<AccumulatedAmount> monthly2;
        AccumulatedAmount accumulatedAmount4;
        List<AccumulatedAmount> daily;
        AccumulatedAmount accumulatedAmount5;
        List<AccumulatedAmount> daily2;
        AccumulatedAmount accumulatedAmount6;
        Map<Integer, FullSummaryData.MapValue> providerSummary;
        Map<Integer, FullSummaryData.MapValue> channelSummary;
        ga00Var.getClass();
        str.getClass();
        str2.getClass();
        this.j = Integer.valueOf(i);
        FullSummaryData.MapValue mapValue = (fullSummaryData == null || (channelSummary = fullSummaryData.getChannelSummary()) == null) ? null : channelSummary.get(Integer.valueOf(Integer.parseInt(str)));
        FullSummaryData.MapValue mapValue2 = (fullSummaryData == null || (providerSummary = fullSummaryData.getProviderSummary()) == null) ? null : providerSummary.get(Integer.valueOf(Integer.parseInt(str2)));
        long jMax = Math.max((mapValue == null || (daily2 = mapValue.getDaily()) == null || (accumulatedAmount6 = (AccumulatedAmount) CollectionsKt.V(0, daily2)) == null) ? 0L : accumulatedAmount6.getSummaryAmount(), (mapValue2 == null || (daily = mapValue2.getDaily()) == null || (accumulatedAmount5 = (AccumulatedAmount) CollectionsKt.V(0, daily)) == null) ? 0L : accumulatedAmount5.getSummaryAmount());
        long jMax2 = Math.max((mapValue == null || (monthly2 = mapValue.getMonthly()) == null || (accumulatedAmount4 = (AccumulatedAmount) CollectionsKt.V(0, monthly2)) == null) ? 0L : accumulatedAmount4.getSummaryAmount(), (mapValue2 == null || (monthly = mapValue2.getMonthly()) == null || (accumulatedAmount3 = (AccumulatedAmount) CollectionsKt.V(0, monthly)) == null) ? 0L : accumulatedAmount3.getSummaryAmount());
        long jMax3 = Math.max((mapValue == null || (lifetime2 = mapValue.getLifetime()) == null || (accumulatedAmount2 = (AccumulatedAmount) CollectionsKt.V(0, lifetime2)) == null) ? 0L : accumulatedAmount2.getSummaryAmount(), (mapValue2 == null || (lifetime = mapValue2.getLifetime()) == null || (accumulatedAmount = (AccumulatedAmount) CollectionsKt.V(0, lifetime)) == null) ? 0L : accumulatedAmount.getSummaryAmount());
        if (kycLimitData == null || (paymentLimitTierLevels = kycLimitData.getPaymentLimitTierLevels()) == null) {
            paymentLimitLevelData = null;
        } else {
            Iterator<T> it = paymentLimitTierLevels.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((KycLimitData.PaymentLimitLevelData) next).getLevel() != 1);
            paymentLimitLevelData = (KycLimitData.PaymentLimitLevelData) next;
        }
        boolean z = i == 350;
        if (paymentLimitLevelData == null || (paymentLimitTypeInfoDetails = paymentLimitLevelData.getPaymentLimitTypeInfoDetails()) == null || (arrayListA = m9k0.a(paymentLimitTypeInfoDetails, z)) == null) {
            lValueOf = null;
        } else {
            ArrayList arrayListC = m9k0.c(arrayListA, c800.MIN_ALLOWED);
            ArrayList arrayList = new ArrayList();
            int size = arrayListC.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListC.get(i2);
                i2++;
                if (((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) obj).getMaxAmount() >= 0) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                lValueOf = Long.valueOf(((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) it2.next()).getMaxAmount());
                while (it2.hasNext()) {
                    Long lValueOf2 = Long.valueOf(((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) it2.next()).getMaxAmount());
                    if (lValueOf.compareTo(lValueOf2) < 0) {
                        lValueOf = lValueOf2;
                    }
                }
            } else {
                lValueOf = null;
            }
        }
        List<KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData> paymentLimitTypeInfoDetails2 = paymentLimitLevelData != null ? paymentLimitLevelData.getPaymentLimitTypeInfoDetails() : null;
        c800 c800Var = c800.SINGLE;
        Long lB = m9k0.b(paymentLimitTypeInfoDetails2, z, c800Var);
        List<KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData> paymentLimitTypeInfoDetails3 = paymentLimitLevelData != null ? paymentLimitLevelData.getPaymentLimitTypeInfoDetails() : null;
        c800 c800Var2 = c800.DAILY;
        Long lB2 = m9k0.b(paymentLimitTypeInfoDetails3, z, c800Var2);
        List<KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData> paymentLimitTypeInfoDetails4 = paymentLimitLevelData != null ? paymentLimitLevelData.getPaymentLimitTypeInfoDetails() : null;
        c800 c800Var3 = c800.MONTHLY;
        Long lB3 = m9k0.b(paymentLimitTypeInfoDetails4, z, c800Var3);
        List<KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData> paymentLimitTypeInfoDetails5 = paymentLimitLevelData != null ? paymentLimitLevelData.getPaymentLimitTypeInfoDetails() : null;
        c800 c800Var4 = c800.LIFETIME;
        Long lB4 = m9k0.b(paymentLimitTypeInfoDetails5, z, c800Var4);
        ArrayList arrayList2 = new ArrayList();
        if (lValueOf != null) {
            arrayList2.add(new Pair(c800.MIN_ALLOWED, lValueOf));
        }
        if (lB != null) {
            arrayList2.add(new Pair(c800Var, lB));
        }
        if (lB2 != null) {
            long jLongValue = lB2.longValue() - jMax;
            if (jLongValue < -1) {
                jLongValue = 0;
            }
            arrayList2.add(new Pair(c800Var2, Long.valueOf(jLongValue)));
        }
        if (lB3 != null) {
            long jLongValue2 = lB3.longValue() - jMax2;
            if (jLongValue2 < -1) {
                jLongValue2 = 0;
            }
            arrayList2.add(new Pair(c800Var3, Long.valueOf(jLongValue2)));
        }
        if (lB4 != 0) {
            long jLongValue3 = lB4.longValue() - jMax3;
            if (jLongValue3 < -1) {
                jLongValue3 = 0;
            }
            arrayList2.add(new Pair(c800Var4, Long.valueOf(jLongValue3)));
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            if (((Number) ((Pair) obj2).b).longValue() != -1) {
                arrayList3.add(obj2);
            }
        }
        this.b = CollectionsKt.r0(arrayList3, new a());
    }

    @Override // defpackage.f0l
    public final boolean d() {
        return this.g;
    }

    @Override // defpackage.f0l
    public final g0l e(String str) {
        g0l.b bVarG;
        str.getClass();
        if (str.length() == 0) {
            return g0l.a.a;
        }
        return (this.b == null || (bVarG = g(str)) == null) ? g0l.c.a : bVarG;
    }

    @Override // defpackage.f0l
    public final g0l f(String str) {
        g0l.b bVarG;
        str.getClass();
        if (str.length() == 0 || str.equals("0")) {
            return g0l.a.a;
        }
        BigDecimal bigDecimal = this.e;
        String str2 = this.h;
        if (bigDecimal != null) {
            double d = Double.parseDouble(str);
            BigDecimal bigDecimal2 = this.e;
            bigDecimal2.getClass();
            if (d > bigDecimal2.doubleValue()) {
                return new g0l.b(new ResourceUiText(R.string.page_withdraw__amount_exceeds_your_withdrawable_balance_vcurrency_vbalance, b.k(str2, bjb0.L(this.e, Locale.US))));
            }
        }
        double d2 = Double.parseDouble(str);
        double d3 = this.f;
        if (d2 > d3) {
            return new g0l.b(new ResourceUiText(R.string.component_supporter__amount_exceeds_your_balance_vcurrency_vnum, b.k(str2, bjb0.a0(d3, Locale.US))));
        }
        return (this.b == null || (bVarG = g(str)) == null) ? g0l.c.a : bVarG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g0l.b g(String str) {
        int iOrdinal;
        int i;
        str.getClass();
        double d = Double.parseDouble(str);
        List<? extends Pair<? extends c800, Long>> list = this.b;
        wae waeVar = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                double dLongValue = ((Number) pair.b).longValue() / 10000.0d;
                String strA0 = bjb0.a0(dLongValue, Locale.US);
                A a2 = pair.a;
                c800 c800Var = c800.MIN_ALLOWED;
                String str2 = this.h;
                boolean z = this.g;
                if (a2 == c800Var && d < dLongValue) {
                    return new g0l.b(z ? new ResourceUiText(R.string.page_payment__the_minimum_deposit_amount_is_vcurrency_vamount, b.k(str2, strA0)) : new ResourceUiText(R.string.page_withdraw__the_minimum_withdrawal_amount_is_vcurrency_vnum, b.k(str2, strA0)), null);
                }
                if (d > dLongValue && (iOrdinal = ((c800) a2).ordinal()) != 0) {
                    if (iOrdinal != 1) {
                        Function0<Unit> function0 = this.i;
                        if (iOrdinal != 2) {
                            i = R.string.page_payment__you_have_exceeded_the_withdrawal_limits;
                            if (iOrdinal == 3) {
                                Integer num = this.j;
                                if (z) {
                                    if (num != null && num.intValue() == 400) {
                                        function0.invoke();
                                        i = R.string.page_payment__you_can_deposit_up_to_vcurrency_vamount_more_this_month_click_here;
                                    } else {
                                        i = R.string.page_payment__you_can_deposit_up_to_vcurrency_vamount_more_this_month;
                                    }
                                } else if (num != null && num.intValue() == 400) {
                                    function0.invoke();
                                    i = R.string.page_payment__you_have_exceeded_the_withdrawal_limits_click_here;
                                }
                            } else {
                                if (iOrdinal != 4) {
                                    uhc.a();
                                    return null;
                                }
                                Integer num2 = this.j;
                                if (z) {
                                    if (num2 != null && num2.intValue() == 400) {
                                        function0.invoke();
                                        i = R.string.page_payment__you_can_deposit_up_to_vcurrency_vamount_more_in_lifetime_click_here;
                                    } else {
                                        i = R.string.page_payment__you_can_deposit_up_to_vcurrency_vamount_more_in_lifetime;
                                    }
                                } else if (num2 != null && num2.intValue() == 400) {
                                    function0.invoke();
                                    i = R.string.page_payment__you_have_exceeded_the_withdrawal_limits_click_here;
                                }
                            }
                        } else {
                            Integer num3 = this.j;
                            if (z) {
                                if (num3 != null && num3.intValue() == 400) {
                                    function0.invoke();
                                    i = R.string.page_payment__you_can_deposit_up_to_vcurrency_vamount_more_today_click_here;
                                } else {
                                    i = R.string.page_payment__you_can_deposit_up_to_vcurrency_vamount_more_today;
                                }
                            } else if (num3 != null && num3.intValue() == 400) {
                                function0.invoke();
                                i = R.string.page_payment__you_can_withdraw_up_to_vcurrency_vamount_more_today_click_here;
                            } else {
                                i = R.string.page_payment__you_can_withdraw_up_to_vcurrency_vamount_more_today;
                            }
                        }
                    } else {
                        Integer num4 = this.j;
                        if (z) {
                            i = (num4 != null && num4.intValue() == 400) ? R.string.page_payment__you_can_deposit_up_to_vcurrency_vamount_in_a_single_transaction_click_here : R.string.page_payment__you_can_deposit_up_to_vcurrency_vamount_in_a_single_transaction;
                        } else {
                            i = (num4 != null && num4.intValue() == 400) ? R.string.page_payment__you_can_withdraw_up_to_vcurrency_vamount_in_a_single_transaction_click_here : R.string.page_payment__you_can_withdraw_up_to_vcurrency_vamount_in_a_single_transaction;
                        }
                    }
                    ResourceUiText resourceUiText = new ResourceUiText(i, b.k(str2, strA0));
                    Integer num5 = this.j;
                    if (num5 != null && num5.intValue() == 400) {
                        waeVar = wae.KYC;
                    }
                    return new g0l.b(resourceUiText, waeVar);
                }
            }
        }
        return null;
    }
}
