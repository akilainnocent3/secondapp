package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.primaryphone.updatephonenumber.PrimaryPhoneUpdatePhoneNumberViewModel$emitNavigationEvent$1", f = "PrimaryPhoneUpdatePhoneNumberViewModel.kt", l = {224}, m = "invokeSuspend", v = 2)
public final class du20 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ cu20 b;
    public final /* synthetic */ mt20 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du20(cu20 cu20Var, mt20 mt20Var, v1b<? super du20> v1bVar) {
        super(2, v1bVar);
        this.b = cu20Var;
        this.c = mt20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new du20(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((du20) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            b390 b390Var = this.b.w;
            this.a = 1;
            if (b390Var.emit(this.c, this) == y5bVar) {
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
