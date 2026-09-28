package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.primaryphone.newphoneverification.PrimaryPhoneNewPhoneVerificationViewModel$launchOTPEvent$1", f = "PrimaryPhoneNewPhoneVerificationViewModel.kt", l = {43}, m = "invokeSuspend", v = 2)
public final class ps20 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ qs20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps20(qs20 qs20Var, v1b<? super ps20> v1bVar) {
        super(2, v1bVar);
        this.b = qs20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ps20(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ps20) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            b390 b390Var = this.b.c;
            Boolean bool = Boolean.TRUE;
            this.a = 1;
            if (b390Var.emit(bool, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
