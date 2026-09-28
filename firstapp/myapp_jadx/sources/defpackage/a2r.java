package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$4", f = "LNPlaceBetViewModel.kt", l = {657}, m = "invokeSuspend", v = 2)
public final class a2r extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ f2r b;

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$4$2", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<jfq, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ f2r b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, f2r f2rVar) {
            super(2, v1bVar);
            this.b = f2rVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(v1bVar, this.b);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jfq jfqVar, v1b<? super Unit> v1bVar) {
            return ((a) create(jfqVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jfq jfqVar = (jfq) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            f2r f2rVar = this.b;
            BigDecimal bigDecimalY1 = f2r.y1((String) f2rVar.L.getValue());
            int iCompareTo = bigDecimalY1.compareTo(jfqVar.c.e);
            vdq vdqVar = f2rVar.F;
            if (iCompareTo > 0) {
                vdqVar.c(jfqVar.c.e);
            } else {
                vdqVar.c(bigDecimalY1);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2r(v1b v1bVar, f2r f2rVar) {
        super(2, v1bVar);
        this.b = f2rVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new a2r(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((a2r) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            f2r f2rVar = this.b;
            f1i f1iVar = new f1i(uzh.c(f2rVar.F.g, new z1r(), uzh.b));
            a aVar = new a(null, f2rVar);
            this.a = 1;
            if (kzh.b(f1iVar, aVar, this) == y5bVar) {
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
