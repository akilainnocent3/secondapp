package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.antest.SportyLegendsComboSingleBetFlowAnTestHelper$init$1", f = "SportyLegendsComboSingleBetFlowAnTestHelper.kt", l = {47, 51}, m = "invokeSuspend", v = 2)
public final class pbc0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public lk50.c a;
    public int b;
    public final /* synthetic */ qbc0 c;

    @c0d(c = "com.sportybet.android.instantwin.antest.SportyLegendsComboSingleBetFlowAnTestHelper$init$1$result$1", f = "SportyLegendsComboSingleBetFlowAnTestHelper.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50<? extends tbc0>, v1b<? super Boolean>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(2, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends tbc0> lk50Var, v1b<? super Boolean> v1bVar) {
            return ((a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(!(lk50Var instanceof lk50.b));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbc0(qbc0 qbc0Var, v1b<? super pbc0> v1bVar) {
        super(2, v1bVar);
        this.c = qbc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pbc0(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pbc0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var;
        wwd0 wwd0Var;
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.b;
        boolean z = false;
        qbc0 qbc0Var = this.c;
        if (i == 0) {
            uj50.b(obj);
            yzh yzhVarJ = qbc0Var.a.j(z76.l);
            a aVar = new a(2, null);
            this.b = 1;
            obj = s0i.b(yzhVarJ, aVar, this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            uj50.b(obj);
        } else {
            if (i != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lk50Var = this.a;
            uj50.b(obj);
        }
        if (((Boolean) obj).booleanValue() && ((lk50.c) lk50Var).a == tbc0.TEST) {
            z = true;
        }
        wwd0Var = qbc0Var.d;
        do {
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.valueOf(z)));
        return Unit.a;
        lk50 lk50Var2 = (lk50) obj;
        if (lk50Var2 instanceof lk50.c) {
            yqm yqmVar = qbc0Var.a;
            String str = z76.l.a;
            this.a = (lk50.c) lk50Var2;
            this.b = 2;
            Object objH = yqmVar.h(str, this);
            if (objH != y5bVar) {
                obj = objH;
                lk50Var = lk50Var2;
                if (((Boolean) obj).booleanValue()) {
                    z = true;
                }
            }
            return y5bVar;
        }
        if (!(lk50Var2 instanceof lk50.a) && !(lk50Var2 instanceof lk50.b)) {
            uhc.a();
            return null;
        }
        wwd0Var = qbc0Var.d;
        do {
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.valueOf(z)));
        return Unit.a;
    }
}
