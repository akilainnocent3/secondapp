package defpackage;

import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.luckywheel.LuckyWheelViewModel$getLuckyWheelInfo$1", f = "LuckyWheelViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class acu extends tje0 implements Function2<lk50<? extends t8u>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ccu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acu(ccu ccuVar, v1b<? super acu> v1bVar) {
        super(2, v1bVar);
        this.b = ccuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        acu acuVar = new acu(this.b, v1bVar);
        acuVar.a = obj;
        return acuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends t8u> lk50Var, v1b<? super Unit> v1bVar) {
        return ((acu) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        wwd0 wwd0Var = this.b.v;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.b) {
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, jbu.a((jbu) value3, true, false, null, null, null, false, null, false, null, null, 1020)));
        } else if (lk50Var instanceof lk50.c) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, jbu.a((jbu) value2, false, false, (t8u) ((lk50.c) lk50Var).a, null, null, false, null, false, null, null, 1016)));
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, jbu.a((jbu) value, false, true, null, null, null, false, null, false, null, null, 1020)));
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_LUCKY_WHEEL);
            aVar.a(a320.a("Lucky Wheel Error: ", ((lk50.a) lk50Var).a), new Object[0]);
        }
        return Unit.a;
    }
}
