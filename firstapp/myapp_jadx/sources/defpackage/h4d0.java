package defpackage;

import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penalty.handler.SportyPenaltySingleBetHandlerImpl$init$2", f = "SportyPenaltySingleBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h4d0 extends tje0 implements Function2<List<? extends f4d0>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ j4d0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4d0(j4d0 j4d0Var, v1b<? super h4d0> v1bVar) {
        super(2, v1bVar);
        this.b = j4d0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        h4d0 h4d0Var = new h4d0(this.b, v1bVar);
        h4d0Var.a = obj;
        return h4d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends f4d0> list, v1b<? super Unit> v1bVar) {
        return ((h4d0) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((f4d0) it.next()).b);
        }
        int size = CollectionsKt.A0(CollectionsKt.D0(arrayList)).size();
        boolean z = true;
        j4d0 j4d0Var = this.b;
        if (size > 1) {
            wwd0 wwd0Var = j4d0Var.e;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, ""));
        }
        jpk jpkVar = j4d0Var.c;
        bz3 bz3Var = bz3.SINGLE;
        m780 m780VarT0 = jpkVar.t0(SimulateBetConsts.BetslipType.SINGLE);
        if (m780VarT0 != null) {
            f4d0 f4d0Var = (f4d0) CollectionsKt.p0(list);
            if (f4d0Var != null) {
                BigDecimal bigDecimalG = b.g(f4d0Var.b);
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(m780VarT0.b.getLeastOrderAmount());
                bigDecimalValueOf.getClass();
                BigDecimal bigDecimalA = s5y.a(bigDecimalValueOf);
                boolean z2 = bigDecimalA.compareTo(BigDecimal.ZERO) == 1;
                if (bigDecimalG != null && bigDecimalG.compareTo(bigDecimalA) >= 0) {
                    z = false;
                }
                if (z2 && z) {
                    jpkVar.E(SimulateBetConsts.BetslipType.SINGLE);
                }
            } else {
                jpkVar.E(SimulateBetConsts.BetslipType.SINGLE);
            }
        }
        return Unit.a;
    }
}
