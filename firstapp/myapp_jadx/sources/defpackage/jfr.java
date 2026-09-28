package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$2", f = "LNStreamPlayerViewModel.kt", l = {362}, m = "invokeSuspend", v = 2)
public final class jfr extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mfr b;

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$2$1", f = "LNStreamPlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<mfr.d, v1b<? super Unit>, Object> {
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
        public final Object invoke(mfr.d dVar, v1b<? super Unit> v1bVar) {
            return ((a) create(dVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            mfr mfrVar = this.b;
            wwd0 wwd0Var = mfrVar.E;
            mfr.d dVar = (mfr.d) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (dVar == null) {
                return Unit.a;
            }
            if (!Intrinsics.g(dVar.a, mfrVar.V.a.getValue())) {
                return Unit.a;
            }
            lk50<ser> lk50Var = dVar.b;
            if (lk50Var instanceof lk50.c) {
                mfrVar.K1(((ser) ((lk50.c) lk50Var).a).a, false);
            } else if (lk50Var instanceof lk50.a) {
                if (mfrVar.N1(new l04(mfrVar, 1))) {
                    do {
                        value2 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value2, mfr.b.a((mfr.b) value2, 2, false, false, null, 8)));
                } else {
                    mfrVar.F1();
                }
            } else {
                if (!Intrinsics.g(lk50Var, lk50.b.a)) {
                    uhc.a();
                    return null;
                }
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, mfr.b.a((mfr.b) value, 2, false, false, null, 10)));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfr(v1b v1bVar, mfr mfrVar) {
        super(2, v1bVar);
        this.b = mfrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jfr(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jfr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            mfr mfrVar = this.b;
            v340 v340Var = mfrVar.X;
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
