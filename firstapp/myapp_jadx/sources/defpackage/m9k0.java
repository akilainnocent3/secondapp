package defpackage;

import com.sportybet.android.globalpay.data.KycLimitData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class m9k0 {
    public static final ArrayList a(List list, boolean z) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (z ? ((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData) obj).isChannelLimit() : true) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Long b(List<KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData> list, boolean z, c800 c800Var) {
        ArrayList arrayListA;
        if (list == null || (arrayListA = a(list, z)) == null) {
            return null;
        }
        ArrayList arrayListC = c(arrayListA, c800Var);
        ArrayList arrayList = new ArrayList();
        int size = arrayListC.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListC.get(i);
            i++;
            if (((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) obj).getMaxAmount() >= 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Long lValueOf = Long.valueOf(((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) it.next()).getMaxAmount());
        while (it.hasNext()) {
            Long lValueOf2 = Long.valueOf(((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) it.next()).getMaxAmount());
            if (lValueOf.compareTo(lValueOf2) > 0) {
                lValueOf = lValueOf2;
            }
        }
        return lValueOf;
    }

    public static final ArrayList c(ArrayList arrayList, c800 c800Var) {
        Object next;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Iterator<T> it = ((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData) obj).getPaymentLimitTypeDetails().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) next).getAmountType() != c800Var.a);
            KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData paymentLimitTypeDetailsData = (KycLimitData.PaymentLimitLevelData.PaymentLimitTypeInfoDetailsData.PaymentLimitTypeDetailsData) next;
            if (paymentLimitTypeDetailsData != null) {
                arrayList2.add(paymentLimitTypeDetailsData);
            }
        }
        return arrayList2;
    }
}
