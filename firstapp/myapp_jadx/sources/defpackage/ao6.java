package defpackage;

import com.sporty.android.core.model.cashout.CashOutInfo;
import com.sportybet.android.cashoutphase3.h;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.CashOutBet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$fetchDebugLiteApi$1", f = "CashOutViewModel.kt", l = {224}, m = "invokeSuspend", v = 2)
public final class ao6 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public h a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ h d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Bet f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao6(h hVar, String str, Bet bet, v1b<? super ao6> v1bVar) {
        super(2, v1bVar);
        this.d = hVar;
        this.e = str;
        this.f = bet;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ao6 ao6Var = new ao6(this.d, this.e, this.f, v1bVar);
        ao6Var.c = obj;
        return ao6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ao6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        h hVar;
        y5b y5bVar = y5b.a;
        int i = this.b;
        try {
            if (i == 0) {
                uj50.b(obj);
                h hVar2 = this.d;
                String str = this.e;
                Bet bet = this.f;
                zi50.a aVar = zi50.b;
                hVar2.n0.a(CashOutInfo.INSTANCE.createLoadingInfo(str));
                fr6 fr6Var = hVar2.i;
                CashOutBet cashOutLiteBet = bet.toCashOutLiteBet();
                cashOutLiteBet.getClass();
                this.c = null;
                this.a = hVar2;
                this.b = 1;
                Object objD = fr6Var.d(cashOutLiteBet, this);
                if (objD == y5bVar) {
                    return y5bVar;
                }
                obj = objD;
                hVar = hVar2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hVar = this.a;
                uj50.b(obj);
            }
            hVar.n0.a((CashOutInfo) obj);
            zi50.a aVar2 = zi50.b;
        } catch (Throwable unused) {
            zi50.a aVar3 = zi50.b;
        }
        return Unit.a;
    }
}
