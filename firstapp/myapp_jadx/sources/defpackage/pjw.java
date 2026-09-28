package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$resetToInitSelectionNumInput$1", f = "MultiMakerViewModel.kt", l = {905}, m = "invokeSuspend", v = 2)
public final class pjw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public wwd0 a;
    public int b;
    public final /* synthetic */ tjw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjw(v1b v1bVar, tjw tjwVar) {
        super(2, v1bVar);
        this.c = tjwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pjw(v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pjw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wwd0 wwd0Var;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            tjw tjwVar = this.c;
            wwd0 wwd0Var2 = tjwVar.R;
            or60 or60VarF = tjwVar.e.F();
            this.a = wwd0Var2;
            this.b = 1;
            obj = s0i.a(or60VarF, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            wwd0Var = wwd0Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wwd0Var = this.a;
            uj50.b(obj);
        }
        wwd0Var.setValue(String.valueOf(((Number) obj).intValue()));
        return Unit.a;
    }
}
