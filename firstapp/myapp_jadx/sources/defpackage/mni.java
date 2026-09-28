package defpackage;

import android.os.Bundle;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.FootballViewModel$waitUploadRewardShowOffDataResult$1", f = "FootballViewModel.kt", l = {482}, m = "invokeSuspend", v = 2)
public final class mni extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ dni b;

    @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.FootballViewModel$waitUploadRewardShowOffDataResult$1$2", f = "FootballViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<plh0, v1b<? super Boolean>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(2, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(plh0 plh0Var, v1b<? super Boolean> v1bVar) {
            return ((a) create(plh0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            plh0 plh0Var = (plh0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf((plh0Var instanceof plh0.a) || (plh0Var instanceof plh0.b));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mni(v1b v1bVar, dni dniVar) {
        super(2, v1bVar);
        this.b = dniVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mni(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mni) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        Object objA2;
        Object value3;
        Object objA3;
        Object value4;
        Object objA4;
        y5b y5bVar = y5b.a;
        int i = this.a;
        dni dniVar = this.b;
        try {
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = dniVar.I;
                wwd0 wwd0Var2 = dniVar.I;
                if (!(wwd0Var.getValue() instanceof plh0.a) && !(wwd0Var2.getValue() instanceof plh0.b)) {
                    wwd0 wwd0Var3 = dniVar.D;
                    do {
                        value3 = wwd0Var3.getValue();
                        objA3 = (smi) value3;
                        smi.c cVar = (smi.c) (!(objA3 instanceof smi.c) ? null : objA3);
                        if (cVar != null) {
                            objA3 = smi.c.a(cVar, null, uxs.LOADING, 3);
                        }
                    } while (!wwd0Var3.g(value3, objA3));
                    h5b h5bVar = dniVar.K;
                    if (h5bVar != null) {
                        h5bVar.a();
                    }
                    h5b h5bVar2 = new h5b(o8i0.d(dniVar), 10000L, new hni(2, null), new ini(null, dniVar));
                    dniVar.K = h5bVar2;
                    h5bVar2.d();
                    a aVar = new a(2, null);
                    this.a = 1;
                    if (s0i.b(wwd0Var2, aVar, this) == y5bVar) {
                        return y5bVar;
                    }
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            plh0 plh0Var = (plh0) dniVar.I.getValue();
            if (plh0Var instanceof plh0.a) {
                long jCurrentTimeMillis = System.currentTimeMillis() - dniVar.v;
                Bundle bundle = new Bundle();
                bundle.putLong("data", jCurrentTimeMillis);
                f00 f00Var = vgb0.a;
                vgb0.b(AnalyticsEvent.SHOW_OFF_LOADING_AVERAGE_TIME, bundle);
                dniVar.A1();
            } else if (plh0Var instanceof plh0.b) {
                itf0.a.d("Error during share process: " + ((plh0.b) plh0Var).a, new Object[0]);
                dniVar.z1();
            } else {
                itf0.a.d("Unexpected upload state: " + plh0Var, new Object[0]);
                dniVar.z1();
            }
            wwd0 wwd0Var4 = dniVar.D;
            do {
                value4 = wwd0Var4.getValue();
                objA4 = (smi) value4;
                smi.c cVar2 = (smi.c) (!(objA4 instanceof smi.c) ? null : objA4);
                if (cVar2 != null) {
                    objA4 = smi.c.a(cVar2, null, uxs.ENABLE, 3);
                }
            } while (!wwd0Var4.g(value4, objA4));
        } catch (Throwable th) {
            try {
                itf0.a.f(th, "Error during share process: " + th, new Object[0]);
                dniVar.z1();
                wwd0 wwd0Var5 = dniVar.D;
                do {
                    value2 = wwd0Var5.getValue();
                    objA2 = (smi) value2;
                    smi.c cVar3 = (smi.c) (!(objA2 instanceof smi.c) ? null : objA2);
                    if (cVar3 != null) {
                        objA2 = smi.c.a(cVar3, null, uxs.ENABLE, 3);
                    }
                } while (!wwd0Var5.g(value2, objA2));
            } finally {
                wwd0 wwd0Var6 = dniVar.D;
                do {
                    value = wwd0Var6.getValue();
                    objA = (smi) value;
                    smi.c cVar4 = (smi.c) (!(objA instanceof smi.c) ? null : objA);
                    if (cVar4 != null) {
                        objA = smi.c.a(cVar4, null, uxs.ENABLE, 3);
                    }
                } while (!wwd0Var6.g(value, objA));
                dniVar.x1();
            }
        }
        return Unit.a;
    }
}
