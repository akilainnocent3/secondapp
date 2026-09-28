package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$1", f = "LNStreamPlayerViewModel.kt", l = {343}, m = "invokeSuspend", v = 2)
public final class ifr extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mfr b;

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$1$1", f = "LNStreamPlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ mfr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, mfr mfrVar) {
            super(2, v1bVar);
            this.b = mfrVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(v1bVar, this.b);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, v1b<? super Unit> v1bVar) {
            return ((a) create(str, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            mfr mfrVar = this.b;
            mfrVar.M1();
            wwd0 wwd0Var = mfrVar.M;
            Integer num = new Integer(0);
            wwd0Var.getClass();
            wwd0Var.k(null, num);
            wwd0 wwd0Var2 = mfrVar.N;
            igr igrVar = igr.a;
            wwd0Var2.getClass();
            wwd0Var2.k(null, igrVar);
            if (str != null) {
                mfrVar.T = str;
                mfrVar.L1();
                mfrVar.D1();
            } else if (mfrVar.A.getValue() instanceof fgr.b) {
                mfrVar.T = null;
                mfrVar.B1();
            } else {
                mfrVar.T = null;
                mfrVar.L1();
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifr(v1b v1bVar, mfr mfrVar) {
        super(2, v1bVar);
        this.b = mfrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ifr(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ifr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            mfr mfrVar = this.b;
            v340 v340Var = mfrVar.V;
            a aVar = new a(null, mfrVar);
            this.a = 1;
            if (kzh.b(v340Var, aVar, this) == y5bVar) {
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
