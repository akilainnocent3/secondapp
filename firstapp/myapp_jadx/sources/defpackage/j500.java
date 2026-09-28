package defpackage;

import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import com.sporty.android.core.model.EligibleActivity;
import com.sporty.android.core.model.PaydayPromoModalVariantDomain;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lj500;", "Lj8i0;", "gift"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class j500 extends j8i0 {
    public static final long f;
    public static final long i;
    public final t400 a;
    public final wwd0 b;
    public final ku90<h500> c;
    public final EligibleActivity.PaydayGift d;
    public boolean e;

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.gift.payday.presentation.PaydayGiftViewModel$emitSideEffect$1", f = "PaydayGiftViewModel.kt", l = {97}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ h500 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h500 h500Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = h500Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return j500.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ku90<h500> ku90Var = j500.this.c;
                this.a = 1;
                if (ku90Var.a.emit(this.c, this) == y5bVar) {
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

    static {
        b.a aVar = b.b;
        rgf rgfVar = rgf.MILLISECONDS;
        f = c.i(1000L, rgfVar);
        i = c.i(100L, rgfVar);
    }

    public final void x1(h500 h500Var) {
        ej5.c(o8i0.d(this), null, null, new a(h500Var, null), 3);
    }

    public j500(vu60 vu60Var, t400 t400Var) {
        Object value;
        String depositCurrency;
        String rewardCurrency;
        long rewardAmount;
        Locale locale;
        vu60Var.getClass();
        this.a = t400Var;
        wwd0 wwd0VarA = xwd0.a(new i500(0));
        this.b = wwd0VarA;
        this.c = new ku90<>();
        Object objB = vu60Var.b("payday_gift_domain_model");
        if (objB != null) {
            EligibleActivity.PaydayGift paydayGift = (EligibleActivity.PaydayGift) objB;
            this.d = paydayGift;
            PaydayPromoModalVariantDomain variant = paydayGift.getVariant();
            variant.getClass();
            t400Var.a.a(LhMGMAwwhzjwfz.cumovOLDSymz);
            t400Var.b.a(new p500.d(variant.getValue()), k00.d);
            ej5.c(o8i0.d(this), null, null, new l500(paydayGift.getEndTime(), this, null), 3);
            do {
                value = wwd0VarA.getValue();
                depositCurrency = paydayGift.getDepositCurrency();
                rewardCurrency = paydayGift.getRewardCurrency();
                rewardAmount = paydayGift.getRewardAmount();
                locale = Locale.US;
            } while (!wwd0VarA.g(value, i500.a((i500) value, null, depositCurrency, rewardCurrency, bjb0.U(rewardAmount, locale), bjb0.U(paydayGift.getMinDepositAmount(), locale), paydayGift.getVariant(), 1)));
            return;
        }
        hb5.a("Required value was null.");
        throw null;
    }
}
