package defpackage;

import com.sportybet.android.cashoutphase3.h;
import com.sportybet.model.cashOut.STVPlayerDataSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$fetchLiveStreamData$1", f = "CashOutViewModel.kt", l = {1094}, m = "invokeSuspend", v = 2)
public final class do6 extends tje0 implements Function2<STVPlayerDataSource, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do6(h hVar, int i, v1b<? super do6> v1bVar) {
        super(2, v1bVar);
        this.c = hVar;
        this.d = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        do6 do6Var = new do6(this.c, this.d, v1bVar);
        do6Var.b = obj;
        return do6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(STVPlayerDataSource sTVPlayerDataSource, v1b<? super Unit> v1bVar) {
        return ((do6) create(sTVPlayerDataSource, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        STVPlayerDataSource sTVPlayerDataSource = (STVPlayerDataSource) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ku90<qp10> ku90Var = this.c.X;
            qp10 qp10Var = new qp10(sTVPlayerDataSource, this.d);
            this.b = null;
            this.a = 1;
            if (ku90Var.a.emit(qp10Var, this) == y5bVar) {
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
