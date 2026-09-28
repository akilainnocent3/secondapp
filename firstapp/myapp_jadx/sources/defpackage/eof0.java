package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$waitingShowingResult$2", f = "TheGoldmineViewModel.kt", l = {531}, m = "invokeSuspend", v = 1)
public final class eof0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ aof0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eof0(aof0 aof0Var, v1b<? super eof0> v1bVar) {
        super(2, v1bVar);
        this.b = aof0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new eof0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((eof0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        aof0 aof0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            dm8 dm8VarA = em8.a();
            aof0Var.R = dm8VarA;
            this.a = 1;
            if (dm8VarA.q(this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        aof0Var.R = null;
        return Unit.a;
    }
}
