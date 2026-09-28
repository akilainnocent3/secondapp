package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.patron.KYCReminder;
import com.sportybet.model.KYCReminderState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.ozow.withdraw.EFTWithdrawViewModel$initKYCReminder$1", f = "EFTWithdrawViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kif extends tje0 implements Function2<lk50<? extends KYCReminder>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ sif b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kif(sif sifVar, v1b<? super kif> v1bVar) {
        super(2, v1bVar);
        this.b = sifVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kif kifVar = new kif(this.b, v1bVar);
        kifVar.a = obj;
        return kifVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends KYCReminder> lk50Var, v1b<? super Unit> v1bVar) {
        return ((kif) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        KYCReminderState success;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.c1;
        if (lk50Var instanceof lk50.c) {
            success = new KYCReminderState.Success((KYCReminder) ((lk50.c) lk50Var).a);
        } else if (lk50Var instanceof lk50.a) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_KYC_REMINDER);
            aVar.a(a320.a("Get KYC Reminder Error: ", ((lk50.a) lk50Var).a), new Object[0]);
            success = KYCReminderState.Failure.INSTANCE;
        } else {
            if (!Intrinsics.g(lk50Var, lk50.b.a)) {
                uhc.a();
                return null;
            }
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_KYC_REMINDER);
            aVar2.a("Get KYC Reminder Loading..", new Object[0]);
            success = KYCReminderState.Loading.INSTANCE;
        }
        wwd0Var.setValue(success);
        return Unit.a;
    }
}
