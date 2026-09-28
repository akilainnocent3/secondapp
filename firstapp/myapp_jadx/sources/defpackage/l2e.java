package defpackage;

import com.sporty.android.core.model.patron.UserPhone;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositMomoViewModel$selectedPhoneStateFlow$1", f = "DepositMomoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l2e extends tje0 implements iaj<Boolean, UserPhone, lk50<? extends List<? extends UserPhone>>, v1b<? super UserPhone>, Object> {
    public /* synthetic */ boolean a;
    public /* synthetic */ UserPhone b;
    public /* synthetic */ lk50 c;

    @Override // defpackage.iaj
    public final Object d(Boolean bool, UserPhone userPhone, lk50<? extends List<? extends UserPhone>> lk50Var, v1b<? super UserPhone> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        l2e l2eVar = new l2e(4, v1bVar);
        l2eVar.a = zBooleanValue;
        l2eVar.b = userPhone;
        l2eVar.c = lk50Var;
        return l2eVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list;
        boolean z = this.a;
        UserPhone userPhone = this.b;
        lk50 lk50Var = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (z) {
            return userPhone;
        }
        Object obj2 = null;
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        if (cVar == null || (list = (List) cVar.a) == null) {
            return null;
        }
        for (Object obj3 : list) {
            if (((UserPhone) obj3).isPrimary()) {
                obj2 = obj3;
                break;
            }
        }
        return (UserPhone) obj2;
    }
}
