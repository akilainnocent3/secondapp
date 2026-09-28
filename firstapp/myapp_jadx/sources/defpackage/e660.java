package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.rush.view.RushFragment$showCampaignToast$1", f = "RushFragment.kt", l = {4332}, m = "invokeSuspend", v = 1)
public final class e660 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ l560 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e660(l560 l560Var, v1b<? super e660> v1bVar) {
        super(2, v1bVar);
        this.b = l560Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e660(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e660) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        l560 l560Var = this.b;
        if (l560Var.getActivity() != null) {
            eo80 eo80Var = l560Var.l0;
            if (eo80Var != null) {
                eo80Var.U.setVisibility(8);
            }
            eo80 eo80Var2 = l560Var.l0;
            if (eo80Var2 != null) {
                eo80Var2.U.setClickable(false);
            }
        }
        return Unit.a;
    }
}
