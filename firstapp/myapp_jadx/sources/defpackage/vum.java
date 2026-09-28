package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.globalpay.data.AccumulatedAmount;
import com.sportybet.android.globalpay.data.FullSummaryData;
import com.sportybet.android.globalpay.data.KycLimitData;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes5.dex */
public final class vum extends f0l {
    public final boolean g;
    public final String h;
    public final CountryCodeName i;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return vl8.b((Long) ((Pair) t).b, (Long) ((Pair) t2).b);
        }
    }

    public vum(CountryCodeName countryCodeName, String str, boolean z) {
        super(z, str);
        this.g = z;
        this.h = str;
        this.i = countryCodeName;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:184:0x0315  */
    /* JADX WARN: Code duplicated, block: B:219:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:222:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:256:0x0488  */
    /* JADX WARN: Code duplicated, block: B:260:0x0495  */
    /* JADX WARN: Code duplicated, block: B:263:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:266:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:269:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:272:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:275:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:337:0x0511 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x04fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00dc  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.f0l
    public final void a(ga00 ga00Var, FullSummaryData fullSummaryData, KycLimitData kycLimitData, String str, String str2, int i) {
        int maxLevel;
        KycLimitData.PaymentLimitLevelData paymentLimitLevelData;
        long jLongValue;
        long j;
        long jLongValue2;
        long jLongValue3;
        long j2;
        long jLongValue4;
        long j3;
        long jLongValue5;
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        int i2;
        Object obj;
        List<KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData> paymentLimitTypeInfoDetails;
        Long l;
        long j4;
        Object next;
        List<KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData> paymentLimitTypeInfoDetails2;
        Long lValueOf;
        Iterator it;
        long j5;
        Object next2;
        List<KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData> paymentLimitTypeInfoDetails3;
        Long lValueOf2;
        Iterator it2;
        Object next3;
        List<KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData> paymentLimitTypeInfoDetails4;
        Long lValueOf3;
        long j6;
        Object next4;
        List<KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData> paymentLimitTypeInfoDetails5;
        Long lValueOf4;
        Object next5;
        int amountType;
        List<KycLimitData.PaymentLimitLevelData> paymentLimitTierLevels;
        Object next6;
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
        FullSummaryData.MapValue mapValue = (fullSummaryData == null || (channelSummary = fullSummaryData.getChannelSummary()) == null) ? null : channelSummary.get(Integer.valueOf(Integer.parseInt(str)));
        FullSummaryData.MapValue mapValue2 = (fullSummaryData == null || (providerSummary = fullSummaryData.getProviderSummary()) == null) ? null : providerSummary.get(Integer.valueOf(Integer.parseInt(str2)));
        long j7 = 0;
        long jMax = Math.max((mapValue == null || (daily2 = mapValue.getDaily()) == null || (accumulatedAmount6 = (AccumulatedAmount) CollectionsKt.V(0, daily2)) == null) ? 0L : accumulatedAmount6.getSummaryAmount(), (mapValue2 == null || (daily = mapValue2.getDaily()) == null || (accumulatedAmount5 = (AccumulatedAmount) CollectionsKt.V(0, daily)) == null) ? 0L : accumulatedAmount5.getSummaryAmount());
        long jMax2 = Math.max((mapValue == null || (monthly2 = mapValue.getMonthly()) == null || (accumulatedAmount4 = (AccumulatedAmount) CollectionsKt.V(0, monthly2)) == null) ? 0L : accumulatedAmount4.getSummaryAmount(), (mapValue2 == null || (monthly = mapValue2.getMonthly()) == null || (accumulatedAmount3 = (AccumulatedAmount) CollectionsKt.V(0, monthly)) == null) ? 0L : accumulatedAmount3.getSummaryAmount());
        long jMax3 = Math.max((mapValue == null || (lifetime2 = mapValue.getLifetime()) == null || (accumulatedAmount2 = (AccumulatedAmount) CollectionsKt.V(0, lifetime2)) == null) ? 0L : accumulatedAmount2.getSummaryAmount(), (mapValue2 == null || (lifetime = mapValue2.getLifetime()) == null || (accumulatedAmount = (AccumulatedAmount) CollectionsKt.V(0, lifetime)) == null) ? 0L : accumulatedAmount.getSummaryAmount());
        int iOrdinal = ga00Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            } else if (kycLimitData != null) {
                maxLevel = kycLimitData.getCurrentLevel();
            } else {
                maxLevel = 0;
            }
        } else if (kycLimitData != null) {
            maxLevel = kycLimitData.getMaxLevel();
        } else {
            maxLevel = 0;
        }
        if (kycLimitData == null || (paymentLimitTierLevels = kycLimitData.getPaymentLimitTierLevels()) == null) {
            paymentLimitLevelData = null;
        } else {
            Iterator<T> it3 = paymentLimitTierLevels.iterator();
            do {
                if (!it3.hasNext()) {
                    next6 = null;
                    break;
                }
                next6 = it3.next();
            } while (((KycLimitData.PaymentLimitLevelData) next6).getLevel() != maxLevel);
            paymentLimitLevelData = (KycLimitData.PaymentLimitLevelData) next6;
        }
        if (paymentLimitLevelData == null || (paymentLimitTypeInfoDetails5 = paymentLimitLevelData.getPaymentLimitTypeInfoDetails()) == null) {
            jLongValue = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it4 = paymentLimitTypeInfoDetails5.iterator();
            while (it4.hasNext()) {
                Iterator<T> it5 = ((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData) it4.next()).getPaymentLimitTypeDetails().iterator();
                do {
                    if (!it5.hasNext()) {
                        next5 = null;
                        break;
                    } else {
                        next5 = it5.next();
                        amountType = ((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) next5).getAmountType();
                        c800 c800Var = c800.MIN_ALLOWED;
                    }
                } while (amountType != 5);
                KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData paymentLimitTypeDetailsData = (KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) next5;
                if (paymentLimitTypeDetailsData != null) {
                    arrayList3.add(paymentLimitTypeDetailsData);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList3.get(i3);
                i3++;
                if (((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) obj2).getMaxAmount() > 0) {
                    arrayList4.add(obj2);
                }
            }
            Iterator it6 = arrayList4.iterator();
            if (it6.hasNext()) {
                lValueOf4 = Long.valueOf(((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) it6.next()).getMaxAmount());
                while (it6.hasNext()) {
                    Long lValueOf5 = Long.valueOf(((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) it6.next()).getMaxAmount());
                    if (lValueOf4.compareTo(lValueOf5) > 0) {
                        lValueOf4 = lValueOf5;
                    }
                }
            } else {
                lValueOf4 = null;
            }
            if (lValueOf4 != null) {
                jLongValue = lValueOf4.longValue();
            } else {
                jLongValue = 0;
            }
        }
        if (paymentLimitLevelData != null && (paymentLimitTypeInfoDetails4 = paymentLimitLevelData.getPaymentLimitTypeInfoDetails()) != null) {
            ArrayList arrayList5 = new ArrayList();
            Iterator<T> it7 = paymentLimitTypeInfoDetails4.iterator();
            while (it7.hasNext()) {
                Iterator<T> it8 = ((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData) it7.next()).getPaymentLimitTypeDetails().iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        j6 = j7;
                        next4 = null;
                        break;
                    }
                    next4 = it8.next();
                    int amountType2 = ((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) next4).getAmountType();
                    c800 c800Var2 = c800.MIN_ALLOWED;
                    j6 = j7;
                    if (amountType2 == 10) {
                        break;
                    } else {
                        j7 = j6;
                    }
                }
                KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData paymentLimitTypeDetailsData2 = (KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) next4;
                if (paymentLimitTypeDetailsData2 != null) {
                    arrayList5.add(paymentLimitTypeDetailsData2);
                }
                j7 = j6;
            }
            j = j7;
            ArrayList arrayList6 = new ArrayList();
            int size3 = arrayList5.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList5.get(i4);
                i4++;
                if (((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) obj3).getMaxAmount() > j) {
                    arrayList6.add(obj3);
                }
            }
            Iterator it9 = arrayList6.iterator();
            if (it9.hasNext()) {
                lValueOf3 = Long.valueOf(((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) it9.next()).getMaxAmount());
                while (it9.hasNext()) {
                    Long lValueOf6 = Long.valueOf(((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) it9.next()).getMaxAmount());
                    if (lValueOf3.compareTo(lValueOf6) > 0) {
                        lValueOf3 = lValueOf6;
                    }
                }
            } else {
                lValueOf3 = null;
            }
            if (lValueOf3 != null) {
                jLongValue2 = lValueOf3.longValue();
            }
            if (paymentLimitLevelData != null || (paymentLimitTypeInfoDetails3 = paymentLimitLevelData.getPaymentLimitTypeInfoDetails()) == null) {
                jLongValue3 = j;
            } else {
                ArrayList arrayList7 = new ArrayList();
                Iterator it10 = paymentLimitTypeInfoDetails3.iterator();
                while (it10.hasNext()) {
                    Iterator<T> it11 = ((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData) it10.next()).getPaymentLimitTypeDetails().iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            it2 = it10;
                            next3 = null;
                            break;
                        }
                        next3 = it11.next();
                        int amountType3 = ((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) next3).getAmountType();
                        c800 c800Var3 = c800.MIN_ALLOWED;
                        it2 = it10;
                        if (amountType3 == 20) {
                            break;
                        } else {
                            it10 = it2;
                        }
                    }
                    KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData paymentLimitTypeDetailsData3 = (KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) next3;
                    if (paymentLimitTypeDetailsData3 != null) {
                        arrayList7.add(paymentLimitTypeDetailsData3);
                    }
                    it10 = it2;
                }
                ArrayList arrayList8 = new ArrayList();
                int size4 = arrayList7.size();
                int i5 = 0;
                while (i5 < size4) {
                    Object obj4 = arrayList7.get(i5);
                    i5++;
                    if (((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) obj4).getMaxAmount() > j) {
                        arrayList8.add(obj4);
                    }
                }
                Iterator it12 = arrayList8.iterator();
                if (it12.hasNext()) {
                    lValueOf2 = Long.valueOf(((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) it12.next()).getMaxAmount());
                    while (it12.hasNext()) {
                        Long lValueOf7 = Long.valueOf(((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) it12.next()).getMaxAmount());
                        if (lValueOf2.compareTo(lValueOf7) > 0) {
                            lValueOf2 = lValueOf7;
                        }
                    }
                } else {
                    lValueOf2 = null;
                }
                if (lValueOf2 != null) {
                    jLongValue3 = lValueOf2.longValue();
                } else {
                    jLongValue3 = j;
                }
            }
            if (paymentLimitLevelData == null && (paymentLimitTypeInfoDetails2 = paymentLimitLevelData.getPaymentLimitTypeInfoDetails()) != null) {
                ArrayList arrayList9 = new ArrayList();
                Iterator it13 = paymentLimitTypeInfoDetails2.iterator();
                while (it13.hasNext()) {
                    Iterator<T> it14 = ((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData) it13.next()).getPaymentLimitTypeDetails().iterator();
                    while (true) {
                        if (!it14.hasNext()) {
                            it = it13;
                            j5 = jMax3;
                            next2 = null;
                            break;
                        }
                        next2 = it14.next();
                        it = it13;
                        int amountType4 = ((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) next2).getAmountType();
                        c800 c800Var4 = c800.MIN_ALLOWED;
                        j5 = jMax3;
                        if (amountType4 == 30) {
                            break;
                        }
                        it13 = it;
                        jMax3 = j5;
                    }
                    KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData paymentLimitTypeDetailsData4 = (KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) next2;
                    if (paymentLimitTypeDetailsData4 != null) {
                        arrayList9.add(paymentLimitTypeDetailsData4);
                    }
                    it13 = it;
                    jMax3 = j5;
                }
                j2 = jMax3;
                ArrayList arrayList10 = new ArrayList();
                int size5 = arrayList9.size();
                int i6 = 0;
                while (i6 < size5) {
                    Object obj5 = arrayList9.get(i6);
                    i6++;
                    if (((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) obj5).getMaxAmount() > j) {
                        arrayList10.add(obj5);
                    }
                }
                Iterator it15 = arrayList10.iterator();
                if (it15.hasNext()) {
                    lValueOf = Long.valueOf(((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) it15.next()).getMaxAmount());
                    while (it15.hasNext()) {
                        Long lValueOf8 = Long.valueOf(((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) it15.next()).getMaxAmount());
                        if (lValueOf.compareTo(lValueOf8) > 0) {
                            lValueOf = lValueOf8;
                        }
                    }
                } else {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    jLongValue4 = lValueOf.longValue();
                }
                if (paymentLimitLevelData == null && (paymentLimitTypeInfoDetails = paymentLimitLevelData.getPaymentLimitTypeInfoDetails()) != null) {
                    ArrayList arrayList11 = new ArrayList();
                    Iterator<T> it16 = paymentLimitTypeInfoDetails.iterator();
                    while (it16.hasNext()) {
                        Iterator<T> it17 = ((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData) it16.next()).getPaymentLimitTypeDetails().iterator();
                        while (true) {
                            if (!it17.hasNext()) {
                                j4 = jLongValue4;
                                next = null;
                                break;
                            }
                            next = it17.next();
                            j4 = jLongValue4;
                            int amountType5 = ((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) next).getAmountType();
                            c800 c800Var5 = c800.MIN_ALLOWED;
                            if (amountType5 == 40) {
                                break;
                            } else {
                                jLongValue4 = j4;
                            }
                        }
                        KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData paymentLimitTypeDetailsData5 = (KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) next;
                        if (paymentLimitTypeDetailsData5 != null) {
                            arrayList11.add(paymentLimitTypeDetailsData5);
                        }
                        jLongValue4 = j4;
                    }
                    j3 = jLongValue4;
                    ArrayList arrayList12 = new ArrayList();
                    int size6 = arrayList11.size();
                    int i7 = 0;
                    while (i7 < size6) {
                        Object obj6 = arrayList11.get(i7);
                        i7++;
                        if (((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) obj6).getMaxAmount() > j) {
                            arrayList12.add(obj6);
                        }
                    }
                    Iterator it18 = arrayList12.iterator();
                    if (it18.hasNext()) {
                        Long lValueOf9 = Long.valueOf(((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) it18.next()).getMaxAmount());
                        while (it18.hasNext()) {
                            Long lValueOf10 = Long.valueOf(((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) it18.next()).getMaxAmount());
                            if (lValueOf9.compareTo(lValueOf10) > 0) {
                                lValueOf9 = lValueOf10;
                            }
                        }
                        l = lValueOf9;
                    } else {
                        l = null;
                    }
                    if (l != null) {
                        jLongValue5 = l.longValue();
                    }
                    arrayList = new ArrayList();
                    if (jLongValue != j) {
                        arrayList.add(new Pair(c800.MIN_ALLOWED, Long.valueOf(jLongValue)));
                    }
                    if (jLongValue2 != j) {
                        arrayList.add(new Pair(c800.SINGLE, Long.valueOf(jLongValue2)));
                    }
                    if (jLongValue3 != j) {
                        arrayList.add(new Pair(c800.DAILY, Long.valueOf(jLongValue3 - jMax)));
                    }
                    if (j3 != j) {
                        arrayList.add(new Pair(c800.MONTHLY, Long.valueOf(j3 - jMax2)));
                    }
                    if (jLongValue5 != j) {
                        arrayList.add(new Pair(c800.LIFETIME, Long.valueOf(jLongValue5 - j2)));
                    }
                    arrayList2 = new ArrayList();
                    size = arrayList.size();
                    i2 = 0;
                    while (i2 < size) {
                        obj = arrayList.get(i2);
                        i2++;
                        if (((Number) ((Pair) obj).b).longValue() > j) {
                            arrayList2.add(obj);
                        }
                    }
                    this.b = CollectionsKt.r0(arrayList2, new a());
                }
                j3 = jLongValue4;
                jLongValue5 = j;
                arrayList = new ArrayList();
                if (jLongValue != j) {
                    arrayList.add(new Pair(c800.MIN_ALLOWED, Long.valueOf(jLongValue)));
                }
                if (jLongValue2 != j) {
                    arrayList.add(new Pair(c800.SINGLE, Long.valueOf(jLongValue2)));
                }
                if (jLongValue3 != j) {
                    arrayList.add(new Pair(c800.DAILY, Long.valueOf(jLongValue3 - jMax)));
                }
                if (j3 != j) {
                    arrayList.add(new Pair(c800.MONTHLY, Long.valueOf(j3 - jMax2)));
                }
                if (jLongValue5 != j) {
                    arrayList.add(new Pair(c800.LIFETIME, Long.valueOf(jLongValue5 - j2)));
                }
                arrayList2 = new ArrayList();
                size = arrayList.size();
                i2 = 0;
                while (i2 < size) {
                    obj = arrayList.get(i2);
                    i2++;
                    if (((Number) ((Pair) obj).b).longValue() > j) {
                        arrayList2.add(obj);
                    }
                }
                this.b = CollectionsKt.r0(arrayList2, new a());
            }
            j2 = jMax3;
            jLongValue4 = j;
            if (paymentLimitLevelData == null) {
                j3 = jLongValue4;
                jLongValue5 = j;
            } else {
                j3 = jLongValue4;
                jLongValue5 = j;
            }
            arrayList = new ArrayList();
            if (jLongValue != j) {
                arrayList.add(new Pair(c800.MIN_ALLOWED, Long.valueOf(jLongValue)));
            }
            if (jLongValue2 != j) {
                arrayList.add(new Pair(c800.SINGLE, Long.valueOf(jLongValue2)));
            }
            if (jLongValue3 != j) {
                arrayList.add(new Pair(c800.DAILY, Long.valueOf(jLongValue3 - jMax)));
            }
            if (j3 != j) {
                arrayList.add(new Pair(c800.MONTHLY, Long.valueOf(j3 - jMax2)));
            }
            if (jLongValue5 != j) {
                arrayList.add(new Pair(c800.LIFETIME, Long.valueOf(jLongValue5 - j2)));
            }
            arrayList2 = new ArrayList();
            size = arrayList.size();
            i2 = 0;
            while (i2 < size) {
                obj = arrayList.get(i2);
                i2++;
                if (((Number) ((Pair) obj).b).longValue() > j) {
                    arrayList2.add(obj);
                }
            }
            this.b = CollectionsKt.r0(arrayList2, new a());
        }
        j = 0;
        jLongValue2 = j;
        if (paymentLimitLevelData != null) {
            jLongValue3 = j;
        } else {
            jLongValue3 = j;
        }
        if (paymentLimitLevelData == null) {
            j2 = jMax3;
            jLongValue4 = j;
        } else {
            j2 = jMax3;
            jLongValue4 = j;
        }
        if (paymentLimitLevelData == null) {
            j3 = jLongValue4;
            jLongValue5 = j;
        } else {
            j3 = jLongValue4;
            jLongValue5 = j;
        }
        arrayList = new ArrayList();
        if (jLongValue != j) {
            arrayList.add(new Pair(c800.MIN_ALLOWED, Long.valueOf(jLongValue)));
        }
        if (jLongValue2 != j) {
            arrayList.add(new Pair(c800.SINGLE, Long.valueOf(jLongValue2)));
        }
        if (jLongValue3 != j) {
            arrayList.add(new Pair(c800.DAILY, Long.valueOf(jLongValue3 - jMax)));
        }
        if (j3 != j) {
            arrayList.add(new Pair(c800.MONTHLY, Long.valueOf(j3 - jMax2)));
        }
        if (jLongValue5 != j) {
            arrayList.add(new Pair(c800.LIFETIME, Long.valueOf(jLongValue5 - j2)));
        }
        arrayList2 = new ArrayList();
        size = arrayList.size();
        i2 = 0;
        while (i2 < size) {
            obj = arrayList.get(i2);
            i2++;
            if (((Number) ((Pair) obj).b).longValue() > j) {
                arrayList2.add(obj);
            }
        }
        this.b = CollectionsKt.r0(arrayList2, new a());
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
        double d = z600.a().c.a;
        v4c v4cVar = v4c.a;
        String strE = v4cVar.e(d);
        boolean z = v4cVar.c(str) < z600.a().c.a;
        boolean zA = ogx.a("^0+$", str);
        String str2 = this.h;
        if (z || zA) {
            return new g0l.b(new ResourceUiText(R.string.page_payment__the_minimum_deposit_amount_is_vcurrency_vamount, b.k(str2, strE)));
        }
        double d2 = z600.a().c.b;
        String strE2 = v4cVar.e(d2);
        if (v4cVar.c(str) > d2) {
            return new g0l.b(new ResourceUiText(R.string.page_payment__the_maximum_deposit_amount_is_vcurrency_vamount, b.k(str2, strE2)));
        }
        double d3 = this.c;
        if (d3 == 0.0d) {
            return new g0l.b(new ResourceUiText(R.string.page_payment__for_the_maximum_kyc_tier_you_can_deposit_up_to_vcurrency_vamount_more_in_lifetime, b.k(str2, v4cVar.e(d3))));
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
        CountryCodeName countryCodeName = this.i;
        CountryCodeName countryCodeName2 = CountryCodeName.BRAZIL;
        String str2 = this.h;
        if (countryCodeName != countryCodeName2 && this.e != null) {
            double dC = v4c.a.c(str);
            BigDecimal bigDecimal = this.e;
            bigDecimal.getClass();
            if (dC > bigDecimal.doubleValue()) {
                return new g0l.b(new ResourceUiText(R.string.page_withdraw__amount_exceeds_your_withdrawable_balance_vcurrency_vbalance, b.k(str2, bjb0.L(this.e, v4c.j().D()))));
            }
        }
        v4c v4cVar = v4c.a;
        double dC2 = v4cVar.c(str);
        double d = this.f;
        if (dC2 > d) {
            return new g0l.b(new ResourceUiText(R.string.component_supporter__amount_exceeds_your_balance_vcurrency_vnum, b.k(str2, v4cVar.e(d))));
        }
        String strC = c();
        boolean z = v4cVar.c(str) < v4cVar.c(strC);
        boolean zA = ogx.a("^0+$", str);
        if (z || zA) {
            return new g0l.b(new ResourceUiText(R.string.page_withdraw__the_minimum_withdrawal_amount_is_vcurrency_vnum, b.k(str2, strC)));
        }
        double d2 = this.d;
        if (d2 == 0.0d) {
            return new g0l.b(new ResourceUiText(R.string.page_payment__for_the_maximum_kyc_tier_you_can_withdraw_up_to_vcurrency_vamount_more_in_lifetime, b.k(str2, v4cVar.e(d2))));
        }
        return (this.b == null || (bVarG = g(str)) == null) ? g0l.c.a : bVarG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g0l.b g(String str) {
        int iOrdinal;
        int i;
        str.getClass();
        double dC = v4c.a.c(str);
        List<? extends Pair<? extends c800, Long>> list = this.b;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                B b = pair.b;
                A a2 = pair.a;
                double dLongValue = ((Number) b).longValue() / 10000.0d;
                String strE = v4c.a.e(dLongValue);
                c800 c800Var = c800.MIN_ALLOWED;
                String str2 = this.h;
                boolean z = this.g;
                if (a2 == c800Var && dC < dLongValue) {
                    return new g0l.b(z ? new ResourceUiText(R.string.page_payment__the_minimum_deposit_amount_is_vcurrency_vamount, b.k(str2, strE)) : new ResourceUiText(R.string.page_withdraw__the_minimum_withdrawal_amount_is_vcurrency_vnum, b.k(str2, strE)), null);
                }
                if (dC > dLongValue && (iOrdinal = ((c800) a2).ordinal()) != 0) {
                    if (iOrdinal == 1) {
                        i = z ? R.string.page_payment__for_the_maximum_kyc_tier_you_can_deposit_up_to_vcurrency_vamount_in_a_single_transaction : R.string.page_payment__you_can_withdraw_up_to_vcurrency_vamount_in_a_single_transaction;
                    } else if (iOrdinal == 2) {
                        i = z ? R.string.page_payment__for_the_maximum_kyc_tier_you_can_deposit_up_to_vcurrency_vamount_more_today : R.string.page_payment__you_can_withdraw_up_to_vcurrency_vamount_more_today;
                    } else if (iOrdinal == 3) {
                        i = z ? R.string.page_payment__for_the_maximum_kyc_tier_you_can_deposit_up_to_vcurrency_vamount_more_this_month : R.string.page_payment__you_can_withdraw_up_to_vcurrency_vamount_more_this_month;
                    } else {
                        if (iOrdinal != 4) {
                            uhc.a();
                            return null;
                        }
                        i = z ? R.string.page_payment__for_the_maximum_kyc_tier_you_can_deposit_up_to_vcurrency_vamount_more_in_lifetime : R.string.page_payment__you_can_withdraw_up_to_vcurrency_vamount_more_in_lifetime;
                    }
                    return (a2 != c800.LIFETIME || z) ? new g0l.b(new ResourceUiText(i, b.k(str2, strE)), null) : new g0l.b(new ResourceUiText(i, b.k(str2, strE)).h(new ResourceUiText(R.string.page_payment__click_here_to_verify_your_account_and_increase_your_limits)), wae.KYC);
                }
            }
        }
        return null;
    }
}
