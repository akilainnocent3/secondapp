package defpackage;

import com.sporty.android.core.model.account.MyFavoriteStake;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.GetMyFavoriteStakeUseCase$invoke$2", f = "GetMyFavoriteStakeUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j9k extends tje0 implements iaj<Boolean, List<BigDecimal>, MyFavoriteStake, v1b<? super cvq>, Object> {
    public /* synthetic */ boolean a;
    public /* synthetic */ List b;
    public /* synthetic */ MyFavoriteStake c;
    public final /* synthetic */ m9k d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9k(m9k m9kVar, v1b<? super j9k> v1bVar) {
        super(4, v1bVar);
        this.d = m9kVar;
    }

    @Override // defpackage.iaj
    public final Object d(Boolean bool, List<BigDecimal> list, MyFavoriteStake myFavoriteStake, v1b<? super cvq> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        j9k j9kVar = new j9k(this.d, v1bVar);
        j9kVar.a = zBooleanValue;
        j9kVar.b = list;
        j9kVar.c = myFavoriteStake;
        return j9kVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BigDecimal bigDecimalValueOf;
        Object bVar;
        BigDecimal bigDecimalC;
        BigDecimal bigDecimalC2;
        Double quickAddStake3;
        Double quickAddStake2;
        Double quickAddStake1;
        boolean z = this.a;
        List list = this.b;
        MyFavoriteStake myFavoriteStake = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        m9k m9kVar = this.d;
        list.getClass();
        BigDecimal bigDecimalC3 = null;
        MyFavoriteStake myFavoriteStake2 = z ? myFavoriteStake : null;
        Double defaultStake = myFavoriteStake != null ? myFavoriteStake.getDefaultStake() : null;
        if (defaultStake == null || (bigDecimalValueOf = BigDecimal.valueOf(defaultStake.doubleValue()).divide(BigDecimal.valueOf(10000L))) == null) {
            bigDecimalValueOf = BigDecimal.valueOf(-1L);
        }
        if (bigDecimalValueOf.compareTo(BigDecimal.ZERO) < 0) {
            try {
                zi50.a aVar = zi50.b;
                String strJ = m9kVar.a.j();
                strJ.getClass();
                bVar = new BigDecimal(strJ);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            bigDecimalValueOf = (BigDecimal) bVar;
            if (bigDecimalValueOf == null) {
                bigDecimalValueOf = BigDecimal.ZERO;
            }
        }
        bigDecimalValueOf.getClass();
        rkd0.a aVar3 = rkd0.Companion;
        if (myFavoriteStake2 == null || (quickAddStake1 = myFavoriteStake2.getQuickAddStake1()) == null) {
            bigDecimalC = (BigDecimal) CollectionsKt.V(0, list);
            if (bigDecimalC == null) {
                bigDecimalC = null;
            }
        } else {
            bigDecimalC = m9k.c(quickAddStake1.doubleValue());
        }
        if (myFavoriteStake2 == null || (quickAddStake2 = myFavoriteStake2.getQuickAddStake2()) == null) {
            bigDecimalC2 = (BigDecimal) CollectionsKt.V(1, list);
            if (bigDecimalC2 == null) {
                bigDecimalC2 = null;
            }
        } else {
            bigDecimalC2 = m9k.c(quickAddStake2.doubleValue());
        }
        if (myFavoriteStake2 == null || (quickAddStake3 = myFavoriteStake2.getQuickAddStake3()) == null) {
            BigDecimal bigDecimal = (BigDecimal) CollectionsKt.V(2, list);
            if (bigDecimal != null) {
                bigDecimalC3 = bigDecimal;
            }
        } else {
            bigDecimalC3 = m9k.c(quickAddStake3.doubleValue());
        }
        return new cvq(bigDecimalValueOf, bigDecimalC, bigDecimalC2, bigDecimalC3);
    }
}
