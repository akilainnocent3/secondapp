package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.data.OneCutAmountData;
import com.sportybet.plugin.realsports.data.BetSlipInfo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.OneCutViewModel$performAsyncOperation$1", f = "OneCutViewModel.kt", l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class hqy extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jqy c;
    public final /* synthetic */ BigDecimal d;
    public final /* synthetic */ BigDecimal e;
    public final /* synthetic */ BetSlipInfo f;
    public final /* synthetic */ BigDecimal i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqy(jqy jqyVar, BigDecimal bigDecimal, BigDecimal bigDecimal2, BetSlipInfo betSlipInfo, BigDecimal bigDecimal3, v1b<? super hqy> v1bVar) {
        super(2, v1bVar);
        this.c = jqyVar;
        this.d = bigDecimal;
        this.e = bigDecimal2;
        this.f = betSlipInfo;
        this.i = bigDecimal3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hqy hqyVar = new hqy(this.c, this.d, this.e, this.f, this.i, v1bVar);
        hqyVar.b = obj;
        return hqyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hqy) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
            BigDecimal bigDecimal2 = this.d;
            BigDecimal bigDecimalA = ypy.a(scale2, bigDecimal2, stake);
            if (bigDecimalA.compareTo(BigDecimal.ONE) < 0) {
                oneCutAmountData = new OneCutAmountData(null, null, null, 7, null);
            } else {
                scale.getClass();
                BigDecimal bigDecimalSubtract = scale.subtract(new BigDecimal("1"));
                bigDecimalSubtract.getClass();
                BigDecimal bigDecimalAdd = ypy.a(scale2, bigDecimal2, stake).add(scale);
                bigDecimalAdd.getClass();
                BigDecimal bigDecimalSubtract2 = bigDecimalAdd.subtract(new BigDecimal("2"));
                bigDecimalSubtract2.getClass();
                BigDecimal bigDecimalMultiply = bigDecimalSubtract.divide(bigDecimalSubtract2, 8, roundingMode).multiply(stake);
                bigDecimalMultiply.getClass();
                BigDecimal bigDecimalDivide = BigDecimal.ZERO;
                if (scale.compareTo(bigDecimalDivide) <= 0) {
                    bigDecimalDivide.getClass();
                } else {
                    bigDecimalDivide = stake.divide(scale, 8, roundingMode);
                    bigDecimalDivide.getClass();
                }
                BigDecimal bigDecimalMax = bigDecimalMultiply.max(bigDecimalDivide);
                bigDecimalMax.getClass();
                BigDecimal bigDecimalMultiply2 = bigDecimalMax.multiply(scale).setScale(2, roundingMode).multiply(ypy.b());
                BigDecimal bigDecimalAdd2 = stake.subtract(bigDecimalMax).multiply(bigDecimalA).setScale(2, RoundingMode.DOWN).multiply(ypy.b()).add(bigDecimalMultiply2);
                bigDecimalAdd2.getClass();
                BigDecimal bigDecimal3 = this.i;
                BigDecimal bigDecimalC = ypy.c(bigDecimalAdd2, bigDecimal3);
                bigDecimalMultiply2.getClass();
                oneCutAmountData = new OneCutAmountData(bigDecimalC, ypy.c(bigDecimalMultiply2, bigDecimal3), bigDecimalAdd2);
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
