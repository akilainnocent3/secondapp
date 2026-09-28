package defpackage;

import com.sporty.android.core.model.pocket.common.ChannelAsset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.usecase.GetPayMethodConfigUseCase$getZMPayMethodConfigFlow$1", f = "GetPayMethodConfigUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class iak extends tje0 implements gaj<List<? extends a300>, lk50<? extends ChannelAsset.Channel>, v1b<? super z200>, Object> {
    public /* synthetic */ List a;
    public /* synthetic */ lk50 b;

    @Override // defpackage.gaj
    public final Object invoke(List<? extends a300> list, lk50<? extends ChannelAsset.Channel> lk50Var, v1b<? super z200> v1bVar) {
        iak iakVar = new iak(3, v1bVar);
        iakVar.a = list;
        iakVar.b = lk50Var;
        return iakVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ChannelAsset.Channel channel;
        List list = this.a;
        lk50 lk50Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        if (cVar == null || (channel = (ChannelAsset.Channel) cVar.a) == null) {
            return new z200(list);
        }
        boolean zE = w3w.e(channel);
        boolean zIsSupportPayBill = channel.isSupportPayBill();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            a300 a300Var = (a300) obj2;
            if (zIsSupportPayBill || !(a300Var instanceof a300.i)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            a300 a300Var2 = (a300) obj3;
            if (zE || !(a300Var2 instanceof a300.f)) {
                arrayList2.add(obj3);
            }
        }
        return new z200(arrayList2, m2g.a, null);
    }
}
