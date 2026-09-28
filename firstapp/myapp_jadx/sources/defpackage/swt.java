package defpackage;

import com.sportybet.feature.loyalty.impl.notifications.presentation.mission.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.notifications.presentation.mission.LoyaltyMissionBottomSheetViewModel$createInvitationUiState$result$1", f = "LoyaltyMissionBottomSheetViewModel.kt", l = {298}, m = "invokeSuspend", v = 2)
public final class swt extends tje0 implements Function2<v5b, v1b<? super lk50<? extends osv>>, Object> {
    public int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swt(e eVar, int i, v1b<? super swt> v1bVar) {
        super(2, v1bVar);
        this.b = eVar;
        this.c = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new swt(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super lk50<? extends osv>> v1bVar) {
        return ((swt) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        c8k c8kVar = this.b.f;
        this.a = 1;
        Object objA = c8kVar.a.a(this.c, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
