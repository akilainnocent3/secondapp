package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$claimDailyReward$2", f = "LoyaltyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k3u extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ b3u b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3u(b3u b3uVar, String str, v1b<? super k3u> v1bVar) {
        super(2, v1bVar);
        this.b = b3uVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        k3u k3uVar = new k3u(this.b, this.c, v1bVar);
        k3uVar.a = obj;
        return k3uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
        return ((k3u) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        b3u b3uVar = this.b;
        wwd0 wwd0Var = b3uVar.H;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.c) {
            wwd0Var.getClass();
            wwd0Var.k(null, "");
            b3uVar.D1();
            ku90<jgm> ku90Var = b3uVar.E;
            ku90Var.a.a(new jgm.c(R.string.page_loyalty__daily_game_reward_claimed, null, 6));
        } else if (lk50Var instanceof lk50.a) {
            wwd0Var.getClass();
            wwd0Var.k(null, "");
            wwd0 wwd0Var2 = b3uVar.Z;
            StringUiText stringUiText = vch0.a;
            kst.c cVar = new kst.c(new StringUiText(""), ((lk50.a) lk50Var).b);
            wwd0Var2.getClass();
            wwd0Var2.k(null, cVar);
        } else {
            if (!Intrinsics.g(lk50Var, lk50.b.a)) {
                uhc.a();
                return null;
            }
            wwd0Var.setValue(this.c);
            Unit unit = Unit.a;
        }
        return Unit.a;
    }
}
