package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.cmaccount.registration.updatephonenumber.CMUpdatePhoneNumberViewModel$observePhoneValidationErrorShown$3", f = "CMUpdatePhoneNumberViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mq5 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public final /* synthetic */ oq5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq5(oq5 oq5Var, v1b<? super mq5> v1bVar) {
        super(2, v1bVar);
        this.a = oq5Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mq5(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((mq5) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.i.a(ts40.o0.a, k00.d);
        return Unit.a;
    }
}
