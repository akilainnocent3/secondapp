package defpackage;

import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.handler.InstantRacingSingleBetHandlerImpl$init$2", f = "InstantRacingSingleBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z3o extends tje0 implements Function2<List<? extends x3o>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ b4o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3o(b4o b4oVar, v1b<? super z3o> v1bVar) {
        super(2, v1bVar);
        this.b = b4oVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        z3o z3oVar = new z3o(this.b, v1bVar);
        z3oVar.a = obj;
        return z3oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends x3o> list, v1b<? super Unit> v1bVar) {
        return ((z3o) create(list, v1bVar)).invokeSuspend(Unit.a);
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
            arrayList.add(((x3o) it.next()).b);
        }
        int size = CollectionsKt.A0(CollectionsKt.D0(arrayList)).size();
        boolean z = true;
        b4o b4oVar = this.b;
        if (size > 1) {
            wwd0 wwd0Var = b4oVar.e;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, ""));
        }
        jpk jpkVar = b4oVar.c;
        bz3 bz3Var = bz3.SINGLE;
        m780 m780VarT0 = jpkVar.t0(SimulateBetConsts.BetslipType.SINGLE);
        if (m780VarT0 != null) {
            x3o x3oVar = (x3o) CollectionsKt.p0(list);
            if (x3oVar != null) {
                BigDecimal bigDecimalG = b.g(x3oVar.b);
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(m780VarT0.b.getLeastOrderAmount());
                bigDecimalValueOf.getClass();
                BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(heo.a, 2, RoundingMode.HALF_UP);
                boolean z2 = bigDecimalDivide.compareTo(BigDecimal.ZERO) == 1;
                if (bigDecimalG != null && bigDecimalG.compareTo(bigDecimalDivide) >= 0) {
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
