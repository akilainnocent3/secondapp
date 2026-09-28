package defpackage;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.rush.view.RushFragment$calculateWinningChance$1", f = "RushFragment.kt", l = {3218}, m = "invokeSuspend", v = 1)
public final class r560 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ l560 b;
    public final /* synthetic */ Double c;
    public final /* synthetic */ double d;

    @c0d(c = "com.sportygames.rush.view.RushFragment$calculateWinningChance$1$1", f = "RushFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ l560 a;
        public final /* synthetic */ Double b;
        public final /* synthetic */ double c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l560 l560Var, Double d, double d2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = l560Var;
            this.b = d;
            this.c = d2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Double d = this.b;
            this.a.c1(this.c, d);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r560(l560 l560Var, Double d, double d2, v1b<? super r560> v1bVar) {
        super(2, v1bVar);
        this.b = l560Var;
        this.c = d;
        this.d = d2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new r560(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((r560) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        Double d = this.c;
        l560 l560Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            HashMap<Double, Double> map = l560Var.b0;
            if (map == null || map.isEmpty()) {
                l560Var.b0 = l560.G0(d.doubleValue(), 5.01d);
            }
            pfd pfdVar = fse.a;
            wcl wclVar = gku.a;
            a aVar = new a(l560Var, d, this.d, null);
            this.a = 1;
            if (ej5.d(wclVar, aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        HashMap<Double, Double> map2 = l560Var.b0;
        if ((map2 != null ? map2.size() : 0) < 1000) {
            l560Var.b0 = l560.G0(d.doubleValue(), 1000.01d);
        }
        return Unit.a;
    }
}
