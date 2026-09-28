package defpackage;

import com.sporty.android.core.model.pocket.common.ChannelAsset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.usecase.GetPayMethodConfigUseCase$getKEPayMethodConfigFlow$1", f = "GetPayMethodConfigUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gak extends tje0 implements gaj<List<? extends a300>, sr00, v1b<? super z200>, Object> {
    public /* synthetic */ List a;
    public /* synthetic */ sr00 b;

    @Override // defpackage.gaj
    public final Object invoke(List<? extends a300> list, sr00 sr00Var, v1b<? super z200> v1bVar) {
        gak gakVar = new gak(3, v1bVar);
        gakVar.a = list;
        gakVar.b = sr00Var;
        return gakVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ChannelAsset.Channel channel;
        List list = this.a;
        sr00 sr00Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        sr00.c cVar = sr00Var instanceof sr00.c ? (sr00.c) sr00Var : null;
        if (cVar == null || (channel = cVar.a) == null) {
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
