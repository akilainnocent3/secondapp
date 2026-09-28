package defpackage;

import com.sporty.android.core.model.pay.bo.PhonePrefixData;
import com.sporty.android.core.model.pocket.common.PaymentChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.data.CommonChannelRepositoryImpl$initIfPhonePrefixDataNeed$2", f = "CommonChannelRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hb8 extends tje0 implements Function2<lk50<? extends PhonePrefixData[]>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ cb8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb8(cb8 cb8Var, v1b<? super hb8> v1bVar) {
        super(2, v1bVar);
        this.b = cb8Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hb8 hb8Var = new hb8(this.b, v1bVar);
        hb8Var.a = obj;
        return hb8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends PhonePrefixData[]> lk50Var, v1b<? super Unit> v1bVar) {
        return ((hb8) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List<PhonePrefixData> listS;
        Object next;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.c) {
            PhonePrefixData[] phonePrefixDataArr = (PhonePrefixData[]) ((lk50.c) lk50Var).a;
            List<PhonePrefixData> list = null;
            cb8 cb8Var = this.b;
            if (phonePrefixDataArr != null && (listS = ay0.S(phonePrefixDataArr)) != null) {
                List<PaymentChannel> list2 = cb8Var.e;
                ArrayList arrayList = new ArrayList(l48.r(list2, 10));
                for (PaymentChannel paymentChannelCopy$default : list2) {
                    Iterator<T> it = listS.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        PhonePrefixData phonePrefixData = (PhonePrefixData) next;
                        if (paymentChannelCopy$default.getPayChId() == phonePrefixData.getPayChannel() && phonePrefixData.getPrefix() != null) {
                            break;
                        }
                    }
                    PhonePrefixData phonePrefixData2 = (PhonePrefixData) next;
                    if (phonePrefixData2 != null) {
                        List<String> prefix = phonePrefixData2.getPrefix();
                        paymentChannelCopy$default = PaymentChannel.copy$default(paymentChannelCopy$default, 0, null, null, 0, null, prefix != null ? CollectionsKt.R(prefix) : m2g.a, false, false, false, 479, null);
                    }
                    arrayList.add(paymentChannelCopy$default);
                }
                cb8Var.e = arrayList;
                list = listS;
            }
            cb8Var.f = list;
        }
        return Unit.a;
    }
}
