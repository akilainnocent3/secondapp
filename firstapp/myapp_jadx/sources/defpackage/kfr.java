package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$3", f = "LNStreamPlayerViewModel.kt", l = {379}, m = "invokeSuspend", v = 2)
public final class kfr extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mfr b;

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$3$1", f = "LNStreamPlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50<? extends qcn<? extends e3q>>, v1b<? super Unit>, Object> {
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
        public final Object invoke(lk50<? extends qcn<? extends e3q>> lk50Var, v1b<? super Unit> v1bVar) {
            return ((a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            mfr mfrVar = this.b;
            wwd0 wwd0Var = mfrVar.N;
            wwd0 wwd0Var2 = mfrVar.M;
            wwd0 wwd0Var3 = mfrVar.K;
            wwd0 wwd0Var4 = mfrVar.L;
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (lk50Var instanceof lk50.a) {
                Boolean bool = Boolean.TRUE;
                wwd0Var4.getClass();
                wwd0Var4.k(null, bool);
                Boolean bool2 = Boolean.FALSE;
                wwd0Var3.getClass();
                wwd0Var3.k(null, bool2);
                Integer num = new Integer(0);
                wwd0Var2.getClass();
                wwd0Var2.k(null, num);
                igr igrVar = igr.a;
                wwd0Var.getClass();
                wwd0Var.k(null, igrVar);
            } else if (lk50Var instanceof lk50.c) {
                if (((Boolean) wwd0Var4.getValue()).booleanValue()) {
                    Boolean bool3 = Boolean.FALSE;
                    wwd0Var4.getClass();
                    wwd0Var4.k(null, bool3);
                    wwd0Var3.getClass();
                    wwd0Var3.k(null, bool3);
                    Integer num2 = new Integer(0);
                    wwd0Var2.getClass();
                    wwd0Var2.k(null, num2);
                    igr igrVar2 = igr.a;
                    wwd0Var.getClass();
                    wwd0Var.k(null, igrVar2);
                }
            } else if (!Intrinsics.g(lk50Var, lk50.b.a)) {
                uhc.a();
                return null;
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfr(v1b v1bVar, mfr mfrVar) {
        super(2, v1bVar);
        this.b = mfrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kfr(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kfr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            mfr mfrVar = this.b;
            v340 v340Var = mfrVar.a0;
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
