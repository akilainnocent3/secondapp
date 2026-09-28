package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.domain.manager.socket.BonusCupSocketManager$startObserving$2", f = "BonusCupSocketManager.kt", l = {17}, m = "invokeSuspend", v = 1)
public final class ap4 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ bp4 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ bp4 a;

        public a(bp4 bp4Var) {
            this.a = bp4Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            cp4 cp4Var = (cp4) obj;
            rrm rrmVar = this.a.b;
            if (cp4Var instanceof cp4.b) {
                Object objC = rrmVar.c(((cp4.b) cp4Var).a, v1bVar);
                return objC == y5b.a ? objC : Unit.a;
            }
            if (cp4Var instanceof cp4.a) {
                Object objG = rrmVar.g(((cp4.a) cp4Var).a, v1bVar);
                return objG == y5b.a ? objG : Unit.a;
            }
            uhc.a();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap4(bp4 bp4Var, v1b<? super ap4> v1bVar) {
        super(2, v1bVar);
        this.b = bp4Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ap4(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((ap4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            bp4 bp4Var = this.b;
            a390<cp4> a390VarD = bp4Var.a.d();
            a aVar = new a(bp4Var);
            this.a = 1;
            if (a390VarD.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        fkd.a();
        return null;
    }
}
