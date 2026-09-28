package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$bet$3", f = "RefsCallViewModel.kt", l = {381}, m = "invokeSuspend", v = 1)
public final class cs40 extends tje0 implements Function2<v5b, v1b<? super uq30>, Object> {
    public int a;
    public final /* synthetic */ zr40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs40(zr40 zr40Var, v1b<? super cs40> v1bVar) {
        super(2, v1bVar);
        this.b = zr40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cs40(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super uq30> v1bVar) {
        return ((cs40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        this.a = 1;
        zr40 zr40Var = this.b;
        Object objD = ej5.d(zr40Var.a, new hs40(zr40Var, null), this);
        return objD == y5bVar ? y5bVar : objD;
    }
}
