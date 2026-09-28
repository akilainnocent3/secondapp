package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.BetslipCustomizationStateHandler$section$$inlined$flatMapLatest$1", f = "BetslipCustomizationStateHandler.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class ho3 extends tje0 implements gaj<myh<? super do3.a>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ do3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho3(do3 do3Var, v1b v1bVar) {
        super(3, v1bVar);
        this.d = do3Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super do3.a> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        ho3 ho3Var = new ho3(this.d, v1bVar);
        ho3Var.b = myhVar;
        ho3Var.c = bool;
        return ho3Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            boolean zBooleanValue = ((Boolean) this.c).booleanValue();
            do3 do3Var = this.d;
            lyh lyhVarC = zBooleanValue ? ozh.c(new or60(new ko3(do3Var, null)), do3Var.c) : new lo3(do3Var.h);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, lyhVarC, this) == y5bVar) {
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
