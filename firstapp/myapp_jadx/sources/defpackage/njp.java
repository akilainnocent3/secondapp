package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.pay.BountyAndTaxConfigs;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.kepay.deposit.KeOnlineDepositViewModel$entryDisplayOrderStateFlow$2$1", f = "KeOnlineDepositViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class njp extends tje0 implements gaj<BountyAndTaxConfigs, BigDecimal, v1b<? super List<? extends oag>>, Object> {
    public /* synthetic */ BountyAndTaxConfigs a;
    public /* synthetic */ BigDecimal b;
    public final /* synthetic */ pjp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njp(pjp pjpVar, v1b<? super njp> v1bVar) {
        super(3, v1bVar);
        this.c = pjpVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(BountyAndTaxConfigs bountyAndTaxConfigs, BigDecimal bigDecimal, v1b<? super List<? extends oag>> v1bVar) {
        njp njpVar = new njp(this.c, v1bVar);
        njpVar.a = bountyAndTaxConfigs;
        njpVar.b = bigDecimal;
        return njpVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        oag oagVar;
        BountyAndTaxConfigs bountyAndTaxConfigs = this.a;
        BigDecimal bigDecimal = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (bountyAndTaxConfigs == null) {
            return m2g.a;
        }
        List<String> entryDisplayOrders = bountyAndTaxConfigs.getEntryDisplayOrders();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entryDisplayOrders.iterator();
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            iag.c.getClass();
            str.getClass();
            for (Object obj3 : iag.e) {
                if (((iag) obj3).a.equalsIgnoreCase(str)) {
                    obj2 = obj3;
                    break;
                }
            }
            iag iagVar = (iag) obj2;
            if (iagVar != null) {
                arrayList.add(iagVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj4 = arrayList.get(i);
            i++;
            iag iagVar2 = (iag) obj4;
            int iOrdinal = iagVar2.ordinal();
            int i2 = iagVar2.b;
            pjp pjpVar = this.c;
            if (iOrdinal == 0) {
                StringUiText stringUiText = vch0.a;
                oagVar = new oag(pjpVar.Q1(bigDecimal, bountyAndTaxConfigs.getBountyRanges(), false), new ResourceUiText(i2), 1);
            } else if (iOrdinal == 1) {
                StringUiText stringUiText2 = vch0.a;
                ResourceUiText resourceUiText = new ResourceUiText(i2);
                String string = p54.b(new BigDecimal((bigDecimal.longValue() + pjpVar.u(bigDecimal, bountyAndTaxConfigs.getBountyRanges())) - pjpVar.u(bigDecimal, bountyAndTaxConfigs.getDepositTaxRanges()))).toString();
                string.getClass();
                oagVar = new oag(string, resourceUiText, 1);
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
                StringUiText stringUiText3 = vch0.a;
                oagVar = new oag(pjpVar.Q1(bigDecimal, bountyAndTaxConfigs.getDepositTaxRanges(), true), new ResourceUiText(i2), 1);
            }
            arrayList2.add(oagVar);
        }
        return arrayList2;
    }
}
