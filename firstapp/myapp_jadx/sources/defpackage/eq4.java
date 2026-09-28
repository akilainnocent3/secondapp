package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.presentation.BonusCupViewModel$observeLoadingProgress$1", f = "BonusCupViewModel.kt", l = {183}, m = "invokeSuspend", v = 1)
public final class eq4 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ qq4 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ qq4 a;

        public a(qq4 qq4Var) {
            this.a = qq4Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            if (((Number) obj).floatValue() >= 1.0f) {
                qq4 qq4Var = this.a;
                if (!qq4Var.D) {
                    qq4Var.D = true;
                    il4 il4VarI = qq4Var.d.i();
                    wwd0 wwd0Var = qq4Var.G;
                    eku ekuVarB = hi9.b(il4VarI);
                    wwd0Var.getClass();
                    wwd0Var.k(null, ekuVarB);
                    Unit unit = Unit.a;
                    y5b y5bVar = y5b.a;
                    return unit;
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq4(qq4 qq4Var, v1b<? super eq4> v1bVar) {
        super(2, v1bVar);
        this.b = qq4Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new eq4(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
        ((eq4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                throw l80.a(obj);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        qq4 qq4Var = this.b;
        wwd0 wwd0VarInvoke = qq4Var.A.invoke();
        a aVar = new a(qq4Var);
        this.a = 1;
        wwd0VarInvoke.collect(aVar, this);
        return y5bVar;
    }
}
