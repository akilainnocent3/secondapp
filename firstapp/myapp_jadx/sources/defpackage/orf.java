package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.playtimecontrol.confirmation.viewmodel.EditPlayTimeConfirmationViewModel$onForceLogout$1", f = "EditPlayTimeConfirmationViewModel.kt", l = {154}, m = "invokeSuspend", v = 2)
public final class orf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mrf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public orf(mrf mrfVar, v1b<? super orf> v1bVar) {
        super(2, v1bVar);
        this.b = mrfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new orf(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((orf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            mrf mrfVar = this.b;
            mrfVar.w.logout();
            b390 b390Var = mrfVar.c;
            grf.a aVar = grf.a.a;
            this.a = 1;
            if (b390Var.emit(aVar, this) == y5bVar) {
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
