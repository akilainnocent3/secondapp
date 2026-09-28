package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.payment.deposit.presentation.fragment.AddNewMobileNumberDialogFragment$initViewModel$1$3", f = "AddNewMobileNumberDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wj extends tje0 implements Function2<tzs, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ pj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(pj pjVar, v1b<? super wj> v1bVar) {
        super(2, v1bVar);
        this.b = pjVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wj wjVar = new wj(this.b, v1bVar);
        wjVar.a = obj;
        return wjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tzs tzsVar, v1b<? super Unit> v1bVar) {
        return ((wj) create(tzsVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        tzs tzsVar = (tzs) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zui zuiVar = this.b.y;
        if (zuiVar != null) {
            zuiVar.b.setLoading(Intrinsics.g(tzsVar, tzs.b.a));
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
