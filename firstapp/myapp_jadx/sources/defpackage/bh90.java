package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.nightnday.conponent.sidepanel.SidePanelViewModel$handleEvent$1", f = "SidePanelViewModel.kt", l = {105}, m = "invokeSuspend", v = 1)
public final class bh90 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ nh90 b;
    public final /* synthetic */ zax c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh90(nh90 nh90Var, zax zaxVar, v1b<? super bh90> v1bVar) {
        super(2, v1bVar);
        this.b = nh90Var;
        this.c = zaxVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bh90(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bh90) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            en20 en20Var = this.b.a;
            zax.a aVar = (zax.a) this.c;
            String str = aVar.a;
            boolean z = !aVar.b;
            this.a = 1;
            if (en20Var.a(str, z, this) == y5bVar) {
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
