package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.payment.deposit.presentation.fragment.AddNewMobileNumberDialogFragment$initViewModel$1$4", f = "AddNewMobileNumberDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xj extends tje0 implements Function2<m480.h, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ pj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(pj pjVar, v1b<? super xj> v1bVar) {
        super(2, v1bVar);
        this.b = pjVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xj xjVar = new xj(this.b, v1bVar);
        xjVar.a = obj;
        return xjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(m480.h hVar, v1b<? super Unit> v1bVar) {
        return ((xj) create(hVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        m480.h hVar = (m480.h) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (hVar != null) {
            bc6 bc6Var = hVar.b;
            pj pjVar = this.b;
            pjVar.E = bc6Var;
            ee<f0i0> eeVar = pjVar.F;
            if (eeVar == null) {
                Intrinsics.n("depositMomoAddNewNumberOtpLauncher");
                throw null;
            }
            eeVar.b(hVar.a);
        }
        return Unit.a;
    }
}
