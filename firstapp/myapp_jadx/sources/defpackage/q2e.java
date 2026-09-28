package defpackage;

import com.sporty.android.core.model.patron.UserPhone;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositMomoViewModel$userPhonesStateFlow$1", f = "DepositMomoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q2e extends tje0 implements Function2<lk50<? extends List<? extends UserPhone>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ r2e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2e(v1b v1bVar, r2e r2eVar) {
        super(2, v1bVar);
        this.b = r2eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        q2e q2eVar = new q2e(v1bVar, this.b);
        q2eVar.a = obj;
        return q2eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends UserPhone>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((q2e) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object next;
        String phone;
        UserPhone userPhone;
        r2e r2eVar = this.b;
        wwd0 wwd0Var = r2eVar.L0;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.c) {
            T t = ((lk50.c) lk50Var).a;
            Iterable iterable = (Iterable) t;
            Iterator it = iterable.iterator();
            do {
                obj2 = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                phone = ((UserPhone) next).getPhone();
                userPhone = (UserPhone) wwd0Var.getValue();
            } while (!Intrinsics.g(phone, userPhone != null ? userPhone.getPhone() : null));
            boolean z = next == null;
            if (!r2eVar.M0 || z) {
                for (Object obj3 : iterable) {
                    if (((UserPhone) obj3).isDefault()) {
                        obj2 = obj3;
                        break;
                    }
                }
                UserPhone userPhone2 = (UserPhone) obj2;
                if (userPhone2 == null) {
                    userPhone2 = (UserPhone) CollectionsKt.firstOrNull((List) t);
                }
                wwd0Var.setValue(userPhone2);
                r2eVar.M0 = true;
            }
        }
        return Unit.a;
    }
}
