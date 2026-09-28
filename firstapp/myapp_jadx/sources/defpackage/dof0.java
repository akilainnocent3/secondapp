package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$updateUser$1", f = "TheGoldmineViewModel.kt", l = {606}, m = "invokeSuspend", v = 1)
public final class dof0 extends tje0 implements Function2<mk50<? extends p0f0>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ aof0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dof0(aof0 aof0Var, v1b<? super dof0> v1bVar) {
        super(2, v1bVar);
        this.c = aof0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dof0 dof0Var = new dof0(this.c, v1bVar);
        dof0Var.b = obj;
        return dof0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(mk50<? extends p0f0> mk50Var, v1b<? super Unit> v1bVar) {
        return ((dof0) create(mk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        mk50 mk50Var = (mk50) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        aof0 aof0Var = this.c;
        try {
            if (i == 0) {
                uj50.b(obj);
                if (mk50Var instanceof mk50.a) {
                    try {
                        zi50.a aVar = zi50.b;
                        dm8 dm8Var = aof0Var.S;
                        if (dm8Var != null) {
                            dm8Var.R(Unit.a);
                        }
                    } catch (Throwable unused) {
                        zi50.a aVar2 = zi50.b;
                    }
                    aof0Var.A1(((mk50.a) mk50Var).a);
                } else if (!Intrinsics.g(mk50Var, mk50.b.a)) {
                    if (!(mk50Var instanceof mk50.c)) {
                        uhc.a();
                        return null;
                    }
                    wwd0 wwd0Var = aof0Var.C;
                    T t = ((mk50.c) mk50Var).a;
                    this.b = null;
                    this.a = 1;
                    wwd0Var.setValue(t);
                    if (Unit.a == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            zi50.a aVar3 = zi50.b;
            dm8 dm8Var2 = aof0Var.S;
            if (dm8Var2 != null) {
                dm8Var2.R(Unit.a);
            }
        } catch (Throwable unused2) {
            zi50.a aVar4 = zi50.b;
        }
        return Unit.a;
    }
}
