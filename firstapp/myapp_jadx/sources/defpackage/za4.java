package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.biometric.presentation.verification.BioAuthVerificationViewModel$onAuthSucceeded$2", f = "BioAuthVerificationViewModel.kt", l = {50}, m = "invokeSuspend", v = 2)
public final class za4 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ cb4 b;
    public final /* synthetic */ qd4.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za4(cb4 cb4Var, qd4.c cVar, v1b<? super za4> v1bVar) {
        super(2, v1bVar);
        this.b = cb4Var;
        this.c = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new za4(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((za4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            cb4 cb4Var = this.b;
            String phoneNumber = cb4Var.b.getPhoneNumber();
            phoneNumber.getClass();
            String str = cb4Var.c;
            this.a = 1;
            if (cb4Var.x1(phoneNumber, str, this.c, this) == y5bVar) {
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
