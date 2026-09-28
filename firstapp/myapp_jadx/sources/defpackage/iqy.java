package defpackage;

import com.sportybet.android.data.OneCutAmountData;
import com.sportybet.plugin.realsports.data.BetSlipInfo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.OneCutViewModel$performAsyncOperationWithSeekBar$1", f = "OneCutViewModel.kt", l = {79}, m = "invokeSuspend", v = 2)
public final class iqy extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jqy c;
    public final /* synthetic */ BigDecimal d;
    public final /* synthetic */ BigDecimal e;
    public final /* synthetic */ BetSlipInfo f;
    public final /* synthetic */ BigDecimal i;
    public final /* synthetic */ BigDecimal v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqy(jqy jqyVar, BigDecimal bigDecimal, BigDecimal bigDecimal2, BetSlipInfo betSlipInfo, BigDecimal bigDecimal3, BigDecimal bigDecimal4, v1b<? super iqy> v1bVar) {
        super(2, v1bVar);
        this.c = jqyVar;
        this.d = bigDecimal;
        this.e = bigDecimal2;
        this.f = betSlipInfo;
        this.i = bigDecimal3;
        this.v = bigDecimal4;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        iqy iqyVar = new iqy(this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
        iqyVar.b = obj;
        return iqyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((iqy) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        OneCutAmountData oneCutAmountData;
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            mpe0 mpe0Var = ypy.a;
            BetSlipInfo betSlipInfo = this.f;
            BigDecimal noRoundingTotalOdds = betSlipInfo.getNoRoundingTotalOdds();
            noRoundingTotalOdds.getClass();
            BigDecimal stake = betSlipInfo.getStake();
            stake.getClass();
            BigDecimal bigDecimal = this.e;
            bigDecimal.getClass();
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            BigDecimal scale = bigDecimal.setScale(8, roundingMode);
            BigDecimal scale2 = noRoundingTotalOdds.setScale(8, roundingMode);
            scale2.getClass();
            BigDecimal bigDecimalA = ypy.a(scale2, this.d, stake);
            if (bigDecimalA.compareTo(BigDecimal.ONE) < 0) {
                oneCutAmountData = new OneCutAmountData(null, null, null, 7, null);
            } else {
                BigDecimal bigDecimalMultiply = stake.multiply(this.v);
                BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(scale).setScale(2, roundingMode).multiply(ypy.b());
                BigDecimal bigDecimalAdd = stake.subtract(bigDecimalMultiply).multiply(bigDecimalA).setScale(2, RoundingMode.DOWN).multiply(ypy.b()).add(bigDecimalMultiply.multiply(scale).setScale(2, roundingMode).multiply(ypy.b()));
                bigDecimalAdd.getClass();
                BigDecimal bigDecimal2 = this.i;
                BigDecimal bigDecimalC = ypy.c(bigDecimalAdd, bigDecimal2);
                bigDecimalMultiply2.getClass();
                oneCutAmountData = new OneCutAmountData(bigDecimalC, ypy.c(bigDecimalMultiply2, bigDecimal2), bigDecimalAdd);
            }
            i9p.e(v5bVar.getCoroutineContext());
            b390 b390Var = this.c.a;
            this.b = null;
            this.a = 1;
            if (b390Var.emit(oneCutAmountData, this) == y5bVar) {
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
