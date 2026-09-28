package defpackage;

import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.presentation.fragment.BetslipFragment$calculateOneCutValueAsync$2", f = "BetslipFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kp3 extends tje0 implements Function2<v5b, v1b<? super Map<String, ? extends BigDecimal>>, Object> {
    public final /* synthetic */ jp3 a;
    public final /* synthetic */ o4p b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp3(jp3 jp3Var, o4p o4pVar, String str, v1b<? super kp3> v1bVar) {
        super(2, v1bVar);
        this.a = jp3Var;
        this.b = o4pVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kp3(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Map<String, ? extends BigDecimal>> v1bVar) {
        return ((kp3) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        jp3 jp3Var = this.a;
        if (!jp3Var.y.isEmpty()) {
            o4p o4pVar = this.b;
            if (o4pVar.a.equals(SimulateBetConsts.BetslipType.MULTIPLE)) {
                String str = this.c;
                if (str.length() != 0) {
                    o4p.d dVar = o4pVar.i.get(o4pVar.f);
                    mpe0 mpe0Var = zpy.a;
                    BigDecimal bigDecimal = new BigDecimal(str);
                    BigDecimal bigDecimal2 = dVar.e;
                    BigDecimal bigDecimal3 = o4pVar.m;
                    bigDecimal3.getClass();
                    BigDecimal bigDecimal4 = o4pVar.j;
                    bigDecimal4.getClass();
                    BigDecimal bigDecimal5 = ((n4p) jp3Var.s0()).l;
                    bigDecimal5.getClass();
                    return zpy.a(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5);
                }
            }
        }
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        return o2gVar;
    }
}
