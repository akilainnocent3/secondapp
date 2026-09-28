package defpackage;

import com.sporty.android.core.model.loyalty.LoyaltyAggregateHintData;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.home.GetUnreadUseCase$getAnyUnread$1", f = "GetUnreadUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ggk extends tje0 implements gaj<Boolean, String, v1b<? super Boolean>, Object> {
    public /* synthetic */ boolean a;
    public /* synthetic */ String b;
    public final /* synthetic */ jgk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggk(jgk jgkVar, v1b<? super ggk> v1bVar) {
        super(3, v1bVar);
        this.c = jgkVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(Boolean bool, String str, v1b<? super Boolean> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        ggk ggkVar = new ggk(this.c, v1bVar);
        ggkVar.a = zBooleanValue;
        ggkVar.b = str;
        return ggkVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        boolean z = this.a;
        String str = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        jgk jgkVar = this.c;
        try {
            zi50.a aVar = zi50.b;
            LoyaltyAggregateHintData loyaltyAggregateHintData = (LoyaltyAggregateHintData) jgkVar.e.fromJson(str, LoyaltyAggregateHintData.class);
            bVar = Boolean.valueOf(loyaltyAggregateHintData.getAvailableMissionCount() + loyaltyAggregateHintData.getAvailableProgramRewardCount() > 0);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Object obj2 = Boolean.FALSE;
        if (bVar instanceof zi50.b) {
            bVar = obj2;
        }
        return Boolean.valueOf(z || ((Boolean) bVar).booleanValue());
    }
}
