package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$3", f = "LNPlaceBetViewModel.kt", l = {644}, m = "invokeSuspend", v = 2)
public final class y1r extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ f2r b;

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$3$1", f = "LNPlaceBetViewModel.kt", l = {645}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ f2r c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, f2r f2rVar) {
            super(2, v1bVar);
            this.c = f2rVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(v1bVar, this.c);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, v1b<? super Unit> v1bVar) {
            return ((a) create(str, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            vdq vdqVar = this.c.F;
            String str = (String) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                k1i k1iVar = vdqVar.g;
                this.b = str;
                this.a = 1;
                obj = s0i.c(k1iVar, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            jfq jfqVar = (jfq) obj;
            if (jfqVar == null) {
                return Unit.a;
            }
            ocq ocqVar = jfqVar.c;
            BigDecimal bigDecimalY1 = f2r.y1(str);
            if (bigDecimalY1.compareTo(ocqVar.e) <= 0) {
                vdqVar.c(bigDecimalY1);
            } else {
                vdqVar.c(ocqVar.e);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1r(v1b v1bVar, f2r f2rVar) {
        super(2, v1bVar);
        this.b = f2rVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new y1r(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((y1r) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            f2r f2rVar = this.b;
            wwd0 wwd0Var = f2rVar.L;
            a aVar = new a(null, f2rVar);
            this.a = 1;
            if (kzh.b(wwd0Var, aVar, this) == y5bVar) {
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
