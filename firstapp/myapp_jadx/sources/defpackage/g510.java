package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.pingpong.views.PingPongFragment$onboardingDoneSetup$1", f = "PingPongFragment.kt", l = {6706}, m = "invokeSuspend", v = 1)
public final class g510 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ m410 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g510(m410 m410Var, boolean z, boolean z2, v1b<? super g510> v1bVar) {
        super(2, v1bVar);
        this.b = m410Var;
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g510(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g510) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        m410 m410Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            ixi ixiVar = (ixi) m410Var.b;
            if (ixiVar != null) {
                ixiVar.V.setVisibility(0);
            }
            ixi ixiVar2 = (ixi) m410Var.b;
            if (ixiVar2 != null) {
                ixiVar2.d.setVisibility(0);
            }
            ixi ixiVar3 = (ixi) m410Var.b;
            if (ixiVar3 != null) {
                ixiVar3.S.setVisibility(0);
            }
            if (this.c) {
                if (this.d) {
                    this.a = 1;
                    if (hkd.b(1800L, this) == y5bVar) {
                        return y5bVar;
                    }
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        m410Var.Q0().x1();
        return Unit.a;
    }
}
