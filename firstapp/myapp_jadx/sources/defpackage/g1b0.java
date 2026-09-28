package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spin2win.view.Spin2WinFragment$observeClickListeners$10$1", f = "Spin2WinFragment.kt", l = {809}, m = "invokeSuspend", v = 1)
public final class g1b0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ a1b0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1b0(a1b0 a1b0Var, v1b<? super g1b0> v1bVar) {
        super(2, v1bVar);
        this.b = a1b0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g1b0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g1b0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(1200L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        a1b0 a1b0Var = this.b;
        wxi wxiVar = a1b0Var.v;
        if (wxiVar != null) {
            wxiVar.H.setVisibility(0);
        }
        boolean z = a1b0Var.a0;
        wxi wxiVar2 = a1b0Var.v;
        if (z) {
            if (wxiVar2 != null) {
                wxiVar2.N.setVisibility(8);
            }
        } else if (wxiVar2 != null) {
            wxiVar2.N.setVisibility(0);
        }
        wxi wxiVar3 = a1b0Var.v;
        if (wxiVar3 != null) {
            wxiVar3.z.a(false);
        }
        a1b0Var.z0().x1();
        return Unit.a;
    }
}
