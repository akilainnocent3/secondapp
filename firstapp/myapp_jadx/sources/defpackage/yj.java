package defpackage;

import android.os.Bundle;
import com.sportybet.feature.payment.api.model.BindNewPhoneResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.payment.deposit.presentation.fragment.AddNewMobileNumberDialogFragment$initViewModel$1$5", f = "AddNewMobileNumberDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yj extends tje0 implements Function2<BindNewPhoneResult, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ pj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(pj pjVar, v1b<? super yj> v1bVar) {
        super(2, v1bVar);
        this.b = pjVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yj yjVar = new yj(this.b, v1bVar);
        yjVar.a = obj;
        return yjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BindNewPhoneResult bindNewPhoneResult, v1b<? super Unit> v1bVar) {
        return ((yj) create(bindNewPhoneResult, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BindNewPhoneResult bindNewPhoneResult = (BindNewPhoneResult) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Bundle bundleA = vj5.a(new Pair("RESULT_KEY_ADD_NEW_MOBILE_NUMBER", bindNewPhoneResult));
        pj pjVar = this.b;
        pjVar.getParentFragmentManager().m0("REQUEST_KEY_ADD_NEW_MOBILE_NUMBER", bundleA);
        pjVar.dismissAllowingStateLoss();
        return Unit.a;
    }
}
