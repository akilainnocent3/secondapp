package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.redblack.views.fragments.RedBlackFragment$showCampaignToast$1", f = "RedBlackFragment.kt", l = {2006}, m = "invokeSuspend", v = 1)
public final class yn40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ nn40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn40(nn40 nn40Var, v1b<? super yn40> v1bVar) {
        super(2, v1bVar);
        this.b = nn40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yn40(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yn40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(1800L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        nn40 nn40Var = this.b;
        if (nn40Var.getActivity() != null) {
            xo40 xo40Var = (xo40) nn40Var.b;
            if (xo40Var != null) {
                xo40Var.F.setVisibility(8);
            }
            xo40 xo40Var2 = (xo40) nn40Var.b;
            if (xo40Var2 != null) {
                xo40Var2.F.setClickable(false);
            }
        }
        return Unit.a;
    }
}
