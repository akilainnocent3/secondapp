package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.customCode.assign.viewmodel.AssignedCustomCodeViewModel$onViewMySportySocialClicked$1", f = "AssignedCustomCodeViewModel.kt", l = {33}, m = "invokeSuspend", v = 2)
public final class nz0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ oz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz0(oz0 oz0Var, v1b<? super nz0> v1bVar) {
        super(2, v1bVar);
        this.b = oz0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nz0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nz0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            oz0 oz0Var = this.b;
            b390 b390Var = oz0Var.c;
            uqm uqmVar = oz0Var.e;
            String lastNickName = uqmVar.getLastNickName();
            if (lastNickName == null) {
                lastNickName = "";
            }
            qz0.b bVar = new qz0.b(lastNickName, uqmVar.getNickNameVerified());
            this.a = 1;
            if (b390Var.emit(bVar, this) == y5bVar) {
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
