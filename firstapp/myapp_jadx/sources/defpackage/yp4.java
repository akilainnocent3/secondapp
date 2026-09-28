package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.presentation.BonusCupViewModel$initialise$1", f = "BonusCupViewModel.kt", l = {130}, m = "invokeSuspend", v = 1)
public final class yp4 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ qq4 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp4(qq4 qq4Var, String str, v1b<? super yp4> v1bVar) {
        super(2, v1bVar);
        this.b = qq4Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yp4(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yp4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            qq4 qq4Var = this.b;
            if (!qq4Var.C) {
                qq4Var.C = true;
                qq4Var.B = this.c;
                ej5.c(o8i0.d(qq4Var), null, null, new dq4(qq4Var, null), 3);
                ej5.c(o8i0.d(qq4Var), null, null, new fq4(qq4Var, null), 3);
                ej5.c(o8i0.d(qq4Var), null, null, new cq4(qq4Var, null), 3);
                ej5.c(o8i0.d(qq4Var), null, null, new bq4(qq4Var, null), 3);
                ej5.c(o8i0.d(qq4Var), null, null, new eq4(qq4Var, null), 3);
                this.a = 1;
                Object objCollect = new yzh(qq4Var.i.a(new sp4(0), new vp4(2, null)).a, new wp4(qq4Var, null)).collect(new xp4(qq4Var), this);
                if (objCollect != y5bVar) {
                    objCollect = Unit.a;
                }
                if (objCollect == y5bVar) {
                    return y5bVar;
                }
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
