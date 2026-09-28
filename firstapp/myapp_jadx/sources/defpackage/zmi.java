package defpackage;

import com.sporty.android.core.model.loyalty.RewardShareImageData;
import com.sporty.android.core.model.loyalty.RewardShowOffConfig;
import com.sporty.android.core.model.loyalty.RewardShowOffData;
import com.sporty.android.core.model.loyalty.RewardShowOffDataKt;
import com.sporty.android.core.model.service.CountryCodeName;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.FootballViewModel$3$1", f = "FootballViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zmi extends tje0 implements gaj<Pair<? extends kp7, ? extends Long>, RewardShowOffConfig, v1b<? super Pair<? extends kp7, ? extends RewardShowOffData>>, Object> {
    public /* synthetic */ Pair a;
    public /* synthetic */ RewardShowOffConfig b;
    public final /* synthetic */ dni c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmi(v1b v1bVar, dni dniVar) {
        super(3, v1bVar);
        this.c = dniVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(Pair<? extends kp7, ? extends Long> pair, RewardShowOffConfig rewardShowOffConfig, v1b<? super Pair<? extends kp7, ? extends RewardShowOffData>> v1bVar) {
        zmi zmiVar = new zmi(v1bVar, this.c);
        zmiVar.a = pair;
        zmiVar.b = rewardShowOffConfig;
        return zmiVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Pair pair = this.a;
        RewardShowOffConfig rewardShowOffConfig = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        kp7 kp7Var = (kp7) pair.a;
        long jLongValue = ((Number) pair.b).longValue();
        dni dniVar = this.c;
        String str = (String) dniVar.M.getValue();
        String currency = rewardShowOffConfig.getCurrency();
        psm psmVar = dniVar.b;
        CountryCodeName countryCode = psmVar.getCountryCode();
        CountryCodeName countryCode2 = psmVar.getCountryCode();
        CountryCodeName countryCodeName = CountryCodeName.BRAZIL;
        if (countryCode2 == countryCodeName) {
            countryCode = countryCodeName;
        }
        return new Pair(kp7Var, RewardShowOffDataKt.toRewardShowOffData(rewardShowOffConfig, dniVar.B.c, jLongValue, str, tug.a("window.shareLoyaltyReward.drawSharePic('", dniVar.d.toJson(new RewardShareImageData(bjb0.L(new BigDecimal(jLongValue).divide(new BigDecimal(10000)), Locale.US), currency, countryCode.getCode())), "');")));
    }
}
