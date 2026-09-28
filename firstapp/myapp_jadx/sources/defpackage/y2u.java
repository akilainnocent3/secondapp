package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$5", f = "LoyaltyViewModel.kt", l = {602}, m = "invokeSuspend", v = 2)
public final class y2u extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ b3u b;
    public final /* synthetic */ mgb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2u(b3u b3uVar, mgb0 mgb0Var, v1b<? super y2u> v1bVar) {
        super(2, v1bVar);
        this.b = b3uVar;
        this.c = mgb0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new y2u(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
        return ((y2u) create(unit, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.b.E.a(new jgm.c(R.string.page_loyalty__popup_betslip_apply_success_toast, null, 2));
            this.a = 1;
            if (this.c.reloadAccountInfo(this) == y5bVar) {
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
