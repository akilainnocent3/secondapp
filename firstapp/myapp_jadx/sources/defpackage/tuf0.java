package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.timeAlertReached.viewmodel.TimeAlertReachedViewModel$loadInfo$1", f = "TimeAlertReachedViewModel.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class tuf0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wuf0 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ wuf0 a;

        public a(wuf0 wuf0Var) {
            this.a = wuf0Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            wwd0 wwd0Var = this.a.a;
            Integer num = ((ltf0) obj).a;
            suf0.b bVar = new suf0.b(String.valueOf(num != null ? num.intValue() / 60 : 0));
            wwd0Var.getClass();
            wwd0Var.k(null, bVar);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tuf0(wuf0 wuf0Var, v1b<? super tuf0> v1bVar) {
        super(2, v1bVar);
        this.b = wuf0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tuf0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tuf0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wuf0 wuf0Var = this.b;
            lyh lyhVarB = uzh.b(new qtf0(vtf0.b.a(wuf0Var.e.a.a, vtf0.a[0]).k()));
            a aVar = new a(wuf0Var);
            this.a = 1;
            if (lyhVarB.collect(aVar, this) == y5bVar) {
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
