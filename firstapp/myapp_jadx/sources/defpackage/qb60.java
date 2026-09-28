package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.presentation.card.SBCardNumberKt$SBCardNumber$1$animationTo$5", f = "SBCardNumber.kt", l = {94}, m = "invokeSuspend", v = 1)
public final class qb60 extends tje0 implements Function2<v5b, v1b<? super ui0<Float, ij0>>, Object> {
    public int a;
    public final /* synthetic */ wd0<Float, ij0> b;
    public final /* synthetic */ z5y c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb60(wd0<Float, ij0> wd0Var, z5y z5yVar, int i, v1b<? super qb60> v1bVar) {
        super(2, v1bVar);
        this.b = wd0Var;
        this.c = z5yVar;
        this.d = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qb60(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super ui0<Float, ij0>> v1bVar) {
        return ((qb60) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        Float f = new Float(this.c.b);
        gzg0 gzg0VarE = yi0.e(this.d, 0, xkf.d, 2);
        this.a = 1;
        Object objA = wd0.a(this.b, f, gzg0VarE, null, null, this, 12);
        return objA == y5bVar ? y5bVar : objA;
    }
}
