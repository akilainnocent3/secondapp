package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.edit.viewmodel.EditSportsLimitsViewModel$onResetForm$1", f = "EditSportsLimitsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wsf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ zsf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wsf(zsf zsfVar, v1b<? super wsf> v1bVar) {
        super(2, v1bVar);
        this.a = zsfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wsf(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wsf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zsf zsfVar = this.a;
        wfb0 wfb0Var = zsfVar.D;
        if (wfb0Var == null) {
            Intrinsics.n("originalInfo");
            throw null;
        }
        pmn pmnVar = wfb0Var.a;
        pmn pmnVar2 = wfb0Var.b;
        pmn pmnVar3 = wfb0Var.c;
        qcn<UiText> qcnVar = wfb0Var.d;
        qcnVar.getClass();
        wfb0 wfb0Var2 = new wfb0(pmnVar, pmnVar2, pmnVar3, qcnVar);
        zsfVar.E = wfb0Var2;
        zsfVar.L = pmnVar.b;
        zsfVar.M = pmnVar2.b;
        zsfVar.N = pmnVar3.b;
        wwd0 wwd0Var = zsfVar.a;
        usf.c cVar = new usf.c(wfb0Var2);
        wwd0Var.getClass();
        wwd0Var.k(null, cVar);
        wwd0 wwd0Var2 = zsfVar.J;
        Boolean boolValueOf = Boolean.valueOf(zsfVar.z1());
        wwd0Var2.getClass();
        wwd0Var2.k(null, boolValueOf);
        return Unit.a;
    }
}
