package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.main.presentation.tabs.missions.MissionStateHandler$participateInMission$2", f = "MissionStateHandler.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mvv extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ nvv b;
    public final /* synthetic */ int c;
    public final /* synthetic */ et7 d;

    @c0d(c = "com.sportybet.feature.loyalty.impl.main.presentation.tabs.missions.MissionStateHandler$participateInMission$2$2", f = "MissionStateHandler.kt", l = {283}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ nvv b;
        public final /* synthetic */ et7 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nvv nvvVar, et7 et7Var, v1b v1bVar) {
            super(2, v1bVar);
            this.b = nvvVar;
            this.c = et7Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                b.a aVar = b.b;
                long jH = c.h(300, rgf.MILLISECONDS);
                this.a = 1;
                if (hkd.c(jH, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            this.b.b(this.c);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvv(nvv nvvVar, int i, et7 et7Var, v1b v1bVar) {
        super(2, v1bVar);
        this.b = nvvVar;
        this.c = i;
        this.d = et7Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mvv mvvVar = new mvv(this.b, this.c, this.d, v1bVar);
        mvvVar.a = obj;
        return mvvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
        return ((mvv) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean zG = Intrinsics.g(lk50Var, lk50.b.a);
        int i = this.c;
        nvv nvvVar = this.b;
        if (zG) {
            nvvVar.c(i, uxs.LOADING);
            Unit unit = Unit.a;
        } else if (lk50Var instanceof lk50.a) {
            nvvVar.c(i, uxs.ENABLE);
            wwd0 wwd0Var = nvvVar.k;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, yi80.c((Set) value, new Integer(i))));
            ku90<qsv> ku90Var = nvvVar.m;
            ku90Var.a.a(new qsv.c(((lk50.a) lk50Var).b));
        } else {
            if (!(lk50Var instanceof lk50.c)) {
                uhc.a();
                return null;
            }
            nvvVar.c(i, uxs.ENABLE);
            wwd0 wwd0Var2 = nvvVar.j;
            Set set = (Set) wwd0Var2.getValue();
            if (!set.contains(new Integer(i))) {
                wwd0Var2.k(null, yi80.f(set, new Integer(i)));
            }
            et7 et7Var = this.d;
            ej5.c(et7Var, null, null, new a(nvvVar, et7Var, null), 3);
        }
        return Unit.a;
    }
}
