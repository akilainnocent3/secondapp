package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;
import com.sporty.android.core.model.pocket.common.ChannelAsset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.usecase.GetPayMethodConfigUseCase$getTZPayMethodConfigFlow$1", f = "GetPayMethodConfigUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hak extends tje0 implements iaj<List<? extends a300>, AssetData, sr00, v1b<? super z200>, Object> {
    public /* synthetic */ List a;
    public /* synthetic */ AssetData b;
    public /* synthetic */ sr00 c;

    @Override // defpackage.iaj
    public final Object d(List<? extends a300> list, AssetData assetData, sr00 sr00Var, v1b<? super z200> v1bVar) {
        hak hakVar = new hak(4, v1bVar);
        hakVar.a = list;
        hakVar.b = assetData;
        hakVar.c = sr00Var;
        return hakVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String strB;
        List list = this.a;
        AssetData assetData = this.b;
        sr00 sr00Var = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        sr00.c cVar = sr00Var instanceof sr00.c ? (sr00.c) sr00Var : null;
        ChannelAsset.Channel channel = cVar != null ? cVar.a : null;
        List<AssetData.MobileBean> mobileMoneys = assetData.getMobileMoneys();
        boolean z = true;
        if (mobileMoneys == null || !(!mobileMoneys.isEmpty())) {
            mobileMoneys = null;
        }
        if (mobileMoneys == null) {
            return new z200(list);
        }
        int i = 0;
        boolean zE = channel != null ? w3w.e(channel) : false;
        AssetData.MobileBean mobileBean = (AssetData.MobileBean) CollectionsKt.T(mobileMoneys);
        uag uagVar = jah0.b.i;
        ArrayList arrayList = new ArrayList(l48.r(uagVar, 10));
        q3.b bVar = new q3.b();
        while (bVar.hasNext()) {
            arrayList.add(((jah0.b) bVar.next()).a);
        }
        String channel2 = mobileBean.getChannel();
        if (channel2 != null && (strB = w3w.b(channel2)) != null) {
            ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                String lowerCase = ((String) obj2).toLowerCase(hj10.a.a().b().a);
                lowerCase.getClass();
                arrayList2.add(lowerCase);
            }
            if (arrayList2.isEmpty()) {
                z = false;
                break;
            }
            int size2 = arrayList2.size();
            int i3 = 0;
            while (true) {
                if (i3 < size2) {
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    if (StringsKt.M((String) obj3, strB, false)) {
                        if (!(channel != null ? channel.isSupportPayBill() : false)) {
                            break;
                        }
                        break;
                    }
                }
                z = false;
                break;
            }
        } else {
            z = false;
            break;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : list) {
            a300 a300Var = (a300) obj4;
            if (z || !(a300Var instanceof a300.i)) {
                arrayList3.add(obj4);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList3.size();
        while (i < size3) {
            Object obj5 = arrayList3.get(i);
            i++;
            a300 a300Var2 = (a300) obj5;
            if (zE || !(a300Var2 instanceof a300.f)) {
                arrayList4.add(obj5);
            }
        }
        return new z200(arrayList4, m2g.a, null);
    }
}
