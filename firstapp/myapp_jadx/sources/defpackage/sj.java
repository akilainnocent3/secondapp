package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.payment.deposit.presentation.fragment.AddNewMobileNumberDialogFragment$initView$1$4", f = "AddNewMobileNumberDialogFragment.kt", l = {240}, m = "invokeSuspend", v = 2)
public final class sj extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ pj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj(pj pjVar, v1b<? super sj> v1bVar) {
        super(2, v1bVar);
        this.b = pjVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sj(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((sj) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(300L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        zui zuiVar = this.b.y;
        if (zuiVar != null) {
            zuiVar.v.scrollTo(0, zuiVar.d.getBottom());
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
