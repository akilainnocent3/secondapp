package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penaltysettlement.viewmodel.SportyPenaltySettlementViewModel$5", f = "SportyPenaltySettlementViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x3d0 extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
    public final /* synthetic */ d4d0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3d0(d4d0 d4d0Var, v1b<? super x3d0> v1bVar) {
        super(2, v1bVar);
        this.a = d4d0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new x3d0(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
        return ((x3d0) create(unit, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z;
        fqo fqoVar;
        h3d0 h3d0Var;
        qcn<q3d0> qcnVar;
        x1d0 x1d0Var;
        r2d0 r2d0Var;
        String str;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.a.y;
        do {
            value = wwd0Var.getValue();
            u3d0 u3d0Var = (u3d0) value;
            z = !u3d0Var.d;
            fqoVar = u3d0Var.a;
            h3d0Var = u3d0Var.b;
            qcnVar = u3d0Var.c;
            x1d0Var = u3d0Var.e;
            r2d0Var = u3d0Var.f;
            str = u3d0Var.g;
            qcnVar.getClass();
            r2d0Var.getClass();
        } while (!wwd0Var.g(value, new u3d0(fqoVar, h3d0Var, qcnVar, z, x1d0Var, r2d0Var, str)));
        return Unit.a;
    }
}
