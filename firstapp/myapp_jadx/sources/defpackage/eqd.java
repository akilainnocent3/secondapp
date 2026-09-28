package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositBankTransferOneTimeAccountViewModel$switchPaymentItemStateListFlow$1", f = "DepositBankTransferOneTimeAccountViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class eqd extends tje0 implements gaj<List<? extends jw1>, jw1, v1b<? super List<? extends aoe0.a>>, Object> {
    public /* synthetic */ List a;
    public /* synthetic */ jw1 b;

    @Override // defpackage.gaj
    public final Object invoke(List<? extends jw1> list, jw1 jw1Var, v1b<? super List<? extends aoe0.a>> v1bVar) {
        eqd eqdVar = new eqd(3, v1bVar);
        eqdVar.a = list;
        eqdVar.b = jw1Var;
        return eqdVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list = this.a;
        jw1 jw1Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(coe0.a((jw1) it.next(), jw1Var != null ? new Integer(jw1Var.a) : null));
        }
        return arrayList;
    }
}
